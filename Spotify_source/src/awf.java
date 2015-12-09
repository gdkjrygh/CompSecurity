// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.TextAlignment;
import java.util.Hashtable;

public final class awf extends atk
{

    public awf()
    {
        super("Show");
    }

    public final void a(TextAlignment textalignment)
    {
        if (textalignment != null)
        {
            b.put("alignment", textalignment);
            return;
        } else
        {
            b.remove("alignment");
            return;
        }
    }

    public final void a(String s)
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

    public final void b(String s)
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
}
