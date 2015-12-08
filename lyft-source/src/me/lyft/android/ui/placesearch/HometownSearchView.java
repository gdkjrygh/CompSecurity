// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AddressUtils;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.ui.profile.EditProfileSession;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class HometownSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    private EditProfileSession editProfileSession;
    private final me.lyft.android.ui.profile.ProfileScreens.EditProfileScreen screenParams;

    public HometownSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        screenParams = (me.lyft.android.ui.profile.ProfileScreens.EditProfileScreen)context.a();
        editProfileSession = screenParams.getEditProfileSession();
    }

    protected Observable getAutocompletePlaces(String s)
    {
        return placeSearchPresenter.loadCityAutocompleteSuggestions(s);
    }

    protected int getHintId()
    {
        return 0x7f0702bd;
    }

    protected Observable getInitialPlaces()
    {
        return Observable.empty();
    }

    protected String getInitialQuery()
    {
        return editProfileSession.getHometown();
    }

    protected int getInputIconId()
    {
        return 0x7f020171;
    }

    protected String getSourceForAnalytics()
    {
        return "city";
    }

    public String joinTitleSubtitle(String s, String s1)
    {
        if (s.equalsIgnoreCase(s1))
        {
            return s;
        } else
        {
            return Strings.joinWithDelimiter(", ", new String[] {
                s, s1
            });
        }
    }

    protected void onPlaceSelected(Location location)
    {
        String s = location.getDisplayName();
        location = AddressUtils.getStateOrCountry(location.getRoutableAddress());
        editProfileSession.setHometown(joinTitleSubtitle(s, location));
        appFlow.goBack();
    }
}
