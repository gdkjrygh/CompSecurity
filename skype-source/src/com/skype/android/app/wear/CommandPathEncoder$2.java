// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;


// Referenced classes of package com.skype.android.app.wear:
//            CommandPathEncoder

static final class 
    implements CommandPathEncoder
{

    public final transient String encode(String s, Object aobj[])
    {
        return (new StringBuilder("/")).append(s).append('/').append(aobj[0]).toString();
    }

    ()
    {
    }
}
