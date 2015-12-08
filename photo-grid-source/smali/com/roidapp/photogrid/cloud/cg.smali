.class final Lcom/roidapp/photogrid/cloud/cg;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/br;B)V
    .locals 0

    .prologue
    .line 283
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/cg;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 286
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 287
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 301
    :goto_0
    return-void

    .line 289
    :pswitch_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 290
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/br;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 291
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    .line 292
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->b(Lcom/roidapp/photogrid/cloud/br;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 293
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i()I

    move-result v2

    sub-int/2addr v1, v2

    .line 294
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v3}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    const/4 v4, 0x1

    aget v0, v0, v4

    sub-int v0, v3, v0

    add-int/2addr v0, v1

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/roidapp/photogrid/cloud/br;I)I

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(I)V

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/cg;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->b(Lcom/roidapp/photogrid/cloud/br;)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 287
    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
    .end packed-switch
.end method
