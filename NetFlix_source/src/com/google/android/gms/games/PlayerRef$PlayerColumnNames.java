// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.games:
//            PlayerRef

private static final class Ir
{

    public final String Ij;
    public final String Ik;
    public final String Il;
    public final String Im;
    public final String In;
    public final String Io;
    public final String Ip;
    public final String Iq;
    public final String Ir;

    public (String s)
    {
        if (TextUtils.isEmpty(s))
        {
            Ij = "external_player_id";
            Ik = "profile_name";
            Il = "profile_icon_image_uri";
            Im = "profile_icon_image_url";
            In = "profile_hi_res_image_uri";
            Io = "profile_hi_res_image_url";
            Ip = "last_updated";
            Iq = "is_in_circles";
            Ir = "played_with_timestamp";
            return;
        } else
        {
            Ij = (new StringBuilder()).append(s).append("external_player_id").toString();
            Ik = (new StringBuilder()).append(s).append("profile_name").toString();
            Il = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            Im = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            In = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            Io = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            Ip = (new StringBuilder()).append(s).append("last_updated").toString();
            Iq = (new StringBuilder()).append(s).append("is_in_circles").toString();
            Ir = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            return;
        }
    }
}
