.class public Lcom/facebook/http/protocol/p;
.super Ljava/lang/Object;
.source "ApiRequestBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/http/protocol/t;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/Object;

.field private h:Z

.field private i:Z

.field private j:Lcom/facebook/http/protocol/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-object v0, Lcom/facebook/http/protocol/o;->MULTI_PART_ENTITY:Lcom/facebook/http/protocol/o;

    iput-object v0, p0, Lcom/facebook/http/protocol/p;->j:Lcom/facebook/http/protocol/o;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->e:Lcom/facebook/http/protocol/t;

    .line 131
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->a:Ljava/lang/String;

    .line 49
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/http/protocol/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;)",
            "Lcom/facebook/http/protocol/p;"
        }
    .end annotation

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->d:Ljava/util/List;

    .line 109
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->b:Ljava/lang/String;

    .line 69
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/http/protocol/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/a/a/a/a;",
            ">;)",
            "Lcom/facebook/http/protocol/p;"
        }
    .end annotation

    .prologue
    .line 152
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->f:Ljava/util/List;

    .line 153
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/http/protocol/p;->c:Ljava/lang/String;

    .line 89
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->d:Ljava/util/List;

    return-object v0
.end method

.method public e()Lcom/facebook/http/protocol/t;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->e:Lcom/facebook/http/protocol/t;

    return-object v0
.end method

.method public f()Ljava/util/List;
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
    .line 141
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->f:Ljava/util/List;

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 182
    iget-boolean v0, p0, Lcom/facebook/http/protocol/p;->h:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 204
    iget-boolean v0, p0, Lcom/facebook/http/protocol/p;->i:Z

    return v0
.end method

.method public j()Lcom/facebook/http/protocol/o;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/http/protocol/p;->j:Lcom/facebook/http/protocol/o;

    return-object v0
.end method

.method public k()Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 243
    new-instance v0, Lcom/facebook/http/protocol/n;

    invoke-direct {v0, p0}, Lcom/facebook/http/protocol/n;-><init>(Lcom/facebook/http/protocol/p;)V

    return-object v0
.end method
