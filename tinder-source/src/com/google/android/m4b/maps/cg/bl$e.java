// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
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
    private final Resources b;

    public final Bitmap a(Context context)
    {
        return BitmapFactory.decodeResource(b, a);
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

    private (Resources resources, int i)
    {
        super((byte)6, (byte)0);
        b = (Resources)x.a(resources, "libraryResources");
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

    public a(Resources resources, int i, byte byte0)
    {
        this(resources, i);
    }
}
