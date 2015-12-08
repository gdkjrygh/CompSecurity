// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.net.Uri;
import android.text.TextUtils;
import com.soundcloud.android.model.Urn;
import java.util.EnumSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            UrnResolver

public final class DeepLink extends Enum
{

    private static final DeepLink $VALUES[];
    public static final DeepLink EXPLORE;
    public static final DeepLink HOME;
    private static final EnumSet LOGGED_IN_REQUIRED;
    public static final DeepLink OTHER;
    public static final DeepLink PLAYLIST;
    public static final DeepLink RECORD;
    private static final EnumSet RESOLVE_REQUIRED;
    public static final DeepLink SEARCH;
    public static final DeepLink STREAM;
    public static final DeepLink TRACK;
    public static final DeepLink USER;
    public static final DeepLink WEB_VIEW;
    private static final Pattern WEB_VIEW_URL_PATTERNS[] = {
        Pattern.compile("^/login/reset/[0-9a-f]+$"), Pattern.compile("^/login/forgot$"), Pattern.compile("^/emails/[0-9a-f]+$"), Pattern.compile("^/pages/.*$"), Pattern.compile("^/terms-of-use$"), Pattern.compile("^/jobs(/.*)?$")
    };

    private DeepLink(String s, int i)
    {
        super(s, i);
    }

    public static Uri extractClickTrackingRedirectUrl(Uri uri)
    {
        uri = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(uri))
        {
            return Uri.EMPTY;
        } else
        {
            return Uri.parse(uri);
        }
    }

    private static DeepLink fromSoundCloudScheme(Uri uri)
    {
        String s;
        byte byte0;
        s = uri.getHost();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 12: default 116
    //                   -1404367711: 253
    //                   -1309148525: 225
    //                   -1309068458: 267
    //                   -1278274918: 311
    //                   -934908847: 356
    //                   -906336856: 239
    //                   -891990144: 211
    //                   -838595071: 341
    //                   -594466378: 296
    //                   -573438237: 281
    //                   -209531505: 326
    //                   3208415: 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_356;
_L14:
        switch (byte0)
        {
        default:
            try
            {
                uri = fromSoundCloudUrn((new UrnResolver()).toUrn(uri));
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return OTHER;
            }
            return uri;

        case 0: // '\0'
            return HOME;

        case 1: // '\001'
            return STREAM;

        case 2: // '\002'
            return EXPLORE;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return SEARCH;

        case 10: // '\n'
        case 11: // '\013'
            return RECORD;
        }
_L13:
        if (s.equals("home"))
        {
            byte0 = 0;
        }
          goto _L14
_L8:
        if (s.equals("stream"))
        {
            byte0 = 1;
        }
          goto _L14
_L3:
        if (s.equals("explore"))
        {
            byte0 = 2;
        }
          goto _L14
_L7:
        if (s.equals("search"))
        {
            byte0 = 3;
        }
          goto _L14
_L2:
        if (s.equals("search:people"))
        {
            byte0 = 4;
        }
          goto _L14
_L4:
        if (s.equals("search:sounds"))
        {
            byte0 = 5;
        }
          goto _L14
_L11:
        if (s.equals("search:sets"))
        {
            byte0 = 6;
        }
          goto _L14
_L10:
        if (s.equals("search:users"))
        {
            byte0 = 7;
        }
          goto _L14
_L5:
        if (s.equals("search:tracks"))
        {
            byte0 = 8;
        }
          goto _L14
_L12:
        if (s.equals("search:playlists"))
        {
            byte0 = 9;
        }
          goto _L14
_L9:
        if (s.equals("upload"))
        {
            byte0 = 10;
        }
          goto _L14
        if (s.equals("record"))
        {
            byte0 = 11;
        }
          goto _L14
    }

    private static DeepLink fromSoundCloudUrn(Urn urn)
    {
        if (urn.isTrack())
        {
            return TRACK;
        }
        if (urn.isPlaylist())
        {
            return PLAYLIST;
        }
        if (urn.isUser())
        {
            return USER;
        } else
        {
            return OTHER;
        }
    }

    public static DeepLink fromUri(Uri uri)
    {
        if (uri == null)
        {
            return HOME;
        }
        if (isSoundCloudUrn(uri))
        {
            return fromSoundCloudUrn(new Urn(uri.toString()));
        }
        if (isSoundCloudScheme(uri))
        {
            return fromSoundCloudScheme(uri);
        }
        if (isWebScheme(uri))
        {
            return fromWebScheme(uri);
        } else
        {
            return OTHER;
        }
    }

    private static DeepLink fromWebScheme(Uri uri)
    {
        String s;
        byte byte0;
        s = uri.getPath();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 15: default 140
    //                   -2143336809: 311
    //                   -2128990097: 269
    //                   -2075595024: 297
    //                   -1814426480: 386
    //                   -1001441404: 283
    //                   -568425209: 341
    //                   -473125956: 326
    //                   -442332416: 371
    //                   -29234880: 416
    //                   0: 227
    //                   47: 241
    //                   46613902: 255
    //                   1133163369: 401
    //                   1188323529: 356
    //                   1382082905: 431;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        break; /* Loop/switch isn't completed */
_L16:
        break MISSING_BLOCK_LABEL_431;
_L17:
        switch (byte0)
        {
        default:
            if (isWebViewUrl(uri))
            {
                return WEB_VIEW;
            } else
            {
                return OTHER;
            }

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return HOME;

        case 3: // '\003'
            return STREAM;

        case 4: // '\004'
            return EXPLORE;

        case 5: // '\005'
            return RECORD;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return SEARCH;
        }
_L11:
        if (s.equals(""))
        {
            byte0 = 0;
        }
          goto _L17
_L12:
        if (s.equals("/"))
        {
            byte0 = 1;
        }
          goto _L17
_L13:
        if (s.equals("/home"))
        {
            byte0 = 2;
        }
          goto _L17
_L3:
        if (s.equals("/stream"))
        {
            byte0 = 3;
        }
          goto _L17
_L6:
        if (s.equals("/explore"))
        {
            byte0 = 4;
        }
          goto _L17
_L4:
        if (s.equals("/upload"))
        {
            byte0 = 5;
        }
          goto _L17
_L2:
        if (s.equals("/search"))
        {
            byte0 = 6;
        }
          goto _L17
_L8:
        if (s.equals("/search/sounds"))
        {
            byte0 = 7;
        }
          goto _L17
_L7:
        if (s.equals("/search/people"))
        {
            byte0 = 8;
        }
          goto _L17
_L15:
        if (s.equals("/search/sets"))
        {
            byte0 = 9;
        }
          goto _L17
_L9:
        if (s.equals("/search/tracks"))
        {
            byte0 = 10;
        }
          goto _L17
_L5:
        if (s.equals("/search/users"))
        {
            byte0 = 11;
        }
          goto _L17
_L14:
        if (s.equals("/search/playlists"))
        {
            byte0 = 12;
        }
          goto _L17
_L10:
        if (s.equals("/tracks/search"))
        {
            byte0 = 13;
        }
          goto _L17
        if (s.equals("/people/search"))
        {
            byte0 = 14;
        }
          goto _L17
    }

    public static boolean isClickTrackingUrl(Uri uri)
    {
        return "soundcloud.com".equals(uri.getHost()) && uri.getPath().startsWith("/-/t/click") && !TextUtils.isEmpty(uri.getQueryParameter("url"));
    }

    private static boolean isSoundCloudScheme(Uri uri)
    {
        return uri.isHierarchical() && "soundcloud".equals(uri.getScheme());
    }

    private static boolean isSoundCloudUrn(Uri uri)
    {
        return uri.isOpaque() && Urn.isSoundCloudUrn(uri.toString());
    }

    private static boolean isWebScheme(Uri uri)
    {
        return uri.isHierarchical() && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()));
    }

    private static boolean isWebViewUrl(Uri uri)
    {
        boolean flag1 = false;
        Pattern apattern[] = WEB_VIEW_URL_PATTERNS;
        int j = apattern.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!apattern[i].matcher(uri.getPath()).matches())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static DeepLink valueOf(String s)
    {
        return (DeepLink)Enum.valueOf(com/soundcloud/android/deeplinks/DeepLink, s);
    }

    public static DeepLink[] values()
    {
        return (DeepLink[])$VALUES.clone();
    }

    public final boolean requiresLoggedInUser()
    {
        return LOGGED_IN_REQUIRED.contains(this);
    }

    public final boolean requiresResolve()
    {
        return RESOLVE_REQUIRED.contains(this);
    }

    static 
    {
        HOME = new DeepLink("HOME", 0);
        STREAM = new DeepLink("STREAM", 1);
        EXPLORE = new DeepLink("EXPLORE", 2);
        USER = new DeepLink("USER", 3);
        TRACK = new DeepLink("TRACK", 4);
        PLAYLIST = new DeepLink("PLAYLIST", 5);
        SEARCH = new DeepLink("SEARCH", 6);
        RECORD = new DeepLink("RECORD", 7);
        WEB_VIEW = new DeepLink("WEB_VIEW", 8);
        OTHER = new DeepLink("OTHER", 9);
        $VALUES = (new DeepLink[] {
            HOME, STREAM, EXPLORE, USER, TRACK, PLAYLIST, SEARCH, RECORD, WEB_VIEW, OTHER
        });
        LOGGED_IN_REQUIRED = EnumSet.of(EXPLORE, new DeepLink[] {
            USER, TRACK, PLAYLIST, SEARCH, RECORD
        });
        RESOLVE_REQUIRED = EnumSet.of(USER, TRACK, PLAYLIST);
    }
}
