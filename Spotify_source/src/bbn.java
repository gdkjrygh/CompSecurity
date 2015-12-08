// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.UUID;

public interface bbn
{

    public abstract byte[] a(UUID uuid, android.media.MediaDrm.KeyRequest keyrequest);

    public abstract byte[] a(UUID uuid, android.media.MediaDrm.ProvisionRequest provisionrequest);
}
