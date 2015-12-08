.class final Lcom/roidapp/imagelib/a/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 435
    iput-object p1, p0, Lcom/roidapp/imagelib/a/r;->b:Lcom/roidapp/imagelib/a/i;

    iput-object p2, p0, Lcom/roidapp/imagelib/a/r;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 438
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 439
    iget-object v0, p0, Lcom/roidapp/imagelib/a/r;->a:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->ap:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 443
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 440
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 441
    iget-object v0, p0, Lcom/roidapp/imagelib/a/r;->a:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->ao:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0
.end method
