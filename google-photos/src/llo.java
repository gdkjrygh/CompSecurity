// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.nearby.sharing.internal.ProvideContentRequest;
import com.google.android.gms.nearby.sharing.internal.ReceiveContentRequest;
import com.google.android.gms.nearby.sharing.internal.StopProvidingContentRequest;
import com.google.android.gms.nearby.sharing.internal.TrustedDevicesRequest;

public interface llo
    extends IInterface
{

    public abstract void a(ProvideContentRequest providecontentrequest);

    public abstract void a(ReceiveContentRequest receivecontentrequest);

    public abstract void a(StopProvidingContentRequest stopprovidingcontentrequest);

    public abstract void a(TrustedDevicesRequest trusteddevicesrequest);

    public abstract void a(lll lll);
}
