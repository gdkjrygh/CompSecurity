// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.validator.DataValidator;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment

final class this._cls0
    implements DataValidator
{

    final KycEnterPersonalInfoFragment this$0;

    private static boolean isValid(bCategory bcategory, Resources resources)
    {
        return bcategory != null;
    }

    private String validate(bCategory bcategory, Resources resources)
    {
        if (bcategory == null)
        {
            return getActivity().getString(com.google.android.apps.walletnfcrel.election_error);
        } else
        {
            return "";
        }
    }

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((bCategory)obj, resources);
    }

    public final volatile String validate(Object obj, Resources resources)
    {
        return validate((bCategory)obj, resources);
    }

    bCategory()
    {
        this$0 = KycEnterPersonalInfoFragment.this;
        super();
    }
}
