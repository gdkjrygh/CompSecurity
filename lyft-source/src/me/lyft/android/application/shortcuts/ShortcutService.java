// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.shortcuts;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.domain.shortcuts.ShortcutType;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.ShortcutDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.shortcuts:
//            IShortcutService, ShortcutMapper

public class ShortcutService
    implements IShortcutService
{

    public static final String HOME_LABEL = "home";
    public static final String WORK_LABEL = "work";
    private final ILyftApi lyftApi;
    private final IUserSession userSession;

    public ShortcutService(IUserSession iusersession, ILyftApi ilyftapi)
    {
        userSession = iusersession;
        lyftApi = ilyftapi;
    }

    public List getShortcuts()
    {
        List list = ShortcutMapper.fromDTOs((List)Objects.firstNonNull(userSession.getUser().getShortcuts(), new ArrayList()));
        if (!Iterables.contains(list, new Func1() {

        final ShortcutService this$0;

        public Boolean call(Shortcut shortcut)
        {
            return Boolean.valueOf(shortcut.isWork());
        }

        public volatile Object call(Object obj)
        {
            return call((Shortcut)obj);
        }

            
            {
                this$0 = ShortcutService.this;
                super();
            }
    }))
        {
            list.add(Shortcut.create(ShortcutType.WORK, NullLocation.getInstance()));
        }
        if (!Iterables.contains(list, new Func1() {

        final ShortcutService this$0;

        public Boolean call(Shortcut shortcut)
        {
            return Boolean.valueOf(shortcut.isHome());
        }

        public volatile Object call(Object obj)
        {
            return call((Shortcut)obj);
        }

            
            {
                this$0 = ShortcutService.this;
                super();
            }
    }))
        {
            list.add(Shortcut.create(ShortcutType.HOME, NullLocation.getInstance()));
        }
        return list;
    }

    public Observable saveShortcut(ShortcutType shortcuttype, Location location)
    {
        if (shortcuttype == ShortcutType.HOME)
        {
            shortcuttype = "home";
        } else
        {
            shortcuttype = "work";
        }
        shortcuttype = new ShortcutDTO(shortcuttype, LocationMapper.fromLocationDomain(location));
        return lyftApi.createUserShortcut(userSession.getUser().getId(), shortcuttype).map(Unit.func1());
    }
}
