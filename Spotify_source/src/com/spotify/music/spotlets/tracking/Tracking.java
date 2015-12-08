// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tracking;

import android.app.Application;
import dmx;
import dxc;
import edb;

public interface Tracking
    extends dmx
{

    public abstract void a();

    public abstract void a(Application application);

    public abstract void a(SourceType sourcetype);

    public abstract void a(dxc dxc);

    public abstract void a(edb edb);

    public abstract void b();

    public abstract void b(SourceType sourcetype);

    public abstract void b(dxc dxc);

    public abstract void b(edb edb);

    public abstract void c();
}
