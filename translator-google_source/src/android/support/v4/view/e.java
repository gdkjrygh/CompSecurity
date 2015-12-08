// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.q;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            b, l, f, a

final class e extends b
{

    e()
    {
    }

    public final q a(Object obj, View view)
    {
        obj = ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
        if (obj != null)
        {
            return new q(obj);
        } else
        {
            return null;
        }
    }

    public final Object a(a a1)
    {
        return new l(new f(this, a1));
    }

    public final boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
    }
}
