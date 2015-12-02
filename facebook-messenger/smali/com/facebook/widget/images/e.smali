.class public Lcom/facebook/widget/images/e;
.super Ljava/lang/Object;
.source "RotateBitmap.java"


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/graphics/Bitmap;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/widget/images/e;

    sput-object v0, Lcom/facebook/widget/images/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/widget/images/e;->c:I

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    .line 36
    rem-int/lit16 v0, p2, 0x168

    iput v0, p0, Lcom/facebook/widget/images/e;->c:I

    .line 37
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/facebook/widget/images/e;->c:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/facebook/widget/images/e;->c:I

    .line 41
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    .line 53
    return-void
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()Landroid/graphics/Matrix;
    .locals 3

    .prologue
    .line 57
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 58
    iget v1, p0, Lcom/facebook/widget/images/e;->c:I

    if-eqz v1, :cond_0

    .line 62
    iget-object v1, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 63
    iget-object v2, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    .line 64
    neg-int v1, v1

    int-to-float v1, v1

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 65
    iget v1, p0, Lcom/facebook/widget/images/e;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 66
    invoke-virtual {p0}, Lcom/facebook/widget/images/e;->f()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/facebook/widget/images/e;->e()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 68
    :cond_0
    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Lcom/facebook/widget/images/e;->c:I

    div-int/lit8 v0, v0, 0x5a

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/widget/images/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 79
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/facebook/widget/images/e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    .line 87
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/images/e;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method
