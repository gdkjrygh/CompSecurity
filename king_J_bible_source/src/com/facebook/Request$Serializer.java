// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            Request, ProgressNoopOutputStream, RequestOutputStream

private static class logger
    implements ializer
{

    private boolean firstWrite;
    private final Logger logger;
    private final OutputStream outputStream;

    public transient void write(String s, Object aobj[])
        throws IOException
    {
        if (firstWrite)
        {
            outputStream.write("--".getBytes());
            outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
            outputStream.write("\r\n".getBytes());
            firstWrite = false;
        }
        outputStream.write(String.format(s, aobj).getBytes());
    }

    public void writeBitmap(String s, Bitmap bitmap)
        throws IOException
    {
        writeContentDisposition(s, s, "image/png");
        bitmap.compress(android.graphics.at.PNG, 100, outputStream);
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), "<Image>");
        }
    }

    public void writeBytes(String s, byte abyte0[])
        throws IOException
    {
        writeContentDisposition(s, s, "content/unknown");
        outputStream.write(abyte0);
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format("<Data: %d>", new Object[] {
                Integer.valueOf(abyte0.length)
            }));
        }
    }

    public void writeContentDisposition(String s, String s1, String s2)
        throws IOException
    {
        write("Content-Disposition: form-data; name=\"%s\"", new Object[] {
            s
        });
        if (s1 != null)
        {
            write("; filename=\"%s\"", new Object[] {
                s1
            });
        }
        writeLine("", new Object[0]);
        if (s2 != null)
        {
            writeLine("%s: %s", new Object[] {
                "Content-Type", s2
            });
        }
        writeLine("", new Object[0]);
    }

    public void writeFile(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
        throws IOException
    {
        int i;
        int j;
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        writeContentDisposition(s, s, s2);
        i = 0;
        j = 0;
        if (!(outputStream instanceof ProgressNoopOutputStream)) goto _L2; else goto _L1
_L1:
        ((ProgressNoopOutputStream)outputStream).addProgress(parcelfiledescriptor.getStatSize());
_L7:
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format("<Data: %d>", new Object[] {
                Integer.valueOf(j)
            }));
        }
        return;
_L2:
        Object obj;
        obj = null;
        s1 = null;
        parcelfiledescriptor = new android.os.r.AutoCloseInputStream(parcelfiledescriptor);
        BufferedInputStream bufferedinputstream = new BufferedInputStream(parcelfiledescriptor);
        s1 = new byte[8192];
_L3:
        j = bufferedinputstream.read(s1);
        if (j == -1)
        {
            if (bufferedinputstream != null)
            {
                bufferedinputstream.close();
            }
            j = i;
            if (parcelfiledescriptor != null)
            {
                parcelfiledescriptor.close();
                j = i;
            }
            continue; /* Loop/switch isn't completed */
        }
        outputStream.write(s1, 0, j);
        i += j;
          goto _L3
        parcelfiledescriptor;
        s = obj;
_L5:
        if (s1 != null)
        {
            s1.close();
        }
        if (s != null)
        {
            s.close();
        }
        throw parcelfiledescriptor;
        Exception exception;
        exception;
        s = parcelfiledescriptor;
        parcelfiledescriptor = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        s1 = bufferedinputstream;
        s = parcelfiledescriptor;
        parcelfiledescriptor = exception;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void writeFile(String s, escriptorWithMimeType escriptorwithmimetype)
        throws IOException
    {
        writeFile(s, escriptorwithmimetype.getFileDescriptor(), escriptorwithmimetype.getMimeType());
    }

    public transient void writeLine(String s, Object aobj[])
        throws IOException
    {
        write(s, aobj);
        write("\r\n", new Object[0]);
    }

    public void writeObject(String s, Object obj, Request request)
        throws IOException
    {
        if (outputStream instanceof RequestOutputStream)
        {
            ((RequestOutputStream)outputStream).setCurrentRequest(request);
        }
        if (Request.access$0(obj))
        {
            writeString(s, Request.access$1(obj));
            return;
        }
        if (obj instanceof Bitmap)
        {
            writeBitmap(s, (Bitmap)obj);
            return;
        }
        if (obj instanceof byte[])
        {
            writeBytes(s, (byte[])obj);
            return;
        }
        if (obj instanceof ParcelFileDescriptor)
        {
            writeFile(s, (ParcelFileDescriptor)obj, null);
            return;
        }
        if (obj instanceof escriptorWithMimeType)
        {
            writeFile(s, (escriptorWithMimeType)obj);
            return;
        } else
        {
            throw new IllegalArgumentException("value is not a supported type: String, Bitmap, byte[]");
        }
    }

    public void writeRecordBoundary()
        throws IOException
    {
        writeLine("--%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
        throws IOException, JSONException
    {
        if (outputStream instanceof RequestOutputStream) goto _L2; else goto _L1
_L1:
        writeString(s, jsonarray.toString());
_L4:
        return;
_L2:
        RequestOutputStream requestoutputstream = (RequestOutputStream)outputStream;
        writeContentDisposition(s, null, null);
        write("[", new Object[0]);
        int i = 0;
        collection = collection.iterator();
        do
        {
label0:
            {
                if (collection.hasNext())
                {
                    break label0;
                }
                write("]", new Object[0]);
                if (logger != null)
                {
                    logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                    return;
                }
            }
            if (true)
            {
                continue;
            }
            Request request = (Request)collection.next();
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            requestoutputstream.setCurrentRequest(request);
            if (i > 0)
            {
                write(",%s", new Object[] {
                    jsonobject.toString()
                });
            } else
            {
                write("%s", new Object[] {
                    jsonobject.toString()
                });
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeString(String s, String s1)
        throws IOException
    {
        writeContentDisposition(s, null, null);
        writeLine("%s", new Object[] {
            s1
        });
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), s1);
        }
    }

    public escriptorWithMimeType(OutputStream outputstream, Logger logger1)
    {
        firstWrite = true;
        outputStream = outputstream;
        logger = logger1;
    }
}
