// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.encode;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.android.Contents;
import com.google.zxing.client.result.AddressBookParsedResult;
import com.google.zxing.client.result.ResultParser;
import com.google.zxing.common.BitMatrix;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.android.encode:
//            ContactEncoder, VCardContactEncoder, MECARDContactEncoder

final class QRCodeEncoder
{

    private static final int BLACK = 0xff000000;
    private static final String TAG = com/google/zxing/client/android/encode/QRCodeEncoder.getSimpleName();
    private static final int WHITE = -1;
    private final Context activity;
    private String contents;
    private final int dimension;
    private String displayContents;
    private BarcodeFormat format;
    private String title;
    private final boolean useVCard;

    QRCodeEncoder(Context context, Intent intent, int i, boolean flag)
        throws WriterException
    {
        activity = context;
        dimension = i;
        useVCard = flag;
        context = intent.getAction();
        if (context.equals("com.google.zxing.client.android.ENCODE"))
        {
            encodeContentsFromZXingIntent(intent);
        } else
        if (context.equals("android.intent.action.SEND"))
        {
            encodeContentsFromShareIntent(intent);
            return;
        }
    }

    private void encodeContentsFromShareIntent(Intent intent)
        throws WriterException
    {
        if (intent.hasExtra("android.intent.extra.STREAM"))
        {
            encodeFromStreamExtra(intent);
            return;
        } else
        {
            encodeFromTextExtras(intent);
            return;
        }
    }

    private boolean encodeContentsFromZXingIntent(Intent intent)
    {
        String s = intent.getStringExtra("ENCODE_FORMAT");
        format = null;
        if (s != null)
        {
            try
            {
                format = BarcodeFormat.valueOf(s);
            }
            catch (IllegalArgumentException illegalargumentexception) { }
        }
        if (format != null && format != BarcodeFormat.QR_CODE) goto _L2; else goto _L1
_L1:
        s = intent.getStringExtra("ENCODE_TYPE");
        if (s != null && !s.isEmpty()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        format = BarcodeFormat.QR_CODE;
        encodeQRCodeContents(intent, s);
_L7:
        if (contents != null && !contents.isEmpty())
        {
            return true;
        }
          goto _L5
_L2:
        intent = intent.getStringExtra("ENCODE_DATA");
        if (intent != null && !intent.isEmpty())
        {
            contents = intent;
            displayContents = intent;
            title = activity.getString(com.google.zxing.client.android.R.string.contents_text);
        }
        if (true) goto _L7; else goto _L6
_L6:
_L5:
        if (true) goto _L3; else goto _L8
_L8:
    }

    private void encodeFromStreamExtra(Intent intent)
        throws WriterException
    {
        format = BarcodeFormat.QR_CODE;
        intent = intent.getExtras();
        if (intent == null)
        {
            throw new WriterException("No extras");
        }
        intent = (Uri)intent.getParcelable("android.intent.extra.STREAM");
        if (intent == null)
        {
            throw new WriterException("No EXTRA_STREAM");
        }
        Object obj;
        byte abyte0[];
        intent = activity.getContentResolver().openInputStream(intent);
        obj = new ByteArrayOutputStream();
        abyte0 = new byte[2048];
_L1:
        int i = intent.read(abyte0);
label0:
        {
            if (i <= 0)
            {
                break label0;
            }
            try
            {
                ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw new WriterException(intent);
            }
        }
          goto _L1
        intent = ((ByteArrayOutputStream) (obj)).toByteArray();
        obj = new String(intent, 0, intent.length, "UTF-8");
        Log.d(TAG, "Encoding share intent content:");
        Log.d(TAG, ((String) (obj)));
        intent = ResultParser.parseResult(new Result(((String) (obj)), intent, null, BarcodeFormat.QR_CODE));
        if (!(intent instanceof AddressBookParsedResult))
        {
            throw new WriterException("Result was not an address");
        }
        encodeQRCodeContents((AddressBookParsedResult)intent);
        if (contents == null || contents.isEmpty())
        {
            throw new WriterException("No content to encode");
        } else
        {
            return;
        }
    }

    private void encodeFromTextExtras(Intent intent)
        throws WriterException
    {
        String s = ContactEncoder.trim(intent.getStringExtra("android.intent.extra.TEXT"));
        Object obj = s;
        if (s == null)
        {
            String s1 = ContactEncoder.trim(intent.getStringExtra("android.intent.extra.HTML_TEXT"));
            obj = s1;
            if (s1 == null)
            {
                String s2 = ContactEncoder.trim(intent.getStringExtra("android.intent.extra.SUBJECT"));
                obj = s2;
                if (s2 == null)
                {
                    obj = intent.getStringArrayExtra("android.intent.extra.EMAIL");
                    if (obj != null)
                    {
                        obj = ContactEncoder.trim(obj[0]);
                    } else
                    {
                        obj = "?";
                    }
                }
            }
        }
        if (obj == null || ((String) (obj)).isEmpty())
        {
            throw new WriterException("Empty EXTRA_TEXT");
        }
        contents = ((String) (obj));
        format = BarcodeFormat.QR_CODE;
        if (intent.hasExtra("android.intent.extra.SUBJECT"))
        {
            displayContents = intent.getStringExtra("android.intent.extra.SUBJECT");
        } else
        if (intent.hasExtra("android.intent.extra.TITLE"))
        {
            displayContents = intent.getStringExtra("android.intent.extra.TITLE");
        } else
        {
            displayContents = contents;
        }
        title = activity.getString(com.google.zxing.client.android.R.string.contents_text);
    }

    private void encodeQRCodeContents(Intent intent, String s)
    {
        if (!s.equals("TEXT_TYPE")) goto _L2; else goto _L1
_L1:
        intent = intent.getStringExtra("ENCODE_DATA");
        if (intent != null && !intent.isEmpty())
        {
            contents = intent;
            displayContents = intent;
            title = activity.getString(com.google.zxing.client.android.R.string.contents_text);
        }
_L4:
        return;
_L2:
        if (!s.equals("EMAIL_TYPE"))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = ContactEncoder.trim(intent.getStringExtra("ENCODE_DATA"));
        if (intent != null)
        {
            contents = (new StringBuilder()).append("mailto:").append(intent).toString();
            displayContents = intent;
            title = activity.getString(com.google.zxing.client.android.R.string.contents_email);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s.equals("PHONE_TYPE"))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = ContactEncoder.trim(intent.getStringExtra("ENCODE_DATA"));
        if (intent != null)
        {
            contents = (new StringBuilder()).append("tel:").append(intent).toString();
            displayContents = PhoneNumberUtils.formatNumber(intent);
            title = activity.getString(com.google.zxing.client.android.R.string.contents_phone);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!s.equals("SMS_TYPE"))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = ContactEncoder.trim(intent.getStringExtra("ENCODE_DATA"));
        if (intent != null)
        {
            contents = (new StringBuilder()).append("sms:").append(intent).toString();
            displayContents = PhoneNumberUtils.formatNumber(intent);
            title = activity.getString(com.google.zxing.client.android.R.string.contents_sms);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!s.equals("CONTACT_TYPE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getBundleExtra("ENCODE_DATA");
        if (s != null)
        {
            String s1 = s.getString("name");
            String s2 = s.getString("company");
            String s3 = s.getString("postal");
            ArrayList arraylist = new ArrayList(Contents.PHONE_KEYS.length);
            for (int i = 0; i < Contents.PHONE_KEYS.length; i++)
            {
                arraylist.add(s.getString(Contents.PHONE_KEYS[i]));
            }

            ArrayList arraylist1 = new ArrayList(Contents.EMAIL_KEYS.length);
            for (int j = 0; j < Contents.EMAIL_KEYS.length; j++)
            {
                arraylist1.add(s.getString(Contents.EMAIL_KEYS[j]));
            }

            intent = s.getString("URL_KEY");
            String s4;
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = Collections.singletonList(intent);
            }
            s4 = s.getString("NOTE_KEY");
            if (useVCard)
            {
                s = new VCardContactEncoder();
            } else
            {
                s = new MECARDContactEncoder();
            }
            intent = s.encode(Collections.singleton(s1), s2, Collections.singleton(s3), arraylist, arraylist1, intent, s4);
            if (!intent[1].isEmpty())
            {
                contents = intent[0];
                displayContents = intent[1];
                title = activity.getString(com.google.zxing.client.android.R.string.contents_contact);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!s.equals("LOCATION_TYPE")) goto _L4; else goto _L7
_L7:
        intent = intent.getBundleExtra("ENCODE_DATA");
        if (intent != null)
        {
            float f = intent.getFloat("LAT", 3.402823E+38F);
            float f1 = intent.getFloat("LONG", 3.402823E+38F);
            if (f != 3.402823E+38F && f1 != 3.402823E+38F)
            {
                contents = (new StringBuilder()).append("geo:").append(f).append(',').append(f1).toString();
                displayContents = (new StringBuilder()).append(f).append(",").append(f1).toString();
                title = activity.getString(com.google.zxing.client.android.R.string.contents_location);
                return;
            }
        }
        if (true) goto _L4; else goto _L8
_L8:
    }

    private void encodeQRCodeContents(AddressBookParsedResult addressbookparsedresult)
    {
        Object obj;
        if (useVCard)
        {
            obj = new VCardContactEncoder();
        } else
        {
            obj = new MECARDContactEncoder();
        }
        addressbookparsedresult = ((ContactEncoder) (obj)).encode(toIterable(addressbookparsedresult.getNames()), addressbookparsedresult.getOrg(), toIterable(addressbookparsedresult.getAddresses()), toIterable(addressbookparsedresult.getPhoneNumbers()), toIterable(addressbookparsedresult.getEmails()), toIterable(addressbookparsedresult.getURLs()), null);
        if (!addressbookparsedresult[1].isEmpty())
        {
            contents = addressbookparsedresult[0];
            displayContents = addressbookparsedresult[1];
            title = activity.getString(com.google.zxing.client.android.R.string.contents_contact);
        }
    }

    private static String guessAppropriateEncoding(CharSequence charsequence)
    {
        for (int i = 0; i < charsequence.length(); i++)
        {
            if (charsequence.charAt(i) > '\377')
            {
                return "UTF-8";
            }
        }

        return null;
    }

    private static Iterable toIterable(String as[])
    {
        if (as == null)
        {
            return null;
        } else
        {
            return Arrays.asList(as);
        }
    }

    Bitmap encodeAsBitmap()
        throws WriterException
    {
        Object obj1 = contents;
        if (obj1 == null)
        {
            return null;
        }
        Object obj = null;
        String s = guessAppropriateEncoding(((CharSequence) (obj1)));
        if (s != null)
        {
            obj = new EnumMap(com/google/zxing/EncodeHintType);
            ((Map) (obj)).put(EncodeHintType.CHARACTER_SET, s);
        }
        int l;
        int i1;
        try
        {
            obj1 = (new MultiFormatWriter()).encode(((String) (obj1)), format, dimension, dimension, ((Map) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        l = ((BitMatrix) (obj1)).getWidth();
        i1 = ((BitMatrix) (obj1)).getHeight();
        obj = new int[l * i1];
        for (int i = 0; i < i1; i++)
        {
            int j = 0;
            while (j < l) 
            {
                int k;
                if (((BitMatrix) (obj1)).get(j, i))
                {
                    k = 0xff000000;
                } else
                {
                    k = -1;
                }
                obj[i * l + j] = k;
                j++;
            }
        }

        obj1 = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_8888);
        ((Bitmap) (obj1)).setPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
        return ((Bitmap) (obj1));
    }

    String getContents()
    {
        return contents;
    }

    String getDisplayContents()
    {
        return displayContents;
    }

    String getTitle()
    {
        return title;
    }

    boolean isUseVCard()
    {
        return useVCard;
    }

}
