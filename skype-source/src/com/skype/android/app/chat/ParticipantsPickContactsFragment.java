// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.Contact;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.app.contacts.ContactSearchLoader;
import com.skype.android.skylib.ObjectIdMap;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ParticipantsPickContactsFragment extends ContactPickerFragment
{

    private ArrayList existingParticipants;
    private String search;

    public ParticipantsPickContactsFragment()
    {
    }

    private void getParticipantsFromIntent(Bundle bundle)
    {
        existingParticipants = new ArrayList();
        if (bundle != null && bundle.containsKey("com.skype.objIds"))
        {
            bundle = bundle.getIntArray("com.skype.objIds");
            for (int i = 0; i < bundle.length; i++)
            {
                existingParticipants.add(map.a(bundle[i], com/skype/Contact));
            }

        }
    }

    public Callable getLoader()
    {
        return new ContactSearchLoader(lib, map, account, search, existingParticipants);
    }

    protected int getTitleId()
    {
        return 0x7f080460;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = getActivity().getIntent();
        if (intent != null)
        {
            getParticipantsFromIntent(intent.getExtras());
        }
        search = null;
        if (bundle != null)
        {
            search = bundle.getString("android.intent.action.SEARCH");
        }
    }
}
