// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PKIXPolicyNode
    implements PolicyNode
{

    protected List a;
    protected int b;
    protected Set c;
    protected PolicyNode d;
    protected Set e;
    protected String f;
    protected boolean g;

    public PKIXPolicyNode(List list, int i, Set set, PolicyNode policynode, Set set1, String s, boolean flag)
    {
        a = list;
        b = i;
        c = set;
        d = policynode;
        e = set1;
        f = s;
        g = flag;
    }

    private String a(String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(s);
        stringbuffer.append(f);
        stringbuffer.append(" {\n");
        for (int i = 0; i < a.size(); i++)
        {
            stringbuffer.append(((PKIXPolicyNode)a.get(i)).a((new StringBuilder()).append(s).append("    ").toString()));
        }

        stringbuffer.append(s);
        stringbuffer.append("}\n");
        return stringbuffer.toString();
    }

    private PKIXPolicyNode b()
    {
        Object obj = new HashSet();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((Set) (obj)).add(new String((String)iterator.next()))) { }
        HashSet hashset = new HashSet();
        for (Iterator iterator2 = e.iterator(); iterator2.hasNext(); hashset.add(new String((String)iterator2.next()))) { }
        obj = new PKIXPolicyNode(new ArrayList(), b, ((Set) (obj)), null, hashset, new String(f), g);
        PKIXPolicyNode pkixpolicynode;
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((PKIXPolicyNode) (obj)).a(pkixpolicynode))
        {
            pkixpolicynode = ((PKIXPolicyNode)iterator1.next()).b();
            pkixpolicynode.d = ((PolicyNode) (obj));
        }

        return ((PKIXPolicyNode) (obj));
    }

    public final void a(PKIXPolicyNode pkixpolicynode)
    {
        a.add(pkixpolicynode);
        pkixpolicynode.d = this;
    }

    public final void a(boolean flag)
    {
        g = flag;
    }

    public final boolean a()
    {
        return !a.isEmpty();
    }

    public final void b(PKIXPolicyNode pkixpolicynode)
    {
        a.remove(pkixpolicynode);
    }

    public Object clone()
    {
        return b();
    }

    public Iterator getChildren()
    {
        return a.iterator();
    }

    public int getDepth()
    {
        return b;
    }

    public Set getExpectedPolicies()
    {
        return c;
    }

    public PolicyNode getParent()
    {
        return d;
    }

    public Set getPolicyQualifiers()
    {
        return e;
    }

    public String getValidPolicy()
    {
        return f;
    }

    public boolean isCritical()
    {
        return g;
    }

    public String toString()
    {
        return a("");
    }
}
