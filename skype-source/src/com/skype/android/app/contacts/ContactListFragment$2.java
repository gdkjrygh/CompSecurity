// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.view.View;
import com.skype.android.app.favorites.FavoritesPickContactsFragment;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment, ContactPickerActivity

final class this._cls0
    implements android.view.actListFragment._cls2
{

    final ContactListFragment this$0;

    public final void onClick(View view)
    {
        view = new Intent(getActivity(), com/skype/android/app/contacts/ContactPickerActivity);
        view.putExtra("fragmentClass", com/skype/android/app/favorites/FavoritesPickContactsFragment);
        view.putExtra("CUSTOM_ACTION", com.skype.android.widget.de.bR);
        view.putExtra("CHECKBOX_MODE", true);
        startActivity(view);
    }

    Fragment()
    {
        this$0 = ContactListFragment.this;
        super();
    }
}
