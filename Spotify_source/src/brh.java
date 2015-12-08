// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

public abstract class brh
    implements bri
{

    public final DataHolder a;

    protected brh(DataHolder dataholder)
    {
        a = dataholder;
        if (a != null)
        {
            a.h = this;
        }
    }

    public final void a()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public int b()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.g;
        }
    }

    public Iterator iterator()
    {
        return new brk(this);
    }
}
