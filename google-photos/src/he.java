// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class he
    implements hd, mau
{

    private final Object a;
    private final hq b;

    public he()
    {
    }

    public he(Context context, String s)
    {
        a = new MediaSession(context, s);
        b = new hq(((MediaSession)a).getSessionToken());
    }

    public lzx a(jyw jyw)
    {
        return new mgs((lmi)jyw);
    }

    public final void a()
    {
        ((MediaSession)a).release();
    }

    public final void a(int i)
    {
        ((MediaSession)a).setFlags(i);
    }

    public final void a(PendingIntent pendingintent)
    {
        ((MediaSession)a).setMediaButtonReceiver(pendingintent);
    }

    public final void a(ha ha1, Handler handler)
    {
        Object obj = a;
        ha1 = ((ha) (ha1.a));
        ((MediaSession)obj).setCallback((android.media.session.MediaSession.Callback)ha1, handler);
    }

    public final void a(ib ib1)
    {
        Object obj1 = a;
        if (ib1.k != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            ib1 = ((ib) (ib1.k));
        } else
        {
            Object obj = null;
            if (ib1.h != null)
            {
                ArrayList arraylist = new ArrayList(ib1.h.size());
                Iterator iterator = ib1.h.iterator();
                do
                {
                    obj = arraylist;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    obj = (ie)iterator.next();
                    if (((ie) (obj)).e != null || android.os.Build.VERSION.SDK_INT < 21)
                    {
                        obj = ((ie) (obj)).e;
                    } else
                    {
                        Object obj2 = ((ie) (obj)).a;
                        CharSequence charsequence = ((ie) (obj)).b;
                        int i = ((ie) (obj)).c;
                        android.os.Bundle bundle = ((ie) (obj)).d;
                        obj2 = new android.media.session.PlaybackState.CustomAction.Builder(((String) (obj2)), charsequence, i);
                        ((android.media.session.PlaybackState.CustomAction.Builder) (obj2)).setExtras(bundle);
                        obj.e = ((android.media.session.PlaybackState.CustomAction.Builder) (obj2)).build();
                        obj = ((ie) (obj)).e;
                    }
                    arraylist.add(obj);
                } while (true);
            }
            if (android.os.Build.VERSION.SDK_INT >= 22)
            {
                ib1.k = c.a(ib1.a, ib1.b, ib1.c, ib1.d, ib1.e, ib1.f, ib1.g, ((List) (obj)), ib1.i, ib1.j);
            } else
            {
                ib1.k = b.a(ib1.a, ib1.b, ib1.c, ib1.d, ib1.e, ib1.f, ib1.g, ((List) (obj)), ib1.i);
            }
            ib1 = ((ib) (ib1.k));
        }
        ((MediaSession)obj1).setPlaybackState((PlaybackState)ib1);
    }

    public final void a(boolean flag)
    {
        ((MediaSession)a).setActive(flag);
    }

    public final hq b()
    {
        return b;
    }
}
