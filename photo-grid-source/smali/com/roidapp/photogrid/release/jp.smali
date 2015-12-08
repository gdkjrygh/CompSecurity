.class final Lcom/roidapp/photogrid/release/jp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 1852
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/jp;->a:Ljava/lang/String;

    iput p3, p0, Lcom/roidapp/photogrid/release/jp;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1859
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 1860
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/jp;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    .line 1861
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    .line 1863
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 1866
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1867
    const/16 v1, 0xb

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1868
    iget v1, p0, Lcom/roidapp/photogrid/release/jp;->b:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1869
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jp;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1871
    return-void
.end method
