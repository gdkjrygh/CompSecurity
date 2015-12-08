// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.e;

public class n extends e
{

    public n()
    {
        super("DeleteFile");
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
}
