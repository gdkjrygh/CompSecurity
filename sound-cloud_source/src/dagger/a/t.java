// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;


// Referenced classes of package dagger.a:
//            b

public abstract class t extends b
{

    protected final String methodName;
    protected final String moduleClass;

    public t(String s, boolean flag, String s1, String s2)
    {
        super(s, null, flag, (new StringBuilder()).append(s1).append(".").append(s2).append("()").toString());
        moduleClass = s1;
        methodName = s2;
    }

    public abstract Object get();

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("[key=").append(provideKey).append(" method=").append(moduleClass).append(".").append(methodName).append("()]").toString();
    }
}
