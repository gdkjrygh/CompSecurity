// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.IntentFilter;

// Referenced classes of package com.pandora.android.activity:
//            PandoraIntent

public class PandoraIntentFilter extends IntentFilter
{

    public PandoraIntentFilter()
    {
    }

    public void a(String s)
    {
        super.addAction(PandoraIntent.a(s));
    }
}
