// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityDelegateCompat
{

    private static final AccessibilityDelegateImpl b;
    private static final Object c;
    final Object a;

    public AccessibilityDelegateCompat()
    {
        a = b.a(this);
    }

    public AccessibilityNodeProviderCompat a(View view)
    {
        return b.a(c, view);
    }

    Object a()
    {
        return a;
    }

    public void a(View view, int i)
    {
        b.a(c, view, i);
    }

    public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        b.a(c, view, accessibilitynodeinfocompat);
    }

    public void a(View view, AccessibilityEvent accessibilityevent)
    {
        b.d(c, view, accessibilityevent);
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        return b.a(c, view, i, bundle);
    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, viewgroup, view, accessibilityevent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityevent)
    {
        return b.a(c, view, accessibilityevent);
    }

    public void c(View view, AccessibilityEvent accessibilityevent)
    {
        b.c(c, view, accessibilityevent);
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        b.b(c, view, accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b = new AccessibilityDelegateJellyBeanImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new AccessibilityDelegateIcsImpl();
        } else
        {
            b = new AccessibilityDelegateStubImpl();
        }
        c = b.a();
    }

    private class AccessibilityDelegateImpl
    {

        public abstract AccessibilityNodeProviderCompat a(Object obj, View view);

        public abstract Object a();

        public abstract Object a(AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void a(Object obj, View view, int i);

        public abstract void a(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract boolean a(Object obj, View view, int i, Bundle bundle);

        public abstract boolean a(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent);

        public abstract void b(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void c(Object obj, View view, AccessibilityEvent accessibilityevent);

        public abstract void d(Object obj, View view, AccessibilityEvent accessibilityevent);
    }


    private class AccessibilityDelegateJellyBeanImpl extends AccessibilityDelegateIcsImpl
    {
        private class AccessibilityDelegateIcsImpl extends AccessibilityDelegateStubImpl
        {
            private class AccessibilityDelegateStubImpl
                implements AccessibilityDelegateImpl
            {

                public AccessibilityNodeProviderCompat a(Object obj, View view)
                {
                    return null;
                }

                public Object a()
                {
                    return null;
                }

                public Object a(AccessibilityDelegateCompat accessibilitydelegatecompat)
                {
                    return null;
                }

                public void a(Object obj, View view, int i)
                {
                }

                public void a(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
                {
                }

                public boolean a(Object obj, View view, int i, Bundle bundle)
                {
                    return false;
                }

                public boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
                {
                    return false;
                }

                public boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return true;
                }

                public void b(Object obj, View view, AccessibilityEvent accessibilityevent)
                {
                }

                public void c(Object obj, View view, AccessibilityEvent accessibilityevent)
                {
                }

                public void d(Object obj, View view, AccessibilityEvent accessibilityevent)
                {
                }

                AccessibilityDelegateStubImpl()
                {
                }
            }


            public Object a()
            {
                return AccessibilityDelegateCompatIcs.a();
            }

            public Object a(AccessibilityDelegateCompat accessibilitydelegatecompat)
            {
                return AccessibilityDelegateCompatIcs.a(accessibilitydelegatecompat. new AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge() {

                    final AccessibilityDelegateCompat a;
                    final AccessibilityDelegateIcsImpl b;

                    public void a(View view, int i)
                    {
                        a.a(view, i);
                    }

                    public void a(View view, Object obj)
                    {
                        a.a(view, new AccessibilityNodeInfoCompat(obj));
                    }

                    public boolean a(View view, AccessibilityEvent accessibilityevent)
                    {
                        return a.b(view, accessibilityevent);
                    }

                    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                    {
                        return a.a(viewgroup, view, accessibilityevent);
                    }

                    public void b(View view, AccessibilityEvent accessibilityevent)
                    {
                        a.d(view, accessibilityevent);
                    }

                    public void c(View view, AccessibilityEvent accessibilityevent)
                    {
                        a.c(view, accessibilityevent);
                    }

                    public void d(View view, AccessibilityEvent accessibilityevent)
                    {
                        a.a(view, accessibilityevent);
                    }

                    
                    {
                        b = AccessibilityDelegateIcsImpl.this;
                        a = AccessibilityDelegateCompat.this;
                        super();
                    }
                });
            }

            public void a(Object obj, View view, int i)
            {
                AccessibilityDelegateCompatIcs.a(obj, view, i);
            }

            public void a(Object obj, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
            {
                AccessibilityDelegateCompatIcs.a(obj, view, accessibilitynodeinfocompat.a());
            }

            public boolean a(Object obj, View view, AccessibilityEvent accessibilityevent)
            {
                return AccessibilityDelegateCompatIcs.a(obj, view, accessibilityevent);
            }

            public boolean a(Object obj, ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
            {
                return AccessibilityDelegateCompatIcs.a(obj, viewgroup, view, accessibilityevent);
            }

            public void b(Object obj, View view, AccessibilityEvent accessibilityevent)
            {
                AccessibilityDelegateCompatIcs.b(obj, view, accessibilityevent);
            }

            public void c(Object obj, View view, AccessibilityEvent accessibilityevent)
            {
                AccessibilityDelegateCompatIcs.c(obj, view, accessibilityevent);
            }

            public void d(Object obj, View view, AccessibilityEvent accessibilityevent)
            {
                AccessibilityDelegateCompatIcs.d(obj, view, accessibilityevent);
            }

            AccessibilityDelegateIcsImpl()
            {
            }
        }


        public AccessibilityNodeProviderCompat a(Object obj, View view)
        {
            obj = AccessibilityDelegateCompatJellyBean.a(obj, view);
            if (obj != null)
            {
                return new AccessibilityNodeProviderCompat(obj);
            } else
            {
                return null;
            }
        }

        public Object a(AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
            return AccessibilityDelegateCompatJellyBean.a(accessibilitydelegatecompat. new AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean() {

                final AccessibilityDelegateCompat a;
                final AccessibilityDelegateJellyBeanImpl b;

                public Object a(View view)
                {
                    view = a.a(view);
                    if (view != null)
                    {
                        return view.a();
                    } else
                    {
                        return null;
                    }
                }

                public void a(View view, int i)
                {
                    a.a(view, i);
                }

                public void a(View view, Object obj)
                {
                    a.a(view, new AccessibilityNodeInfoCompat(obj));
                }

                public boolean a(View view, int i, Bundle bundle)
                {
                    return a.a(view, i, bundle);
                }

                public boolean a(View view, AccessibilityEvent accessibilityevent)
                {
                    return a.b(view, accessibilityevent);
                }

                public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
                {
                    return a.a(viewgroup, view, accessibilityevent);
                }

                public void b(View view, AccessibilityEvent accessibilityevent)
                {
                    a.d(view, accessibilityevent);
                }

                public void c(View view, AccessibilityEvent accessibilityevent)
                {
                    a.c(view, accessibilityevent);
                }

                public void d(View view, AccessibilityEvent accessibilityevent)
                {
                    a.a(view, accessibilityevent);
                }

                
                {
                    b = AccessibilityDelegateJellyBeanImpl.this;
                    a = AccessibilityDelegateCompat.this;
                    super();
                }
            });
        }

        public boolean a(Object obj, View view, int i, Bundle bundle)
        {
            return AccessibilityDelegateCompatJellyBean.a(obj, view, i, bundle);
        }

        AccessibilityDelegateJellyBeanImpl()
        {
        }
    }

}
