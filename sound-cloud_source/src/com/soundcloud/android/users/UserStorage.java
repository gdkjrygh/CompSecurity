// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import rx.b;

// Referenced classes of package com.soundcloud.android.users:
//            UserProperty

public class UserStorage
{
    final class UserMapper extends RxResultMapper
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

        UserMapper()
        {
            this$0 = UserStorage.this;
            super();
        }
    }


    private static final String IS_FOLLOWING = "is_following";
    private final PropellerRx propeller;

    UserStorage(PropellerRx propellerrx)
    {
        propeller = propellerrx;
    }

    private Query buildUserQuery(Urn urn)
    {
        return (Query)Query.from(new String[] {
            Table.Users.name()
        }).select(new Object[] {
            "_id", "username", "country", "followers_count", "description", "website", "website_title", "myspace_name", "discogs_name", ColumnFunctions.exists(followingQuery(urn)).as("is_following")
        }).whereEq("_id", Long.valueOf(urn.getNumericId()));
    }

    private Query followingQuery(Urn urn)
    {
        return (Query)((Query)((Query)Query.from(new String[] {
            Table.UserAssociations.name()
        }).whereEq(Table.UserAssociations.field("target_id"), Long.valueOf(urn.getNumericId()))).whereEq(Table.UserAssociations.field("association_type"), Integer.valueOf(2))).whereNull("removed_at");
    }

    b loadUser(Urn urn)
    {
        return propeller.query(buildUserQuery(urn)).map(new UserMapper()).firstOrDefault(PropertySet.create());
    }
}
