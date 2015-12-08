// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.content.Intent;
import p.df.a;

// Referenced classes of package com.pandora.android.eureka.dialog:
//            f

class a extends android.support.v7.media.alog.f._cls1
{

    final f a;

    public void a()
    {
    }

    public void a(int i)
    {
    }

    public boolean a(Intent intent, android.support.v7.media..f._cls1 _pcls1)
    {
        if (intent.hasCategory("android.media.intent.category.REMOTE_PLAYBACK"))
        {
            intent = intent.getAction();
            break MISSING_BLOCK_LABEL_14;
        }
        do
        {
            return false;
        } while (intent.equals("android.media.intent.action.PLAY") || !intent.equals("android.media.intent.action.PAUSE"));
        return false;
    }

    public void b()
    {
        p.df.a.c("PandoraMediaRouteProvider", "onSelect");
    }

    public void b(int i)
    {
    }

    public void c()
    {
        p.df.a.c("PandoraMediaRouteProvider", "onUnselect");
    }

    (f f1)
    {
        a = f1;
        super();
    }
}
