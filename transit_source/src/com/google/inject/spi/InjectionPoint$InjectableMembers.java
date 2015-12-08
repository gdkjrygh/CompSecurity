// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;


// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static class 
{

    revious head;
    revious tail;

    void add( )
    {
        if (head == null)
        {
            tail = ;
            head = ;
            return;
        } else
        {
            .revious = tail;
            tail.ext = ;
            tail = ;
            return;
        }
    }

    boolean isEmpty()
    {
        return head == null;
    }

    void remove(head head1)
    {
        if (head1.revious != null)
        {
            head1.revious.ext = head1.ext;
        }
        if (head1.ext != null)
        {
            head1.ext.revious = head1.revious;
        }
        if (head == head1)
        {
            head = head1.ext;
        }
        if (tail == head1)
        {
            tail = head1.revious;
        }
    }

    ()
    {
    }
}
