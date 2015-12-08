.class final Lcom/roidapp/photogrid/filter/selfiecam/l;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;B)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/l;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/16 v2, 0x8

    .line 91
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 110
    :cond_0
    :goto_0
    return-void

    .line 93
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)Landroid/widget/ImageView;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 97
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 100
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 101
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/aq;

    if-eqz v1, :cond_0

    .line 102
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/n;

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget v4, p1, Landroid/os/Message;->arg2:I

    check-cast v0, Lcom/roidapp/imagelib/filter/aq;

    invoke-direct {v2, v3, v4, v0}, Lcom/roidapp/photogrid/filter/selfiecam/n;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;ILcom/roidapp/imagelib/filter/aq;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 105
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    .line 106
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/l;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 91
    nop

    :pswitch_data_0
    .packed-switch 0x3fc
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
