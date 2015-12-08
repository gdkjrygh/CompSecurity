// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.util.AttributeSet;
import com.skype.android.widget.MessagePopup;

public class ContactSuggestedInvitesMessagePopup extends MessagePopup
{

    public ContactSuggestedInvitesMessagePopup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ContactSuggestedInvitesMessagePopup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
    }

    protected void computeDimensions(int i, int j)
    {
        width = i;
        height = j;
    }
}
