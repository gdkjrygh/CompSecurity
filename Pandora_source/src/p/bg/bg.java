// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;

public class bg extends e
{

    public bg()
    {
        super("SetGlobalProperties");
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("helpPrompt", vector);
            return;
        } else
        {
            b.remove("helpPrompt");
            return;
        }
    }

    public void b(Vector vector)
    {
        if (vector != null)
        {
            b.put("timeoutPrompt", vector);
            return;
        } else
        {
            b.remove("timeoutPrompt");
            return;
        }
    }
}
