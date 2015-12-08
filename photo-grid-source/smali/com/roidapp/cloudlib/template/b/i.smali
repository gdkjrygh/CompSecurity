.class final Lcom/roidapp/cloudlib/template/b/i;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/roidapp/cloudlib/template/b/h;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/template/b/h;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .prologue
    .line 704
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/b/i;->b:Lcom/roidapp/cloudlib/template/b/h;

    iput-object p2, p0, Lcom/roidapp/cloudlib/template/b/i;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 707
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/i;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 709
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 714
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
