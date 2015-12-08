// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.domain.profile.ProfileFieldMapper;
import me.lyft.android.domain.profile.ProfileFields;
import me.lyft.android.infrastructure.lyft.constants.Constants;

public class ProfileBioWidgetView extends LinearLayout
{

    TextView aboutTextView;
    IConstantsProvider constantsProvider;
    private ProfileFields defaultProfileFields;
    TextView homeTownTextView;
    TextView musicTextView;

    public ProfileBioWidgetView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        defaultProfileFields = ProfileFieldMapper.fromDTOs(constantsProvider.getConstants().getProfileFields());
        setOrientation(1);
        attributeset.a(context).inflate(0x7f0300ff, this, true);
        ButterKnife.a(this);
    }

    static String getPrefixedString(String s, String s1)
    {
        return Strings.joinWithDelimiter(" ", new String[] {
            s, s1
        });
    }

    private void hideBioViews()
    {
        homeTownTextView.setVisibility(8);
        musicTextView.setVisibility(8);
        aboutTextView.setVisibility(8);
    }

    public void setUserBioInfo(Profile profile)
    {
        if (profile.hasNoProfileFields() && defaultProfileFields.isEmpty())
        {
            hideBioViews();
            return;
        }
        Object obj = profile.getHometown();
        TextView textview = homeTownTextView;
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            obj = defaultProfileFields.getHometownDefault();
        } else
        {
            obj = getPrefixedString(defaultProfileFields.getHometownPrefix(), ((String) (obj)));
        }
        textview.setText(((CharSequence) (obj)));
        obj = profile.getFavoriteMusic();
        textview = musicTextView;
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            obj = defaultProfileFields.getFavoriteMusicDefault();
        } else
        {
            obj = getPrefixedString(defaultProfileFields.getFavoriteMusicPrefix(), ((String) (obj)));
        }
        textview.setText(((CharSequence) (obj)));
        profile = profile.getAboutMe();
        obj = aboutTextView;
        if (Strings.isNullOrEmpty(profile))
        {
            profile = defaultProfileFields.getAboutMeDefault();
        } else
        {
            profile = getPrefixedString(defaultProfileFields.getAboutMePrefix(), profile);
        }
        ((TextView) (obj)).setText(profile);
    }
}
