// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.netflix.mediaclient.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
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
import java.util.TreeMap;

// Referenced classes of package com.netflix.mediaclient.media:
//            TrickplayUrl

public class BifManager
{
    public static class Utils
    {

        public static void showBifInView(BifManager bifmanager, int i, ImageView imageview)
        {
            showBifInView(bifmanager.getIndexFrame(i), imageview);
        }

        public static void showBifInView(ByteBuffer bytebuffer, ImageView imageview)
        {
            if (imageview == null)
            {
                Log.w("BifManager", "View is null");
                return;
            }
            if (bytebuffer == null)
            {
                Log.v("BifManager", "ByteBuffer is null");
                return;
            }
            if (imageview.getVisibility() != 0)
            {
                imageview.setVisibility(0);
            }
            bytebuffer = BitmapFactory.decodeByteArray(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit());
            if (bytebuffer != null)
            {
                imageview.setImageBitmap(bytebuffer);
                return;
            } else
            {
                Log.w("BifManager", "decoded bif bitmap is null");
                return;
            }
        }

        public Utils()
        {
        }
    }


    private static final int CHUNK_SIZE = 1024;
    private static final int HEADER_SIZE = 64;
    private static final int INDEX_ENTRY_SIZE = 8;
    private static final int MAX_INDEX_SIZE = 28800;
    private static final String SAVED_FILE_NAME = "bif.tmp";
    private static final String TAG = "BifManager";
    private final Context mAppContext;
    private int mBifCount;
    private final SortedMap mBifMap;
    private volatile boolean mBifReady;
    private Thread mDownloadThread;
    private int mHeaderIndexSize;
    private int mInterval;
    private String mSavedFileName;
    private volatile boolean mStopBif;
    private final TrickplayUrl mTrickplayUrls[];
    private final ArrayList mUrlList;
    private int mVersion;

    public BifManager(Context context, String s)
    {
        mBifMap = new TreeMap();
        mInterval = 1000;
        mUrlList = new ArrayList(4);
        mSavedFileName = "bif.tmp";
        mTrickplayUrls = null;
        mSavedFileName = "mdxbif.tmp";
        mAppContext = context;
        mUrlList.add(s);
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append("load bif from  ").append(s).toString());
        }
        loadBif();
        Log.d("BifManager", "BifManager end");
    }

    public BifManager(Context context, TrickplayUrl atrickplayurl[], int i)
    {
        mBifMap = new TreeMap();
        mInterval = 1000;
        mUrlList = new ArrayList(4);
        mSavedFileName = "bif.tmp";
        mAppContext = context;
        mTrickplayUrls = atrickplayurl;
        createUrlList(atrickplayurl);
        loadBif();
        Log.d("BifManager", "BifManager end");
    }

    private void createUrlList(TrickplayUrl atrickplayurl[])
    {
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append("BifManager start, pick urls...").append(atrickplayurl).toString());
        }
        byte byte0 = -1;
        int i = 0;
label0:
        do
        {
label1:
            {
                int j = byte0;
                if (i < mTrickplayUrls.length)
                {
                    atrickplayurl = mTrickplayUrls[i].getUrl();
                    if (mTrickplayUrls[i].getAspect() != 1.0F)
                    {
                        break label1;
                    }
                    for (j = 0; j < atrickplayurl.length; j++)
                    {
                        if (Log.isLoggable("BifManager", 3))
                        {
                            Log.d("BifManager", (new StringBuilder()).append("preferred url").append(j).append(" == ").append(atrickplayurl[j]).toString());
                        }
                        mUrlList.add(atrickplayurl[j]);
                    }

                    j = i;
                }
                for (i = 0; i < mTrickplayUrls.length; i++)
                {
                    if (j == i)
                    {
                        continue;
                    }
                    atrickplayurl = mTrickplayUrls[i].getUrl();
                    for (int k = 0; k < atrickplayurl.length; k++)
                    {
                        mUrlList.add(atrickplayurl[k]);
                    }

                }

                break label0;
            }
            i++;
        } while (true);
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append(mTrickplayUrls.length).append(" TrickplayUrls entities with ").append(mUrlList.size()).append(" urls").toString());
        }
    }

    private void dumpBifBuffer(byte abyte0[], int i)
    {
        Log.d("BifManager", String.format("first foure %02x %02x %02x %2x", new Object[] {
            Byte.valueOf(abyte0[0]), Byte.valueOf(abyte0[1]), Byte.valueOf(abyte0[2]), Byte.valueOf(abyte0[3])
        }));
        Log.d("BifManager", String.format("last foure %02x %02x %02x %2x", new Object[] {
            Byte.valueOf(abyte0[i - 4]), Byte.valueOf(abyte0[i - 3]), Byte.valueOf(abyte0[i - 2]), Byte.valueOf(abyte0[i - 1])
        }));
    }

    private static void dumpHeader(byte abyte0[])
    {
        for (int i = 0; i < 64; i += 4)
        {
            Log.d("BifManager", String.format("%02x %02x %02x %2x", new Object[] {
                Byte.valueOf(abyte0[i]), Byte.valueOf(abyte0[i + 1]), Byte.valueOf(abyte0[i + 2]), Byte.valueOf(abyte0[i + 3])
            }));
        }

    }

    private void loadBif()
    {
        mStopBif = false;
        mBifReady = false;
        mDownloadThread = new Thread(new Runnable() {

            final BifManager this$0;

            public void run()
            {
                Iterator iterator = mUrlList.iterator();
_L5:
                if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
                Object obj;
                obj = (String)iterator.next();
                if (Log.isLoggable("BifManager", 3))
                {
                    Log.d("BifManager", (new StringBuilder()).append("try url@ ").append(((String) (obj))).toString());
                }
                if (!mStopBif) goto _L4; else goto _L3
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
                mVersion = abyte0.getInt(8);
                obj2 = obj7;
                obj1 = obj5;
                mBifCount = abyte0.getInt(12);
                obj2 = obj7;
                obj1 = obj5;
                mInterval = abyte0.getInt(16);
                obj2 = obj7;
                obj1 = obj5;
                if (!Log.isLoggable("BifManager", 3))
                {
                    break MISSING_BLOCK_LABEL_508;
                }
                obj2 = obj7;
                obj1 = obj5;
                Log.d("BifManager", (new StringBuilder()).append("mVersion= ").append(mVersion).append(", mBifCount= ").append(mBifCount).append(",mInterval= ").append(mInterval).toString());
                obj2 = obj7;
                obj1 = obj5;
                if (mBifCount <= 0) goto _L7; else goto _L6
_L6:
                obj2 = obj7;
                obj1 = obj5;
                if (mBifCount > 28800) goto _L7; else goto _L8
_L8:
                obj2 = obj7;
                obj1 = obj5;
                int l = (mBifCount + 1) * 8;
                obj2 = obj7;
                obj1 = obj5;
                mHeaderIndexSize = l + 64;
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
                if (!mStopBif)
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
                mBifMap.put(Integer.valueOf(l), Integer.valueOf(k1));
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
                if (mBifCount > 0) goto _L12; else goto _L11
_L11:
                obj2 = obj7;
                obj1 = obj5;
                Log.e("BifManager", (new StringBuilder()).append("Index size is not positive, but ").append(mBifCount).append(". Try next IRL if exist").toString());
_L9:
                obj2 = obj7;
                abyte0 = obj8;
                obj1 = obj5;
                if (mBifMap.isEmpty()) goto _L14; else goto _L13
_L13:
                obj2 = obj7;
                obj1 = obj5;
                l = ((Integer)mBifMap.get(mBifMap.firstKey())).intValue();
                obj2 = obj7;
                obj1 = obj5;
                k = ((Integer)mBifMap.get(mBifMap.lastKey())).intValue();
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
                if (l <= mHeaderIndexSize)
                {
                    break MISSING_BLOCK_LABEL_1256;
                }
                obj2 = obj7;
                obj1 = obj5;
                ((BufferedInputStream) (obj4)).skip(l - mHeaderIndexSize);
                obj2 = obj7;
                obj1 = obj5;
                abyte0 = mAppContext.openFileOutput(mSavedFileName, 0);
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
                Log.e("BifManager", (new StringBuilder()).append("Index size is higher than maximal positibility ").append(mBifCount).append(" > ").append(28800).toString());
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
                mBifReady = false;
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
                mBifReady = true;
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

            
            {
                this$0 = BifManager.this;
                super();
            }
        }, "BifManagerThread");
        if (mDownloadThread != null)
        {
            mDownloadThread.start();
        }
    }

    public ByteBuffer getIndexFrame(int i)
    {
        byte abyte0[];
        int j;
        int k;
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append("get ").append(i).toString());
        }
        if (!mBifReady)
        {
            return null;
        }
        i = ((mInterval + i) - 1) / mInterval;
        SortedMap sortedmap = mBifMap.headMap(Integer.valueOf(i));
        SortedMap sortedmap1 = mBifMap.tailMap(Integer.valueOf(i));
        if (sortedmap.isEmpty() || sortedmap1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        i = ((Integer)sortedmap.get(sortedmap.lastKey())).intValue();
        j = ((Integer)sortedmap1.get(sortedmap1.firstKey())).intValue() - i;
        k = mHeaderIndexSize;
        abyte0 = new byte[j];
        ByteBuffer bytebuffer;
        FileInputStream fileinputstream = mAppContext.openFileInput(mSavedFileName);
        fileinputstream.skip(i - k);
        k = fileinputstream.read(abyte0, 0, j);
        if (Log.isLoggable("BifManager", 3))
        {
            Log.d("BifManager", (new StringBuilder()).append("return @").append(i).append(", with size ").append(j).append(", read ").append(k).toString());
        }
        bytebuffer = ByteBuffer.wrap(abyte0, 0, j);
        bytebuffer.position(0);
        bytebuffer.limit(j);
        fileinputstream.close();
        return bytebuffer;
        Exception exception;
        exception;
        Log.e("BifManager", "Failed reading bif ", exception);
        return null;
    }

    public boolean isBifReady()
    {
        return mBifReady;
    }

    public void release()
    {
        mStopBif = true;
        mAppContext.deleteFile(mSavedFileName);
    }





/*
    static int access$202(BifManager bifmanager, int i)
    {
        bifmanager.mVersion = i;
        return i;
    }

*/



/*
    static int access$302(BifManager bifmanager, int i)
    {
        bifmanager.mBifCount = i;
        return i;
    }

*/



/*
    static int access$402(BifManager bifmanager, int i)
    {
        bifmanager.mInterval = i;
        return i;
    }

*/



/*
    static int access$502(BifManager bifmanager, int i)
    {
        bifmanager.mHeaderIndexSize = i;
        return i;
    }

*/





/*
    static boolean access$902(BifManager bifmanager, boolean flag)
    {
        bifmanager.mBifReady = flag;
        return flag;
    }

*/
}
