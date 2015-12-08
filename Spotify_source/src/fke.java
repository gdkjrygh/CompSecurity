// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.user.InvitationCodeModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public final class fke
{

    static void a(Activity activity, InvitationCodeModel invitationcodemodel, Flags flags)
    {
        if (invitationcodemodel.isClaimed())
        {
            invitationcodemodel = invitationcodemodel.getClaimedByUri();
            if (TextUtils.isEmpty(invitationcodemodel))
            {
                Assertion.b("Claimed invitation code doesn't contain user uri");
                return;
            } else
            {
                activity.startActivity(gms.a(activity, invitationcodemodel).a);
                return;
            }
        } else
        {
            flags = (new fpa(activity, flags)).a(activity.getString(0x7f080421)).a(false).b(activity.getString(0x7f080422)).c(activity.getString(0x7f080423, new Object[] {
                invitationcodemodel.getCode()
            }));
            String s = activity.getString(0x7f0802e2);
            ((fpa) (flags)).a.putExtra("friend_to_friend_email_specific_subject", s);
            invitationcodemodel = activity.getString(0x7f0802e3, new Object[] {
                invitationcodemodel.getCode()
            });
            ((fpa) (flags)).a.putExtra("friend_to_friend_email_specific_text", invitationcodemodel);
            activity.startActivity(flags.a());
            return;
        }
    }
}
