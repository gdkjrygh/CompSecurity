.class final Lcom/roidapp/photogrid/video/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/MusicPlayerService;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/MusicPlayerService;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/roidapp/photogrid/video/j;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .prologue
    .line 141
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 151
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 143
    :pswitch_0
    iget-object v1, p0, Lcom/roidapp/photogrid/video/j;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Lcom/roidapp/photogrid/video/MusicPlayerService;Ljava/lang/String;)V

    goto :goto_0

    .line 146
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/j;->a:Lcom/roidapp/photogrid/video/MusicPlayerService;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->b(Lcom/roidapp/photogrid/video/MusicPlayerService;)V

    goto :goto_0

    .line 141
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
