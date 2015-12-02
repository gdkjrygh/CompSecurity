.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$6;
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
    .line 283
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$6;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 3

    .prologue
    .line 286
    iget-object v0, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$6;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->p()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;F)V

    .line 287
    return-void
.end method
