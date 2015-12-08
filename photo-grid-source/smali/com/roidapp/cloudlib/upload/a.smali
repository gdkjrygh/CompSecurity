.class abstract Lcom/roidapp/cloudlib/upload/a;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private volatile a:Landroid/os/Looper;

.field private volatile b:Lcom/roidapp/cloudlib/upload/b;

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/a;->c:Ljava/lang/String;

    .line 79
    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Intent;)V
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 98
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/upload/a;->d:Z

    .line 99
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 147
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .prologue
    .line 107
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 108
    new-instance v0, Landroid/os/HandlerThread;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IntentService["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/upload/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 111
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/a;->a:Landroid/os/Looper;

    .line 112
    new-instance v0, Lcom/roidapp/cloudlib/upload/b;

    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/a;->a:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/upload/b;-><init>(Lcom/roidapp/cloudlib/upload/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/upload/a;->b:Lcom/roidapp/cloudlib/upload/b;

    .line 113
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/a;->a:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 138
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/a;->b:Lcom/roidapp/cloudlib/upload/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/upload/b;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 118
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 119
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/a;->b:Lcom/roidapp/cloudlib/upload/b;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/upload/b;->sendMessage(Landroid/os/Message;)Z

    .line 121
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0, p1, p3}, Lcom/roidapp/cloudlib/upload/a;->onStart(Landroid/content/Intent;I)V

    .line 132
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/upload/a;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0
.end method
