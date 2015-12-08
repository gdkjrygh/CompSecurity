// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class e
{
    static interface a
    {

        public abstract Object a(int i);

        public abstract List a();

        public abstract boolean a(int i, int j, Bundle bundle);
    }


    // Unreferenced inner class android/support/v4/view/a/e$1

/* anonymous class */
    static final class _cls1 extends AccessibilityNodeProvider
    {

        final a a;

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
        {
            return (AccessibilityNodeInfo)a.a(i);
        }

        public final List findAccessibilityNodeInfosByText(String s, int i)
        {
            return a.a();
        }

        public final boolean performAction(int i, int j, Bundle bundle)
        {
            return a.a(i, j, bundle);
        }

            
            {
                a = a1;
                super();
            }
    }

}
