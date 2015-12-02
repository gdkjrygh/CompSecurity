.class public Lcom/facebook/g/a/b;
.super Ljava/lang/Object;
.source "CustomGraphQLQueryBuilder.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lcom/google/common/a/et;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/g/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/common/a/et;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/g/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/b;->e:Lcom/google/common/a/et;

    .line 20
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/b;->d:Lcom/google/common/a/et;

    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/g/a/b;->e:Lcom/google/common/a/et;

    invoke-virtual {v0, p1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 43
    return-object p0
.end method

.method public a(Lcom/facebook/g/a/c;)Lcom/facebook/g/a/b;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/g/a/b;->d:Lcom/google/common/a/et;

    invoke-virtual {v0, p1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 72
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/g/a/b;->a:Ljava/lang/String;

    .line 25
    return-object p0
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;
    .locals 1

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/g/a/c;

    invoke-direct {v0, p1, p2}, Lcom/facebook/g/a/c;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/c;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/g/a/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/g/a/b;->b:Ljava/lang/String;

    .line 34
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/g/a/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 1

    .prologue
    .line 47
    new-instance v0, Lcom/facebook/g/a/b;

    invoke-direct {v0}, Lcom/facebook/g/a/b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 50
    invoke-virtual {p0, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/g/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/g/a/b;->e:Lcom/google/common/a/et;

    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/g/a/b;->c:Ljava/lang/String;

    .line 59
    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/g/a/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/g/a/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/g/a/b;->d:Lcom/google/common/a/et;

    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/facebook/g/a/a;
    .locals 1

    .prologue
    .line 80
    new-instance v0, Lcom/facebook/g/a/a;

    invoke-direct {v0, p0}, Lcom/facebook/g/a/a;-><init>(Lcom/facebook/g/a/b;)V

    return-object v0
.end method
