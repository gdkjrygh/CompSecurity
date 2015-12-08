// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.spotify.mobile.android.orbit.OrbitProviderInterface;
import com.spotify.mobile.android.orbit.OrbitProviderObservable;
import com.spotify.mobile.android.orbit.OrbitProviderObserver;
import com.spotify.music.internal.provider.SpotifyProvider;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class eab
    implements eaa
{

    ContentResolver a;
    boolean b;
    private OrbitProviderInterface c;
    private List d;

    public eab(OrbitProviderInterface orbitproviderinterface, ContentResolver contentresolver, OrbitProviderObservable orbitproviderobservable)
    {
        d = new LinkedList();
        a = contentresolver;
        c = orbitproviderinterface;
        orbitproviderobservable.setObserver(new OrbitProviderObserver() {

            private eab a;

            public final void onPathUpdated(String s)
            {
                if (a.b)
                {
                    return;
                } else
                {
                    a.a.notifyChange(Uri.withAppendedPath(SpotifyProvider.b, s), null);
                    return;
                }
            }

            
            {
                a = eab.this;
                super();
            }
        });
    }

    public final int a(String s)
    {
        return c.numberOfRows(s);
    }

    public final String a(String s, String as[], int i, int j)
    {
        return c.query(s, as, i, j);
    }

    public final String a(String s, String as[], String as1[])
    {
        return c.acquirePath(s, as, as1);
    }

    public final void a()
    {
        b = true;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final void a(dvm dvm)
    {
        d.add(dvm);
    }

    public final void a(String s, String s1)
    {
        c.releasePath(s, s1);
    }

    public final void a(String s, String as[], String as1[], String as2[], String as3[])
    {
        c.update(s, as, as1, as2, as3);
    }

    public final void b(String s)
    {
        c.remove(s);
    }

    public final void b(String s, String as[], String as1[], String as2[], String as3[])
    {
        c.insert(s, as, as1, as2, as3);
    }

    public final ParcelFileDescriptor c(String s)
    {
        ParcelFileDescriptor parcelfiledescriptor;
        ParcelFileDescriptor aparcelfiledescriptor[];
        ParcelFileDescriptor parcelfiledescriptor1;
        try
        {
            aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        parcelfiledescriptor = aparcelfiledescriptor[0];
        parcelfiledescriptor1 = aparcelfiledescriptor[1];
        if (!c.writeImageToPipe(s, parcelfiledescriptor1.getFileDescriptor()))
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                parcelfiledescriptor1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        }
        try
        {
            parcelfiledescriptor1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return parcelfiledescriptor;
    }
}
