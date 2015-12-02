.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;
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
    .line 238
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 5

    .prologue
    .line 241
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->p()F

    move-result v0

    .line 242
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    iget-object v2, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v3}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v3

    iget-object v4, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v4}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->c(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    mul-float/2addr v0, v3

    sub-float v0, v2, v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(F)V

    .line 244
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->m()J

    move-result-wide v0

    .line 245
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->n()J

    move-result-wide v2

    .line 246
    long-to-float v2, v2

    long-to-float v0, v0

    div-float v0, v2, v0

    .line 247
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->f(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)[I

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    const v1, 0x3f333333    # 0.7f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->h(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Landroid/graphics/Paint;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$4;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->g(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 250
    :cond_0
    return-void
.end method
