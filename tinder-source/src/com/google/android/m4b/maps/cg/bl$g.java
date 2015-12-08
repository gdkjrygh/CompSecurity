// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public static final class <init> extends bl
{

    private final int a;

    public final Bitmap a(Context context)
    {
        return BitmapFactory.decodeResource(context.getResources(), a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (a != ((a) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a)
        });
    }

    public final String toString()
    {
        return v.a(this).("resource ", Integer.valueOf(a)).oString();
    }

    private (int i)
    {
        super((byte)2, (byte)0);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "invalid resource id: %s", new Object[] {
            Integer.valueOf(i)
        });
        a = i;
    }

    a(int i, byte byte0)
    {
        this(i);
    }
}
