// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge;

import android.view.Display;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.javabridge:
//            NrdProxy

public interface Bridge
{

    public abstract int getBitrateCap();

    public abstract int getConfigVideoBufferSize();

    public abstract PlayerType getCurrentPlayerType();

    public abstract DeviceCategory getDeviceCategory();

    public abstract Locale getDeviceLocale();

    public abstract Display getDisplaySize();

    public abstract EsnProvider getEsnProvider();

    public abstract String getFileSystemRoot();

    public abstract String getInstallationSource();

    public abstract IpConnectivityPolicy getIpConnectivityPolicy();

    public abstract NrdProxy getNrdProxy();

    public abstract Nrdp getNrdp();

    public abstract String getSoftwareVersion();

    public abstract boolean isDeviceLowMem();
}
