// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.net.Uri;
import com.google.android.apps.wallet.api.UriRegistry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WobsApi
{

    private static final Pattern TAP_TARGET_URI_PATTERN = Pattern.compile(".*tap-uri\\s*=\\s*.comgooglewallet.*");
    private static final Pattern TYPED_IDENTIFIER_PATTERN = Pattern.compile(".+/([^/]+)");
    public static final Uri VIEW_WOBL_URI_PATTERNS[] = {
        Uri.parse("comgooglewallet:///objects/instance/{instanceId}/view/entry/{entryPoint}"), Uri.parse("https://wallet.google.com/m/cgw/objects/instance/{instanceId}/view/entry/{entryPoint}"), Uri.parse("https://wallet.google.com/manage/cgw/objects/instance/{instanceId}/view/entry/{entryPoint}")
    };
    private static final Pattern WOB_TYPED_IDENTIFIER_PATTERN = Pattern.compile("/objects/instance/.*");

    public static boolean isWobTypedIdentifier(String s)
    {
        return WOB_TYPED_IDENTIFIER_PATTERN.matcher(s).matches();
    }

    public static String parseEntrypointNameFromViewWoblUri(String s)
    {
        Uri auri[] = VIEW_WOBL_URI_PATTERNS;
        int j = auri.length;
        for (int i = 0; i < j; i++)
        {
            String as[] = parseVariables(auri[i], s);
            if (as != null)
            {
                return as[1];
            }
        }

        return null;
    }

    public static String parseIdFromTypedIdentifier(String s)
    {
        s = TYPED_IDENTIFIER_PATTERN.matcher(s);
        if (s.matches())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    public static String parsePieceNameFromViewWoblUri(String s)
    {
        Uri auri[] = VIEW_WOBL_URI_PATTERNS;
        int j = auri.length;
        for (int i = 0; i < j; i++)
        {
            if (parseVariables(auri[i], s) != null)
            {
                return Uri.parse(s).getFragment();
            }
        }

        return null;
    }

    public static String parseTypedIdFromViewWoblUri(String s)
    {
        Uri auri[] = VIEW_WOBL_URI_PATTERNS;
        int j = auri.length;
        for (int i = 0; i < j; i++)
        {
            String as[] = parseVariables(auri[i], s);
            if (as != null)
            {
                s = String.valueOf("/objects/instance/");
                String s1 = String.valueOf(as[0]);
                if (s1.length() != 0)
                {
                    return s.concat(s1);
                } else
                {
                    return new String(s);
                }
            }
        }

        return null;
    }

    private static String[] parseVariables(Uri uri, String s)
    {
        s = Uri.parse(s);
        if (!uri.getScheme().equals(s.getScheme()) || !uri.getHost().equals(s.getHost()))
        {
            return null;
        } else
        {
            return UriRegistry.parseVariables(uri, s);
        }
    }

    public static boolean uriMatchesViewWoblPattern(String s)
    {
        boolean flag1 = false;
        Uri auri[] = VIEW_WOBL_URI_PATTERNS;
        int j = auri.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (parseVariables(auri[i], s) == null)
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

}
