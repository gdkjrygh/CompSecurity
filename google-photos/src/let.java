// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.MediaState;

public final class let
    implements lnx
{

    private final Status a;
    private final MediaState b;

    public let(Status status, MediaState mediastate)
    {
        a = status;
        b = mediastate;
    }

    public final Status a_()
    {
        return a;
    }

    public final MediaState b()
    {
        return b;
    }
}
