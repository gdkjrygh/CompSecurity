.class public Lcom/facebook/g/a/a;
.super Ljava/lang/Object;
.source "CustomGraphQLQuery.java"


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
            "Lcom/facebook/g/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/g/a/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/g/a/b;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-virtual {p1}, Lcom/facebook/g/a/b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/a;->a:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Lcom/facebook/g/a/b;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/a;->b:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Lcom/facebook/g/a/b;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/a;->c:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Lcom/facebook/g/a/b;->e()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/a;->d:Lcom/google/common/a/es;

    .line 62
    invoke-virtual {p1}, Lcom/facebook/g/a/b;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/g/a/a;->e:Lcom/google/common/a/es;

    .line 63
    return-void
.end method

.method public static a()Lcom/facebook/g/a/b;
    .locals 2

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/g/a/b;

    invoke-direct {v0}, Lcom/facebook/g/a/b;-><init>()V

    const-string v1, "me()"

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/facebook/g/a/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/g/a/b;"
        }
    .end annotation

    .prologue
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "nodes("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    const-string v1, ","

    invoke-static {v1}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v1

    invoke-virtual {v1, v0, p0}, Lcom/google/common/base/Joiner;->appendTo(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;

    .line 37
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    new-instance v1, Lcom/facebook/g/a/b;

    invoke-direct {v1}, Lcom/facebook/g/a/b;-><init>()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/g/a/b;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 3

    .prologue
    .line 30
    new-instance v0, Lcom/facebook/g/a/b;

    invoke-direct {v0}, Lcom/facebook/g/a/b;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "node("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lcom/facebook/g/a/b;
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/g/a/b;

    invoke-direct {v0}, Lcom/facebook/g/a/b;-><init>()V

    invoke-virtual {v0, p0}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    iget-object v0, p0, Lcom/facebook/g/a/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/g/a/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    iget-object v0, p0, Lcom/facebook/g/a/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/facebook/g/a/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 75
    iget-object v0, p0, Lcom/facebook/g/a/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/facebook/g/a/a;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/g/a/c;

    .line 78
    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v0}, Lcom/facebook/g/a/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string v3, "("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const-string v3, ","

    invoke-static {v3}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/g/a/c;->b()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Lcom/google/common/base/Joiner;->appendTo(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 84
    :cond_2
    iget-object v0, p0, Lcom/facebook/g/a/a;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 85
    const-string v0, " as "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    iget-object v0, p0, Lcom/facebook/g/a/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    :cond_3
    iget-object v0, p0, Lcom/facebook/g/a/a;->e:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 89
    const-string v0, "{"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string v0, ","

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/g/a/a;->e:Lcom/google/common/a/es;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Joiner;->appendTo(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;

    .line 91
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
