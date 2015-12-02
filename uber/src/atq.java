// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class atq extends aad
{

    protected aaj a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;
    private final List e = new ArrayList();

    public atq(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        b = viewgroup;
        c = context;
        d = googlemapoptions;
    }

    protected final void a(aaj aaj1)
    {
        a = aaj1;
        f();
    }

    public final void a(ats ats1)
    {
        if (a() != null)
        {
            ((atp)a()).a(ats1);
            return;
        } else
        {
            e.add(ats1);
            return;
        }
    }

    public final void f()
    {
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        aul aul;
        atr.a(c);
        aul = axu.a(c).a(aai.a(c), d);
        if (aul == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new atp(b, aul));
        ats ats1;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((atp)a()).a(ats1))
        {
            ats1 = (ats)iterator.next();
        }

        try
        {
            e.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        catch (rx rx1) { }
    }
}
