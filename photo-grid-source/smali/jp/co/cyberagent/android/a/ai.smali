.class final Ljp/co/cyberagent/android/a/ai;
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
.field final synthetic a:Ljp/co/cyberagent/android/a/ag;


# direct methods
.method constructor <init>(Ljp/co/cyberagent/android/a/ag;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Ljp/co/cyberagent/android/a/ai;->a:Ljp/co/cyberagent/android/a/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 239
    check-cast p1, Landroid/graphics/PointF;

    check-cast p2, Landroid/graphics/PointF;

    .line 1242
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 1243
    const/4 v0, -0x1

    .line 1245
    :goto_0
    return v0

    .line 1244
    :cond_0
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 1245
    const/4 v0, 0x1

    goto :goto_0

    .line 1247
    :cond_1
    const/4 v0, 0x0

    .line 239
    goto :goto_0
.end method
