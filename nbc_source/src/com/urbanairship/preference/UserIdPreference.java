// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.urbanairship.preference:
//            UAPreference

public class UserIdPreference extends Preference
    implements UAPreference
{

    public UserIdPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public UAPreference.PreferenceType getPreferenceType()
    {
        return UAPreference.PreferenceType.USER_ID;
    }

    public View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = super.onCreateView(viewgroup);
        viewgroup.setContentDescription(getPreferenceType().toString());
        return viewgroup;
    }

    public void setValue(Object obj)
    {
        setSummary((String)obj);
    }
}
