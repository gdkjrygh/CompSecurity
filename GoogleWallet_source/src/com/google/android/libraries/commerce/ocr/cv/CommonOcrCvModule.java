// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            ResourcePool, OcrImage

public class CommonOcrCvModule
{

    private static final int POOL_CAPACITY = 5;

    public CommonOcrCvModule()
    {
    }

    public ResourcePool provideOcrImageResourcePool()
    {
        return new ResourcePool(5, new Provider() {

            final CommonOcrCvModule this$0;

            private static OcrImage get()
            {
                return new OcrImage();
            }

            public final volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = CommonOcrCvModule.this;
                super();
            }
        });
    }
}
