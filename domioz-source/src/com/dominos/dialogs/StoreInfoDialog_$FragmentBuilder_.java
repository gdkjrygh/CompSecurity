// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.dialogs:
//            StoreInfoDialog_, StoreInfoDialog

public class  extends d
{

    public StoreInfoDialog build()
    {
        StoreInfoDialog_ storeinfodialog_ = new StoreInfoDialog_();
        storeinfodialog_.setArguments(args);
        return storeinfodialog_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mBundle(Bundle bundle)
    {
        args.putBundle("mBundle", bundle);
        return this;
    }

    public ()
    {
    }
}
