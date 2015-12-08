// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            EditShortcutView, IPlaceSearchPresenter

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding placeSearchPresenter;
    private Binding progressController;
    private Binding shortcutService;
    private Binding supertype;

    public void attach(Linker linker)
    {
        placeSearchPresenter = linker.requestBinding("me.lyft.android.ui.placesearch.IPlaceSearchPresenter", me/lyft/android/ui/placesearch/EditShortcutView, getClass().getClassLoader());
        shortcutService = linker.requestBinding("me.lyft.android.application.shortcuts.IShortcutService", me/lyft/android/ui/placesearch/EditShortcutView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/placesearch/EditShortcutView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/placesearch/EditShortcutView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.placesearch.PlaceSearchView", me/lyft/android/ui/placesearch/EditShortcutView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(placeSearchPresenter);
        set1.add(shortcutService);
        set1.add(appFlow);
        set1.add(progressController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditShortcutView)obj);
    }

    public void injectMembers(EditShortcutView editshortcutview)
    {
        editshortcutview.placeSearchPresenter = (IPlaceSearchPresenter)placeSearchPresenter.get();
        editshortcutview.shortcutService = (IShortcutService)shortcutService.get();
        editshortcutview.appFlow = (AppFlow)appFlow.get();
        editshortcutview.progressController = (IProgressController)progressController.get();
        supertype.injectMembers(editshortcutview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.placesearch.EditShortcutView", false, me/lyft/android/ui/placesearch/EditShortcutView);
    }
}
