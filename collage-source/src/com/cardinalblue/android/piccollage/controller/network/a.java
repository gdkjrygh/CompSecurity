// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import com.cardinalblue.android.piccollage.auth.a.c;
import com.cardinalblue.android.piccollage.auth.a.d;
import com.cardinalblue.android.piccollage.auth.a.e;
import com.cardinalblue.android.piccollage.auth.a.f;

public class a
{

    public a()
    {
    }

    public void a(Throwable throwable)
    {
        if (throwable != null && (throwable instanceof f.g))
        {
            throwable = (f.g)throwable;
            if (throwable.a())
            {
                switch (throwable.b())
                {
                case 3: // '\003'
                default:
                    return;

                case 0: // '\0'
                    (new d()).a();
                    return;

                case 1: // '\001'
                    (new c()).a();
                    return;

                case 2: // '\002'
                    (new f()).a();
                    return;

                case 4: // '\004'
                    (new e()).a();
                    break;
                }
                return;
            }
        }
    }
}
