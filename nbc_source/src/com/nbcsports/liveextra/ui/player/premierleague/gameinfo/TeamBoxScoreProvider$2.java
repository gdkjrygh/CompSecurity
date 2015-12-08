// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            TeamBoxScoreProvider

class this._cls0
    implements Func1
{

    final TeamBoxScoreProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public Map call(List list)
    {
        if (!CollectionUtils.isEmpty(list)) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            list = hashmap;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (com.nbcsports.liveextra.content.models.overlay.premierleague.)iterator.next();
            hashmap.put(list.a(), Integer.valueOf(list.oals()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = TeamBoxScoreProvider.this;
        super();
    }
}
