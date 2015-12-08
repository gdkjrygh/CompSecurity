.class Lorg/chromium/content/browser/ContentViewRenderView$1;
.super Ljava/lang/Object;
.source "ContentViewRenderView.java"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewRenderView;->initTextureView(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewRenderView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 71
    const-class v0, Lorg/chromium/content/browser/ContentViewRenderView;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/ContentViewRenderView;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 4
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 75
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 77
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    # setter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->access$102(Lorg/chromium/content/browser/ContentViewRenderView;Landroid/view/Surface;)Landroid/view/Surface;

    .line 78
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceCreated(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/ContentViewRenderView;->access$200(Lorg/chromium/content/browser/ContentViewRenderView;J)V

    .line 80
    invoke-virtual {p0, p1, p2, p3}, Lorg/chromium/content/browser/ContentViewRenderView$1;->onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V

    .line 81
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    invoke-virtual {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->onReadyToRender()V

    .line 82
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 4
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;

    .prologue
    .line 112
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 113
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceDestroyed(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/ContentViewRenderView;->access$500(Lorg/chromium/content/browser/ContentViewRenderView;J)V

    .line 116
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$100(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 117
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    const/4 v1, 0x0

    # setter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0, v1}, Lorg/chromium/content/browser/ContentViewRenderView;->access$102(Lorg/chromium/content/browser/ContentViewRenderView;Landroid/view/Surface;)Landroid/view/Surface;

    .line 118
    const/4 v0, 0x1

    return v0
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 8
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 87
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$100(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 88
    :cond_1
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mTextureView:Landroid/view/TextureView;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$300(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/TextureView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eq p1, v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 89
    :cond_2
    sget-boolean v0, Lorg/chromium/content/browser/ContentViewRenderView$1;->$assertionsDisabled:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$100(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 101
    :cond_3
    const/4 v4, 0x1

    .line 102
    .local v4, "format":I
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mNativeContentViewRenderView:J
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$000(Lorg/chromium/content/browser/ContentViewRenderView;)J

    move-result-wide v2

    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    # getter for: Lorg/chromium/content/browser/ContentViewRenderView;->mSurface:Landroid/view/Surface;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewRenderView;->access$100(Lorg/chromium/content/browser/ContentViewRenderView;)Landroid/view/Surface;

    move-result-object v7

    move v5, p2

    move v6, p3

    # invokes: Lorg/chromium/content/browser/ContentViewRenderView;->nativeSurfaceChanged(JIIILandroid/view/Surface;)V
    invoke-static/range {v1 .. v7}, Lorg/chromium/content/browser/ContentViewRenderView;->access$400(Lorg/chromium/content/browser/ContentViewRenderView;JIIILandroid/view/Surface;)V

    .line 104
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    if-eqz v0, :cond_4

    .line 105
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewRenderView$1;->this$0:Lorg/chromium/content/browser/ContentViewRenderView;

    iget-object v0, v0, Lorg/chromium/content/browser/ContentViewRenderView;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p2, p3}, Lorg/chromium/content/browser/ContentViewCore;->onPhysicalBackingSizeChanged(II)V

    .line 108
    :cond_4
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0
    .param p1, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;

    .prologue
    .line 124
    return-void
.end method
