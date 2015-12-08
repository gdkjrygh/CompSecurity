// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Memoizer, Loader

class <init> extends Memoizer
{

    final Loader this$0;

    protected Memoizer create(final ClassLoader classLoader)
    {
        return new Memoizer() {

            final Loader._cls1 this$1;
            final ClassLoader val$classLoader;

            protected Class create(String s)
            {
                try
                {
                    s = classLoader.loadClass(s);
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

            
            {
                this$1 = Loader._cls1.this;
                classLoader = classloader;
                super();
            }
        };
    }

    protected volatile Object create(Object obj)
    {
        return create((ClassLoader)obj);
    }

    <init>()
    {
        this$0 = Loader.this;
        super();
    }
}
