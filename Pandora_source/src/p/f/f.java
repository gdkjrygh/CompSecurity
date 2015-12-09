// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.f;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class f
{
    static interface a
    {

        public abstract Object a(int i);

        public abstract List a(String s, int i);

        public abstract boolean a(int i, int j, Bundle bundle);
    }


    public static Object a(a a1)
    {
        return new AccessibilityNodeProvider(a1) {

            final a a;

            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
            {
                return (AccessibilityNodeInfo)a.a(i);
            }

            public List findAccessibilityNodeInfosByText(String s, int i)
            {
                return a.a(s, i);
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return a.a(i, j, bundle);
            }

            
            {
                a = a1;
                super();
            }
        };
    }
}
