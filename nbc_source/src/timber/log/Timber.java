// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package timber.log;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Timber
{
    public static class DebugTree extends Tree
    {

        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");
        private static final int CALL_STACK_INDEX = 5;
        private static final int MAX_LOG_LENGTH = 4000;

        protected String createStackElementTag(StackTraceElement stacktraceelement)
        {
            stacktraceelement = stacktraceelement.getClassName();
            Matcher matcher = ANONYMOUS_CLASS.matcher(stacktraceelement);
            if (matcher.find())
            {
                stacktraceelement = matcher.replaceAll("");
            }
            return stacktraceelement.substring(stacktraceelement.lastIndexOf('.') + 1);
        }

        final String getTag()
        {
            String s = super.getTag();
            if (s != null)
            {
                return s;
            }
            StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
            if (astacktraceelement.length <= 5)
            {
                throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
            } else
            {
                return createStackElementTag(astacktraceelement[5]);
            }
        }

        protected void log(int j, String s, String s1, Throwable throwable)
        {
            if (s1.length() >= 4000) goto _L2; else goto _L1
_L1:
            if (j != 7) goto _L4; else goto _L3
_L3:
            Log.wtf(s, s1);
_L6:
            return;
_L4:
            Log.println(j, s, s1);
            return;
_L2:
            int k = 0;
            int j1 = s1.length();
            while (k < j1) 
            {
                int l = s1.indexOf('\n', k);
                if (l == -1)
                {
                    l = j1;
                }
                do
                {
                    int i1 = Math.min(l, k + 4000);
                    throwable = s1.substring(k, i1);
                    if (j == 7)
                    {
                        Log.wtf(s, throwable);
                    } else
                    {
                        Log.println(j, s, throwable);
                    }
                    k = i1;
                } while (i1 < l);
                k = i1 + 1;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }


        public DebugTree()
        {
        }
    }

    public static abstract class Tree
    {

        private final ThreadLocal explicitTag = new ThreadLocal();

        private transient void prepareLog(int j, Throwable throwable, String s, Object aobj[])
        {
            if (isLoggable(j)) goto _L2; else goto _L1
_L1:
            return;
_L2:
            String s1;
            s1 = s;
            if (s != null)
            {
                s1 = s;
                if (s.length() == 0)
                {
                    s1 = null;
                }
            }
            if (s1 != null) goto _L4; else goto _L3
_L3:
            if (throwable == null) goto _L1; else goto _L5
_L5:
            aobj = Log.getStackTraceString(throwable);
_L7:
            log(j, getTag(), ((String) (aobj)), throwable);
            return;
_L4:
            s = s1;
            if (aobj.length > 0)
            {
                s = String.format(s1, aobj);
            }
            aobj = s;
            if (throwable != null)
            {
                aobj = (new StringBuilder()).append(s).append("\n").append(Log.getStackTraceString(throwable)).toString();
            }
            if (true) goto _L7; else goto _L6
_L6:
        }

        public transient void d(String s, Object aobj[])
        {
            prepareLog(3, null, s, aobj);
        }

        public transient void d(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(3, throwable, s, aobj);
        }

        public transient void e(String s, Object aobj[])
        {
            prepareLog(6, null, s, aobj);
        }

        public transient void e(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(6, throwable, s, aobj);
        }

        String getTag()
        {
            String s = (String)explicitTag.get();
            if (s != null)
            {
                explicitTag.remove();
            }
            return s;
        }

        public transient void i(String s, Object aobj[])
        {
            prepareLog(4, null, s, aobj);
        }

        public transient void i(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(4, throwable, s, aobj);
        }

        protected boolean isLoggable(int j)
        {
            return true;
        }

        protected abstract void log(int j, String s, String s1, Throwable throwable);

        public transient void v(String s, Object aobj[])
        {
            prepareLog(2, null, s, aobj);
        }

        public transient void v(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(2, throwable, s, aobj);
        }

        public transient void w(String s, Object aobj[])
        {
            prepareLog(5, null, s, aobj);
        }

        public transient void w(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(5, throwable, s, aobj);
        }

        public transient void wtf(String s, Object aobj[])
        {
            prepareLog(7, null, s, aobj);
        }

        public transient void wtf(Throwable throwable, String s, Object aobj[])
        {
            prepareLog(7, throwable, s, aobj);
        }


        public Tree()
        {
        }
    }


    private static final List FOREST = new CopyOnWriteArrayList();
    private static final Tree TREE_OF_SOULS = new Tree() {

        public transient void d(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).d(s, aobj);
            }

        }

        public transient void d(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).d(throwable, s, aobj);
            }

        }

        public transient void e(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).e(s, aobj);
            }

        }

        public transient void e(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).e(throwable, s, aobj);
            }

        }

        public transient void i(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).i(s, aobj);
            }

        }

        public transient void i(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).i(throwable, s, aobj);
            }

        }

        protected void log(int j, String s, String s1, Throwable throwable)
        {
            throw new AssertionError("Missing override for log method.");
        }

        public transient void v(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).v(s, aobj);
            }

        }

        public transient void v(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).v(throwable, s, aobj);
            }

        }

        public transient void w(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).w(s, aobj);
            }

        }

        public transient void w(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).w(throwable, s, aobj);
            }

        }

        public transient void wtf(String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).wtf(s, aobj);
            }

        }

        public transient void wtf(Throwable throwable, String s, Object aobj[])
        {
            List list = Timber.FOREST;
            int j = 0;
            for (int k = list.size(); j < k; j++)
            {
                ((Tree)list.get(j)).wtf(throwable, s, aobj);
            }

        }

    };

    private Timber()
    {
        throw new AssertionError("No instances.");
    }

    public static Tree asTree()
    {
        return TREE_OF_SOULS;
    }

    public static transient void d(String s, Object aobj[])
    {
        TREE_OF_SOULS.d(s, aobj);
    }

    public static transient void d(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.d(throwable, s, aobj);
    }

    public static transient void e(String s, Object aobj[])
    {
        TREE_OF_SOULS.e(s, aobj);
    }

    public static transient void e(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.e(throwable, s, aobj);
    }

    public static transient void i(String s, Object aobj[])
    {
        TREE_OF_SOULS.i(s, aobj);
    }

    public static transient void i(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.i(throwable, s, aobj);
    }

    public static void plant(Tree tree)
    {
        if (tree == null)
        {
            throw new NullPointerException("tree == null");
        }
        if (tree == TREE_OF_SOULS)
        {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        } else
        {
            FOREST.add(tree);
            return;
        }
    }

    public static Tree tag(String s)
    {
        List list = FOREST;
        int j = 0;
        for (int k = list.size(); j < k; j++)
        {
            ((Tree)list.get(j)).explicitTag.set(s);
        }

        return TREE_OF_SOULS;
    }

    public static void uproot(Tree tree)
    {
        if (!FOREST.remove(tree))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot uproot tree which is not planted: ").append(tree).toString());
        } else
        {
            return;
        }
    }

    public static void uprootAll()
    {
        FOREST.clear();
    }

    public static transient void v(String s, Object aobj[])
    {
        TREE_OF_SOULS.v(s, aobj);
    }

    public static transient void v(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.v(throwable, s, aobj);
    }

    public static transient void w(String s, Object aobj[])
    {
        TREE_OF_SOULS.w(s, aobj);
    }

    public static transient void w(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.w(throwable, s, aobj);
    }

    public static transient void wtf(String s, Object aobj[])
    {
        TREE_OF_SOULS.wtf(s, aobj);
    }

    public static transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        TREE_OF_SOULS.wtf(throwable, s, aobj);
    }


}
