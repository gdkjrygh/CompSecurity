// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.android.history.HistoryManager;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            SupplementalInfoRetriever

final class AmazonInfoRetriever extends SupplementalInfoRetriever
{

    private final String country;
    private final String productID;
    private final String type;

    AmazonInfoRetriever(TextView textview, String s, String s1, HistoryManager historymanager, Context context)
    {
        super(textview, historymanager);
        historymanager = LocaleManager.getCountry(context);
        textview = s;
        if ("ISBN".equals(s))
        {
            textview = s;
            if (!Locale.US.getCountry().equals(historymanager))
            {
                textview = "EAN";
            }
        }
        type = textview;
        productID = s1;
        country = historymanager;
    }

    private static void assertTextNext(XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        if (xmlpullparser.next() != 4)
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private static XmlPullParser buildParser(CharSequence charsequence)
        throws XmlPullParserException
    {
        Object obj = XmlPullParserFactory.newInstance();
        ((XmlPullParserFactory) (obj)).setNamespaceAware(true);
        obj = ((XmlPullParserFactory) (obj)).newPullParser();
        ((XmlPullParser) (obj)).setInput(new StringReader(charsequence.toString()));
        return ((XmlPullParser) (obj));
    }

    void retrieveSupplementalInfo()
        throws IOException
    {
        Object obj;
        String s;
        String s1;
        Object obj1;
        String s2;
        String s3;
        ArrayList arraylist1;
        XmlPullParser xmlpullparser;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i;
        boolean flag3;
        boolean flag4;
        obj1 = HttpHelper.downloadViaHttp((new StringBuilder("https://bsplus.srowen.com/ss?c=")).append(country).append("&t=").append(type).append("&i=").append(productID).toString(), com.google.zxing.client.android.HttpHelper.ContentType.XML);
        obj = null;
        arraylist1 = new ArrayList();
        s1 = null;
        s = null;
        flag4 = false;
        try
        {
            xmlpullparser = buildParser(((CharSequence) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IOException(((XmlPullParserException) (obj)).toString());
        }
        flag1 = false;
        flag3 = false;
        i = xmlpullparser.getEventType();
          goto _L1
_L11:
        obj1 = obj;
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        s3 = s1;
        if (i != 2) goto _L3; else goto _L2
_L2:
        obj1 = xmlpullparser.getName();
        if (!"Item".equals(obj1)) goto _L5; else goto _L4
_L4:
        flag = flag4;
        if (flag1) goto _L7; else goto _L6
_L6:
        flag2 = true;
        s3 = s1;
        flag = flag3;
        s2 = s;
        obj1 = obj;
_L3:
        i = xmlpullparser.next();
        obj = obj1;
        s = s2;
        flag1 = flag2;
        flag3 = flag;
        s1 = s3;
        continue; /* Loop/switch isn't completed */
_L5:
        if (!"DetailPageURL".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        assertTextNext(xmlpullparser);
        obj1 = xmlpullparser.getText();
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        s3 = s1;
        continue; /* Loop/switch isn't completed */
        if (!"Author".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_294;
        }
        assertTextNext(xmlpullparser);
        arraylist1.add(xmlpullparser.getText());
        obj1 = obj;
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        s3 = s1;
        continue; /* Loop/switch isn't completed */
        if (!"Title".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_335;
        }
        assertTextNext(xmlpullparser);
        s3 = xmlpullparser.getText();
        obj1 = obj;
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        continue; /* Loop/switch isn't completed */
        if ("LowestNewPrice".equals(obj1))
        {
            flag = true;
            obj1 = obj;
            s2 = s;
            flag2 = flag1;
            s3 = s1;
            continue; /* Loop/switch isn't completed */
        }
        if (!"FormattedPrice".equals(obj1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        s3 = s1;
        if (!flag3)
        {
            continue; /* Loop/switch isn't completed */
        }
        assertTextNext(xmlpullparser);
        s2 = xmlpullparser.getText();
        flag = false;
        obj1 = obj;
        flag2 = flag1;
        s3 = s1;
        if (true) goto _L3; else goto _L8
_L8:
        boolean flag5 = "Errors".equals(obj1);
        obj1 = obj;
        s2 = s;
        flag2 = flag1;
        flag = flag3;
        s3 = s1;
        if (!flag5) goto _L3; else goto _L9
_L9:
        flag = true;
          goto _L7
_L13:
        ArrayList arraylist = new ArrayList();
        maybeAddText(s1, arraylist);
        maybeAddTextSeries(arraylist1, arraylist);
        maybeAddText(s, arraylist);
        append(productID, "Amazon", (String[])arraylist.toArray(new String[arraylist.size()]), ((String) (obj)));
        return;
_L1:
        if (i != 1) goto _L11; else goto _L10
_L10:
        flag = flag4;
_L7:
        if (!flag && obj != null) goto _L13; else goto _L12
_L12:
    }
}
