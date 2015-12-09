// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.appboy.c.b;
import com.appboy.c.c;
import com.appboy.d.e;
import com.appboy.d.g;
import com.appboy.d.h;
import com.appboy.f;
import com.appboy.ui.d.d;
import com.appboy.ui.m;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            d, e, f, g, 
//            h, i, r, n, 
//            o, w, q, c, 
//            p, j, b, s

public final class a
{

    private static final String a;
    private static volatile a b = null;
    private final Stack c = new Stack();
    private final com.appboy.h d = new m();
    private Activity e;
    private b f;
    private p g;
    private r h;
    private n i;
    private w j;
    private com.appboy.d.a k;
    private AtomicBoolean l;
    private p m;
    private r n;
    private r o;
    private r p;
    private n q;
    private final s r = new i(this);

    public a()
    {
        l = new AtomicBoolean(false);
        m = new com.appboy.ui.inappmessage.d(this);
        n = new com.appboy.ui.inappmessage.e(this);
        o = new com.appboy.ui.inappmessage.f(this);
        p = new com.appboy.ui.inappmessage.g(this);
        q = new com.appboy.ui.inappmessage.h(this);
    }

    static Activity a(a a1)
    {
        return a1.e;
    }

    public static a a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/appboy/ui/inappmessage/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new a();
        }
        com/appboy/ui/inappmessage/a;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/appboy/ui/inappmessage/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean a(a a1, com.appboy.d.a a2)
    {
        return a1.b(a2);
    }

    static AtomicBoolean b(a a1)
    {
        return a1.l;
    }

    private boolean b(com.appboy.d.a a1)
    {
        Object obj;
        if (h != null)
        {
            obj = h;
        } else
        if (a1 instanceof h)
        {
            obj = n;
        } else
        if (a1 instanceof g)
        {
            obj = o;
        } else
        if (a1 instanceof e)
        {
            obj = p;
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            com.appboy.f.a.a(a, "ViewFactory from getInAppMessageViewFactory was null.");
            return false;
        }
        obj = ((r) (obj)).a(e, a1);
        if (obj == null)
        {
            com.appboy.f.a.d(a, "The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
            l.set(false);
            return false;
        }
        if (((View) (obj)).getParent() != null)
        {
            com.appboy.f.a.d(a, "The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
            l.set(false);
            return false;
        }
        android.view.animation.Animation animation = e().a(a1);
        android.view.animation.Animation animation1 = e().b(a1);
        if (obj instanceof o)
        {
            com.appboy.f.a.a(a, "Creating view wrapper for immersive in-app message.");
            o o1 = (o)obj;
            j = new w(((View) (obj)), a1, r, animation, animation1, o1.b(), o1.g(), o1.j());
        } else
        if (obj instanceof q)
        {
            com.appboy.f.a.a(a, "Creating view wrapper for base in-app message.");
            q q1 = (q)obj;
            j = new w(((View) (obj)), a1, r, animation, animation1, q1.b());
        } else
        {
            com.appboy.f.a.a(a, "Creating view wrapper for in-app message.");
            j = new w(((View) (obj)), a1, r, animation, animation1, ((View) (obj)));
        }
        a1 = (FrameLayout)e.getWindow().getDecorView().findViewById(0x1020002);
        j.a(a1);
        return true;
    }

    static p c(a a1)
    {
        return a1.d();
    }

    static String c()
    {
        return a;
    }

    private p d()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return m;
        }
    }

    static w d(a a1)
    {
        a1.j = null;
        return null;
    }

    static com.appboy.h e(a a1)
    {
        com.appboy.h h1 = com.appboy.a.a(a1.e).g();
        if (h1 != null)
        {
            return h1;
        } else
        {
            return a1.d;
        }
    }

    private n e()
    {
        if (i != null)
        {
            return i;
        } else
        {
            return q;
        }
    }

    public final void a(Activity activity)
    {
        e = activity;
        if (k != null)
        {
            com.appboy.f.a.a(a, "Displaying carryover in-app message.");
            k.q();
            b(k);
            k = null;
        }
        f = new com.appboy.ui.inappmessage.c(this);
        com.appboy.a.a(activity).a(f);
    }

    public final void a(com.appboy.d.a a1)
    {
        c.push(a1);
        if (!l.compareAndSet(false, true))
        {
            com.appboy.f.a.a(a, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
            return;
        }
        if (c.isEmpty())
        {
            com.appboy.f.a.a(a, "The in-app message stack is empty. No in-app message will be displayed.");
            l.set(false);
            return;
        }
        a1 = (com.appboy.d.a)c.pop();
        int i1 = d().beforeInAppMessageDisplayed$1b17e3c1(a1);
        switch (j.a[i1 - 1])
        {
        default:
            com.appboy.f.a.d(a, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
            l.set(false);
            return;

        case 1: // '\001'
            com.appboy.f.a.a(a, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
            e.runOnUiThread(new com.appboy.ui.inappmessage.b(this, a1));
            return;

        case 2: // '\002'
            com.appboy.f.a.a(a, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
            c.push(a1);
            l.set(false);
            return;

        case 3: // '\003'
            com.appboy.f.a.a(a, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
            break;
        }
        l.set(false);
    }

    public final void a(p p1)
    {
        g = p1;
    }

    public final void b()
    {
        w w1 = j;
        if (w1 != null)
        {
            w1.c();
        }
        w1 = j;
        if (w1 != null)
        {
            com.appboy.d.a a1 = w1.f();
            if (a1 != null)
            {
                a1.a(true);
            }
            w1.d();
        }
    }

    public final void b(Activity activity)
    {
        if (j != null)
        {
            com.appboy.ui.d.d.a(j.e());
            if (j.a())
            {
                j.b();
                k = null;
            } else
            {
                k = j.f();
            }
            j = null;
        } else
        {
            k = null;
        }
        com.appboy.a.a(activity).a(f, com/appboy/c/c);
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/inappmessage/a.getName()
        });
    }
}
