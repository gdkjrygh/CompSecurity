// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.os.Bundle;
import android.support.v4.view.a;
import android.view.View;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class c extends a
{

    final int a = 128;
    final View c;
    final AccessibilityUtil d;

    public final boolean a(View view, int i, Bundle bundle)
    {
        AccessibilityUtil.b().info((new StringBuilder("setDelegate: action ")).append(i).append(", newAction ").append(a).toString());
        if (c != null)
        {
            com.skype.android.util.accessibility.AccessibilityUtil.a(c, a);
        }
        return true;
    }

    (AccessibilityUtil accessibilityutil, View view)
    {
        d = accessibilityutil;
        c = view;
        super();
    }
}
