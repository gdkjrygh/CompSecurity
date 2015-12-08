.class final Lcom/c/a/b/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const/high16 v0, 0x40000000    # 2.0f

    sput v0, Lcom/c/a/b/h;->a:I

    return-void
.end method

.method static a(I)I
    .locals 3

    .prologue
    .line 47
    const v0, 0x1b873593

    const v1, -0x3361d2af    # -8.2930312E7f

    mul-int/2addr v1, p0

    const/16 v2, 0xf

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method

.method static b(I)I
    .locals 6

    .prologue
    .line 59
    const/4 v0, 0x2

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    .line 62
    const-wide v2, 0x3ff3333333333333L    # 1.2

    int-to-double v4, v0

    mul-double/2addr v2, v4

    double-to-int v2, v2

    if-le v1, v2, :cond_0

    .line 63
    shl-int/lit8 v0, v0, 0x1

    .line 64
    if-lez v0, :cond_1

    .line 66
    :cond_0
    :goto_0
    return v0

    .line 64
    :cond_1
    sget v0, Lcom/c/a/b/h;->a:I

    goto :goto_0
.end method
