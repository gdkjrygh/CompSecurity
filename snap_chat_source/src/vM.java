// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.api2.framework.HttpMethod;
import com.snapchat.android.discover.util.network.DiscoverEndpointManager;
import java.util.List;

public class vM extends oD
    implements oS.a, oS.c
{

    public int a;
    private final vJ b;
    private final DiscoverEndpointManager c;
    private final Context d;
    private boolean e;

    public vM(Context context)
    {
        this(context, DiscoverEndpointManager.a(), vJ.a(), Bm.a());
    }

    private vM(Context context, DiscoverEndpointManager discoverendpointmanager, vJ vj, Bm bm)
    {
        e = false;
        a = 0;
        e = bm.a("PROTO", "ENABLE_PROTO", false);
        if (e)
        {
            registerProtoBufCallback(this, new PU());
        } else
        {
            registerCallback(TO, this);
        }
        d = context;
        c = discoverendpointmanager;
        b = vj;
    }

    public final void a(Object obj, pi pi1)
    {
        obj = (PU)obj;
        if (pi1.c() && obj != null)
        {
            a = ((PU) (obj)).b.length;
            pi1 = b;
            Context context = d;
            ((vJ) (pi1)).e.post(pi1.a(new vJ._cls10(pi1, context, ((PU) (obj)))));
            Timber.c("ChannelListOperation", "Channel list updated with %d channels", new Object[] {
                Integer.valueOf(a)
            });
        } else
        {
            Timber.e("ChannelListOperation", "Channel list operation failed with %s", new Object[] {
                pi1
            });
        }
        a(this);
    }

    public void a(vM vm)
    {
    }

    public HttpMethod getMethod()
    {
        return HttpMethod.GET;
    }

    protected String getPath()
    {
        Bundle bundle = new Bundle();
        String s = Pj.b();
        if (!TextUtils.isEmpty(s))
        {
            bundle.putString("language", s);
        } else
        {
            Timber.e("ChannelListOperation", "Failed to get accepted language.", new Object[0]);
        }
        return Iw.a(c.b(), bundle);
    }

    public pn getRequestPayload()
    {
        return null;
    }

    public void onJsonResult(Object obj, pi pi1)
    {
        TO to = (TO)obj;
        if (pi1.c() && to != null)
        {
            int i;
            if (to == null)
            {
                obj = null;
            } else
            {
                obj = to.a();
            }
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = ((List) (obj)).size();
            }
            a = i;
            b.a(d, to);
            Timber.c("ChannelListOperation", "Channel list updated with %d channels", new Object[] {
                Integer.valueOf(a)
            });
        } else
        {
            Timber.e("ChannelListOperation", "Channel list operation failed with %s", new Object[] {
                pi1
            });
        }
        a(this);
    }

    protected boolean shouldUseProtoBuf()
    {
        return e;
    }
}
