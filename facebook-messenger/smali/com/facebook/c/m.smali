.class public abstract Lcom/facebook/c/m;
.super Lcom/facebook/c/q;
.source "FacebookOnlySecureBroadcastReceiver.java"


# instance fields
.field private final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 76
    invoke-direct {p0}, Lcom/facebook/c/q;-><init>()V

    .line 77
    invoke-static {p1}, Lcom/google/common/a/fi;->a(Ljava/lang/Iterable;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/c/m;->a:Lcom/google/common/a/fi;

    .line 78
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 73
    invoke-static {p1}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/c/m;-><init>(Ljava/lang/Iterable;)V

    .line 74
    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;Ljava/lang/String;)V
.end method

.method protected final b(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/common/base/Optional;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 88
    invoke-virtual {p0, p1}, Lcom/facebook/c/m;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 89
    const-class v1, Lcom/facebook/c/l;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/l;

    .line 92
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 93
    iget-object v1, p0, Lcom/facebook/c/m;->a:Lcom/google/common/a/fi;

    invoke-virtual {v1}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 94
    invoke-virtual {v0, v1}, Lcom/facebook/c/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 96
    new-instance v0, Lcom/facebook/c/n;

    invoke-direct {v0, p0, v1}, Lcom/facebook/c/n;-><init>(Lcom/facebook/c/m;Ljava/lang/String;)V

    .line 102
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    .line 106
    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0
.end method

.method public final b()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/c/m;->a:Lcom/google/common/a/fi;

    return-object v0
.end method
