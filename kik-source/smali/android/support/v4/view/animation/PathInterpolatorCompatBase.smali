.class Landroid/support/v4/view/animation/PathInterpolatorCompatBase;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public static create(FF)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 36
    new-instance v0, Landroid/support/v4/view/animation/PathInterpolatorDonut;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/view/animation/PathInterpolatorDonut;-><init>(FF)V

    return-object v0
.end method

.method public static create(FFFF)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 41
    new-instance v0, Landroid/support/v4/view/animation/PathInterpolatorDonut;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v4/view/animation/PathInterpolatorDonut;-><init>(FFFF)V

    return-object v0
.end method

.method public static create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 32
    new-instance v0, Landroid/support/v4/view/animation/PathInterpolatorDonut;

    invoke-direct {v0, p0}, Landroid/support/v4/view/animation/PathInterpolatorDonut;-><init>(Landroid/graphics/Path;)V

    return-object v0
.end method
