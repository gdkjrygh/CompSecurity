// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import com.nuance.b.a.a;
import com.nuance.b.a.f;
import com.nuance.b.a.g;
import com.nuance.b.a.i;
import com.nuance.b.a.q;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            BaseAgent

public class BaseAgency extends f
{

    private BaseAgency parent;

    public BaseAgency(String s, g g, q q)
    {
        super(s, g);
        parent = null;
        setCollectionMode(q);
    }

    private int freezeChildAgentOrder(int j)
    {
        Iterator iterator = getChildren().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1 instanceof BaseAgency)
            {
                j = ((BaseAgency)a1).freezeChildAgentOrder(j);
            } else
            if (a1 instanceof BaseAgent)
            {
                ((BaseAgent)a1).setGlobalOrder(j);
                j++;
            }
        } while (true);
        return j;
    }

    public void addChild(a a1)
    {
        if (a1 instanceof i)
        {
            addChild((i)a1);
            return;
        } else
        {
            addChild((f)a1);
            return;
        }
    }

    public void addChild(f f1)
    {
        super.addChild(f1);
        if (f1 instanceof BaseAgency)
        {
            ((BaseAgency)f1).setParent(this);
        }
    }

    public void addChild(i j)
    {
        super.addChild(j);
        if (j instanceof BaseAgent)
        {
            ((BaseAgent)j).setParent(this);
        }
    }

    public void freezeChildAgentOrder()
    {
        freezeChildAgentOrder(1);
    }

    public BaseAgent getAgent(String s)
    {
label0:
        {
            if (s == null)
            {
                break label0;
            }
            Iterator iterator = getChildren().iterator();
            a a1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                a1 = (a)iterator.next();
            } while (!s.equals(a1.name));
            if (a1 instanceof BaseAgent)
            {
                return (BaseAgent)a1;
            }
        }
        return null;
    }

    public BaseAgency getParent()
    {
        return parent;
    }

    public void setParent(BaseAgency baseagency)
    {
        parent = baseagency;
    }
}
