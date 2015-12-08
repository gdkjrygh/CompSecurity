// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.widget.NonScrollingListLayout;
import com.skype.android.widget.ParticipantsEditText;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            AddParticipantsActivity, MessageArea

public class  extends com.skype.android.y..Proxy
{

    public void clearViews()
    {
        super.();
        ((AddParticipantsActivity)getTarget()).homeButton = null;
        ((AddParticipantsActivity)getTarget()).groupsContainer = null;
        ((AddParticipantsActivity)getTarget()).messageArea = null;
        ((AddParticipantsActivity)getTarget()).groupsList = null;
        ((AddParticipantsActivity)getTarget()).addressBookButton = null;
        ((AddParticipantsActivity)getTarget()).participantsText = null;
        ((AddParticipantsActivity)getTarget()).confirmButton = null;
        ((AddParticipantsActivity)getTarget()).startNewChat = null;
    }

    public void injectViews()
    {
        super.s();
        ((AddParticipantsActivity)getTarget()).homeButton = (ImageView)findViewById(0x7f100215);
        ((AddParticipantsActivity)getTarget()).groupsContainer = (RelativeLayout)findViewById(0x7f10021a);
        ((AddParticipantsActivity)getTarget()).messageArea = (MessageArea)findViewById(0x7f100213);
        ((AddParticipantsActivity)getTarget()).groupsList = (NonScrollingListLayout)findViewById(0x7f10021c);
        ((AddParticipantsActivity)getTarget()).addressBookButton = (SymbolView)findViewById(0x7f100218);
        ((AddParticipantsActivity)getTarget()).participantsText = (ParticipantsEditText)findViewById(0x7f100216);
        ((AddParticipantsActivity)getTarget()).confirmButton = (SymbolView)findViewById(0x7f100217);
        ((AddParticipantsActivity)getTarget()).startNewChat = (TextView)findViewById(0x7f10021d);
    }

    public (AddParticipantsActivity addparticipantsactivity)
    {
        super(addparticipantsactivity);
    }
}
