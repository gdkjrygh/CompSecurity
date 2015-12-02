.class public Lcom/google/inject/f;
.super Ljava/lang/Object;
.source "TypeLiteral.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<-TT;>;"
        }
    .end annotation
.end field

.field final c:Ljava/lang/reflect/Type;

.field final d:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/f;->a(Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    .line 81
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/f;->b:Ljava/lang/Class;

    .line 82
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/google/inject/f;->d:I

    .line 83
    return-void
.end method

.method constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const-string v0, "type"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    .line 91
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/f;->b:Ljava/lang/Class;

    .line 92
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/google/inject/f;->d:I

    .line 93
    return-void
.end method

.method public static a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/google/inject/f",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 158
    new-instance v0, Lcom/google/inject/f;

    invoke-direct {v0, p0}, Lcom/google/inject/f;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method static a(Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 100
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 101
    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    .line 102
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Missing type parameter."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_0
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 105
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method

.method static b(Ljava/lang/Class;)Lcom/google/inject/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/f",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 112
    new-instance v0, Lcom/google/inject/f;

    invoke-static {p0}, Lcom/google/inject/f;->a(Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/f;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Class;)Lcom/google/inject/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/f",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 165
    new-instance v0, Lcom/google/inject/f;

    invoke-direct {v0, p0}, Lcom/google/inject/f;-><init>(Ljava/lang/reflect/Type;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<-TT;>;"
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/google/inject/f;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public final b()Ljava/lang/reflect/Type;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 146
    instance-of v0, p1, Lcom/google/inject/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    check-cast p1, Lcom/google/inject/f;

    iget-object v1, p1, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-static {v0, v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 142
    iget v0, p0, Lcom/google/inject/f;->d:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/google/inject/f;->c:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lcom/google/inject/a/d;->c(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
