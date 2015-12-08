// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.GI;

// Referenced classes of package com.skype.android.gen:
//            GIListener

public static class _error
{

    private com.skype.OnFileError._sender _error;
    private GI _sender;

    public com.skype.OnFileError getError()
    {
        return _error;
    }

    public GI getSender()
    {
        return _sender;
    }

    public (GI gi, com.skype.OnFileError onfileerror)
    {
        _sender = gi;
        _error = onfileerror;
    }
}
