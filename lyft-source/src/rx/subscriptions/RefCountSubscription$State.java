// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subscriptions;


final class children
{

    final int children;
    final boolean isUnsubscribed;

    children addChild()
    {
        return new <init>(isUnsubscribed, children + 1);
    }

    children removeChild()
    {
        return new <init>(isUnsubscribed, children - 1);
    }

    children unsubscribe()
    {
        return new <init>(true, children);
    }

    (boolean flag, int i)
    {
        isUnsubscribed = flag;
        children = i;
    }
}
