// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ebk
    implements ebi
{

    protected final eay a;
    protected final Context b;
    protected final fyx c;
    protected final ecb d;
    protected String e;
    protected boolean f;
    LinkedList g;

    public ebk(eay eay, fyx fyx, Context context, String s)
    {
        g = new LinkedList();
        f = false;
        a = eay;
        c = fyx;
        b = context;
        e = s;
        d = new ecb(b);
    }

    protected abstract MediaBrowserItem a(Object obj);

    protected abstract elg a(elb elb, String s);

    public final void a()
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((elg)iterator.next()).b()) { }
        g.clear();
        f = true;
    }

    public final void a(String s, ebg ebg, Flags flags)
    {
        if (!a(s) || f)
        {
            return;
        } else
        {
            s = Uri.parse(s).getPathSegments();
            s = (String)s.get(s.size() - 1);
            flags = new ebl(this, (byte)0);
            flags.b = a(((elb) (flags)), s);
            flags.a = ebg;
            ((ebl) (flags)).c.g.add(((ebl) (flags)).b);
            ((ebl) (flags)).b.a(0, 50);
            return;
        }
    }

    protected void a(ArrayList arraylist)
    {
    }
}
