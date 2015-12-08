// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Comparator;

class this._cls0
    implements Comparator
{

    final compare this$0;

    public int compare(PropertySet propertyset, PropertySet propertyset1)
    {
        return ((String)propertyset.get(PlaylistProperty.TITLE)).compareTo((String)propertyset1.get(PlaylistProperty.TITLE));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PropertySet)obj, (PropertySet)obj1);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
