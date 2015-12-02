.class Lcom/facebook/abtest/qe/service/a/c;
.super Lcom/google/common/d/a/a;
.source "SyncQuickExperimentBackgroundTask.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/d/a/a",
        "<",
        "Lcom/facebook/backgroundtasks/b;",
        ">;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/service/a/b;)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/facebook/abtest/qe/service/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 118
    invoke-static {}, Lcom/facebook/abtest/qe/service/a/a;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Finished sucessfully"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 119
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/a/c;->a_(Ljava/lang/Object;)Z

    .line 120
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 112
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/service/a/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 124
    invoke-static {}, Lcom/facebook/abtest/qe/service/a/a;->d()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finished with failure: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 125
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/service/a/c;->a_(Ljava/lang/Object;)Z

    .line 126
    return-void
.end method
