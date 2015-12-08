.class Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$2;->this$0:Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Landroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 2

    .prologue
    .line 218
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 219
    const/4 v0, -0x1

    .line 223
    :goto_0
    return v0

    .line 220
    :cond_0
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 221
    const/4 v0, 0x1

    goto :goto_0

    .line 223
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 215
    check-cast p1, Landroid/graphics/PointF;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageToneCurveFilter$2;->compare(Landroid/graphics/PointF;Landroid/graphics/PointF;)I

    move-result v0

    return v0
.end method
