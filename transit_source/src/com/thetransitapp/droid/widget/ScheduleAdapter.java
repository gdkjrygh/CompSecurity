// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.ui.ShadowImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.widget:
//            ListViewItem

public class ScheduleAdapter extends ArrayAdapter
{
    public static interface OnReachEndListener
    {

        public abstract void onReachEnd();
    }


    private LayoutInflater inflater;
    private OnReachEndListener reachEndListener;
    private int reachEndOffset;
    private boolean showHeadsign;

    public ScheduleAdapter(LayoutInflater layoutinflater, Context context)
    {
        super(context, 0x7f030027, new ArrayList());
        reachEndOffset = 1;
        inflater = layoutinflater;
    }

    public void addSchedule(List list)
    {
        Object obj = null;
        showHeadsign = false;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ScheduleItem scheduleitem = (ScheduleItem)iterator.next();
            ListViewItem listviewitem = new ListViewItem(scheduleitem);
            if (super.getPosition(listviewitem) == -1)
            {
                super.add(listviewitem);
            }
            if (list != null && !list.equals(scheduleitem.getHeadsign()))
            {
                showHeadsign = true;
            }
            list = scheduleitem.getHeadsign();
        } while (true);
    }

    public void addTitle(String s)
    {
        super.add(new ListViewItem(s));
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ListViewItem listviewitem;
label0:
        {
            View view1 = view;
            listviewitem = (ListViewItem)super.getItem(i);
            if (view1 != null && (listviewitem.hasValue() || view1.findViewById(0x7f050081) != null))
            {
                view = view1;
                if (!listviewitem.hasValue())
                {
                    break label0;
                }
                view = view1;
                if (view1.findViewById(0x7f05007e) != null)
                {
                    break label0;
                }
            }
            ShadowImageView shadowimageview;
            Object obj1;
            PorterDuffColorFilter porterduffcolorfilter;
            if (listviewitem.hasValue())
            {
                view = inflater.inflate(0x7f030027, viewgroup, false);
            } else
            {
                view = inflater.inflate(0x7f030028, viewgroup, false);
            }
        }
        if (listviewitem.hasValue())
        {
            TextView textview = (TextView)view.findViewById(0x7f05007e);
            TextView textview1 = (TextView)view.findViewById(0x7f050080);
            Object obj = (LinearLayout)view.findViewById(0x7f05007f);
            if (!((ScheduleItem)listviewitem.getValue()).isFrequency())
            {
                viewgroup = ((ScheduleItem)listviewitem.getValue()).getStopTime();
                textview.setText(DateFormat.getTimeFormat(getContext()).format(viewgroup));
            } else
            {
                textview.setText(((ScheduleItem)listviewitem.getValue()).getScheduleViewString(textview.getContext()));
            }
            if (((ScheduleItem)listviewitem.getValue()).getRealStopTime() != null)
            {
                viewgroup = (ShadowImageView)((LinearLayout) (obj)).getChildAt(0);
                shadowimageview = (ShadowImageView)((LinearLayout) (obj)).getChildAt(1);
                obj1 = new PorterDuffColorFilter(0xffcccccc, android.graphics.PorterDuff.Mode.SRC_IN);
                porterduffcolorfilter = new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
                viewgroup.setColorFilter(((android.graphics.ColorFilter) (obj1)));
                shadowimageview.setColorFilter(((android.graphics.ColorFilter) (obj1)));
                viewgroup.setPressedColorFilter(porterduffcolorfilter);
                shadowimageview.setPressedColorFilter(porterduffcolorfilter);
                if (((LinearLayout) (obj)).getVisibility() != 0 || ((LinearLayout) (obj)).getAnimation() == null || !((LinearLayout) (obj)).getAnimation().hasStarted())
                {
                    ((LinearLayout) (obj)).setVisibility(0);
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        obj = AnimationUtils.loadAnimation(viewgroup.getContext(), 0x7f040000);
                        ((Animation) (obj)).setStartOffset(((Animation) (obj)).getStartOffset() + 200L);
                        obj1 = AnimationUtils.loadAnimation(viewgroup.getContext(), 0x7f040000);
                        ((Animation) (obj1)).setDuration(((Animation) (obj1)).getDuration() + 200L);
                        viewgroup.startAnimation(((Animation) (obj)));
                        shadowimageview.startAnimation(((Animation) (obj1)));
                    }
                }
                viewgroup = textview.getResources().getColorStateList(0x7f07001f);
            } else
            {
                if (((ScheduleItem)listviewitem.getValue()).isPastItem())
                {
                    viewgroup = textview.getResources().getColorStateList(0x7f07001c);
                } else
                {
                    viewgroup = textview.getResources().getColorStateList(0x7f07001f);
                }
                ((LinearLayout) (obj)).setVisibility(8);
            }
            textview.setTextColor(viewgroup);
            textview1.setTextColor(viewgroup);
            if (showHeadsign)
            {
                textview1.setVisibility(0);
                textview1.setText(((ScheduleItem)listviewitem.getValue()).getHeadsign());
            } else
            {
                textview1.setVisibility(8);
            }
        } else
        {
            ((TextView)view.findViewById(0x7f050081)).setText(listviewitem.getTitle());
        }
        if (i >= getCount() - reachEndOffset && reachEndListener != null)
        {
            reachEndListener.onReachEnd();
        }
        return view;
    }

    public void setOnReachEndListener(OnReachEndListener onreachendlistener)
    {
        setOnReachEndListener(onreachendlistener, 1);
    }

    public void setOnReachEndListener(OnReachEndListener onreachendlistener, int i)
    {
        reachEndListener = onreachendlistener;
        reachEndOffset = i;
    }
}
