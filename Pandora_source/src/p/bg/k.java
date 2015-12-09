// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;

public class k extends e
{

    public k()
    {
        super("CreateInteractionChoiceSet");
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("choiceSet", vector);
            return;
        } else
        {
            b.remove("choiceSet");
            return;
        }
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("interactionChoiceSetID", integer);
            return;
        } else
        {
            b.remove("interactionChoiceSetID");
            return;
        }
    }
}
