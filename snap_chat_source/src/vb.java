// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.MediaState;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class vb
{

    public final vJ a;
    public final Map b;
    public final Object c;
    private final vx d;

    public vb()
    {
        this(vJ.a(), vx.a());
    }

    private vb(vJ vj, vx vx1)
    {
        b = new ConcurrentHashMap();
        c = new Object();
        d = vx1;
        a = vj;
    }

    public final void a(DSnapPage dsnappage, MediaState mediastate)
    {
        vJ vj = a;
        vj.e.postAtFrontOfQueue(vj.a(new vJ._cls15(vj, dsnappage, mediastate)));
    }

    public final boolean a(DSnapPage dsnappage)
    {
label0:
        {
            synchronized (c)
            {
                if (!b.containsKey(dsnappage.a))
                {
                    break label0;
                }
                Timber.d("DSnapAdResolver", "DISCOVER-MEDIA: Skipping resolve for ad %s since there is a pending request for it.", new Object[] {
                    dsnappage
                });
            }
            return false;
        }
        Timber.c("DSnapAdResolver", "DISCOVER-MEDIA: Requesting resolve for ad %s", new Object[] {
            dsnappage
        });
        Object obj1 = new kR.a();
        obj1.mAdType = dsnappage.m.intValue();
        obj1.mChannelName = dsnappage.j;
        obj1.mEditionName = dsnappage.i;
        obj1.mPosition = dsnappage.g;
        obj1.mAdUnitId = dsnappage.p;
        obj1.mTargetingParams = dsnappage.q;
        obj1 = ((kR.a) (obj1)).a();
        uX ux = new uX(dsnappage, this);
        dsnappage.s = null;
        obj1 = new uW(((kR) (obj1)), ux);
        b.put(dsnappage.a, obj1);
        d.b(dsnappage, MediaState.RESOLVING_AD);
        ((uW) (obj1)).a();
        obj;
        JVM INSTR monitorexit ;
        return true;
        dsnappage;
        obj;
        JVM INSTR monitorexit ;
        throw dsnappage;
    }
}
