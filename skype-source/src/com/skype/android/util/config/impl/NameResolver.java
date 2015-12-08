// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl;


// Referenced classes of package com.skype.android.util.config.impl:
//            ConfigParseException

public interface NameResolver
{

    public abstract String getPrefix();

    public abstract String getValue(String s)
        throws ConfigParseException;
}
