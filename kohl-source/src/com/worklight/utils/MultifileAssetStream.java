// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Locale;
import java.util.Vector;

public class MultifileAssetStream extends SequenceInputStream
{

    public MultifileAssetStream(String s, AssetManager assetmanager)
        throws IOException
    {
        super(getAssetFileStreams(s, assetmanager).elements());
    }

    private static String getAssetFileName(String s, int i)
    {
        return (new StringBuilder()).append(s).append(".").append(String.format(Locale.US, "%03d", new Object[] {
            Integer.valueOf(i)
        })).toString();
    }

    private static Vector getAssetFileStreams(String s, AssetManager assetmanager)
        throws IOException
    {
        boolean flag = true;
        int i = 1;
        Vector vector = new Vector();
        while (flag) 
        {
            InputStream inputstream1 = getFileInputStream(getAssetFileName(s, i), assetmanager);
            InputStream inputstream = inputstream1;
            if (i == 0)
            {
                inputstream = inputstream1;
                if (inputstream1 == null)
                {
                    inputstream = getFileInputStream(s, assetmanager);
                }
            }
            if (inputstream != null)
            {
                vector.add(inputstream);
                i++;
            } else
            {
                flag = false;
            }
        }
        if (vector.size() == 0)
        {
            throw new IOException("Unable to open any files with that base name");
        } else
        {
            return vector;
        }
    }

    private static InputStream getFileInputStream(String s, AssetManager assetmanager)
    {
        try
        {
            s = assetmanager.open(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
