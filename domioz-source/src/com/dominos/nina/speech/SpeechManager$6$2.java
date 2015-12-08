// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.n;
import com.nuance.b.b.a.o;
import com.nuance.b.e.c;

class this._cls1
    implements o
{

    final this._cls1 this$1;

    public void onEndOfSpeech(n n)
    {
    }

    public void onStartOfSpeech(ap ap)
    {
        c.a("I only heard noise. Tap to wake me up.");
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
