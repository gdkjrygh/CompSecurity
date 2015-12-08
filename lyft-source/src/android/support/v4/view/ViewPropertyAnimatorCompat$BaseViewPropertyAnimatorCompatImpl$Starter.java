// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat

class <init>
    implements Runnable
{

    WeakReference a;
    ViewPropertyAnimatorCompat b;
    final b c;

    public void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            a(c, b, view);
        }
    }

    private ( , ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
    {
        c = ;
        super();
        a = new WeakReference(view);
        b = viewpropertyanimatorcompat;
    }

    b(b b1, ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, b b2)
    {
        this(b1, viewpropertyanimatorcompat, view);
    }
}
