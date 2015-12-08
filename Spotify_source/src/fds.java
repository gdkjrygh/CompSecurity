// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.SpotifyLink;
import java.util.List;

public final class fds
{

    public static int a(String s)
    {
        SpotifyLink spotifylink = new SpotifyLink(s);
        int i;
        boolean flag;
        if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "This is not running link [%s]", new Object[] {
            s
        });
        try
        {
            i = Integer.parseInt(spotifylink.a.getLastPathSegment());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    public static String a(SpotifyLink spotifylink, int i)
    {
        int j = 0;
        String s;
        boolean flag;
        if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "This is not running link [%s]", new Object[] {
            spotifylink.toString()
        });
        s = spotifylink.a(4);
        if (s != null && "tempo".equals(s))
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("spotify:");
            spotifylink = spotifylink.a.getPathSegments();
            while (j < spotifylink.size()) 
            {
                if (stringbuilder.charAt(stringbuilder.length() - 1) != ':')
                {
                    stringbuilder.append(':');
                }
                if (j == 5)
                {
                    stringbuilder.append(String.valueOf(i));
                } else
                {
                    stringbuilder.append(Uri.encode((String)spotifylink.get(j)));
                }
                j++;
            }
            return stringbuilder.toString();
        } else
        {
            return (new StringBuilder()).append(spotifylink.d()).append(":tempo:").append(i).toString();
        }
    }
}
