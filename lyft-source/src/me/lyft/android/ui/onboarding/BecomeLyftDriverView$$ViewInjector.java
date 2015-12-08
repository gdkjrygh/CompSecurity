// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.AdvancedTextView;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView, BecomeDriverHelpToolbarView

public class _cls1.val.target
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (BecomeLyftDriverView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, final BecomeLyftDriverView target, Object obj)
    {
        target.regionTxt = (AdvancedTextView)viewinjector.regionTxt((View)viewinjector.regionTxt(obj, 0x7f0d0083, "field 'regionTxt'"), 0x7f0d0083, "field 'regionTxt'");
        target.driverReferralCodeTxt = (AdvancedEditText)viewinjector.driverReferralCodeTxt((View)viewinjector.driverReferralCodeTxt(obj, 0x7f0d0084, "field 'driverReferralCodeTxt'"), 0x7f0d0084, "field 'driverReferralCodeTxt'");
        target.goToApplicationButton = (Button)viewinjector.goToApplicationButton((View)viewinjector.goToApplicationButton(obj, 0x7f0d0086, "field 'goToApplicationButton'"), 0x7f0d0086, "field 'goToApplicationButton'");
        target.errorDetailsTxt = (TextView)viewinjector.errorDetailsTxt((View)viewinjector.errorDetailsTxt(obj, 0x7f0d0085, "field 'errorDetailsTxt'"), 0x7f0d0085, "field 'errorDetailsTxt'");
        target.toolbar = (BecomeDriverHelpToolbarView)viewinjector.oolbarView((View)viewinjector.oolbarView(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        target.becomeDriverContainer = (View)viewinjector.becomeDriverContainer(obj, 0x7f0d0080, "field 'becomeDriverContainer'");
        viewinjector = (View)viewinjector.becomeDriverContainer(obj, 0x7f0d0087, "field 'retryView' and method 'retry'");
        target.retryView = viewinjector;
        viewinjector.setOnClickListener(new DebouncingOnClickListener() {

            final BecomeLyftDriverView..ViewInjector this$0;
            final BecomeLyftDriverView val$target;

            public void doClick(View view)
            {
                target.retry();
            }

            
            {
                this$0 = BecomeLyftDriverView..ViewInjector.this;
                target = becomelyftdriverview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((BecomeLyftDriverView)obj);
    }

    public void reset(BecomeLyftDriverView becomelyftdriverview)
    {
        becomelyftdriverview.regionTxt = null;
        becomelyftdriverview.driverReferralCodeTxt = null;
        becomelyftdriverview.goToApplicationButton = null;
        becomelyftdriverview.errorDetailsTxt = null;
        becomelyftdriverview.toolbar = null;
        becomelyftdriverview.becomeDriverContainer = null;
        becomelyftdriverview.retryView = null;
    }

    public _cls1.val.target()
    {
    }
}
