// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            ScannerCache, Scanner

class ScannerFactory
{

    private final ScannerCache cache = new ScannerCache();

    public ScannerFactory()
    {
    }

    public Scanner getInstance(Class class1)
        throws Exception
    {
        Scanner scanner1 = (Scanner)cache.get(class1);
        Scanner scanner = scanner1;
        if (scanner1 == null)
        {
            scanner = new Scanner(class1);
            cache.put(class1, scanner);
        }
        return scanner;
    }
}
