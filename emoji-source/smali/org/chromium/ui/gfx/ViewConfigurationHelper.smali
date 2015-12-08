.class public Lorg/chromium/ui/gfx/ViewConfigurationHelper;
.super Ljava/lang/Object;
.source "ViewConfigurationHelper.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "gfx"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final MIN_SCALING_SPAN_MM:F = 27.0f

.field private static final MIN_SCALING_TOUCH_MAJOR_DIP:F = 48.0f


# instance fields
.field private final mAppContext:Landroid/content/Context;

.field private mViewConfiguration:Landroid/view/ViewConfiguration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    .line 36
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    .line 37
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/ui/gfx/ViewConfigurationHelper;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/ui/gfx/ViewConfigurationHelper;

    .prologue
    .line 24
    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->updateNativeViewConfigurationIfNecessary()V

    return-void
.end method

.method private static createWithListener(Landroid/content/Context;)Lorg/chromium/ui/gfx/ViewConfigurationHelper;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 140
    new-instance v0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;

    invoke-direct {v0, p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;-><init>(Landroid/content/Context;)V

    .line 141
    .local v0, "viewConfigurationHelper":Lorg/chromium/ui/gfx/ViewConfigurationHelper;
    invoke-direct {v0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->registerListener()V

    .line 142
    return-object v0
.end method

.method private static getDoubleTapTimeout()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 70
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v0

    return v0
.end method

.method private static getLongPressTimeout()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 75
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    return v0
.end method

.method private getScaledDoubleTapSlop()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 105
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I

    move-result v0

    return v0
.end method

.method private getScaledMaximumFlingVelocity()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 90
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    return v0
.end method

.method private getScaledMinScalingSpan()I
    .locals 6
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 110
    iget-object v3, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 111
    .local v2, "res":Landroid/content/res/Resources;
    const-string v3, "config_minScalingSpan"

    const-string v4, "dimen"

    const-string v5, "android"

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 113
    .local v1, "id":I
    if-nez v1, :cond_0

    sget v1, Lorg/chromium/ui/R$dimen;->config_min_scaling_span:I

    .line 115
    :cond_0
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 118
    :goto_0
    return v3

    .line 116
    :catch_0
    move-exception v0

    .line 117
    .local v0, "e":Landroid/content/res/Resources$NotFoundException;
    sget-boolean v3, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->$assertionsDisabled:Z

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/AssertionError;

    const-string v4, "MinScalingSpan resource lookup failed."

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    .line 118
    :cond_1
    const/4 v3, 0x5

    const/high16 v4, 0x41d80000    # 27.0f

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    goto :goto_0
.end method

.method private getScaledMinScalingTouchMajor()I
    .locals 6
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 125
    iget-object v3, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 126
    .local v2, "res":Landroid/content/res/Resources;
    const-string v3, "config_minScalingTouchMajor"

    const-string v4, "dimen"

    const-string v5, "android"

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 128
    .local v1, "id":I
    if-nez v1, :cond_0

    sget v1, Lorg/chromium/ui/R$dimen;->config_min_scaling_touch_major:I

    .line 130
    :cond_0
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 133
    :goto_0
    return v3

    .line 131
    :catch_0
    move-exception v0

    .line 132
    .local v0, "e":Landroid/content/res/Resources$NotFoundException;
    sget-boolean v3, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->$assertionsDisabled:Z

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/AssertionError;

    const-string v4, "MinScalingTouchMajor resource lookup failed."

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    .line 133
    :cond_1
    const/4 v3, 0x1

    const/high16 v4, 0x42400000    # 48.0f

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    float-to-int v3, v3

    goto :goto_0
.end method

.method private getScaledMinimumFlingVelocity()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    return v0
.end method

.method private getScaledTouchSlop()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 100
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    return v0
.end method

.method private static getScrollFriction()F
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 85
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    return v0
.end method

.method private static getTapTimeout()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    return v0
.end method

.method private native nativeUpdateSharedViewConfiguration(IIIIII)V
.end method

.method private registerListener()V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    new-instance v1, Lorg/chromium/ui/gfx/ViewConfigurationHelper$1;

    invoke-direct {v1, p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper$1;-><init>(Lorg/chromium/ui/gfx/ViewConfigurationHelper;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 51
    return-void
.end method

.method private updateNativeViewConfigurationIfNecessary()V
    .locals 8

    .prologue
    .line 55
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mAppContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v7

    .line 56
    .local v7, "configuration":Landroid/view/ViewConfiguration;
    iget-object v0, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    if-ne v0, v7, :cond_0

    .line 66
    :goto_0
    return-void

    .line 58
    :cond_0
    iput-object v7, p0, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->mViewConfiguration:Landroid/view/ViewConfiguration;

    .line 59
    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledMaximumFlingVelocity()I

    move-result v1

    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledMinimumFlingVelocity()I

    move-result v2

    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledTouchSlop()I

    move-result v3

    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledDoubleTapSlop()I

    move-result v4

    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledMinScalingSpan()I

    move-result v5

    invoke-direct {p0}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->getScaledMinScalingTouchMajor()I

    move-result v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lorg/chromium/ui/gfx/ViewConfigurationHelper;->nativeUpdateSharedViewConfiguration(IIIIII)V

    goto :goto_0
.end method
