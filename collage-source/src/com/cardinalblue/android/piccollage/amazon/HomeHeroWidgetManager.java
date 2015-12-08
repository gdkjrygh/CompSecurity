// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.amazon;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.device.home.GroupedGridHeroWidget;
import com.amazon.device.home.HeroWidgetActivityStarterIntent;
import com.amazon.device.home.HeroWidgetIntent;
import com.amazon.device.home.HomeManager;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.WidgetBroadcastReceiver;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.AmazonHeroWidgetUpdateReceiver;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity;
import java.util.ArrayList;
import java.util.List;

public class HomeHeroWidgetManager
{
    public static class UpdateHeroWidgetEvent
        implements IGsonable
    {

        String a;
        String b;
        List c;
        List d;

        private void a(List list)
        {
            c = new ArrayList();
            d = new ArrayList();
            for (int i = 0; i < list.size(); i++)
            {
                WebPhoto webphoto = (WebPhoto)list.get(i);
                c.add((new StringBuilder()).append("app:/collages/").append(webphoto.getId()).toString());
                d.add(webphoto.getMediumImageUrl());
            }

        }

        public boolean a()
        {
            return c.size() == 0;
        }

        public UpdateHeroWidgetEvent(String s, String s1, List list)
        {
            a = s;
            b = s1;
            a(list);
        }
    }


    private static HomeHeroWidgetManager a;
    private HomeManager b;
    private boolean c;
    private Context d;

    private HomeHeroWidgetManager(Context context)
    {
        c = false;
        d = context;
        c = k.k(context);
        if (!c)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        b = HomeManager.getInstance(context);
        com.cardinalblue.android.piccollage.controller.d.b(this);
        return;
        context;
        f.a(context);
        return;
    }

    private com.amazon.device.home.GroupedGridHeroWidget.Group a(UpdateHeroWidgetEvent updateherowidgetevent)
    {
        com.amazon.device.home.GroupedGridHeroWidget.Group group = new com.amazon.device.home.GroupedGridHeroWidget.Group();
        ArrayList arraylist = new ArrayList();
        group.setGroupName(updateherowidgetevent.a);
        for (int i = 0; i < updateherowidgetevent.c.size(); i++)
        {
            HeroWidgetIntent herowidgetintent = new HeroWidgetIntent(com/cardinalblue/android/piccollage/WidgetBroadcastReceiver.getName());
            herowidgetintent.setData((String)updateherowidgetevent.c.get(i));
            com.amazon.device.home.GroupedGridHeroWidget.GridEntry gridentry = new com.amazon.device.home.GroupedGridHeroWidget.GridEntry();
            gridentry.setContentIntent(herowidgetintent);
            gridentry.setThumbnailUri(Uri.parse((String)updateherowidgetevent.d.get(i)));
            arraylist.add(gridentry);
        }

        group.setGridEntries(arraylist);
        return group;
    }

    public static HomeHeroWidgetManager a(Context context)
    {
        if (a == null)
        {
            a = new HomeHeroWidgetManager(context);
        }
        return a;
    }

    public void a()
    {
        Intent intent = new Intent(d, com/cardinalblue/android/piccollage/controller/AmazonHeroWidgetUpdateReceiver);
        intent.setAction("piccollage.intent.action.UPDATE_HERO");
        d.sendBroadcast(intent);
    }

    public void onUpdateHeroWidgetEvent(UpdateHeroWidgetEvent updateherowidgetevent)
    {
        GroupedGridHeroWidget groupedgridherowidget;
        Object obj;
        if (b == null)
        {
            return;
        }
        boolean flag = updateherowidgetevent.a();
        try
        {
            groupedgridherowidget = new GroupedGridHeroWidget();
            obj = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (UpdateHeroWidgetEvent updateherowidgetevent)
        {
            f.a(updateherowidgetevent);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = new com.amazon.device.home.GroupedGridHeroWidget.EmptyGridProperty();
        ((com.amazon.device.home.GroupedGridHeroWidget.EmptyGridProperty) (obj)).setLabel(updateherowidgetevent.b);
        ((com.amazon.device.home.GroupedGridHeroWidget.EmptyGridProperty) (obj)).setContentIntent(new HeroWidgetActivityStarterIntent(com/cardinalblue/android/piccollage/multitouch/photoproto/activities/MainActivity.getName()));
        groupedgridherowidget.setEmptyGridProperty(((com.amazon.device.home.GroupedGridHeroWidget.EmptyGridProperty) (obj)));
_L1:
        b.updateWidget(groupedgridherowidget);
        return;
        ((List) (obj)).add(a(updateherowidgetevent));
        groupedgridherowidget.setGroups(((List) (obj)));
          goto _L1
    }
}
