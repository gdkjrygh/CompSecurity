.class public Lcom/mopub/common/util/Dips;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)F
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method public static asFloatPixels(FLandroid/content/Context;)F
    .locals 2

    .prologue
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 33
    const/4 v1, 0x1

    invoke-static {v1, p0, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method public static asIntPixels(FLandroid/content/Context;)I
    .locals 2

    .prologue
    .line 37
    invoke-static {p0, p1}, Lcom/mopub/common/util/Dips;->asFloatPixels(FLandroid/content/Context;)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static dipsToFloatPixels(FLandroid/content/Context;)F
    .locals 1

    .prologue
    .line 20
    invoke-static {p1}, Lcom/mopub/common/util/Dips;->a(Landroid/content/Context;)F

    move-result v0

    mul-float/2addr v0, p0

    return v0
.end method

.method public static dipsToIntPixels(FLandroid/content/Context;)I
    .locals 2

    .prologue
    .line 24
    invoke-static {p0, p1}, Lcom/mopub/common/util/Dips;->dipsToFloatPixels(FLandroid/content/Context;)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static pixelsToFloatDips(FLandroid/content/Context;)F
    .locals 1

    .prologue
    .line 12
    invoke-static {p1}, Lcom/mopub/common/util/Dips;->a(Landroid/content/Context;)F

    move-result v0

    div-float v0, p0, v0

    return v0
.end method

.method public static pixelsToIntDips(FLandroid/content/Context;)I
    .locals 2

    .prologue
    .line 16
    invoke-static {p0, p1}, Lcom/mopub/common/util/Dips;->pixelsToFloatDips(FLandroid/content/Context;)F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static screenHeightAsIntDips(Landroid/content/Context;)I
    .locals 1

    .prologue
    .line 47
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    invoke-static {v0, p0}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public static screenWidthAsIntDips(Landroid/content/Context;)I
    .locals 1

    .prologue
    .line 41
    invoke-static {p0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    invoke-static {v0, p0}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result v0

    return v0
.end method
