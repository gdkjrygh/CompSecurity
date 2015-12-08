.class final Lcom/roidapp/imagelib/freecrop/f;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/freecrop/e;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/freecrop/e;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 94
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 121
    :cond_0
    :goto_0
    return-void

    .line 96
    :sswitch_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/freecrop/j;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v3, v3, Lcom/roidapp/imagelib/freecrop/e;->b:Ljava/lang/String;

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/imagelib/freecrop/j;-><init>(Lcom/roidapp/imagelib/freecrop/e;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 99
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 101
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 102
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->b(Lcom/roidapp/imagelib/freecrop/e;)Z

    .line 103
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->c(Lcom/roidapp/imagelib/freecrop/e;)V

    .line 104
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/av;->b()V

    goto :goto_0

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    const-string v2, ""

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/filter/av;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 111
    :sswitch_2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/freecrop/k;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v3}, Lcom/roidapp/imagelib/freecrop/e;->d(Lcom/roidapp/imagelib/freecrop/e;)Z

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/roidapp/imagelib/freecrop/k;-><init>(Lcom/roidapp/imagelib/freecrop/e;Z)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 114
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->b(Lcom/roidapp/imagelib/freecrop/e;)Z

    .line 115
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/f;->a:Lcom/roidapp/imagelib/freecrop/e;

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/e;->a(Lcom/roidapp/imagelib/freecrop/e;)Lcom/roidapp/imagelib/filter/av;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/net/Uri;

    const/16 v5, 0x64

    move-object v3, v2

    move-object v4, v2

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    goto/16 :goto_0

    .line 94
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x400 -> :sswitch_2
        0x401 -> :sswitch_3
    .end sparse-switch
.end method
