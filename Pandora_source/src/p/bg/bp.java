// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;

public class bp extends e
{

    public bp()
    {
        super("Speak");
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("ttsChunks", vector);
            return;
        } else
        {
            b.remove("ttsChunks");
            return;
        }
    }
}
