// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class ach
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

    private final oh a;
    private final Context b;
    private final JSONObject c;
    private final aql d;
    private final aci e;
    private final amb f;
    private final Object g = new Object();
    private final Map h = new HashMap();
    private FrameLayout i;
    private ace j;
    private boolean k;

    public ach(Context context, oh oh1, aql aql1, amb amb1, JSONObject jsonobject, aci aci1)
    {
        b = context;
        a = oh1;
        d = aql1;
        f = amb1;
        c = jsonobject;
        e = aci1;
    }

    private acj a(View view, ace ace1)
    {
        return new acj(b, this, view, ace1);
    }

    private void a(acj acj1)
    {
        synchronized (g)
        {
            if (acj1 == i)
            {
                a();
            }
        }
        return;
        acj1;
        obj;
        JVM INSTR monitorexit ;
        throw acj1;
    }

    private void a(String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("asset", s);
            jsonobject.put("template", e.j());
            s = new JSONObject();
            s.put("ad", c);
            s.put("click", jsonobject);
            d.a("google.afma.nativeAds.handleClick", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            of.b("Unable to create click JSON.", s);
        }
    }

    private ace b()
    {
        Object obj = e.k();
        if (obj == null)
        {
            return null;
        } else
        {
            obj = new ace(b, ((acd) (obj)));
            ((ace) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            ((ace) (obj)).a().setOnClickListener(this);
            return ((ace) (obj));
        }
    }

    private String b(View view)
    {
label0:
        {
            synchronized (g)
            {
                if (j == null || !j.a().equals(view))
                {
                    break label0;
                }
            }
            return "1007";
        }
        Iterator iterator = h.entrySet().iterator();
        java.util.Map.Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_111;
            }
            entry = (java.util.Map.Entry)iterator.next();
        } while (!view.equals((View)((WeakReference)entry.getValue()).get()));
        view = (String)entry.getKey();
        obj;
        JVM INSTR monitorexit ;
        return view;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    private void c()
    {
        a.i();
    }

    private void d()
    {
label0:
        {
            synchronized (g)
            {
                if (!k && i != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (i.isShown())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (i.getGlobalVisibleRect(new Rect(), null))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        k = true;
        c();
        obj;
        JVM INSTR monitorexit ;
    }

    public final View a(View view)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        View view1 = view;
        if (view instanceof acj)
        {
            view = (acj)view;
            view1 = view.b();
            view.removeView(view1);
            view.a().a(((acj) (view)));
        }
        j = b();
        view1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        i = a(view1, j);
        akf.a(i, this);
        akf.a(i, this);
        i.setOnTouchListener(this);
        view = i;
        obj;
        JVM INSTR monitorexit ;
        return view;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void a()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = h.entrySet().iterator();
_L2:
        View view;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
            view = (View)((WeakReference)((java.util.Map.Entry)iterator.next()).getValue()).get();
        } while (view == null);
        view.setOnClickListener(null);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (i != null)
        {
            i.setOnTouchListener(null);
        }
        h.clear();
        i = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(String s, View view)
    {
        synchronized (g)
        {
            h.put(s, new WeakReference(view));
            view.setOnClickListener(this);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void onClick(View view)
    {
        view = b(view);
        if (view != null)
        {
            a(view);
        }
    }

    public final void onGlobalLayout()
    {
        d();
    }

    public final void onScrollChanged()
    {
        d();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        f.a(motionevent);
        return true;
    }
}
