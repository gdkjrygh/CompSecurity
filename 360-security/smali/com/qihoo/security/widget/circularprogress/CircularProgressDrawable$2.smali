.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 4

    .prologue
    .line 197
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->p()F

    move-result v0

    .line 199
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 200
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    .line 204
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(F)V

    .line 205
    return-void

    .line 202
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v2

    iget-object v3, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$2;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v3}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v0, v2

    add-float/2addr v0, v1

    goto :goto_0
.end method
