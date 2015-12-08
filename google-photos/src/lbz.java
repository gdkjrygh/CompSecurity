// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

public interface lbz
    extends IInterface
{

    public abstract String a();

    public abstract void a(ConnectRequest connectrequest);

    public abstract void a(ContinueConnectRequest continueconnectrequest);

    public abstract void a(DisableTargetRequest disabletargetrequest);

    public abstract void a(DisconnectRequest disconnectrequest);

    public abstract void a(EnableTargetRequest enabletargetrequest);

    public abstract void a(SendDataRequest senddatarequest);

    public abstract void a(StartScanRequest startscanrequest);

    public abstract void a(StopScanRequest stopscanrequest);

    public abstract void a(lbw lbw);
}
