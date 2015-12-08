.class final Lcom/roidapp/photogrid/cloud/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/r;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Z

.field private e:Z


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;IZZ)V
    .locals 1

    .prologue
    .line 1542
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1543
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/q;->a:Ljava/lang/ref/WeakReference;

    .line 1544
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/q;->b:Ljava/lang/String;

    .line 1545
    iput p3, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    .line 1546
    iput-boolean p4, p0, Lcom/roidapp/photogrid/cloud/q;->d:Z

    .line 1547
    iput-boolean p5, p0, Lcom/roidapp/photogrid/cloud/q;->e:Z

    .line 1548
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;IZZB)V
    .locals 0

    .prologue
    .line 1534
    invoke-direct/range {p0 .. p5}, Lcom/roidapp/photogrid/cloud/q;-><init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;IZZ)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1552
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/q;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1571
    :cond_0
    :goto_0
    return-void

    .line 1555
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/q;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/q;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    iget v2, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/q;->e:Z

    invoke-static {v0, v1, v2, v3, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    .line 1557
    :goto_1
    const/4 v0, 0x0

    .line 1558
    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/q;->d:Z

    if-nez v2, :cond_3

    .line 1559
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 1560
    if-eqz v2, :cond_3

    array-length v3, v2

    if-lez v3, :cond_3

    .line 1561
    const/4 v0, 0x0

    aget-object v0, v2, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    iget v3, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    iget-boolean v4, p0, Lcom/roidapp/photogrid/cloud/q;->e:Z

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v2, v0

    .line 1565
    :goto_2
    if-eqz v1, :cond_0

    .line 1566
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/q;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/r;

    .line 1567
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->a(Lcom/roidapp/photogrid/cloud/r;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1568
    const v3, 0xcc02

    new-instance v4, Lcom/roidapp/baselib/c/x;

    invoke-direct {v4, v1, v2}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 1555
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/q;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/q;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/c;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_3
    move-object v2, v0

    goto :goto_2
.end method
