// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.net.Uri;
import com.soundcloud.android.model.Urn;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UrnResolver
{

    private static final String ALL_TYPES = "sounds|tracks|playlists|users";
    private static final Pattern DEEP_LINK_PATTERN = Pattern.compile("^soundcloud://(sounds|tracks|playlists|users):(\\d+).*", 2);
    private static final String PLAYLISTS_TYPE = "playlists";
    private static final String SOUNDS_TYPE = "sounds|tracks";
    private static final String USERS_TYPE = "users";
    private static final Pattern WEB_URN_PATTERN = Pattern.compile("^soundcloud:(sounds|tracks|playlists|users):(\\d+).*", 2);

    UrnResolver()
    {
    }

    private Urn getUrn(Matcher matcher)
    {
        String s1 = matcher.group(1).toLowerCase(Locale.US);
        String s = s1;
        if (s1.equals("sounds"))
        {
            s = "tracks";
        }
        return new Urn((new StringBuilder("soundcloud:")).append(s).append(":").append(matcher.group(2)).toString());
    }

    Urn toUrn(Uri uri)
    {
        Object obj = uri.toString();
        if (Urn.isSoundCloudUrn(((String) (obj))))
        {
            return new Urn(((String) (obj)));
        }
        Matcher matcher = DEEP_LINK_PATTERN.matcher(((CharSequence) (obj)));
        if (matcher.matches())
        {
            return getUrn(matcher);
        }
        obj = WEB_URN_PATTERN.matcher(((CharSequence) (obj)));
        if (((Matcher) (obj)).matches())
        {
            return getUrn(((Matcher) (obj)));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot parse as URN: ")).append(uri).toString());
        }
    }

}
