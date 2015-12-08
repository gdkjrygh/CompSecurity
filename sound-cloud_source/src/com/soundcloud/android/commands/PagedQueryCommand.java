// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.commands:
//            LegacyCommand

public abstract class PagedQueryCommand extends LegacyCommand
{
    public static class PageParams
    {

        private final int limit;

        public int getLimit()
        {
            return limit;
        }

        public PageParams(int i)
        {
            limit = i;
        }
    }


    private final PropellerDatabase database;
    private final RxResultMapper mapper;

    public PagedQueryCommand(PropellerDatabase propellerdatabase, RxResultMapper rxresultmapper)
    {
        mapper = rxresultmapper;
        database = propellerdatabase;
    }

    private Query buildPagedQuery(PageParams pageparams)
    {
        Query query1 = buildQuery(pageparams);
        Query query = query1;
        if (pageparams != null)
        {
            query = query1.limit(pageparams.getLimit());
        }
        return query;
    }

    protected abstract Query buildQuery(PageParams pageparams);

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        return database.query(buildPagedQuery((PageParams)input)).toList(mapper);
    }

    public b toObservable()
    {
        return super.toObservable().subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER);
    }
}
