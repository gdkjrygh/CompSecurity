// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.SpotifyLink;

final class fej
    implements hfx
{

    fej()
    {
    }

    public final Object a(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (SpotifyLink)obj1;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            boolean flag;
            if (((SpotifyLink) (obj1)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "This is not running link [%s]", new Object[] {
                ((SpotifyLink) (obj1)).toString()
            });
            return (new StringBuilder("hm://rttb-view/v1/recommendation/")).append(((SpotifyLink) (obj1)).a(2)).append("/").append(((SpotifyLink) (obj1)).a(3)).toString();
        }
        boolean flag1;
        if (((SpotifyLink) (obj1)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1, "This is not running link [%s]", new Object[] {
            ((SpotifyLink) (obj1)).toString()
        });
        return (new StringBuilder("hm://rttb-view/v1/recommendation/user/")).append(Uri.encode(((String) (obj)))).append("/").append(((SpotifyLink) (obj1)).a(2)).append("/").append(((SpotifyLink) (obj1)).a(3)).toString();
    }
}
