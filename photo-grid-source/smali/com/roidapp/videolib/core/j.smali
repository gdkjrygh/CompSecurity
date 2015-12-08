.class final Lcom/roidapp/videolib/core/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/core/a/b;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/core/VideoEncodeService;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/core/VideoEncodeService;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 42
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    const/4 v1, 0x0

    const v2, 0xbb00

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Message;)V

    .line 43
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    const/4 v1, 0x0

    const v2, 0xbb01

    invoke-static {v1, v2, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Message;)V

    .line 48
    return-void
.end method

.method public final a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/core/a/c;

    .line 69
    if-eqz v0, :cond_0

    .line 70
    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->b()V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/core/a/c;

    .line 54
    if-eqz v0, :cond_0

    .line 55
    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->b()V

    .line 58
    :cond_0
    const/4 v0, 0x0

    const v1, 0xbb02

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 59
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 60
    const-string v2, "videoPath"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 62
    iget-object v1, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v1, v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Message;)V

    .line 63
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 78
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    invoke-static {v0}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/core/a/c;

    .line 80
    if-eqz v0, :cond_0

    .line 81
    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->b()V

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/core/j;->a:Lcom/roidapp/videolib/core/VideoEncodeService;

    const/4 v1, 0x0

    const v2, 0xbb04

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/core/VideoEncodeService;->a(Lcom/roidapp/videolib/core/VideoEncodeService;Landroid/os/Message;)V

    .line 85
    return-void
.end method
