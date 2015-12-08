// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;


// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

class val.phones
    implements Runnable
{

    final InviteScreenView this$0;
    final String val$phones;

    public void run()
    {
        try
        {
            startGroupSmsIntent(val$phones);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_invitescreenview;
        val$phones = String.this;
        super();
    }
}
