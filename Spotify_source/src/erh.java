// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

public final class erh
{

    Context a;
    gfw b;

    public erh(Context context, Handler handler)
    {
        a = context;
        b = new gfw(a(), handler);
    }

    final AudioManager a()
    {
        return (AudioManager)a.getApplicationContext().getSystemService("audio");
    }
}
