// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.Linker;
import org.chromium.content.app.ChromiumLinkerParams;
import org.chromium.content.app.PrivilegedProcessService;
import org.chromium.content.app.SandboxedProcessService;
import org.chromium.content.common.IChildProcessCallback;
import org.chromium.content.common.SurfaceWrapper;

// Referenced classes of package org.chromium.content.browser:
//            BindingManagerImpl, ChildProcessConnection, ChildProcessConnectionImpl, BindingManager, 
//            FileDescriptorInfo

public class ChildProcessLauncher
{
    private static class ChildConnectionAllocator
    {

        static final boolean $assertionsDisabled;
        private Class mChildClass;
        private final ChildProcessConnection mChildProcessConnections[];
        private final Object mConnectionLock = new Object();
        private final ArrayList mFreeConnectionIndices;
        private final boolean mInSandbox;

        public ChildProcessConnection allocate(Context context, ChildProcessConnection.DeathCallback deathcallback, ChromiumLinkerParams chromiumlinkerparams)
        {
            Object obj = mConnectionLock;
            obj;
            JVM INSTR monitorenter ;
            if (!mFreeConnectionIndices.isEmpty())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            Log.e("ChildProcessLauncher", "Ran out of services to allocate.");
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_47;
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
            obj;
            JVM INSTR monitorexit ;
            return null;
            int i = ((Integer)mFreeConnectionIndices.remove(0)).intValue();
            if (!$assertionsDisabled && mChildProcessConnections[i] != null)
            {
                throw new AssertionError();
            }
            mChildProcessConnections[i] = new ChildProcessConnectionImpl(context, i, mInSandbox, deathcallback, mChildClass, chromiumlinkerparams);
            Log.d("ChildProcessLauncher", (new StringBuilder()).append("Allocator allocated a connection, sandbox: ").append(mInSandbox).append(", slot: ").append(i).toString());
            context = mChildProcessConnections[i];
            obj;
            JVM INSTR monitorexit ;
            return context;
        }

        int allocatedConnectionsCountForTesting()
        {
            return mChildProcessConnections.length - mFreeConnectionIndices.size();
        }

        public void free(ChildProcessConnection childprocessconnection)
        {
            Object obj = mConnectionLock;
            obj;
            JVM INSTR monitorenter ;
            int j;
            j = childprocessconnection.getServiceNumber();
            if (mChildProcessConnections[j] == childprocessconnection)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            if (mChildProcessConnections[j] != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            int i = -1;
_L1:
            Log.e("ChildProcessLauncher", (new StringBuilder()).append("Unable to find connection to free in slot: ").append(j).append(" already occupied by service: ").append(i).toString());
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_196;
            childprocessconnection;
            obj;
            JVM INSTR monitorexit ;
            throw childprocessconnection;
            i = mChildProcessConnections[j].getServiceNumber();
              goto _L1
            mChildProcessConnections[j] = null;
            if (!$assertionsDisabled && mFreeConnectionIndices.contains(Integer.valueOf(j)))
            {
                throw new AssertionError();
            }
            mFreeConnectionIndices.add(Integer.valueOf(j));
            Log.d("ChildProcessLauncher", (new StringBuilder()).append("Allocator freed a connection, sandbox: ").append(mInSandbox).append(", slot: ").append(j).toString());
            obj;
            JVM INSTR monitorexit ;
        }

        public void setServiceClass(Class class1)
        {
            mChildClass = class1;
        }

        static 
        {
            boolean flag;
            if (!org/chromium/content/browser/ChildProcessLauncher.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public ChildConnectionAllocator(boolean flag)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 20;
            } else
            {
                byte0 = 3;
            }
            mChildProcessConnections = new ChildProcessConnectionImpl[byte0];
            mFreeConnectionIndices = new ArrayList(byte0);
            for (int i = 0; i < byte0; i++)
            {
                mFreeConnectionIndices.add(Integer.valueOf(i));
            }

            Object obj;
            if (flag)
            {
                obj = org/chromium/content/app/SandboxedProcessService;
            } else
            {
                obj = org/chromium/content/app/PrivilegedProcessService;
            }
            setServiceClass(((Class) (obj)));
            mInSandbox = flag;
        }
    }


    static final boolean $assertionsDisabled;
    static final int CALLBACK_FOR_GPU_PROCESS = 1;
    static final int CALLBACK_FOR_RENDERER_PROCESS = 2;
    static final int CALLBACK_FOR_UNKNOWN_PROCESS = 0;
    static final int MAX_REGISTERED_PRIVILEGED_SERVICES = 3;
    static final int MAX_REGISTERED_SANDBOXED_SERVICES = 20;
    private static final int NULL_PROCESS_HANDLE = 0;
    private static final String SWITCH_GPU_PROCESS = "gpu-process";
    private static final String SWITCH_PPAPI_BROKER_PROCESS = "ppapi-broker";
    private static final String SWITCH_PROCESS_TYPE = "type";
    private static final String SWITCH_RENDERER_PROCESS = "renderer";
    private static final String TAG = "ChildProcessLauncher";
    private static BindingManager sBindingManager = BindingManagerImpl.createBindingManager();
    private static boolean sConnectionAllocated = false;
    private static boolean sLinkerInitialized = false;
    private static long sLinkerLoadAddress = 0L;
    private static final ChildConnectionAllocator sPrivilegedChildConnectionAllocator = new ChildConnectionAllocator(false);
    private static final ChildConnectionAllocator sSandboxedChildConnectionAllocator = new ChildConnectionAllocator(true);
    private static Map sServiceMap = new ConcurrentHashMap();
    private static ChildProcessConnection sSpareSandboxedConnection = null;
    private static Map sSurfaceTextureSurfaceMap = new ConcurrentHashMap();
    private static Map sViewSurfaceMap = new ConcurrentHashMap();

    public ChildProcessLauncher()
    {
    }

    private static ChildProcessConnection allocateBoundConnection(Context context, String as[], boolean flag)
    {
        context = allocateConnection(context, flag, getLinkerParamsForNewConnection());
        if (context != null)
        {
            context.start(as);
        }
        return context;
    }

    static ChildProcessConnection allocateBoundConnectionForTesting(Context context)
    {
        return allocateBoundConnection(context, null, true);
    }

    private static ChildProcessConnection allocateConnection(Context context, boolean flag, ChromiumLinkerParams chromiumlinkerparams)
    {
        ChildProcessConnection.DeathCallback deathcallback = new ChildProcessConnection.DeathCallback() {

            public void onChildProcessDied(ChildProcessConnection childprocessconnection)
            {
                if (childprocessconnection.getPid() != 0)
                {
                    ChildProcessLauncher.stop(childprocessconnection.getPid());
                    return;
                } else
                {
                    ChildProcessLauncher.freeConnection(childprocessconnection);
                    return;
                }
            }

        };
        sConnectionAllocated = true;
        return getConnectionAllocator(flag).allocate(context, deathcallback, chromiumlinkerparams);
    }

    static int allocatedConnectionsCountForTesting()
    {
        return sSandboxedChildConnectionAllocator.allocatedConnectionsCountForTesting();
    }

    static int connectedServicesCountForTesting()
    {
        return sServiceMap.size();
    }

    public static boolean crashProcessForTesting(int i)
    {
        if (sServiceMap.get(Integer.valueOf(i)) == null)
        {
            return false;
        }
        try
        {
            ((ChildProcessConnectionImpl)sServiceMap.get(Integer.valueOf(i))).crashServiceForTesting();
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        return true;
    }

    private static IChildProcessCallback createCallback(int i, int j)
    {
        return new org.chromium.content.common.IChildProcessCallback.Stub(j, i) {

            static final boolean $assertionsDisabled;
            final int val$callbackType;
            final int val$childProcessId;

            public void establishSurfacePeer(int k, Surface surface, int l, int i1)
            {
                if (callbackType != 1)
                {
                    Log.e("ChildProcessLauncher", "Illegal callback for non-GPU process.");
                    return;
                } else
                {
                    ChildProcessLauncher.nativeEstablishSurfacePeer(k, surface, l, i1);
                    return;
                }
            }

            public SurfaceWrapper getSurfaceTextureSurface(int k, int l)
            {
                if (callbackType != 2)
                {
                    Log.e("ChildProcessLauncher", "Illegal callback for non-renderer process.");
                    return null;
                }
                if (l != childProcessId)
                {
                    Log.e("ChildProcessLauncher", "Illegal secondaryId for renderer process.");
                    return null;
                }
                Object obj = new Pair(Integer.valueOf(k), Integer.valueOf(l));
                obj = (Surface)ChildProcessLauncher.sSurfaceTextureSurfaceMap.remove(obj);
                if (obj == null)
                {
                    Log.e("ChildProcessLauncher", "Invalid Id for surface texture.");
                    return null;
                }
                if (!$assertionsDisabled && !((Surface) (obj)).isValid())
                {
                    throw new AssertionError();
                } else
                {
                    return new SurfaceWrapper(((Surface) (obj)));
                }
            }

            public SurfaceWrapper getViewSurface(int k)
            {
                if (callbackType != 1)
                {
                    Log.e("ChildProcessLauncher", "Illegal callback for non-GPU process.");
                    return null;
                }
                Surface surface = (Surface)ChildProcessLauncher.sViewSurfaceMap.get(Integer.valueOf(k));
                if (surface == null)
                {
                    Log.e("ChildProcessLauncher", "Invalid surfaceId.");
                    return null;
                }
                if (!$assertionsDisabled && !surface.isValid())
                {
                    throw new AssertionError();
                } else
                {
                    return new SurfaceWrapper(surface);
                }
            }

            static 
            {
                boolean flag;
                if (!org/chromium/content/browser/ChildProcessLauncher.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                callbackType = i;
                childProcessId = j;
                super();
            }
        };
    }

    private static void freeConnection(ChildProcessConnection childprocessconnection)
    {
        getConnectionAllocator(childprocessconnection.isInSandbox()).free(childprocessconnection);
    }

    private static ChildConnectionAllocator getConnectionAllocator(boolean flag)
    {
        if (flag)
        {
            return sSandboxedChildConnectionAllocator;
        } else
        {
            return sPrivilegedChildConnectionAllocator;
        }
    }

    private static ChromiumLinkerParams getLinkerParamsForNewConnection()
    {
        if (!sLinkerInitialized)
        {
            if (Linker.isUsed())
            {
                sLinkerLoadAddress = Linker.getBaseLoadAddress();
                if (sLinkerLoadAddress == 0L)
                {
                    Log.i("ChildProcessLauncher", "Shared RELRO support disabled!");
                }
            }
            sLinkerInitialized = true;
        }
        if (sLinkerLoadAddress == 0L)
        {
            return null;
        } else
        {
            return new ChromiumLinkerParams(sLinkerLoadAddress, true, Linker.getTestRunnerClassName());
        }
    }

    private static String getSwitchValue(String as[], String s)
    {
        if (as != null && s != null)
        {
            s = (new StringBuilder()).append("--").append(s).append("=").toString();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = as[i];
                if (s1 != null && s1.startsWith(s))
                {
                    return s1.substring(s.length());
                }
                i++;
            }
        }
        return null;
    }

    private static boolean isOomProtected(int i)
    {
        return sBindingManager.isOomProtected(i);
    }

    static void logPidWarning(int i, String s)
    {
        if (i > 0 && !nativeIsSingleProcess())
        {
            Log.w("ChildProcessLauncher", (new StringBuilder()).append(s).append(", pid=").append(i).toString());
        }
    }

    private static native void nativeEstablishSurfacePeer(int i, Surface surface, int j, int k);

    private static native boolean nativeIsSingleProcess();

    private static native void nativeOnChildProcessStarted(long l, int i);

    public static void onBroughtToForeground()
    {
        sBindingManager.onBroughtToForeground();
    }

    public static void onSentToBackground()
    {
        sBindingManager.onSentToBackground();
    }

    private static void registerSurfaceTexture(int i, int j, SurfaceTexture surfacetexture)
    {
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(j));
        sSurfaceTextureSurfaceMap.put(pair, new Surface(surfacetexture));
    }

    private static void registerViewSurface(int i, Surface surface)
    {
        sViewSurfaceMap.put(Integer.valueOf(i), surface);
    }

    public static void setBindingManagerForTesting(BindingManager bindingmanager)
    {
        sBindingManager = bindingmanager;
    }

    public static void setChildProcessClass(Class class1, Class class2)
    {
        if (!$assertionsDisabled && sConnectionAllocated)
        {
            throw new AssertionError();
        } else
        {
            sSandboxedChildConnectionAllocator.setServiceClass(class1);
            sPrivilegedChildConnectionAllocator.setServiceClass(class2);
            return;
        }
    }

    public static void setInForeground(int i, boolean flag)
    {
        sBindingManager.setInForeground(i, flag);
    }

    static void start(Context context, String as[], int i, int ai[], int ai1[], boolean aflag[], long l)
    {
        FileDescriptorInfo afiledescriptorinfo[];
        boolean flag;
        boolean flag1;
        TraceEvent.begin();
        if (!$assertionsDisabled && (ai.length != ai1.length || ai1.length != aflag.length))
        {
            throw new AssertionError();
        }
        afiledescriptorinfo = new FileDescriptorInfo[ai1.length];
        for (int j = 0; j < ai1.length; j++)
        {
            afiledescriptorinfo[j] = new FileDescriptorInfo(ai[j], ai1[j], aflag[j]);
        }

        if (!$assertionsDisabled && l == 0L)
        {
            throw new AssertionError();
        }
        flag = false;
        flag1 = true;
        ai = getSwitchValue(as, "type");
        if (!"renderer".equals(ai)) goto _L2; else goto _L1
_L1:
        byte byte0 = 2;
_L4:
        ai = null;
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorenter ;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        ai = sSpareSandboxedConnection;
        sSpareSandboxedConnection = null;
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorexit ;
        ai1 = ai;
        if (ai == null)
        {
            context = allocateBoundConnection(context, as, flag1);
            ai1 = context;
            if (context == null)
            {
                nativeOnChildProcessStarted(l, 0);
                Log.e("ChildProcessLauncher", "Allocation of new service failed.");
                TraceEvent.end();
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if ("gpu-process".equals(ai))
        {
            byte0 = 1;
        } else
        {
            byte0 = flag;
            if ("ppapi-broker".equals(ai))
            {
                flag1 = false;
                byte0 = flag;
            }
        }
        if (true) goto _L4; else goto _L3
        context;
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorexit ;
        throw context;
_L3:
        Log.d("ChildProcessLauncher", (new StringBuilder()).append("Setting up connection to process: slot=").append(ai1.getServiceNumber()).toString());
        triggerConnectionSetup(ai1, as, i, afiledescriptorinfo, byte0, l);
        TraceEvent.end();
        return;
    }

    static void stop(int i)
    {
        Log.d("ChildProcessLauncher", (new StringBuilder()).append("stopping child connection: pid=").append(i).toString());
        ChildProcessConnection childprocessconnection = (ChildProcessConnection)sServiceMap.remove(Integer.valueOf(i));
        if (childprocessconnection == null)
        {
            logPidWarning(i, "Tried to stop non-existent connection");
            return;
        } else
        {
            sBindingManager.clearConnection(i);
            childprocessconnection.stop();
            freeConnection(childprocessconnection);
            return;
        }
    }

    static void triggerConnectionSetup(ChildProcessConnection childprocessconnection, String as[], int i, FileDescriptorInfo afiledescriptorinfo[], int j, long l)
    {
        ChildProcessConnection.ConnectionCallback connectioncallback = new ChildProcessConnection.ConnectionCallback(l, childprocessconnection) {

            final long val$clientContext;
            final ChildProcessConnection val$connection;

            public void onConnected(int k)
            {
                Log.d("ChildProcessLauncher", (new StringBuilder()).append("on connect callback, pid=").append(k).append(" context=").append(clientContext).toString());
                if (k != 0)
                {
                    ChildProcessLauncher.sBindingManager.addNewConnection(k, connection);
                    ChildProcessLauncher.sServiceMap.put(Integer.valueOf(k), connection);
                }
                if (clientContext != 0L)
                {
                    ChildProcessLauncher.nativeOnChildProcessStarted(clientContext, k);
                }
            }

            
            {
                clientContext = l;
                connection = childprocessconnection;
                super();
            }
        };
        childprocessconnection.setupConnection(as, afiledescriptorinfo, createCallback(i, j), connectioncallback, Linker.getSharedRelros());
    }

    private static void unregisterSurfaceTexture(int i, int j)
    {
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(j));
        sSurfaceTextureSurfaceMap.remove(pair);
    }

    private static void unregisterViewSurface(int i)
    {
        sViewSurfaceMap.remove(Integer.valueOf(i));
    }

    public static void warmUp(Context context)
    {
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_29;
        context;
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorexit ;
        throw context;
        if (sSpareSandboxedConnection == null)
        {
            sSpareSandboxedConnection = allocateBoundConnection(context, null, true);
        }
        org/chromium/content/browser/ChildProcessLauncher;
        JVM INSTR monitorexit ;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ChildProcessLauncher.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }







}
