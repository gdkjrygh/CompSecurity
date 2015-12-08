// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            StreamingAdReport

public static class  extends 
{

    e b;
    e d;
    Provider e;

    public final volatile int a(List list)
    {
        return super.(list);
    }

    protected final volatile  a()
    {
        return d;
    }

    protected final volatile d b()
    {
        return b;
    }

    protected final volatile Object[] b(int i)
    {
        return new Integer[i];
    }

    protected final b c()
    {
        return b;
    }

    protected final volatile bi[] c(int i)
    {
        return new StreamingAdReport[i];
    }

    protected final bi c_()
    {
        return (StreamingAdReport)e.get();
    }

    public final volatile List d()
    {
        return super.e();
    }

    public final volatile List d(int i)
    {
        return super.e(i);
    }

    protected final String e_()
    {
        return "ad_report";
    }

    protected ()
    {
    }
}
