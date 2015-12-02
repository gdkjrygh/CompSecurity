// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import com.facebook.common.executors.a;

// Referenced classes of package com.facebook.orca.d:
//            af, ag

class ap
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    final af a;

    private ap(af af1)
    {
        a = af1;
        super();
    }

    ap(af af1, ag ag)
    {
        this(af1);
    }

    public void onAudioFocusChange(int i)
    {
        com.facebook.orca.d.af.a(a).a();
        switch (i)
        {
        case -3: 
        case -2: 
        case 0: // '\0'
        case 1: // '\001'
        default:
            return;

        case -1: 
            com.facebook.orca.d.af.a(a, null);
            break;
        }
    }
}
