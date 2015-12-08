// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat

final class <init>
    implements Runnable
{

    WeakReference mViewRef;
    ViewPropertyAnimatorCompat mVpa;
    final mVpa this$0;

    public final void run()
    {
        View view = (View)mViewRef.get();
        if (view != null)
        {
            mation(mVpa, view);
        }
    }

    private (ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        this$0 = this._cls0.this;
        super();
        mViewRef = new WeakReference(view);
        mVpa = viewpropertyanimatorcompat;
    }

    mVpa(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, byte byte0)
    {
        this(viewpropertyanimatorcompat, view);
    }
}
