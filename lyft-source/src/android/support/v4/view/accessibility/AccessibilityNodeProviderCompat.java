// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeInfoCompat

public class AccessibilityNodeProviderCompat
{

    private static final AccessibilityNodeProviderImpl a;
    private final Object b;

    public AccessibilityNodeProviderCompat()
    {
        b = a.a(this);
    }

    public AccessibilityNodeProviderCompat(Object obj)
    {
        b = obj;
    }

    public AccessibilityNodeInfoCompat a(int i)
    {
        return null;
    }

    public Object a()
    {
        return b;
    }

    public List a(String s, int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    public AccessibilityNodeInfoCompat b(int i)
    {
        return null;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new AccessibilityNodeProviderKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new AccessibilityNodeProviderJellyBeanImpl();
        } else
        {
            a = new AccessibilityNodeProviderStubImpl();
        }
    }

    private class AccessibilityNodeProviderImpl
    {

        public abstract Object a(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat);
    }


    private class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
    {
        private class AccessibilityNodeProviderStubImpl
            implements AccessibilityNodeProviderImpl
        {

            public Object a(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
            {
                return null;
            }

            AccessibilityNodeProviderStubImpl()
            {
            }
        }


        public Object a(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatKitKat.a(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderCompat a;
                final AccessibilityNodeProviderKitKatImpl b;

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
                    b = AccessibilityNodeProviderKitKatImpl.this;
                    a = AccessibilityNodeProviderCompat.this;
                    super();
                }
            });
        }

        AccessibilityNodeProviderKitKatImpl()
        {
        }
    }


    private class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
    {

        public Object a(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
        {
            return AccessibilityNodeProviderCompatJellyBean.a(accessibilitynodeprovidercompat. new AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge() {

                final AccessibilityNodeProviderCompat a;
                final AccessibilityNodeProviderJellyBeanImpl b;

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

                
                {
                    b = AccessibilityNodeProviderJellyBeanImpl.this;
                    a = AccessibilityNodeProviderCompat.this;
                    super();
                }
            });
        }

        AccessibilityNodeProviderJellyBeanImpl()
        {
        }
    }

}
