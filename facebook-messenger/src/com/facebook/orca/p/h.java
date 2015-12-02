// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.p;

import android.content.res.Resources;
import com.facebook.o;
import com.facebook.user.User;
import com.facebook.user.a.g;
import com.google.common.a.fi;
import java.util.Locale;
import javax.inject.a;

public class h
{

    private final a a;

    public h(a a1)
    {
        a = a1;
    }

    public String a(Resources resources, User user)
    {
        Locale locale = (Locale)a.b();
        if (g.b.contains(locale.getLanguage()))
        {
            user = user.f();
        } else
        {
            user = user.e();
        }
        return resources.getString(o.short_name_wrapper, new Object[] {
            user
        });
    }
}
