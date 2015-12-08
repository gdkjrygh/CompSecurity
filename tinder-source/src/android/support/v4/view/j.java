// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//            k

final class j
{
    static final class a extends i.a
        implements android.view.LayoutInflater.Factory2
    {

        public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
        {
            return a.onCreateView(view, s, context, attributeset);
        }

        a(k k1)
        {
            super(k1);
        }
    }


    private static Field a;
    private static boolean b;

    static void a(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!b)
        {
            try
            {
                Field field = android/view/LayoutInflater.getDeclaredField("mFactory2");
                a = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ")).append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.").toString(), nosuchfieldexception);
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
        Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ")).append(layoutinflater).append("; inflation may have unexpected results.").toString(), factory2);
        return;
    }
}
