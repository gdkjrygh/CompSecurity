// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap:
//            WLDroidGap

class machine
    implements Comparable
{

    private String checksum;
    private Long date;
    private String machine;
    final machine this$1;

    public int compareTo(machine machine1)
    {
        if (checksum.compareTo(machine1.checksum) != 0)
        {
            return date.compareTo(machine1.date);
        } else
        {
            return 0;
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public String getChecksum()
    {
        return checksum;
    }

    public Long getDate()
    {
        return date;
    }

    public String getMachine()
    {
        return machine;
    }

    public (JSONObject jsonobject)
        throws JSONException
    {
        this$1 = this._cls1.this;
        super();
        checksum = jsonobject.getString("checksum");
        date = Long.valueOf(jsonobject.getLong("date"));
        machine = jsonobject.getString("machine");
    }
}
