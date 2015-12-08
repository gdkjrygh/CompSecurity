// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.a.g;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, r, j

final class nit> extends a
{

    final r d;

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        String s;
        Object obj;
        for (; a("Reference"); r.c(d).put(s, obj))
        {
            s = a.getAttributeValue(null, "URI");
            obj = h();
            if (!((j) (obj)).a("DigestValue"))
            {
                throw new g((new StringBuilder("Missing DigestValue for URI ")).append(s).toString(), new Object[0]);
            }
            obj = ((j) (obj)).f();
            if (TextUtils.isEmpty(s) || !s.startsWith("#"))
            {
                throw new g((new StringBuilder("Invalid digest URI: ")).append(s).toString(), new Object[0]);
            }
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                throw new g((new StringBuilder("Invalid digest: ")).append(((String) (obj))).toString(), new Object[0]);
            }
            s = s.substring(1);
        }

    }

    on(r r1, XmlPullParser xmlpullparser, String s)
    {
        d = r1;
        super(xmlpullparser, null, s);
    }
}
