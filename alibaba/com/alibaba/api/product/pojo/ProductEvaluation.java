// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.product.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductEvaluation
    implements Serializable
{
    public static class ProductEvaluationStatistic
        implements Serializable
    {

        public String evarageStar;
        public String evarageStarRage;
        public int fiveStarNum;
        public String fiveStarRate;
        public int fourStarNum;
        public String fourStarRate;
        public int negativeNum;
        public String negativeRate;
        public int neutralNum;
        public String neutralRate;
        public int oneStarNum;
        public String oneStarRate;
        public int positiveNum;
        public String positiveRate;
        public int threeStarNum;
        public String threeStarRate;
        public String totalNum;
        public int twoStarNum;
        public String twoStarRate;

        public ProductEvaluationStatistic()
        {
        }
    }


    public int currentPage;
    public ArrayList evaViewList;
    public int pageSize;
    public ProductEvaluationStatistic productEvaluationStatistic;
    public int totalNum;
    public int totalPage;

    public ProductEvaluation()
    {
        evaViewList = new ArrayList();
    }
}
