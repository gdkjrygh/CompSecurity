// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.payment;

import android.content.Context;
import android.os.AsyncTask;
import io.card.payment.b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package ly.kite.payment:
//            PayPalCardChargeListener, PayPalCardVaultStorageListener

public class PayPalCard
    implements Serializable
{
    public static final class CardType extends Enum
    {

        private static final CardType $VALUES[];
        public static final CardType AMEX;
        public static final CardType DISCOVER;
        public static final CardType MASTERCARD;
        public static final CardType UNSUPPORTED;
        public static final CardType VISA;
        private final String paypalIdentifier;

        public static CardType getCardType(b b1)
        {
        /* anonymous class not found */
        class _anm4 {}

            switch (_cls4..SwitchMap.io.card.payment.CardType[b1.ordinal()])
            {
            default:
                return UNSUPPORTED;

            case 1: // '\001'
                return AMEX;

            case 2: // '\002'
                return MASTERCARD;

            case 3: // '\003'
                return DISCOVER;

            case 4: // '\004'
                return VISA;
            }
        }

        public static CardType valueOf(String s)
        {
            return (CardType)Enum.valueOf(ly/kite/payment/PayPalCard$CardType, s);
        }

        public static CardType[] values()
        {
            return (CardType[])$VALUES.clone();
        }

        static 
        {
            VISA = new CardType("VISA", 0, "visa");
            MASTERCARD = new CardType("MASTERCARD", 1, "mastercard");
            DISCOVER = new CardType("DISCOVER", 2, "discover");
            AMEX = new CardType("AMEX", 3, "amex");
            UNSUPPORTED = new CardType("UNSUPPORTED", 4, "unsupported");
            $VALUES = (new CardType[] {
                VISA, MASTERCARD, DISCOVER, AMEX, UNSUPPORTED
            });
        }


        private CardType(String s, int i, String s1)
        {
            super(s, i);
            paypalIdentifier = s1;
        }
    }

    public static final class Currency extends Enum
    {

        private static final Currency $VALUES[];
        public static final Currency AUD;
        public static final Currency CAD;
        public static final Currency EUR;
        public static final Currency GBP;
        public static final Currency NZD;
        public static final Currency SGD;
        public static final Currency USD;
        private final String code;

        public static Currency valueOf(String s)
        {
            return (Currency)Enum.valueOf(ly/kite/payment/PayPalCard$Currency, s);
        }

        public static Currency[] values()
        {
            return (Currency[])$VALUES.clone();
        }

        static 
        {
            GBP = new Currency("GBP", 0, "GBP");
            USD = new Currency("USD", 1, "USD");
            EUR = new Currency("EUR", 2, "EUR");
            NZD = new Currency("NZD", 3, "NZD");
            SGD = new Currency("SGD", 4, "SGD");
            AUD = new Currency("AUD", 5, "AUD");
            CAD = new Currency("CAD", 6, "CAD");
            $VALUES = (new Currency[] {
                GBP, USD, EUR, NZD, SGD, AUD, CAD
            });
        }


        private Currency(String s, int i, String s1)
        {
            super(s, i);
            code = s1;
        }
    }


    private static final String PERSISTED_LUC_FILENAME = "luc";
    private static final long serialVersionUID = 0L;
    private CardType cardType;
    private String cvv2;
    private int expireMonth;
    private int expireYear;
    private String firstName;
    private String lastName;
    private String number;
    private String numberMasked;
    private Date vaultExpireDate;
    private String vaultId;

    public PayPalCard()
    {
    }

    public PayPalCard(CardType cardtype, String s, int i, int j, String s1)
    {
        cardType = cardtype;
        number = s;
        expireMonth = i;
        setExpireYear(j);
        cvv2 = s1;
    }

    public static void clearLastUsedCard(Context context)
    {
        persistLastUsedCardToDisk(context, null);
    }

    private JSONObject createPaymentJSON(BigDecimal bigdecimal, Currency currency, String s)
        throws JSONException
    {
        JSONObject jsonobject3 = new JSONObject();
        JSONObject jsonobject1;
        Object obj;
        JSONArray jsonarray;
        if (number != null)
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject3.put("credit_card", jsonobject);
            jsonobject.put("number", number);
            jsonobject.put("type", cardType.paypalIdentifier);
            jsonobject.put("expire_month", (new StringBuilder()).append("").append(expireMonth).toString());
            jsonobject.put("expire_year", (new StringBuilder()).append("").append(expireYear).toString());
            jsonobject.put("cvv2", cvv2);
        } else
        {
            JSONObject jsonobject2 = new JSONObject();
            jsonobject3.put("credit_card_token", jsonobject2);
            jsonobject2.put("credit_card_id", vaultId);
        }
        jsonobject1 = new JSONObject();
        jsonobject1.put("intent", "sale");
        obj = new JSONObject();
        jsonobject1.put("payer", obj);
        ((JSONObject) (obj)).put("payment_method", "credit_card");
        jsonarray = new JSONArray();
        ((JSONObject) (obj)).put("funding_instruments", jsonarray);
        jsonarray.put(jsonobject3);
        obj = new JSONArray();
        jsonobject1.put("transactions", obj);
        jsonobject3 = new JSONObject();
        ((JSONArray) (obj)).put(jsonobject3);
        jsonobject3.put("description", s);
        s = new JSONObject();
        jsonobject3.put("amount", s);
        s.put("total", String.format(Locale.ENGLISH, "%.2f", new Object[] {
            Float.valueOf(bigdecimal.floatValue())
        }));
        s.put("currency", currency.code);
        return jsonobject1;
    }

    private void getAccessToken(ly.kite.KiteSDK.Environment environment, AccessTokenListener accesstokenlistener)
    {
        (new _cls1(environment, accesstokenlistener)).execute(new Void[0]);
    }

    public static PayPalCard getLastUsedCard(Context context)
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        context = new ObjectInputStream(new BufferedInputStream(context.openFileInput("luc")));
        obj = (PayPalCard)context.readObject();
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((PayPalCard) (obj));
        }
        return ((PayPalCard) (obj));
        context;
        context = null;
_L8:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return null;
        context;
        context = null;
_L6:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return null;
        context;
        obj = obj2;
_L4:
        throw new RuntimeException(context);
        context;
_L2:
        try
        {
            ((ObjectInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw context;
        Object obj3;
        obj3;
        obj = context;
        context = ((Context) (obj3));
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        obj = context;
        context = ((Context) (obj3));
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void persistLastUsedCardToDisk(Context context, PayPalCard paypalcard)
    {
        Object obj = null;
        context = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("luc", 0)));
        context.writeObject(paypalcard);
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        context = null;
_L4:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        paypalcard = obj;
_L2:
        try
        {
            paypalcard.close();
        }
        // Misplaced declaration of an exception variable
        catch (PayPalCard paypalcard) { }
        throw context;
        Exception exception;
        exception;
        paypalcard = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
        paypalcard;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        numberMasked = (String)objectinputstream.readObject();
        cardType = CardType.values()[objectinputstream.readInt()];
        expireMonth = objectinputstream.readInt();
        expireYear = objectinputstream.readInt();
        firstName = (String)objectinputstream.readObject();
        lastName = (String)objectinputstream.readObject();
        vaultId = (String)objectinputstream.readObject();
        vaultExpireDate = (Date)objectinputstream.readObject();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(numberMasked);
        objectoutputstream.writeInt(cardType.ordinal());
        objectoutputstream.writeInt(expireMonth);
        objectoutputstream.writeInt(expireYear);
        objectoutputstream.writeObject(firstName);
        objectoutputstream.writeObject(lastName);
        objectoutputstream.writeObject(vaultId);
        objectoutputstream.writeObject(vaultExpireDate);
    }

    public void chargeCard(ly.kite.KiteSDK.Environment environment, BigDecimal bigdecimal, Currency currency, String s, PayPalCardChargeListener paypalcardchargelistener)
    {
        getAccessToken(environment, new _cls3(bigdecimal, currency, s, paypalcardchargelistener, environment));
    }

    public CardType getCardType()
    {
        return cardType;
    }

    public String getCvv2()
    {
        return cvv2;
    }

    public int getExpireMonth()
    {
        return expireMonth;
    }

    public int getExpireYear()
    {
        return expireYear;
    }

    public String getLastFour()
    {
        if (number != null && number.length() == 16)
        {
            return number.substring(number.length() - 4);
        }
        if (numberMasked != null)
        {
            return numberMasked.substring(numberMasked.length() - Math.min(4, numberMasked.length()));
        } else
        {
            return null;
        }
    }

    public String getNumber()
    {
        return number;
    }

    public String getNumberMasked()
    {
        return numberMasked;
    }

    public boolean hasVaultStorageExpired()
    {
        if (vaultExpireDate == null)
        {
            return true;
        } else
        {
            return vaultExpireDate.before(new Date());
        }
    }

    public boolean isStoredInVault()
    {
        return vaultId != null;
    }

    public void saveAsLastUsedCard(Context context)
    {
        persistLastUsedCardToDisk(context, this);
    }

    public void setCardType(CardType cardtype)
    {
        cardType = cardtype;
    }

    public void setCvv2(String s)
    {
        cvv2 = s;
    }

    public void setExpireMonth(int i)
    {
        if (i < 1 || i > 12)
        {
            throw new IllegalArgumentException("Expire month must be in range of 1-12 incusive");
        } else
        {
            expireMonth = i;
            return;
        }
    }

    public void setExpireYear(int i)
    {
        int j = i;
        if (i <= 99)
        {
            j = i + 2000;
        }
        expireYear = j;
    }

    public void setNumber(String s)
    {
        number = s;
    }

    public void storeCard(ly.kite.KiteSDK.Environment environment, PayPalCardVaultStorageListener paypalcardvaultstoragelistener)
    {
        getAccessToken(environment, new _cls2(paypalcardvaultstoragelistener, environment));
    }








/*
    static String access$702(PayPalCard paypalcard, String s)
    {
        paypalcard.vaultId = s;
        return s;
    }

*/


/*
    static Date access$802(PayPalCard paypalcard, Date date)
    {
        paypalcard.vaultExpireDate = date;
        return date;
    }

*/


/*
    static String access$902(PayPalCard paypalcard, String s)
    {
        paypalcard.numberMasked = s;
        return s;
    }

*/

    // Unreferenced inner class ly/kite/payment/PayPalCard$AccessTokenListener
    /* block-local class not found */
    class AccessTokenListener {}


    // Unreferenced inner class ly/kite/payment/PayPalCard$VaultStoreResponse
    /* block-local class not found */
    class VaultStoreResponse {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
