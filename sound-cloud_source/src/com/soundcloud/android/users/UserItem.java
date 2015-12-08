// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.users:
//            UserProperty

public class UserItem
    implements ListItem
{

    protected final PropertySet source;

    UserItem(PropertySet propertyset)
    {
        source = propertyset;
    }

    public static UserItem from(PropertySet propertyset)
    {
        return new UserItem(propertyset);
    }

    public static f fromPropertySet()
    {
        return new _cls1();
    }

    public Optional getCountry()
    {
        if (source.contains(UserProperty.COUNTRY))
        {
            return Optional.of(source.get(UserProperty.COUNTRY));
        } else
        {
            return Optional.absent();
        }
    }

    public Urn getEntityUrn()
    {
        return (Urn)source.get(UserProperty.URN);
    }

    public int getFollowersCount()
    {
        return ((Integer)source.get(UserProperty.FOLLOWERS_COUNT)).intValue();
    }

    public String getName()
    {
        return (String)source.get(UserProperty.USERNAME);
    }

    public boolean isFollowedByMe()
    {
        return ((Boolean)source.getOrElse(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(false))).booleanValue();
    }

    public volatile ListItem update(PropertySet propertyset)
    {
        return update(propertyset);
    }

    public UserItem update(PropertySet propertyset)
    {
        source.update(propertyset);
        return this;
    }

    private class _cls1
        implements f
    {

        public final UserItem call(PropertySet propertyset)
        {
            return UserItem.from(propertyset);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls1()
        {
        }
    }

}
