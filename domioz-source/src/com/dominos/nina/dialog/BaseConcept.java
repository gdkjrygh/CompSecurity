// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog;

import com.dominos.nina.dialog.agent.BaseAgent;
import com.nuance.b.a.ai;
import com.nuance.b.a.r;
import com.nuance.b.a.s;

public class BaseConcept extends r
{

    protected BaseAgent agent;
    protected boolean has_meaning_grounder;

    public BaseConcept(String s1)
    {
        this(s1, s.a, null);
    }

    public BaseConcept(String s1, s s2)
    {
        this(s1, s2, null);
    }

    public BaseConcept(String s1, s s2, String s3)
    {
        super(s1, s2, s3);
        agent = null;
        has_meaning_grounder = false;
    }

    public BaseAgent agent()
    {
        return agent;
    }

    public void attachToAgent(BaseAgent baseagent)
    {
        agent = baseagent;
    }

    public boolean isGroundable()
    {
        return has_meaning_grounder;
    }

    public void setMeaningGrounder(ai ai)
    {
        super.setMeaningGrounder(ai);
        has_meaning_grounder = true;
    }
}
