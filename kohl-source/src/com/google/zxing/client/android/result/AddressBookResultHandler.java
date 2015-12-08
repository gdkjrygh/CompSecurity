// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ParsedResult;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class AddressBookResultHandler extends ResultHandler
{

    private static final int BUTTON_TEXTS[];
    private static final DateFormat DATE_FORMATS[];
    private int buttonCount;
    private final boolean fields[] = new boolean[4];

    public AddressBookResultHandler(Activity activity, ParsedResult parsedresult)
    {
        super(activity, parsedresult);
        activity = (AddressBookParsedResult)parsedresult;
        parsedresult = activity.getAddresses();
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (parsedresult != null && parsedresult.length > 0 && parsedresult[0] != null && !parsedresult[0].isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        parsedresult = activity.getPhoneNumbers();
        if (parsedresult != null && parsedresult.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        activity = activity.getEmails();
        if (activity != null && activity.length > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        fields[0] = true;
        fields[1] = flag;
        fields[2] = flag1;
        fields[3] = flag2;
        buttonCount = 0;
        for (int i = 0; i < 4; i++)
        {
            if (fields[i])
            {
                buttonCount = buttonCount + 1;
            }
        }

    }

    private int mapIndexToAction(int i)
    {
        if (i < buttonCount)
        {
            int k = -1;
            for (int j = 0; j < 4;)
            {
                int l = k;
                if (fields[j])
                {
                    l = k + 1;
                }
                if (l == i)
                {
                    return j;
                }
                j++;
                k = l;
            }

        }
        return -1;
    }

    private static Date parseDate(String s)
    {
        DateFormat adateformat[];
        int i;
        int j;
        adateformat = DATE_FORMATS;
        j = adateformat.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = adateformat[i];
        obj = ((DateFormat) (obj)).parse(s);
        return ((Date) (obj));
        ParseException parseexception;
        parseexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public int getButtonCount()
    {
        return buttonCount;
    }

    public int getButtonText(int i)
    {
        return BUTTON_TEXTS[mapIndexToAction(i)];
    }

    public CharSequence getDisplayContents()
    {
        AddressBookParsedResult addressbookparsedresult = (AddressBookParsedResult)getResult();
        StringBuilder stringbuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(addressbookparsedresult.getNames(), stringbuilder);
        int j = stringbuilder.length();
        Object obj = addressbookparsedresult.getPronunciation();
        if (obj != null && !((String) (obj)).isEmpty())
        {
            stringbuilder.append("\n(");
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(')');
        }
        ParsedResult.maybeAppend(addressbookparsedresult.getTitle(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getOrg(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getAddresses(), stringbuilder);
        String as[] = addressbookparsedresult.getPhoneNumbers();
        if (as != null)
        {
            int k = as.length;
            for (int i = 0; i < k; i++)
            {
                String s = as[i];
                if (s != null)
                {
                    ParsedResult.maybeAppend(PhoneNumberUtils.formatNumber(s), stringbuilder);
                }
            }

        }
        ParsedResult.maybeAppend(addressbookparsedresult.getEmails(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getURLs(), stringbuilder);
        as = addressbookparsedresult.getBirthday();
        if (as != null && !as.isEmpty())
        {
            as = parseDate(as);
            if (as != null)
            {
                ParsedResult.maybeAppend(DateFormat.getDateInstance(2).format(Long.valueOf(as.getTime())), stringbuilder);
            }
        }
        ParsedResult.maybeAppend(addressbookparsedresult.getNote(), stringbuilder);
        if (j > 0)
        {
            SpannableString spannablestring = new SpannableString(stringbuilder.toString());
            spannablestring.setSpan(new StyleSpan(1), 0, j, 0);
            return spannablestring;
        } else
        {
            return stringbuilder.toString();
        }
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_address_book;
    }

    public void handleButtonPress(int i)
    {
        AddressBookParsedResult addressbookparsedresult = (AddressBookParsedResult)getResult();
        Object obj = addressbookparsedresult.getAddresses();
        Object obj1;
        if (obj == null || obj.length < 1)
        {
            obj = null;
        } else
        {
            obj = obj[0];
        }
        obj1 = addressbookparsedresult.getAddressTypes();
        if (obj1 == null || obj1.length < 1)
        {
            obj1 = null;
        } else
        {
            obj1 = obj1[0];
        }
        switch (mapIndexToAction(i))
        {
        default:
            return;

        case 0: // '\0'
            addContact(addressbookparsedresult.getNames(), addressbookparsedresult.getNicknames(), addressbookparsedresult.getPronunciation(), addressbookparsedresult.getPhoneNumbers(), addressbookparsedresult.getPhoneTypes(), addressbookparsedresult.getEmails(), addressbookparsedresult.getEmailTypes(), addressbookparsedresult.getNote(), addressbookparsedresult.getInstantMessenger(), ((String) (obj)), ((String) (obj1)), addressbookparsedresult.getOrg(), addressbookparsedresult.getTitle(), addressbookparsedresult.getURLs(), addressbookparsedresult.getBirthday(), addressbookparsedresult.getGeo());
            return;

        case 1: // '\001'
            String as[] = addressbookparsedresult.getNames();
            String s;
            if (as != null)
            {
                s = as[0];
            } else
            {
                s = null;
            }
            searchMap(((String) (obj)), s);
            return;

        case 2: // '\002'
            dialPhone(addressbookparsedresult.getPhoneNumbers()[0]);
            return;

        case 3: // '\003'
            sendEmail(addressbookparsedresult.getEmails()[0], null, null);
            return;
        }
    }

    static 
    {
        DATE_FORMATS = (new DateFormat[] {
            new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH), new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH)
        });
        DateFormat adateformat[] = DATE_FORMATS;
        int j = adateformat.length;
        for (int i = 0; i < j; i++)
        {
            adateformat[i].setLenient(false);
        }

        BUTTON_TEXTS = (new int[] {
            com.google.zxing.client.android.R.string.button_add_contact, com.google.zxing.client.android.R.string.button_show_map, com.google.zxing.client.android.R.string.button_dial, com.google.zxing.client.android.R.string.button_email
        });
    }
}
