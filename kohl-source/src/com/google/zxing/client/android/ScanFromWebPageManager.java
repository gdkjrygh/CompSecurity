// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.android.result.ResultHandler;
import com.google.zxing.client.result.ParsedResultType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class ScanFromWebPageManager
{

    private static final CharSequence CODE_PLACEHOLDER = "{CODE}";
    private static final CharSequence FORMAT_PLACEHOLDER = "{FORMAT}";
    private static final CharSequence META_PLACEHOLDER = "{META}";
    private static final CharSequence RAW_CODE_PLACEHOLDER = "{RAWCODE}";
    private static final String RAW_PARAM = "raw";
    private static final String RETURN_URL_PARAM = "ret";
    private static final CharSequence TYPE_PLACEHOLDER = "{TYPE}";
    private final boolean returnRaw;
    private final String returnUrlTemplate;

    ScanFromWebPageManager(Uri uri)
    {
        returnUrlTemplate = uri.getQueryParameter("ret");
        boolean flag;
        if (uri.getQueryParameter("raw") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        returnRaw = flag;
    }

    private static String replace(CharSequence charsequence, CharSequence charsequence1, String s)
    {
        if (charsequence1 == null)
        {
            charsequence1 = "";
        }
        String s1 = URLEncoder.encode(charsequence1.toString(), "UTF-8");
        charsequence1 = s1;
_L2:
        return s.replace(charsequence, charsequence1);
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    String buildReplyURL(Result result, ResultHandler resulthandler)
    {
        String s = returnUrlTemplate;
        CharSequence charsequence = CODE_PLACEHOLDER;
        Object obj;
        if (returnRaw)
        {
            obj = result.getText();
        } else
        {
            obj = resulthandler.getDisplayContents();
        }
        obj = replace(charsequence, ((CharSequence) (obj)), s);
        obj = replace(RAW_CODE_PLACEHOLDER, result.getText(), ((String) (obj)));
        obj = replace(FORMAT_PLACEHOLDER, result.getBarcodeFormat().toString(), ((String) (obj)));
        resulthandler = replace(TYPE_PLACEHOLDER, resulthandler.getType().toString(), ((String) (obj)));
        return replace(META_PLACEHOLDER, String.valueOf(result.getResultMetadata()), resulthandler);
    }

    boolean isScanFromWebPage()
    {
        return returnUrlTemplate != null;
    }

}
