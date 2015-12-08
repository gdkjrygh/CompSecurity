// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.commerce.view.ShopPinsFromButton;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.kit.utils.PStringUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.SquareImageView;
import com.pinterest.ui.text.BlackClickSpan;
import com.pinterest.ui.text.IconView;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryHeaderMetaDataBar

public class LibraryHeaderView extends LinearLayout
{

    TextView _libraryHeaderAbout;
    TextView _libraryHeaderFullName;
    TextView _libraryHeaderLocation;
    SquareImageView _libraryHeaderPhoto;
    TextView _libraryHeaderUserName;
    TextView _libraryHeaderWebsite;
    LibraryHeaderMetaDataBar _metaDataBar;
    ShopPinsFromButton _shopPinsFromButton;
    private User _user;
    IconView _verifiedIcon;

    public LibraryHeaderView(Context context)
    {
        this(context, null);
    }

    public LibraryHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LibraryHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void instantiateLocationTextView()
    {
        if (TextUtils.isEmpty(_user.getLocation()))
        {
            _libraryHeaderLocation.setVisibility(8);
            return;
        }
        String s = _user.getLocation();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        if (!TextUtils.isEmpty(_user.getWebsite()))
        {
            spannablestringbuilder.append(" / ");
        }
        spannablestringbuilder.setSpan(new StyleSpan(1), 0, s.length(), 33);
        _libraryHeaderLocation.setText(spannablestringbuilder);
    }

    private void instantiateWebsiteTextView()
    {
        if (TextUtils.isEmpty(_user.getWebsite()))
        {
            _libraryHeaderWebsite.setVisibility(8);
            return;
        } else
        {
            ViewHelper.setVisibility(_libraryHeaderWebsite, true);
            String s = removeTrailMethods(_user.getWebsite());
            s = (new StringBuilder("<a href='")).append(_user.getWebsite()).append("'>").append(s).append("</a>").toString();
            _libraryHeaderWebsite.setText(BlackClickSpan.getSpannable(s, getResources().getColor(0x7f0e007b)));
            _libraryHeaderWebsite.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
    }

    private void updateUser()
    {
label0:
        {
            if (_user != null)
            {
                _libraryHeaderPhoto.loadUrl(_user.getImageLargeUrl());
                _libraryHeaderPhoto.setOval(Boolean.TRUE.booleanValue());
                _libraryHeaderPhoto.setOnClickListener(new _cls1());
                _metaDataBar.setUser(_user);
                instantiateTextView(_libraryHeaderUserName, (new StringBuilder("@")).append(_user.getUsername()).toString());
                _verifiedIcon.setTint(0x7f0e009c);
                ViewHelper.setVisibility(_verifiedIcon, Constants.isTrue(_user.getVerifiedIdentity()));
                instantiateTextView(_libraryHeaderFullName, _user.getFullName());
                instantiateTextView(_libraryHeaderAbout, _user.getAbout());
                instantiateLocationTextView();
                instantiateWebsiteTextView();
                if (!CommerceHelper.isCommerceEnabled() || _user.getPartner() == null || TextUtils.isEmpty(_user.getCanonicalMerchantDomain()))
                {
                    break label0;
                }
                _shopPinsFromButton.setVisibility(0);
                _shopPinsFromButton.bind(_user.getFirstName(), _user.getCanonicalMerchantDomain());
            }
            return;
        }
        _shopPinsFromButton.setVisibility(8);
    }

    public void init()
    {
        inflate(getContext(), 0x7f0301e5, this);
        ButterKnife.a(this);
    }

    public void instantiateTextView(TextView textview, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            ViewHelper.setVisibility(textview, true);
            textview.setText(s);
            return;
        }
    }

    public String removeTrailMethods(String s)
    {
        String s1 = PStringUtils.stripSchemeFromUrl(s);
        s = s1;
        if (s1.length() > 0)
        {
            s = s1;
            if (s1.charAt(s1.length() - 1) == '/')
            {
                s = s1.substring(0, s1.length() - 1);
            }
        }
        return s;
    }

    public void setUser(User user)
    {
        _user = user;
        updateUser();
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LibraryHeaderView this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PROFILE_IMAGE, ComponentType.NAVIGATION, _user.getUid());
            Events.post(new DialogEvent(UserImageDialog.newInstance(_user.getUid())));
        }

        _cls1()
        {
            this$0 = LibraryHeaderView.this;
            super();
        }
    }

}
