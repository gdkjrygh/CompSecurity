// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.subtasks.GalileoSubTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class GalileoCompoundTask extends f
    implements com.fitbit.galileo.tasks.subtasks.GalileoSubTask.a
{
    protected static final class SubTaskGroup extends Enum
    {

        public static final SubTaskGroup a;
        public static final SubTaskGroup b;
        public static final SubTaskGroup c;
        private static final SubTaskGroup d[];

        public static SubTaskGroup valueOf(String s)
        {
            return (SubTaskGroup)Enum.valueOf(com/fitbit/galileo/tasks/GalileoCompoundTask$SubTaskGroup, s);
        }

        public static SubTaskGroup[] values()
        {
            return (SubTaskGroup[])d.clone();
        }

        public SubTaskGroup a()
        {
            if (ordinal() + 1 < values().length)
            {
                return values()[ordinal() + 1];
            } else
            {
                return null;
            }
        }

        static 
        {
            a = new SubTaskGroup("GROUP_PRE_EXECUTE", 0);
            b = new SubTaskGroup("GROUP_MAIN", 1);
            c = new SubTaskGroup("GROUP_POST_EXECUTE", 2);
            d = (new SubTaskGroup[] {
                a, b, c
            });
        }

        private SubTaskGroup(String s, int i)
        {
            super(s, i);
        }
    }

    protected static final class SubTaskQueueAction extends Enum
    {

        public static final SubTaskQueueAction a;
        public static final SubTaskQueueAction b;
        public static final SubTaskQueueAction c;
        private static final SubTaskQueueAction d[];

        public static SubTaskQueueAction valueOf(String s)
        {
            return (SubTaskQueueAction)Enum.valueOf(com/fitbit/galileo/tasks/GalileoCompoundTask$SubTaskQueueAction, s);
        }

        public static SubTaskQueueAction[] values()
        {
            return (SubTaskQueueAction[])d.clone();
        }

        static 
        {
            a = new SubTaskQueueAction("QUEUE_PROCESS_NEXT", 0);
            b = new SubTaskQueueAction("QUEUE_GO_TO_POST_EXECUTE", 1);
            c = new SubTaskQueueAction("QUEUE_STOP", 2);
            d = (new SubTaskQueueAction[] {
                a, b, c
            });
        }

        private SubTaskQueueAction(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String a = "GalileoCompoundTask";
    private Map b;
    private SubTaskGroup c;
    private int d;

    protected GalileoCompoundTask()
    {
        b = new HashMap();
        c = com.fitbit.galileo.tasks.SubTaskGroup.a;
        d = -1;
    }

    private void a(SubTaskQueueAction subtaskqueueaction)
    {
        com.fitbit.e.a.a("GalileoCompoundTask", "%s - Processing action %s", new Object[] {
            this, subtaskqueueaction
        });
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SubTaskQueueAction.values().length];
                try
                {
                    a[com.fitbit.galileo.tasks.SubTaskQueueAction.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SubTaskQueueAction.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SubTaskQueueAction.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.galileo.tasks._cls1.a[subtaskqueueaction.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled action: ").append(subtaskqueueaction).toString());

        case 1: // '\001'
            t();
            return;

        case 2: // '\002'
            if (c != SubTaskGroup.c)
            {
                c = SubTaskGroup.c;
                d = -1;
            }
            t();
            return;

        case 3: // '\003'
            x();
            return;
        }
    }

    private List b(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list1 = Collections.emptyList();
        }
        return list1;
    }

    private void t()
    {
        if (l()) goto _L2; else goto _L1
_L1:
        GalileoSubTask galileosubtask = v();
        List list;
        if (d < 0)
        {
            d = 0;
        } else
        {
            d = d + 1;
        }
        list = (List)b.get(c);
        if (list != null && d < list.size()) goto _L4; else goto _L3
_L3:
        if (c.a() == null)
        {
            x();
        } else
        {
            c = c.a();
            d = -1;
            t();
        }
_L6:
        if (galileosubtask != null)
        {
            galileosubtask.n();
        }
_L2:
        return;
_L4:
        GalileoSubTask galileosubtask1 = v();
        com.fitbit.e.a.a("GalileoCompoundTask", "%s - Processing subtask %s (group=%s, index=%s)", new Object[] {
            this, galileosubtask1.e(), c, Integer.valueOf(d)
        });
        if (!galileosubtask1.a(this))
        {
            b(galileosubtask1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void x()
    {
        if (u())
        {
            o();
            return;
        } else
        {
            r();
            return;
        }
    }

    protected SubTaskQueueAction a(SubTaskGroup subtaskgroup, int i)
    {
        if (subtaskgroup == SubTaskGroup.c)
        {
            return com.fitbit.galileo.tasks.SubTaskQueueAction.a;
        } else
        {
            return SubTaskQueueAction.b;
        }
    }

    protected abstract List a();

    public void a(GalileoSubTask galileosubtask)
    {
label0:
        {
            if (galileosubtask == v())
            {
                if (l())
                {
                    break label0;
                }
                t();
            }
            return;
        }
        q();
    }

    protected void a(List list)
    {
        List list1 = (List)b.get(c);
        if (list1 != null && list != null && !list.isEmpty())
        {
            for (int i = list.size() - 1; i >= 0; i--)
            {
                list1.add(d + 1, list.get(i));
            }

        }
    }

    protected GalileoSubTask b(SubTaskGroup subtaskgroup, int i)
    {
        subtaskgroup = (List)b.get(subtaskgroup);
        if (subtaskgroup != null && i >= 0 && i < subtaskgroup.size())
        {
            return (GalileoSubTask)subtaskgroup.get(i);
        } else
        {
            return null;
        }
    }

    public void b(GalileoSubTask galileosubtask)
    {
label0:
        {
            com.fitbit.e.a.e("GalileoCompoundTask", "onSubtaskFailed %s", new Object[] {
                galileosubtask.e()
            });
            if (galileosubtask == v())
            {
                if (l())
                {
                    break label0;
                }
                a(a(c, d));
            }
            return;
        }
        q();
    }

    public void c(GalileoSubTask galileosubtask)
    {
        if (l() && galileosubtask == v())
        {
            q();
        }
    }

    protected final void d()
    {
        b.put(com.fitbit.galileo.tasks.SubTaskGroup.a, b(f()));
        b.put(SubTaskGroup.b, b(a()));
        b.put(SubTaskGroup.c, b(g()));
        t();
    }

    protected final void e()
    {
        GalileoSubTask galileosubtask = v();
        if (galileosubtask != null)
        {
            galileosubtask.n();
            return;
        } else
        {
            q();
            return;
        }
    }

    protected abstract List f();

    protected abstract List g();

    protected boolean u()
    {
label0:
        {
            Object obj = (List)b.get(com.fitbit.galileo.tasks.SubTaskGroup.a);
            Object obj1 = (List)b.get(SubTaskGroup.b);
            ArrayList arraylist = new ArrayList();
            if (obj != null)
            {
                arraylist.addAll(((java.util.Collection) (obj)));
            }
            if (obj1 != null)
            {
                arraylist.addAll(((java.util.Collection) (obj1)));
            }
            if (arraylist == null || arraylist.size() <= 0)
            {
                break label0;
            }
            obj = arraylist.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                obj1 = (GalileoSubTask)((Iterator) (obj)).next();
            } while (((GalileoSubTask) (obj1)).i() && ((GalileoSubTask) (obj1)).j());
            a(((GalileoSubTask) (obj1)).q());
            return false;
        }
        return true;
    }

    protected GalileoSubTask v()
    {
        return b(c, d);
    }

    protected void w()
    {
        List list = (List)b.get(c);
        if (list != null)
        {
            for (; list.size() > d + 1; list.remove(list.size() - 1)) { }
        }
    }
}
