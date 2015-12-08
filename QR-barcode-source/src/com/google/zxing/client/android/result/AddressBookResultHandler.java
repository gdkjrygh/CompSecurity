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
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (parsedresult != null && parsedresult.length > 0 && parsedresult[0] != null && parsedresult[0].length() > 0)
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
        i = 0;
        do
        {
            if (i >= 4)
            {
                return;
            }
            if (fields[i])
            {
                buttonCount = buttonCount + 1;
            }
            i++;
        } while (true);
    }

    private int mapIndexToAction(int i)
    {
        if (i >= buttonCount) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        l = -1;
        j = 0;
_L7:
        if (j < 4) goto _L3; else goto _L2
_L2:
        l = -1;
_L5:
        return l;
_L3:
        int k;
        k = l;
        if (fields[j])
        {
            k = l + 1;
        }
        l = j;
        if (k == i) goto _L5; else goto _L4
_L4:
        j++;
        l = k;
        if (true) goto _L7; else goto _L6
_L6:
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
            return null;
        }
        obj = adateformat[i];
        obj = ((DateFormat) (obj)).parse(s);
        return ((Date) (obj));
        ParseException parseexception;
        parseexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
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
        AddressBookParsedResult addressbookparsedresult;
        StringBuilder stringbuilder;
        Object obj;
        int j;
        addressbookparsedresult = (AddressBookParsedResult)getResult();
        stringbuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(addressbookparsedresult.getNames(), stringbuilder);
        j = stringbuilder.length();
        obj = addressbookparsedresult.getPronunciation();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            stringbuilder.append("\n(");
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(')');
        }
        ParsedResult.maybeAppend(addressbookparsedresult.getTitle(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getOrg(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getAddresses(), stringbuilder);
        obj = addressbookparsedresult.getPhoneNumbers();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = obj.length;
        i = 0;
_L5:
        if (i < k) goto _L3; else goto _L2
_L2:
        ParsedResult.maybeAppend(addressbookparsedresult.getEmails(), stringbuilder);
        ParsedResult.maybeAppend(addressbookparsedresult.getURLs(), stringbuilder);
        obj = addressbookparsedresult.getBirthday();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            obj = parseDate(((String) (obj)));
            if (obj != null)
            {
                ParsedResult.maybeAppend(DateFormat.getDateInstance(2).format(Long.valueOf(((Date) (obj)).getTime())), stringbuilder);
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
_L3:
        ParsedResult.maybeAppend(PhoneNumberUtils.formatNumber(obj[i]), stringbuilder);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
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
        int i = 0;
        do
        {
            if (i >= j)
            {
                BUTTON_TEXTS = (new int[] {
                    com.google.zxing.client.android.R.string.button_add_contact, com.google.zxing.client.android.R.string.button_show_map, com.google.zxing.client.android.R.string.button_dial, com.google.zxing.client.android.R.string.button_email
                });
                return;
            }
            adateformat[i].setLenient(false);
            i++;
        } while (true);
    }
}
