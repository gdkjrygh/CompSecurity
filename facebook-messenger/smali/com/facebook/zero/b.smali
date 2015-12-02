.class Lcom/facebook/zero/b;
.super Ljava/lang/Object;
.source "ZeroLoginAndConfigurationComponent.java"

# interfaces
.implements Lcom/facebook/http/protocol/v;


# instance fields
.field final synthetic a:Lcom/facebook/zero/a;

.field private final b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/zero/a;Z)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-boolean p2, p0, Lcom/facebook/zero/b;->b:Z

    .line 83
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iget-boolean v0, p0, Lcom/facebook/zero/b;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v0}, Lcom/facebook/zero/a;->a(Lcom/facebook/zero/a;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 100
    :goto_0
    return-object v0

    .line 92
    :cond_0
    new-instance v0, Lcom/facebook/zero/server/FetchZeroTokenParams;

    iget-object v1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v1}, Lcom/facebook/zero/a;->b(Lcom/facebook/zero/a;)Lcom/facebook/zero/server/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/zero/server/d;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v2}, Lcom/facebook/zero/a;->b(Lcom/facebook/zero/a;)Lcom/facebook/zero/server/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/zero/server/d;->b()Lcom/facebook/zero/server/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/zero/server/FetchZeroTokenParams;-><init>(Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;Lcom/facebook/zero/server/c;)V

    .line 96
    iget-object v1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v1}, Lcom/facebook/zero/a;->c(Lcom/facebook/zero/a;)Lcom/facebook/zero/protocol/a/b;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "fetchZeroToken"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 105
    const-string v0, "fetchZeroToken"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/server/FetchZeroTokenResult;

    .line 109
    if-nez v0, :cond_0

    .line 131
    :goto_0
    return-void

    .line 114
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v1}, Lcom/facebook/zero/a;->e(Lcom/facebook/zero/a;)Lcom/facebook/zero/b/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/zero/a/a;->b:Lcom/facebook/zero/b/b;

    iget-object v3, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v3}, Lcom/facebook/zero/a;->d(Lcom/facebook/zero/a;)Lcom/facebook/zero/ui/p;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/zero/server/FetchZeroTokenResult;->d()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/zero/ui/p;->a(Lcom/google/common/a/es;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/zero/b/d;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 119
    iget-object v1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v1}, Lcom/facebook/zero/a;->e(Lcom/facebook/zero/a;)Lcom/facebook/zero/b/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/zero/a/a;->c:Lcom/facebook/zero/b/b;

    iget-object v3, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v3}, Lcom/facebook/zero/a;->f(Lcom/facebook/zero/a;)Lcom/facebook/zero/rewrite/e;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/zero/server/FetchZeroTokenResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/zero/rewrite/e;->a(Lcom/google/common/a/es;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/zero/b/d;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/common/json/jsonmirror/e; {:try_start_0 .. :try_end_0} :catch_1

    .line 130
    :goto_1
    iget-object v1, p0, Lcom/facebook/zero/b;->a:Lcom/facebook/zero/a;

    invoke-static {v1}, Lcom/facebook/zero/a;->g(Lcom/facebook/zero/a;)Lcom/facebook/zero/d/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/zero/d/a;->a(Lcom/facebook/zero/server/FetchZeroTokenResult;)V

    goto :goto_0

    .line 124
    :catch_0
    move-exception v1

    .line 125
    invoke-static {}, Lcom/facebook/zero/a;->a()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Error storing enabled ui features in sync token fetch"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 126
    :catch_1
    move-exception v1

    .line 127
    invoke-static {}, Lcom/facebook/zero/a;->a()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Error storing enabled ui features in sync token fetch"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1
.end method
