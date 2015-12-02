// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class f
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;

    public f()
    {
    }

    static 
    {
        a = (ae)aj.b.c("voip/");
        b = (ae)a.c("audio_mode");
        c = (ae)a.c("speaker_audio_mode");
        d = (ae)a.c("volume_stream_type");
    }
}
