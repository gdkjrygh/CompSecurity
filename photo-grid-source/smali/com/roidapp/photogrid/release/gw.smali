.class final Lcom/roidapp/photogrid/release/gw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/gv;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/gv;)V
    .locals 0

    .prologue
    .line 740
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gw;->a:Lcom/roidapp/photogrid/release/gv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 742
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gw;->a:Lcom/roidapp/photogrid/release/gv;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/gv;->b(Lcom/roidapp/photogrid/release/gv;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 743
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gw;->a:Lcom/roidapp/photogrid/release/gv;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/gv;->b(Lcom/roidapp/photogrid/release/gv;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 744
    if-eqz v0, :cond_0

    .line 746
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 751
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
