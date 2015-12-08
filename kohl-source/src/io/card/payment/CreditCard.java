// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package io.card.payment:
//            V, CardType

public class CreditCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
    private static final String TAG = "CardIOCreditCardResults";
    public String cardNumber;
    public String cvv;
    public int expiryMonth;
    public int expiryYear;
    boolean flipped;
    public String postalCode;
    String scanId;
    int xoff[];
    int yoff;
    public String zip;

    public CreditCard()
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        xoff = new int[16];
        scanId = UUID.randomUUID().toString();
    }

    private CreditCard(Parcel parcel)
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        cardNumber = parcel.readString();
        expiryMonth = parcel.readInt();
        expiryYear = parcel.readInt();
        cvv = parcel.readString();
        postalCode = parcel.readString();
        zip = postalCode;
        scanId = parcel.readString();
        yoff = parcel.readInt();
        xoff = parcel.createIntArray();
    }

    CreditCard(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    CreditCard(String s)
    {
        int i;
        i = 0;
        super();
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONArray jsonarray;
        s = new JSONObject(s);
        cardNumber = s.optString("numbers");
        (new StringBuilder("- number: ")).append(getRedactedCardNumber()).toString();
        jsonarray = s.optJSONArray("expiry");
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (jsonarray.length() == 2)
        {
            expiryYear = jsonarray.getInt(0);
            (new StringBuilder("- year: ")).append(expiryYear).toString();
            expiryMonth = jsonarray.getInt(1);
            (new StringBuilder("- month: ")).append(expiryMonth).toString();
        }
        flipped = s.optBoolean("is_flipped");
        (new StringBuilder("- isFlipped: ")).append(flipped).toString();
        scanId = s.optString("scan_id");
        (new StringBuilder("- scanId: ")).append(scanId).toString();
        yoff = s.optInt("y_offset");
        s = s.optJSONArray("x_offsets");
        xoff = new int[s.length()];
_L3:
        if (i >= s.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        xoff[i] = s.getInt(i);
        i++;
          goto _L3
        s;
        Log.w("CardIOCreditCardResults", "error parsing credit card response: ", s);
        if (cardNumber != null && (cardNumber.length() < 15 || !V.a(cardNumber)))
        {
            cardNumber = null;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public CreditCard(String s, int i, int j, String s1, String s2)
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        cardNumber = s;
        expiryMonth = i;
        expiryYear = j;
        cvv = s1;
        zip = s2;
        postalCode = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    boolean failed()
    {
        return cardNumber == null || cardNumber.length() == 0;
    }

    public CardType getCardType()
    {
        return CardType.fromCardNumber(cardNumber);
    }

    public String getFormattedCardNumber()
    {
        return V.b(cardNumber);
    }

    public String getLastFourDigitsOfCardNumber()
    {
        if (cardNumber != null)
        {
            int i = Math.min(4, cardNumber.length());
            return cardNumber.substring(cardNumber.length() - i);
        } else
        {
            return "";
        }
    }

    public String getRedactedCardNumber()
    {
        if (cardNumber != null)
        {
            String s = "";
            if (cardNumber.length() > 4)
            {
                s = (new StringBuilder()).append("").append(String.format((new StringBuilder("%")).append(cardNumber.length() - 4).append("s").toString(), new Object[] {
                    ""
                }).replace(' ', '\u2022')).toString();
            }
            return V.a((new StringBuilder()).append(s).append(getLastFourDigitsOfCardNumber()).toString(), false, CardType.fromCardNumber(cardNumber));
        } else
        {
            return "";
        }
    }

    public boolean isExpiryValid()
    {
        int i = expiryMonth;
        int j = expiryYear;
        if (i > 0 && 12 >= i)
        {
            Calendar calendar = Calendar.getInstance();
            int k = calendar.get(1);
            int l = calendar.get(2);
            if (j >= k && (j != k || i >= l + 1) && j <= k + 15)
            {
                return true;
            }
        }
        return false;
    }

    List toNameValueList()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("card_number", cardNumber));
        if (expiryMonth > 0 && expiryYear > 0)
        {
            arraylist.add(new BasicNameValuePair("card_exp_month", String.valueOf(expiryMonth)));
            arraylist.add(new BasicNameValuePair("card_exp_year", String.valueOf(expiryYear)));
        }
        if (cvv != null)
        {
            arraylist.add(new BasicNameValuePair("card_cvv", cvv));
        }
        if (zip != null)
        {
            arraylist.add(new BasicNameValuePair("card_zip", zip));
        }
        if (postalCode != null)
        {
            arraylist.add(new BasicNameValuePair("card_postal_code", postalCode));
        }
        if (scanId != null)
        {
            arraylist.add(new BasicNameValuePair("scan_id", scanId));
        }
        return arraylist;
    }

    public String toString()
    {
        Object obj;
label0:
        {
            String s = (new StringBuilder("{")).append(getCardType()).append(": ").append(getRedactedCardNumber()).toString();
            if (expiryMonth <= 0)
            {
                obj = s;
                if (expiryYear <= 0)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder()).append(s).append("  expiry:").append(expiryMonth).append("/").append(expiryYear).toString();
        }
        String s1 = ((String) (obj));
        if (zip != null)
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("  zip:").append(zip).toString();
        }
        obj = s1;
        if (postalCode != null)
        {
            obj = (new StringBuilder()).append(s1).append("  postalCode:").append(postalCode).toString();
        }
        s1 = ((String) (obj));
        if (cvv != null)
        {
            obj = (new StringBuilder()).append(((String) (obj))).append("  cvvLength:");
            int i;
            if (cvv != null)
            {
                i = cvv.length();
            } else
            {
                i = 0;
            }
            s1 = ((StringBuilder) (obj)).append(i).toString();
        }
        return (new StringBuilder()).append(s1).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(cardNumber);
        parcel.writeInt(expiryMonth);
        parcel.writeInt(expiryYear);
        parcel.writeString(cvv);
        parcel.writeString(postalCode);
        parcel.writeString(scanId);
        parcel.writeInt(yoff);
        parcel.writeIntArray(xoff);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Object createFromParcel(Parcel parcel)
        {
            return new CreditCard(parcel, null);
        }

        public final volatile Object[] newArray(int i)
        {
            return new CreditCard[i];
        }

        _cls1()
        {
        }
    }

}
