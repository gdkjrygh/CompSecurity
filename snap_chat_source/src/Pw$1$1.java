// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements Runnable
{

    final tus this$1;
    final tus val$status;

    public final void run()
    {
        Pw pw = _fld0;
        boolean flag;
        if (val$status == tus)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pw.a(flag);
    }

    ct()
    {
        this$1 = final_ct;
        val$status = tus.this;
        super();
    }

    // Unreferenced inner class Pw$1

/* anonymous class */
    public final class Pw._cls1
        implements Wv.a
    {

        final Pw this$0;

        public final void a(Wv.c c, String s)
        {
            PG.a(c. new Pw._cls1._cls1());
        }

            public 
            {
                this$0 = Pw.this;
                super();
            }
    }

}
