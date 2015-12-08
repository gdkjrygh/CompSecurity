// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.MediaState;

final class lds extends ldg
{

    private ldr a;

    lds(ldr ldr1)
    {
        a = ldr1;
        super();
    }

    public final void a(int i, MediaState mediastate)
    {
        a.a(new let(new Status(i), mediastate));
    }
}
