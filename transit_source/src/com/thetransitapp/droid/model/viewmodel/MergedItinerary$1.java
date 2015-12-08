// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import android.widget.ListView;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.widget.ListViewItem;
import com.thetransitapp.droid.widget.ScheduleAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model.viewmodel:
//            MergedItinerary

class val.listView
    implements com.thetransitapp.droid.model.realtime.urce.RealTimeCallback
{

    final MergedItinerary this$0;
    private final ListView val$listView;

    public void didAssignRealTime()
    {
        MergedItinerary.access$0(MergedItinerary.this, null);
        loadOngoingScheduleItems();
        ScheduleAdapter scheduleadapter = (ScheduleAdapter)val$listView.getAdapter();
        boolean flag = false;
        Object obj = new ArrayList();
        int i = 0;
        do
        {
label0:
            {
                if (i >= scheduleadapter.getCount())
                {
                    if (flag)
                    {
                        ListViewItem listviewitem;
                        boolean flag1;
                        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); scheduleadapter.remove((ListViewItem)((Iterator) (obj)).next()))
                        {
                            break label0;
                        }

                    }
                    scheduleadapter.notifyDataSetChanged();
                    return;
                }
                listviewitem = (ListViewItem)scheduleadapter.getItem(i);
                flag1 = flag;
                if (listviewitem.hasValue())
                {
                    if (((ScheduleItem)listviewitem.getValue()).getRealStopTime() == null)
                    {
                        flag1 = flag;
                        if (!((ScheduleItem)listviewitem.getValue()).isPastItem())
                        {
                            flag1 = flag;
                            if (!flag)
                            {
                                ((List) (obj)).add(listviewitem);
                                flag1 = flag;
                            }
                        }
                    } else
                    {
                        flag1 = true;
                    }
                }
                i++;
                flag = flag1;
            }
        } while (true);
    }

    rce.RealTimeCallback()
    {
        this$0 = final_mergeditinerary;
        val$listView = ListView.this;
        super();
    }
}
