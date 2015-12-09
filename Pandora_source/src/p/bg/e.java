// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;

public class e extends p.bd.e
{

    public e()
    {
        super("Alert");
    }

    public void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("playTone", boolean1);
            return;
        } else
        {
            b.remove("playTone");
            return;
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("alertText1", s);
            return;
        } else
        {
            b.remove("alertText1");
            return;
        }
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

    public void b(Integer integer)
    {
        if (integer != null)
        {
            b.put("duration", integer);
            return;
        } else
        {
            b.remove("duration");
            return;
        }
    }

    public void b(String s)
    {
        if (s != null)
        {
            b.put("alertText2", s);
            return;
        } else
        {
            b.remove("alertText2");
            return;
        }
    }

    public void b(Vector vector)
    {
        if (vector != null)
        {
            b.put("softButtons", vector);
            return;
        } else
        {
            b.remove("softButtons");
            return;
        }
    }
}
