// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.thetransitapp.droid.BaseFragment;
import com.thetransitapp.droid.model.RoutingItinerary;
import com.thetransitapp.droid.model.RoutingLeg;
import com.thetransitapp.droid.util.BitmapUtility;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.widget:
//            RoutingStepAdapter

public class RoutingDetails extends BaseFragment
    implements android.view.View.OnClickListener, com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener, android.widget.AdapterView.OnItemClickListener
{
    public static interface OnDetailClickListener
    {

        public abstract void onDetailClick(RoutingItinerary routingitinerary);

        public abstract void onLegClick(RoutingLeg routingleg);
    }


    private static final long UPDATE_DELAY = 20000L;
    private RoutingStepAdapter adapter;
    private TextView arriveAt;
    private ImageButton back;
    private RoutingItinerary currentItinerary;
    private Handler handler;
    private List itineraries;
    private TextView leaveTime;
    private ImageButton next;
    private OnDetailClickListener onDetailClickListener;
    private ImageView pagination;
    private LinearLayout routingStepsList;
    private ListView steps;

    public RoutingDetails()
    {
        handler = new Handler();
    }

    private void update()
    {
        if (!super.isVisible())
        {
            return;
        } else
        {
            int i = itineraries.indexOf(currentItinerary);
            int j = super.getResources().getDimensionPixelSize(0x7f080019);
            pagination.setImageBitmap(BitmapUtility.getPagination(itineraries.size(), j, i));
            updateCurrent();
            return;
        }
    }

    private void updateCurrent()
    {
        while (!super.isVisible() || currentItinerary == null) 
        {
            return;
        }
        int i = (int)((currentItinerary.getStartTime().getTime() - System.currentTimeMillis()) / 60000L);
        Object obj = DateFormat.getTimeFormat(super.getActivity());
        String s;
        if (i < 0)
        {
            s = getString(0x7f0a006c, new Object[] {
                ((java.text.DateFormat) (obj)).format(currentItinerary.getStartTime())
            });
        } else
        if (i == 0)
        {
            s = getString(0x7f0a006d);
        } else
        if (i < 30)
        {
            s = getString(0x7f0a006e, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            s = getString(0x7f0a006f, new Object[] {
                ((java.text.DateFormat) (obj)).format(currentItinerary.getStartTime())
            });
        }
        i = (int)((currentItinerary.getEndTime().getTime() - currentItinerary.getStartTime().getTime()) / 60000L);
        obj = getString(0x7f0a0070, new Object[] {
            ((java.text.DateFormat) (obj)).format(currentItinerary.getEndTime()), Integer.valueOf(i)
        });
        leaveTime.setText(s);
        arriveAt.setText(((CharSequence) (obj)));
    }

    public void onClick(View view)
    {
        int i;
        int j;
        i = itineraries.indexOf(currentItinerary);
        if (view == back)
        {
            i--;
        } else
        {
            i++;
        }
        if (i < itineraries.size()) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        setDisplayedItinerary((RoutingItinerary)itineraries.get(j));
        onDetailClickListener.onDetailClick(currentItinerary);
        update();
        return;
_L2:
        j = i;
        if (i < 0)
        {
            j = itineraries.size() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.createViewIfNeeded(layoutinflater, viewgroup, 0x7f030024);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (onDetailClickListener != null)
        {
            onDetailClickListener.onLegClick((RoutingLeg)adapter.getItem(i));
            routingStepsList.setVisibility(8);
        }
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        routingStepsList.getVisibility();
        JVM INSTR lookupswitch 2: default 32
    //                   0: 34
    //                   8: 46;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        routingStepsList.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L3:
        routingStepsList.setVisibility(0);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onStart()
    {
        super.onStart();
        super.getSherlockActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        update();
        steps.setAdapter(adapter);
        steps.setOnItemClickListener(this);
        if (currentItinerary == null) goto _L2; else goto _L1
_L1:
        adapter.clear();
        view = currentItinerary.getLegs().iterator();
_L5:
        if (view.hasNext()) goto _L3; else goto _L2
_L2:
        handler.postDelayed(new Runnable() {

            final RoutingDetails this$0;

            public void run()
            {
                if (!isVisible())
                {
                    return;
                } else
                {
                    updateCurrent();
                    handler.postDelayed(this, 20000L);
                    return;
                }
            }

            
            {
                this$0 = RoutingDetails.this;
                super();
            }
        }, 20000L);
        byte byte1 = 4;
        byte byte0 = byte1;
        if (itineraries != null)
        {
            byte0 = byte1;
            if (itineraries.size() > 1)
            {
                byte0 = 0;
            }
        }
        back.setVisibility(byte0);
        back.setOnClickListener(this);
        next.setVisibility(byte0);
        next.setOnClickListener(this);
        return;
_L3:
        bundle = (RoutingLeg)view.next();
        if (bundle.getLegType() != com.thetransitapp.droid.model.RoutingLeg.LegType.WAIT)
        {
            adapter.add(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setDisplayedItinerary(RoutingItinerary routingitinerary)
    {
        currentItinerary = routingitinerary;
        if (adapter == null) goto _L2; else goto _L1
_L1:
        adapter.clear();
        routingitinerary = currentItinerary.getLegs().iterator();
_L5:
        if (routingitinerary.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        RoutingLeg routingleg = (RoutingLeg)routingitinerary.next();
        if (routingleg.getLegType() != com.thetransitapp.droid.model.RoutingLeg.LegType.WAIT)
        {
            adapter.add(routingleg);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setOnDetailClickListener(OnDetailClickListener ondetailclicklistener)
    {
        onDetailClickListener = ondetailclicklistener;
    }

    public void setPossibleItineraries(List list)
    {
        itineraries = list;
        byte byte1 = 4;
        byte byte0 = byte1;
        if (list != null)
        {
            byte0 = byte1;
            if (list.size() > 1)
            {
                byte0 = 0;
            }
        }
        if (back != null && next != null)
        {
            back.setVisibility(byte0);
            next.setVisibility(byte0);
        }
    }


}
