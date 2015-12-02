.class Lcom/facebook/e/a/i;
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
    .line 61
    iput-object p1, p0, Lcom/facebook/e/a/i;->a:Lcom/facebook/e/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/facebook/e/a/i;->a:Lcom/facebook/e/a/h;

    invoke-static {v0}, Lcom/facebook/e/a/h;->a(Lcom/facebook/e/a/h;)Lcom/facebook/e/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/e/a/e;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :goto_0
    return-void

    .line 66
    :catch_0
    move-exception v0

    .line 67
    invoke-static {}, Lcom/facebook/e/a/h;->a()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "updateMemoryUsage throws"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
