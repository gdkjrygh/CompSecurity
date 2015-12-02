.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;
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
    .locals 1

    .prologue
    .line 207
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 212
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->a:Z

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;Z)Z

    .line 214
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 218
    iget-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->a:Z

    if-nez v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->b(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;Z)Z

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->d(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->b:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-static {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->e(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)Lcom/nineoldandroids/a/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/o;->a()V

    .line 223
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 227
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$3;->a:Z

    .line 228
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 232
    return-void
.end method
