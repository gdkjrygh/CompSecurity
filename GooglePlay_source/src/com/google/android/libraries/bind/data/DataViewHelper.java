// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import com.google.android.libraries.bind.util.Util;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataObserver, DataList, DataView, DataChange, 
//            Data

public class DataViewHelper extends DataObserver
{

    public boolean attached;
    private boolean clearDataOnDetach;
    public DataList dataRow;
    private boolean registered;
    public boolean temporarilyDetached;
    private final DataView view;

    public DataViewHelper(DataView dataview)
    {
        clearDataOnDetach = true;
        view = dataview;
    }

    private void unregister()
    {
        dataRow.unregisterDataObserver(this);
        registered = false;
    }

    public Data getData()
    {
        boolean flag;
        if (dataRow != null && !dataRow.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return dataRow.getData(0);
        } else
        {
            return null;
        }
    }

    public final void onDataChanged(DataChange datachange)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (dataRow != null)
        {
            if (dataRow.getCount() <= 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Util.checkPrecondition(flag, "Passed DataList with more than one row.");
        view.onDataUpdated(getData());
    }

    public final void onFinishTemporaryDetach()
    {
        temporarilyDetached = false;
        updateRegistrationIfNeeded();
    }

    public void setDataRow(DataList datalist)
    {
        if (datalist == dataRow)
        {
            return;
        }
        if (registered)
        {
            unregister();
        }
        dataRow = datalist;
        updateRegistrationIfNeeded();
        onDataChanged(DataChange.INVALIDATION);
    }

    public String toString()
    {
        boolean flag = false;
        Locale locale = Locale.US;
        String s = view.getClass().getSimpleName();
        if (dataRow != null)
        {
            flag = true;
        }
        return String.format(locale, "View type: %s, hasData: %b, registered: %b, attached: %b,temporarilyDetached: %b, clearDataOnDetach: %b", new Object[] {
            s, Boolean.valueOf(flag), Boolean.valueOf(registered), Boolean.valueOf(attached), Boolean.valueOf(temporarilyDetached), Boolean.valueOf(clearDataOnDetach)
        });
    }

    public final void updateRegistrationIfNeeded()
    {
        boolean flag;
        if (attached && !temporarilyDetached || !clearDataOnDetach)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!registered && dataRow != null)
            {
                dataRow.registerDataObserver(this);
                registered = true;
            }
        } else
        if (registered)
        {
            unregister();
            return;
        }
    }
}
