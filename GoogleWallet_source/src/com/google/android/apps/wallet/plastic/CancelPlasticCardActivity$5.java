// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.res.Resources;
import com.google.android.apps.wallet.validator.DataValidator;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            CancelPlasticCardActivity

final class this._cls0
    implements DataValidator
{

    final CancelPlasticCardActivity this$0;

    private static boolean isValid(ason ason, Resources resources)
    {
        return ason != null;
    }

    private String validate(ason ason, Resources resources)
    {
        if (ason == null)
        {
            return getString(com.google.android.apps.walletnfcrel.o_selection_error);
        } else
        {
            return "";
        }
    }

    public final volatile boolean isValid(Object obj, Resources resources)
    {
        return isValid((ason)obj, resources);
    }

    public final volatile String validate(Object obj, Resources resources)
    {
        return validate((ason)obj, resources);
    }

    ason()
    {
        this$0 = CancelPlasticCardActivity.this;
        super();
    }
}
