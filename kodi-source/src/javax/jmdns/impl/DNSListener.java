// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;


// Referenced classes of package javax.jmdns.impl:
//            DNSCache, DNSEntry

interface DNSListener
{

    public abstract void updateRecord(DNSCache dnscache, long l, DNSEntry dnsentry);
}
