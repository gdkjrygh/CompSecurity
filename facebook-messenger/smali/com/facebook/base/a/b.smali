.class Lcom/facebook/base/a/b;
.super Ljava/lang/Object;
.source "AbstractApplicationLike.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/debug/d/e;

.field final synthetic b:Lcom/facebook/common/process/c;

.field final synthetic c:Lcom/facebook/base/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/base/a/a;Lcom/facebook/debug/d/e;Lcom/facebook/common/process/c;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/base/a/b;->c:Lcom/facebook/base/a/a;

    iput-object p2, p0, Lcom/facebook/base/a/b;->a:Lcom/facebook/debug/d/e;

    iput-object p3, p0, Lcom/facebook/base/a/b;->b:Lcom/facebook/common/process/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 84
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/base/a/b;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 93
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 3

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/base/a/b;->c:Lcom/facebook/base/a/a;

    invoke-static {v0}, Lcom/facebook/base/a/a;->a(Lcom/facebook/base/a/a;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/debug/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/a/a;

    iget-object v1, p0, Lcom/facebook/base/a/b;->a:Lcom/facebook/debug/d/e;

    invoke-virtual {v0, v1}, Lcom/facebook/debug/a/a;->a(Lcom/facebook/debug/d/e;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/base/a/b;->c:Lcom/facebook/base/a/a;

    iget-object v1, p0, Lcom/facebook/base/a/b;->c:Lcom/facebook/base/a/a;

    invoke-static {v1}, Lcom/facebook/base/a/a;->a(Lcom/facebook/base/a/a;)Lcom/facebook/inject/t;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/base/a/b;->b:Lcom/facebook/common/process/c;

    invoke-static {v0, v1, v2}, Lcom/facebook/base/a/a;->a(Lcom/facebook/base/a/a;Lcom/facebook/inject/t;Lcom/facebook/common/process/c;)V

    .line 89
    return-void
.end method
