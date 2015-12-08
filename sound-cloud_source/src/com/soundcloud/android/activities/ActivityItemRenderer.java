// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.utils.ScTextUtils;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityItem, ActivityKind

public class ActivityItemRenderer
    implements CellRenderer
{

    private final ImageOperations imageOperations;
    private final Resources resources;

    public ActivityItemRenderer(Resources resources1, ImageOperations imageoperations)
    {
        resources = resources1;
        imageOperations = imageoperations;
    }

    private void setMainText(View view, ActivityItem activityitem)
    {
        _cls1..SwitchMap.com.soundcloud.android.activities.ActivityKind[activityitem.getKind().ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 58
    //                   2 95
    //                   3 95
    //                   4 125
    //                   5 125
    //                   6 155;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L5
_L1:
        throw new IllegalArgumentException("Unexpected activity type");
_L2:
        int i;
        activityitem = resources.getString(0x7f07016a);
        i = 0x7f02023e;
_L7:
        view = (TextView)view.findViewById(0x7f0f0167);
        view.setText(activityitem);
        view.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        return;
_L3:
        activityitem = String.format(resources.getString(0x7f070168), new Object[] {
            activityitem.getPlayableTitle()
        });
        i = 0x7f02023f;
        continue; /* Loop/switch isn't completed */
_L4:
        activityitem = String.format(resources.getString(0x7f070169), new Object[] {
            activityitem.getPlayableTitle()
        });
        i = 0x7f020244;
        continue; /* Loop/switch isn't completed */
_L5:
        activityitem = String.format(resources.getString(0x7f070167), new Object[] {
            activityitem.getPlayableTitle()
        });
        i = 0x7f02023d;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void setTimeElapsed(View view, ActivityItem activityitem)
    {
        activityitem = activityitem.getCreatedAt();
        activityitem = ScTextUtils.formatTimeElapsedSince(resources, activityitem.getTime(), true);
        ((TextView)view.findViewById(0x7f0f0166)).setText(activityitem);
    }

    private void setUserAvatar(View view, ActivityItem activityitem)
    {
        imageOperations.displayCircularInAdapterView(activityitem.getEntityUrn(), ApiImageSize.getListItemImageSize(resources), (ImageView)view.findViewById(0x7f0f006f));
    }

    private void setUserName(View view, ActivityItem activityitem)
    {
        ((TextView)view.findViewById(0x7f0f0151)).setText(activityitem.getUserName());
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (ActivityItem)list.get(i);
        setUserName(view, list);
        setTimeElapsed(view, list);
        setMainText(view, list);
        setUserAvatar(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030064, viewgroup, false);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$activities$ActivityKind[];

        static 
        {
            $SwitchMap$com$soundcloud$android$activities$ActivityKind = new int[ActivityKind.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.USER_FOLLOW.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_LIKE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.PLAYLIST_LIKE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_REPOST.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.PLAYLIST_REPOST.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$activities$ActivityKind[ActivityKind.TRACK_COMMENT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
