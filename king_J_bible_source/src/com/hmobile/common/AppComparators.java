// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import com.hmobile.model.LikeShareInfo;
import java.util.Comparator;

public class AppComparators
{

    private static AppComparators _instance = null;
    public Comparator ComparatorMostLike;
    public Comparator ComparatorMostShare;

    public AppComparators()
    {
        ComparatorMostLike = new Comparator() {

            final AppComparators this$0;

            public int compare(LikeShareInfo likeshareinfo, LikeShareInfo likeshareinfo1)
            {
                int i = likeshareinfo.likes;
                int j = likeshareinfo1.likes;
                if (i == j)
                {
                    return 0;
                }
                return i <= j ? 1 : -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((LikeShareInfo)obj, (LikeShareInfo)obj1);
            }

            
            {
                this$0 = AppComparators.this;
                super();
            }
        };
        ComparatorMostShare = new Comparator() {

            final AppComparators this$0;

            public int compare(LikeShareInfo likeshareinfo, LikeShareInfo likeshareinfo1)
            {
                int i = likeshareinfo.shares;
                int j = likeshareinfo1.shares;
                if (i == j)
                {
                    return 0;
                }
                return i <= j ? 1 : -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((LikeShareInfo)obj, (LikeShareInfo)obj1);
            }

            
            {
                this$0 = AppComparators.this;
                super();
            }
        };
    }

    public static AppComparators Instance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/common/AppComparators;
        JVM INSTR monitorenter ;
        _instance = new AppComparators();
        com/hmobile/common/AppComparators;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        com/hmobile/common/AppComparators;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
