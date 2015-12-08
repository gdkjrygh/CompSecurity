// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

public final class mR extends oD
{

    public static final int BATCH_SIZE = 20;
    public static Map sPendingStoryViewRecords = new HashMap();
    private List mStoryViewRecordList;
    private final Provider mUserProvider;

    public mR()
    {
        this(Br.UNSAFE_USER_PROVIDER);
    }

    private mR(Provider provider)
    {
        mUserProvider = provider;
        provider = (Br)mUserProvider.get();
        if (provider != null)
        {
            provider = provider.c().entrySet().iterator();
            while (provider.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)provider.next();
                sPendingStoryViewRecords.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final boolean a()
    {
        if (sPendingStoryViewRecords.size() >= 20)
        {
            execute();
            return true;
        } else
        {
            return false;
        }
    }

    public final void execute()
    {
label0:
        {
            synchronized (sPendingStoryViewRecords)
            {
                if (!sPendingStoryViewRecords.isEmpty())
                {
                    break label0;
                }
            }
            return;
        }
        mStoryViewRecordList = new ArrayList(sPendingStoryViewRecords.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = sPendingStoryViewRecords.entrySet().iterator(); iterator.hasNext(); mStoryViewRecordList.add(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_96;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.execute();
        return;
    }

    protected final String getPath()
    {
        return "/bq/update_stories";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Tg()).a(mStoryViewRecordList)));
    }

    public final void onResult(pi pi1)
    {
        super.onResult(pi1);
        if (pi1.c())
        {
            SW sw;
            for (pi1 = mStoryViewRecordList.iterator(); pi1.hasNext(); sPendingStoryViewRecords.remove(sw.a()))
            {
                sw = (SW)pi1.next();
            }

        } else
        {
            pi1 = (Br)mUserProvider.get();
            if (pi1 != null)
            {
                pi1 = new HashMap(pi1.b());
                String s;
                for (Iterator iterator = mStoryViewRecordList.iterator(); iterator.hasNext(); sPendingStoryViewRecords.remove(s))
                {
                    SW sw1 = (SW)iterator.next();
                    s = sw1.a();
                    if (!pi1.containsKey(s))
                    {
                        pi1.put(s, sw1);
                    }
                }

            }
        }
    }

}
