// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;

public class p extends e
{

    public p()
    {
        super("DeleteInteractionChoiceSet");
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
