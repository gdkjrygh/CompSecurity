// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.ScrollView;
import com.skype.android.widget.ParticipantsDisplayText;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

public class  extends com.skype.android.xy
{

    public void clearViews()
    {
        super.clearViews();
        ((PickerFragment)getTarget()).participantsDisplayText = null;
        ((PickerFragment)getTarget()).filterEditText = null;
        ((PickerFragment)getTarget()).participantsScrollView = null;
        ((PickerFragment)getTarget()).floatingActionButton = null;
        ((PickerFragment)getTarget()).participantViewContainer = null;
        ((PickerFragment)getTarget()).toolbar = null;
        ((PickerFragment)getTarget()).shadowLine = null;
    }

    public void injectViews()
    {
        super.injectViews();
        ((PickerFragment)getTarget()).participantsDisplayText = (ParticipantsDisplayText)findViewById(0x7f100216);
        ((PickerFragment)getTarget()).filterEditText = (EditText)findViewById(0x7f1002f6);
        ((PickerFragment)getTarget()).participantsScrollView = (ScrollView)findViewById(0x7f1001d2);
        ((PickerFragment)getTarget()).floatingActionButton = (FloatingActionButton)findViewById(0x7f1002f5);
        ((PickerFragment)getTarget()).participantViewContainer = (ScrollView)findViewById(0x7f1002f3);
        ((PickerFragment)getTarget()).toolbar = (Toolbar)findViewById(0x7f1002f2);
        ((PickerFragment)getTarget()).shadowLine = findViewById(0x7f10032e);
    }

    public (PickerFragment pickerfragment)
    {
        super(pickerfragment);
    }
}
