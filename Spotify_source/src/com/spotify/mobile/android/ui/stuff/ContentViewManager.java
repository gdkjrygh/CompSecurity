// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import dff;
import gab;
import gac;
import gao;
import geh;
import ggi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public final class ContentViewManager
{

    public final Map a;
    public boolean b;
    private final PriorityQueue c;
    private final EmptyView d;
    private final View e;
    private final Context f;
    private final gab g;
    private LoadingView h;
    private gac i;

    private ContentViewManager(Context context, EmptyView emptyview, View view, gab gab1)
    {
        a = new HashMap(ContentState.values().length);
        c = new PriorityQueue(ContentState.values().length, new StateDateComparator((byte)0));
        f = context;
        d = emptyview;
        e = view;
        g = gab1;
        d.setVisibility(8);
        e.setVisibility(8);
    }

    public ContentViewManager(Context context, EmptyView emptyview, View view, gab gab1, byte byte0)
    {
        this(context, emptyview, view, gab1);
    }

    private void a()
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        d.setVisibility(8);
        e.setVisibility(0);
_L4:
        if (h != null)
        {
            if (h.d())
            {
                View view = b();
                if (view != null)
                {
                    view.setVisibility(8);
                    h.a = new gao(h.getContext(), view);
                }
                h.b = view;
                h.b();
            }
            h = null;
        }
        return;
_L2:
        Drawable drawable;
        EmptyView emptyview;
        emptyview = d;
        if (!ggi.b(f) || !b)
        {
            break; /* Loop/switch isn't completed */
        }
        drawable = null;
_L5:
        emptyview.a(drawable);
        d.a(f.getText(i.b));
        d.b(f.getText(i.c));
        d.setVisibility(0);
        e.setVisibility(8);
        if (g != null)
        {
            g.a(d, i.a);
        }
        if (true) goto _L4; else goto _L3
_L3:
        gac gac1 = i;
        Context context = f;
        Drawable drawable1 = (Drawable)gac1.e.get();
        drawable = drawable1;
        if (drawable1 == null)
        {
            drawable = dff.a(context, gac1.d, (0.0F / 0.0F), true, true);
            gac1.e = new WeakReference(drawable);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void a(ContentState contentstate, boolean flag)
    {
        geh.b();
        if (a.containsKey(contentstate)) goto _L2; else goto _L1
_L1:
        Assertion.b(String.format("You can not set to a state(%s). Set the state among configured(%s)", new Object[] {
            contentstate.name(), a.keySet().toString()
        }));
_L4:
        return;
_L2:
        if (flag)
        {
            if (c(contentstate) == null)
            {
                c.add(a.get(contentstate));
            }
            if (c() == contentstate)
            {
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            gac gac1 = c(contentstate);
            if (gac1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            c.remove(gac1);
            if (c() != contentstate)
            {
                return;
            }
        }
        i = (gac)c.peek();
        a();
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private View b()
    {
        if (d.getVisibility() == 0)
        {
            return d;
        }
        if (e.getVisibility() == 0)
        {
            return e;
        } else
        {
            return null;
        }
    }

    private ContentState c()
    {
        if (i == null)
        {
            return null;
        } else
        {
            return i.a;
        }
    }

    private gac c(ContentState contentstate)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            gac gac1 = (gac)iterator.next();
            if (gac1.a == contentstate)
            {
                return gac1;
            }
        }

        return null;
    }

    public final void a(LoadingView loadingview)
    {
        geh.b();
        h = loadingview;
        h.c();
        h.b = b();
        h.a();
    }

    public final void a(boolean flag)
    {
        a(ContentState.a, flag);
    }

    public final boolean a(ContentState contentstate)
    {
        return a.containsKey(contentstate);
    }

    public final void b(ContentState contentstate)
    {
        geh.b();
        c.clear();
        if (contentstate != null)
        {
            a(contentstate, true);
            return;
        } else
        {
            i = null;
            a();
            return;
        }
    }

    public final void b(boolean flag)
    {
        a(ContentState.c, flag);
    }

    public final void c(boolean flag)
    {
        a(ContentState.b, flag);
    }

    public final void d(boolean flag)
    {
        a(ContentState.d, flag);
    }

    private class ContentState extends Enum
    {

        public static final ContentState a;
        public static final ContentState b;
        public static final ContentState c;
        public static final ContentState d;
        private static final ContentState e[];
        public final int mPriority;

        public static ContentState valueOf(String s)
        {
            return (ContentState)Enum.valueOf(com/spotify/mobile/android/ui/stuff/ContentViewManager$ContentState, s);
        }

        public static ContentState[] values()
        {
            return (ContentState[])e.clone();
        }

        static 
        {
            a = new ContentState("NO_NETWORK", 0, 0x7fffffff);
            b = new ContentState("SERVICE_ERROR", 1, 0x7ffffffe);
            c = new ContentState("SERVICE_WARNING", 2, 0x7ffffffd);
            d = new ContentState("EMPTY_CONTENT", 3, 0x7ffffffc);
            e = (new ContentState[] {
                a, b, c, d
            });
        }

        private ContentState(String s, int j, int k)
        {
            super(s, j);
            mPriority = k;
        }
    }


    private class StateDateComparator
        implements Serializable, Comparator
    {

        private static final long serialVersionUID = 0xcb186378fe5402f3L;

        public volatile int compare(Object obj, Object obj1)
        {
            obj = (gac)obj;
            return ((gac)obj1).a.mPriority - ((gac) (obj)).a.mPriority;
        }

        private StateDateComparator()
        {
        }

        StateDateComparator(byte byte0)
        {
            this();
        }
    }

}
