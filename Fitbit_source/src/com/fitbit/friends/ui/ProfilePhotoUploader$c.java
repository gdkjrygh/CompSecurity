// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.home.ui.b;
import com.fitbit.ui.dialogs.a;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.friends.ui:
//            ProfilePhotoUploader

private class _cls2.a extends b
{

    final ProfilePhotoUploader a;

    protected String a()
    {
        return com.fitbit.ui.dialogs.a.b(ProfilePhotoUploader.c(a));
    }

    public void a(Exception exception)
    {
        com.fitbit.friends.ui.ProfilePhotoUploader.a(a, true);
        if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).e() == 413)
        {
            g();
            s.a(ProfilePhotoUploader.c(a), 0x7f080387, 0).i();
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
            return;
        } else
        {
            super.a(exception);
            return;
        }
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
        super.b(simpleconfirmdialogfragment);
    }

    public ner(ProfilePhotoUploader profilephotouploader, FragmentActivity fragmentactivity)
    {
        a = profilephotouploader;
        super(fragmentactivity, new com.fitbit.home.ui.b.a(profilephotouploader) {

            final ProfilePhotoUploader a;

            public void a(b b1)
            {
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a, com.fitbit.friends.ui.ProfilePhotoUploader.b());
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a).b();
            }

            
            {
                a = profilephotouploader;
                super();
            }
        }, new android.content.DialogInterface.OnCancelListener(profilephotouploader) {

            final ProfilePhotoUploader a;

            public void onCancel(DialogInterface dialoginterface)
            {
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
            }

            
            {
                a = profilephotouploader;
                super();
            }
        });
    }
}
