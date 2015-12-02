// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.n;

import android.content.res.Resources;
import com.facebook.o;

public class a
{

    private final Resources a;

    public a(Resources resources)
    {
        a = resources;
    }

    public String a(int i)
    {
        if (i < 2048)
        {
            return a.getString(o.byte_size_bytes, new Object[] {
                Integer.valueOf(i)
            });
        }
        i /= 1024;
        if (i < 2048)
        {
            return a.getString(o.byte_size_kb, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            i /= 1024;
            return a.getString(o.byte_size_mb, new Object[] {
                Integer.valueOf(i)
            });
        }
    }
}
