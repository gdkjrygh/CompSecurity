.class final Lcom/roidapp/photogrid/release/qs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field final synthetic b:Lcom/roidapp/imagelib/b/b;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/roidapp/photogrid/release/ig;

.field final synthetic f:Lcom/roidapp/photogrid/release/RetouchActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/RetouchActivity;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/b/b;ILjava/lang/String;Lcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/qs;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/qs;->b:Lcom/roidapp/imagelib/b/b;

    iput p4, p0, Lcom/roidapp/photogrid/release/qs;->c:I

    iput-object p5, p0, Lcom/roidapp/photogrid/release/qs;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/roidapp/photogrid/release/qs;->e:Lcom/roidapp/photogrid/release/ig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 266
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    .line 267
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qs;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 268
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qs;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 271
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qs;->b:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 272
    iget v1, p0, Lcom/roidapp/photogrid/release/qs;->c:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 273
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 274
    new-instance v1, Lcom/roidapp/imagelib/e/b;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-direct {v1, v2, v0}, Lcom/roidapp/imagelib/e/b;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/e/a;)V

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qs;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/e/b;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 276
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qs;->e:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 277
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    new-instance v1, Lcom/roidapp/photogrid/release/qt;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/qt;-><init>(Lcom/roidapp/photogrid/release/qs;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/RetouchActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 285
    return-void
.end method
