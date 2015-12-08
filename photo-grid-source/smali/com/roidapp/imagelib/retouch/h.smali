.class final Lcom/roidapp/imagelib/retouch/h;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/BlemishImageView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/BlemishImageView;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/h;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 86
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 91
    :goto_0
    return-void

    .line 88
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/h;->a:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->invalidate()V

    goto :goto_0

    .line 86
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
