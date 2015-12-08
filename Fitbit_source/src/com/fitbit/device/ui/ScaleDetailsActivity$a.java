// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.util.bi;
import org.json.JSONException;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

private static class ationException extends bi
{

    public Pair b()
    {
        Object obj = null;
        java.util.List list;
        try
        {
            list = an.a().e();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            list = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            list = null;
        }
        return new Pair(list, obj);
    }

    protected Intent f()
    {
        return null;
    }

    public Object f_()
    {
        return b();
    }

    public ationException(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
    }
}
