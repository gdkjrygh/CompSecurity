// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


// Referenced classes of package com.google.android.apps.translate.inputs:
//            VoiceInputPopup

final class bn
    implements Runnable
{

    final VoiceInputPopup a;

    bn(VoiceInputPopup voiceinputpopup)
    {
        a = voiceinputpopup;
        super();
    }

    public final void run()
    {
        VoiceInputPopup.f(a);
    }
}
