// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;


// Referenced classes of package javax.jmdns:
//            ServiceInfo

public static final class  extends Enum
{

    private static final Subtype $VALUES[];
    public static final Subtype Application;
    public static final Subtype Domain;
    public static final Subtype Instance;
    public static final Subtype Protocol;
    public static final Subtype Subtype;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(javax/jmdns/ServiceInfo$Fields, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Domain = new <init>("Domain", 0);
        Protocol = new <init>("Protocol", 1);
        Application = new <init>("Application", 2);
        Instance = new <init>("Instance", 3);
        Subtype = new <init>("Subtype", 4);
        $VALUES = (new .VALUES[] {
            Domain, Protocol, Application, Instance, Subtype
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
