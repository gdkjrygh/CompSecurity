// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;
import p.bh.z;

// Referenced classes of package p.bg:
//            z

public class bk extends e
{

    public bk()
    {
        super("Show");
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("mainField1", s);
            return;
        } else
        {
            b.remove("mainField1");
            return;
        }
    }

    public void a(Vector vector)
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

    public void a(p.bg.z z)
    {
        if (z != null)
        {
            b.put("graphic", z);
            return;
        } else
        {
            b.remove("graphic");
            return;
        }
    }

    public void a(z z)
    {
        if (z != null)
        {
            b.put("alignment", z);
            return;
        } else
        {
            b.remove("alignment");
            return;
        }
    }

    public void b(String s)
    {
        if (s != null)
        {
            b.put("mainField2", s);
            return;
        } else
        {
            b.remove("mainField2");
            return;
        }
    }

    public void b(Vector vector)
    {
        if (vector != null)
        {
            b.put("customPresets", vector);
            return;
        } else
        {
            b.remove("customPresets");
            return;
        }
    }

    public void c(String s)
    {
        if (s != null)
        {
            b.put("mainField3", s);
            return;
        } else
        {
            b.remove("mainField3");
            return;
        }
    }

    public void d(String s)
    {
        if (s != null)
        {
            b.put("mediaTrack", s);
            return;
        } else
        {
            b.remove("mediaTrack");
            return;
        }
    }
}
