// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            StreamingAdPlay

static class actory extends actory
{

    Provider a;
    actory b;

    protected final volatile Object[] b(int i)
    {
        return new Integer[i];
    }

    protected final volatile bi[] c(int i)
    {
        return new StreamingAdPlay[i];
    }

    protected final bi c_()
    {
        return (StreamingAdPlay)a.get();
    }

    protected final String e_()
    {
        return "ad_play";
    }

    protected actory()
    {
    }
}
