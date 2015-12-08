// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;

public final class vb
{

    public Context a;

    private vb(Context context)
    {
        a = context;
    }

    public static vb a(Context context)
    {
        return new vb(context);
    }

    public final boolean a()
    {
        if (a.getApplicationInfo().targetSdkVersion >= 16)
        {
            return a.getResources().getBoolean(b.V);
        } else
        {
            return a.getResources().getBoolean(b.W);
        }
    }

    public final int b()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, uh.a, b.i, 0);
        int j = typedarray.getLayoutDimension(uh.j, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!a())
        {
            i = Math.min(j, resources.getDimensionPixelSize(b.aa));
        }
        typedarray.recycle();
        return i;
    }

    public final int c()
    {
        return a.getResources().getDimensionPixelSize(b.ab);
    }
}
