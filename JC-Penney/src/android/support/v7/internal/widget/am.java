// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.internal.widget:
//            ak

public class am
{

    private final Context a;
    private final TypedArray b;
    private ak c;

    private am(Context context, TypedArray typedarray)
    {
        a = context;
        b = typedarray;
    }

    public static am a(Context context, AttributeSet attributeset, int ai[])
    {
        return new am(context, context.obtainStyledAttributes(attributeset, ai));
    }

    public static am a(Context context, AttributeSet attributeset, int ai[], int i, int j)
    {
        return new am(context, context.obtainStyledAttributes(attributeset, ai, i, j));
    }

    public float a(int i, float f1)
    {
        return b.getFloat(i, f1);
    }

    public int a()
    {
        return b.length();
    }

    public int a(int i, int j)
    {
        return b.getInt(i, j);
    }

    public Drawable a(int i)
    {
        if (b.hasValue(i))
        {
            int j = b.getResourceId(i, 0);
            if (j != 0)
            {
                return c().a(j);
            }
        }
        return b.getDrawable(i);
    }

    public boolean a(int i, boolean flag)
    {
        return b.getBoolean(i, flag);
    }

    public int b(int i, int j)
    {
        return b.getColor(i, j);
    }

    public CharSequence b(int i)
    {
        return b.getText(i);
    }

    public void b()
    {
        b.recycle();
    }

    public int c(int i, int j)
    {
        return b.getInteger(i, j);
    }

    public ak c()
    {
        if (c == null)
        {
            c = ak.a(a);
        }
        return c;
    }

    public String c(int i)
    {
        return b.getString(i);
    }

    public int d(int i, int j)
    {
        return b.getDimensionPixelOffset(i, j);
    }

    public boolean d(int i)
    {
        return b.hasValue(i);
    }

    public int e(int i, int j)
    {
        return b.getDimensionPixelSize(i, j);
    }

    public int f(int i, int j)
    {
        return b.getLayoutDimension(i, j);
    }

    public int g(int i, int j)
    {
        return b.getResourceId(i, j);
    }
}
