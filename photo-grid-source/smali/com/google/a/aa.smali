.class public final Lcom/google/a/aa;
.super Lcom/google/a/x;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/a/b/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/v",
            "<",
            "Lcom/google/a/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/google/a/x;-><init>()V

    .line 37
    new-instance v0, Lcom/google/a/b/v;

    invoke-direct {v0}, Lcom/google/a/b/v;-><init>()V

    iput-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/google/a/x;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0, p1}, Lcom/google/a/b/v;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    iget-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0, p1}, Lcom/google/a/b/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;

    .line 154
    if-nez v0, :cond_0

    sget-object v0, Lcom/google/a/z;->a:Lcom/google/a/z;

    .line 156
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/a/x;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 132
    iget-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0}, Lcom/google/a/b/v;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lcom/google/a/x;)V
    .locals 2

    .prologue
    .line 54
    if-nez p2, :cond_0

    .line 55
    sget-object p2, Lcom/google/a/z;->a:Lcom/google/a/z;

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-static {p1}, Lcom/google/a/b/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0, p2}, Lcom/google/a/b/v;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    return-void
.end method

.method public final b(Ljava/lang/String;)Lcom/google/a/u;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0, p1}, Lcom/google/a/b/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/u;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 191
    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/a/aa;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/a/aa;

    iget-object v0, p1, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    iget-object v1, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0, v1}, Lcom/google/a/b/v;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/google/a/aa;->a:Lcom/google/a/b/v;

    invoke-virtual {v0}, Lcom/google/a/b/v;->hashCode()I

    move-result v0

    return v0
.end method
