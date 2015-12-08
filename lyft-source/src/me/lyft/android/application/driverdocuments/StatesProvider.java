// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.driverdocuments;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.LyftApplication;
import me.lyft.android.domain.driverdocuments.State;

// Referenced classes of package me.lyft.android.application.driverdocuments:
//            IStatesProvider

public class StatesProvider
    implements IStatesProvider
{

    private LyftApplication lyftApplication;
    private List states;

    public StatesProvider(LyftApplication lyftapplication)
    {
        lyftApplication = lyftapplication;
        loadStates();
    }

    private void loadStates()
    {
        String as[] = lyftApplication.getResources().getStringArray(0x7f0a0003);
        states = new ArrayList(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("\\|", 2);
            states.add(new State(as1[0], as1[1]));
        }

    }

    public ArrayList getStateLabels()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = getStates().iterator(); iterator.hasNext(); arraylist.add(((State)iterator.next()).getLabel())) { }
        return arraylist;
    }

    public List getStates()
    {
        return states;
    }
}
