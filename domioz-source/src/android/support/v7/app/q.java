// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, m

class q extends AppCompatDelegateImplV7
{

    q(Context context, Window window, m m)
    {
        super(context, window, m);
    }

    final View b(View view, String s, Context context, AttributeSet attributeset)
    {
        View view1 = super.b(view, s, context, attributeset);
        if (view1 != null)
        {
            return view1;
        }
        if (c instanceof android.view.LayoutInflater.Factory2)
        {
            return ((android.view.LayoutInflater.Factory2)c).onCreateView(view, s, context, attributeset);
        } else
        {
            return null;
        }
    }
}
