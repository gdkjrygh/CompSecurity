// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            StreamProvider, PullProvider, DocumentProvider, Provider

final class ProviderFactory
{

    public static Provider getInstance()
    {
        StreamProvider streamprovider;
        try
        {
            streamprovider = new StreamProvider();
        }
        catch (Throwable throwable)
        {
            PullProvider pullprovider;
            try
            {
                pullprovider = new PullProvider();
            }
            catch (Throwable throwable1)
            {
                return new DocumentProvider();
            }
            return pullprovider;
        }
        return streamprovider;
    }
}
