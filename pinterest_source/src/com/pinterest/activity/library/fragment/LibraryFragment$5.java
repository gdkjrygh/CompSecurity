// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import com.pinterest.activity.library.adapter.LibraryAdapter;
import com.pinterest.activity.library.view.LibrarySectionView;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.schemas.experiences.Placement;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0
    implements com.pinterest.base.riber
{

    final LibraryFragment this$0;

    public void onEventMainThread(owAllPinsPageEvent owallpinspageevent)
    {
        if (LibraryFragment.access$2100(LibraryFragment.this) != null)
        {
            LibraryFragment.access$2100(LibraryFragment.this).showAllPinsPage();
        }
    }

    public void onEventMainThread(com.pinterest.activity.library.model.ent ent)
    {
        if (StringUtils.isNotEmpty(ent.getSortOrder()))
        {
            LibraryFragment.access$1502(LibraryFragment.this, ent.getSortOrder());
            Preferences.persisted().set("PREF_LIBRARY_BOARD_SORT_ORDER", LibraryFragment.access$1500(LibraryFragment.this));
            ((LibraryAdapter)LibraryFragment.access$1600(LibraryFragment.this)).setSortOrder(LibraryFragment.access$1500(LibraryFragment.this));
            LibraryFragment.access$1702(LibraryFragment.this, true);
            LibraryFragment.access$1800(LibraryFragment.this);
            LibraryFragment.access$1900(LibraryFragment.this, LibraryFragment.access$1500(LibraryFragment.this));
            ((LibraryAdapter)LibraryFragment.access$2000(LibraryFragment.this)).resetDataLoaded();
        }
    }

    public void onEventMainThread(com.pinterest.activity.library.view.View.WeightsSetEvent weightssetevent)
    {
        if (MyUser.isUserMe(LibraryFragment.access$400(LibraryFragment.this)))
        {
            EducationHelper.a(Placement.ANDROID_USER_PROFILE_TAKEOVER, LibraryFragment.this);
        }
    }

    public void onEventMainThread(com.pinterest.api.model.braryFragment._cls5 _pcls5)
    {
        if (!_pcls5.wasDeleted() || !MyUser.isUserMe(LibraryFragment.access$400(LibraryFragment.this))) goto _L2; else goto _L1
_L1:
        ((LibraryAdapter)LibraryFragment.access$500(LibraryFragment.this)).setDeletedBoard(_pcls5.getBoard());
_L4:
        Events.removeStickyEvent(_pcls5);
        return;
_L2:
        if (_pcls5.refreshFeed())
        {
            LibraryFragment.access$600(LibraryFragment.this).notifyDataSetInvalidated();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onEventMainThread(com.pinterest.api.model. )
    {
         = .getUser();
        if ( == null || !LibraryFragment.access$1200(LibraryFragment.this).getId().equals(.getUid()))
        {
            return;
        } else
        {
            LibraryFragment.access$302(LibraryFragment.this, );
            LibraryFragment.access$1300(LibraryFragment.this);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.api.model.braryFragment._cls5 _pcls5)
    {
        if (_pcls5.tPin() == null)
        {
            return;
        } else
        {
            LibraryFragment.access$900(LibraryFragment.this);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.api.model.braryFragment._cls5 _pcls5)
    {
        _pcls5 = _pcls5.etUser();
        if (_pcls5 == null || !LibraryFragment.access$1400(LibraryFragment.this).getId().equals(_pcls5.getUid()))
        {
            return;
        } else
        {
            LibraryFragment.access$302(LibraryFragment.this, _pcls5);
            LibraryFragment.access$1300(LibraryFragment.this);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.events.Pin pin)
    {
        if (LibraryFragment.access$1000(LibraryFragment.this) == null)
        {
            return;
        }
        if (pin.a().getBoard() != null)
        {
            LibraryFragment.access$1100(LibraryFragment.this).notifyDataSetChanged();
        }
        LibraryFragment.access$900(LibraryFragment.this);
    }

    public void onEventMainThread(com.pinterest.events.sInvalidated sinvalidated)
    {
        Events.removeStickyEvent(sinvalidated);
        if (!LibraryFragment.access$700(LibraryFragment.this))
        {
            LibraryFragment.access$800(LibraryFragment.this).notifyDataSetInvalidated();
            refresh();
        }
    }

    .WeightsSetEvent()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
