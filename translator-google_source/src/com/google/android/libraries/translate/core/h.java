// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.speech.a;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.libraries.translate.core:
//            k, Singleton

final class h extends k
{

    h()
    {
    }

    protected final Object a()
    {
        return new a(com.google.android.libraries.translate.core.Singleton.a(), Executors.newSingleThreadScheduledExecutor());
    }
}
