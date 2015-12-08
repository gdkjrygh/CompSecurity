// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.users:
//            UserStorage, UserProperty

final class this._cls0 extends RxResultMapper
{

    final UserStorage this$0;

    private void putOptionalFields(CursorReader cursorreader, PropertySet propertyset)
    {
        if (cursorreader.isNotNull("country"))
        {
            propertyset.put(UserProperty.COUNTRY, cursorreader.getString("country"));
        }
        if (cursorreader.isNotNull("description"))
        {
            propertyset.put(UserProperty.DESCRIPTION, cursorreader.getString("description"));
        }
        if (cursorreader.isNotNull("website"))
        {
            propertyset.put(UserProperty.WEBSITE_URL, cursorreader.getString("website"));
        }
        if (cursorreader.isNotNull("website_title"))
        {
            propertyset.put(UserProperty.WEBSITE_NAME, cursorreader.getString("website_title"));
        }
        if (cursorreader.isNotNull("discogs_name"))
        {
            propertyset.put(UserProperty.DISCOGS_NAME, cursorreader.getString("discogs_name"));
        }
        if (cursorreader.isNotNull("myspace_name"))
        {
            propertyset.put(UserProperty.MYSPACE_NAME, cursorreader.getString("myspace_name"));
        }
    }

    public final PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(UserProperty.URN, Urn.forUser(cursorreader.getLong("_id")));
        propertyset.put(UserProperty.USERNAME, cursorreader.getString("username"));
        propertyset.put(UserProperty.FOLLOWERS_COUNT, Integer.valueOf(cursorreader.getInt("followers_count")));
        propertyset.put(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(cursorreader.getBoolean("is_following")));
        putOptionalFields(cursorreader, propertyset);
        return propertyset;
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    _cls9()
    {
        this$0 = UserStorage.this;
        super();
    }
}
