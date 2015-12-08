.class final Lcom/roidapp/photogrid/release/jl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/roidapp/photogrid/release/jj;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/jj;Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jl;->d:Lcom/roidapp/photogrid/release/jj;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/jl;->a:Ljava/lang/String;

    iput p3, p0, Lcom/roidapp/photogrid/release/jl;->b:I

    iput p4, p0, Lcom/roidapp/photogrid/release/jl;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jl;->d:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v0, v4}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;Z)Z

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jl;->d:Lcom/roidapp/photogrid/release/jj;

    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jl;->a:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/release/jl;->b:I

    iget v3, p0, Lcom/roidapp/photogrid/release/jl;->c:I

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/a/a;->b(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/jj;->a(Lcom/roidapp/photogrid/release/jj;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 258
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 259
    iput v4, v0, Landroid/os/Message;->what:I

    .line 260
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jl;->d:Lcom/roidapp/photogrid/release/jj;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/jj;->g(Lcom/roidapp/photogrid/release/jj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 261
    return-void
.end method
