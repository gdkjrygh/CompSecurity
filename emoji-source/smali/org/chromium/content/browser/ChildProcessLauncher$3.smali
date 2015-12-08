.class final Lorg/chromium/content/browser/ChildProcessLauncher$3;
.super Lorg/chromium/content/common/IChildProcessCallback$Stub;
.source "ChildProcessLauncher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ChildProcessLauncher;->createCallback(II)Lorg/chromium/content/common/IChildProcessCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic val$callbackType:I

.field final synthetic val$childProcessId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 452
    const-class v0, Lorg/chromium/content/browser/ChildProcessLauncher;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(II)V
    .locals 0

    .prologue
    .line 452
    iput p1, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$callbackType:I

    iput p2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$childProcessId:I

    invoke-direct {p0}, Lorg/chromium/content/common/IChildProcessCallback$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public establishSurfacePeer(ILandroid/view/Surface;II)V
    .locals 2
    .param p1, "pid"    # I
    .param p2, "surface"    # Landroid/view/Surface;
    .param p3, "primaryID"    # I
    .param p4, "secondaryID"    # I

    .prologue
    .line 464
    iget v0, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$callbackType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 465
    const-string v0, "ChildProcessLauncher"

    const-string v1, "Illegal callback for non-GPU process."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    :goto_0
    return-void

    .line 469
    :cond_0
    # invokes: Lorg/chromium/content/browser/ChildProcessLauncher;->nativeEstablishSurfacePeer(ILandroid/view/Surface;II)V
    invoke-static {p1, p2, p3, p4}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$400(ILandroid/view/Surface;II)V

    goto :goto_0
.end method

.method public getSurfaceTextureSurface(II)Lorg/chromium/content/common/SurfaceWrapper;
    .locals 5
    .param p1, "primaryId"    # I
    .param p2, "secondaryId"    # I

    .prologue
    const/4 v2, 0x0

    .line 491
    iget v3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$callbackType:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    .line 492
    const-string v3, "ChildProcessLauncher"

    const-string v4, "Illegal callback for non-renderer process."

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 509
    :goto_0
    return-object v2

    .line 496
    :cond_0
    iget v3, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$childProcessId:I

    if-eq p2, v3, :cond_1

    .line 497
    const-string v3, "ChildProcessLauncher"

    const-string v4, "Illegal secondaryId for renderer process."

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 501
    :cond_1
    new-instance v0, Landroid/util/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 503
    .local v0, "key":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    # getter for: Lorg/chromium/content/browser/ChildProcessLauncher;->sSurfaceTextureSurfaceMap:Ljava/util/Map;
    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$600()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    .line 504
    .local v1, "surface":Landroid/view/Surface;
    if-nez v1, :cond_2

    .line 505
    const-string v3, "ChildProcessLauncher"

    const-string v4, "Invalid Id for surface texture."

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 508
    :cond_2
    sget-boolean v2, Lorg/chromium/content/browser/ChildProcessLauncher$3;->$assertionsDisabled:Z

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 509
    :cond_3
    new-instance v2, Lorg/chromium/content/common/SurfaceWrapper;

    invoke-direct {v2, v1}, Lorg/chromium/content/common/SurfaceWrapper;-><init>(Landroid/view/Surface;)V

    goto :goto_0
.end method

.method public getViewSurface(I)Lorg/chromium/content/common/SurfaceWrapper;
    .locals 4
    .param p1, "surfaceId"    # I

    .prologue
    const/4 v1, 0x0

    .line 475
    iget v2, p0, Lorg/chromium/content/browser/ChildProcessLauncher$3;->val$callbackType:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    .line 476
    const-string v2, "ChildProcessLauncher"

    const-string v3, "Illegal callback for non-GPU process."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 486
    :goto_0
    return-object v1

    .line 480
    :cond_0
    # getter for: Lorg/chromium/content/browser/ChildProcessLauncher;->sViewSurfaceMap:Ljava/util/Map;
    invoke-static {}, Lorg/chromium/content/browser/ChildProcessLauncher;->access$500()Ljava/util/Map;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    .line 481
    .local v0, "surface":Landroid/view/Surface;
    if-nez v0, :cond_1

    .line 482
    const-string v2, "ChildProcessLauncher"

    const-string v3, "Invalid surfaceId."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 485
    :cond_1
    sget-boolean v1, Lorg/chromium/content/browser/ChildProcessLauncher$3;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 486
    :cond_2
    new-instance v1, Lorg/chromium/content/common/SurfaceWrapper;

    invoke-direct {v1, v0}, Lorg/chromium/content/common/SurfaceWrapper;-><init>(Landroid/view/Surface;)V

    goto :goto_0
.end method
