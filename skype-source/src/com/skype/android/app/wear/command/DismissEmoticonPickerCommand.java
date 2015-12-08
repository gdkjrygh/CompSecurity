// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.c;
import com.skype.android.app.wear.RemoteDeviceCapabilities;
import com.skype.android.app.wear.util.WearMessageApiUtils;

// Referenced classes of package com.skype.android.app.wear.command:
//            NodeCompletionWearCommand, NodeResultCallback

public class DismissEmoticonPickerCommand extends NodeCompletionWearCommand
{

    public DismissEmoticonPickerCommand()
    {
    }

    public void send(c c, NodeResultCallback noderesultcallback)
    {
        WearMessageApiUtils.sendToAllNodes(c, RemoteDeviceCapabilities.WEAR_REMOTE_CONTROL_CAPABILITY, com.skype.android.app.wear.RemoteDeviceCapabilities.RemoteCommands.DISMISS_EMOTICON_PICKER_COMMAND.getCommandPath(new Object[0]), noderesultcallback);
    }
}
