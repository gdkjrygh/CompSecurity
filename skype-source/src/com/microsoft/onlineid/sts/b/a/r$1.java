// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.a.g;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, r

final class nit> extends a
{

    final r d;

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            String s = g();
            if ("SignedInfo".equals(s))
            {
                r.a(d, this);
            } else
            if ("SignatureValue".equals(s))
            {
                r.a(d, d());
            } else
            {
                e();
            }
        }
        if (TextUtils.isEmpty(r.a(d)))
        {
            throw new g("<SignatureValue> node was missing.", new Object[0]);
        }
        if (TextUtils.isEmpty(r.b(d)))
        {
            throw new g("<SignedInfo> node was missing.", new Object[0]);
        } else
        {
            return;
        }
    }

    on(r r1, XmlPullParser xmlpullparser, String s, String s1)
    {
        d = r1;
        super(xmlpullparser, s, s1);
    }
}
