// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;
import p.bh.h;

public class aw extends e
{

    public aw()
    {
        super("PutFile");
    }

    public void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("persistentFile", boolean1);
            return;
        } else
        {
            b.remove("persistentFile");
            return;
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("syncFileName", s);
            return;
        } else
        {
            b.remove("syncFileName");
            return;
        }
    }

    public void a(h h)
    {
        if (h != null)
        {
            b.put("fileType", h);
            return;
        } else
        {
            b.remove("fileType");
            return;
        }
    }
}
