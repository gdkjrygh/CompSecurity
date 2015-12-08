// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompatKitKat, AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

class _cls1.a extends _cls1.a
{

    public Object a(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
    {
        return AccessibilityNodeProviderCompatKitKat.a(new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge(accessibilitynodeprovidercompat) {

            final AccessibilityNodeProviderCompat a;
            final AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl b;

            public Object a(int i)
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat = a.a(i);
                if (accessibilitynodeinfocompat == null)
                {
                    return null;
                } else
                {
                    return accessibilitynodeinfocompat.a();
                }
            }

            public List a(String s, int i)
            {
                s = a.a(s, i);
                ArrayList arraylist = new ArrayList();
                int j = s.size();
                for (i = 0; i < j; i++)
                {
                    arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).a());
                }

                return arraylist;
            }

            public boolean a(int i, int j, Bundle bundle)
            {
                return a.a(i, j, bundle);
            }

            public Object b(int i)
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat = a.b(i);
                if (accessibilitynodeinfocompat == null)
                {
                    return null;
                } else
                {
                    return accessibilitynodeinfocompat.a();
                }
            }

            
            {
                b = AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl.this;
                a = accessibilitynodeprovidercompat;
                super();
            }
        });
    }

    _cls1.a()
    {
    }
}
