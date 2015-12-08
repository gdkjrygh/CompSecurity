.class final Lcom/roidapp/baselib/e/h;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/e/g;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/e/g;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/roidapp/baselib/e/h;->a:Lcom/roidapp/baselib/e/g;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/roidapp/baselib/e/h;->a:Lcom/roidapp/baselib/e/g;

    iget-object v0, v0, Lcom/roidapp/baselib/e/g;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/e/h;->a:Lcom/roidapp/baselib/e/g;

    iget-object v0, v0, Lcom/roidapp/baselib/e/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 136
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
