// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements Runnable
{

    final t this$1;
    final t val$task;

    public final void run()
    {
        pi pi = val$task.executeSynchronously();
        if (pi != null)
        {
            val$task.onResult(pi);
        }
    }

    able()
    {
        this$1 = final_able;
        val$task = k.this;
        super();
    }
}
