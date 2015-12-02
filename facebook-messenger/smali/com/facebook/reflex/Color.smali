.class public Lcom/facebook/reflex/Color;
.super Lcom/facebook/reflex/d;
.source "Color.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/facebook/reflex/d;-><init>()V

    .line 10
    invoke-direct {p0}, Lcom/facebook/reflex/Color;->initialize()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/Color;->a(I)V

    .line 11
    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    .prologue
    const/high16 v4, 0x437f0000    # 255.0f

    .line 19
    invoke-direct {p0}, Lcom/facebook/reflex/Color;-><init>()V

    .line 20
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v4

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/facebook/reflex/Color;->setColor(FFFF)V

    .line 25
    return-void
.end method

.method private native initialize()I
.end method

.method private native setColor(FFFF)V
.end method


# virtual methods
.method protected a()V
    .locals 0

    .prologue
    .line 35
    return-void
.end method

.method protected c()V
    .locals 0

    .prologue
    .line 30
    return-void
.end method
