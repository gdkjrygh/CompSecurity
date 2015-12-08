// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.Message;

// Referenced classes of package com.google.inject.internal:
//            Errors

interface ErrorHandler
{

    public abstract void handle(Message message);

    public abstract void handle(Object obj, Errors errors);
}
