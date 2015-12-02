// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.util.Base64;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EncodingUtils;

public class v
    implements f
{

    public v()
    {
    }

    public static String b(String s)
    {
        s = EncodingUtils.getBytes(s, "UTF-8");
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(bytearrayoutputstream);
        deflateroutputstream.write(s);
        deflateroutputstream.close();
        return Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("message", s));
        arraylist.add(new BasicNameValuePair("compressed", "1"));
        arraylist.add(new BasicNameValuePair("format", "json"));
        return new n("sendAnaliyticsLog", "POST", "method/logging.mobilelogs", arraylist, t.JSON);
    }

    public Boolean a(String s, r r1)
    {
        return Boolean.valueOf(r1.c().booleanValue());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }
}
