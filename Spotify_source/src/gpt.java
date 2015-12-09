// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.spotify.music.spotlets.tracking.Tracking;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gpt
    implements Tracking
{

    private List a;

    public gpt(gpq gpq, gpu gpu)
    {
        a = new ArrayList();
        ctz.a(gpq);
        ctz.a(gpu);
        a.add(gpq);
        a.add(gpu);
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).a()) { }
    }

    public final void a(Application application)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).a(application)) { }
    }

    public final void a(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).a(sourcetype)) { }
    }

    public final void a(dxc dxc)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).a(dxc)) { }
    }

    public final void a(edb edb)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).a(edb)) { }
    }

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).b()) { }
    }

    public final void b(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).b(sourcetype)) { }
    }

    public final void b(dxc dxc)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).b(dxc)) { }
    }

    public final void b(edb edb)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).b(edb)) { }
    }

    public final void c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Tracking)iterator.next()).c()) { }
    }
}
