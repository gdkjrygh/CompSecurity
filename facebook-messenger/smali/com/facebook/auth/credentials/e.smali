.class Lcom/facebook/auth/credentials/e;
.super Ljava/lang/Object;
.source "SessionCookie.java"


# instance fields
.field final synthetic a:Lcom/facebook/auth/credentials/SessionCookie;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/auth/credentials/SessionCookie;)V
    .locals 1

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/auth/credentials/e;->a:Lcom/facebook/auth/credentials/SessionCookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/auth/credentials/e;->b:Ljava/util/List;

    .line 73
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/auth/credentials/e;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/auth/credentials/e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/auth/credentials/e;
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/auth/credentials/e;->b:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 92
    const-string v0, "; "

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/credentials/e;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
