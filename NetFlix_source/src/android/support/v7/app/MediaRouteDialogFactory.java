// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            MediaRouteChooserDialogFragment, MediaRouteControllerDialogFragment

public class MediaRouteDialogFactory
{

    private static final MediaRouteDialogFactory sDefault = new MediaRouteDialogFactory();

    public MediaRouteDialogFactory()
    {
    }

    public static MediaRouteDialogFactory getDefault()
    {
        return sDefault;
    }

    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment()
    {
        return new MediaRouteChooserDialogFragment();
    }

    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment()
    {
        return new MediaRouteControllerDialogFragment();
    }

}
