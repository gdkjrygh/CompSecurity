// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine
{
    private static class JavaCommandLine extends CommandLine
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


        JavaCommandLine(String as[])
        {
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

    private static class NativeCommandLine extends CommandLine
    {

        public void appendSwitch(String s)
        {
            CommandLine.nativeAppendSwitch(s);
        }

        public void appendSwitchWithValue(String s, String s1)
        {
            CommandLine.nativeAppendSwitchWithValue(s, s1);
        }

        public void appendSwitchesAndArguments(String as[])
        {
            CommandLine.nativeAppendSwitchesAndArguments(as);
        }

        public String getSwitchValue(String s)
        {
            return CommandLine.nativeGetSwitchValue(s);
        }

        public boolean hasSwitch(String s)
        {
            return CommandLine.nativeHasSwitch(s);
        }

        public boolean isNativeImplementation()
        {
            return true;
        }

        private NativeCommandLine()
        {
        }

    }


    static final boolean $assertionsDisabled;
    private static final String SWITCH_PREFIX = "--";
    private static final String SWITCH_TERMINATOR = "--";
    private static final String SWITCH_VALUE_SEPARATOR = "=";
    private static final String TAG = "CommandLine";
    private static final AtomicReference sCommandLine = new AtomicReference();

    private CommandLine()
    {
    }


    public static void enableNativeProxy()
    {
        sCommandLine.set(new NativeCommandLine());
    }

    public static CommandLine getInstance()
    {
        CommandLine commandline = (CommandLine)sCommandLine.get();
        if (!$assertionsDisabled && commandline == null)
        {
            throw new AssertionError();
        } else
        {
            return commandline;
        }
    }

    public static String[] getJavaSwitchesOrNull()
    {
        CommandLine commandline = (CommandLine)sCommandLine.get();
        if (commandline != null)
        {
            if (!$assertionsDisabled && commandline.isNativeImplementation())
            {
                throw new AssertionError();
            } else
            {
                return ((JavaCommandLine)commandline).getCommandLineArguments();
            }
        } else
        {
            return null;
        }
    }

    public static void init(String as[])
    {
        setInstance(new JavaCommandLine(as));
    }

    public static void initFromFile(String s)
    {
        s = readUtf8FileFully(s, 8192);
        if (s == null)
        {
            s = null;
        } else
        {
            s = tokenizeQuotedAruments(s);
        }
        init(s);
    }

    public static boolean isInitialized()
    {
        return sCommandLine.get() != null;
    }

    private static native void nativeAppendSwitch(String s);

    private static native void nativeAppendSwitchWithValue(String s, String s1);

    private static native void nativeAppendSwitchesAndArguments(String as[]);

    private static native String nativeGetSwitchValue(String s);

    private static native boolean nativeHasSwitch(String s);

    private static native void nativeReset();

    private static char[] readUtf8FileFully(String s, int i)
    {
        Object obj;
        Exception exception;
        Object obj1;
        File file;
        obj1 = null;
        obj = null;
        exception = null;
        file = new File(s);
        long l = file.length();
        if (l == 0L)
        {
            return null;
        }
        if (l > (long)i)
        {
            Log.w("CommandLine", (new StringBuilder()).append("File ").append(s).append(" length ").append(l).append(" exceeds limit ").append(i).toString());
            return null;
        }
        i = (int)l;
        char ac[];
        ac = new char[i];
        s = new InputStreamReader(new FileInputStream(file), "UTF-8");
        i = s.read(ac);
        if (!$assertionsDisabled && s.ready())
        {
            throw new AssertionError();
        }
          goto _L1
        obj;
_L7:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("CommandLine", "Unable to close file reader.", s);
            }
        }
        return null;
_L1:
        obj = ac;
        if (i < ac.length)
        {
            obj = Arrays.copyOfRange(ac, 0, i);
        }
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("CommandLine", "Unable to close file reader.", s);
            }
        }
        return ((char []) (obj));
        s;
        s = obj1;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("CommandLine", "Unable to close file reader.", s);
            }
        }
        return null;
        s;
_L3:
        if (obj != null)
        {
            try
            {
                ((Reader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("CommandLine", "Unable to close file reader.", ((Throwable) (obj)));
            }
        }
        throw s;
        exception;
        obj = s;
        s = exception;
        if (true) goto _L3; else goto _L2
_L2:
        IOException ioexception;
        ioexception;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        s = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void reset()
    {
        setInstance(null);
    }

    private static void setInstance(CommandLine commandline)
    {
        commandline = (CommandLine)sCommandLine.getAndSet(commandline);
        if (commandline != null && commandline.isNativeImplementation())
        {
            nativeReset();
        }
    }

    public static String[] tokenizeQuotedAruments(char ac[])
    {
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = null;
        int i = 0;
        int l = ac.length;
        int j = 0;
        while (j < l) 
        {
            char c = ac[j];
            StringBuilder stringbuilder1;
            int k;
            if (i == 0 && (c == '\'' || c == '"') || c == i)
            {
                if (stringbuilder != null && stringbuilder.length() > 0 && stringbuilder.charAt(stringbuilder.length() - 1) == '\\')
                {
                    stringbuilder.setCharAt(stringbuilder.length() - 1, c);
                    k = i;
                    stringbuilder1 = stringbuilder;
                } else
                {
                    if (i == 0)
                    {
                        i = c;
                    } else
                    {
                        i = 0;
                    }
                    stringbuilder1 = stringbuilder;
                    k = i;
                }
            } else
            if (i == 0 && Character.isWhitespace(c))
            {
                stringbuilder1 = stringbuilder;
                k = i;
                if (stringbuilder != null)
                {
                    arraylist.add(stringbuilder.toString());
                    stringbuilder1 = null;
                    k = i;
                }
            } else
            {
                stringbuilder1 = stringbuilder;
                if (stringbuilder == null)
                {
                    stringbuilder1 = new StringBuilder();
                }
                stringbuilder1.append(c);
                k = i;
            }
            j++;
            stringbuilder = stringbuilder1;
            i = k;
        }
        if (stringbuilder != null)
        {
            if (i != 0)
            {
                Log.w("CommandLine", (new StringBuilder()).append("Unterminated quoted string: ").append(stringbuilder).toString());
            }
            arraylist.add(stringbuilder.toString());
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public abstract void appendSwitch(String s);

    public abstract void appendSwitchWithValue(String s, String s1);

    public abstract void appendSwitchesAndArguments(String as[]);

    public abstract String getSwitchValue(String s);

    public String getSwitchValue(String s, String s1)
    {
        s = getSwitchValue(s);
        if (TextUtils.isEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public abstract boolean hasSwitch(String s);

    public boolean isNativeImplementation()
    {
        return false;
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





}
