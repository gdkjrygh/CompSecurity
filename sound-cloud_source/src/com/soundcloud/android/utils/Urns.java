// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Urns
{

    private static final Function URN_TO_STRING = new _cls1();

    private Urns()
    {
    }

    public static String toJoinedIds(List list, String s)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(String.valueOf(((Urn)list.next()).getNumericId()))) { }
        return Strings.joinOn(s).join(arraylist);
    }

    public static ArrayList toString(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((Urn)list.next()).toString())) { }
        return arraylist;
    }

    public static Function toStringFunc()
    {
        return URN_TO_STRING;
    }


    private class _cls1
        implements Function
    {

        public final volatile Object apply(Object obj)
        {
            return apply((Urn)obj);
        }

        public final String apply(Urn urn)
        {
            return urn.toString();
        }

        _cls1()
        {
        }
    }

}
