// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.persistence.landing.ISignUpUserRepository;
import me.lyft.android.persistence.landing.SignupUser;
import me.lyft.android.utils.VersionUtils;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingFlow

public class TermsOfServiceView extends CheckBox
{

    LandingFlow landingFlow;
    ILandingService landingService;
    ISignUpUserRepository signUpUserRepository;

    public TermsOfServiceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private Spannable createTermsOfServiceSpan(final boolean isError)
    {
        String s = getResources().getString(0x7f0701df);
        String s1 = getResources().getString(0x7f0701de);
        SpannableString spannablestring = new SpannableString(s1);
        ClickableSpan clickablespan = new ClickableSpan() {

            final TermsOfServiceView this$0;
            final boolean val$isError;

            public void onClick(View view)
            {
                landingFlow.openTermsOfServiceScreen();
            }

            public void updateDrawState(TextPaint textpaint)
            {
                if (isError)
                {
                    textpaint.setUnderlineText(false);
                    textpaint.setColor(getResources().getColor(0x7f0c008f));
                    return;
                } else
                {
                    textpaint.setUnderlineText(false);
                    textpaint.setColor(getResources().getColor(0x7f0c000b));
                    return;
                }
            }

            
            {
                this$0 = TermsOfServiceView.this;
                isError = flag;
                super();
            }
        };
        int i = s1.indexOf(s);
        int j = s1.indexOf(s);
        spannablestring.setSpan(clickablespan, i, s.length() + j, 33);
        return spannablestring;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            setChecked(signUpUserRepository.get().hasAgreedToS());
            setText(createTermsOfServiceSpan(false));
            setMovementMethod(LinkMovementMethod.getInstance());
            setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final TermsOfServiceView this$0;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    if (flag)
                    {
                        showTermsOfServiceError(false);
                        landingService.agreedTermsOfService(true);
                        return;
                    } else
                    {
                        landingService.agreedTermsOfService(false);
                        return;
                    }
                }

            
            {
                this$0 = TermsOfServiceView.this;
                super();
            }
            });
            if (VersionUtils.hasJellyBean() && !VersionUtils.hasKitKat())
            {
                float f = getResources().getDisplayMetrics().density;
                int i = getPaddingLeft();
                setPadding((int)(f * 24F) + i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
                return;
            }
        }
    }

    public void showTermsOfServiceError(boolean flag)
    {
        if (flag)
        {
            setButtonDrawable(0x7f0200d8);
            setTextColor(getResources().getColor(0x7f0c008f));
        } else
        {
            setButtonDrawable(0x7f0200d7);
            setTextColor(getResources().getColor(0x7f0c0001));
        }
        setText(createTermsOfServiceSpan(flag));
    }
}
