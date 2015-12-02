// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class atx extends aad
{

    protected aaj a;
    private final ViewGroup b;
    private final Context c;
    private final StreetViewPanoramaOptions d = null;
    private final List e = new ArrayList();

    public atx(ViewGroup viewgroup, Context context)
    {
        b = viewgroup;
        c = context;
    }

    private void f()
    {
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            aux aux = axu.a(c).a(aai.a(c), d);
            a.a(new atw(b, aux));
            att att1;
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((atw)a()).a(att1))
            {
                att1 = (att)iterator.next();
            }

        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        catch (rx rx1)
        {
            return;
        }
        e.clear();
    }

    protected final void a(aaj aaj1)
    {
        a = aaj1;
        f();
    }
}
