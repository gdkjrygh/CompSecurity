// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.a;

import android.speech.tts.TextToSpeech;

// Referenced classes of package com.google.android.libraries.translate.tts.a:
//            k

final class l
    implements Runnable
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final void run()
    {
        try
        {
            k.a(a).shutdown();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            return;
        }
    }
}
