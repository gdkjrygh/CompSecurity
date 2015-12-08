// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

public final class gfw extends ContentObserver
{

    public static final Uri a;
    public gfx b;
    private AudioManager c;
    private int d;

    public gfw(AudioManager audiomanager, Handler handler)
    {
        super(handler);
        c = audiomanager;
        d = c.getStreamVolume(3);
    }

    public final void onChange(boolean flag)
    {
        super.onChange(flag);
        int i = c.getStreamVolume(3);
        if (d - i != 0)
        {
            d = i;
            if (b != null)
            {
                b.a((float)i / (float)c.getStreamMaxVolume(3));
            }
        }
    }

    static 
    {
        a = android.provider.Settings.System.CONTENT_URI;
    }
}
