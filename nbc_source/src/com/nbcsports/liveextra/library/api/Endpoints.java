// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api;


public interface Endpoints
{
    public static interface Production
    {

        public static final String ANVATO_ACK = "nbcu_nbcsn_nbcsn_android_prod_b109b4f6825d04ea71bb272a16cd2c773aeb57df";
        public static final String ANVATO_URL = "http://tkx-cable-prod.nbc.anvato.net";
    }

    public static interface Staging
    {

        public static final String ANVATO_ACK = "nbcu_nbcsn_nbcsn_android_qa_7e7f07b29b0c5d4c61c139dc688c7f73f9c13bb3";
        public static final String ANVATO_URL = "http://tkx-cable-stage.nbc.anvato.net/";
    }

}
