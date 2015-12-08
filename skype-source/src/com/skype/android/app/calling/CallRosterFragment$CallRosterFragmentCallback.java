// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.Participant;

// Referenced classes of package com.skype.android.app.calling:
//            CallRosterFragment

public static interface Q
{

    public abstract void onCallRosterDismissed(CallRosterFragment callrosterfragment);

    public abstract void onCallRosterDisplayed(CallRosterFragment callrosterfragment);

    public abstract void onParticipantSelected(CallRosterFragment callrosterfragment, Participant participant);
}
