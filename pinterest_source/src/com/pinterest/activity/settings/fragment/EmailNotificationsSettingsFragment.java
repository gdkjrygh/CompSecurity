// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.settings.dialog.EmailFrequencyDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.SettingsApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.grid.AdapterFooterView;
import java.util.Hashtable;

public class EmailNotificationsSettingsFragment extends BaseFragment
    implements Scrollable
{

    private static final long DURATION = 300L;
    private static final Hashtable VIEW_KEYS;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    CheckedTextView commentsPinCb;
    View containerLayout;
    CheckedTextView featureAnnouncementCb;
    CheckedTextView feedbackInvitationCb;
    CheckedTextView followsBoardCb;
    AdapterFooterView footer;
    View frequencyBt;
    TextView frequencyTv;
    CheckedTextView getNotifsCb;
    CheckedTextView invitesGroupCb;
    CheckedTextView joinsFromCb;
    CheckedTextView likesPinCb;
    CheckedTextView mightLikeCb;
    CheckedTextView pinsPinCb;
    CheckedTextView priceChangeCb;
    CheckedTextView sendsPinCb;
    CheckedTextView weeklyInspirationCb;

    public EmailNotificationsSettingsFragment()
    {
        _eventsSubscriber = new _cls1();
        _menuId = 0x7f100009;
    }

    private void initUi(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            ButterKnife.a(this, view);
            PinterestJsonObject pinterestjsonobject = MyUser.getJsonUserSettings();
            setCheckBoxes(pinterestjsonobject);
            setFrequency(pinterestjsonobject);
            view = (AdapterFooterView)view.findViewById(0x7f0f01fd);
            view.setState(1);
            view.setShadowVisibility(8);
            return;
        }
    }

    private void initializeViews()
    {
        if (getNotifsCb.isChecked())
        {
            containerLayout.setAlpha(1.0F);
            containerLayout.setVisibility(0);
            return;
        } else
        {
            containerLayout.setAlpha(0.0F);
            containerLayout.setVisibility(8);
            return;
        }
    }

    private void loadSettings()
    {
        SettingsApi.a(new _cls5(), getApiTag());
    }

    private void notifItemClicked(View view)
    {
        if (view == null)
        {
            return;
        }
        view = (CheckedTextView)view;
        boolean flag1 = view.isChecked();
        boolean flag;
        if (!view.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        view.setClickable(false);
        SettingsApi.e((String)VIEW_KEYS.get(Integer.valueOf(view.getId())), String.valueOf(view.isChecked()), new _cls4(flag1), getApiTag());
    }

    private void setCheckBoxes(PinterestJsonObject pinterestjsonobject)
    {
        getNotifsCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(getNotifsCb.getId()))).booleanValue());
        pinsPinCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(pinsPinCb.getId()))).booleanValue());
        likesPinCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(likesPinCb.getId()))).booleanValue());
        followsBoardCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(followsBoardCb.getId()))).booleanValue());
        commentsPinCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(commentsPinCb.getId()))).booleanValue());
        sendsPinCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(sendsPinCb.getId()))).booleanValue());
        joinsFromCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(joinsFromCb.getId()))).booleanValue());
        invitesGroupCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(invitesGroupCb.getId()))).booleanValue());
        priceChangeCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(priceChangeCb.getId()))).booleanValue());
        mightLikeCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(mightLikeCb.getId()))).booleanValue());
        weeklyInspirationCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(weeklyInspirationCb.getId()))).booleanValue());
        featureAnnouncementCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(featureAnnouncementCb.getId()))).booleanValue());
        feedbackInvitationCb.setChecked(pinterestjsonobject.a((String)VIEW_KEYS.get(Integer.valueOf(feedbackInvitationCb.getId()))).booleanValue());
        initializeViews();
    }

    private void setFrequency(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject.a("email_interval", "").equals("daily"))
        {
            pinterestjsonobject = Resources.string(0x7f0703d5);
        } else
        {
            pinterestjsonobject = Resources.string(0x7f0705fe);
        }
        if (frequencyTv != null)
        {
            frequencyTv.setText(pinterestjsonobject);
        }
    }

    private void toggleEmails(final View ctv)
    {
        ctv = (CheckedTextView)ctv;
        final boolean originalSetting = ctv.isChecked();
        if (ctv.isChecked())
        {
            Events.post(new DialogEvent(new _cls2()));
            return;
        }
        boolean flag;
        if (!ctv.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctv.setChecked(flag);
        toggleViews();
        SettingsApi.e((String)VIEW_KEYS.get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()), new _cls3(originalSetting), getApiTag());
    }

    private void toggleViews()
    {
        if (getNotifsCb.isChecked())
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(containerLayout, "alpha", new float[] {
                1.0F
            });
            objectanimator.addListener(new _cls6());
            objectanimator.setDuration(300L).start();
            return;
        } else
        {
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(containerLayout, "alpha", new float[] {
                0.0F
            });
            objectanimator1.addListener(new _cls7());
            objectanimator1.setDuration(300L).start();
            return;
        }
    }

    void frequencyItemClicked(View view)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            Events.post(new DialogEvent(new EmailFrequencyDialog(MyUser.getJsonUserSettings().a("email_interval", ""))));
            return;
        }
    }

    void masterItemClicked(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            toggleEmails(view);
            return;
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/api/model/MyUser$UpdateEvent, new Class[0]);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        loadSettings();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300c0;
    }

    protected void onDeactivate()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/MyUser$UpdateEvent
        });
        super.onDeactivate();
    }

    void onFrequencyClicked(View view)
    {
        frequencyItemClicked(view);
    }

    void onMasterClick(View view)
    {
        masterItemClicked(view);
    }

    void onNotifClick(View view)
    {
        notifItemClicked(view);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f070235);
        initUi(view);
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        VIEW_KEYS = hashtable;
        hashtable.put(Integer.valueOf(0x7f0f01b6), "email_enabled");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01ba), "email_repins");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01bb), "email_likes");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01bc), "email_follows");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c2), "email_comments");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c3), "email_shares");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c4), "email_friends_joining");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c5), "email_collaboration_invite");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c8), "email_product_changes");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01c9), "email_suggestions");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01ca), "email_news");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01cb), "email_updates");
        VIEW_KEYS.put(Integer.valueOf(0x7f0f01cc), "email_feedback_and_research");
    }





    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final EmailNotificationsSettingsFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.MyUser.UpdateEvent updateevent)
        {
            if (MyUser.get() != null)
            {
                setFrequency(MyUser.getJsonUserSettings());
            }
        }

        _cls1()
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            super();
        }
    }


    private class _cls5 extends ApiResponseHandler
    {

        final EmailNotificationsSettingsFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            MyUser.saveUserSettingsMe(apiresponse);
            setCheckBoxes(apiresponse);
        }

        _cls5()
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final EmailNotificationsSettingsFragment this$0;
        final CheckedTextView val$ctv;
        final boolean val$originalSetting;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            ctv.setChecked(originalSetting);
        }

        public void onFinish()
        {
            super.onFinish();
            ctv.setClickable(true);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            try
            {
                apiresponse = MyUser.getJsonUserSettings();
                apiresponse.b((String)EmailNotificationsSettingsFragment.VIEW_KEYS.get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()));
                MyUser.saveUserSettingsMe(apiresponse);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                return;
            }
        }

        _cls4(boolean flag1)
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            ctv = checkedtextview;
            originalSetting = flag1;
            super(final_flag);
        }
    }


    private class _cls2 extends BaseDialog
    {

        final EmailNotificationsSettingsFragment this$0;
        final CheckedTextView val$ctv;
        final boolean val$originalSetting;

        public void onActivityCreated(Bundle bundle)
        {
            super.onActivityCreated(bundle);
            setTitle(0x7f070237);
            setMessage(0x7f070238);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final _cls2 this$1;

                public void onClick(View view)
                {
                    view = ctv;
                    class _cls1 extends ApiResponseHandler
                    {

                        final _cls1 this$2;

                        public void onFailure(Throwable throwable, ApiResponse apiresponse)
                        {
                            super.onFailure(throwable, apiresponse);
                            ctv.setChecked(originalSetting);
                        }

                        public void onSuccess(ApiResponse apiresponse)
                        {
                            super.onSuccess(apiresponse);
                            try
                            {
                                apiresponse = MyUser.getJsonUserSettings();
                                apiresponse.b((String)EmailNotificationsSettingsFragment.VIEW_KEYS.get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()));
                                MyUser.saveUserSettingsMe(apiresponse);
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (ApiResponse apiresponse)
                            {
                                return;
                            }
                        }

                            _cls1(boolean flag)
                            {
                                this$2 = _cls1.this;
                                super(flag);
                            }
                    }

                    boolean flag;
                    if (!ctv.isChecked())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view.setChecked(flag);
                    toggleViews();
                    SettingsApi.e((String)EmailNotificationsSettingsFragment.VIEW_KEYS.get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()), new _cls1(false), getApiTag());
                    dismiss();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            setPositiveButton(0x7f070236, new _cls1());
            class _cls2
                implements android.view.View.OnClickListener
            {

                final _cls2 this$1;

                public void onClick(View view)
                {
                    dismiss();
                }

                _cls2()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            setNegativeButton(0x7f0700af, new _cls2());
        }

        _cls2()
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            ctv = checkedtextview;
            originalSetting = flag;
            super();
        }
    }


    private class _cls3 extends ApiResponseHandler
    {

        final EmailNotificationsSettingsFragment this$0;
        final CheckedTextView val$ctv;
        final boolean val$originalSetting;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            ctv.setChecked(originalSetting);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            try
            {
                apiresponse = MyUser.getJsonUserSettings();
                apiresponse.b((String)EmailNotificationsSettingsFragment.VIEW_KEYS.get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()));
                MyUser.saveUserSettingsMe(apiresponse);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                return;
            }
        }

        _cls3(boolean flag1)
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            ctv = checkedtextview;
            originalSetting = flag1;
            super(final_flag);
        }
    }


    private class _cls6
        implements android.animation.Animator.AnimatorListener
    {

        final EmailNotificationsSettingsFragment this$0;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            animator = ObjectAnimator.ofFloat(footer, "alpha", new float[] {
                1.0F
            });
            footer.setAlpha(0.0F);
            containerLayout.setVisibility(0);
            animator.setDuration(300L).start();
        }

        _cls6()
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.animation.Animator.AnimatorListener
    {

        final EmailNotificationsSettingsFragment this$0;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            containerLayout.setVisibility(8);
            ObjectAnimator.ofFloat(footer, "alpha", new float[] {
                1.0F
            }).setDuration(300L).start();
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            ObjectAnimator.ofFloat(footer, "alpha", new float[] {
                0.0F
            }).setDuration(300L).start();
        }

        _cls7()
        {
            this$0 = EmailNotificationsSettingsFragment.this;
            super();
        }
    }

}
