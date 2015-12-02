// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductEvaluationItem
    implements Serializable
{

    public boolean anonymous;
    public String buyerAnonymousName;
    public String buyerCountry;
    public String buyerEval;
    public String buyerEvaluationLevel;
    public String buyerFeedback;
    public String buyerName;
    public String buyerReply;
    public String buyerScore;
    public String gmtValid;
    public ArrayList images;
    public int productNum;
    public String productUnit;
    public String sellerEval;
    public String sellerFeedback;
    public String sellerName;
    public String sellerReply;
    public String status;

    public ProductEvaluationItem()
    {
        images = new ArrayList();
    }
}
