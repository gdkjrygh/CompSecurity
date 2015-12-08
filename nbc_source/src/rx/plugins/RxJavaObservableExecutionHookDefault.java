// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.plugins;


// Referenced classes of package rx.plugins:
//            RxJavaObservableExecutionHook

class RxJavaObservableExecutionHookDefault extends RxJavaObservableExecutionHook
{

    private static RxJavaObservableExecutionHookDefault INSTANCE = new RxJavaObservableExecutionHookDefault();

    RxJavaObservableExecutionHookDefault()
    {
    }

    public static RxJavaObservableExecutionHook getInstance()
    {
        return INSTANCE;
    }

}
