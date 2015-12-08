// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

public final class i extends e
{

    public i()
    {
        super("CreateInteractionChoiceSet");
    }

    public final void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("choiceSet", vector);
        }
    }

    public final void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("interactionChoiceSetID", integer);
        }
    }
}
