.class final Lcom/roidapp/cloudlib/instagram/g;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/g;->a:Ljava/lang/ref/WeakReference;

    .line 64
    return-void
.end method


# virtual methods
.method public final dispatchMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    .line 69
    iget v1, p1, Landroid/os/Message;->what:I

    sparse-switch v1, :sswitch_data_0

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 71
    :sswitch_0
    if-eqz v0, :cond_0

    .line 82
    :cond_1
    :goto_1
    const/4 v1, -0x1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->setResult(ILandroid/content/Intent;)V

    .line 83
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->finish()V

    goto :goto_0

    .line 77
    :sswitch_1
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 78
    if-eqz v0, :cond_0

    .line 79
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1

    .line 80
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 69
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x20 -> :sswitch_1
    .end sparse-switch
.end method
