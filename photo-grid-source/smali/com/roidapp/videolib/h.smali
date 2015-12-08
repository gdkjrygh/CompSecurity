.class final Lcom/roidapp/videolib/h;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/g;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/g;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/roidapp/videolib/h;->a:Lcom/roidapp/videolib/g;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 47
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 71
    :goto_0
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/videolib/h;->a:Lcom/roidapp/videolib/g;

    const/4 v1, 0x1

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;ZLjava/lang/String;)V

    goto :goto_0

    .line 52
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/videolib/h;->a:Lcom/roidapp/videolib/g;

    const/4 v2, 0x0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;ZLjava/lang/String;)V

    goto :goto_0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
