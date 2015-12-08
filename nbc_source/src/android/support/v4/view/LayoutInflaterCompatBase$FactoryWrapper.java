// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterCompatBase, LayoutInflaterFactory

static class mDelegateFactory
    implements android.view.oryWrapper
{

    final LayoutInflaterFactory mDelegateFactory;

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        return mDelegateFactory.onCreateView(null, s, context, attributeset);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("{").append(mDelegateFactory).append("}").toString();
    }

    (LayoutInflaterFactory layoutinflaterfactory)
    {
        mDelegateFactory = layoutinflaterfactory;
    }
}
