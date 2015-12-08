// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.view.animation.DecelerateInterpolator;
import com.facebook.UiLifecycleHelper;
import com.facebook.widget.FacebookDialog;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.contacts.UploadContactsUtil;
import com.pinterest.activity.pin.fragment.PinFragment;
import com.pinterest.activity.pin.fragment.PinSwipeFragment;
import com.pinterest.activity.task.adapter.MainViewAdapter;
import com.pinterest.activity.task.event.CommandEvent;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.model.NavigationList;
import com.pinterest.activity.task.view.MainViewPager;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.events.SocialShareEvent;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.ui.megaphone.BaseNagEvent;
import com.pinterest.ui.megaphone.NagUtils;
import com.pinterest.ui.menu.BoardContextMenu;
import com.pinterest.ui.menu.PinContextMenu;
import com.pinterest.ui.menu.ShowBoardContextMenuEvent;
import com.pinterest.ui.menu.ShowPinContextMenuEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class this._cls0
    implements com.pinterest.base.bscriber
{

    final MainActivity this$0;

    public void onEventMainThread(CommandEvent commandevent)
    {
        switch (commandevent.getId())
        {
        default:
            return;

        case 1: // '\001'
            MainActivity.access$500(MainActivity.this);
            return;

        case 2: // '\002'
            MainActivity.access$600(MainActivity.this);
            return;

        case 3: // '\003'
            UploadContactsUtil.setStoreContacts(true);
            return;

        case 4: // '\004'
            Events.post(new com.pinterest.base.onnectEvent(com.pinterest.base.FACEBOOK));
            return;

        case 5: // '\005'
            Experiences.c().d(Experiences.b);
            return;

        case 6: // '\006'
            Events.post(new com.pinterest.activity.nux.fragment.gment.UndoRebuildFeedEvent());
            break;
        }
    }

    public void onEventMainThread(ToastEvent toastevent)
    {
        if (!EducationHelper.c())
        {
            show(toastevent.getToast());
        }
    }

    public void onEventMainThread(com.pinterest.activity.task.model.ve ve)
    {
        if (MainActivity.access$100(MainActivity.this) != null)
        {
            MainActivity.access$100(MainActivity.this).remove(ve.getNavigationItems());
        }
    }

    public void onEventMainThread(Navigation navigation)
    {
        if (MyUser.hasAccessToken() || navigation != null && Location.BROWSER == navigation.getLocation())
        {
            show(new Navigation[] {
                navigation
            });
            return;
        }
        if (MainActivity.access$700(MainActivity.this) >= 0)
        {
            ActivityHelper.goSplash(MainActivity.this);
            finish();
            return;
        } else
        {
            int _tmp = MainActivity.access$708(MainActivity.this);
            show(new Navigation[] {
                navigation
            });
            return;
        }
    }

    public void onEventMainThread(NavigationList navigationlist)
    {
        show(navigationlist);
    }

    public void onEventMainThread(com.pinterest.activity.task.view.ontrolEvent ontrolevent)
    {
        if (MainActivity.access$000(MainActivity.this) == null)
        {
            return;
        }
        switch (ontrolevent.getType())
        {
        default:
            return;

        case 0: // '\0'
            MainActivity.access$000(MainActivity.this).setDragEnabled(false);
            return;

        case 1: // '\001'
            MainActivity.access$000(MainActivity.this).setDragEnabled(true);
            return;

        case 2: // '\002'
            ontrolevent = new AnimatorSet();
            ontrolevent.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "alpha", new float[] {
                    0.7F
                }), ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "scaleX", new float[] {
                    0.87F
                }), ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "scaleY", new float[] {
                    0.87F
                })
            });
            ontrolevent.setInterpolator(new DecelerateInterpolator());
            ontrolevent.setDuration(320L);
            ontrolevent.start();
            return;

        case 3: // '\003'
            ontrolevent = new AnimatorSet();
            break;
        }
        ontrolevent.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "alpha", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "scaleX", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(MainActivity.access$000(MainActivity.this), "scaleY", new float[] {
                1.0F
            })
        });
        ontrolevent.setInterpolator(new DecelerateInterpolator());
        ontrolevent.setDuration(360L);
        ontrolevent.start();
    }

    public void onEventMainThread(com.pinterest.api.model. )
    {
        if (MainActivity.access$100(MainActivity.this) != null && .wasDeleted())
        {
            MainActivity.access$100(MainActivity.this).remove(new Navigation(Location.PIN, .getPin()));
             = MainActivity.access$100(MainActivity.this).getFragments();
            if ( != null)
            {
                 = .iterator();
                do
                {
                    if (!.hasNext())
                    {
                        break;
                    }
                    Fragment fragment = (Fragment).next();
                    if ((fragment instanceof PinSwipeFragment) && (((PinSwipeFragment)fragment).getActiveFragment() instanceof PinFragment) && ((PinSwipeFragment)fragment).getViewAdapter().getCount() == 1)
                    {
                        MainActivity.access$100(MainActivity.this).remove((BaseFragment)fragment);
                    }
                } while (true);
            }
        }
    }

    public void onEventMainThread(com.pinterest.experience.erienceEvent erienceevent)
    {
        if (Experiences.a.equalsIgnoreCase(erienceevent.a))
        {
            NagUtils.showNag(Experiences.a, new BaseNagEvent());
        } else
        if (Experiences.b.equalsIgnoreCase(erienceevent.a))
        {
            erienceevent = Experiences.b(erienceevent.a);
            if (erienceevent != null && ((ExperienceValue) (erienceevent)).f != null)
            {
                ActivityHelper.goNUXExperience(MainActivity.this);
                return;
            }
        }
    }

    public void onEventMainThread(com.pinterest.experiment.erimentsLoaded erimentsloaded)
    {
        if (Experiments.b(false))
        {
            MainActivity.access$800(MainActivity.this);
        }
    }

    public void onEventMainThread(com.pinterest.fragment.agment.GiftwrapNUXEvent giftwrapnuxevent)
    {
        Experiences.b(String.valueOf(Experience.ANDROID_WARM_SEO_NUX_GIFTWRAP_INTEREST_PICKER.getValue()));
        ActivityHelper.goNUXExperience(MainActivity.this);
    }

    public void onEventMainThread(SocialShareEvent socialshareevent)
    {
        MainActivity.access$302(MainActivity.this, socialshareevent);
        socialshareevent = ((com.facebook.widget.ShareDialogBuilder)(new com.facebook.widget.ShareDialogBuilder(MainActivity.this)).setLink(socialshareevent.link)).build();
        MainActivity.access$400(MainActivity.this).trackPendingDialogCall(socialshareevent.present());
    }

    public void onEventMainThread(com.pinterest.ui.actionsheet.ment.ActionSheetEvent actionsheetevent)
    {
        FragmentHelper.replaceFragment(getSupportFragmentManager(), 0x7f0f008c, actionsheetevent.getFragment(), true, com.pinterest.activity.Animation.NONE);
    }

    public void onEventMainThread(ShowBoardContextMenuEvent showboardcontextmenuevent)
    {
        (new BoardContextMenu()).show(MainActivity.access$200(MainActivity.this), showboardcontextmenuevent.getBoard());
    }

    public void onEventMainThread(ShowPinContextMenuEvent showpincontextmenuevent)
    {
        PinContextMenu pincontextmenu = new PinContextMenu();
        Fragment fragment = (Fragment)MainActivity.access$100(MainActivity.this).getFragments().get(MainActivity.access$000(MainActivity.this).getCurrentItem());
        if (fragment instanceof BaseFragment)
        {
            pincontextmenu.setFragment((BaseFragment)fragment);
        }
        pincontextmenu.show(MainActivity.access$200(MainActivity.this), showpincontextmenuevent.getPin());
    }

    ionSheetEvent()
    {
        this$0 = MainActivity.this;
        super();
    }
}
