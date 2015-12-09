// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            ByteString, CodedOutputStream, LogFileManager

class SessionDataWriter
{

    private static final String SIGNAL_DEFAULT = "0";
    private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8("0");
    private final Context context;
    private StackTraceElement exceptionStack[];
    private final int maxChainedExceptionsDepth = 8;
    private final ByteString optionalBuildIdBytes;
    private final ByteString packageNameBytes;
    private android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
    private List stacks;
    private Thread threads[];

    public SessionDataWriter(Context context1, String s, String s1)
    {
        context = context1;
        packageNameBytes = ByteString.copyFromUtf8(s1);
        if (s == null)
        {
            context1 = null;
        } else
        {
            context1 = ByteString.copyFromUtf8(s.replace("-", ""));
        }
        optionalBuildIdBytes = context1;
    }

    private int getBinaryImageSize()
    {
        int j = 0 + CodedOutputStream.computeUInt64Size(1, 0L) + CodedOutputStream.computeUInt64Size(2, 0L) + CodedOutputStream.computeBytesSize(3, packageNameBytes);
        int i = j;
        if (optionalBuildIdBytes != null)
        {
            i = j + CodedOutputStream.computeBytesSize(4, optionalBuildIdBytes);
        }
        return i;
    }

    private int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.n.a a, String s)
    {
        return CodedOutputStream.computeEnumSize(1, a.h) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
    }

    private int getEventAppCustomAttributeSize(String s, String s1)
    {
        int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
    }

    private int getEventAppExecutionExceptionSize(Throwable throwable, int i)
    {
        int j;
        int k;
label0:
        {
            boolean flag = false;
            k = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            j = k;
            if (obj != null)
            {
                j = k + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int i1 = astacktraceelement.length;
            for (k = 0; k < i1;)
            {
                int j1 = getFrameSize(astacktraceelement[k], true);
                int k1 = CodedOutputStream.computeTagSize(4);
                int l1 = CodedOutputStream.computeRawVarint32Size(j1);
                k++;
                j = j1 + (k1 + l1) + j;
            }

            astacktraceelement = throwable.getCause();
            k = j;
            if (astacktraceelement != null)
            {
                k = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i >= maxChainedExceptionsDepth)
                {
                    break label0;
                }
                i = getEventAppExecutionExceptionSize(((Throwable) (astacktraceelement)), i + 1);
                k = j + (i + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i)));
            }
            return k;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k++;
        }
        return j + CodedOutputStream.computeUInt32Size(7, k);
    }

    private int getEventAppExecutionSignalSize()
    {
        return 0 + CodedOutputStream.computeBytesSize(1, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeBytesSize(2, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeUInt64Size(3, 0L);
    }

    private int getEventAppExecutionSize(Thread thread, Throwable throwable)
    {
        int i = getThreadSize(thread, exceptionStack, 4, true);
        int i1 = CodedOutputStream.computeTagSize(1);
        int j1 = CodedOutputStream.computeRawVarint32Size(i);
        int k = threads.length;
        int j = 0;
        i = i + (i1 + j1) + 0;
        for (; j < k; j++)
        {
            i1 = getThreadSize(threads[j], (StackTraceElement[])stacks.get(j), 0, false);
            i += i1 + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i1));
        }

        j = getEventAppExecutionExceptionSize(throwable, 1);
        k = CodedOutputStream.computeTagSize(2);
        i1 = CodedOutputStream.computeRawVarint32Size(j);
        j1 = getEventAppExecutionSignalSize();
        int k1 = CodedOutputStream.computeTagSize(3);
        int l1 = CodedOutputStream.computeRawVarint32Size(j1);
        int i2 = getBinaryImageSize();
        return j + (k + i1) + i + (j1 + (k1 + l1)) + (i2 + (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(i2)));
    }

    private int getEventAppSize(Thread thread, Throwable throwable, int i, Map map)
    {
        int j = getEventAppExecutionSize(thread, throwable);
        j = j + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(j)) + 0;
        int k;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            do
            {
                k = j;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                k = getEventAppCustomAttributeSize((String)throwable.getKey(), (String)throwable.getValue());
                j = k + (CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(k)) + j;
            } while (true);
        } else
        {
            k = j;
        }
        j = k;
        if (runningAppProcessInfo != null)
        {
            boolean flag;
            if (runningAppProcessInfo.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = k + CodedOutputStream.computeBoolSize(3, flag);
        }
        return CodedOutputStream.computeUInt32Size(4, i) + j;
    }

    private int getEventDeviceSize(float f, int i, boolean flag, int j, long l1, long l2)
    {
        return 0 + CodedOutputStream.computeFloatSize(1, f) + CodedOutputStream.computeSInt32Size(2, i) + CodedOutputStream.computeBoolSize(3, flag) + CodedOutputStream.computeUInt32Size(4, j) + CodedOutputStream.computeUInt64Size(5, l1) + CodedOutputStream.computeUInt64Size(6, l2);
    }

    private int getEventLogSize(ByteString bytestring)
    {
        return CodedOutputStream.computeBytesSize(1, bytestring);
    }

    private int getFrameSize(StackTraceElement stacktraceelement, boolean flag)
    {
        int i;
        int j;
        if (stacktraceelement.isNativeMethod())
        {
            i = CodedOutputStream.computeUInt64Size(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            i = CodedOutputStream.computeUInt64Size(1, 0L) + 0;
        }
        j = i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i = j;
        if (stacktraceelement.getFileName() != null)
        {
            i = j + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            i += CodedOutputStream.computeUInt64Size(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        return CodedOutputStream.computeUInt32Size(5, j) + i;
    }

    private int getSessionAppOrgSize()
    {
        return 0 + CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8((new g()).a(context)));
    }

    private int getSessionAppSize(ByteString bytestring, ByteString bytestring1, ByteString bytestring2, ByteString bytestring3, int i)
    {
        int j = CodedOutputStream.computeBytesSize(1, bytestring);
        int k = CodedOutputStream.computeBytesSize(2, bytestring1);
        int i1 = CodedOutputStream.computeBytesSize(3, bytestring2);
        int j1 = getSessionAppOrgSize();
        return 0 + j + k + i1 + (j1 + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(j1))) + CodedOutputStream.computeBytesSize(6, bytestring3) + CodedOutputStream.computeEnumSize(10, i);
    }

    private int getSessionDeviceSize(int i, ByteString bytestring, ByteString bytestring1, int j, long l1, long l2, boolean flag, Map map, int k, ByteString bytestring2, ByteString bytestring3)
    {
        int i1 = CodedOutputStream.computeBytesSize(1, bytestring);
        int j1 = CodedOutputStream.computeEnumSize(3, i);
        if (bytestring1 == null)
        {
            i = 0;
        } else
        {
            i = CodedOutputStream.computeBytesSize(4, bytestring1);
        }
        i = i + (j1 + (0 + i1)) + CodedOutputStream.computeUInt32Size(5, j) + CodedOutputStream.computeUInt64Size(6, l1) + CodedOutputStream.computeUInt64Size(7, l2) + CodedOutputStream.computeBoolSize(10, flag);
        if (map != null)
        {
            bytestring = map.entrySet().iterator();
            do
            {
                j = i;
                if (!bytestring.hasNext())
                {
                    break;
                }
                bytestring1 = (java.util.Map.Entry)bytestring.next();
                j = getDeviceIdentifierSize((io.fabric.sdk.android.services.common.n.a)bytestring1.getKey(), (String)bytestring1.getValue());
                i = j + (CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(j)) + i;
            } while (true);
        } else
        {
            j = i;
        }
        i1 = CodedOutputStream.computeUInt32Size(12, k);
        if (bytestring2 == null)
        {
            i = 0;
        } else
        {
            i = CodedOutputStream.computeBytesSize(13, bytestring2);
        }
        if (bytestring3 == null)
        {
            k = 0;
        } else
        {
            k = CodedOutputStream.computeBytesSize(14, bytestring3);
        }
        return k + (j + i1 + i);
    }

    private int getSessionEventSize(Thread thread, Throwable throwable, String s, long l1, Map map, float f, 
            int i, boolean flag, int j, long l2, long l3, 
            ByteString bytestring)
    {
        int k = CodedOutputStream.computeUInt64Size(1, l1);
        int i1 = CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
        int j1 = getEventAppSize(thread, throwable, j, map);
        int k1 = CodedOutputStream.computeTagSize(3);
        int i2 = CodedOutputStream.computeRawVarint32Size(j1);
        i = getEventDeviceSize(f, i, flag, j, l2, l3);
        j = 0 + k + i1 + (j1 + (k1 + i2)) + (i + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(i)));
        i = j;
        if (bytestring != null)
        {
            i = getEventLogSize(bytestring);
            i = j + (i + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i)));
        }
        return i;
    }

    private int getSessionOSSize(ByteString bytestring, ByteString bytestring1, boolean flag)
    {
        return 0 + CodedOutputStream.computeEnumSize(1, 3) + CodedOutputStream.computeBytesSize(2, bytestring) + CodedOutputStream.computeBytesSize(3, bytestring1) + CodedOutputStream.computeBoolSize(4, flag);
    }

    private int getThreadSize(Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
    {
        int j = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName()));
        j = CodedOutputStream.computeUInt32Size(2, i) + j;
        int k = astacktraceelement.length;
        for (i = 0; i < k; i++)
        {
            int i1 = getFrameSize(astacktraceelement[i], flag);
            j += i1 + (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(i1));
        }

        return j;
    }

    private ByteString stringToByteString(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return ByteString.copyFromUtf8(s);
        }
    }

    private void writeFrame(CodedOutputStream codedoutputstream, int i, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        codedoutputstream.writeTag(i, 2);
        codedoutputstream.writeRawVarint32(getFrameSize(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            codedoutputstream.writeUInt64(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            codedoutputstream.writeUInt64(1, 0L);
        }
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            codedoutputstream.writeUInt64(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        codedoutputstream.writeUInt32(5, i);
    }

    private void writeSessionEventApp(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable, int i, Map map)
        throws Exception
    {
        codedoutputstream.writeTag(3, 2);
        codedoutputstream.writeRawVarint32(getEventAppSize(thread, throwable, i, map));
        writeSessionEventAppExecution(codedoutputstream, thread, throwable);
        if (map != null && !map.isEmpty())
        {
            writeSessionEventAppCustomAttributes(codedoutputstream, map);
        }
        if (runningAppProcessInfo != null)
        {
            boolean flag;
            if (runningAppProcessInfo.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            codedoutputstream.writeBool(3, flag);
        }
        codedoutputstream.writeUInt32(4, i);
    }

    private void writeSessionEventAppCustomAttributes(CodedOutputStream codedoutputstream, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            codedoutputstream.writeTag(2, 2);
            codedoutputstream.writeRawVarint32(getEventAppCustomAttributeSize((String)map.getKey(), (String)map.getValue()));
            codedoutputstream.writeBytes(1, ByteString.copyFromUtf8((String)map.getKey()));
            String s = (String)map.getValue();
            map = s;
            if (s == null)
            {
                map = "";
            }
        }

    }

    private void writeSessionEventAppExecution(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable)
        throws Exception
    {
        codedoutputstream.writeTag(1, 2);
        codedoutputstream.writeRawVarint32(getEventAppExecutionSize(thread, throwable));
        writeThread(codedoutputstream, thread, exceptionStack, 4, true);
        int j = threads.length;
        for (int i = 0; i < j; i++)
        {
            writeThread(codedoutputstream, threads[i], (StackTraceElement[])stacks.get(i), 0, false);
        }

        writeSessionEventAppExecutionException(codedoutputstream, throwable, 1, 2);
        codedoutputstream.writeTag(3, 2);
        codedoutputstream.writeRawVarint32(getEventAppExecutionSignalSize());
        codedoutputstream.writeBytes(1, SIGNAL_DEFAULT_BYTE_STRING);
        codedoutputstream.writeBytes(2, SIGNAL_DEFAULT_BYTE_STRING);
        codedoutputstream.writeUInt64(3, 0L);
        codedoutputstream.writeTag(4, 2);
        codedoutputstream.writeRawVarint32(getBinaryImageSize());
        codedoutputstream.writeUInt64(1, 0L);
        codedoutputstream.writeUInt64(2, 0L);
        codedoutputstream.writeBytes(3, packageNameBytes);
        if (optionalBuildIdBytes != null)
        {
            codedoutputstream.writeBytes(4, optionalBuildIdBytes);
        }
    }

    private void writeSessionEventAppExecutionException(CodedOutputStream codedoutputstream, Throwable throwable, int i, int j)
        throws Exception
    {
label0:
        {
            boolean flag = false;
            codedoutputstream.writeTag(j, 2);
            codedoutputstream.writeRawVarint32(getEventAppExecutionExceptionSize(throwable, 1));
            codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(throwable.getClass().getName()));
            Object obj = throwable.getLocalizedMessage();
            if (obj != null)
            {
                codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int k = astacktraceelement.length;
            for (j = 0; j < k; j++)
            {
                writeFrame(codedoutputstream, 4, astacktraceelement[j], true);
            }

            astacktraceelement = throwable.getCause();
            if (astacktraceelement != null)
            {
                j = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i >= maxChainedExceptionsDepth)
                {
                    break label0;
                }
                writeSessionEventAppExecutionException(codedoutputstream, ((Throwable) (astacktraceelement)), i + 1, 6);
            }
            return;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            j++;
        }
        codedoutputstream.writeUInt32(7, j);
    }

    private void writeSessionEventDevice(CodedOutputStream codedoutputstream, float f, int i, boolean flag, int j, long l1, 
            long l2)
        throws Exception
    {
        codedoutputstream.writeTag(5, 2);
        codedoutputstream.writeRawVarint32(getEventDeviceSize(f, i, flag, j, l1, l2));
        codedoutputstream.writeFloat(1, f);
        codedoutputstream.writeSInt32(2, i);
        codedoutputstream.writeBool(3, flag);
        codedoutputstream.writeUInt32(4, j);
        codedoutputstream.writeUInt64(5, l1);
        codedoutputstream.writeUInt64(6, l2);
    }

    private void writeSessionEventLog(CodedOutputStream codedoutputstream, ByteString bytestring)
        throws Exception
    {
        if (bytestring != null)
        {
            codedoutputstream.writeTag(6, 2);
            codedoutputstream.writeRawVarint32(getEventLogSize(bytestring));
            codedoutputstream.writeBytes(1, bytestring);
        }
    }

    private void writeThread(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
        throws Exception
    {
        codedoutputstream.writeTag(1, 2);
        codedoutputstream.writeRawVarint32(getThreadSize(thread, astacktraceelement, i, flag));
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
        codedoutputstream.writeUInt32(2, i);
        int j = astacktraceelement.length;
        for (i = 0; i < j; i++)
        {
            writeFrame(codedoutputstream, 3, astacktraceelement[i], flag);
        }

    }

    public void writeBeginSession(CodedOutputStream codedoutputstream, String s, String s1, long l1)
        throws Exception
    {
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(s1));
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
        codedoutputstream.writeUInt64(3, l1);
    }

    public void writeSessionApp(CodedOutputStream codedoutputstream, String s, String s1, String s2, String s3, int i)
        throws Exception
    {
        s = ByteString.copyFromUtf8(s);
        s1 = ByteString.copyFromUtf8(s1);
        s2 = ByteString.copyFromUtf8(s2);
        s3 = ByteString.copyFromUtf8(s3);
        codedoutputstream.writeTag(7, 2);
        codedoutputstream.writeRawVarint32(getSessionAppSize(s, s1, s2, s3, i));
        codedoutputstream.writeBytes(1, s);
        codedoutputstream.writeBytes(2, s1);
        codedoutputstream.writeBytes(3, s2);
        codedoutputstream.writeTag(5, 2);
        codedoutputstream.writeRawVarint32(getSessionAppOrgSize());
        codedoutputstream.writeString(1, (new g()).a(context));
        codedoutputstream.writeBytes(6, s3);
        codedoutputstream.writeEnum(10, i);
    }

    public void writeSessionDevice(CodedOutputStream codedoutputstream, String s, int i, String s1, int j, long l1, 
            long l2, boolean flag, Map map, int k, String s2, String s3)
        throws Exception
    {
        s = ByteString.copyFromUtf8(s);
        ByteString bytestring = stringToByteString(s1);
        s1 = stringToByteString(s3);
        s2 = stringToByteString(s2);
        codedoutputstream.writeTag(9, 2);
        codedoutputstream.writeRawVarint32(getSessionDeviceSize(i, s, bytestring, j, l1, l2, flag, map, k, s2, s1));
        codedoutputstream.writeBytes(1, s);
        codedoutputstream.writeEnum(3, i);
        codedoutputstream.writeBytes(4, bytestring);
        codedoutputstream.writeUInt32(5, j);
        codedoutputstream.writeUInt64(6, l1);
        codedoutputstream.writeUInt64(7, l2);
        codedoutputstream.writeBool(10, flag);
        for (s = map.entrySet().iterator(); s.hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((String)map.getValue())))
        {
            map = (java.util.Map.Entry)s.next();
            codedoutputstream.writeTag(11, 2);
            codedoutputstream.writeRawVarint32(getDeviceIdentifierSize((io.fabric.sdk.android.services.common.n.a)map.getKey(), (String)map.getValue()));
            codedoutputstream.writeEnum(1, ((io.fabric.sdk.android.services.common.n.a)map.getKey()).h);
        }

        codedoutputstream.writeUInt32(12, k);
        if (s2 != null)
        {
            codedoutputstream.writeBytes(13, s2);
        }
        if (s1 != null)
        {
            codedoutputstream.writeBytes(14, s1);
        }
    }

    public void writeSessionEvent(CodedOutputStream codedoutputstream, long l1, Thread thread, Throwable throwable, String s, Thread athread[], 
            float f, int i, boolean flag, int j, long l2, long l3, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, List list, StackTraceElement astacktraceelement[], LogFileManager logfilemanager, Map map)
        throws Exception
    {
        runningAppProcessInfo = runningappprocessinfo;
        stacks = list;
        exceptionStack = astacktraceelement;
        threads = athread;
        athread = logfilemanager.getByteStringForLog();
        if (athread == null)
        {
            c.h().a("Fabric", "No log data to include with this event.");
        }
        logfilemanager.clearLog();
        codedoutputstream.writeTag(10, 2);
        codedoutputstream.writeRawVarint32(getSessionEventSize(thread, throwable, s, l1, map, f, i, flag, j, l2, l3, athread));
        codedoutputstream.writeUInt64(1, l1);
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
        writeSessionEventApp(codedoutputstream, thread, throwable, j, map);
        writeSessionEventDevice(codedoutputstream, f, i, flag, j, l2, l3);
        writeSessionEventLog(codedoutputstream, athread);
    }

    public void writeSessionOS(CodedOutputStream codedoutputstream, boolean flag)
        throws Exception
    {
        ByteString bytestring = ByteString.copyFromUtf8(android.os.Build.VERSION.RELEASE);
        ByteString bytestring1 = ByteString.copyFromUtf8(android.os.Build.VERSION.CODENAME);
        codedoutputstream.writeTag(8, 2);
        codedoutputstream.writeRawVarint32(getSessionOSSize(bytestring, bytestring1, flag));
        codedoutputstream.writeEnum(1, 3);
        codedoutputstream.writeBytes(2, bytestring);
        codedoutputstream.writeBytes(3, bytestring1);
        codedoutputstream.writeBool(4, flag);
    }

    public void writeSessionUser(CodedOutputStream codedoutputstream, String s, String s1, String s2)
        throws Exception
    {
        Object obj = s;
        if (s == null)
        {
            obj = "";
        }
        s = ByteString.copyFromUtf8(((String) (obj)));
        obj = stringToByteString(s1);
        ByteString bytestring = stringToByteString(s2);
        int j = 0 + CodedOutputStream.computeBytesSize(1, s);
        int i = j;
        if (s1 != null)
        {
            i = j + CodedOutputStream.computeBytesSize(2, ((ByteString) (obj)));
        }
        j = i;
        if (s2 != null)
        {
            j = i + CodedOutputStream.computeBytesSize(3, bytestring);
        }
        codedoutputstream.writeTag(6, 2);
        codedoutputstream.writeRawVarint32(j);
        codedoutputstream.writeBytes(1, s);
        if (s1 != null)
        {
            codedoutputstream.writeBytes(2, ((ByteString) (obj)));
        }
        if (s2 != null)
        {
            codedoutputstream.writeBytes(3, bytestring);
        }
    }

}
