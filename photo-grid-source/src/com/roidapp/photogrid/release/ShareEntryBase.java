// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.common.bn;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            rf, qv, ig

public class ShareEntryBase extends FragmentActivity
{

    protected boolean a;
    protected boolean b;
    protected boolean c;

    public ShareEntryBase()
    {
        a = false;
        b = false;
        c = true;
    }

    protected final String a(Uri uri)
    {
        Object obj;
        if (uri.toString().startsWith("file:///"))
        {
            obj = Uri.decode(uri.getEncodedPath());
        } else
        {
            Cursor cursor;
            try
            {
                cursor = getContentResolver().query(uri, new String[] {
                    "_data"
                }, null, null, null);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return null;
            }
            if (cursor != null)
            {
                if (cursor.getCount() == 0)
                {
                    if (cursor != null)
                    {
                        cursor.close();
                    }
                    return null;
                }
                int i;
                try
                {
                    i = cursor.getColumnIndexOrThrow("_data");
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    uri.printStackTrace();
                    if (cursor != null)
                    {
                        cursor.close();
                    }
                    return null;
                }
                if (i == -1)
                {
                    if (cursor != null)
                    {
                        cursor.close();
                    }
                    return null;
                }
                cursor.moveToFirst();
                obj = cursor.getString(i);
                uri = ((Uri) (obj));
                if (obj == null)
                {
                    return null;
                }
            } else
            {
                uri = "";
            }
            obj = uri;
            if (cursor != null)
            {
                cursor.close();
                obj = uri;
            }
        }
        uri = ((String) (obj)).toLowerCase(Locale.ENGLISH);
        if (uri.endsWith(".png") || uri.endsWith(".jpg") || uri.endsWith(".gif") || uri.endsWith(".bmp") || uri.endsWith(".jpeg") || uri.endsWith(".mpo") || bn.a(uri))
        {
            if (com.roidapp.photogrid.release.rf.b(((String) (obj))))
            {
                return ((String) (obj));
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    protected final void a()
    {
        Object obj = new android.app.AlertDialog.Builder(this);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(getResources().getString(0x7f0702e7));
        ((android.app.AlertDialog.Builder) (obj)).setMessage(getResources().getString(0x7f070181));
        ((android.app.AlertDialog.Builder) (obj)).setCancelable(false);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(getResources().getString(0x7f07024f), new qv(this));
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setCancelable(false);
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).show();
    }

    protected final ig[] a(ArrayList arraylist, int i)
    {
        Object obj;
        ArrayList arraylist1;
        int j;
        arraylist1 = new ArrayList();
        j = 0;
        obj = null;
_L12:
        if (j >= i) goto _L2; else goto _L1
_L1:
        Object obj1 = (Uri)arraylist.get(j);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (!((Uri) (obj1)).toString().startsWith("file:///")) goto _L6; else goto _L5
_L5:
        String s;
        s = Uri.decode(((Uri) (obj1)).getEncodedPath());
        obj1 = obj;
_L10:
        String s1 = s.toLowerCase(Locale.ENGLISH);
        if (!s1.endsWith(".png") && !s1.endsWith(".jpg") && !s1.endsWith(".gif") && !s1.endsWith(".bmp") && !s1.endsWith(".jpeg") && !s1.endsWith(".mpo"))
        {
            obj = obj1;
            if (!bn.a(s1))
            {
                break; /* Loop/switch isn't completed */
            }
        }
        obj = obj1;
        if (!com.roidapp.photogrid.release.rf.b(s))
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist1.add(new ig(s));
        obj = obj1;
        if (arraylist1.size() != 15)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = ((ArrayList) (obj1));
        if (j + 1 < i)
        {
            b = true;
            arraylist = ((ArrayList) (obj1));
        }
_L8:
        if (arraylist != null)
        {
            arraylist.close();
        }
        int k;
        if (arraylist1.size() > 0)
        {
            arraylist = (ig[])arraylist1.toArray(new ig[0]);
        } else
        {
            arraylist = null;
        }
        return arraylist;
_L6:
        if ("com.google.android.apps.docs.storage.legacy".equals(((Uri) (obj1)).getAuthority()))
        {
            c = false;
            a();
            return null;
        }
        if (!"com.google.android.apps.photos.contentprovider".equals(((Uri) (obj1)).getAuthority()))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        try
        {
            obj1 = Uri.decode(((Uri) (obj1)).toString());
            k = ((String) (obj1)).indexOf("content://media/");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
            break; /* Loop/switch isn't completed */
        }
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = Uri.parse(((String) (obj1)).substring(k, ((String) (obj1)).indexOf("/ACTUAL")));
        try
        {
            obj1 = getContentResolver().query(((Uri) (obj1)), new String[] {
                "_data"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
            break; /* Loop/switch isn't completed */
        }
        if (obj1 != null)
        {
            obj = obj1;
            if (((Cursor) (obj1)).getCount() == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                k = ((Cursor) (obj1)).getColumnIndexOrThrow("_data");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                obj = obj1;
                break; /* Loop/switch isn't completed */
            }
            if (k != -1)
            {
                ((Cursor) (obj1)).moveToFirst();
                s = ((Cursor) (obj1)).getString(k);
                obj = obj1;
                if (s == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        a = true;
        break; /* Loop/switch isn't completed */
_L2:
        arraylist = ((ArrayList) (obj));
        if (true) goto _L8; else goto _L7
_L7:
        s = "";
        if (true) goto _L10; else goto _L9
_L9:
        j++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void onStart()
    {
        super.onStart();
        com.roidapp.baselib.c.b.b(this);
    }

    protected void onStop()
    {
        super.onStop();
        com.roidapp.baselib.c.b.c(this);
    }
}
