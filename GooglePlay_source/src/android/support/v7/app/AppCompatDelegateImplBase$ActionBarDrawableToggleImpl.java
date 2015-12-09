// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintTypedArray;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase, ActionBar

private final class <init>
    implements <init>
{

    final AppCompatDelegateImplBase this$0;

    public final Context getActionBarThemedContext()
    {
        return AppCompatDelegateImplBase.this.getActionBarThemedContext();
    }

    public final Drawable getThemeUpIndicator()
    {
        TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(AppCompatDelegateImplBase.this.getActionBarThemedContext(), null, new int[] {
            0x7f01011b
        });
        Drawable drawable = tinttypedarray.getDrawable(0);
        tinttypedarray.mWrapped.recycle();
        return drawable;
    }

    public final boolean isNavigationVisible()
    {
        ActionBar actionbar = getSupportActionBar();
        return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
    }

    public final void setActionBarDescription(int i)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeActionContentDescription(i);
        }
    }

    public final void setActionBarUpIndicator(Drawable drawable, int i)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeAsUpIndicator(drawable);
            actionbar.setHomeActionContentDescription(i);
        }
    }

    private ()
    {
        this$0 = AppCompatDelegateImplBase.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
