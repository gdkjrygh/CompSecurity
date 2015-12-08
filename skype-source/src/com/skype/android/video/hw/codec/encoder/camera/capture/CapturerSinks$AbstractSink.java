// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks

private abstract class id
    implements id, Closeable
{

    protected final isVertFlipped cb;
    private Holder currentTarget;
    private volatile float fitFactor;
    protected final int id;
    private volatile boolean isEnabled;
    private volatile boolean isHorizFlipped;
    private volatile boolean isVertFlipped;
    private Holder newTarget;
    private volatile int rotationAngle;
    protected final Object sharedMutex;
    private final Object targetSurfaceMutex = new Object();
    final CapturerSinks this$0;

    private void setTarget(Surface surface, Resolution resolution)
    {
        boolean flag1 = true;
        Object obj = targetSurfaceMutex;
        obj;
        JVM INSTR monitorenter ;
        if (newTarget == null && surface == null) goto _L2; else goto _L1
_L1:
        if (newTarget == null || newTarget.getSurface() != surface) goto _L3; else goto _L2
_L2:
        if (newTarget == null) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (resolution != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (resolution.equals(newTarget.getResolution()))
        {
            flag1 = false;
        }
        if (!(flag1 & flag)) goto _L5; else goto _L6
_L6:
        newTarget.setResolution(resolution);
        CapturerSinks.access$000(CapturerSinks.this).set(true);
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (newTarget != null && currentTarget != newTarget)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing unused ").append(newTarget).toString());
            }
            newTarget.close();
        }
        if (surface == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        surface = new Holder(surface, resolution, canReleaseSurface());
_L7:
        newTarget = surface;
        CapturerSinks.access$000(CapturerSinks.this).set(true);
          goto _L5
        surface;
        obj;
        JVM INSTR monitorexit ;
        throw surface;
        surface = null;
          goto _L7
    }

    public void attachSurface(Surface surface, Resolution resolution)
    {
        synchronized (sharedMutex)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface provided: ").append(surface).append(" at ").append(resolution).toString());
            }
            setTarget(surface, resolution);
        }
        return;
        surface;
        obj;
        JVM INSTR monitorexit ;
        throw surface;
    }

    public abstract boolean canReleaseSurface();

    public void close()
    {
        synchronized (sharedMutex)
        {
            if (newTarget == null && currentTarget != null)
            {
                if (Log.isLoggable("SLIQ", 3))
                {
                    Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
                }
                currentTarget.close();
                currentTarget = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void detachSurface()
    {
        synchronized (sharedMutex)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface abandoned").toString());
            }
            setTarget(null, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (setTarget)obj;
            if (id != ((id) (obj)).id)
            {
                return false;
            }
        }
        return true;
    }

    public float getFitFactor()
    {
        return fitFactor;
    }

    public int getId()
    {
        return id;
    }

    public int getRotationAngle()
    {
        return rotationAngle;
    }

    public Holder getTargetSurface()
    {
        Object obj = targetSurfaceMutex;
        obj;
        JVM INSTR monitorenter ;
        if (newTarget == null) goto _L2; else goto _L1
_L1:
        if (currentTarget != null && currentTarget != newTarget)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
            }
            currentTarget.close();
        }
_L4:
        Holder holder;
        currentTarget = newTarget;
        holder = currentTarget;
        return holder;
_L2:
        if (currentTarget == null) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
        }
        currentTarget.close();
          goto _L4
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract com.skype.android.video.hw.codec.encoder.camera.gl.tType getType();

    public int hashCode()
    {
        return id;
    }

    public boolean isEnabled()
    {
        return isEnabled;
    }

    public boolean isHorizFlipped()
    {
        return isHorizFlipped;
    }

    public boolean isVertFlipped()
    {
        return isVertFlipped;
    }

    public abstract void onFrameCaptured(long l);

    public void setEnabled(boolean flag)
    {
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        isEnabled = flag;
    }

    public void setFitFactor(float f)
    {
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        fitFactor = f;
    }

    public void setFlipped(boolean flag, boolean flag1)
    {
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        isHorizFlipped = flag;
        isVertFlipped = flag1;
    }

    public void setResolution(Resolution resolution)
    {
        Object obj = sharedMutex;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = targetSurfaceMutex;
        obj1;
        JVM INSTR monitorenter ;
        if (newTarget == null)
        {
            throw new IllegalStateException("no surface attached");
        }
        break MISSING_BLOCK_LABEL_41;
        resolution;
        obj1;
        JVM INSTR monitorexit ;
        throw resolution;
        resolution;
        obj;
        JVM INSTR monitorexit ;
        throw resolution;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface resolution provided: ").append(resolution).toString());
        }
        newTarget.setResolution(resolution);
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
    }

    public void setRotationAngle(int i)
    {
        CapturerSinks.access$000(CapturerSinks.this).set(true);
        rotationAngle = i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" [ ( ").append(currentTarget).append(" -> ").append(newTarget).append(" ), @").append(rotationAngle).append(" deg");
        String s;
        if (!isEnabled)
        {
            s = ", disabled";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (isHorizFlipped)
        {
            s = ", H-flipped";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (isVertFlipped)
        {
            s = ", V-flipped";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append("]").toString();
    }

    protected (Object obj,  , int i)
    {
        this$0 = CapturerSinks.this;
        super();
        sharedMutex = obj;
        cb = ;
        id = i;
    }
}
