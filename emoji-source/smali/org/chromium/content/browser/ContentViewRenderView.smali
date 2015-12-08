.class public Lorg/chromium/content/browser/ContentViewRenderView;
.super Landroid/widget/FrameLayout;
.source "ContentViewRenderView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;,
        Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

.field private mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

.field protected mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private mFirstFrameReceived:Z

.field private mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

.field private mNativeContentViewRenderView:J

.field private mSurface:Landroid/view/Surface;

.field private mSurfaceCallback:Landroid/view/SurfaceHolder$Callback;

.field private final mSurfaceView:Landroid/view/SurfaceView;

.field private mTextureView:Landroid/view/TextureView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lorg/chromium/content/browser/ContentViewRenderView;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 129
    sget-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->SURFACE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    invoke-direct {p0, p1, v0}, Lorg/chromium/content/browser/ContentViewRenderView;-><init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;)V

    .line 130
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "surfaceType"    # Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 142
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 144
    iput-object p2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    .line 145
    sget-object v0, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    if-ne p2, v0, :cond_0

    .line 146
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/ContentViewRenderView;->initTextureView(Landroid/content/Context;)V

    .line 148
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    iput-object v3, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    .line 155
    iput-object v3, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceCallback:Landroid/view/SurfaceHolder$Callback;

    .line 168
    :goto_0
    return-void

    .line 159
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewRenderView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentViewRenderView;->createSurfaceView(Landroid/content/Context;)Landroid/view/SurfaceView;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    .line 160
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    .line 162
    invoke-virtual {p0, v2}, Lorg/chromium/content/browser/ContentViewRenderView;->setSurfaceViewBackgroundColor(I)V

    .line 163
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 167
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;

    .prologue
    .line 29
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/Surface;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    return-object v0
.end method

.method static synthetic access$102(Lorg/chromium/content/browser/ContentViewRenderView;Landroid/view/Surface;)Landroid/view/Surface;
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;
    .param p1, "x1"    # Landroid/view/Surface;

    .prologue
    .line 29
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    return-object p1
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/ContentViewRenderView;J)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;
    .param p1, "x1"    # J

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceCreated(J)V

    return-void
.end method

.method static synthetic access$300(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/TextureView;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    return-object v0
.end method

.method static synthetic access$400(Lorg/chromium/content/browser/ContentViewRenderView;JIIILandroid/view/Surface;)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;
    .param p1, "x1"    # J
    .param p3, "x2"    # I
    .param p4, "x3"    # I
    .param p5, "x4"    # I
    .param p6, "x5"    # Landroid/view/Surface;

    .prologue
    .line 29
    invoke-direct/range {p0 .. p6}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceChanged(JIIILandroid/view/Surface;)V

    return-void
.end method

.method static synthetic access$500(Lorg/chromium/content/browser/ContentViewRenderView;J)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;
    .param p1, "x1"    # J

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceDestroyed(J)V

    return-void
.end method

.method static synthetic access$600(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/SurfaceView;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/ContentViewRenderView;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    return-object v0
.end method

.method private initTextureView(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 68
    new-instance v0, Landroid/view/TextureView;

    invoke-direct {v0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    .line 69
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setBackgroundColor(I)V

    .line 71
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    new-instance v1, Lorg/chromium/content/browser/ContentViewRenderView$1;

    invoke-direct {v1, p0}, Lorg/chromium/content/browser/ContentViewRenderView$1;-><init>(Lorg/chromium/content/browser/ContentViewRenderView;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 126
    return-void
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeGetUIResourceProvider(J)J
.end method

.method private native nativeInit(J)J
.end method

.method private native nativeSetCurrentContentViewCore(JJ)V
.end method

.method private native nativeSetLayerTreeBuildHelper(JJ)V
.end method

.method private native nativeSetNeedsComposite(J)V
.end method

.method private native nativeSetOverlayVideoMode(JZ)V
.end method

.method private native nativeSurfaceChanged(JIIILandroid/view/Surface;)V
.end method

.method private native nativeSurfaceCreated(J)V
.end method

.method private native nativeSurfaceDestroyed(J)V
.end method

.method private onSwapBuffersCompleted()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 343
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstFrameReceived:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewCore;->isReady()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstFrameReceived:Z

    .line 346
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    invoke-interface {v0}, Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;->onFirstFrameReceived()V

    .line 352
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    sget-object v1, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    if-ne v0, v1, :cond_2

    .line 361
    :cond_1
    :goto_0
    return-void

    .line 354
    :cond_2
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 355
    new-instance v0, Lorg/chromium/content/browser/ContentViewRenderView$4;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/ContentViewRenderView$4;-><init>(Lorg/chromium/content/browser/ContentViewRenderView;)V

    invoke-virtual {p0, v0}, Lorg/chromium/content/browser/ContentViewRenderView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method protected createSurfaceView(Landroid/content/Context;)Landroid/view/SurfaceView;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 298
    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public destroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 247
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentReadbackHandler;->destroy()V

    .line 248
    iput-object v2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

    .line 249
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    sget-object v1, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    if-ne v0, v1, :cond_1

    .line 250
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;

    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 251
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 253
    iput-object v2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    .line 258
    :cond_0
    :goto_0
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeDestroy(J)V

    .line 259
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    .line 260
    return-void

    .line 256
    :cond_1
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceCallback:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    goto :goto_0
.end method

.method public getContentReadbackHandler()Lorg/chromium/content/browser/ContentReadbackHandler;
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

    return-object v0
.end method

.method public getUIResourceProvider()J
    .locals 2

    .prologue
    .line 367
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeGetUIResourceProvider(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public isInitialized()Z
    .locals 1

    .prologue
    .line 312
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onCompositorLayout()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 339
    return-void
.end method

.method public onNativeLibraryLoaded(Lorg/chromium/ui/base/WindowAndroid;)V
    .locals 4
    .param p1, "rootWindow"    # Lorg/chromium/ui/base/WindowAndroid;

    .prologue
    .line 176
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 177
    :cond_0
    invoke-virtual {p1}, Lorg/chromium/ui/base/WindowAndroid;->getNativePointer()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeInit(J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    .line 178
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 180
    :cond_1
    new-instance v0, Lorg/chromium/content/browser/ContentViewRenderView$2;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/ContentViewRenderView$2;-><init>(Lorg/chromium/content/browser/ContentViewRenderView;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

    .line 186
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentReadbackHandler:Lorg/chromium/content/browser/ContentReadbackHandler;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentReadbackHandler;->initNativeContentReadbackHandler()V

    .line 188
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    sget-object v1, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    if-ne v0, v1, :cond_2

    .line 221
    :goto_0
    return-void

    .line 192
    :cond_2
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView;->$assertionsDisabled:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Surface created before native library loaded."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 193
    :cond_3
    new-instance v0, Lorg/chromium/content/browser/ContentViewRenderView$3;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/ContentViewRenderView$3;-><init>(Lorg/chromium/content/browser/ContentViewRenderView;)V

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceCallback:Landroid/view/SurfaceHolder$Callback;

    .line 219
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceCallback:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 220
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected onReadyToRender()V
    .locals 0

    .prologue
    .line 289
    return-void
.end method

.method public registerFirstRenderedFrameListener(Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;)V
    .locals 1
    .param p1, "listener"    # Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    .prologue
    .line 302
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    .line 303
    iget-boolean v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstFrameReceived:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mFirstRenderedFrameListener:Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;

    invoke-interface {v0}, Lorg/chromium/content/browser/ContentViewRenderView$FirstRenderedFrameListener;->onFirstFrameReceived()V

    .line 306
    :cond_0
    return-void
.end method

.method public setCurrentContentViewCore(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 4
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    const-wide/16 v2, 0x0

    .line 263
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 264
    :cond_0
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 266
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewRenderView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewRenderView;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/chromium/content/browser/ContentViewCore;->onPhysicalBackingSizeChanged(II)V

    .line 268
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getNativeContentViewCore()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetCurrentContentViewCore(JJ)V

    .line 273
    :goto_0
    return-void

    .line 271
    :cond_1
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v0, v1, v2, v3}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetCurrentContentViewCore(JJ)V

    goto :goto_0
.end method

.method public setLayerTreeBuildHelper(J)V
    .locals 3
    .param p1, "layerTreeBuildHelperNativePtr"    # J

    .prologue
    .line 334
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v0, v1, p1, p2}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetLayerTreeBuildHelper(JJ)V

    .line 335
    return-void
.end method

.method public setNeedsComposite()V
    .locals 4

    .prologue
    .line 280
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 282
    :goto_0
    return-void

    .line 281
    :cond_0
    iget-wide v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetNeedsComposite(J)V

    goto :goto_0
.end method

.method public setOverlayVideoMode(Z)V
    .locals 4
    .param p1, "enabled"    # Z

    .prologue
    .line 320
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mCompositingSurfaceType:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    sget-object v2, Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;->TEXTURE_VIEW:Lorg/chromium/content/browser/ContentViewRenderView$CompositingSurfaceType;

    if-ne v1, v2, :cond_0

    .line 321
    iget-wide v2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v2, v3, p1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetOverlayVideoMode(JZ)V

    .line 327
    :goto_0
    return-void

    .line 324
    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, -0x3

    .line 325
    .local v0, "format":I
    :goto_1
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 326
    iget-wide v2, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J

    invoke-direct {p0, v2, v3, p1}, Lorg/chromium/content/browser/ContentViewRenderView;->nativeSetOverlayVideoMode(JZ)V

    goto :goto_0

    .line 324
    .end local v0    # "format":I
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public setSurfaceViewBackgroundColor(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 237
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0, p1}, Landroid/view/SurfaceView;->setBackgroundColor(I)V

    .line 240
    :cond_0
    return-void
.end method
