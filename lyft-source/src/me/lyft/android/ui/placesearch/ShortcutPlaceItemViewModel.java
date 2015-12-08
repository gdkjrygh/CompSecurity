// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.res.Resources;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.domain.shortcuts.ShortcutType;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel

public final class ShortcutPlaceItemViewModel
    implements IPlaceItemViewModel
{

    private final String address;
    private AppFlow appFlow;
    private final boolean hasLocation;
    private final boolean isWork;
    private final Location location;
    private Resources resources;
    private Observer selectionObserver;
    private Shortcut shortcut;

    private ShortcutPlaceItemViewModel(Shortcut shortcut1, AppFlow appflow, Resources resources1)
    {
        boolean flag1 = true;
        super();
        shortcut = shortcut1;
        appFlow = appflow;
        resources = resources1;
        boolean flag;
        if (shortcut1.getType() == ShortcutType.WORK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isWork = flag;
        if (!shortcut1.getLocation().isNull())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        hasLocation = flag;
        address = shortcut1.getLocation().getDisplayName();
        location = shortcut1.getLocation();
        if (hasLocation)
        {
            location.setPlaceType(getPlaceTypeForAnalytics());
        }
    }

    public static ShortcutPlaceItemViewModel create(Shortcut shortcut1, AppFlow appflow, Resources resources1)
    {
        return new ShortcutPlaceItemViewModel(shortcut1, appflow, resources1);
    }

    public int getIconResourceId()
    {
        return !isWork ? 0x7f020166 : 0x7f0201ce;
    }

    public me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics()
    {
        return me.lyft.android.domain.location.Location.PlaceType.SHORTCUT;
    }

    public String getSubtitle()
    {
        return address;
    }

    public String getTitle()
    {
        if (hasLocation)
        {
            if (isWork)
            {
                return resources.getString(0x7f0703a2);
            } else
            {
                return resources.getString(0x7f07019f);
            }
        }
        if (isWork)
        {
            return resources.getString(0x7f070062);
        } else
        {
            return resources.getString(0x7f070061);
        }
    }

    public boolean isEditVisible()
    {
        return hasLocation;
    }

    public void onEdit()
    {
        appFlow.goTo(new PlaceSearchScreens.EditShortcut(shortcut));
    }

    public void onSelected()
    {
        if (hasLocation)
        {
            selectionObserver.onNext(location);
            return;
        } else
        {
            appFlow.goTo(new PlaceSearchScreens.EditShortcut(shortcut));
            return;
        }
    }

    public void setSelectionObserver(Observer observer)
    {
        selectionObserver = observer;
    }
}
