// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            FragmentContainer, Fragment

final class this._cls0
    implements FragmentContainer
{

    final Fragment this$0;

    public final View findViewById(int i)
    {
        if (mView == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return mView.findViewById(i);
        }
    }

    public final boolean hasView()
    {
        return mView != null;
    }

    tainer()
    {
        this$0 = Fragment.this;
        super();
    }
}
