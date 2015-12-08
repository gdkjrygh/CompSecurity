// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.models.BinaryImageData;
import com.crashlytics.android.internal.models.CustomAttributeData;
import com.crashlytics.android.internal.models.DeviceData;
import com.crashlytics.android.internal.models.SessionEventData;
import com.crashlytics.android.internal.models.SignalData;
import com.crashlytics.android.internal.models.ThreadData;

// Referenced classes of package com.crashlytics.android:
//            CodedOutputStream

class NativeCrashWriter
{

    private static final SignalData a = new SignalData("", "", 0L);
    private static final ProtobufMessage b[] = new ProtobufMessage[0];
    private static final ThreadMessage c[] = new ThreadMessage[0];
    private static final FrameMessage d[] = new FrameMessage[0];
    private static final BinaryImageMessage e[] = new BinaryImageMessage[0];
    private static final CustomAttributeMessage f[] = new CustomAttributeMessage[0];

    private static DeviceMessage a(DeviceData devicedata)
    {
        return new DeviceMessage((float)devicedata.f / 100F, devicedata.g, devicedata.h, devicedata.a, devicedata.b - devicedata.d, devicedata.c - devicedata.e);
    }

    private static EventMessage a(SessionEventData sessioneventdata)
    {
        Object obj;
        DeviceMessage devicemessage;
        if (sessioneventdata.b != null)
        {
            obj = sessioneventdata.b;
        } else
        {
            obj = a;
        }
        obj = new ApplicationMessage(new ExecutionMessage(new SignalMessage(((SignalData) (obj))), a(sessioneventdata.c), a(sessioneventdata.d)), a(sessioneventdata.e));
        devicemessage = a(sessioneventdata.f);
        return new EventMessage(sessioneventdata.a, "ndk-crash", ((ApplicationMessage) (obj)), devicemessage);
    }

    private static RepeatedMessage a(BinaryImageData abinaryimagedata[])
    {
        BinaryImageMessage abinaryimagemessage[];
        int i;
        if (abinaryimagedata != null)
        {
            abinaryimagemessage = new BinaryImageMessage[abinaryimagedata.length];
        } else
        {
            abinaryimagemessage = e;
        }
        for (i = 0; i < abinaryimagemessage.length; i++)
        {
            abinaryimagemessage[i] = new BinaryImageMessage(abinaryimagedata[i]);
        }

        return new RepeatedMessage(abinaryimagemessage);
    }

    private static RepeatedMessage a(CustomAttributeData acustomattributedata[])
    {
        CustomAttributeMessage acustomattributemessage[];
        int i;
        if (acustomattributedata != null)
        {
            acustomattributemessage = new CustomAttributeMessage[acustomattributedata.length];
        } else
        {
            acustomattributemessage = f;
        }
        for (i = 0; i < acustomattributemessage.length; i++)
        {
            acustomattributemessage[i] = new CustomAttributeMessage(acustomattributedata[i]);
        }

        return new RepeatedMessage(acustomattributemessage);
    }

    private static RepeatedMessage a(com.crashlytics.android.internal.models.ThreadData.FrameData aframedata[])
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

    private static RepeatedMessage a(ThreadData athreaddata[])
    {
        ThreadMessage athreadmessage[];
        int i;
        if (athreaddata != null)
        {
            athreadmessage = new ThreadMessage[athreaddata.length];
        } else
        {
            athreadmessage = c;
        }
        for (i = 0; i < athreadmessage.length; i++)
        {
            ThreadData threaddata = athreaddata[i];
            athreadmessage[i] = new ThreadMessage(threaddata, a(threaddata.c));
        }

        return new RepeatedMessage(athreadmessage);
    }

    public static void a(SessionEventData sessioneventdata, CodedOutputStream codedoutputstream)
    {
        a(sessioneventdata).b(codedoutputstream);
    }

    static ProtobufMessage[] a()
    {
        return b;
    }


    private class DeviceMessage extends ProtobufMessage
    {
        private class ProtobufMessage
        {

            private final int a;
            private final ProtobufMessage b[];

            public int a()
            {
                return 0;
            }

            public void a(CodedOutputStream codedoutputstream)
            {
            }

            public int b()
            {
                int i = c();
                return i + CodedOutputStream.l(i) + CodedOutputStream.j(a);
            }

            public void b(CodedOutputStream codedoutputstream)
            {
                codedoutputstream.g(a, 2);
                codedoutputstream.k(c());
                a(codedoutputstream);
                ProtobufMessage aprotobufmessage[] = b;
                int j = aprotobufmessage.length;
                for (int i = 0; i < j; i++)
                {
                    aprotobufmessage[i].b(codedoutputstream);
                }

            }

            public int c()
            {
                int j = a();
                ProtobufMessage aprotobufmessage[] = b;
                int k = aprotobufmessage.length;
                for (int i = 0; i < k; i++)
                {
                    j += aprotobufmessage[i].b();
                }

                return j;
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


        private final float a;
        private final int b;
        private final boolean c;
        private final int d;
        private final long e;
        private final long f;

        public int a()
        {
            return 0 + CodedOutputStream.b(1, a) + CodedOutputStream.f(2, b) + CodedOutputStream.b(3, c) + CodedOutputStream.d(4, d) + CodedOutputStream.b(5, e) + CodedOutputStream.b(6, f);
        }

        public void a(CodedOutputStream codedoutputstream)
        {
            codedoutputstream.a(1, a);
            codedoutputstream.c(2, b);
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


    private class ApplicationMessage extends ProtobufMessage
    {

        public ApplicationMessage(ExecutionMessage executionmessage, RepeatedMessage repeatedmessage)
        {
            super(3, new ProtobufMessage[] {
                executionmessage, repeatedmessage
            });
        }
    }


    private class ExecutionMessage extends ProtobufMessage
    {

        public ExecutionMessage(SignalMessage signalmessage, RepeatedMessage repeatedmessage, RepeatedMessage repeatedmessage1)
        {
            super(1, new ProtobufMessage[] {
                repeatedmessage, signalmessage, repeatedmessage1
            });
        }
    }


    private class SignalMessage extends ProtobufMessage
    {

        private final String a;
        private final String b;
        private final long c;

        public int a()
        {
            return CodedOutputStream.b(1, ByteString.a(a)) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, c);
        }

        public void a(CodedOutputStream codedoutputstream)
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


    private class EventMessage extends ProtobufMessage
    {

        private final long a;
        private final String b;

        public int a()
        {
            return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b));
        }

        public void a(CodedOutputStream codedoutputstream)
        {
            codedoutputstream.a(1, a);
            codedoutputstream.a(2, ByteString.a(b));
        }

        public EventMessage(long l, String s, ApplicationMessage applicationmessage, DeviceMessage devicemessage)
        {
            super(10, new ProtobufMessage[] {
                applicationmessage, devicemessage
            });
            a = l;
            b = s;
        }
    }


    private class BinaryImageMessage extends ProtobufMessage
    {

        private final long a;
        private final long b;
        private final String c;
        private final String d;

        public int a()
        {
            int i = CodedOutputStream.b(1, a);
            int j = CodedOutputStream.b(2, b);
            return i + CodedOutputStream.b(3, ByteString.a(c)) + j + CodedOutputStream.b(4, ByteString.a(d));
        }

        public void a(CodedOutputStream codedoutputstream)
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


    private class RepeatedMessage extends ProtobufMessage
    {

        private final ProtobufMessage a[];

        public int b()
        {
            int i = 0;
            ProtobufMessage aprotobufmessage[] = a;
            int k = aprotobufmessage.length;
            int j = 0;
            for (; i < k; i++)
            {
                j += aprotobufmessage[i].b();
            }

            return j;
        }

        public void b(CodedOutputStream codedoutputstream)
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


    private class CustomAttributeMessage extends ProtobufMessage
    {

        private final String a;
        private final String b;

        public int a()
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

        public void a(CodedOutputStream codedoutputstream)
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


    private class FrameMessage extends ProtobufMessage
    {

        private final long a;
        private final String b;
        private final String c;
        private final long d;
        private final int e;

        public int a()
        {
            return CodedOutputStream.b(1, a) + CodedOutputStream.b(2, ByteString.a(b)) + CodedOutputStream.b(3, ByteString.a(c)) + CodedOutputStream.b(4, d) + CodedOutputStream.d(5, e);
        }

        public void a(CodedOutputStream codedoutputstream)
        {
            codedoutputstream.a(1, a);
            codedoutputstream.a(2, ByteString.a(b));
            codedoutputstream.a(3, ByteString.a(c));
            codedoutputstream.a(4, d);
            codedoutputstream.a(5, e);
        }

        public FrameMessage(com.crashlytics.android.internal.models.ThreadData.FrameData framedata)
        {
            super(3, new ProtobufMessage[0]);
            a = framedata.a;
            b = framedata.b;
            c = framedata.c;
            d = framedata.d;
            e = framedata.e;
        }
    }


    private class ThreadMessage extends ProtobufMessage
    {

        private final String a;
        private final int b;

        private boolean d()
        {
            return a != null && a.length() > 0;
        }

        public int a()
        {
            int i;
            if (d())
            {
                i = CodedOutputStream.b(1, ByteString.a(a));
            } else
            {
                i = 0;
            }
            return i + CodedOutputStream.d(2, b);
        }

        public void a(CodedOutputStream codedoutputstream)
        {
            if (d())
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

}
