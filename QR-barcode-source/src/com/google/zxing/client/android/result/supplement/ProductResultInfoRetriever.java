// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result.supplement;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.android.history.HistoryManager;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.result.supplement:
//            SupplementalInfoRetriever

final class ProductResultInfoRetriever extends SupplementalInfoRetriever
{

    private static final Pattern PRODUCT_NAME_PRICE_PATTERNS[] = {
        Pattern.compile(",event\\)\">([^<]+)</a></h3>.+<span class=psrp>([^<]+)</span>"), Pattern.compile("owb63p\">([^<]+).+zdi3pb\">([^<]+)")
    };
    private final Context context;
    private final String productID;
    private final String source;

    ProductResultInfoRetriever(TextView textview, String s, HistoryManager historymanager, Context context1)
    {
        super(textview, historymanager);
        productID = s;
        source = context1.getString(com.google.zxing.client.android.R.string.msg_google_product);
        context = context1;
    }

    private static String unescapeHTML(String s)
    {
        return Html.fromHtml(s).toString();
    }

    void retrieveSupplementalInfo()
        throws IOException
    {
        String s = URLEncoder.encode(productID, "UTF-8");
        s = (new StringBuilder("http://www.google.")).append(LocaleManager.getProductSearchCountryTLD(context)).append("/m/products?ie=utf8&oe=utf8&scoring=p&source=zxing&q=").append(s).toString();
        CharSequence charsequence = HttpHelper.downloadViaHttp(s, com.google.zxing.client.android.HttpHelper.ContentType.HTML);
        Pattern apattern[] = PRODUCT_NAME_PRICE_PATTERNS;
        int j = apattern.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            Matcher matcher = apattern[i].matcher(charsequence);
            if (matcher.find())
            {
                append(productID, source, new String[] {
                    unescapeHTML(matcher.group(1)), unescapeHTML(matcher.group(2))
                }, s);
                return;
            }
            i++;
        } while (true);
    }

}
