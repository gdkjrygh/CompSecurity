// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public static final class <init> extends bl
{

    private final String a;

    public final Bitmap a(Context context)
    {
        Object obj;
        try
        {
            context = context.getAssets().open(a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        obj = BitmapFactory.decodeStream(context);
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((Bitmap) (obj));
        }
        return ((Bitmap) (obj));
        obj;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw obj;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof eStream))
        {
            return false;
        } else
        {
            obj = (eStream)obj;
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
        return v.a(this).("asset", a).oString();
    }

    private (String s)
    {
        super((byte)3, (byte)0);
        a = (String)x.a(s, "null asset name");
    }

    a(String s, byte byte0)
    {
        this(s);
    }
}
