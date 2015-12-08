// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class cqh extends brn
    implements brc
{

    private final Status b;

    public cqh(DataHolder dataholder)
    {
        super(dataholder);
        b = new Status(dataholder.e);
    }

    protected final Object a(int i, int j)
    {
        return new cti(a, i, j);
    }

    public final Status c()
    {
        return b;
    }

    protected final String d()
    {
        return "path";
    }
}
