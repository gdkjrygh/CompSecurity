// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import com.android.internal.util.Predicate;
import com.urbanairship.ApplicationMetrics;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.actions.tags.AddTagsAction;
import com.urbanairship.actions.tags.RemoveTagsAction;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.urbanairship.actions:
//            ShareAction, OpenExternalUrlAction, DeepLinkAction, LandingPageAction, 
//            AddCustomEventAction, Action, Situation, ActionArguments

public final class ActionRegistry
{
    public static final class Entry
    {

        private Action defaultAction;
        private List names;
        private Predicate predicate;
        private Map situationOverrides;

        private void addName(String s)
        {
            synchronized (names)
            {
                names.add(s);
            }
            return;
            s;
            list;
            JVM INSTR monitorexit ;
            throw s;
        }

        private void removeName(String s)
        {
            synchronized (names)
            {
                names.remove(s);
            }
            return;
            s;
            list;
            JVM INSTR monitorexit ;
            throw s;
        }

        public void addSituationOverride(Action action, Situation situation)
        {
            if (situation == null || action == null)
            {
                return;
            } else
            {
                situationOverrides.put(situation, action);
                return;
            }
        }

        public Action getActionForSituation(Situation situation)
        {
            if (situation == null)
            {
                situation = defaultAction;
            } else
            {
                Action action = (Action)situationOverrides.get(situation);
                situation = action;
                if (action == null)
                {
                    return defaultAction;
                }
            }
            return situation;
        }

        public Action getDefaultAction()
        {
            return defaultAction;
        }

        public List getNames()
        {
            ArrayList arraylist;
            synchronized (names)
            {
                arraylist = new ArrayList(names);
            }
            return arraylist;
            exception;
            list;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Predicate getPredicate()
        {
            return predicate;
        }

        public void setDefaultAction(Action action)
        {
            if (action == null)
            {
                return;
            } else
            {
                defaultAction = action;
                return;
            }
        }

        public void setPredicate(Predicate predicate1)
        {
            predicate = predicate1;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Action Entry: ").append(names).toString();
        }


        private Entry(Action action, String as[])
        {
            situationOverrides = new ConcurrentHashMap();
            defaultAction = action;
            names = new ArrayList(Arrays.asList(as));
        }

    }


    private static final long LANDING_PAGE_CACHE_OPEN_TIME_LIMIT_MS = 0x240c8400L;
    private static ActionRegistry instance = new ActionRegistry();
    private Map actionMap;

    public ActionRegistry()
    {
        actionMap = new HashMap();
    }

    public static ActionRegistry shared()
    {
        return instance;
    }

    public Set getEntries()
    {
        HashSet hashset;
        synchronized (actionMap)
        {
            hashset = new HashSet(actionMap.values());
        }
        return hashset;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Entry getEntry(String s)
    {
        if (UAStringUtil.isEmpty(s))
        {
            return null;
        }
        synchronized (actionMap)
        {
            s = (Entry)actionMap.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public transient Entry registerAction(Action action, String as[])
    {
        if (action == null)
        {
            Logger.error("Unable to register null action");
            return null;
        }
        if (as == null || as.length == 0)
        {
            Logger.error("A name is required to register an action");
            return null;
        }
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            if (UAStringUtil.isEmpty(as[i]))
            {
                Logger.error("Unable to register action because one or more of the names was null or empty.");
                return null;
            }
        }

        Map map = actionMap;
        map;
        JVM INSTR monitorenter ;
        int l;
        action = new Entry(action, as);
        l = as.length;
        int j = 0;
_L2:
        String s;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s = as[j];
        if (UAStringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        Entry entry = (Entry)actionMap.remove(s);
        if (entry == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        entry.removeName(s);
        actionMap.put(s, action);
        break MISSING_BLOCK_LABEL_169;
        action;
        map;
        JVM INSTR monitorexit ;
        throw action;
        map;
        JVM INSTR monitorexit ;
        return action;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void registerDefaultActions()
    {
        registerAction(new ShareAction(), new String[] {
            "share_action", "^s"
        });
        registerAction(new OpenExternalUrlAction(), new String[] {
            "open_external_url_action", "^u"
        });
        registerAction(new DeepLinkAction(), new String[] {
            "deep_link_action", "^d"
        });
        registerAction(new LandingPageAction(), new String[] {
            "landing_page_action", "^p"
        }).setPredicate(new Predicate() {

            final ActionRegistry this$0;

            public boolean apply(ActionArguments actionarguments)
            {
label0:
                {
                    if (Situation.PUSH_RECEIVED.equals(actionarguments.getSituation()))
                    {
                        long l = UAirship.shared().getApplicationMetrics().getLastOpenTimeMillis();
                        if (System.currentTimeMillis() - l > 0x240c8400L)
                        {
                            break label0;
                        }
                    }
                    return true;
                }
                return false;
            }

            public volatile boolean apply(Object obj)
            {
                return apply((ActionArguments)obj);
            }

            
            {
                this$0 = ActionRegistry.this;
                super();
            }
        });
        Predicate predicate = new Predicate() {

            final ActionRegistry this$0;

            public boolean apply(ActionArguments actionarguments)
            {
                return !Situation.PUSH_RECEIVED.equals(actionarguments.getSituation());
            }

            public volatile boolean apply(Object obj)
            {
                return apply((ActionArguments)obj);
            }

            
            {
                this$0 = ActionRegistry.this;
                super();
            }
        };
        registerAction(new AddTagsAction(), new String[] {
            "add_tags_action", "^+t"
        }).setPredicate(predicate);
        registerAction(new RemoveTagsAction(), new String[] {
            "remove_tags_action", "^-t"
        }).setPredicate(predicate);
        registerAction(new AddCustomEventAction(), new String[] {
            "add_custom_event_action"
        }).setPredicate(new Predicate() {

            final ActionRegistry this$0;

            public boolean apply(ActionArguments actionarguments)
            {
                return Situation.MANUAL_INVOCATION == actionarguments.getSituation() || Situation.WEB_VIEW_INVOCATION == actionarguments.getSituation();
            }

            public volatile boolean apply(Object obj)
            {
                return apply((ActionArguments)obj);
            }

            
            {
                this$0 = ActionRegistry.this;
                super();
            }
        });
    }

    public void unregisterAction(String s)
    {
        if (UAStringUtil.isEmpty(s))
        {
            return;
        }
        Map map = actionMap;
        map;
        JVM INSTR monitorenter ;
        s = getEntry(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        String s1;
        for (s = s.getNames().iterator(); s.hasNext(); actionMap.remove(s1))
        {
            s1 = (String)s.next();
        }

        map;
        JVM INSTR monitorexit ;
    }

}
