// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.widget.Toast;
import com.arist.activity.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService

final class i
    implements Runnable
{

    final MusicPlayService a;
    private final int b;

    i(MusicPlayService musicplayservice, int j)
    {
        a = musicplayservice;
        b = j;
        super();
    }

    public final void run()
    {
        Toast.makeText(MyApplication.q, a.getString(b), 0).show();
    }
}
