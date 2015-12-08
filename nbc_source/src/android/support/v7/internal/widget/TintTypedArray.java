// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.internal.widget:
//            TintManager

public class TintTypedArray
{

    private final Context mContext;
    private TintManager mTintManager;
    private final TypedArray mWrapped;

    private TintTypedArray(Context context, TypedArray typedarray)
    {
        mContext = context;
        mWrapped = typedarray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeset, int ai[])
    {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeset, ai));
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeset, int ai[], int i, int j)
    {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeset, ai, i, j));
    }

    public boolean getBoolean(int i, boolean flag)
    {
        return mWrapped.getBoolean(i, flag);
    }

    public int getDimensionPixelOffset(int i, int j)
    {
        return mWrapped.getDimensionPixelOffset(i, j);
    }

    public int getDimensionPixelSize(int i, int j)
    {
        return mWrapped.getDimensionPixelSize(i, j);
    }

    public Drawable getDrawable(int i)
    {
        if (mWrapped.hasValue(i))
        {
            int j = mWrapped.getResourceId(i, 0);
            if (j != 0)
            {
                return getTintManager().getDrawable(j);
            }
        }
        return mWrapped.getDrawable(i);
    }

    public Drawable getDrawableIfKnown(int i)
    {
        if (mWrapped.hasValue(i))
        {
            i = mWrapped.getResourceId(i, 0);
            if (i != 0)
            {
                return getTintManager().getDrawable(i, true);
            }
        }
        return null;
    }

    public float getFloat(int i, float f)
    {
        return mWrapped.getFloat(i, f);
    }

    public int getInt(int i, int j)
    {
        return mWrapped.getInt(i, j);
    }

    public int getInteger(int i, int j)
    {
        return mWrapped.getInteger(i, j);
    }

    public int getLayoutDimension(int i, int j)
    {
        return mWrapped.getLayoutDimension(i, j);
    }

    public int getResourceId(int i, int j)
    {
        return mWrapped.getResourceId(i, j);
    }

    public String getString(int i)
    {
        return mWrapped.getString(i);
    }

    public CharSequence getText(int i)
    {
        return mWrapped.getText(i);
    }

    public TintManager getTintManager()
    {
        if (mTintManager == null)
        {
            mTintManager = TintManager.get(mContext);
        }
        return mTintManager;
    }

    public boolean hasValue(int i)
    {
        return mWrapped.hasValue(i);
    }

    public int length()
    {
        return mWrapped.length();
    }

    public void recycle()
    {
        mWrapped.recycle();
    }
}
