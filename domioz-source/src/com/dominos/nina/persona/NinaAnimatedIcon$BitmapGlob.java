// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.DataInputStream;
import java.io.InputStream;

class data
{

    final int count;
    final byte data[];
    final int offsets[];
    final int sizes[];

    Bitmap getBitmap(int i, android.graphics.mapGlob mapglob)
    {
        int j = offsets[i];
        i = sizes[i];
        return BitmapFactory.decodeByteArray(data, j, i, mapglob);
    }

    (InputStream inputstream)
    {
        inputstream = new DataInputStream(inputstream);
        count = inputstream.readInt();
        offsets = new int[count];
        sizes = new int[count];
        for (int i = 0; i < count; i++)
        {
            offsets[i] = inputstream.readInt();
            sizes[i] = inputstream.readInt();
        }

        data = new byte[inputstream.readInt()];
        inputstream.read(data);
    }
}
