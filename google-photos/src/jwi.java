// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

final class jwi
    implements jui
{

    private final Status a;
    private final String b;

    public jwi(Status status)
    {
        this(status, null, null, null, false);
    }

    public jwi(Status status, ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
    {
        a = status;
        b = s1;
    }

    public final Status a_()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }
}
