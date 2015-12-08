// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.action.Action;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            RuleStore, Pattern

public class SimpleRuleStore extends ContextAwareBase
    implements RuleStore
{

    static String ANY = "*";
    HashMap rules;

    public SimpleRuleStore(Context context)
    {
        rules = new HashMap();
        setContext(context);
    }

    public void addRule(Pattern pattern, Action action)
    {
        action.setContext(context);
        List list = (List)rules.get(pattern);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            rules.put(pattern, obj);
        }
        ((List) (obj)).add(action);
    }

    public void addRule(Pattern pattern, String s)
    {
        Action action = (Action)OptionHelper.instantiateByClassName(s, fs/ch/qos/logback/core/joran/action/Action, context);
        s = action;
_L2:
        if (s != null)
        {
            addRule(pattern, ((Action) (s)));
        }
        return;
        Exception exception;
        exception;
        addError((new StringBuilder()).append("Could not instantiate class [").append(s).append("]").toString(), exception);
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List matchActions(Pattern pattern)
    {
        Object obj = (List)rules.get(pattern);
        if (obj == null)
        {
            List list = tailMatch(pattern);
            obj = list;
            if (list == null)
            {
                List list1 = prefixMatch(pattern);
                obj = list1;
                if (list1 == null)
                {
                    pattern = middleMatch(pattern);
                    obj = pattern;
                    if (pattern == null)
                    {
                        return null;
                    }
                }
            }
        }
        return ((List) (obj));
    }

    List middleMatch(Pattern pattern)
    {
        Iterator iterator = rules.keySet().iterator();
        Pattern pattern1 = null;
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Pattern pattern2 = (Pattern)iterator.next();
            String s = pattern2.peekLast();
            Object obj;
            if (pattern2.size() > 1)
            {
                obj = pattern2.get(0);
            } else
            {
                obj = null;
            }
            if (ANY.equals(s) && ANY.equals(obj))
            {
                obj = pattern2.getCopyOfPartList();
                if (((List) (obj)).size() > 2)
                {
                    ((List) (obj)).remove(0);
                    ((List) (obj)).remove(((List) (obj)).size() - 1);
                }
                obj = new Pattern(((List) (obj)));
                int j;
                if (pattern.isContained(((Pattern) (obj))))
                {
                    j = ((Pattern) (obj)).size();
                } else
                {
                    j = 0;
                }
                if (j > i)
                {
                    i = j;
                    pattern1 = pattern2;
                }
            }
        } while (true);
        if (pattern1 != null)
        {
            return (List)rules.get(pattern1);
        } else
        {
            return null;
        }
    }

    List prefixMatch(Pattern pattern)
    {
        int i = 0;
        Iterator iterator = rules.keySet().iterator();
        Pattern pattern1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Pattern pattern2 = (Pattern)iterator.next();
            String s = pattern2.peekLast();
            if (ANY.equals(s))
            {
                int j = pattern.getPrefixMatchLength(pattern2);
                if (j == pattern2.size() - 1 && j > i)
                {
                    i = j;
                    pattern1 = pattern2;
                }
            }
        } while (true);
        if (pattern1 != null)
        {
            return (List)rules.get(pattern1);
        } else
        {
            return null;
        }
    }

    List tailMatch(Pattern pattern)
    {
        Iterator iterator = rules.keySet().iterator();
        Pattern pattern1 = null;
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Pattern pattern2 = (Pattern)iterator.next();
            if (pattern2.size() > 1 && pattern2.get(0).equals(ANY))
            {
                int j = pattern.getTailMatchLength(pattern2);
                if (j > i)
                {
                    i = j;
                    pattern1 = pattern2;
                }
            }
        } while (true);
        if (pattern1 != null)
        {
            return (List)rules.get(pattern1);
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SimpleRuleStore ( ").append("rules = ").append(rules).append("  ").append(" )");
        return stringbuilder.toString();
    }

}
