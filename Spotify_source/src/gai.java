// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public final class gai
    implements gwk
{

    private Drawable a;
    private String b;
    private boolean c;

    public gai(Context context, boolean flag)
    {
        a = gcg.a(context, 0x7f020115);
        c = flag;
        context = new StringBuilder("RadioCollectionItemTransformation");
        char c1;
        if (c)
        {
            c1 = '1';
        } else
        {
            c1 = '0';
        }
        b = context.append(c1).toString();
    }

    public final Bitmap a(Bitmap bitmap)
    {
        return dfu.a(bitmap, a, c);
    }

    public final String a()
    {
        return b;
    }
}
