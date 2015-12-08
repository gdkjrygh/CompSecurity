.class final Lcom/roidapp/cloudlib/upload/b;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/a;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/upload/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/b;->a:Lcom/roidapp/cloudlib/upload/a;

    .line 61
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 62
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 66
    iget-object v1, p0, Lcom/roidapp/cloudlib/upload/b;->a:Lcom/roidapp/cloudlib/upload/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/upload/a;->a(Landroid/content/Intent;)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/b;->a:Lcom/roidapp/cloudlib/upload/a;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/upload/a;->stopSelf(I)V

    .line 68
    return-void
.end method
