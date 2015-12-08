// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.libraries.wordlens:
//            WordLensSystem

class m extends Thread
{

    final WordLensSystem a;
    private Handler b;

    public m(WordLensSystem wordlenssystem)
    {
        a = wordlenssystem;
        super(com/google/android/libraries/wordlens/m.getSimpleName());
    }

    static Handler a(m m1)
    {
        return m1.b;
    }

    public void run()
    {
        Looper.prepare();
        b = new Handler(WordLensSystem.a(a));
        Looper.loop();
    }
}
