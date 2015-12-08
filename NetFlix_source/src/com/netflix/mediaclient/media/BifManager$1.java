// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import com.netflix.mediaclient.Log;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;

// Referenced classes of package com.netflix.mediaclient.media:
//            BifManager

class this._cls0
    implements Runnable
{

    final BifManager this$0;

    public void run()
    {
        Iterator iterator = BifManager.access$000(BifManager.this).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (String)iterator.next();
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append("try url@ ").append(((String) (obj))).toString());
        }
        if (!BifManager.access$100(BifManager.this)) goto _L4; else goto _L3
_L3:
        Log.d("BifManager", "stopped");
_L2:
        return;
_L4:
        Object obj1;
        Object obj2;
        byte abyte0[];
        byte abyte1[];
        Object obj4;
        Object obj5;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        abyte1 = null;
        obj1 = null;
        obj11 = null;
        obj10 = null;
        obj9 = null;
        obj8 = null;
        obj4 = null;
        obj5 = null;
        obj7 = null;
        obj2 = obj11;
        abyte0 = ((byte []) (obj4));
        obj = (new URL(((String) (obj)))).openConnection().getInputStream();
        obj2 = obj11;
        obj1 = obj;
        abyte0 = ((byte []) (obj4));
        abyte1 = ((byte []) (obj));
        obj4 = new BufferedInputStream(((InputStream) (obj)));
        obj2 = obj7;
        obj1 = obj5;
        abyte0 = new byte[64];
        obj2 = obj7;
        obj1 = obj5;
        int i = ((BufferedInputStream) (obj4)).read(abyte0, 0, 64);
        obj2 = obj7;
        obj1 = obj5;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", (new StringBuilder()).append("read ").append(i).append(" bytes").toString());
        if (i >= 64)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        obj2 = obj7;
        obj1 = obj5;
        ((BufferedInputStream) (obj4)).close();
        obj2 = obj7;
        obj1 = obj5;
        ((InputStream) (obj)).close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BifManager", "Failed downlaod", ((Throwable) (obj)));
            }
            break MISSING_BLOCK_LABEL_302;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        throw new NullPointerException();
        if (true)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        throw new NullPointerException();
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", "bif download complete");
        }
          goto _L5
        obj2 = obj7;
        obj1 = obj5;
        abyte0 = ByteBuffer.wrap(abyte0);
        obj2 = obj7;
        obj1 = obj5;
        abyte0.order(ByteOrder.nativeOrder());
        obj2 = obj7;
        obj1 = obj5;
        BifManager.access$202(BifManager.this, abyte0.getInt(8));
        obj2 = obj7;
        obj1 = obj5;
        BifManager.access$302(BifManager.this, abyte0.getInt(12));
        obj2 = obj7;
        obj1 = obj5;
        BifManager.access$402(BifManager.this, abyte0.getInt(16));
        obj2 = obj7;
        obj1 = obj5;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_508;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", (new StringBuilder()).append("mVersion= ").append(BifManager.access$200(BifManager.this)).append(", mBifCount= ").append(BifManager.access$300(BifManager.this)).append(",mInterval= ").append(BifManager.access$400(BifManager.this)).toString());
        obj2 = obj7;
        obj1 = obj5;
        if (BifManager.access$300(BifManager.this) <= 0) goto _L7; else goto _L6
_L6:
        obj2 = obj7;
        obj1 = obj5;
        if (BifManager.access$300(BifManager.this) > 28800) goto _L7; else goto _L8
_L8:
        obj2 = obj7;
        obj1 = obj5;
        int l = (BifManager.access$300(BifManager.this) + 1) * 8;
        obj2 = obj7;
        obj1 = obj5;
        BifManager.access$502(BifManager.this, l + 64);
        obj2 = obj7;
        obj1 = obj5;
        abyte0 = new byte[l];
        int j;
        j = 0;
        i = j;
        obj2 = obj7;
        obj1 = obj5;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_648;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", (new StringBuilder()).append("try to read index ").append(l).toString());
        int i1;
        int k1;
        for (i = j; i >= l; i += i1)
        {
            break MISSING_BLOCK_LABEL_689;
        }

        obj2 = obj7;
        obj1 = obj5;
        if (!BifManager.access$100(BifManager.this))
        {
            break MISSING_BLOCK_LABEL_1755;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", "stopped");
        obj2 = obj7;
        obj1 = obj5;
        abyte0 = ByteBuffer.wrap(abyte0);
        obj2 = obj7;
        obj1 = obj5;
        abyte0.order(ByteOrder.nativeOrder());
        j = 0;
_L10:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj7;
        obj1 = obj5;
        i1 = abyte0.getInt();
        obj2 = obj7;
        obj1 = obj5;
        k1 = abyte0.getInt();
        l = i1;
        if (i1 == -1)
        {
            l = 0x7fffffff;
        }
        obj2 = obj7;
        obj1 = obj5;
        BifManager.access$600(BifManager.this).put(Integer.valueOf(l), Integer.valueOf(k1));
        j += 8;
        if (true) goto _L10; else goto _L9
        k = 1024;
        if (l - i < 1024)
        {
            k = l - i;
        }
        obj2 = obj7;
        obj1 = obj5;
        i1 = ((BufferedInputStream) (obj4)).read(abyte0, i, k);
        if (i1 == k)
        {
            break MISSING_BLOCK_LABEL_894;
        }
        obj2 = obj7;
        obj1 = obj5;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_894;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", (new StringBuilder()).append("attempt to read ").append(k).append(", actual ").append(i1).append(" bytes").toString());
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_989;
        }
        obj2 = obj7;
        obj1 = obj5;
        ((BufferedInputStream) (obj4)).close();
        obj2 = obj7;
        obj1 = obj5;
        ((InputStream) (obj)).close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BifManager", "Failed downlaod", ((Throwable) (obj)));
            }
            break MISSING_BLOCK_LABEL_956;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_944;
        }
        throw new NullPointerException();
        if (true)
        {
            break MISSING_BLOCK_LABEL_956;
        }
        throw new NullPointerException();
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", "bif download complete");
        }
          goto _L5
_L7:
        obj2 = obj7;
        obj1 = obj5;
        if (BifManager.access$300(BifManager.this) > 0) goto _L12; else goto _L11
_L11:
        obj2 = obj7;
        obj1 = obj5;
        Log.e("BifManager", (new StringBuilder()).append("Index size is not positive, but ").append(BifManager.access$300(BifManager.this)).append(". Try next IRL if exist").toString());
_L9:
        obj2 = obj7;
        abyte0 = obj8;
        obj1 = obj5;
        if (BifManager.access$600(BifManager.this).isEmpty()) goto _L14; else goto _L13
_L13:
        obj2 = obj7;
        obj1 = obj5;
        l = ((Integer)BifManager.access$600(BifManager.this).get(BifManager.access$600(BifManager.this).firstKey())).intValue();
        obj2 = obj7;
        obj1 = obj5;
        k = ((Integer)BifManager.access$600(BifManager.this).get(BifManager.access$600(BifManager.this).lastKey())).intValue();
        obj2 = obj7;
        obj1 = obj5;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_1215;
        }
        obj2 = obj7;
        obj1 = obj5;
        Log.d("BifManager", (new StringBuilder()).append("first offset ").append(l).append(", end @").append(k).toString());
        obj2 = obj7;
        obj1 = obj5;
        if (l <= BifManager.access$500(BifManager.this))
        {
            break MISSING_BLOCK_LABEL_1256;
        }
        obj2 = obj7;
        obj1 = obj5;
        ((BufferedInputStream) (obj4)).skip(l - BifManager.access$500(BifManager.this));
        obj2 = obj7;
        obj1 = obj5;
        abyte0 = BifManager.access$800(BifManager.this).openFileOutput(BifManager.access$700(BifManager.this), 0);
        obj2 = abyte0;
        obj1 = abyte0;
        abyte1 = new byte[1024];
        i = 0;
_L16:
        if (i >= k - l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = abyte0;
        obj1 = abyte0;
        j1 = ((BufferedInputStream) (obj4)).read(abyte1, 0, 1024);
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = abyte0;
        obj1 = abyte0;
        abyte0.write(abyte1, 0, j1);
        i += j1;
        if (true) goto _L16; else goto _L15
_L12:
        obj2 = obj7;
        obj1 = obj5;
        Log.e("BifManager", (new StringBuilder()).append("Index size is higher than maximal positibility ").append(BifManager.access$300(BifManager.this)).append(" > ").append(28800).toString());
          goto _L9
        obj6;
        obj1 = obj4;
        obj4 = obj2;
        abyte1 = ((byte []) (obj));
        obj = obj1;
_L20:
        obj2 = obj;
        obj1 = abyte1;
        abyte0 = ((byte []) (obj4));
        BifManager.access$902(BifManager.this, false);
        obj2 = obj;
        obj1 = abyte1;
        abyte0 = ((byte []) (obj4));
        Log.e("BifManager", "Failed downlaod", ((Throwable) (obj6)));
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_1475;
        }
        ((FileOutputStream) (obj4)).flush();
        ((FileOutputStream) (obj4)).close();
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_1485;
        }
        abyte1.close();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BifManager", "Failed downlaod", ((Throwable) (obj)));
            }
        }
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", "bif download complete");
        }
          goto _L5
_L15:
        obj2 = abyte0;
        obj1 = abyte0;
        if (!Log.isLoggable("BifManager", 3))
        {
            break MISSING_BLOCK_LABEL_1565;
        }
        obj2 = abyte0;
        obj1 = abyte0;
        Log.d("BifManager", (new StringBuilder()).append("read ").append(i).append(" bytes").toString());
        obj2 = abyte0;
        obj1 = abyte0;
        BifManager.access$902(BifManager.this, true);
_L14:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_1595;
        }
        abyte0.flush();
        abyte0.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1603;
        }
        ((InputStream) (obj)).close();
        if (obj4 != null)
        {
            try
            {
                ((BufferedInputStream) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("BifManager", "Failed downlaod", ((Throwable) (obj)));
            }
        }
        if (!Log.isLoggable("BifManager", 3)) goto _L2; else goto _L17
_L17:
        Log.d("BifManager", "bif download complete");
        return;
        obj;
        obj3 = obj1;
_L19:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_1676;
        }
        abyte0.flush();
        abyte0.close();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1686;
        }
        ((InputStream) (obj3)).close();
        if (obj2 != null)
        {
            try
            {
                ((BufferedInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("BifManager", "Failed downlaod", ((Throwable) (obj1)));
            }
        }
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", "bif download complete");
        }
        throw obj;
        obj6;
        obj2 = obj4;
        obj3 = obj;
        abyte0 = ((byte []) (obj1));
        obj = obj6;
        if (true) goto _L19; else goto _L18
_L18:
        obj6;
        obj = obj10;
        obj4 = obj9;
          goto _L20
    }

    ()
    {
        this$0 = BifManager.this;
        super();
    }
}
