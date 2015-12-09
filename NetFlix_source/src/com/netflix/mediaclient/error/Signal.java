// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;


public final class Signal extends Enum
{

    private static final Signal $VALUES[];
    public static final Signal SIGABRT;
    public static final Signal SIGALRM;
    public static final Signal SIGBUS;
    public static final Signal SIGCHLD;
    public static final Signal SIGCONT;
    public static final Signal SIGFPE;
    public static final Signal SIGHUP;
    public static final Signal SIGILL;
    public static final Signal SIGINT;
    public static final Signal SIGIO;
    public static final Signal SIGKILL;
    public static final Signal SIGPIPE;
    public static final Signal SIGPROF;
    public static final Signal SIGPWR;
    public static final Signal SIGQUIT;
    public static final Signal SIGRTMIN;
    public static final Signal SIGSEGV;
    public static final Signal SIGSTKFLT;
    public static final Signal SIGSTOP;
    public static final Signal SIGSYS;
    public static final Signal SIGTERM;
    public static final Signal SIGTRAP;
    public static final Signal SIGTSTP;
    public static final Signal SIGTTIN;
    public static final Signal SIGTTOU;
    public static final Signal SIGURG;
    public static final Signal SIGUSR1;
    public static final Signal SIGUSR2;
    public static final Signal SIGVTALRM;
    public static final Signal SIGWINCH;
    public static final Signal SIGXCPU;
    public static final Signal SIGXFSZ;
    protected String description;
    protected int value;

    private Signal(String s, int i, int j, String s1)
    {
        super(s, i);
        value = j;
        description = s1;
    }

    public static Signal toSignal(int i)
    {
        for (int j = 0; j < values().length; j++)
        {
            if (values()[j].value == i)
            {
                return values()[j];
            }
        }

        return null;
    }

    public static Signal valueOf(String s)
    {
        return (Signal)Enum.valueOf(com/netflix/mediaclient/error/Signal, s);
    }

    public static Signal[] values()
    {
        return (Signal[])$VALUES.clone();
    }

    public String getDescription()
    {
        return description;
    }

    public int getNumber()
    {
        return value;
    }

    static 
    {
        SIGHUP = new Signal("SIGHUP", 0, 1, "SIGHUP");
        SIGINT = new Signal("SIGINT", 1, 2, "SIGINT");
        SIGQUIT = new Signal("SIGQUIT", 2, 3, "SIGQUIT");
        SIGILL = new Signal("SIGILL", 3, 4, "SIGILL");
        SIGTRAP = new Signal("SIGTRAP", 4, 5, "SIGTRAP");
        SIGABRT = new Signal("SIGABRT", 5, 6, "SIGABRT");
        SIGBUS = new Signal("SIGBUS", 6, 7, "SIGBUS");
        SIGFPE = new Signal("SIGFPE", 7, 8, "SIGFPE");
        SIGKILL = new Signal("SIGKILL", 8, 9, "SIGKILL");
        SIGUSR1 = new Signal("SIGUSR1", 9, 10, "SIGUSR1");
        SIGSEGV = new Signal("SIGSEGV", 10, 11, "SIGSEGV");
        SIGUSR2 = new Signal("SIGUSR2", 11, 12, "SIGUSR2");
        SIGPIPE = new Signal("SIGPIPE", 12, 13, "SIGPIPE");
        SIGALRM = new Signal("SIGALRM", 13, 14, "SIGALRM");
        SIGTERM = new Signal("SIGTERM", 14, 15, "SIGTERM");
        SIGSTKFLT = new Signal("SIGSTKFLT", 15, 16, "SIGSTKFLT");
        SIGCHLD = new Signal("SIGCHLD", 16, 17, "SIGCHLD");
        SIGCONT = new Signal("SIGCONT", 17, 18, "SIGCONT");
        SIGSTOP = new Signal("SIGSTOP", 18, 19, "SIGSTOP");
        SIGTSTP = new Signal("SIGTSTP", 19, 20, "SIGTSTP");
        SIGTTIN = new Signal("SIGTTIN", 20, 21, "SIGTTIN");
        SIGTTOU = new Signal("SIGTTOU", 21, 22, "SIGTTOU");
        SIGURG = new Signal("SIGURG", 22, 23, "SIGURG");
        SIGXCPU = new Signal("SIGXCPU", 23, 24, "SIGXCPU");
        SIGXFSZ = new Signal("SIGXFSZ", 24, 25, "SIGXFSZ");
        SIGVTALRM = new Signal("SIGVTALRM", 25, 26, "SIGVTALRM");
        SIGPROF = new Signal("SIGPROF", 26, 27, "SIGPROF");
        SIGWINCH = new Signal("SIGWINCH", 27, 28, "SIGWINCH");
        SIGIO = new Signal("SIGIO", 28, 29, "SIGIO");
        SIGPWR = new Signal("SIGPWR", 29, 30, "SIGPWR");
        SIGSYS = new Signal("SIGSYS", 30, 31, "SIGSYS");
        SIGRTMIN = new Signal("SIGRTMIN", 31, 32, "SIGRTMIN");
        $VALUES = (new Signal[] {
            SIGHUP, SIGINT, SIGQUIT, SIGILL, SIGTRAP, SIGABRT, SIGBUS, SIGFPE, SIGKILL, SIGUSR1, 
            SIGSEGV, SIGUSR2, SIGPIPE, SIGALRM, SIGTERM, SIGSTKFLT, SIGCHLD, SIGCONT, SIGSTOP, SIGTSTP, 
            SIGTTIN, SIGTTOU, SIGURG, SIGXCPU, SIGXFSZ, SIGVTALRM, SIGPROF, SIGWINCH, SIGIO, SIGPWR, 
            SIGSYS, SIGRTMIN
        });
    }
}
