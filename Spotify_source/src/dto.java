// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.internal.provider.SpotifyProvider;
import java.util.Locale;

public final class dto
{

    public static Uri a(String s)
    {
        do
        {
            if (TextUtils.isEmpty(s))
            {
                return Uri.EMPTY;
            }
            Object obj;
            try
            {
                obj = new String(Base64.decode(Uri.decode(s), 0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = "";
            }
            if (s.startsWith("spotify:mosaic:"))
            {
                return b(s);
            }
            if (((String) (obj)).startsWith("spotify:mosaic:"))
            {
                return b(((String) (obj)));
            }
            if (s.startsWith("spotify:image:"))
            {
                s = Base64.encodeToString(s.substring(14).getBytes(), 0);
            } else
            if (s.startsWith("http://") || s.startsWith("https://"))
            {
                s = Base64.encodeToString(s.getBytes(), 0);
            } else
            {
                return Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/image/").append(s).toString());
            }
        } while (true);
    }

    private static Uri b(String s)
    {
        Assertion.a(s.startsWith("spotify:mosaic:"), "getMosaicContentUri can only be called with mosaic URI.");
        s = s.substring(15).split(":");
        return a(String.format(Locale.US, "http://o.scdn.co/%d/%s", new Object[] {
            Integer.valueOf(300), TextUtils.join("", s)
        }));
    }
}
