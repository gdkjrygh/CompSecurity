// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.alert:
//            AlertResult

public class AlertResults extends ArrayList
    implements Serializable
{

    private static final long serialVersionUID = 0xea3083beefe10206L;

    public AlertResults()
    {
    }

    public List toAlertModels()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < size(); i++)
        {
            arraylist.add(((AlertResult)get(i)).toAlertModel());
        }

        return arraylist;
    }
}
