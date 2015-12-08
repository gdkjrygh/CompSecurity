// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.view.View;
import com.skype.PROPKEY;
import com.skype.android.app.Navigation;
import com.skype.android.app.main.EditPropertyActivity;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment

final class this._cls0
    implements android.view.ner
{

    final MyInfoFragment this$0;

    public final void onClick(View view)
    {
        view = nav.intentFor(account, com/skype/android/app/main/EditPropertyActivity);
        view.putExtra("com.skype.propkey", PROPKEY.CONTACT_MOOD_TEXT);
        startActivityForResult(view, 1);
    }

    ()
    {
        this$0 = MyInfoFragment.this;
        super();
    }
}
