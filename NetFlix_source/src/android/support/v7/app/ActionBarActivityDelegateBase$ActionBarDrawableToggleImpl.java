// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarView;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, ActionBarActivity

private class <init>
    implements android.support.v4.app.<init>
{

    final ActionBarActivityDelegateBase this$0;

    public Drawable getThemeUpIndicator()
    {
        TypedArray typedarray = mActivity.obtainStyledAttributes(ActionBarActivityDelegateBase.access$500());
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
    }

    public void setActionBarDescription(int i)
    {
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
    {
        if (ActionBarActivityDelegateBase.access$600(ActionBarActivityDelegateBase.this) != null)
        {
            ActionBarActivityDelegateBase.access$600(ActionBarActivityDelegateBase.this).setHomeAsUpIndicator(drawable);
        }
    }

    private ()
    {
        this$0 = ActionBarActivityDelegateBase.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
