// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.chromium.ui.base.WindowAndroid;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore, ContentReadbackHandler

public class ContentViewRenderView extends FrameLayout
{
    public static final class CompositingSurfaceType extends Enum
    {

        private static final CompositingSurfaceType $VALUES[];
        public static final CompositingSurfaceType SURFACE_VIEW;
        public static final CompositingSurfaceType TEXTURE_VIEW;

        public static CompositingSurfaceType valueOf(String s)
        {
            return (CompositingSurfaceType)Enum.valueOf(org/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType, s);
        }

        public static CompositingSurfaceType[] values()
        {
            return (CompositingSurfaceType[])$VALUES.clone();
        }

        static 
        {
            SURFACE_VIEW = new CompositingSurfaceType("SURFACE_VIEW", 0);
            TEXTURE_VIEW = new CompositingSurfaceType("TEXTURE_VIEW", 1);
            $VALUES = (new CompositingSurfaceType[] {
                SURFACE_VIEW, TEXTURE_VIEW
            });
        }

        private CompositingSurfaceType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface FirstRenderedFrameListener
    {

        public abstract void onFirstFrameReceived();
    }


    static final boolean $assertionsDisabled;
    private CompositingSurfaceType mCompositingSurfaceType;
    private ContentReadbackHandler mContentReadbackHandler;
    protected ContentViewCore mContentViewCore;
    private boolean mFirstFrameReceived;
    private FirstRenderedFrameListener mFirstRenderedFrameListener;
    private long mNativeContentViewRenderView;
    private Surface mSurface;
    private android.view.SurfaceHolder.Callback mSurfaceCallback;
    private final SurfaceView mSurfaceView;
    private TextureView mTextureView;

    public ContentViewRenderView(Context context)
    {
        this(context, CompositingSurfaceType.SURFACE_VIEW);
    }

    public ContentViewRenderView(Context context, CompositingSurfaceType compositingsurfacetype)
    {
        super(context);
        mCompositingSurfaceType = compositingsurfacetype;
        if (compositingsurfacetype == CompositingSurfaceType.TEXTURE_VIEW)
        {
            initTextureView(context);
            addView(mTextureView, new android.widget.FrameLayout.LayoutParams(-1, -1));
            mSurfaceView = null;
            mSurfaceCallback = null;
            return;
        } else
        {
            mSurfaceView = createSurfaceView(getContext());
            mSurfaceView.setZOrderMediaOverlay(true);
            setSurfaceViewBackgroundColor(-1);
            addView(mSurfaceView, new android.widget.FrameLayout.LayoutParams(-1, -1));
            mSurfaceView.setVisibility(8);
            return;
        }
    }

    private void initTextureView(Context context)
    {
        mTextureView = new TextureView(context);
        mTextureView.setBackgroundColor(-1);
        mTextureView.setSurfaceTextureListener(new android.view.TextureView.SurfaceTextureListener() {

            static final boolean $assertionsDisabled;
            final ContentViewRenderView this$0;

            public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
            {
                if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
                {
                    throw new AssertionError();
                } else
                {
                    mSurface = new Surface(surfacetexture);
                    nativeSurfaceCreated(mNativeContentViewRenderView);
                    onSurfaceTextureSizeChanged(surfacetexture, i, j);
                    onReadyToRender();
                    return;
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
            {
                if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
                {
                    throw new AssertionError();
                } else
                {
                    nativeSurfaceDestroyed(mNativeContentViewRenderView);
                    mSurface.release();
                    mSurface = null;
                    return true;
                }
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
            {
                if (!$assertionsDisabled && (mNativeContentViewRenderView == 0L || mSurface == null))
                {
                    throw new AssertionError();
                }
                if (!$assertionsDisabled && surfacetexture != mTextureView.getSurfaceTexture())
                {
                    throw new AssertionError();
                }
                if (!$assertionsDisabled && mSurface == null)
                {
                    throw new AssertionError();
                }
                nativeSurfaceChanged(mNativeContentViewRenderView, 1, i, j, mSurface);
                if (mContentViewCore != null)
                {
                    mContentViewCore.onPhysicalBackingSizeChanged(i, j);
                }
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
            {
            }

            static 
            {
                boolean flag;
                if (!org/chromium/content/browser/ContentViewRenderView.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

            
            {
                this$0 = ContentViewRenderView.this;
                super();
            }
        });
    }

    private native void nativeDestroy(long l);

    private native long nativeGetUIResourceProvider(long l);

    private native long nativeInit(long l);

    private native void nativeSetCurrentContentViewCore(long l, long l1);

    private native void nativeSetLayerTreeBuildHelper(long l, long l1);

    private native void nativeSetNeedsComposite(long l);

    private native void nativeSetOverlayVideoMode(long l, boolean flag);

    private native void nativeSurfaceChanged(long l, int i, int j, int k, Surface surface);

    private native void nativeSurfaceCreated(long l);

    private native void nativeSurfaceDestroyed(long l);

    private void onSwapBuffersCompleted()
    {
        if (!mFirstFrameReceived && mContentViewCore != null && mContentViewCore.isReady())
        {
            mFirstFrameReceived = true;
            if (mFirstRenderedFrameListener != null)
            {
                mFirstRenderedFrameListener.onFirstFrameReceived();
            }
        }
        while (mCompositingSurfaceType == CompositingSurfaceType.TEXTURE_VIEW || mSurfaceView.getBackground() == null) 
        {
            return;
        }
        post(new Runnable() {

            final ContentViewRenderView this$0;

            public void run()
            {
                mSurfaceView.setBackgroundResource(0);
            }

            
            {
                this$0 = ContentViewRenderView.this;
                super();
            }
        });
    }

    protected SurfaceView createSurfaceView(Context context)
    {
        return new SurfaceView(context);
    }

    public void destroy()
    {
        mContentReadbackHandler.destroy();
        mContentReadbackHandler = null;
        if (mCompositingSurfaceType == CompositingSurfaceType.TEXTURE_VIEW)
        {
            mTextureView.setSurfaceTextureListener(null);
            if (mSurface != null)
            {
                mSurface.release();
                mSurface = null;
            }
        } else
        {
            mSurfaceView.getHolder().removeCallback(mSurfaceCallback);
        }
        nativeDestroy(mNativeContentViewRenderView);
        mNativeContentViewRenderView = 0L;
    }

    public ContentReadbackHandler getContentReadbackHandler()
    {
        return mContentReadbackHandler;
    }

    public long getUIResourceProvider()
    {
        return nativeGetUIResourceProvider(mNativeContentViewRenderView);
    }

    public boolean isInitialized()
    {
        return mSurfaceView.getHolder().getSurface() != null || mSurface != null;
    }

    protected void onCompositorLayout()
    {
    }

    public void onNativeLibraryLoaded(WindowAndroid windowandroid)
    {
        if (!$assertionsDisabled && windowandroid == null)
        {
            throw new AssertionError();
        }
        mNativeContentViewRenderView = nativeInit(windowandroid.getNativePointer());
        if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
        {
            throw new AssertionError();
        }
        mContentReadbackHandler = new ContentReadbackHandler() {

            final ContentViewRenderView this$0;

            protected boolean readyForReadback()
            {
                return mNativeContentViewRenderView != 0L && mContentViewCore != null;
            }

            
            {
                this$0 = ContentViewRenderView.this;
                super();
            }
        };
        mContentReadbackHandler.initNativeContentReadbackHandler();
        if (mCompositingSurfaceType == CompositingSurfaceType.TEXTURE_VIEW)
        {
            return;
        }
        if (!$assertionsDisabled && mSurfaceView.getHolder().getSurface().isValid())
        {
            throw new AssertionError("Surface created before native library loaded.");
        } else
        {
            mSurfaceCallback = new android.view.SurfaceHolder.Callback() {

                static final boolean $assertionsDisabled;
                final ContentViewRenderView this$0;

                public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
                {
                    if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
                    {
                        throw new AssertionError();
                    }
                    nativeSurfaceChanged(mNativeContentViewRenderView, i, j, k, surfaceholder.getSurface());
                    if (mContentViewCore != null)
                    {
                        mContentViewCore.onPhysicalBackingSizeChanged(j, k);
                    }
                }

                public void surfaceCreated(SurfaceHolder surfaceholder)
                {
                    if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
                    {
                        throw new AssertionError();
                    } else
                    {
                        nativeSurfaceCreated(mNativeContentViewRenderView);
                        onReadyToRender();
                        return;
                    }
                }

                public void surfaceDestroyed(SurfaceHolder surfaceholder)
                {
                    if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
                    {
                        throw new AssertionError();
                    } else
                    {
                        nativeSurfaceDestroyed(mNativeContentViewRenderView);
                        return;
                    }
                }

                static 
                {
                    boolean flag;
                    if (!org/chromium/content/browser/ContentViewRenderView.desiredAssertionStatus())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    $assertionsDisabled = flag;
                }

            
            {
                this$0 = ContentViewRenderView.this;
                super();
            }
            };
            mSurfaceView.getHolder().addCallback(mSurfaceCallback);
            mSurfaceView.setVisibility(0);
            return;
        }
    }

    protected void onReadyToRender()
    {
    }

    public void registerFirstRenderedFrameListener(FirstRenderedFrameListener firstrenderedframelistener)
    {
        mFirstRenderedFrameListener = firstrenderedframelistener;
        if (mFirstFrameReceived && mFirstRenderedFrameListener != null)
        {
            mFirstRenderedFrameListener.onFirstFrameReceived();
        }
    }

    public void setCurrentContentViewCore(ContentViewCore contentviewcore)
    {
        if (!$assertionsDisabled && mNativeContentViewRenderView == 0L)
        {
            throw new AssertionError();
        }
        mContentViewCore = contentviewcore;
        if (mContentViewCore != null)
        {
            mContentViewCore.onPhysicalBackingSizeChanged(getWidth(), getHeight());
            nativeSetCurrentContentViewCore(mNativeContentViewRenderView, mContentViewCore.getNativeContentViewCore());
            return;
        } else
        {
            nativeSetCurrentContentViewCore(mNativeContentViewRenderView, 0L);
            return;
        }
    }

    public void setLayerTreeBuildHelper(long l)
    {
        nativeSetLayerTreeBuildHelper(mNativeContentViewRenderView, l);
    }

    public void setNeedsComposite()
    {
        if (mNativeContentViewRenderView == 0L)
        {
            return;
        } else
        {
            nativeSetNeedsComposite(mNativeContentViewRenderView);
            return;
        }
    }

    public void setOverlayVideoMode(boolean flag)
    {
        if (mCompositingSurfaceType == CompositingSurfaceType.TEXTURE_VIEW)
        {
            nativeSetOverlayVideoMode(mNativeContentViewRenderView, flag);
            return;
        }
        byte byte0;
        if (flag)
        {
            byte0 = -3;
        } else
        {
            byte0 = -1;
        }
        mSurfaceView.getHolder().setFormat(byte0);
        nativeSetOverlayVideoMode(mNativeContentViewRenderView, flag);
    }

    public void setSurfaceViewBackgroundColor(int i)
    {
        if (mSurfaceView != null)
        {
            mSurfaceView.setBackgroundColor(i);
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentViewRenderView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }




/*
    static Surface access$102(ContentViewRenderView contentviewrenderview, Surface surface)
    {
        contentviewrenderview.mSurface = surface;
        return surface;
    }

*/





}
