// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.exception;


// Referenced classes of package com.ford.syncV4.exception:
//            SyncExceptionCause

public class SyncException extends Exception
{

    private static final long serialVersionUID = 0x5230eb5c59f24e4fL;
    public SyncExceptionCause _syncExceptionCause;
    protected Throwable detail;

    public SyncException(String s, SyncExceptionCause syncexceptioncause)
    {
        super(s);
        detail = null;
        _syncExceptionCause = null;
        _syncExceptionCause = syncexceptioncause;
    }

    public SyncException(String s, Throwable throwable, SyncExceptionCause syncexceptioncause)
    {
        super((new StringBuilder()).append(s).append(" --- Check inner exception for diagnostic details").toString());
        detail = null;
        _syncExceptionCause = null;
        detail = throwable;
        _syncExceptionCause = syncexceptioncause;
    }

    public SyncException(Throwable throwable)
    {
        super(throwable.getMessage());
        detail = null;
        _syncExceptionCause = null;
        detail = throwable;
    }

    public String toString()
    {
        String s = getClass().getName();
        String s1 = (new StringBuilder()).append(s).append(": ").append(getMessage()).toString();
        s = s1;
        if (_syncExceptionCause != null)
        {
            s = (new StringBuilder()).append(s1).append("\nSyncExceptionCause: ").append(_syncExceptionCause.name()).toString();
        }
        s1 = s;
        if (detail != null)
        {
            s1 = (new StringBuilder()).append(s).append("\nnested: ").append(detail.toString()).toString();
            detail.printStackTrace();
        }
        return s1;
    }
}
