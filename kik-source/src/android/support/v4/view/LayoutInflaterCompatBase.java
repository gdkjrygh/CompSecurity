// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory

class LayoutInflaterCompatBase
{
    static class FactoryWrapper
        implements android.view.LayoutInflater.Factory
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

        FactoryWrapper(LayoutInflaterFactory layoutinflaterfactory)
        {
            mDelegateFactory = layoutinflaterfactory;
        }
    }


    LayoutInflaterCompatBase()
    {
    }

    static void setFactory(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        if (layoutinflaterfactory != null)
        {
            layoutinflaterfactory = new FactoryWrapper(layoutinflaterfactory);
        } else
        {
            layoutinflaterfactory = null;
        }
        layoutinflater.setFactory(layoutinflaterfactory);
    }
}
