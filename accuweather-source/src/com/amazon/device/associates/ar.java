// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            RequestId, PurchaseRequest, ay, ReceiptsRequest, 
//            SearchByIdRequest, SearchRequest

interface ar
{

    public abstract void a(RequestId requestid, PurchaseRequest purchaserequest, ay ay);

    public abstract void a(RequestId requestid, ReceiptsRequest receiptsrequest, ay ay);

    public abstract void a(RequestId requestid, SearchByIdRequest searchbyidrequest, ay ay);

    public abstract void a(RequestId requestid, SearchRequest searchrequest, ay ay);

    public abstract void a(RequestId requestid, ay ay);

    public abstract void b(RequestId requestid, ay ay);

    public abstract void c(RequestId requestid, ay ay);
}
