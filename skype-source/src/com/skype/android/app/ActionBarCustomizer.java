// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.app.chat.ParticipantActivity;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.inject.LifecycleAdapter;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.ActionSpinner;
import com.skype.android.widget.SymbolView;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.app:
//            ActionBarProvider, LayoutExperience, Navigation

public class ActionBarCustomizer extends LifecycleAdapter
{

    private static final int NO_REQUEST_CODE = -1000;
    private final Activity activity;
    private SymbolView cameraSymbolView;
    private SymbolView chatBubbleSymbolView;
    private boolean clickableTitle;
    private Contact contact;
    private final ContactUtil contactUtil;
    private Conversation conversation;
    private final ConversationUtil conversationUtil;
    private EventSubscriberBinder eventBinder;
    private final LayoutExperience layoutExperience;
    private final SkyLib lib;
    private final Navigation navigation;
    private int requestCode;
    private TextView subtitleView;
    private final TimeAnomalyTelemetry timeAnomalyTelemetry;
    private final TimeUtil timeUtil;
    private TextView titleView;
    private int toolbarLayoutId;

    public ActionBarCustomizer(Activity activity1, SkyLib skylib, ContactUtil contactutil, ConversationUtil conversationutil, TimeUtil timeutil, Navigation navigation1, EventBus eventbus, 
            LayoutExperience layoutexperience, TimeAnomalyTelemetry timeanomalytelemetry)
    {
        toolbarLayoutId = 0x7f1001e0;
        requestCode = -1000;
        activity = activity1;
        lib = skylib;
        conversationUtil = conversationutil;
        contactUtil = contactutil;
        timeUtil = timeutil;
        navigation = navigation1;
        layoutExperience = layoutexperience;
        timeAnomalyTelemetry = timeanomalytelemetry;
        eventBinder = new EventSubscriberBinder(eventbus, this);
    }

    private View applyConversationProfileTitleView()
    {
        return applyCustomTitleView(0x7f03011d);
    }

    private View applyCustomTitleView()
    {
        return applyCustomTitleView(0x7f03011e);
    }

    private View applyCustomTitleView(int i)
    {
        View view = activity.getLayoutInflater().inflate(i, null);
        applyCustomViewToActionBar(view);
        setChildrenGravity(16);
        return view;
    }

    private void applyCustomViewToActionBar(View view)
    {
        ActionBarProvider actionbarprovider = (ActionBarProvider)activity;
        actionbarprovider.getSupportActionBar().b();
        actionbarprovider.getSupportActionBar().a(view);
        actionbarprovider.getSupportActionBar().c();
        actionbarprovider.getSupportActionBar().a(true);
        titleView = (TextView)view.findViewById(0x7f10054f);
        subtitleView = (TextView)view.findViewById(0x7f100550);
        cameraSymbolView = (SymbolView)view.findViewById(0x7f100551);
        chatBubbleSymbolView = (SymbolView)view.findViewById(0x7f100552);
        if ((new AccessibilityUtil(view.getContext())).a())
        {
            view = view.findViewById(0x7f100553);
            if (view != null)
            {
                view.setVisibility(0);
                titleView.setTag(view);
                AccessibilityUtil.a(new View[] {
                    titleView
                });
                AccessibilityUtil.a(new View[] {
                    subtitleView
                });
            }
        }
        view = actionbarprovider.getSupportActionBar().d();
        if (layoutExperience.isMultipane())
        {
            ((ViewGroup)view.getParent().getParent().getParent()).getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final ActionBarCustomizer this$0;

                public final void onGlobalLayout()
                {
                    adjustCustomViewPadding();
                }

            
            {
                this$0 = ActionBarCustomizer.this;
                super();
            }
            });
        }
    }

    private View applyOngoingCallTitleView()
    {
        return applyCustomTitleView(0x7f03011c);
    }

    private int getActionMenuItemsCount(ViewGroup viewgroup)
    {
        int k = 0;
        int j = 0;
        while (j < viewgroup.getChildCount()) 
        {
            View view = viewgroup.getChildAt(j);
            int i;
            if (isActionMenuItem(view))
            {
                i = k + 1;
            } else
            {
                i = k;
                if (view instanceof ViewGroup)
                {
                    i = k + getActionMenuItemsCount((ViewGroup)view);
                }
            }
            j++;
            k = i;
        }
        return k;
    }

    private ImageView getNativeLogoImageView()
    {
        ImageView imageview1 = (ImageView)activity.findViewById(0x102002c);
        ImageView imageview = imageview1;
        if (imageview1 == null)
        {
            imageview = (ImageView)activity.findViewById(0x7f100007);
        }
        return imageview;
    }

    private boolean isActionMenuItem(View view)
    {
        return view.getClass().getSimpleName().equals("ActionMenuItemView") || (view instanceof ActionSpinner);
    }

    private void setSubtitleFromCallDuration(Conversation conversation1)
    {
        Object obj;
        Object obj2;
        long l;
        long l1;
        l = TimeUtil.a();
        l1 = conversation1.getLiveStartTimestampProp();
        obj = "00:00";
        obj2 = "00:00";
        Object obj1 = TimeUtil.b(l, l1);
        obj = obj1;
        Object obj3 = timeUtil;
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        long l2 = (0xffffffffL & l) - (0xffffffffL & l1);
        if (l2 < 0L) goto _L2; else goto _L3
_L3:
        obj = obj1;
        obj3 = ((TimeUtil) (obj3)).a(l2);
        obj = obj3;
        obj2 = obj1;
        obj1 = obj;
_L5:
        int i = conversation1.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList.length;
        setSubtitle(activity.getString(0x7f0802fc, new Object[] {
            Integer.valueOf(i), obj2
        }), ((CharSequence) (obj1)));
        return;
_L2:
        obj = obj1;
        try
        {
            throw new TimeAnomalyException(l1, l, TimeUnit.SECONDS);
        }
        catch (TimeAnomalyException timeanomalyexception)
        {
            timeAnomalyTelemetry.a(timeanomalyexception, conversation1.getTypeProp(), "ActionBarCustomizer#[call]");
        }
        timeanomalyexception = ((TimeAnomalyException) (obj2));
        obj2 = obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void setSubtitleWithColor(CharSequence charsequence, int i)
    {
        subtitleView.setText(charsequence);
        subtitleView.setTextColor(i);
        subtitleView.setContentDescription(charsequence);
        updateTitleDelegateContentDescription();
    }

    private void setTitleText(Contact contact1)
    {
        contactUtil.a(titleView, contact1);
        updateTitleDelegateContentDescription();
    }

    private void setTitleText(CharSequence charsequence)
    {
        titleView.setText(charsequence);
        updateTitleDelegateContentDescription();
    }

    private void updateTitleDelegateContentDescription()
    {
        if (titleView.getTag() != null && (titleView.getTag() instanceof View))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(titleView.getText());
            String s;
            if (subtitleView != null && subtitleView.getVisibility() == 0)
            {
                s = (new StringBuilder(", ")).append(subtitleView.getContentDescription()).toString();
            } else
            {
                s = "";
            }
            s = stringbuilder.append(s).toString();
            if (clickableTitle)
            {
                s = activity.getString(0x7f0800fb, new Object[] {
                    s
                });
            }
            ((View)titleView.getTag()).setContentDescription(s);
        }
    }

    public void adjustCustomViewPadding()
    {
        View view;
        if (layoutExperience.isMultipane())
        {
            if ((view = ((ActionBarProvider)activity).getSupportActionBar().d()) != null)
            {
                int i = getActionMenuItemsCount((ViewGroup)view.getParent().getParent().getParent());
                Resources resources = activity.getResources();
                if (i > 0)
                {
                    i = 0x7f0c006b;
                } else
                {
                    i = 0x7f0c006a;
                }
                i = resources.getDimensionPixelSize(i);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
                return;
            }
        }
    }

    public void fixViewPaddingForOverlayedActionBar(View view)
    {
        view.setPadding(0, activity.getResources().getDimensionPixelSize(0x7f0c0006), 0, 0);
    }

    public void makeLogoBig()
    {
        Object obj = getNativeLogoImageView();
        if (obj != null)
        {
            ((ImageView) (obj)).setAdjustViewBounds(false);
            ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER);
            obj = (android.view.ViewGroup.MarginLayoutParams)((ImageView) (obj)).getLayoutParams();
            obj.topMargin = 0;
            obj.bottomMargin = 0;
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONTACT_AVAILABILITY || onpropertychange.getPropKey() == PROPKEY.CONTACT_FULLNAME || onpropertychange.getPropKey() == PROPKEY.CONTACT_DISPLAYNAME;
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.CONVERSATION_CONSUMPTION_HORIZON;
    }

    void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        if (titleView != null && titleView.getVisibility() != 0 || contact == null || contact.getObjectID() != onpropertychange.getSender().getObjectID()) goto _L2; else goto _L1
_L1:
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_FULLNAME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_DISPLAYNAME.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 85
    //                   2 85
    //                   3 85;
           goto _L2 _L3 _L3 _L3
_L2:
        return;
_L3:
        setTitleFromContact((Contact)onpropertychange.getSender(), clickableTitle, requestCode);
        return;
    }

    public void onStart()
    {
        eventBinder.bind();
    }

    public void onStop()
    {
        eventBinder.unbind();
    }

    public void setBlueTheme(boolean flag)
    {
        int i = activity.getResources().getColor(0x7f0f00d3);
        titleView.setTextColor(i);
        if (subtitleView != null)
        {
            subtitleView.setTextColor(i);
        }
        android.graphics.drawable.Drawable drawable = activity.getResources().getDrawable(0x7f020042);
        ((ActionBarProvider)activity).getSupportActionBar().a(drawable);
        if (flag)
        {
            ((ActionBarProvider)activity).getSupportActionBar().a(0x7f020000);
        }
    }

    public void setChildrenGravity(int i)
    {
        ViewGroup viewgroup = (ViewGroup)activity.findViewById(toolbarLayoutId);
        if (viewgroup != null)
        {
            for (int j = 0; j < viewgroup.getChildCount(); j++)
            {
                android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getChildAt(j).getLayoutParams();
                if (layoutparams instanceof android.support.v7.widget.Toolbar.b)
                {
                    ((android.support.v7.widget.Toolbar.b)layoutparams).a = i;
                }
            }

        }
    }

    public void setSubtitle(CharSequence charsequence)
    {
        setSubtitleWithColor(charsequence, -1);
    }

    public void setSubtitle(CharSequence charsequence, CharSequence charsequence1)
    {
        subtitleView.setText(charsequence);
        subtitleView.setContentDescription(charsequence1);
    }

    public void setSubtitleCompoundDrawable(int i)
    {
        if (subtitleView != null)
        {
            subtitleView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    public void setSubtitleVisiblity(int i)
    {
        if (subtitleView != null)
        {
            subtitleView.setVisibility(i);
        }
    }

    public void setTitle(int i)
    {
        setTitle(activity.getString(i));
    }

    public void setTitle(String s)
    {
        applyCustomTitleView();
        setTitleText(s);
    }

    public void setTitleCompoundDrawable(int i)
    {
        titleView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public void setTitleFromContact(Contact contact1, boolean flag)
    {
        setTitleFromContact(contact1, flag, -1000);
    }

    public void setTitleFromContact(Contact contact1, boolean flag, final int requestCode)
    {
        this.requestCode = requestCode;
        clickableTitle = flag;
        applyCustomTitleView();
        contactUtil.a(titleView, contact1.getTypeProp(), contact1.getAvailabilityProp());
        setTitleText(contact1);
        titleView.getParent().requestLayout();
        contact = contact1;
        titleView.setFocusable(flag);
        if (flag)
        {
            titleView.setTextColor(activity.getResources().getColor(0x7f0f00f9));
            ContactUtil.a(titleView);
            titleView.setOnClickListener(new android.view.View.OnClickListener() {

                final ActionBarCustomizer this$0;
                final int val$requestCode;

                public final void onClick(View view)
                {
                    if (requestCode == -1000)
                    {
                        navigation.profile(contact);
                        return;
                    } else
                    {
                        navigation.profileForResult(contact, ActionBarCustomizer.this.requestCode);
                        return;
                    }
                }

            
            {
                this$0 = ActionBarCustomizer.this;
                requestCode = i;
                super();
            }
            });
        }
    }

    public void setTitleFromConversation(Conversation conversation1, boolean flag, boolean flag1)
    {
        setTitleFromConversation(conversation1, flag, false, -1000, false);
        if (!flag1)
        {
            titleView.setVisibility(8);
        }
    }

    public void setTitleFromConversation(final Conversation conversation, boolean flag, boolean flag1, int i, boolean flag2)
    {
        clickableTitle = flag1;
        if (flag)
        {
            this.conversation = conversation;
        }
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            ContactImpl contactimpl = new ContactImpl();
            lib.getContact(conversation.getIdentityProp(), contactimpl);
            setTitleFromContact(contactimpl, flag1, i);
        } else
        {
            if (flag2)
            {
                applyConversationProfileTitleView();
                i = conversation.getParticipants(com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS).m_participantObjectIDList.length;
                setSubtitleWithColor(activity.getString(0x7f0802fb, new Object[] {
                    Integer.valueOf(i)
                }), 0xff888888);
            } else
            {
                applyCustomTitleView();
            }
            setTitleText(conversationUtil.m(conversation));
            titleView.setFocusable(flag1);
            if (flag1)
            {
                titleView.setTextColor(activity.getResources().getColor(0x7f0f00f9));
                titleView.setOnClickListener(new android.view.View.OnClickListener() {

                    final ActionBarCustomizer this$0;
                    final Conversation val$conversation;

                    public final void onClick(View view)
                    {
                        navigation.startIntentFor(conversation, com/skype/android/app/chat/ParticipantActivity);
                    }

            
            {
                this$0 = ActionBarCustomizer.this;
                conversation = conversation1;
                super();
            }
                });
                return;
            }
        }
    }

    public void setTitleFromOngoingConversation(Conversation conversation1, int i)
    {
        ActionBarProvider actionbarprovider = (ActionBarProvider)activity;
        conversation = conversation1;
        applyOngoingCallTitleView();
        actionbarprovider.getSupportActionBar().b(true);
        setBlueTheme(true);
        updateTitleFromLiveConversation();
        if (activity.getWindow().getAttributes().type == 1000)
        {
            setSubtitleVisiblity(8);
        } else
        {
            activity.findViewById(0x7f10054e).setPadding(0, 0, activity.getResources().getDimensionPixelSize(0x7f0c006c), 0);
            subtitleView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            setSubtitleFromCallDuration(conversation1);
        }
        updateTitleDelegateContentDescription();
    }

    public void setTitleFromOngoingConversation(Conversation conversation1, int i, android.view.View.OnClickListener onclicklistener)
    {
        setTitleFromOngoingConversation(conversation1, i);
        boolean flag;
        if (onclicklistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        clickableTitle = flag;
        titleView.setOnClickListener(onclicklistener);
        subtitleView.setOnClickListener(onclicklistener);
        cameraSymbolView.setOnClickListener(onclicklistener);
        chatBubbleSymbolView.setOnClickListener(onclicklistener);
    }

    public void setTitleWithRecents(int i)
    {
        setTitleWithRecents(activity.getString(i));
    }

    public void setTitleWithRecents(String s)
    {
        applyCustomTitleView();
        setTitleText(s);
    }

    public void setToolbarLayoutId(int i)
    {
        toolbarLayoutId = i;
    }

    public void setWhiteOnBlueTheme(boolean flag)
    {
        int i = activity.getResources().getColor(0x7f0f009f);
        titleView.setTextColor(i);
        if (subtitleView != null)
        {
            subtitleView.setTextColor(i);
        }
        android.graphics.drawable.Drawable drawable = activity.getResources().getDrawable(0x7f020043);
        ((ActionBarProvider)activity).getSupportActionBar().a(drawable);
        if (flag)
        {
            ((ActionBarProvider)activity).getSupportActionBar().a(0x7f020001);
        }
    }

    public void setWhiteTheme(boolean flag)
    {
        int i = activity.getResources().getColor(0x7f0f009f);
        titleView.setTextColor(i);
        if (subtitleView != null)
        {
            subtitleView.setTextColor(i);
        }
        ((ActionBarProvider)activity).getSupportActionBar().a(null);
        if (flag)
        {
            ((ActionBarProvider)activity).getSupportActionBar().a(0x7f020001);
        }
    }

    public void updateCallDuration(Conversation conversation1)
    {
        if (conversation1.getLocalLiveStatusProp() != com.skype.Conversation.LOCAL_LIVESTATUS.IM_LIVE) goto _L2; else goto _L1
_L1:
        setSubtitleFromCallDuration(conversation1);
_L4:
        updateTitleDelegateContentDescription();
        return;
_L2:
        if (ConversationUtil.s(conversation1))
        {
            setSubtitle(activity.getString(0x7f08046f));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void updateTitleFromLiveConversation()
    {
        if (conversation != null && titleView != null)
        {
            setTitleText(conversationUtil.n(conversation));
        }
    }



}
