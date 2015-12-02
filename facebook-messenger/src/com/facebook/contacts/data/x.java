// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.net.Uri;
import com.facebook.d.b.a;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.data:
//            ad, z, aa, ac

public final class x
{

    public static final Set f;
    public final String a;
    public final Uri b;
    public final z c = new z(this);
    public final aa d = new aa(this);
    public final ac e = new ac(this);

    public x(a a1)
    {
        a = a1.a("contacts");
        b = Uri.parse((new StringBuilder()).append("content://").append(a).toString());
    }

    static 
    {
        f = Collections.unmodifiableSet(EnumSet.of(ad.NAME, ad.PHONE_E164, ad.PHONE_NATIONAL, ad.PHONE_LOCAL));
    }
}
