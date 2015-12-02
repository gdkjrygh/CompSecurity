// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;

import android.content.ContentResolver;
import com.facebook.common.w.k;
import com.facebook.contacts.data.a;
import com.facebook.contacts.data.ac;
import com.facebook.contacts.data.ad;
import com.facebook.contacts.data.x;
import com.facebook.contacts.data.z;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.google.common.a.es;
import java.util.EnumSet;
import java.util.Locale;

// Referenced classes of package com.facebook.contacts.e:
//            d, b

public class c
{

    private final ContentResolver a;
    private final a b;
    private final x c;

    public c(ContentResolver contentresolver, a a1, x x1)
    {
        a = contentresolver;
        b = a1;
        c = x1;
    }

    public b a(es es)
    {
        return a(es, d.UNORDERED);
    }

    public b a(es es, d d1)
    {
        es = (new StringBuilder()).append("type IN ").append(k.b(es)).append(" ").append("AND fbid IS NOT NULL").toString();
        ContentResolver contentresolver = a;
        android.net.Uri uri = c.c.a;
        d1 = d.access$000(d1);
        es = contentresolver.query(uri, new String[] {
            "data"
        }, es, null, d1);
        return new b(b, es);
    }

    public b a(String s)
    {
        PhoneNumberUtil phonenumberutil = PhoneNumberUtil.getInstance();
        String s2 = Locale.getDefault().getCountry();
        String s1 = s2;
        if (s2.equals(""))
        {
            s1 = "US";
        }
        s = phonenumberutil.format(phonenumberutil.parse(s, s1), com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
        s = a.query(c.e.a(s, EnumSet.of(ad.PHONE_E164)), new String[] {
            "data"
        }, null, null, null);
        return new b(b, s);
    }

    public b a(String s, es es)
    {
        return a(s, es, d.UNORDERED);
    }

    public b a(String s, es es, d d1)
    {
        es = (new StringBuilder()).append("type IN ").append(k.b(es)).append(" ").append("AND fbid IS NOT NULL").toString();
        ContentResolver contentresolver = a;
        s = c.e.a(s);
        d1 = d.access$000(d1);
        s = contentresolver.query(s, new String[] {
            "data"
        }, es, null, d1);
        return new b(b, s);
    }
}
