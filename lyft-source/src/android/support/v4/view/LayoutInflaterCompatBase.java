// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.LayoutInflater;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory

class LayoutInflaterCompatBase
{

    static void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
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

    private class FactoryWrapper
        implements android.view.LayoutInflater.Factory
    {

        final LayoutInflaterFactory a;

        public View onCreateView(String s, Context context, AttributeSet attributeset)
        {
            return a.onCreateView(null, s, context, attributeset);
        }

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getName()).append("{").append(a).append("}").toString();
        }

        FactoryWrapper(LayoutInflaterFactory layoutinflaterfactory)
        {
            a = layoutinflaterfactory;
        }
    }

}
