// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;

final class cle
    implements cla
{

    cle()
    {
    }

    public final clb a(MediaFormat mediaformat)
    {
        b.a(mediaformat, "mediaFormat", null);
        return clc.d(mediaformat.getString("mime"));
    }
}
