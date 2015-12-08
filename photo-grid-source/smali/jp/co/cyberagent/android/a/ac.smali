.class public final Ljp/co/cyberagent/android/a/ac;
.super Ljp/co/cyberagent/android/a/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 6
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 7
    invoke-direct {p0, v1, v1}, Ljp/co/cyberagent/android/a/ac;->b(II)V

    .line 8
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 12
    invoke-direct {p0, p1, p2}, Ljp/co/cyberagent/android/a/ac;->b(II)V

    .line 13
    return-void
.end method

.method private b(II)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/high16 v1, 0x40800000    # 4.0f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    new-instance v2, Ljp/co/cyberagent/android/a/o;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/o;-><init>()V

    invoke-virtual {p0, v2}, Ljp/co/cyberagent/android/a/ac;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 18
    new-instance v2, Ljp/co/cyberagent/android/a/g;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/g;-><init>()V

    invoke-virtual {p0, v2}, Ljp/co/cyberagent/android/a/ac;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 1037
    if-eq p1, v3, :cond_0

    if-ne p2, v3, :cond_2

    :cond_0
    move v0, v1

    .line 20
    :cond_1
    :goto_0
    new-instance v1, Ljp/co/cyberagent/android/a/t;

    invoke-direct {v1, v0}, Ljp/co/cyberagent/android/a/t;-><init>(F)V

    invoke-virtual {p0, v1}, Ljp/co/cyberagent/android/a/ac;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 23
    return-void

    .line 1041
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 1042
    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/high16 v2, 0x44200000    # 640.0f

    div-float/2addr v1, v2

    .line 1043
    cmpg-float v2, v1, v0

    if-ltz v2, :cond_1

    move v0, v1

    goto :goto_0
.end method
