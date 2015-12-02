.class public Landroid/support/v4/widget/g;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/g$d;,
        Landroid/support/v4/widget/g$c;,
        Landroid/support/v4/widget/g$b;,
        Landroid/support/v4/widget/g$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Landroid/support/v4/widget/g$a;


# direct methods
.method private constructor <init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    const/16 v0, 0xe

    if-lt p1, v0, :cond_0

    .line 264
    new-instance v0, Landroid/support/v4/widget/g$d;

    invoke-direct {v0}, Landroid/support/v4/widget/g$d;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    .line 270
    :goto_0
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    invoke-interface {v0, p2, p3}, Landroid/support/v4/widget/g$a;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    .line 271
    return-void

    .line 265
    :cond_0
    const/16 v0, 0x9

    if-lt p1, v0, :cond_1

    .line 266
    new-instance v0, Landroid/support/v4/widget/g$c;

    invoke-direct {v0}, Landroid/support/v4/widget/g$c;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    goto :goto_0

    .line 268
    :cond_1
    new-instance v0, Landroid/support/v4/widget/g$b;

    invoke-direct {v0}, Landroid/support/v4/widget/g$b;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    goto :goto_0
.end method

.method constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1

    .prologue
    .line 254
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {p0, v0, p1, p2}, Landroid/support/v4/widget/g;-><init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 256
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/g;
    .locals 1

    .prologue
    .line 250
    new-instance v0, Landroid/support/v4/widget/g;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/widget/g;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    return-object v0
.end method


# virtual methods
.method public a(IIIII)V
    .locals 7

    .prologue
    .line 369
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Landroid/support/v4/widget/g$a;->a(Ljava/lang/Object;IIIII)V

    .line 370
    return-void
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->c(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 2

    .prologue
    .line 304
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->f(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 2

    .prologue
    .line 311
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->g(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->d(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Landroid/support/v4/widget/g;->b:Landroid/support/v4/widget/g$a;

    iget-object v1, p0, Landroid/support/v4/widget/g;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/widget/g$a;->e(Ljava/lang/Object;)V

    .line 431
    return-void
.end method
