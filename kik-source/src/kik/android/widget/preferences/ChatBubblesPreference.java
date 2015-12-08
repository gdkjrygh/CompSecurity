// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.activity.k;
import kik.android.chat.fragment.settings.d;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ChatBubblesPreference extends KikPreference
{

    public ChatBubblesPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
    }

    public ChatBubblesPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, null);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b();
        if (preference instanceof d)
        {
            ((d)preference).b();
        }
        k.a(new kik.android.chat.fragment.ChatBubbleSelectionFragment.b(), getContext()).f();
        return false;
    }
}
