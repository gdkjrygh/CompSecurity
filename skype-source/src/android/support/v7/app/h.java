// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            g, d

class h extends g
{
    class a extends f.b
    {

        final h b;

        final ActionMode a(android.view.ActionMode.Callback callback)
        {
            callback = new android.support.v7.internal.view.d.a(b.a, callback);
            android.support.v7.view.a a1 = b.a(callback);
            if (a1 != null)
            {
                return callback.b(a1);
            } else
            {
                return null;
            }
        }

        public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
        {
            if (b.m())
            {
                return a(callback);
            } else
            {
                return super.onWindowStartingActionMode(callback);
            }
        }

        a(android.view.Window.Callback callback)
        {
            b = h.this;
            super(h.this, callback);
        }
    }


    private boolean r;

    h(Context context, Window window, d d)
    {
        super(context, window, d);
        r = true;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new a(callback);
    }

    public final boolean m()
    {
        return r;
    }
}
