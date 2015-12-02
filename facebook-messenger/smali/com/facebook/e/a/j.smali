.class Lcom/facebook/e/a/j;
.super Ljava/lang/Object;
.source "ResourceMonitor.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/e/a/h;


# direct methods
.method constructor <init>(Lcom/facebook/e/a/h;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/e/a/j;->a:Lcom/facebook/e/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 76
    :try_start_0
    iget-object v0, p0, Lcom/facebook/e/a/j;->a:Lcom/facebook/e/a/h;

    invoke-static {v0}, Lcom/facebook/e/a/h;->a(Lcom/facebook/e/a/h;)Lcom/facebook/e/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/e/a/e;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :goto_0
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    invoke-static {}, Lcom/facebook/e/a/h;->a()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "updateDataUsage throws"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
