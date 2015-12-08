.class final Lcom/roidapp/photogrid/cloud/be;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/be;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    .line 144
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 145
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 158
    :goto_0
    return-void

    .line 147
    :pswitch_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 148
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 149
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    .line 150
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 151
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    const/4 v4, 0x1

    aget v0, v0, v4

    sub-int v0, v3, v0

    add-int/2addr v0, v1

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I

    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->e()Z

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p_()V

    .line 155
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/be;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 145
    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
    .end packed-switch
.end method
