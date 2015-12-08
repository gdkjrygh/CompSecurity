// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.utils.i;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

class a extends HashMap
{

    final ManagerLiveRail a;

    (ManagerLiveRail managerliverail)
    {
        a = managerliverail;
        super();
        put("Magic Pixel URL", a.m);
        put("Campaign ID", a.b);
        put("Creative ID", a.c);
        put("Provider ID", a.d);
        put("Title", a.e);
        put("Subtitle", a.g);
        put("Clickthrough URL", a.f);
        put("Action button title", a.h);
        put("Video URL", a.i);
        put("Share text", a.j);
        put("Share URL", a.k);
        put("Partner logo URL", a.l);
        put("Callbacks for initialization", String.valueOf(a.q.a.size()));
        put("Callbacks for failure", String.valueOf(a.r.a.size()));
    }
}
