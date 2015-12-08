.class final Lcom/roidapp/photogrid/cloud/bd;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 1161
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bd;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V
    .locals 0

    .prologue
    .line 1161
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/bd;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 1167
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 1182
    :cond_0
    :goto_0
    return-void

    .line 1169
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 1170
    if-eqz v0, :cond_0

    .line 1171
    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 1172
    if-eqz v0, :cond_0

    .line 1173
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bd;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1174
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bd;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1175
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bd;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->s(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 1167
    :pswitch_data_0
    .packed-switch 0xcc02
        :pswitch_0
    .end packed-switch
.end method
