// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.BinaryImageData;
import com.crashlytics.android.core.internal.models.CustomAttributeData;
import com.crashlytics.android.core.internal.models.DeviceData;
import com.crashlytics.android.core.internal.models.SessionEventData;
import com.crashlytics.android.core.internal.models.SignalData;
import com.crashlytics.android.core.internal.models.ThreadData;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.crashlytics.android.core:
//            LogFileManager, CodedOutputStream, ByteString

class NativeCrashWriter
{
    private static final class ApplicationMessage extends ProtobufMessage
    {

        public ApplicationMessage(ExecutionMessage executionmessage, RepeatedMessage repeatedmessage)
        {
            super(3, new ProtobufMessage[] {
                executionmessage, repeatedmessage
            });
        }
    }

    private static final class BinaryImageMessage extends ProtobufMessage
    {

        private final long a;
        private final long b;
        private final String c;
        private final String d;

        public final int a()
        {
            int i = CodedOutputStream.b(1, a);
            int j = CodedOutputStream.b(2, b);
            return i + CodedOutputStream.b(3, ByteString.a(c)) + j + CodedOutputStream.b(4, ByteString.a(d));
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, a);
            codedoutputstream.a(2, b);
            codedoutputstream.a(3, ByteString.a(c));
            codedoutputstream.a(4, ByteString.a(d));
        }

        public BinaryImageMessage(BinaryImageData binaryimagedata)
        {
            super(4, new ProtobufMessage[0]);
            a = binaryimagedata.a;
            b = binaryimagedata.b;
            c = binaryimagedata.c;
            d = binaryimagedata.d;
        }
    }

    private static final class CustomAttributeMessage extends ProtobufMessage
    {

        private final String a;
        private final String b;

        public final int a()
        {
            int i = CodedOutputStream.b(1, ByteString.a(a));
            String s;
            if (b == null)
            {
                s = "";
            } else
            {
                s = b;
            }
            return CodedOutputStream.b(2, ByteString.a(s)) + i;
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, ByteString.a(a));
            String s;
            if (b == null)
            {
                s = "";
            } else
            {
                s = b;
            }
            codedoutputstream.a(2, ByteString.a(s));
        }

        public CustomAttributeMessage(CustomAttributeData customattributedata)
        {
            super(2, new ProtobufMessage[0]);
            a = customattributedata.a;
            b = customattributedata.b;
        }
    }

    private static final class DeviceMessage extends ProtobufMessage
    {

        private final float a;
        private final int b;
        private final boolean c;
        private final int d;
        private final long e;
        private final long f;

        public final int a()
        {
            return CodedOutputStream.a() + 0 + com.crashlytics.android.core.CodedOutputStream.c(b) + CodedOutputStream.b(3) + com.crashlytics.android.core.CodedOutputStream.c(4, d) + CodedOutputStream.b(5, e) + CodedOutputStream.b(6, f);
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(a);
            codedoutputstream.a(b);
            codedoutputstream.a(3, c);
            codedoutputstream.a(4, d);
            codedoutputstream.a(5, e);
            codedoutputstream.a(6, f);
        }

        public DeviceMessage(float f1, int i, boolean flag, int j, long l, long l1)
        {
            super(5, new ProtobufMessage[0]);
            a = f1;
            b = i;
            c = flag;
            d = j;
            e = l;
            f = l1;
        }
    }

    private static final class EventMessage extends ProtobufMessage
    {

        private final long a;
        private final String b;

        public final int a()
        {
            return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b));
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, a);
            codedoutputstream.a(2, ByteString.a(b));
        }

        public transient EventMessage(long l, String s, ProtobufMessage aprotobufmessage[])
        {
            super(10, aprotobufmessage);
            a = l;
            b = s;
        }
    }

    private static final class ExecutionMessage extends ProtobufMessage
    {

        public ExecutionMessage(SignalMessage signalmessage, RepeatedMessage repeatedmessage, RepeatedMessage repeatedmessage1)
        {
            super(1, new ProtobufMessage[] {
                repeatedmessage, signalmessage, repeatedmessage1
            });
        }
    }

    private static final class FrameMessage extends ProtobufMessage
    {

        private final long a;
        private final String b;
        private final String c;
        private final long d;
        private final int e;

        public final int a()
        {
            return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, ByteString.a(c)) + CodedOutputStream.b(4, d) + com.crashlytics.android.core.CodedOutputStream.c(5, e);
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, a);
            codedoutputstream.a(2, ByteString.a(b));
            codedoutputstream.a(3, ByteString.a(c));
            codedoutputstream.a(4, d);
            codedoutputstream.a(5, e);
        }

        public FrameMessage(com.crashlytics.android.core.internal.models.ThreadData.FrameData framedata)
        {
            super(3, new ProtobufMessage[0]);
            a = framedata.a;
            b = framedata.b;
            c = framedata.c;
            d = framedata.d;
            e = framedata.e;
        }
    }

    private static final class LogMessage extends ProtobufMessage
    {

        ByteString a;

        public final int a()
        {
            return CodedOutputStream.b(1, a);
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, a);
        }

        public LogMessage(ByteString bytestring)
        {
            super(6, new ProtobufMessage[0]);
            a = bytestring;
        }
    }

    private static final class NullMessage extends ProtobufMessage
    {

        public final void b(CodedOutputStream codedoutputstream)
            throws IOException
        {
        }

        public NullMessage()
        {
            super(0, new ProtobufMessage[0]);
        }
    }

    private static abstract class ProtobufMessage
    {

        private final int a;
        private final ProtobufMessage b[];

        private int c()
        {
            int j = a();
            ProtobufMessage aprotobufmessage[] = b;
            int l = aprotobufmessage.length;
            for (int i = 0; i < l; i++)
            {
                j += aprotobufmessage[i].b();
            }

            return j;
        }

        public int a()
        {
            return 0;
        }

        public void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
        }

        public int b()
        {
            int i = c();
            return i + CodedOutputStream.f(i) + CodedOutputStream.d(a);
        }

        public void b(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.e(a, 2);
            codedoutputstream.e(c());
            a(codedoutputstream);
            ProtobufMessage aprotobufmessage[] = b;
            int j = aprotobufmessage.length;
            for (int i = 0; i < j; i++)
            {
                aprotobufmessage[i].b(codedoutputstream);
            }

        }

        public transient ProtobufMessage(int i, ProtobufMessage aprotobufmessage[])
        {
            a = i;
            if (aprotobufmessage == null)
            {
                aprotobufmessage = NativeCrashWriter.a();
            }
            b = aprotobufmessage;
        }
    }

    private static final class RepeatedMessage extends ProtobufMessage
    {

        private final ProtobufMessage a[];

        public final int b()
        {
            int i = 0;
            ProtobufMessage aprotobufmessage[] = a;
            int l = aprotobufmessage.length;
            int j = 0;
            for (; i < l; i++)
            {
                j += aprotobufmessage[i].b();
            }

            return j;
        }

        public final void b(CodedOutputStream codedoutputstream)
            throws IOException
        {
            ProtobufMessage aprotobufmessage[] = a;
            int j = aprotobufmessage.length;
            for (int i = 0; i < j; i++)
            {
                aprotobufmessage[i].b(codedoutputstream);
            }

        }

        public transient RepeatedMessage(ProtobufMessage aprotobufmessage[])
        {
            super(0, new ProtobufMessage[0]);
            a = aprotobufmessage;
        }
    }

    private static final class SignalMessage extends ProtobufMessage
    {

        private final String a;
        private final String b;
        private final long c;

        public final int a()
        {
            return CodedOutputStream.b(1, ByteString.a(a)) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, c);
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            codedoutputstream.a(1, ByteString.a(a));
            codedoutputstream.a(2, ByteString.a(b));
            codedoutputstream.a(3, c);
        }

        public SignalMessage(SignalData signaldata)
        {
            super(3, new ProtobufMessage[0]);
            a = signaldata.a;
            b = signaldata.b;
            c = signaldata.c;
        }
    }

    private static final class ThreadMessage extends ProtobufMessage
    {

        private final String a;
        private final int b;

        private boolean c()
        {
            return a != null && a.length() > 0;
        }

        public final int a()
        {
            int i;
            if (c())
            {
                i = CodedOutputStream.b(1, ByteString.a(a));
            } else
            {
                i = 0;
            }
            return i + com.crashlytics.android.core.CodedOutputStream.c(2, b);
        }

        public final void a(CodedOutputStream codedoutputstream)
            throws IOException
        {
            if (c())
            {
                codedoutputstream.a(1, ByteString.a(a));
            }
            codedoutputstream.a(2, b);
        }

        public ThreadMessage(ThreadData threaddata, RepeatedMessage repeatedmessage)
        {
            super(1, new ProtobufMessage[] {
                repeatedmessage
            });
            a = threaddata.a;
            b = threaddata.b;
        }
    }


    private static final SignalData a = new SignalData("", "");
    private static final ProtobufMessage b[] = new ProtobufMessage[0];
    private static final ThreadMessage c[] = new ThreadMessage[0];
    private static final FrameMessage d[] = new FrameMessage[0];
    private static final BinaryImageMessage e[] = new BinaryImageMessage[0];
    private static final CustomAttributeMessage f[] = new CustomAttributeMessage[0];

    NativeCrashWriter()
    {
    }

    private static RepeatedMessage a(CustomAttributeData acustomattributedata[])
    {
        CustomAttributeMessage acustomattributemessage[] = new CustomAttributeMessage[acustomattributedata.length];
        for (int i = 0; i < acustomattributemessage.length; i++)
        {
            acustomattributemessage[i] = new CustomAttributeMessage(acustomattributedata[i]);
        }

        return new RepeatedMessage(acustomattributemessage);
    }

    private static RepeatedMessage a(com.crashlytics.android.core.internal.models.ThreadData.FrameData aframedata[])
    {
        FrameMessage aframemessage[];
        int i;
        if (aframedata != null)
        {
            aframemessage = new FrameMessage[aframedata.length];
        } else
        {
            aframemessage = d;
        }
        for (i = 0; i < aframemessage.length; i++)
        {
            aframemessage[i] = new FrameMessage(aframedata[i]);
        }

        return new RepeatedMessage(aframemessage);
    }

    public static void a(SessionEventData sessioneventdata, LogFileManager logfilemanager, Map map, CodedOutputStream codedoutputstream)
        throws IOException
    {
        Object aobj[];
        Object obj1;
        ThreadData athreaddata[];
        int i;
        if (sessioneventdata.b != null)
        {
            aobj = sessioneventdata.b;
        } else
        {
            aobj = a;
        }
        obj1 = new SignalMessage(((SignalData) (aobj)));
        athreaddata = sessioneventdata.c;
        if (athreaddata != null)
        {
            aobj = new ThreadMessage[athreaddata.length];
        } else
        {
            aobj = c;
        }
        for (i = 0; i < aobj.length; i++)
        {
            ThreadData threaddata = athreaddata[i];
            aobj[i] = new ThreadMessage(threaddata, a(threaddata.c));
        }

        RepeatedMessage repeatedmessage = new RepeatedMessage(((ProtobufMessage []) (aobj)));
        BinaryImageData abinaryimagedata[] = sessioneventdata.d;
        if (abinaryimagedata != null)
        {
            aobj = new BinaryImageMessage[abinaryimagedata.length];
        } else
        {
            aobj = e;
        }
        for (i = 0; i < aobj.length; i++)
        {
            aobj[i] = new BinaryImageMessage(abinaryimagedata[i]);
        }

        Object obj = new ExecutionMessage(((SignalMessage) (obj1)), repeatedmessage, new RepeatedMessage(((ProtobufMessage []) (aobj))));
        CustomAttributeData acustomattributedata[] = sessioneventdata.e;
        map = new TreeMap(map);
        if (acustomattributedata != null)
        {
            int i1 = acustomattributedata.length;
            for (int j = 0; j < i1; j++)
            {
                CustomAttributeData customattributedata = acustomattributedata[j];
                map.put(customattributedata.a, customattributedata.b);
            }

        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[map.size()]);
        acustomattributedata = new CustomAttributeData[map.length];
        for (int l = 0; l < acustomattributedata.length; l++)
        {
            acustomattributedata[l] = new CustomAttributeData((String)map[l].getKey(), (String)map[l].getValue());
        }

        map = new ApplicationMessage(((ExecutionMessage) (obj)), a(acustomattributedata));
        obj = sessioneventdata.f;
        obj = new DeviceMessage((float)((DeviceData) (obj)).f / 100F, ((DeviceData) (obj)).g, ((DeviceData) (obj)).h, ((DeviceData) (obj)).a, ((DeviceData) (obj)).b - ((DeviceData) (obj)).d, ((DeviceData) (obj)).c - ((DeviceData) (obj)).e);
        acustomattributedata = logfilemanager.a();
        if (acustomattributedata == null)
        {
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        logfilemanager.b();
        if (acustomattributedata != null)
        {
            logfilemanager = new LogMessage(acustomattributedata);
        } else
        {
            logfilemanager = new NullMessage();
        }
        (new EventMessage(sessioneventdata.a, "ndk-crash", new ProtobufMessage[] {
            map, obj, logfilemanager
        })).b(codedoutputstream);
    }

    static ProtobufMessage[] a()
    {
        return b;
    }

}
