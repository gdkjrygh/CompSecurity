// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            AddToMyListWrapper

static class stState
{

    static final int $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[];

    static 
    {
        $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState = new int[stState.values().length];
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[stState.IN_LIST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[stState.NOT_IN_LIST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[stState.LOADING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
