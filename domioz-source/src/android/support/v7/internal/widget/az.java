// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.internal.widget:
//            ax

public final class az
{

    private final Context a;
    private final TypedArray b;
    private ax c;

    private az(Context context, TypedArray typedarray)
    {
        a = context;
        b = typedarray;
    }

    public static az a(Context context, AttributeSet attributeset, int ai[])
    {
        return new az(context, context.obtainStyledAttributes(attributeset, ai));
    }

    public static az a(Context context, AttributeSet attributeset, int ai[], int i)
    {
        return new az(context, context.obtainStyledAttributes(attributeset, ai, i, 0));
    }

    public final int a()
    {
        return b.length();
    }

    public final int a(int i, int j)
    {
        return b.getInt(i, j);
    }

    public final Drawable a(int i)
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

    public final boolean a(int i, boolean flag)
    {
        return b.getBoolean(i, flag);
    }

    public final int b(int i, int j)
    {
        return b.getInteger(i, j);
    }

    public final Drawable b(int i)
    {
        if (b.hasValue(i))
        {
            i = b.getResourceId(i, 0);
            if (i != 0)
            {
                return c().a(i, true);
            }
        }
        return null;
    }

    public final void b()
    {
        b.recycle();
    }

    public final int c(int i, int j)
    {
        return b.getDimensionPixelOffset(i, j);
    }

    public final ax c()
    {
        if (c == null)
        {
            c = ax.a(a);
        }
        return c;
    }

    public final CharSequence c(int i)
    {
        return b.getText(i);
    }

    public final int d(int i, int j)
    {
        return b.getDimensionPixelSize(i, j);
    }

    public final String d(int i)
    {
        return b.getString(i);
    }

    public final float e(int i)
    {
        return b.getFloat(i, -1F);
    }

    public final int e(int i, int j)
    {
        return b.getLayoutDimension(i, j);
    }

    public final int f(int i, int j)
    {
        return b.getResourceId(i, j);
    }

    public final boolean f(int i)
    {
        return b.hasValue(i);
    }
}
