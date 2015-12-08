// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import Jm;
import PI;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.List;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesFragment

final class a
    implements TextWatcher
{

    private a a;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            StoriesFragment.d(a.a).a(4);
        } else
        {
            StoriesFragment.d(a.a).a(0);
        }
        StoriesFragment.e(a.a);
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.atureFlag.OFFICIAL_STORIES_SEARCH) && charsequence.length() >= 3)
        {
            StoriesFragment storiesfragment = a.a;
            storiesfragment.b.a(charsequence.toString(), new nit>(storiesfragment, charsequence));
        } else
        {
            StoriesFragment.c(a.a).clear();
        }
        a.a.m();
    }

    ag(ag ag)
    {
        a = ag;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/stories/StoriesFragment$14

/* anonymous class */
    final class StoriesFragment._cls14
        implements PI.a
    {

        final StoriesFragment a;

        public final void a(View view)
        {
            ((EditText)a.i.a()).addTextChangedListener(new StoriesFragment._cls14._cls1(this));
        }

            
            {
                a = storiesfragment;
                super();
            }
    }

}
