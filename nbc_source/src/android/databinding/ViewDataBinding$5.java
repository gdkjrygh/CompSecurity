// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.view.View;

// Referenced classes of package android.databinding:
//            ViewDataBinding

static final class istener
    implements android.view.ChangeListener
{

    public void onViewAttachedToWindow(View view)
    {
        ViewDataBinding.access$100(ViewDataBinding.getBinding(view)).run();
        view.removeOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view)
    {
    }

    istener()
    {
    }
}
