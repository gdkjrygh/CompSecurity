.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->a:Z

    .line 258
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    .line 262
    iget-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->a:Z

    if-nez v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->i(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)[I

    move-result-object v2

    array-length v2, v2

    rem-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;I)I

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)[I

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->j(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v2

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;I)I

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Landroid/graphics/Paint;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->k(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Lcom/nineoldandroids/a/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 269
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 273
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$5;->a:Z

    .line 274
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 278
    return-void
.end method
