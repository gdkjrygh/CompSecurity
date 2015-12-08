// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.escape.CharEscapers;
import java.util.Map;

// Referenced classes of package com.google.api.client.http:
//            UriTemplate

private static final class ES extends Enum
{

    private static final SIMPLE $VALUES[];
    public static final SIMPLE AMP;
    public static final SIMPLE DOT;
    public static final SIMPLE FORWARD_SLASH;
    public static final SIMPLE HASH;
    public static final SIMPLE PLUS;
    public static final SIMPLE QUERY;
    public static final SIMPLE SEMI_COLON;
    public static final SIMPLE SIMPLE;
    private final String explodeJoiner;
    private final String outputPrefix;
    private final Character propertyPrefix;
    private final boolean requiresVarAssignment;
    private final boolean reservedExpansion;

    public static ES valueOf(String s)
    {
        return (ES)Enum.valueOf(com/google/api/client/http/UriTemplate$CompositeOutput, s);
    }

    public static ES[] values()
    {
        return (ES[])$VALUES.clone();
    }

    String getEncodedValue(String s)
    {
        if (reservedExpansion)
        {
            return CharEscapers.escapeUriPath(s);
        } else
        {
            return CharEscapers.escapeUri(s);
        }
    }

    String getExplodeJoiner()
    {
        return explodeJoiner;
    }

    String getOutputPrefix()
    {
        return outputPrefix;
    }

    boolean getReservedExpansion()
    {
        return reservedExpansion;
    }

    int getVarNameStartIndex()
    {
        return propertyPrefix != null ? 1 : 0;
    }

    boolean requiresVarAssignment()
    {
        return requiresVarAssignment;
    }

    static 
    {
        PLUS = new <init>("PLUS", 0, Character.valueOf('+'), "", ",", false, true);
        HASH = new <init>("HASH", 1, Character.valueOf('#'), "#", ",", false, true);
        DOT = new <init>("DOT", 2, Character.valueOf('.'), ".", ".", false, false);
        FORWARD_SLASH = new <init>("FORWARD_SLASH", 3, Character.valueOf('/'), "/", "/", false, false);
        SEMI_COLON = new <init>("SEMI_COLON", 4, Character.valueOf(';'), ";", ";", true, false);
        QUERY = new <init>("QUERY", 5, Character.valueOf('?'), "?", "&", true, false);
        AMP = new <init>("AMP", 6, Character.valueOf('&'), "&", "&", true, false);
        SIMPLE = new <init>("SIMPLE", 7, null, "", ",", false, false);
        $VALUES = (new .VALUES[] {
            PLUS, HASH, DOT, FORWARD_SLASH, SEMI_COLON, QUERY, AMP, SIMPLE
        });
    }

    private (String s, int i, Character character, String s1, String s2, boolean flag, boolean flag1)
    {
        super(s, i);
        propertyPrefix = character;
        outputPrefix = (String)Preconditions.checkNotNull(s1);
        explodeJoiner = (String)Preconditions.checkNotNull(s2);
        requiresVarAssignment = flag;
        reservedExpansion = flag1;
        if (character != null)
        {
            UriTemplate.COMPOSITE_PREFIXES.put(character, this);
        }
    }
}
