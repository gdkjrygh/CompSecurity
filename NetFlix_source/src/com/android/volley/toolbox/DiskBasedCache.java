// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DiskBasedCache
    implements Cache
{
    private static class CacheHeader
    {

        public String etag;
        public String key;
        public Map responseHeaders;
        public long serverDate;
        public long size;
        public long softTtl;
        public long ttl;

        public static CacheHeader readHeader(InputStream inputstream)
            throws IOException
        {
            CacheHeader cacheheader = new CacheHeader();
            inputstream = new ObjectInputStream(inputstream);
            if (inputstream.readByte() != 2)
            {
                throw new IOException();
            }
            cacheheader.key = inputstream.readUTF();
            cacheheader.etag = inputstream.readUTF();
            if (cacheheader.etag.equals(""))
            {
                cacheheader.etag = null;
            }
            cacheheader.serverDate = inputstream.readLong();
            cacheheader.ttl = inputstream.readLong();
            cacheheader.softTtl = inputstream.readLong();
            cacheheader.responseHeaders = readStringStringMap(inputstream);
            return cacheheader;
        }

        private static Map readStringStringMap(ObjectInputStream objectinputstream)
            throws IOException
        {
            int j = objectinputstream.readInt();
            Object obj;
            int i;
            if (j == 0)
            {
                obj = Collections.emptyMap();
            } else
            {
                obj = new HashMap(j);
            }
            for (i = 0; i < j; i++)
            {
                ((Map) (obj)).put(objectinputstream.readUTF().intern(), objectinputstream.readUTF().intern());
            }

            return ((Map) (obj));
        }

        private static void writeStringStringMap(Map map, ObjectOutputStream objectoutputstream)
            throws IOException
        {
            if (map != null)
            {
                objectoutputstream.writeInt(map.size());
                java.util.Map.Entry entry;
                for (map = map.entrySet().iterator(); map.hasNext(); objectoutputstream.writeUTF((String)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)map.next();
                    objectoutputstream.writeUTF((String)entry.getKey());
                }

            } else
            {
                objectoutputstream.writeInt(0);
            }
        }

        public com.android.volley.Cache.Entry toCacheEntry(byte abyte0[])
        {
            com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
            entry.data = abyte0;
            entry.etag = etag;
            entry.serverDate = serverDate;
            entry.ttl = ttl;
            entry.softTtl = softTtl;
            entry.responseHeaders = responseHeaders;
            return entry;
        }

        public boolean writeHeader(OutputStream outputstream)
        {
            ObjectOutputStream objectoutputstream;
            objectoutputstream = new ObjectOutputStream(outputstream);
            objectoutputstream.writeByte(2);
            objectoutputstream.writeUTF(key);
            if (etag != null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            outputstream = "";
_L1:
            try
            {
             