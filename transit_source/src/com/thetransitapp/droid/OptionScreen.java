// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import com.thetransitapp.droid.widget.OptionItem;
import com.thetransitapp.droid.widget.TransitModeAdapter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen

public class OptionScreen extends BaseMapScreen
    implements com.thetransitapp.droid.controller.FeedManager.FeedManagerCallback, android.widget.ExpandableListView.OnGroupClickListener, android.widget.ExpandableListView.OnChildClickListener
{

    private TransitModeAdapter adapter;
    private FeedManager feedManager;
    private LinearLayout overlay;
    private ExpandableListView transitModes;

    public OptionScreen()
    {
        super(TransitActivity.TransitScreen.OPTION_SCREEN);
    }

    private void onSelectionChanged()
    {
        feedManager.onSelectionChanged();
    }

    public void feedUpdated()
    {
        Object obj;
        Object obj1;
        obj1 = feedManager.getClosestBundle();
        adapter.clear();
        android.location.Location location = super.getLastLocation();
        obj = obj1;
        if (location != null)
        {
            obj = obj1;
            if (obj1 != null)
            {
                obj = obj1;
                if (!((TransitBundle) (obj1)).deserve(location))
                {
                    if (super.getMap() != null)
                    {
                        obj = obj1;
                        if (!((TransitBundle) (obj1)).deserve((new SimplePlacemark(super.getMap().getCameraPosition().target)).toLocation()))
                        {
                            obj1 = feedManager.closestBundleToLocation(location);
                            obj = obj1;
                            if (!((TransitBundle) (obj1)).deserve(location))
                            {
                                obj = null;
                            }
                        }
                    } else
                    {
                        obj = null;
                    }
                }
            }
        }
        if (obj == null || ((TransitBundle) (obj)).getTransitModes() == null) goto _L2; else goto _L1
_L1:
        obj1 = ((TransitBundle) (obj)).getTransitModes().iterator();
_L4:
        if (((Iterator) (obj1)).hasNext()) goto _L3; else goto _L2
_L2:
        adapter.setCurrentRegion(((TransitBundle) (obj)));
        Collections.sort(feedManager.getBundles(), new Comparator() {

            final OptionScreen this$0;

            public int compare(TransitBundle transitbundle1, TransitBundle transitbundle2)
            {
                return transitbundle1.getName().compareTo(transitbundle2.getName());
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((TransitBundle)obj2, (TransitBundle)obj3);
            }

            
            {
                this$0 = OptionScreen.this;
                super();
            }
        });
        obj = feedManager.getBundles().iterator();
_L5:
        if (!((Iterator) (obj)).hasNext())
        {
            if (!feedManager.isReady())
            {
                feedManager.refresh(null, super.getActivity());
            }
            adapter.notifyDataSetInvalidated();
            return;
        }
        break MISSING_BLOCK_LABEL_233;
_L3:
        TransitMode transitmode = (TransitMode)((Iterator) (obj1)).next();
        adapter.addMode(transitmode);
          goto _L4
        TransitBundle transitbundle = (TransitBundle)((Iterator) (obj)).next();
        adapter.addSupportedRegion(transitbundle);
          goto _L5
    }

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        boolean flag = false;
        expandablelistview = adapter.getChild(i, j);
        if (expandablelistview.getMode() != null)
        {
            view = expandablelistview.getMode();
            if (!expandablelistview.getMode().isSelected())
            {
                flag = true;
            }
            view.setSelected(flag);
            if (expandablelistview.getMode().isSelected() && adapter.getGroup(i).getMode() != null)
            {
                adapter.getGroup(i).getMode().setSelected(true);
            }
            adapter.notifyDataSetChanged();
            return true;
        } else
        {
            return false;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03002f, viewgroup, false);
    }

    public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
    {
        boolean flag = false;
        if (adapter.getChildrenCount(i) == 0)
        {
            expandablelistview = adapter.getGroup(i);
            if (expandablelistview.getMode() != null)
            {
                view = expandablelistview.getMode();
                if (!expandablelistview.getMode().isSelected())
                {
                    flag = true;
                }
                view.setSelected(flag);
                adapter.notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    public void onStart()
    {
        super.onStart();
        if (!feedManager.isReady())
        {
            android.location.Location location = super.getLastLocation();
            if (location != null)
            {
                if (super.getActivity() != null)
                {
                    feedManager.addFeedManagerCallback(this);
                    feedManager.refresh(location, super.getActivity());
                }
                return;
            } else
            {
                super.showLocationServiceError();
                return;
            }
        } else
        {
            feedUpdated();
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        overlay.setOnTouchListener(new android.view.View.OnTouchListener() {

            final OptionScreen this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$0 = OptionScreen.this;
                super();
            }
        });
        adapter = new TransitModeAdapter(super.getLayoutInflater(bundle), super.getFragmentManager(), transitModes);
        adapter.registerDataSetObserver(new DataSetObserver() {

            final OptionScreen this$0;

            public void onChanged()
            {
                super.onChanged();
                onSelectionChanged();
            }

            
            {
                this$0 = OptionScreen.this;
                super();
            }
        });
        transitModes.setAdapter(adapter);
        transitModes.setOnGroupClickListener(this);
        transitModes.setOnChildClickListener(this);
    }

}
