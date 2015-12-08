.class final Lcom/roidapp/cloudlib/template/b/f;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/roidapp/cloudlib/template/b/e;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/b/e;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .prologue
    .line 361
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/b/f;->b:Lcom/roidapp/cloudlib/template/b/e;

    iput-object p2, p0, Lcom/roidapp/cloudlib/template/b/f;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/f;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/f;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 366
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 371
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
