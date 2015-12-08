// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ProgressNoopOutputStream, RequestOutputStream, Request

class logger
    implements ializer
{

    private boolean firstWrite;
    private final Logger logger;
    private final OutputStream outputStream;

    public transient void write(String s, Object aobj[])
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
    {
        Object obj1;
        obj1 = null;
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        writeContentDisposition(s, s, s2);
        if (!(outputStream instanceof ProgressNoopOutputStream)) goto _L2; else goto _L1
_L1:
        int i;
        ((ProgressNoopOutputStream)outputStream).addProgress(parcelfiledescriptor.getStatSize());
        i = 0;
_L6:
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format("<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
        return;
_L2:
        parcelfiledescriptor = new android.os.r.AutoCloseInputStream(parcelfiledescriptor);
        s1 = new BufferedInputStream(parcelfiledescriptor);
        byte abyte0[] = new byte[8192];
        i = 0;
_L4:
        int j = s1.read(abyte0);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        outputStream.write(abyte0, 0, j);
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        s1.close();
        parcelfiledescriptor.close();
        if (true) goto _L6; else goto _L5
_L5:
        s;
        parcelfiledescriptor = null;
        s1 = obj1;
_L8:
        if (parcelfiledescriptor != null)
        {
            parcelfiledescriptor.close();
        }
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        Object obj = null;
        s1 = parcelfiledescriptor;
        parcelfiledescriptor = obj;
        continue; /* Loop/switch isn't completed */
        s;
        ParcelFileDescriptor parcelfiledescriptor1 = parcelfiledescriptor;
        parcelfiledescriptor = s1;
        s1 = parcelfiledescriptor1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void writeFile(String s, escriptorWithMimeType escriptorwithmimetype)
    {
        writeFile(s, escriptorwithmimetype.getFileDescriptor(), escriptorwithmimetype.getMimeType());
    }

    public transient void writeLine(String s, Object aobj[])
    {
        write(s, aobj);
        write("\r\n", new Object[0]);
    }

    public void writeObject(String s, Object obj, Request request)
    {
        if (outputStream instanceof RequestOutputStream)
        {
            ((RequestOutputStream)outputStream).setCurrentRequest(request);
        }
        if (Request.access$100(obj))
        {
            writeString(s, Request.access$200(obj));
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
    {
        writeLine("--%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
    {
        if (!(outputStream instanceof RequestOutputStream))
        {
            writeString(s, jsonarray.toString());
        } else
        {
            RequestOutputStream requestoutputstream = (RequestOutputStream)outputStream;
            writeContentDisposition(s, null, null);
            write("[", new Object[0]);
            collection = collection.iterator();
            int i = 0;
            while (collection.hasNext()) 
            {
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
            }
            write("]", new Object[0]);
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                return;
            }
        }
    }

    public void writeString(String s, String s1)
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
