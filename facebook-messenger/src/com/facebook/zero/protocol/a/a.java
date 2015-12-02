// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol.a;

import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.zero.ui.CarrierBottomBannerData;
import com.facebook.zero.ui.h;
import com.google.common.a.hq;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

public class a
    implements f
{

    private static final Class a = com/facebook/zero/protocol/a/a;
    private final h b;

    public a(h h1)
    {
        b = h1;
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("megaphone_location", "MESSENGER_BOTTOM"));
        arraylist.add(new BasicNameValuePair("zero_campaign", s));
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("locale", com.facebook.common.k.a.a(Locale.getDefault())));
        com.facebook.debug.log.b.b(a, "Requesting zero rating bottom banner with params: %s", new Object[] {
            arraylist
        });
        return new n("fetchBottomBanner", "GET", "me/megaphone_top_stories", arraylist, t.JSON);
    }

    public CarrierBottomBannerData a(String s, r r1)
    {
        return b.a(r1.c());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }

}
