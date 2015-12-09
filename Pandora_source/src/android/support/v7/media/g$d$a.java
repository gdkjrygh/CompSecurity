// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            g, n

private final class <init> extends Handler
{

    final b a;
    private final ArrayList b;

    private void a(<init> <init>1, int i, Object obj)
    {
        g g1;
        <init> <init>2;
        g1 = <init>1.<init>;
        <init>2 = <init>1.<init>;
        0xff00 & i;
        JVM INSTR lookupswitch 2: default 44
    //                   256: 45
    //                   512: 164;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (<init>1.<init>(((<init>) (obj = (<init>)obj))))
        {
            switch (i)
            {
            default:
                return;

            case 257: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 258: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 259: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 260: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 261: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 262: 
                <init>2.<init>(g1, ((<init>) (obj)));
                return;

            case 263: 
                <init>2.<init>(g1, ((<init>) (obj)));
                break;
            }
            return;
        }
          goto _L1
_L3:
        <init>1 = (<init>)obj;
        switch (i)
        {
        default:
            return;

        case 513: 
            <init>2.<init>(g1, <init>1);
            return;

        case 514: 
            <init>2.<init>(g1, <init>1);
            return;

        case 515: 
            <init>2.<init>(g1, <init>1);
            break;
        }
        return;
    }

    private void b(int i, Object obj)
    {
        switch (i)
        {
        case 260: 
        case 261: 
        default:
            return;

        case 257: 
            <init>(a).a((a)obj);
            return;

        case 258: 
            a(a).b((a)obj);
            return;

        case 259: 
            a(a).c((a)obj);
            return;

        case 262: 
            a(a).d((a)obj);
            break;
        }
    }

    public void a(int i, Object obj)
    {
        obtainMessage(i, obj).sendToTarget();
    }

    public void handleMessage(Message message)
    {
        int j;
        j = message.what;
        message = ((Message) (message.obj));
        b(j, message);
        int i = b(a).size();
_L1:
        i--;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        g g1 = (g)((WeakReference)a(a).get(i)).get();
        if (g1 != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        (a).remove(i);
          goto _L1
        b.addAll(g1.c);
          goto _L1
        message;
        b.clear();
        throw message;
        int k = b.size();
        i = 0;
_L3:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        a((a)b.get(i), j, message);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        b.clear();
        return;
    }

    private ( )
    {
        a = ;
        super();
        b = new ArrayList();
    }

    b(b b1, b b2)
    {
        this(b1);
    }
}
