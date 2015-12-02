// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;
import java.util.HashMap;

public class SellerInfo
    implements Serializable
{
    public static class Feedback
        implements Serializable
    {

        private static final long serialVersionUID = 0xef4f4edd8a5c2d9L;
        public String negative;
        public String neutral;
        public String positive;
        public String type;

        public Feedback()
        {
        }
    }


    private static final long serialVersionUID = 0xa46e433624b07765L;
    public String companyId;
    public HashMap feedbackHistory;
    public String feedbackRating;
    public String level;
    public String local;
    public String percentageTsr;
    public String percentageTsrLevel;
    public String score;
    public String since;
    public String storeName;

    public SellerInfo()
    {
    }
}
