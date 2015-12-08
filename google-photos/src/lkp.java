// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

public interface lkp
    extends IInterface
{

    public abstract void a(GetPermissionStatusRequest getpermissionstatusrequest);

    public abstract void a(PublishRequest publishrequest);

    public abstract void a(SubscribeRequest subscriberequest);

    public abstract void a(UnpublishRequest unpublishrequest);

    public abstract void a(UnsubscribeRequest unsubscriberequest);

    public abstract void a(String s);
}
