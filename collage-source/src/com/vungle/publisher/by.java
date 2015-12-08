// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.log.Logger;
import com.vungle.publisher.event.EventBus;

// Referenced classes of package com.vungle.publisher:
//            ca, dj

public class by
    implements ca
{

    private boolean a;
    public EventBus h;

    public by()
    {
    }

    public void register()
    {
        if (a)
        {
            Logger.w("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" already listening").toString());
            return;
        } else
        {
            Logger.d("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" listening").toString());
            h.b(this);
            a = true;
            return;
        }
    }

    public void registerOnce()
    {
        if (a)
        {
            Logger.v("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" already listening").toString());
            return;
        } else
        {
            Logger.d("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" listening").toString());
            h.b(this);
            a = true;
            return;
        }
    }

    public void registerSticky()
    {
        if (a)
        {
            Logger.w("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" already listening sticky").toString());
            return;
        } else
        {
            Logger.d("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" listening sticky").toString());
            h.a.a(this, "onEvent", true);
            a = true;
            return;
        }
    }

    public void unregister()
    {
        Logger.d("VungleEvent", (new StringBuilder()).append(getClass().getName()).append(" unregistered").toString());
        h.a.a(this);
        a = false;
    }
}
