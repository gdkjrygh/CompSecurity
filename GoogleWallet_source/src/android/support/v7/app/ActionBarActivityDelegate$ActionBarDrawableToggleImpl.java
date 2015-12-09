// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBar

final class <init>
    implements <init>
{

    final ActionBarActivityDelegate this$0;

    public final Context getActionBarThemedContext()
    {
        return ActionBarActivityDelegate.this.getActionBarThemedContext();
    }

    public final Drawable getThemeUpIndicator()
    {
        TypedArray typedarray = ActionBarActivityDelegate.this.getActionBarThemedContext().obtainStyledAttributes(new int[] {
            getHomeAsUpIndicatorAttrId()
        });
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
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
        this$0 = ActionBarActivityDelegate.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
