.class public Lyong/powerfull/equalizer/ScreenInfo;
.super Ljava/lang/Object;
.source "ScreenInfo.java"


# instance fields
.field private activity:Landroid/app/Activity;

.field private density:F

.field private densityDpi:I

.field private height:I

.field private width:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->activity:Landroid/app/Activity;

    .line 66
    invoke-direct {p0}, Lyong/powerfull/equalizer/ScreenInfo;->ini()V

    .line 67
    return-void
.end method

.method private ini()V
    .locals 2

    .prologue
    .line 70
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 71
    .local v0, "metric":Landroid/util/DisplayMetrics;
    iget-object v1, p0, Lyong/powerfull/equalizer/ScreenInfo;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 72
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lyong/powerfull/equalizer/ScreenInfo;->width:I

    .line 73
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, p0, Lyong/powerfull/equalizer/ScreenInfo;->height:I

    .line 74
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lyong/powerfull/equalizer/ScreenInfo;->density:F

    .line 75
    iget v1, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v1, p0, Lyong/powerfull/equalizer/ScreenInfo;->densityDpi:I

    .line 76
    return-void
.end method


# virtual methods
.method public getActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lyong/powerfull/equalizer/ScreenInfo;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public getDensity()F
    .locals 1

    .prologue
    .line 49
    iget v0, p0, Lyong/powerfull/equalizer/ScreenInfo;->density:F

    return v0
.end method

.method public getDensityDpi()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lyong/powerfull/equalizer/ScreenInfo;->densityDpi:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lyong/powerfull/equalizer/ScreenInfo;->height:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lyong/powerfull/equalizer/ScreenInfo;->width:I

    return v0
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 29
    iput-object p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->activity:Landroid/app/Activity;

    .line 30
    return-void
.end method

.method public setDensity(F)V
    .locals 0
    .param p1, "density"    # F

    .prologue
    .line 53
    iput p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->density:F

    .line 54
    return-void
.end method

.method public setDensityDpi(I)V
    .locals 0
    .param p1, "densityDpi"    # I

    .prologue
    .line 61
    iput p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->densityDpi:I

    .line 62
    return-void
.end method

.method public setHeight(I)V
    .locals 0
    .param p1, "height"    # I

    .prologue
    .line 45
    iput p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->height:I

    .line 46
    return-void
.end method

.method public setWidth(I)V
    .locals 0
    .param p1, "width"    # I

    .prologue
    .line 37
    iput p1, p0, Lyong/powerfull/equalizer/ScreenInfo;->width:I

    .line 38
    return-void
.end method
