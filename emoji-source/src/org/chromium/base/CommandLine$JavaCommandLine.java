// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package org.chromium.base:
//            CommandLine

private static class mArgs extends CommandLine
{

    static final boolean $assertionsDisabled;
    private ArrayList mArgs;
    private int mArgsBegin;
    private HashMap mSwitches;

    private void appendSwitchesInternal(String as[], int i)
    {
        boolean flag = true;
        int l = as.length;
        int j = 0;
        int k = i;
        i = ((flag) ? 1 : 0);
        while (j < l) 
        {
            String s = as[j];
            if (k > 0)
            {
                k--;
            } else
            {
                if (s.equals("--"))
                {
                    i = 0;
                }
                if (i != 0 && s.startsWith("--"))
                {
                    String as1[] = s.split("=", 2);
                    if (as1.length > 1)
                    {
                        s = as1[1];
                    } else
                    {
                        s = null;
                    }
                    appendSwitchWithValue(as1[0].substring("--".length()), s);
                } else
                {
                    mArgs.add(s);
                }
            }
            j++;
        }
    }

    private String[] getCommandLineArguments()
    {
        return (String[])mArgs.toArray(new String[mArgs.size()]);
    }

    public void appendSwitch(String s)
    {
        appendSwitchWithValue(s, null);
    }

    public void appendSwitchWithValue(String s, String s1)
    {
        HashMap hashmap = mSwitches;
        String s2;
        int i;
        if (s1 == null)
        {
            s2 = "";
        } else
        {
            s2 = s1;
        }
        hashmap.put(s, s2);
        s2 = (new StringBuilder()).append("--").append(s).toString();
        s = s2;
        if (s1 != null)
        {
            s = s2;
            if (!s1.isEmpty())
            {
                s = (new StringBuilder()).append(s2).append("=").append(s1).toString();
            }
        }
        s1 = mArgs;
        i = mArgsBegin;
        mArgsBegin = i + 1;
        s1.add(i, s);
    }

    public void appendSwitchesAndArguments(String as[])
    {
        appendSwitchesInternal(as, 0);
    }

    public String getSwitchValue(String s)
    {
label0:
        {
            String s1 = (String)mSwitches.get(s);
            if (s1 != null)
            {
                s = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            s = null;
        }
        return s;
    }

    public boolean hasSwitch(String s)
    {
        return mSwitches.containsKey(s);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/CommandLine.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


    (String as[])
    {
        super(null);
        mSwitches = new HashMap();
        mArgs = new ArrayList();
        mArgsBegin = 1;
        if (as == null || as.length == 0 || as[0] == null)
        {
            mArgs.add("");
        } else
        {
            mArgs.add(as[0]);
            appendSwitchesInternal(as, 1);
        }
        if (!$assertionsDisabled && mArgs.size() <= 0)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }
}
