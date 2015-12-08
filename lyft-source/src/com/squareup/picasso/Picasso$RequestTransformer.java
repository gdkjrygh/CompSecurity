// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            Request

public interface _cls1
{

    public static final _cls1 IDENTITY = new Picasso.RequestTransformer() {

        public Request transformRequest(Request request)
        {
            return request;
        }

    };

    public abstract Request transformRequest(Request request);

}
