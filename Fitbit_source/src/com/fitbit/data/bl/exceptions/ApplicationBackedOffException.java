// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.exceptions;


// Referenced classes of package com.fitbit.data.bl.exceptions:
//            ServerCommunicationException

public class ApplicationBackedOffException extends ServerCommunicationException
{

    public static final int a = 409;
    private static final String b = "Application is backed off";
    private static final long serialVersionUID = 1L;
    private final com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType type;

    public ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType applicationbackofftype)
    {
        super(409, "Application is backed off");
        type = applicationbackofftype;
    }

    public com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType F_()
    {
        return type;
    }

    public String b()
    {
        return "ApplicationBackedOffException";
    }
}
