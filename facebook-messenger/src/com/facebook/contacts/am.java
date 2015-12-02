// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.content.res.Resources;
import com.facebook.inject.d;
import com.facebook.o;
import com.facebook.user.a.l;
import java.util.Locale;

// Referenced classes of package com.facebook.contacts:
//            a, b

class am extends d
{

    final a a;

    private am(a a1)
    {
        a = a1;
        super();
    }

    am(a a1, b b1)
    {
        this(a1);
    }

    public l a()
    {
        Resources resources = (Resources)a(android/content/res/Resources);
        return new l(resources.getString(o.common_name_prefixes), resources.getString(o.common_last_name_prefixes), resources.getString(o.common_name_suffixes), resources.getString(o.common_name_conjunctions), Locale.getDefault());
    }

    public Object b()
    {
        return a();
    }
}
