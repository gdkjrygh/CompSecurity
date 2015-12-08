// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.comments:
//            TrackCommentsActivity

public final class  extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b baseLayoutHelper;
    private b imageOperations;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/comments/TrackCommentsActivity, getClass().getClassLoader());
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/comments/TrackCommentsActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/comments/TrackCommentsActivity, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/comments/TrackCommentsActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/comments/TrackCommentsActivity, getClass().getClassLoader(), false);
    }

    public final TrackCommentsActivity get()
    {
        TrackCommentsActivity trackcommentsactivity = new TrackCommentsActivity();
        injectMembers(trackcommentsactivity);
        return trackcommentsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(actionBarHelper);
        set1.add(baseLayoutHelper);
        set1.add(imageOperations);
        set1.add(supertype);
    }

    public final void injectMembers(TrackCommentsActivity trackcommentsactivity)
    {
        trackcommentsactivity.playerController = (PlayerController)playerController.get();
        trackcommentsactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        trackcommentsactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        trackcommentsactivity.imageOperations = (ImageOperations)imageOperations.get();
        supertype.injectMembers(trackcommentsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((TrackCommentsActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.comments.TrackCommentsActivity", "members/com.soundcloud.android.comments.TrackCommentsActivity", false, com/soundcloud/android/comments/TrackCommentsActivity);
    }
}
