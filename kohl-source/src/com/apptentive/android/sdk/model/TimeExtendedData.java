// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ExtendedData

public class TimeExtendedData extends ExtendedData
{

    private static final String KEY_TIMESTAMP = "timestamp";
    private static final int VERSION = 1;

    public TimeExtendedData()
    {
        setTimestamp(System.currentTimeMillis());
    }

    public TimeExtendedData(double d)
    {
        setTimestamp(d);
    }

    public TimeExtendedData(long l)
    {
        setTimestamp(l);
    }

    public TimeExtendedData(Date date)
    {
        setTimestamp(date);
    }

    protected void init()
    {
        setType(ExtendedData.Type.time);
        setVersion(1);
    }

    protected void setTimestamp(double d)
    {
        try
        {
            put("timestamp", d);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.w("Error adding %s to TimeExtendedData.", new Object[] {
                "timestamp", jsonexception
            });
        }
    }

    protected void setTimestamp(long l)
    {
        setTimestamp((double)l / 1000D);
    }

    protected void setTimestamp(Date date)
    {
        if (date != null)
        {
            setTimestamp(date.getTime());
            return;
        } else
        {
            setTimestamp(System.currentTimeMillis());
            return;
        }
    }
}
