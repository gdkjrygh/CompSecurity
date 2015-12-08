// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;

import java.util.concurrent.Callable;

// Referenced classes of package rx.functions:
//            Function

public interface Func0
    extends Callable, Function
{

    public abstract Object call();
}
