.class final Lcom/roidapp/photogrid/release/jk;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/jj;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/jj;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 138
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 195
    :cond_0
    :goto_0
    return-void

    .line 140
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 143
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;Z)Z

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->b(Lcom/roidapp/photogrid/release/jj;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->b(Lcom/roidapp/photogrid/release/jj;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->c(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/jj;->b(Lcom/roidapp/photogrid/release/jj;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->d(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v0

    .line 149
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/jj;->d(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    .line 153
    if-lez v0, :cond_0

    if-lez v1, :cond_0

    .line 154
    iget-object v2, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;I)I

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/jj;->b(Lcom/roidapp/photogrid/release/jj;I)I

    goto :goto_0

    .line 190
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->e(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jk;->a:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/jj;->f(Lcom/roidapp/photogrid/release/jj;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 138
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
