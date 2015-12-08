// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, FacebookSdk, ProgressNoopOutputStream, RequestOutputStream

private static class useUrlEncode
    implements ializer
{

    private boolean firstWrite;
    private final Logger logger;
    private final OutputStream outputStream;
    private boolean useUrlEncode;

    private RuntimeException getInvalidTypeError()
    {
        return new IllegalArgumentException("value is not a supported type.");
    }

    public transient void write(String s, Object aobj[])
        throws IOException
    {
        if (!useUrlEncode)
        {
            if (firstWrite)
            {
                outputStream.write("--".getBytes());
                outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                outputStream.write("\r\n".getBytes());
                firstWrite = false;
            }
            outputStream.write(String.format(s, aobj).getBytes());
            return;
        } else
        {
            outputStream.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
            return;
        }
    }

    public void writeBitmap(String s, Bitmap bitmap)
        throws IOException
    {
        writeContentDisposition(s, s, "image/png");
        bitmap.compress(android.graphics.G, 100, outputStream);
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), "<Image>");
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
            logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(abyte0.length)
            }));
        }
    }

    public void writeContentDisposition(String s, String s1, String s2)
        throws IOException
    {
        if (!useUrlEncode)
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
            return;
        } else
        {
            outputStream.write(String.format("%s=", new Object[] {
                s
            }).getBytes());
            return;
        }
    }

    public void writeContentUri(String s, Uri uri, String s1)
        throws IOException
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        writeContentDisposition(s, s, s2);
        s1 = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
        int i;
        if (outputStream instanceof ProgressNoopOutputStream)
        {
            long l = Utility.getContentSize(uri);
            ((ProgressNoopOutputStream)outputStream).addProgress(l);
            i = 0;
        } else
        {
            i = Utility.copyAndCloseInputStream(s1, outputStream) + 0;
        }
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public void writeFile(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
        throws IOException
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        writeContentDisposition(s, s, s2);
        int i;
        if (outputStream instanceof ProgressNoopOutputStream)
        {
            ((ProgressNoopOutputStream)outputStream).addProgress(parcelfiledescriptor.getStatSize());
            i = 0;
        } else
        {
            i = Utility.copyAndCloseInputStream(new android.os.oCloseInputStream(parcelfiledescriptor), outputStream) + 0;
        }
        writeLine("", new Object[0]);
        writeRecordBoundary();
        if (logger != null)
        {
            logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public transient void writeLine(String s, Object aobj[])
        throws IOException
    {
        write(s, aobj);
        if (!useUrlEncode)
        {
            write("\r\n", new Object[0]);
        }
    }

    public void writeObject(String s, Object obj, GraphRequest graphrequest)
        throws IOException
    {
        if (outputStream instanceof RequestOutputStream)
        {
            ((RequestOutputStream)outputStream).setCurrentRequest(graphrequest);
        }
        if (GraphRequest.access$000(obj))
        {
            writeString(s, GraphRequest.access$100(obj));
            return;
        }
        if (obj instanceof Bitmap)
        {
            writeBitmap(s, (Bitmap)obj);
            return;
        }
        if (obj instanceof byte[])
        {
            writeBytes(s, (byte[])(byte[])obj);
            return;
        }
        if (obj instanceof Uri)
        {
            writeContentUri(s, (Uri)obj, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor)
        {
            writeFile(s, (ParcelFileDescriptor)obj, null);
            return;
        }
        if (obj instanceof esourceWithMimeType)
        {
            graphrequest = (esourceWithMimeType)obj;
            obj = graphrequest.getResource();
            graphrequest = graphrequest.getMimeType();
            if (obj instanceof ParcelFileDescriptor)
            {
                writeFile(s, (ParcelFileDescriptor)obj, graphrequest);
                return;
            }
            if (obj instanceof Uri)
            {
                writeContentUri(s, (Uri)obj, graphrequest);
                return;
            } else
            {
                throw getInvalidTypeError();
            }
        } else
        {
            throw getInvalidTypeError();
        }
    }

    public void writeRecordBoundary()
        throws IOException
    {
        if (!useUrlEncode)
        {
            writeLine("--%s", new Object[] {
                "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
            });
            return;
        } else
        {
            outputStream.write("&".getBytes());
            return;
        }
    }

    public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
        throws IOException, JSONException
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
                GraphRequest graphrequest = (GraphRequest)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                requestoutputstream.setCurrentRequest(graphrequest);
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
                logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), jsonarray.toString());
                return;
            }
        }
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
            logger.appendKeyValue((new StringBuilder()).append("    ").append(s).toString(), s1);
        }
    }

    public esourceWithMimeType(OutputStream outputstream, Logger logger1, boolean flag)
    {
        firstWrite = true;
        useUrlEncode = false;
        outputStream = outputstream;
        logger = logger1;
        useUrlEncode = flag;
    }
}
