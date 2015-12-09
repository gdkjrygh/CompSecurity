// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.j;
import c.k;
import c.r;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, ErrorCode, FramedStream, Variant, 
//            FrameReader, HeadersMode, Ping, Settings

class <init> extends NamedRunnable
    implements <init>
{

    FrameReader frameReader;
    final FramedConnection this$0;

    private void ackSettingsLater(Settings settings1)
    {
        class _cls2 extends NamedRunnable
        {

            final FramedConnection.Reader this$1;
            final Settings val$peerSettings;

            public void execute()
            {
                try
                {
                    frameWriter.ackSettings(peerSettings);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient _cls2(Object aobj[], Settings settings1)
            {
                this$1 = FramedConnection.Reader.this;
                peerSettings = settings1;
                super(final_s, aobj);
            }
        }

        FramedConnection.access$1900().execute(new _cls2(new Object[] {
            FramedConnection.access$900(FramedConnection.this)
        }, settings1));
    }

    public void ackSettings()
    {
    }

    public void alternateService(int i, String s, k k1, String s1, int l, long l1)
    {
    }

    public void data(boolean flag, int i, j j1, int l)
    {
        if (FramedConnection.access$1100(FramedConnection.this, i))
        {
            FramedConnection.access$1200(FramedConnection.this, i, j1, l, flag);
        } else
        {
            FramedStream framedstream = getStream(i);
            if (framedstream == null)
            {
                writeSynResetLater(i, ErrorCode.INVALID_STREAM);
                j1.g(l);
                return;
            }
            framedstream.receiveData(j1, l);
            if (flag)
            {
                framedstream.receiveFin();
                return;
            }
        }
    }

    protected void execute()
    {
        Object obj;
        ErrorCode errorcode;
        Object obj2;
        ErrorCode errorcode1;
        obj2 = ErrorCode.INTERNAL_ERROR;
        errorcode1 = ErrorCode.INTERNAL_ERROR;
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        frameReader = variant.newReader(r.a(r.b(socket)), client);
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        if (client)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        frameReader.readConnectionPreface();
_L2:
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        if (frameReader.nextFrame(this)) goto _L2; else goto _L1
_L1:
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        obj2 = ErrorCode.NO_ERROR;
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        ErrorCode errorcode2 = ErrorCode.CANCEL;
        IOException ioexception;
        Object obj1;
        try
        {
            FramedConnection.access$1000(FramedConnection.this, ((ErrorCode) (obj2)), errorcode2);
        }
        catch (IOException ioexception1) { }
        Util.closeQuietly(frameReader);
        return;
        obj;
        obj = errorcode;
        obj2 = ErrorCode.PROTOCOL_ERROR;
        obj = ErrorCode.PROTOCOL_ERROR;
        try
        {
            FramedConnection.access$1000(FramedConnection.this, ((ErrorCode) (obj2)), ((ErrorCode) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        Util.closeQuietly(frameReader);
        return;
        obj1;
        obj2 = obj;
        obj = obj1;
_L4:
        try
        {
            FramedConnection.access$1000(FramedConnection.this, ((ErrorCode) (obj2)), errorcode1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        Util.closeQuietly(frameReader);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void goAway(int i, ErrorCode errorcode, k k1)
    {
        if (k1.f() <= 0);
        synchronized (FramedConnection.this)
        {
            k1 = (FramedStream[])FramedConnection.access$1700(FramedConnection.this).values().toArray(new FramedStream[FramedConnection.access$1700(FramedConnection.this).size()]);
            FramedConnection.access$1402(FramedConnection.this, true);
        }
        int i1 = k1.length;
        for (int l = 0; l < i1; l++)
        {
            errorcode = k1[l];
            if (errorcode.getId() > i && errorcode.isLocallyInitiated())
            {
                errorcode.receiveRstStream(ErrorCode.REFUSED_STREAM);
                removeStream(errorcode.getId());
            }
        }

        break MISSING_BLOCK_LABEL_128;
        k1;
        errorcode;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public void headers(boolean flag, boolean flag1, int i, int l, List list, HeadersMode headersmode)
    {
        if (!FramedConnection.access$1100(FramedConnection.this, i)) goto _L2; else goto _L1
_L1:
        FramedConnection.access$1300(FramedConnection.this, i, list, flag1);
_L4:
        return;
_L2:
        synchronized (FramedConnection.this)
        {
            if (!FramedConnection.access$1400(FramedConnection.this))
            {
                break MISSING_BLOCK_LABEL_54;
            }
        }
        return;
        list;
        framedconnection;
        JVM INSTR monitorexit ;
        throw list;
        FramedStream framedstream = getStream(i);
        if (framedstream != null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (!headersmode.failIfStreamAbsent())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        writeSynResetLater(i, ErrorCode.INVALID_STREAM);
        framedconnection;
        JVM INSTR monitorexit ;
        return;
        if (i > FramedConnection.access$1500(FramedConnection.this))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        framedconnection;
        JVM INSTR monitorexit ;
        return;
        if (i % 2 != FramedConnection.access$1600(FramedConnection.this) % 2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        framedconnection;
        JVM INSTR monitorexit ;
        return;
        list = new FramedStream(i, FramedConnection.this, flag, flag1, list);
        FramedConnection.access$1502(FramedConnection.this, i);
        FramedConnection.access$1700(FramedConnection.this).put(Integer.valueOf(i), list);
        class _cls1 extends NamedRunnable
        {

            final FramedConnection.Reader this$1;
            final FramedStream val$newStream;

            public void execute()
            {
                try
                {
                    FramedConnection.access$1800(this$0).receive(newStream);
                    return;
                }
                catch (IOException ioexception)
                {
                    Internal.logger.log(Level.INFO, (new StringBuilder()).append("StreamHandler failure for ").append(FramedConnection.access$900(this$0)).toString(), ioexception);
                }
                try
                {
                    newStream.close(ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                catch (IOException ioexception1)
                {
                    return;
                }
            }

            transient _cls1(Object aobj[], FramedStream framedstream)
            {
                this$1 = FramedConnection.Reader.this;
                newStream = framedstream;
                super(final_s, aobj);
            }
        }

        FramedConnection.access$1900().execute(new _cls1(new Object[] {
            FramedConnection.access$900(FramedConnection.this), Integer.valueOf(i)
        }, list));
        framedconnection;
        JVM INSTR monitorexit ;
        return;
        framedconnection;
        JVM INSTR monitorexit ;
        if (headersmode.failIfStreamPresent())
        {
            framedstream.closeLater(ErrorCode.PROTOCOL_ERROR);
            removeStream(i);
            return;
        }
        framedstream.receiveHeaders(list, headersmode);
        if (flag1)
        {
            framedstream.receiveFin();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void ping(boolean flag, int i, int l)
    {
        if (flag)
        {
            Ping ping1 = FramedConnection.access$2200(FramedConnection.this, i);
            if (ping1 != null)
            {
                ping1.receive();
            }
            return;
        } else
        {
            FramedConnection.access$2300(FramedConnection.this, true, i, l, null);
            return;
        }
    }

    public void priority(int i, int l, int i1, boolean flag)
    {
    }

    public void pushPromise(int i, int l, List list)
    {
        FramedConnection.access$2400(FramedConnection.this, l, list);
    }

    public void rstStream(int i, ErrorCode errorcode)
    {
        if (FramedConnection.access$1100(FramedConnection.this, i))
        {
            FramedConnection.access$2000(FramedConnection.this, i, errorcode);
        } else
        {
            FramedStream framedstream = removeStream(i);
            if (framedstream != null)
            {
                framedstream.receiveRstStream(errorcode);
                return;
            }
        }
    }

    public void settings(boolean flag, Settings settings1)
    {
        framedconnection = FramedConnection.this;
        framedconnection;
        JVM INSTR monitorenter ;
        int i = peerSettings.getInitialWindowSize(0x10000);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        peerSettings.clear();
        int i1;
        peerSettings.merge(settings1);
        if (getProtocol() == Protocol.HTTP_2)
        {
            ackSettingsLater(settings1);
        }
        i1 = peerSettings.getInitialWindowSize(0x10000);
        long l1;
        if (i1 == -1 || i1 == i)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        l1 = i1 - i;
        if (!FramedConnection.access$2100(FramedConnection.this))
        {
            addBytesToWriteWindow(l1);
            FramedConnection.access$2102(FramedConnection.this, true);
        }
        if (FramedConnection.access$1700(FramedConnection.this).isEmpty()) goto _L2; else goto _L1
_L1:
        settings1 = (FramedStream[])FramedConnection.access$1700(FramedConnection.this).values().toArray(new FramedStream[FramedConnection.access$1700(FramedConnection.this).size()]);
_L3:
        framedconnection;
        JVM INSTR monitorexit ;
        if (settings1 != null && l1 != 0L)
        {
            int j1 = settings1.length;
            for (int l = 0; l < j1; l++)
            {
                synchronized (settings1[l])
                {
                    framedconnection.addBytesToWriteWindow(l1);
                }
            }

        }
        break MISSING_BLOCK_LABEL_241;
        settings1;
        framedconnection;
        JVM INSTR monitorexit ;
        throw settings1;
        settings1;
        framedconnection;
        JVM INSTR monitorexit ;
        throw settings1;
        return;
_L2:
        settings1 = null;
          goto _L3
        settings1 = null;
        l1 = 0L;
          goto _L3
    }

    public void windowUpdate(int i, long l)
    {
        if (i == 0)
        {
            synchronized (FramedConnection.this)
            {
                FramedConnection framedconnection1 = FramedConnection.this;
                framedconnection1.bytesLeftInWriteWindow = framedconnection1.bytesLeftInWriteWindow + l;
                notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        framedconnection;
        JVM INSTR monitorexit ;
        throw exception;
        FramedStream framedstream;
        framedstream = getStream(i);
        if (framedstream == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        framedstream;
        JVM INSTR monitorenter ;
        framedstream.addBytesToWriteWindow(l);
        framedstream;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        framedstream;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private _cls1()
    {
        this$0 = FramedConnection.this;
        super("OkHttp %s", new Object[] {
            FramedConnection.access$900(FramedConnection.this)
        });
    }

    _cls900(_cls900 _pcls900)
    {
        this();
    }
}
