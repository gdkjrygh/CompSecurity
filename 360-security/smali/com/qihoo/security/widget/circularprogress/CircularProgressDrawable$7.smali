.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;
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
.field final synthetic a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

.field private b:Z


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 294
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->b:Z

    .line 295
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 299
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;F)V

    .line 300
    iget-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->b:Z

    if-nez v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->stop()V

    .line 302
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 306
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$7;->b:Z

    .line 307
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 312
    return-void
.end method
