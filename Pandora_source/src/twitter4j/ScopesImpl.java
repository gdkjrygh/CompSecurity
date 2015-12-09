// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            Scopes

public class ScopesImpl
    implements Scopes
{

    private final String placeIds[];

    ScopesImpl()
    {
        placeIds = new String[0];
    }

    public ScopesImpl(String as[])
    {
        placeIds = as;
    }

    public String[] getPlaceIds()
    {
        return placeIds;
    }
}
