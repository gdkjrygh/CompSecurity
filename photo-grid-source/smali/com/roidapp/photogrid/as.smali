.class final Lcom/roidapp/photogrid/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ar;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ar;)V
    .locals 0

    .prologue
    .line 1255
    iput-object p1, p0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1262
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/as;->a:Lcom/roidapp/photogrid/ar;

    iget-object v0, v0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->x(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/a/d;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/at;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/at;-><init>(Lcom/roidapp/photogrid/as;)V

    .line 1672
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Lcom/roidapp/photogrid/a/k;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1303
    :goto_0
    return-void

    .line 1299
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
