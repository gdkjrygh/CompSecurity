// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.support.v4.app.FragmentManager;
import com.phunware.nbc.sochi.fragments.NationalAlertsWizardFragment1;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            NationalAlertsWizardActivity

class this._cls0
    implements Runnable
{

    final NationalAlertsWizardActivity this$0;

    public void run()
    {
        NationalAlertsWizardFragment1 nationalalertswizardfragment1 = (NationalAlertsWizardFragment1)getSupportFragmentManager().findFragmentByTag("FRAGMENT_TAG_WIZARD_1");
        if (nationalalertswizardfragment1 != null)
        {
            nationalalertswizardfragment1.setNextButtonEnabled(true);
        }
    }

    ()
    {
        this$0 = NationalAlertsWizardActivity.this;
        super();
    }
}
