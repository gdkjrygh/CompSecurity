// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.spotify.android.paste.widget.StickyRecyclerView;
import java.util.Iterator;
import java.util.List;

public final class dgx extends abf
    implements Runnable
{

    List a;
    private StickyRecyclerView b;

    private dgx(StickyRecyclerView stickyrecyclerview)
    {
        b = stickyrecyclerview;
        super();
    }

    public dgx(StickyRecyclerView stickyrecyclerview, byte byte0)
    {
        this(stickyrecyclerview);
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (!StickyRecyclerView.a(b)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        StickyRecyclerView.b(b);
        if (a != null)
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((abf)iterator.next()).a(recyclerview, i);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        if (!StickyRecyclerView.a(b)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        StickyRecyclerView.b(b);
        if (a != null)
        {
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((abf)iterator.next()).a(recyclerview, i, j);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void run()
    {
        if (StickyRecyclerView.a(b))
        {
            return;
        } else
        {
            StickyRecyclerView.b(b);
            return;
        }
    }
}
