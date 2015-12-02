// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;

// Referenced classes of package android.support.v4.app:
//            p, s, ai, bc, 
//            Fragment, q

public class bb extends p
    implements android.view.LayoutInflater.Factory
{

    private final ViewGroup a;
    private final s b = new s();
    private final MenuInflater c = new MenuInflater(a());
    private final LayoutInflater d = LayoutInflater.from(a()).cloneInContext(a());
    private final Handler e = new Handler(a().getMainLooper());
    private q f;
    private HashMap g;

    public bb(ViewGroup viewgroup)
    {
        a = viewgroup;
        b.a(this, this, null);
        if (d.getFactory() == null)
        {
            d.setFactory(this);
        }
    }

    public Context a()
    {
        return a.getContext();
    }

    public ai a(String s1, boolean flag, boolean flag1)
    {
        if (g == null)
        {
            g = new HashMap();
        }
        ai ai1 = (ai)g.get(s1);
        if (ai1 == null)
        {
            if (flag1)
            {
                ai1 = new ai(s1, this, flag);
                g.put(s1, ai1);
            }
            return ai1;
        } else
        {
            ai1.a(this);
            return ai1;
        }
    }

    public View a(int i1)
    {
        return a.findViewById(i1);
    }

    public void a(Fragment fragment)
    {
    }

    public void a(Fragment fragment, Intent intent, int i1)
    {
        a().startActivity(intent);
    }

    public void a(q q1)
    {
        if (q1 == null)
        {
            return;
        } else
        {
            f = q1;
            return;
        }
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
    }

    public void a(String s1)
    {
    }

    void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    }

    public Handler b()
    {
        return e;
    }

    public Window c()
    {
        return null;
    }

    public Resources d()
    {
        return a().getResources();
    }

    public LayoutInflater e()
    {
        return d;
    }

    public boolean f()
    {
        return false;
    }

    public s g()
    {
        return b;
    }

    public boolean h()
    {
        return false;
    }

    public q i()
    {
        return f;
    }

    public void j()
    {
    }

    public void k()
    {
        b.m();
        b.n();
    }

    public void l()
    {
        b.o();
        b.p();
    }

    public void m()
    {
        b.o();
    }

    public void n()
    {
        b.p();
    }

    public void o()
    {
        b.q();
    }

    public View onCreateView(String s1, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s1))
        {
            return null;
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        s1 = context.obtainStyledAttributes(attributeset, bc.a);
        if (s2 == null)
        {
            s2 = s1.getString(0);
        }
        int j1 = s1.getResourceId(1, -1);
        String s4 = s1.getString(2);
        s1.recycle();
        if (false)
        {
            throw new NullPointerException();
        }
        if (-1 == -1 && j1 == -1 && s4 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with ").append("an id for ").append(s2).toString());
        }
        s s3;
        if (f != null)
        {
            s3 = (s)f;
        } else
        {
            s3 = b;
        }
        if (j1 != -1)
        {
            context = s3.a(j1);
        } else
        {
            context = null;
        }
        s1 = context;
        if (context == null)
        {
            s1 = context;
            if (s4 != null)
            {
                s1 = s3.a(s4);
            }
        }
        context = s1;
        if (s1 == null)
        {
            context = s1;
            if (-1 != -1)
            {
                context = s3.a(-1);
            }
        }
        if (s.a)
        {
            Log.v("ViewGroupFragmentHost", (new StringBuilder()).append("onCreateView: id=0x").append(Integer.toHexString(j1)).append(" fname=").append(s2).append(" existing=").append(context).toString());
        }
        if (context == null)
        {
            s1 = Fragment.a(a(), s2);
            s1.y = true;
            int i1;
            if (j1 != 0)
            {
                i1 = j1;
            } else
            {
                i1 = -1;
            }
            s1.G = i1;
            s1.H = -1;
            s1.I = s4;
            s1.z = true;
            s1.C = s3;
            s1.a(null, attributeset, ((Fragment) (s1)).m);
            s3.a(s1, true);
        } else
        {
            if (((Fragment) (context)).z)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(j1)).append(", tag ").append(s4).append(", or parent id 0x").append(Integer.toHexString(-1)).append(" with another fragment for ").append(s2).toString());
            }
            context.z = true;
            if (!((Fragment) (context)).M)
            {
                context.a(null, attributeset, ((Fragment) (context)).m);
            }
            s3.b(context);
            s1 = context;
        }
        if (((Fragment) (s1)).S == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(s2).append(" did not create a view.").toString());
        }
        if (j1 != 0)
        {
            ((Fragment) (s1)).S.setId(j1);
        }
        if (((Fragment) (s1)).S.getTag() == null)
        {
            ((Fragment) (s1)).S.setTag(s4);
        }
        return ((Fragment) (s1)).S;
    }

    public void p()
    {
        b.r();
    }

    public void q()
    {
        b.q();
        b.r();
        b.u();
    }

    public q r()
    {
        return b;
    }
}
