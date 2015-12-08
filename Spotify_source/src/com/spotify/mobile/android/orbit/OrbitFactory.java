// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.app.Service;
import dmx;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitServiceInterface

public interface OrbitFactory
    extends dmx
{

    public abstract OrbitServiceInterface createService(Service service, int i, String s);
}
