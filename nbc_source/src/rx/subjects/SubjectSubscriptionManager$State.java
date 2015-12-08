// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;


// Referenced classes of package rx.subjects:
//            SubjectSubscriptionManager

protected static final class observers
{

    static final NO_OBSERVERS EMPTY;
    static final tObserver NO_OBSERVERS[];
    static final tObserver TERMINATED;
    final tObserver observers[];
    final boolean terminated;

    public tObserver add(tObserver tobserver)
    {
        int i = observers.length;
        tObserver atobserver[] = new tObserver[i + 1];
        System.arraycopy(observers, 0, atobserver, 0, i);
        atobserver[i] = tobserver;
        return new <init>(terminated, atobserver);
    }

    public tObserver remove(tObserver tobserver)
    {
        tObserver atobserver1[];
        int l;
        atobserver1 = observers;
        l = atobserver1.length;
        if (l != 1 || atobserver1[0] != tobserver) goto _L2; else goto _L1
_L1:
        tObserver tobserver1 = EMPTY;
_L4:
        return tobserver1;
_L2:
        tobserver1 = this;
        if (l == 0) goto _L4; else goto _L3
_L3:
        tObserver atobserver[];
        int i;
        int j;
        atobserver = new tObserver[l - 1];
        j = 0;
        i = 0;
_L8:
        if (j >= l) goto _L6; else goto _L5
_L5:
        tObserver tobserver2;
        tobserver2 = atobserver1[j];
        if (tobserver2 == tobserver)
        {
            continue; /* Loop/switch isn't completed */
        }
        tobserver1 = this;
        if (i == l - 1) goto _L4; else goto _L7
_L7:
        int k = i + 1;
        atobserver[i] = tobserver2;
        i = k;
        j++;
          goto _L8
_L6:
        if (i == 0)
        {
            return EMPTY;
        }
        tobserver = atobserver;
        if (i < l - 1)
        {
            tobserver = new tObserver[i];
            System.arraycopy(atobserver, 0, tobserver, 0, i);
        }
        return new <init>(terminated, tobserver);
    }

    static 
    {
        NO_OBSERVERS = new tObserver[0];
        TERMINATED = new <init>(true, NO_OBSERVERS);
        EMPTY = new <init>(false, NO_OBSERVERS);
    }

    public tObserver(boolean flag, tObserver atobserver[])
    {
        terminated = flag;
        observers = atobserver;
    }
}
