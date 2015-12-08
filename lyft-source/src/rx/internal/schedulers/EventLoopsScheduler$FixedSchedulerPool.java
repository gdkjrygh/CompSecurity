// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;


// Referenced classes of package rx.internal.schedulers:
//            EventLoopsScheduler

final class eventLoops
{

    final int cores;
    final cores eventLoops[];
    long n;

    public eventLoops getEventLoop()
    {
        eventLoops aeventloops[] = eventLoops;
        long l = n;
        n = 1L + l;
        return aeventloops[(int)(l % (long)cores)];
    }

    ()
    {
        cores = EventLoopsScheduler.MAX_THREADS;
        eventLoops = new eventLoops[cores];
        for (int i = 0; i < cores; i++)
        {
            eventLoops[i] = new eventLoops(EventLoopsScheduler.access$000());
        }

    }
}
