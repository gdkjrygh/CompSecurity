// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

class a
    implements android.content.Listener
{

    final ProfilePhotoUploader a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 32
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L2:
        dialoginterface = ProfilePhotoUploader.c();
        i = 4906;
_L5:
        try
        {
            if (ProfilePhotoUploader.d(a) != null)
            {
                ProfilePhotoUploader.d(a).startActivityForResult(dialoginterface, i);
                return;
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            com.fitbit.e.a.a("ProfilePhotoUploader", "Your device doesn't support the pick action", new Object[0]);
        }
        break MISSING_BLOCK_LABEL_115;
_L3:
        dialoginterface = new Intent("android.intent.action.PICK", android.provider..EXTERNAL_CONTENT_URI);
        dialoginterface.setType("image/*");
        i = 4907;
        if (true) goto _L5; else goto _L4
_L4:
        ProfilePhotoUploader.c(a).startActivityForResult(dialoginterface, i);
        return;
    }

    er(ProfilePhotoUploader profilephotouploader)
    {
        a = profilephotouploader;
        super();
    }
}
