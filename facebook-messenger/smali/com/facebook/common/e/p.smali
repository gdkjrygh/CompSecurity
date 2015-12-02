.class Lcom/facebook/common/e/p;
.super Ljava/lang/Object;
.source "StubFbErrorReporter.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/facebook/common/e/o;


# direct methods
.method constructor <init>(Lcom/facebook/common/e/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/common/e/p;->f:Lcom/facebook/common/e/o;

    iput-object p2, p0, Lcom/facebook/common/e/p;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/common/e/p;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/common/e/p;->c:Ljava/lang/Object;

    iput-object p5, p0, Lcom/facebook/common/e/p;->d:Ljava/lang/Object;

    iput-object p6, p0, Lcom/facebook/common/e/p;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 111
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    const-string v1, "Category: %s\nMessage: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/common/e/p;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/facebook/common/e/p;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    iget-object v1, p0, Lcom/facebook/common/e/p;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 117
    const-string v1, "\nCaused By: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/common/e/p;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    :cond_0
    iget-object v1, p0, Lcom/facebook/common/e/p;->d:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 121
    iget-object v1, p0, Lcom/facebook/common/e/p;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/common/e/p;->d:Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-static {v1, v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    return-void

    .line 123
    :cond_1
    iget-object v1, p0, Lcom/facebook/common/e/p;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    goto :goto_0
.end method
