// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.wobs.common.uri;

import com.google.commerce.wobs.common.Entrypoint;
import java.net.URI;
import java.net.URISyntaxException;

public final class WobUris
{

    private static URI formatUri(String s, String s1, String s2)
    {
        return formatUri(s, s1, s2, null);
    }

    private static URI formatUri(String s, String s1, String s2, String s3)
    {
        return formatUri(s, s1, s2, null, s3);
    }

    private static URI formatUri(String s, String s1, String s2, String s3, String s4)
    {
        try
        {
            s = new URI(s, null, s1, -1, s2, s3, s4);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static URI getEntrypointUriFromTypedIdentifier(String s, String s1)
    {
        return formatUri("comgooglewallet", "", String.format("%s/%s", new Object[] {
            s, String.format("%s%s", new Object[] {
                "view/entry/", s1
            })
        }));
    }

    public static URI getEntrypointUriFromTypedIdentifier(String s, String s1, String s2)
    {
        return formatUri("comgooglewallet", "", String.format("%s/%s", new Object[] {
            s, String.format("%s%s", new Object[] {
                "view/entry/", s1
            })
        }), s2);
    }

    public static URI getLoyaltyProgramEntrypointUri(String s, Entrypoint entrypoint)
    {
        return formatUri("comgooglewallet", "", String.format("%s/%s", new Object[] {
            String.format("%s%s", new Object[] {
                "/loyalty/discoverable/", s
            }), String.format("%s%s", new Object[] {
                "view/entry/", entrypoint
            })
        }));
    }

    public static URI getWobHolderInstanceEntrypointUri(String s, Entrypoint entrypoint)
    {
        return getWobHolderInstancePieceUri(s, entrypoint, null);
    }

    private static URI getWobHolderInstancePieceUri(String s, Entrypoint entrypoint, String s1)
    {
        return getWobHolderInstancePieceUri(s, entrypoint.toString(), s1);
    }

    private static URI getWobHolderInstancePieceUri(String s, String s1, String s2)
    {
        return formatUri("comgooglewallet", "", String.format("%s/%s", new Object[] {
            String.format("%s%s", new Object[] {
                "/objects/instance/", s
            }), String.format("%s%s", new Object[] {
                "view/entry/", s1
            })
        }), s2);
    }
}
