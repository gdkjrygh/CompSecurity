// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplBase, ActionBar

private class <init>
    implements <init>
{

    final AppCompatDelegateImplBase this$0;

    public Context getActionBarThemedContext()
    {
        return AppCompatDelegateImplBase.this.getActionBarThemedContext();
    }

    public Drawable getThemeUpIndicator()
    {
        TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), null, new int[] {
            android.support.v7.appcompat.ionBarThemedContext
        });
        Drawable drawable = tinttypedarray.getDrawable(0);
        tinttypedarray.recycle();
        return drawable;
    }

    public boolean isNavigationVisible()
    {
        ActionBar actionbar = getSupportActionBar();
        return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
    }

    public void setActionBarDescription(int i)
    {
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeActionContentDescription(i);
        }
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
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

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
