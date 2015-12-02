.class public abstract Lcom/facebook/reflex/b;
.super Lcom/facebook/reflex/Image;
.source "CanvasImage.java"


# static fields
.field private static final b:Lcom/facebook/reflex/a;


# instance fields
.field private c:I

.field private d:I

.field private e:Lcom/facebook/reflex/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    new-instance v0, Lcom/facebook/reflex/c;

    invoke-direct {v0}, Lcom/facebook/reflex/c;-><init>()V

    sput-object v0, Lcom/facebook/reflex/b;->b:Lcom/facebook/reflex/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/reflex/Image;-><init>()V

    .line 29
    sget-object v0, Lcom/facebook/reflex/b;->b:Lcom/facebook/reflex/a;

    iput-object v0, p0, Lcom/facebook/reflex/b;->e:Lcom/facebook/reflex/a;

    .line 32
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/facebook/reflex/b;->c:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/b;->d:I

    if-ne p2, v0, :cond_0

    .line 50
    :goto_0
    return-void

    .line 47
    :cond_0
    iput p1, p0, Lcom/facebook/reflex/b;->c:I

    .line 48
    iput p2, p0, Lcom/facebook/reflex/b;->d:I

    .line 49
    invoke-virtual {p0}, Lcom/facebook/reflex/b;->f()V

    goto :goto_0
.end method

.method protected abstract a(Landroid/graphics/Canvas;)V
.end method

.method public a(Lcom/facebook/reflex/a;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/reflex/b;->e:Lcom/facebook/reflex/a;

    .line 40
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/reflex/b;->d:I

    return v0
.end method

.method protected c()V
    .locals 3

    .prologue
    .line 61
    iget v0, p0, Lcom/facebook/reflex/b;->c:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/b;->d:I

    if-nez v0, :cond_1

    .line 65
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/b;->a(Landroid/graphics/Bitmap;)V

    .line 73
    :goto_0
    return-void

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/b;->e:Lcom/facebook/reflex/a;

    iget v1, p0, Lcom/facebook/reflex/b;->c:I

    iget v2, p0, Lcom/facebook/reflex/b;->d:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/reflex/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 69
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 70
    invoke-virtual {p0, v1}, Lcom/facebook/reflex/b;->a(Landroid/graphics/Canvas;)V

    .line 71
    iget v1, p0, Lcom/facebook/reflex/b;->c:I

    iget v2, p0, Lcom/facebook/reflex/b;->d:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/reflex/b;->a(Landroid/graphics/Bitmap;II)V

    .line 72
    iget-object v1, p0, Lcom/facebook/reflex/b;->e:Lcom/facebook/reflex/a;

    invoke-interface {v1, v0}, Lcom/facebook/reflex/a;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public f_()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/facebook/reflex/b;->c:I

    return v0
.end method
