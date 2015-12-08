// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;


// Referenced classes of package io.fabric.sdk.android.services.network:
//            DefaultHttpRequestFactory, HttpMethod

static class 
{

    static final int $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[];

    static 
    {
        $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod = new int[HttpMethod.values().length];
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.GET.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.POST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.PUT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.DELETE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
