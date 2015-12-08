.class public abstract Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/ActivityCompat21;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "SharedElementCallback21"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onCaptureSharedElementSnapshot(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;
.end method

.method public abstract onCreateSnapshotView(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;
.end method

.method public abstract onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
.end method

.method public abstract onRejectSharedElements(Ljava/util/List;)V
.end method

.method public abstract onSharedElementEnd(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end method

.method public abstract onSharedElementStart(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end method
