// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, Loader

class nit> extends Memoizer
{

    final create this$1;
    final ClassLoader val$classLoader;

    protected Class create(String s)
    {
        try
        {
            s = val$classLoader.loadClass(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return java/lang/Void;
        }
        return s;
    }

    protected volatile Object create(Object obj)
    {
        return create((String)obj);
    }

    nit>()
    {
        this$1 = final_nit>;
        val$classLoader = ClassLoader.this;
        super();
    }

    // Unreferenced inner class dagger/internal/Loader$1

/* anonymous class */
    class Loader._cls1 extends Memoizer
    {

        final Loader this$0;

        protected Memoizer create(ClassLoader classloader)
        {
            return classloader. new Loader._cls1._cls1();
        }

        protected volatile Object create(Object obj)
        {
            return create((ClassLoader)obj);
        }

            
            {
                this$0 = Loader.this;
                super();
            }
    }

}
