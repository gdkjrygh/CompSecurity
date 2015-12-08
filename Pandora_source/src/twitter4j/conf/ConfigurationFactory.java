// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;


// Referenced classes of package twitter4j.conf:
//            Configuration

public interface ConfigurationFactory
{

    public abstract void dispose();

    public abstract Configuration getInstance();

    public abstract Configuration getInstance(String s);
}
