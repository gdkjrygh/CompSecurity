// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;

// Referenced classes of package com.soundcloud.android.users:
//            UserAssociationStorage, UserProperty

private class <init> extends apper
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

    private apper()
    {
        this$0 = UserAssociationStorage.this;
        super(UserAssociationStorage.this, null);
    }

    apper(apper apper)
    {
        this();
    }
}
