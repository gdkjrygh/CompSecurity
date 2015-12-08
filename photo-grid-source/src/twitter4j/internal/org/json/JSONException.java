// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.org.json;


public class JSONException extends Exception
{

    private static final long serialVersionUID = 0L;
    private Throwable cause;

    public JSONException(String s)
    {
        super(s);
    }

    public JSONException(Throwable throwable)
    {
        super(throwable.getMessage());
        cause = throwable;
    }

    public Throwable getCause()
    {
        return cause;
    }
}
