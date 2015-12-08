// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.user.InvitationCodeModel;

public final class fkf extends ftv
{

    private final int d;

    public fkf(Context context)
    {
        super(context, false);
        d = gcg.b(context, 0x7f0f007c);
    }

    protected final ddd a(Context context, ViewGroup viewgroup)
    {
        return dds.d(context, viewgroup);
    }

    protected final void a(ddd ddd, Object obj)
    {
        ddm ddm1 = (ddm)ddd;
        ddd = (InvitationCodeModel)obj;
        ddm1.a().setTag(ddd);
        ddm1.a(ddd.getCode());
        obj = ddm1.a();
        boolean flag;
        if (!ddd.isClaimed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((View) (obj)).setEnabled(flag);
        if (TextUtils.isEmpty(ddd.getClaimedByDisplayName()))
        {
            ddm1.c(a.getString(0x7f080424));
        } else
        {
            ddm1.c(a.getString(0x7f080420, new Object[] {
                ddd.getClaimedByDisplayName()
            }));
        }
        if (ddd.isClaimed())
        {
            ddd = SpotifyIcon.af;
        } else
        {
            ddd = SpotifyIcon.O;
        }
        obj = new ImageView(a);
        ddd = new dfz(a, ddd);
        ddd.a(d);
        ((ImageView) (obj)).setImageDrawable(ddd);
        ddm1.a(((View) (obj)));
    }
}
