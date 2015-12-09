// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect.view;

import com.spotify.mobile.android.service.ConnectDevice;
import java.util.EnumSet;

public interface ConnectButtonPresenter
{

    public abstract void a(com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate, ConnectDevice connectdevice, ConnectDevice connectdevice1, EnumSet enumset);

    public abstract void a(boolean flag);

    public abstract boolean a();
}
