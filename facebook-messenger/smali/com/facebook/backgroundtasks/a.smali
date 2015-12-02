.class public abstract Lcom/facebook/backgroundtasks/a;
.super Ljava/lang/Object;
.source "AbstractBackgroundTask.java"

# interfaces
.implements Lcom/facebook/backgroundtasks/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcom/facebook/backgroundtasks/q;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/backgroundtasks/a;->a:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 48
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/backgroundtasks/q;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/backgroundtasks/a;->b:Lcom/facebook/backgroundtasks/q;

    .line 25
    return-void
.end method

.method protected e()Lcom/facebook/backgroundtasks/q;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/backgroundtasks/a;->b:Lcom/facebook/backgroundtasks/q;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/backgroundtasks/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 38
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 2

    .prologue
    .line 53
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method protected j()V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/backgroundtasks/a;->b:Lcom/facebook/backgroundtasks/q;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/facebook/backgroundtasks/a;->b:Lcom/facebook/backgroundtasks/q;

    invoke-interface {v0}, Lcom/facebook/backgroundtasks/q;->b()V

    .line 60
    :cond_0
    return-void
.end method
