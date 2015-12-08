// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Binding

public abstract class ProvidesBinding extends Binding
{

    protected final String methodName;
    protected final String moduleClass;

    public ProvidesBinding(String s, boolean flag, String s1, String s2)
    {
        super(s, null, flag, (new StringBuilder(s1.length() + s2.length() + 3)).append(s1).append('.').append(s2).append("()").toString());
        moduleClass = s1;
        methodName = s2;
    }

    public abstract Object get();

    public String toString()
    {
        String s = String.valueOf(getClass().getName());
        String s1 = provideKey;
        String s2 = moduleClass;
        String s3 = methodName;
        return (new StringBuilder(String.valueOf(s).length() + 17 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("[key=").append(s1).append(" method=").append(s2).append(".").append(s3).append("()]").toString();
    }
}
