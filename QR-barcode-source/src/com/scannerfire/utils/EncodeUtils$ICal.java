// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.scannerfire.utils:
//            EncodeUtils

public class end
{

    String des;
    long end;
    long start;
    final EncodeUtils this$0;
    String what;
    String where;

    public String getDes()
    {
        return des;
    }

    public String getEnd()
    {
        return (new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())).format(new Date(end));
    }

    public String getStart()
    {
        return (new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())).format(new Date(start));
    }

    public long getStartMill()
    {
        return start;
    }

    public String getWhat()
    {
        return what;
    }

    public String getWhere()
    {
        return where;
    }

    public (String s, String s1, String s2, long l, long l1)
    {
        this$0 = EncodeUtils.this;
        super();
        what = s;
        where = s1;
        des = s2;
        start = l;
        end = l1;
    }
}
