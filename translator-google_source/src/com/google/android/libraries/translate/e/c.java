// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;

public final class c
{

    private static final CharSequence c = "&";
    private static final CharSequence d = "?";
    public final List a = new ArrayList();
    public boolean b;
    private final List e = new ArrayList();
    private final String f;

    public c(String s)
    {
        b = false;
        f = s;
    }

    public final c a(Object obj)
    {
        a.add(obj);
        return this;
    }

    public final c a(String s, String s1)
    {
        return a(new BasicNameValuePair(s, s1));
    }

    public final c a(BasicNameValuePair basicnamevaluepair)
    {
        e.add(basicnamevaluepair);
        return this;
    }

    public final HttpRequestBase a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder(f);
        Object obj;
        if (f.contains(d))
        {
            obj = c;
        } else
        {
            obj = d;
        }
        obj = stringbuilder.append(((CharSequence) (obj))).append(TextUtils.join(c, a)).toString();
        if (flag && ((String) (obj)).length() > 1200)
        {
            obj = null;
        } else
        {
            if (!b && e.isEmpty())
            {
                return new HttpGet(((String) (obj)));
            }
            HttpPost httppost = new HttpPost(((String) (obj)));
            obj = httppost;
            if (!e.isEmpty())
            {
                try
                {
                    httppost.setEntity(new UrlEncodedFormEntity(e, "UTF-8"));
                }
                catch (UnsupportedEncodingException unsupportedencodingexception)
                {
                    return httppost;
                }
                return httppost;
            }
        }
        return ((HttpRequestBase) (obj));
    }

    public final c b(String s, String s1)
    {
        return a(new BasicNameValuePair(s, s1));
    }

}
