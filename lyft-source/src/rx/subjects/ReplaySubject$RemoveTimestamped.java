// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.functions.Func1;
import rx.schedulers.Timestamped;

final class 
    implements Func1
{

    public Object call(Object obj)
    {
        return ((Timestamped)obj).getValue();
    }

    ()
    {
    }
}
