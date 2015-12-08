// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.users:
//            UserAssociationStorage, UserProperty, UserAssociationProperty

private class <init> extends RxResultMapper
{

    final UserAssociationStorage this$0;

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount() + 1);
        propertyset.put(UserProperty.URN, Urn.forUser(cursorreader.getLong("_id")));
        propertyset.put(UserProperty.USERNAME, cursorreader.getString("username"));
        if (cursorreader.isNotNull("country"))
        {
            propertyset.put(UserProperty.COUNTRY, cursorreader.getString("country"));
        }
        propertyset.put(UserProperty.FOLLOWERS_COUNT, Integer.valueOf(cursorreader.getInt("followers_count")));
        propertyset.put(UserAssociationProperty.POSITION, Long.valueOf(cursorreader.getLong("position")));
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
        this$0 = UserAssociationStorage.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
