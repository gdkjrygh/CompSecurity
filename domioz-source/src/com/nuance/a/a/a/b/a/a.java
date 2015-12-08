// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.content.Context;
import android.media.AudioManager;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            l

final class a extends l
{

    private AudioManager c;

    public a(Context context)
    {
        super(context);
        c = (AudioManager)a.getSystemService("audio");
    }
}
