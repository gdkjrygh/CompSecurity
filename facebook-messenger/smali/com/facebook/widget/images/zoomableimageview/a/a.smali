.class public Lcom/facebook/widget/images/zoomableimageview/a/a;
.super Ljava/lang/Object;
.source "Cubic.java"

# interfaces
.implements Lcom/facebook/widget/images/zoomableimageview/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(DDDD)D
    .locals 6

    .prologue
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 7
    div-double v0, p1, p7

    sub-double/2addr v0, v4

    mul-double v2, v0, v0

    mul-double/2addr v0, v2

    add-double/2addr v0, v4

    mul-double/2addr v0, p5

    add-double/2addr v0, p3

    return-wide v0
.end method

.method public b(DDDD)D
    .locals 6

    .prologue
    .line 17
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double v0, p7, v0

    div-double v0, p1, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v0, v2

    if-gez v2, :cond_0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double v2, p5, v2

    mul-double/2addr v2, v0

    mul-double/2addr v2, v0

    mul-double/2addr v0, v2

    add-double/2addr v0, p3

    .line 18
    :goto_0
    return-wide v0

    :cond_0
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double v2, p5, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    sub-double/2addr v0, v4

    mul-double v4, v0, v0

    mul-double/2addr v0, v4

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    add-double/2addr v0, v4

    mul-double/2addr v0, v2

    add-double/2addr v0, p3

    goto :goto_0
.end method
