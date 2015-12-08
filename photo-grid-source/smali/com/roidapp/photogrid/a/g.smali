.class final Lcom/roidapp/photogrid/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroid/os/Handler;

.field final synthetic d:Lcom/roidapp/photogrid/a/k;

.field final synthetic e:Lcom/roidapp/photogrid/a/d;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/a/d;Landroid/os/Handler;Lcom/roidapp/photogrid/a/k;)V
    .locals 1

    .prologue
    .line 647
    iput-object p1, p0, Lcom/roidapp/photogrid/a/g;->e:Lcom/roidapp/photogrid/a/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a/g;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/a/g;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/roidapp/photogrid/a/g;->c:Landroid/os/Handler;

    iput-object p3, p0, Lcom/roidapp/photogrid/a/g;->d:Lcom/roidapp/photogrid/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 649
    new-instance v1, Lcom/roidapp/photogrid/a/l;

    const/4 v0, 0x0

    const-string v2, "Inventory refresh successful."

    invoke-direct {v1, v0, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 650
    const/4 v0, 0x0

    .line 652
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/photogrid/a/g;->e:Lcom/roidapp/photogrid/a/d;

    iget-boolean v3, p0, Lcom/roidapp/photogrid/a/g;->a:Z

    iget-object v4, p0, Lcom/roidapp/photogrid/a/g;->b:Ljava/util/List;

    .line 1556
    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/a/d;->a(ZLjava/util/List;)Lcom/roidapp/photogrid/a/n;
    :try_end_0
    .catch Lcom/roidapp/photogrid/a/c; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 658
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/a/g;->e:Lcom/roidapp/photogrid/a/d;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/a/d;->b()V

    .line 662
    iget-object v2, p0, Lcom/roidapp/photogrid/a/g;->c:Landroid/os/Handler;

    new-instance v3, Lcom/roidapp/photogrid/a/h;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/photogrid/a/h;-><init>(Lcom/roidapp/photogrid/a/g;Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/n;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 667
    return-void

    .line 2042
    :catch_0
    move-exception v1

    iget-object v1, v1, Lcom/roidapp/photogrid/a/c;->a:Lcom/roidapp/photogrid/a/l;

    goto :goto_0
.end method
