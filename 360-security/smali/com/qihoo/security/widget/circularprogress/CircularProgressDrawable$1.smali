.class Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;
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
    .line 181
    iput-object p1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 2

    .prologue
    .line 184
    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->p()F

    move-result v0

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    .line 185
    iget-object v1, p0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$1;->a:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;->a(F)V

    .line 186
    return-void
.end method
