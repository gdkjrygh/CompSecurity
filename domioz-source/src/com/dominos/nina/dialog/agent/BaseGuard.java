// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.dominos.nina.dialog.BaseConcept;
import com.dominos.nina.speech.SpeechContext;
import com.nuance.b.a.ad;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class BaseGuard extends BaseAgent
{

    public BaseGuard(String s, BaseConcept baseconcept)
    {
        super(s, baseconcept);
        setCorrectionMode(ad.a);
    }

    public BaseGuard(String s, String s1)
    {
        this(s, new BaseConcept(s1));
    }

    public void agentFocusIn(SpeechContext speechcontext)
    {
    }
}
