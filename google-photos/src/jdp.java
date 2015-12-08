// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;

final class jdp
    implements android.media.AudioManager.OnAudioFocusChangeListener, omb, opv
{

    private Context a;
    private jes b;
    private boolean c;

    jdp(opd opd1)
    {
        opd1.a(this);
    }

    private jej c()
    {
        return b.b();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = (jes)olm1.a(jes);
    }

    public final boolean a()
    {
        return ((AudioManager)a.getApplicationContext().getSystemService("audio")).requestAudioFocus(this, 3, 1) == 1;
    }

    public final boolean b()
    {
        return ((AudioManager)a.getApplicationContext().getSystemService("audio")).abandonAudioFocus(this) == 1;
    }

    public final void onAudioFocusChange(int i)
    {
        i;
        JVM INSTR tableswitch -3 3: default 44
    //                   -3 60
    //                   -2 45
    //                   -1 45
    //                   0 44
    //                   1 73
    //                   2 73
    //                   3 73;
           goto _L1 _L2 _L3 _L3 _L1 _L4 _L4 _L4
_L1:
        return;
_L3:
        c = true;
        c().c();
        return;
_L2:
        c().a(jfw.b);
        return;
_L4:
        c().a(jfw.a);
        if (c)
        {
            c().b();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
