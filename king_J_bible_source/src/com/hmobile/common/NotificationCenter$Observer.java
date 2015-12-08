// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;


// Referenced classes of package com.hmobile.common:
//            NotificationCenter

class Params
{

    public Object Clazz;
    public String MethodName;
    public String NotificationType;
    public Object Params[];
    final NotificationCenter this$0;

    public boolean equals(Object obj)
    {
        if (obj.getClass() == com/hmobile/common/NotificationCenter$Observer)
        {
            obj = (Params)obj;
            break MISSING_BLOCK_LABEL_14;
        }
        do
        {
            return false;
        } while (!((Params) (obj)).NotificationType.equalsIgnoreCase(NotificationType) || ((NotificationType) (obj)).Clazz.getClass() != Clazz.getClass() || !((Clazz) (obj)).MethodName.equalsIgnoreCase(MethodName) || Params != ((Params) (obj)).Params);
        return true;
    }

    public (Object obj, String s, String s1, Object aobj[])
    {
        this$0 = NotificationCenter.this;
        super();
        Clazz = obj;
        MethodName = s1;
        NotificationType = s;
        Params = aobj;
    }
}
