// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

public class grr
    implements ixf, nug, omb, opl, opp, opr, ops, opv
{

    private grg a;
    private ixe b;
    private ekp c;
    private mwx d;
    private mwz e;
    private noz f;

    public grr(opd opd1)
    {
        opd1.a(this);
    }

    static grg a(grr grr1)
    {
        return grr1.a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (grg)olm1.a(grg);
        b = (ixe)olm1.a(ixe);
        d = (mwx)olm1.a(mwx);
        f = noz.a(context, 3, "PendingMedia", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        while (bundle == null || !bundle.containsKey("com.google.android.apps.photos.pager.undo_pending_media")) 
        {
            return;
        }
        c = (ekp)bundle.getParcelable("com.google.android.apps.photos.pager.undo_pending_media");
    }

    public void a(ekp ekp1)
    {
        if (f.a())
        {
            noy.a("from", c);
            noy.a("to", ekp1);
        }
        c = ekp1;
        d.a(e);
    }

    public final void a(Collection collection)
    {
    }

    public final void a(Collection collection, boolean flag)
    {
        a(((ekp) (null)));
    }

    public final void al_()
    {
        a.a.a(this, true);
        b.a(this);
    }

    public final void am_()
    {
        a.a.a(this);
        b.b(this);
    }

    public final void b(Collection collection)
    {
    }

    public final void b_(Object obj)
    {
label0:
        {
            obj = (grg)obj;
            if (c != null)
            {
                if (!c.c(((grg) (obj)).h, c))
                {
                    break label0;
                }
                a(((ekp) (null)));
            }
            return;
        }
        d.a(e);
        e = d.a(new grs(this, c));
        c = null;
    }

    public final void c(Collection collection)
    {
        boolean flag = true;
        if (collection.size() != 1)
        {
            flag = false;
        }
        p.a(flag, "Don't allow bulk trash for pager.");
        a((ekp)collection.iterator().next());
    }

    public final void e(Bundle bundle)
    {
        if (c != null)
        {
            bundle.putParcelable("com.google.android.apps.photos.pager.undo_pending_media", c);
        }
    }
}
