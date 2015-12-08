.class final Lcom/roidapp/imagelib/a/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/roidapp/imagelib/a/s;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    .line 454
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 456
    iget-object v0, p0, Lcom/roidapp/imagelib/a/s;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->e(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/a/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 462
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 457
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 459
    iget-object v0, p0, Lcom/roidapp/imagelib/a/s;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->e(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/s;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/i;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/d;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    goto :goto_0
.end method
