// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LoadFollowingCommand extends Command
{

    private final PropellerDatabase propeller;

    public LoadFollowingCommand(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    private Query forFollowings(Iterable iterable)
    {
        return ((Query)((Query)((Query)Query.from(new String[] {
            Table.UserAssociations.name()
        }).whereEq("association_type", Integer.valueOf(2))).whereIn("target_id", getUserIds(iterable))).whereNull("removed_at")).order("position", com.soundcloud.propeller.query.Query.Order.ASC);
    }

    private List getUserIds(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Urn urn = (Urn)((PropertySet)iterable.next()).getOrElse(UserProperty.URN, Urn.NOT_SET);
            if (urn.isUser())
            {
                arraylist.add(Long.valueOf(urn.getNumericId()));
            }
        } while (true);
        return arraylist;
    }

    private Map toFollowingSet(QueryResult queryresult)
    {
        HashMap hashmap = new HashMap();
        for (queryresult = queryresult.iterator(); queryresult.hasNext(); hashmap.put(Urn.forUser(((CursorReader)queryresult.next()).getLong("target_id")), PropertySet.from(new PropertyBinding[] {
    UserProperty.IS_FOLLOWED_BY_ME.bind(Boolean.valueOf(true))
}))) { }
        return hashmap;
    }

    public volatile Object call(Object obj)
    {
        return call((Iterable)obj);
    }

    public Map call(Iterable iterable)
    {
        return toFollowingSet(propeller.query(forFollowings(iterable)));
    }
}
