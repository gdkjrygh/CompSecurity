.class final Lcom/roidapp/photogrid/common/aq;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/ap;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/ap;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x258

    .line 33
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 54
    :goto_0
    return-void

    .line 35
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->a(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->a(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/ap;->c(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v2, v3}, Lcom/roidapp/photogrid/common/aq;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 45
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->a(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->a(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/ap;->b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/common/aq;->a:Lcom/roidapp/photogrid/common/ap;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/ap;->d(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v2, v3}, Lcom/roidapp/photogrid/common/aq;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
