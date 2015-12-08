.class final Lcom/roidapp/cloudlib/sns/upload/c;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/UploadPGService;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/upload/UploadPGService;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/c;->a:Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    .line 47
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 48
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 52
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 53
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->g()V

    .line 56
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/c;->a:Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->stopSelf(I)V

    .line 57
    return-void

    .line 55
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/c;->a:Lcom/roidapp/cloudlib/sns/upload/UploadPGService;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->a(Lcom/roidapp/cloudlib/sns/upload/i;)V

    goto :goto_0
.end method
