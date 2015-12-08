// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Table;
import rx.b;

// Referenced classes of package com.soundcloud.android.users:
//            UserProperty, UserAssociationProperty

public class UserAssociationStorage
{
    private class FollowersMapper extends UserAssociationMapper
    {

        final UserAssociationStorage this$0;

        public PropertySet map(CursorReader cursorreader)
        {
            PropertySet propertyset = super.map(cursorreader);
            propertyset.put(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(cursorreader.isNotNull("Followings.association_type")));
            return propertyset;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private FollowersMapper()
        {
            this$0 = UserAssociationStorage.this;
            super(null);
        }

        FollowersMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private class FollowingsMapper extends UserAssociationMapper
    {

        final UserAssociationStorage this$0;

        public PropertySet map(CursorReader cursorreader)
        {
            cursorreader = super.map(cursorreader);
            cursorreader.put(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(true));
            return cursorreader;
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private FollowingsMapper()
        {
            this$0 = UserAssociationStorage.this;
            super(null);
        }

        FollowingsMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private class UserAssociationMapper extends RxResultMapper
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

        private UserAssociationMapper()
        {
            this$0 = UserAssociationStorage.this;
            super();
        }

        UserAssociationMapper(_cls1 _pcls1)
        {
            this();
        }
    }

    private class UserUrnMapper extends RxResultMapper
    {

        final UserAssociationStorage this$0;

        public Urn map(CursorReader cursorreader)
        {
            return Urn.forUser(cursorreader.getLong("_id"));
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private UserUrnMapper()
        {
            this$0 = UserAssociationStorage.this;
            super();
        }

        UserUrnMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String FOLLOWINGS_ALIAS = "Followings";
    private final PropellerRx propellerRx;

    public UserAssociationStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    private Query buildFollowingsBaseQuery()
    {
        return Query.from(new Table[] {
            com.soundcloud.android.storage.Table.Users
        }).select(new Object[] {
            Field.field("_id"), Field.field("username"), Field.field("country"), Field.field("followers_count"), Field.field("position")
        }).innerJoin(com.soundcloud.android.storage.Table.UserAssociations.name(), Filter.filter().whereEq(com.soundcloud.android.storage.Table.UserAssociations.field("target_id"), com.soundcloud.android.storage.Table.Users.field("_id")).whereEq(com.soundcloud.android.storage.Table.UserAssociations.field("association_type"), Integer.valueOf(2)));
    }

    protected Query buildFollowersQuery(int i, long l)
    {
        return ((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Table.Users
        }).select(new Object[] {
            Field.field("_id"), Field.field("username"), Field.field("country"), Field.field("followers_count"), com.soundcloud.android.storage.Table.UserAssociations.field("position"), "Followings.association_type"
        }).innerJoin(com.soundcloud.android.storage.Table.UserAssociations.name(), Filter.filter().whereEq(com.soundcloud.android.storage.Table.UserAssociations.field("target_id"), com.soundcloud.android.storage.Table.Users.field("_id")).whereEq(com.soundcloud.android.storage.Table.UserAssociations.field("association_type"), Integer.valueOf(3))).leftJoin((new StringBuilder()).append(com.soundcloud.android.storage.Table.UserAssociations.name()).append(" as Followings").toString(), Filter.filter().whereEq("Followings.target_id", com.soundcloud.android.storage.Table.Users.field("_id")).whereEq("Followings.association_type", Integer.valueOf(2))).whereGt(com.soundcloud.android.storage.Table.UserAssociations.field("position"), Long.valueOf(l))).order(com.soundcloud.android.storage.Table.UserAssociations.field("position"), com.soundcloud.propeller.query.Query.Order.ASC).limit(i);
    }

    protected Query buildFollowingsQuery(int i, long l)
    {
        return ((Query)buildFollowingsBaseQuery().whereGt(com.soundcloud.android.storage.Table.UserAssociations.field("position"), Long.valueOf(l))).order(com.soundcloud.android.storage.Table.UserAssociations.field("position"), com.soundcloud.propeller.query.Query.Order.ASC).limit(i);
    }

    public b loadFollowers(int i, long l)
    {
        Query query = buildFollowersQuery(i, l);
        return propellerRx.query(query).map(new FollowersMapper(null)).toList();
    }

    public b loadFollowing(Urn urn)
    {
        urn = (Query)buildFollowingsBaseQuery().whereEq("target_id", Long.valueOf(urn.getNumericId()));
        return propellerRx.query(urn).map(new FollowingsMapper(null));
    }

    public b loadFollowings(int i, long l)
    {
        Query query = buildFollowingsQuery(i, l);
        return propellerRx.query(query).map(new FollowingsMapper(null)).toList();
    }

    public b loadFollowingsUrns(int i, long l)
    {
        Query query = ((Query)((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Table.UserAssociations
        }).select(new Object[] {
            Field.field("target_id").as("_id")
        }).whereEq(com.soundcloud.android.storage.Table.UserAssociations.field("association_type"), Integer.valueOf(2))).whereGt(com.soundcloud.android.storage.Table.UserAssociations.field("position"), Long.valueOf(l))).order(com.soundcloud.android.storage.Table.UserAssociations.field("position"), com.soundcloud.propeller.query.Query.Order.ASC).limit(i);
        return propellerRx.query(query).map(new UserUrnMapper(null)).toList();
    }
}
