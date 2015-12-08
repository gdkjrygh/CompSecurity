.class final Lcom/roidapp/photogrid/cloud/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Z

.field private e:Z


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;IZ)V
    .locals 1

    .prologue
    .line 1192
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bc;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1194
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/bc;->b:Ljava/lang/String;

    .line 1195
    iput p3, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    .line 1196
    iput-boolean p4, p0, Lcom/roidapp/photogrid/cloud/bc;->d:Z

    .line 1197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/bc;->e:Z

    .line 1198
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;IZB)V
    .locals 0

    .prologue
    .line 1185
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roidapp/photogrid/cloud/bc;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;IZ)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1203
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/bc;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bc;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    iget v2, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/bc;->e:Z

    invoke-static {v0, v1, v2, v3, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1205
    :goto_0
    const/4 v1, 0x0

    .line 1206
    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/bc;->d:Z

    if-nez v2, :cond_0

    .line 1207
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 1208
    if-eqz v2, :cond_0

    array-length v3, v2

    if-lez v3, :cond_0

    .line 1209
    const/4 v1, 0x0

    aget-object v1, v2, v1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    iget v3, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    iget-boolean v4, p0, Lcom/roidapp/photogrid/cloud/bc;->e:Z

    invoke-static {v1, v2, v3, v4, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1213
    :cond_0
    if-eqz v0, :cond_1

    .line 1214
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bc;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->t(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1215
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bc;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->t(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v2

    const v3, 0xcc02

    new-instance v4, Lcom/roidapp/baselib/c/x;

    invoke-direct {v4, v0, v1}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1218
    :cond_1
    return-void

    .line 1203
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bc;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/bc;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/c;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method
