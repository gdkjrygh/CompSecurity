// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.j.v;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public static final class <init> extends bl
{

    private final Bitmap a;

    public final Bitmap a(Context context)
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            obj = (a)obj;
            return a.equals(((a) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }

    public final String toString()
    {
        return v.a(this).oString();
    }

    private (Bitmap bitmap)
    {
        super((byte)5, (byte)0);
        a = bitmap;
    }

    a(Bitmap bitmap, byte byte0)
    {
        this(bitmap);
    }
}
