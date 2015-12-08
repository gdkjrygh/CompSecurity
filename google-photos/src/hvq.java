// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

final class hvq
    implements mti, omb, opl, ops, opv
{

    boolean a;
    long b;
    Queue c;
    private final Set d = new HashSet();
    private noz e;
    private mtj f;
    private Context g;
    private ekq h;

    hvq(opd opd1, ekq ekq1)
    {
        h = ekq1;
        opd1.a(this);
    }

    public final hvq a(hvs hvs1)
    {
        d.add(hvs1);
        return this;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        p.a(h);
        if (!a && !c.isEmpty())
        {
            hwb hwb1 = new hwb(h, (String)c.remove());
            f.a(hwb1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        f = ((mtj)olm1.a(mtj)).a(this);
    }

    public final void a(Bundle bundle)
    {
        e = noz.a(g, 3, "Search", new String[0]);
        if (bundle != null)
        {
            c = new LinkedList(bundle.getStringArrayList("resumeTokenList"));
            a = bundle.getBoolean("searchCompletionState");
            b = bundle.getLong("resultItemsSoFar");
            return;
        } else
        {
            c = new LinkedList(Collections.singletonList(null));
            a = false;
            b = 0L;
            return;
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"SearchResultsTask".equals(s) || mue1 == null) goto _L2; else goto _L1
_L1:
        s = (ekq)mue1.a().getParcelable("searchQuery");
        if (h.equals(s)) goto _L3; else goto _L2
_L2:
        return;
_L3:
        if (mue1.c())
        {
            if (e.a())
            {
                b.a(h);
            }
            c.add(mue1.a().getString("failedResumeToken"));
            a();
            return;
        }
        b = mue1.a().getLong("resultItemsSoFar");
        s = mue1.a().getString("resumeToken");
        if (TextUtils.isEmpty(s))
        {
            if (e.a())
            {
                b.a(h);
            }
            a = true;
            c.clear();
        } else
        {
            if (e.a())
            {
                b.a(h);
            }
            c.add(s);
        }
        for (s = d.iterator(); s.hasNext(); ((hvs)s.next()).b()) { }
        if (a)
        {
            s = d.iterator();
            while (s.hasNext()) 
            {
                ((hvs)s.next()).c();
            }
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("searchQuery", h);
        bundle.putStringArrayList("resumeTokenList", new ArrayList(c));
        bundle.putBoolean("searchCompletionState", a);
        bundle.putLong("resultItemsSoFar", b);
    }
}
