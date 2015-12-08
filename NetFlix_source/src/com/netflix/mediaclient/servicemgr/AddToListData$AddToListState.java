// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AddToListData

public static final class  extends Enum
{

    private static final LOADING $VALUES[];
    public static final LOADING IN_LIST;
    public static final LOADING LOADING;
    public static final LOADING NOT_IN_LIST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/AddToListData$AddToListState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IN_LIST = new <init>("IN_LIST", 0);
        NOT_IN_LIST = new <init>("NOT_IN_LIST", 1);
        LOADING = new <init>("LOADING", 2);
        $VALUES = (new .VALUES[] {
            IN_LIST, NOT_IN_LIST, LOADING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
