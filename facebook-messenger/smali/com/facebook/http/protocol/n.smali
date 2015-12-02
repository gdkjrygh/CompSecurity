.class public Lcom/facebook/http/protocol/n;
.super Ljava/lang/Object;
.source "ApiRequest.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/http/protocol/t;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/Object;

.field private final h:Z

.field private final i:Z

.field private final j:Lcom/facebook/http/protocol/o;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/p;)V
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->a:Ljava/lang/String;

    .line 91
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->b:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->c:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->d:Lcom/google/common/a/es;

    .line 94
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->e()Lcom/facebook/http/protocol/t;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->e:Lcom/facebook/http/protocol/t;

    .line 95
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->f()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->f:Ljava/util/List;

    .line 96
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->g:Ljava/lang/Object;

    .line 97
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/http/protocol/n;->h:Z

    .line 98
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/http/protocol/n;->i:Z

    .line 99
    invoke-virtual {p1}, Lcom/facebook/http/protocol/p;->j()Lcom/facebook/http/protocol/o;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->j:Lcom/facebook/http/protocol/o;

    .line 100
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;",
            "Lcom/facebook/http/protocol/t;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/facebook/http/protocol/n;->a:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Lcom/facebook/http/protocol/n;->b:Ljava/lang/String;

    .line 75
    iput-object p3, p0, Lcom/facebook/http/protocol/n;->c:Ljava/lang/String;

    .line 76
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->d:Lcom/google/common/a/es;

    .line 77
    iput-object p5, p0, Lcom/facebook/http/protocol/n;->e:Lcom/facebook/http/protocol/t;

    .line 78
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->f:Ljava/util/List;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->g:Ljava/lang/Object;

    .line 80
    iput-boolean v1, p0, Lcom/facebook/http/protocol/n;->h:Z

    .line 81
    iput-boolean v1, p0, Lcom/facebook/http/protocol/n;->i:Z

    .line 82
    sget-object v0, Lcom/facebook/http/protocol/o;->MULTI_PART_ENTITY:Lcom/facebook/http/protocol/o;

    iput-object v0, p0, Lcom/facebook/http/protocol/n;->j:Lcom/facebook/http/protocol/o;

    .line 83
    return-void
.end method

.method public static newBuilder()Lcom/facebook/http/protocol/p;
    .locals 1

    .prologue
    .line 108
    new-instance v0, Lcom/facebook/http/protocol/p;

    invoke-direct {v0}, Lcom/facebook/http/protocol/p;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;"
        }
    .end annotation

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/http/protocol/n;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    const/4 v0, 0x0

    .line 157
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->f:Ljava/util/List;

    goto :goto_0
.end method

.method public f()Lcom/facebook/http/protocol/t;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->e:Lcom/facebook/http/protocol/t;

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 189
    iget-boolean v0, p0, Lcom/facebook/http/protocol/n;->h:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lcom/facebook/http/protocol/n;->i:Z

    return v0
.end method

.method public j()Lcom/facebook/http/protocol/o;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/http/protocol/n;->j:Lcom/facebook/http/protocol/o;

    return-object v0
.end method
