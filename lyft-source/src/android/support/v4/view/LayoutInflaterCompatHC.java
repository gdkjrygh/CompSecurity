// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory

class LayoutInflaterCompatHC
{

    private static Field a;
    private static boolean b;

    static void a(LayoutInflater layoutinflater, LayoutInflaterFactory layoutinflaterfactory)
    {
        android.view.LayoutInflater.Factory factory;
        if (layoutinflaterfactory != null)
        {
            layoutinflaterfactory = new FactoryWrapperHC(layoutinflaterfactory);
        } else
        {
            layoutinflaterfactory = null;
        }
        layoutinflater.setFactory2(layoutinflaterfactory);
        factory = layoutinflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2)
        {
            a(layoutinflater, (android.view.LayoutInflater.Factory2)factory);
            return;
        } else
        {
            a(layoutinflater, ((android.view.LayoutInflater.Factory2) (layoutinflaterfactory)));
            return;
        }
    }

    static void a(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!b)
        {
            try
            {
                a = android/view/LayoutInflater.getDeclaredField("mFactory2");
                a.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("LayoutInflaterCompatHC", (new StringBuilder()).append("forceSetFactory2 Could not find field 'mFactory2' on class ").append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.").toString(), nosuchfieldexception);
            }
            b = true;
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        a.set(layoutinflater, factory2);
        return;
        factory2;
        Log.e("LayoutInflaterCompatHC", (new StringBuilder()).append("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(layoutinflater).append("; inflation may have unexpected results.").toString(), factory2);
        return;
    }

    private class FactoryWrapperHC extends LayoutInflaterCompatBase.FactoryWrapper
        implements android.view.LayoutInflater.Factory2
    {

        public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
        {
            return a.onCreateView(view, s, context, attributeset);
        }

        FactoryWrapperHC(LayoutInflaterFactory layoutinflaterfactory)
        {
            super(layoutinflaterfactory);
        }
    }

}
