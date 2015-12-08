// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.e.m;

final class ad
    implements Runnable
{

    ad()
    {
    }

    public final void run()
    {
        m.a(r.msg_no_live_translation_for_device, 1);
    }
}
