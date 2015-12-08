// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.shared.util.common.L;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AudioProvider extends ContentProvider
{

    private static int a = 0;
    private UriMatcher b;

    public AudioProvider()
    {
    }

    private File a(Uri uri)
    {
        return getContext().getFileStreamPath(uri.getLastPathSegment());
    }

    private static transient void a(String s, UriMatcher urimatcher, AudioUtils.Encoding aencoding[])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                AudioUtils.Encoding encoding = aencoding[j];
                String s1 = String.valueOf("NoteToSelfOriginalAudio");
                String s2 = encoding.getExt();
                urimatcher.addURI(s, (new StringBuilder(String.valueOf(s1).length() + 12 + String.valueOf(s2).length())).append(s1).append(i).append(".").append(s2).toString(), encoding.getCode());
            }

        }

    }

    private boolean a(Uri uri, ContentValues contentvalues)
    {
        contentvalues = contentvalues.getAsByteArray("data");
        uri = a(uri);
        FileOutputStream fileoutputstream = new FileOutputStream(uri);
        fileoutputstream.write(contentvalues);
        fileoutputstream.close();
        return true;
        contentvalues;
        try
        {
            fileoutputstream.close();
            throw contentvalues;
        }
        // Misplaced declaration of an exception variable
        catch (ContentValues contentvalues)
        {
            uri = String.valueOf(uri);
            L.b("AudioProvider", (new StringBuilder(String.valueOf(uri).length() + 26)).append("Failed to open audio file ").append(uri).toString(), new Object[0]);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (ContentValues contentvalues)
        {
            uri = String.valueOf(uri);
        }
        L.b("AudioProvider", (new StringBuilder(String.valueOf(uri).length() + 27)).append("Failed to write audio file ").append(uri).toString(), new Object[0]);
        return false;
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri)
    {
        return AudioUtils.Encoding.fromCode(b.match(uri)).getMimeType();
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        if (b.match(uri) > 0)
        {
            if (a(uri, contentvalues))
            {
                return uri;
            } else
            {
                return null;
            }
        } else
        {
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 13)).append("Unknown URI: ").append(uri).toString());
        }
    }

    public boolean onCreate()
    {
        String s = String.valueOf(getContext().getPackageName()).concat(".AudioProvider");
        b = new UriMatcher(-1);
        a(s, b, new AudioUtils.Encoding[] {
            AudioUtils.Encoding.AMR, AudioUtils.Encoding.AMRWB
        });
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        if (b.match(uri) > 0)
        {
            if (!"r".equals(s))
            {
                uri = String.valueOf(s);
                if (uri.length() != 0)
                {
                    uri = "Bad mode: ".concat(uri);
                } else
                {
                    uri = new String("Bad mode: ");
                }
                throw new IllegalArgumentException(uri);
            } else
            {
                return ParcelFileDescriptor.open(a(uri), 0x10000000);
            }
        } else
        {
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 13)).append("Unknown URI: ").append(uri).toString());
        }
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        if (b.match(uri) > 0)
        {
            as = new MatrixCursor(new String[] {
                "_display_name", "_size"
            }, 1);
            long l = a(uri).length();
            as.addRow(new Object[] {
                uri.getLastPathSegment(), Long.valueOf(l)
            });
            return as;
        } else
        {
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 13)).append("Unknown URI: ").append(uri).toString());
        }
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

}
