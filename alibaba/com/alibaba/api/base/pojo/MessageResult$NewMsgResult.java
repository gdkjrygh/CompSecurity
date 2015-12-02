// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.base.pojo;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.alibaba.api.base.pojo:
//            MessageResult

public class success
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public long id;
    public long productId;
    public String productImageUrl;
    public String productName;
    public long relationId;
    public List returnValue;
    public long sellerAdminSeq;
    public long sellerSeq;
    public boolean success;
    final MessageResult this$0;
    public int valueCount;

    public ()
    {
        this$0 = MessageResult.this;
        super();
        id = 0L;
        success = true;
    }
}
