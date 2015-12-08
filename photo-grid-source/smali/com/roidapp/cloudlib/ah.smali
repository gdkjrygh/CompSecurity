.class public Lcom/roidapp/cloudlib/ah;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field protected b:Lcom/roidapp/cloudlib/ai;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/ah;->b:Lcom/roidapp/cloudlib/ai;

    .line 16
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ah;->a:Ljava/lang/ref/WeakReference;

    .line 17
    return-void
.end method


# virtual methods
.method protected a(Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 56
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/ai;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/ah;->b:Lcom/roidapp/cloudlib/ai;

    .line 48
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 22
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 31
    iget-object v0, p0, Lcom/roidapp/cloudlib/ah;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/ah;->a(Landroid/os/Message;)V

    .line 36
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/ah;->b:Lcom/roidapp/cloudlib/ai;

    if-eqz v0, :cond_1

    .line 37
    iget-object v0, p0, Lcom/roidapp/cloudlib/ah;->b:Lcom/roidapp/cloudlib/ai;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/ai;->a(Landroid/os/Message;)V

    .line 39
    :cond_1
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/ah;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 27
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/cloudlib/ah;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget v3, p1, Landroid/os/Message;->what:I

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v0, v3, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;ILjava/lang/String;)V

    goto :goto_0

    .line 22
    nop

    :pswitch_data_0
    .packed-switch 0x1100
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
