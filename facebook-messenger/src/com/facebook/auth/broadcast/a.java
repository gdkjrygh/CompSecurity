// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Intent;
import com.facebook.config.a.d;
import com.facebook.debug.log.b;

public class a
{

    private static final Class a = com/facebook/auth/broadcast/a;

    public a()
    {
    }

    public static d a(Intent intent)
    {
        intent = intent.getStringExtra("extra_product");
        try
        {
            intent = d.valueOf(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            b.e(a, "NullPointerException getting login action product.", intent);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            b.d(a, "IllegalArgumentException getting login action product. This is caused by receiving a broadcast from an app this version hasn't heard of.", intent);
            return null;
        }
        return intent;
    }

}
