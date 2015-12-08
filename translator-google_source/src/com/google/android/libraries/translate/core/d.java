// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.tts.MyTts;

// Referenced classes of package com.google.android.libraries.translate.core:
//            k, Singleton

final class d extends k
{

    d()
    {
    }

    protected final Object a()
    {
        return new MyTts(Singleton.a());
    }
}
