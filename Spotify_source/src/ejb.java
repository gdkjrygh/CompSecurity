// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class ejb extends eja
{

    static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):biography");

    public ejb(String s)
    {
        super(s);
    }

    public final String a()
    {
        return "biography";
    }

}
