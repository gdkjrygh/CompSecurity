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

    private boolean doRetrieveForCountry(String s)
        throws IOException
    {
        Object obj;
        Object obj1;
        String s1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String s2;
        ArrayList arraylist;
        XmlPullParser xmlpullparser;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        obj3 = HttpHelper.downloadViaHttp((new StringBuilder()).append("https://bsplus.srowen.com/ss?c=").append(s).append("&t=").append(type).append("&i=").append(productID).toString(), com.google.zxing.client.android.HttpHelper.ContentType.XML);
        obj2 = null;
        arraylist = new ArrayList();
        s1 = null;
        obj1 = null;
        obj = null;
        boolean flag6 = false;
        int i;
        try
        {
            xmlpullparser = buildParser(((CharSequence) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IOException(s);
        }
        flag2 = false;
        flag5 = false;
        flag4 = false;
        i = xmlpullparser.getEventType();
_L9:
        flag = flag6;
        if (i == 1) goto _L2; else goto _L1
_L1:
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
        if (i != 2) goto _L4; else goto _L3
_L3:
        obj3 = xmlpullparser.getName();
        if (!"Item".equals(obj3)) goto _L6; else goto _L5
_L5:
        if (!flag2) goto _L8; else goto _L7
_L7:
        flag = flag6;
          goto _L2
_L4:
        i = xmlpullparser.next();
        obj2 = obj3;
        obj1 = obj4;
        obj = obj5;
        flag2 = flag3;
        flag5 = flag;
        flag4 = flag1;
        s1 = s2;
          goto _L9
_L6:
        if (!"DetailPageURL".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        assertTextNext(xmlpullparser);
        obj3 = xmlpullparser.getText();
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
          goto _L4
        if (!"Author".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_327;
        }
        assertTextNext(xmlpullparser);
        arraylist.add(xmlpullparser.getText());
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
          goto _L4
        if (!"Title".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_376;
        }
        assertTextNext(xmlpullparser);
        s2 = xmlpullparser.getText();
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
          goto _L4
        if (!"LowestNewPrice".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_413;
        }
        flag = true;
        flag1 = false;
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        s2 = s1;
          goto _L4
        if (!"LowestUsedPrice".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_450;
        }
        flag = false;
        flag1 = true;
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        s2 = s1;
          goto _L4
        if (!"FormattedPrice".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_521;
        }
        if (flag5) goto _L11; else goto _L10
_L10:
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
        if (!flag4) goto _L4; else goto _L11
_L11:
        assertTextNext(xmlpullparser);
        obj3 = xmlpullparser.getText();
        boolean flag7;
        if (flag5)
        {
            obj1 = obj3;
        } else
        {
            obj = obj3;
        }
        break MISSING_BLOCK_LABEL_704;
        flag7 = "Errors".equals(obj3);
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
        if (!flag7) goto _L4; else goto _L12
_L12:
        flag = true;
          goto _L2
_L17:
        obj3 = new ArrayList();
        maybeAddText(s1, ((Collection) (obj3)));
        maybeAddTextSeries(arraylist, ((Collection) (obj3)));
        if (obj1 == null) goto _L14; else goto _L13
_L13:
        maybeAddText(((String) (obj1)), ((Collection) (obj3)));
_L15:
        append(productID, (new StringBuilder()).append("Amazon ").append(s).toString(), (String[])((Collection) (obj3)).toArray(new String[((Collection) (obj3)).size()]), ((String) (obj2)));
        return true;
_L14:
        if (obj != null)
        {
            maybeAddText(((String) (obj)), ((Collection) (obj3)));
        }
        if (true) goto _L15; else goto _L2
_L2:
        if (!flag && obj2 != null) goto _L17; else goto _L16
_L16:
        return false;
_L8:
        flag3 = true;
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag = flag5;
        flag1 = flag4;
        s2 = s1;
          goto _L4
        flag = false;
        flag1 = false;
        obj3 = obj2;
        obj4 = obj1;
        obj5 = obj;
        flag3 = flag2;
        s2 = s1;
          goto _L4
    }

    void retrieveSupplementalInfo()
        throws IOException
    {
        if (!doRetrieveForCountry(country) && !"US".equals(country))
        {
            doRetrieveForCountry("US");
        }
    }
}
