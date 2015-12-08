.class final Lcom/roidapp/photogrid/release/qw;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ShareEntryVideo;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ShareEntryVideo;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qw;->a:Lcom/roidapp/photogrid/release/ShareEntryVideo;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 258
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 275
    :cond_0
    :goto_0
    return-void

    .line 260
    :pswitch_0
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qw;->a:Lcom/roidapp/photogrid/release/ShareEntryVideo;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 262
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qw;->a:Lcom/roidapp/photogrid/release/ShareEntryVideo;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/gl/GPUTestView;

    .line 263
    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/GPUTestView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 265
    if-eqz v1, :cond_0

    .line 266
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 271
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassCastException;->printStackTrace()V

    goto :goto_0

    .line 258
    :pswitch_data_0
    .packed-switch 0x1230
        :pswitch_0
    .end packed-switch
.end method
