.class final Lcom/roidapp/imagelib/retouch/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/roidapp/imagelib/retouch/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/a;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    iput-object p2, p0, Lcom/roidapp/imagelib/retouch/c;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 313
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/a;->e(Lcom/roidapp/imagelib/retouch/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    :goto_0
    return v1

    .line 315
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 317
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Z)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 319
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    goto :goto_0

    .line 323
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->b(Z)V

    .line 324
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->b:Lcom/roidapp/imagelib/retouch/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    .line 325
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/c;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    goto :goto_0

    .line 315
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
