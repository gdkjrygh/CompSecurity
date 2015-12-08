// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.dialog.UserEditImpressumDialog;
import com.pinterest.activity.user.dialog.UserEditWebsiteDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

public class UserAboutSitesView extends LinearLayout
{

    private com.pinterest.api.remote.MyUserApi.SettingsApiResponse _aboutUpdateListener;
    protected PTextView _addImpressumTv;
    protected PTextView _addWebsiteTv;
    protected View _divider;
    protected TextView _facebookTv;
    protected LinearLayout _impressumBtContainer;
    protected View _impressumDivider;
    protected PTextView _impressumTv;
    protected LinearLayout _impressumVw;
    protected TextView _twitterTv;
    private User _user;
    protected LinearLayout _websiteBtContainer;
    protected PTextView _websiteTv;
    protected LinearLayout _websiteVw;

    public UserAboutSitesView(Context context)
    {
        this(context, null);
    }

    public UserAboutSitesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void gotoVerifiedUrl(String s)
    {
        if (!ModelHelper.isValid(s))
        {
            return;
        }
        s = new Navigation(Location.BROWSER, s);
        if (_user != null)
        {
            s.putExtra("Referer", _user.getPinterestLink());
        }
        Events.post(s);
    }

    private void init()
    {
        ButterKnife.a(this, LayoutInflater.from(getContext()).inflate(0x7f030208, this, true));
        _websiteTv.setIconTint(Colors.RED);
        _impressumTv.setIconTint(Colors.RED);
    }

    private void updateFreeFormSite(String s, String s1, LinearLayout linearlayout, PTextView ptextview, LinearLayout linearlayout1, PTextView ptextview1)
    {
        boolean flag = MyUser.isUserMe(_user.getUid());
        if (ModelHelper.isValid(s))
        {
            ptextview.setText(s1);
            ptextview.setTag(s);
            linearlayout.setVisibility(0);
            ptextview1.setVisibility(8);
            if (flag)
            {
                ViewHelper.showIconForLongText((TextView)linearlayout1.findViewById(0x7f0f0203), 0x7f020186);
                linearlayout1.setVisibility(0);
            }
        } else
        {
            linearlayout.setVisibility(8);
            linearlayout1.setVisibility(8);
            if (flag)
            {
                ptextview1.setVisibility(0);
                return;
            }
        }
    }

    private void updateImpressum()
    {
        if (_user == null)
        {
            return;
        }
        if (!BooleanUtils.isTrue(_user.getShowImpressum()))
        {
            _impressumDivider.setVisibility(8);
            _impressumVw.setVisibility(8);
            _addImpressumTv.setVisibility(8);
            return;
        } else
        {
            _impressumDivider.setVisibility(0);
            updateFreeFormSite(_user.getImpressumUrl(), Resources.string(0x7f0702f4), _impressumVw, _impressumTv, _impressumBtContainer, _addImpressumTv);
            return;
        }
    }

    private void updateWebsite()
    {
        if (_user != null)
        {
            String s = _user.getWebsite();
            updateFreeFormSite(s, s, _websiteVw, _websiteTv, _websiteBtContainer, _addWebsiteTv);
            if (ModelHelper.isValid(s))
            {
                PTextView ptextview;
                int i;
                if (_user.getWebsiteVerified() == Boolean.TRUE)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                ptextview = _websiteTv;
                if (i != 0)
                {
                    i = 0x7f020201;
                } else
                {
                    i = 0x7f020205;
                }
                ViewHelper.setRightDrawable(ptextview, i);
                return;
            }
        }
    }

    public boolean isEmpty()
    {
        return !MyUser.isUserMe(_user) && _facebookTv.getVisibility() == 8 && _twitterTv.getVisibility() == 8 && _websiteVw.getVisibility() == 8 && _impressumVw.getVisibility() == 8;
    }

    void onEditImpressumClicked()
    {
        UserEditImpressumDialog usereditimpressumdialog = new UserEditImpressumDialog();
        usereditimpressumdialog.addUserUidToArguments(_user.getUid());
        usereditimpressumdialog.setResponseHandler(_aboutUpdateListener);
        Events.post(new DialogEvent(usereditimpressumdialog));
    }

    void onEditWebsiteClicked()
    {
        Events.post(new DialogEvent(new UserEditWebsiteDialog()));
    }

    void onSiteClicked(View view)
    {
        String s;
        s = (String)view.getTag();
        if (StringUtils.isEmpty(s))
        {
            return;
        }
        view.getId();
        JVM INSTR tableswitch 2131690709 2131690710: default 44
    //                   2131690709 67
    //                   2131690710 74;
           goto _L1 _L2 _L3
_L1:
        view = ElementType.PROFILE_URL;
_L5:
        Pinalytics.a(view);
        SiteApi.a(s, new _cls1(s));
        return;
_L2:
        view = ElementType.PROFILE_FACEBOOK;
        continue; /* Loop/switch isn't completed */
_L3:
        view = ElementType.PROFILE_TWITTER;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setAboutUpdateListener(com.pinterest.api.remote.MyUserApi.SettingsApiResponse settingsapiresponse)
    {
        _aboutUpdateListener = settingsapiresponse;
    }

    public void updateSites(User user)
    {
        _user = user;
        if (_user == null)
        {
            return;
        }
        if (ModelHelper.isValid(user.getFacebookUrl()))
        {
            _facebookTv.setTag(user.getFacebookUrl());
            _facebookTv.setVisibility(0);
        } else
        {
            _facebookTv.setVisibility(8);
        }
        if (ModelHelper.isValid(user.getTwitterUrl()))
        {
            _twitterTv.setTag(user.getTwitterUrl());
            _twitterTv.setVisibility(0);
        } else
        {
            _twitterTv.setVisibility(8);
        }
        if (_facebookTv.getVisibility() == 0 && _twitterTv.getVisibility() == 0)
        {
            _divider.setVisibility(0);
        } else
        {
            _divider.setVisibility(8);
        }
        updateWebsite();
        updateImpressum();
    }


    private class _cls1 extends ApiResponseHandler
    {

        final UserAboutSitesView this$0;
        final String val$url;

        public void onSuccess(final ApiResponse innerUrl)
        {
            super.onSuccess(innerUrl);
            Object obj = (PinterestJsonObject)innerUrl.getData();
            String s = ((PinterestJsonObject) (obj)).a("redirect_status", "");
            innerUrl = ((PinterestJsonObject) (obj)).a("url", url);
            obj = ((PinterestJsonObject) (obj)).a("message", Resources.string(0x7f070419));
            if (s.equalsIgnoreCase("blocked"))
            {
                innerUrl = new BaseDialog();
                innerUrl.setTitle(0x7f070565);
                innerUrl.setMessage(((String) (obj)));
                innerUrl.setPositiveButton(0x7f0703d2, null);
                Events.post(new DialogEvent(innerUrl));
                return;
            }
            if (s.equalsIgnoreCase("suspicious"))
            {
                BaseDialog basedialog = new BaseDialog();
                basedialog.setTitle(0x7f0705e7);
                basedialog.setMessage(((String) (obj)));
                basedialog.setNegativeButton(0x7f0700af, null);
                class _cls1
                    implements android.view.View.OnClickListener
                {

                    final _cls1 this$1;
                    final String val$innerUrl;

                    public void onClick(View view)
                    {
                        gotoVerifiedUrl(innerUrl);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    innerUrl = s;
                    super();
                }
                }

                basedialog.setPositiveButton(0x7f070524, new _cls1());
                Events.post(new DialogEvent(basedialog));
                return;
            } else
            {
                gotoVerifiedUrl(innerUrl);
                return;
            }
        }

        _cls1(String s)
        {
            this$0 = UserAboutSitesView.this;
            url = s;
            super(final_flag);
        }
    }

}
