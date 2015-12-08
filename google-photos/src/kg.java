// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class kg extends kd
{

    kg()
    {
    }

    public final Object a(kc kc)
    {
        return new kk(new kh(this, kc));
    }

    public final pm a(Object obj, View view)
    {
        obj = ((android.view.View.AccessibilityDelegate)obj).getAccessibilityNodeProvider(view);
        if (obj != null)
        {
            return new pm(obj);
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, View view, int i, Bundle bundle)
    {
        return ((android.view.View.AccessibilityDelegate)obj).performAccessibilityAction(view, i, bundle);
    }
}
