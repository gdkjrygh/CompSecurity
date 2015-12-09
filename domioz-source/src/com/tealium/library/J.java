// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;


// Referenced classes of package com.tealium.library:
//            RemoteCommand, d

final class J extends RemoteCommand
{

    public J()
    {
        super("_mobilecompanion", "Launch Mobile Companion.");
    }

    protected final void onInvoke(RemoteCommand.Response response)
    {
        d.g();
        response.setStatus(200).send();
    }
}
