.class final Lcom/roidapp/videolib/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/core/a/b;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/g;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/g;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/roidapp/videolib/j;->a:Lcom/roidapp/videolib/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 95
    return-void
.end method

.method public final a(II)V
    .locals 0

    .prologue
    .line 99
    return-void
.end method

.method public final a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/videolib/j;->a:Lcom/roidapp/videolib/g;

    invoke-static {v0}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1, p3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/roidapp/videolib/j;->a:Lcom/roidapp/videolib/g;

    invoke-static {v1}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 111
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/videolib/j;->a:Lcom/roidapp/videolib/g;

    invoke-static {v0}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 104
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 116
    return-void
.end method
