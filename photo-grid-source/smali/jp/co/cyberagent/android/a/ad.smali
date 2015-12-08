.class public final Ljp/co/cyberagent/android/a/ad;
.super Ljp/co/cyberagent/android/a/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 30
    invoke-static {v0, v0}, Ljp/co/cyberagent/android/a/ad;->b(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 31
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 34
    invoke-static {p1, p2}, Ljp/co/cyberagent/android/a/ad;->b(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/k;-><init>(Ljava/util/List;)V

    .line 35
    return-void
.end method

.method private static b(II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, -0x1

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    new-instance v3, Ljp/co/cyberagent/android/a/o;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/o;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v3, Ljp/co/cyberagent/android/a/g;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/g;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v3, Ljp/co/cyberagent/android/a/l;

    invoke-direct {v3, v1}, Ljp/co/cyberagent/android/a/l;-><init>(F)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1061
    if-eq p0, v4, :cond_0

    if-ne p1, v4, :cond_2

    :cond_0
    move v0, v1

    .line 44
    :cond_1
    :goto_0
    new-instance v1, Ljp/co/cyberagent/android/a/d;

    invoke-direct {v1, v0}, Ljp/co/cyberagent/android/a/d;-><init>(F)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Ljp/co/cyberagent/android/a/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/a/f;-><init>(B)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    return-object v2

    .line 1065
    :cond_2
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1066
    int-to-float v3, v3

    mul-float/2addr v1, v3

    const/high16 v3, 0x44200000    # 640.0f

    div-float/2addr v1, v3

    .line 1067
    cmpg-float v3, v1, v0

    if-ltz v3, :cond_1

    move v0, v1

    goto :goto_0
.end method
