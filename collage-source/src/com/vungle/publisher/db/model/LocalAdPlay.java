// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdPlay

public class LocalAdPlay extends AdPlay
{
    static class Factory extends AdPlay.Factory
    {

        Provider a;
        LocalAdReportEvent.Factory b;

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new LocalAdPlay[i];
        }

        protected final bi c_()
        {
            return (LocalAdPlay)a.get();
        }

        protected final String e_()
        {
            return "ad_play";
        }

        protected Factory()
        {
        }
    }


    Factory e;
    LocalAdReportEvent.Factory f;

    protected LocalAdPlay()
    {
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return e;
    }

    protected final volatile AdReportEvent.Factory c()
    {
        return f;
    }
}
