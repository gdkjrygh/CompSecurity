// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.json.JSONObject;

// Referenced classes of package com.worklight.common:
//            Logger

protected static abstract class  extends Logger
{

    public abstract byte[] getFileContentsAsByteArray(File file)
        throws UnsupportedEncodingException;

    public abstract void log(JSONObject jsonobject, String s)
        throws SecurityException, IOException;

    protected (String s, String s1)
    {
        super(s, s1);
    }
}
