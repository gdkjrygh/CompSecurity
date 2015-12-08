// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.view.View;

public class ac
    implements bv, cla
{

    private am a;

    public ac()
    {
    }

    ac(ab ab, am am1)
    {
        a = am1;
        super();
    }

    public final View a()
    {
        return a.R;
    }

    public clb a(MediaFormat mediaformat)
    {
        b.a(mediaformat, "mediaFormat", null);
        return clc.c(mediaformat.getString("mime"));
    }
}
