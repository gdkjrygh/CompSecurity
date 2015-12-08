// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;


// Referenced classes of package com.soundcloud.propeller.query:
//            Query, Where, QueryHelper

private static class where
{

    private final String joinType;
    private final String table;
    private final String where;




    (String s, String s1, Where where1)
    {
        this(s, s1, QueryHelper.resolveArguments(where1.build(), where1.getArguments()));
    }

    guments(String s, String s1, String s2)
    {
        table = s;
        joinType = s1;
        where = s2;
    }
}
