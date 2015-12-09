// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

public class ffm
    implements dmx
{

    public ffm()
    {
    }

    public static ffl a(Context context)
    {
        return new ffl(new ffk(new ffj(context, new MediaPlayer(), (AudioManager)context.getSystemService("audio"))));
    }
}
