// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            FailoverLoader

static final class className
{

    private final ClassLoader classLoader;
    private final String className;

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof className)
            {
                if (classLoader != ((classLoader) (obj = (classLoader)obj)).classLoader || !className.equals(((className) (obj)).className))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return className.hashCode();
    }



    (ClassLoader classloader, String s)
    {
        classLoader = classloader;
        className = s;
    }
}
