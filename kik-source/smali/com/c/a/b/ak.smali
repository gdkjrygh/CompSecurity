.class final Lcom/c/a/b/ak;
.super Lcom/c/a/b/j;
.source "SourceFile"


# instance fields
.field final transient a:Ljava/lang/Object;

.field final transient b:Ljava/lang/Object;

.field transient c:Lcom/c/a/b/j;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/c/a/b/j;-><init>()V

    .line 39
    invoke-static {p1, p2}, Lcom/c/a/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    iput-object p1, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    .line 41
    iput-object p2, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    .line 42
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/c/a/b/j;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/c/a/b/j;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    .line 47
    iput-object p2, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    .line 48
    iput-object p3, p0, Lcom/c/a/b/ak;->c:Lcom/c/a/b/j;

    .line 49
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/b/j;
    .locals 3

    .prologue
    .line 91
    iget-object v0, p0, Lcom/c/a/b/ak;->c:Lcom/c/a/b/j;

    .line 92
    if-nez v0, :cond_0

    .line 93
    new-instance v0, Lcom/c/a/b/ak;

    iget-object v1, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p0}, Lcom/c/a/b/ak;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/c/a/b/j;)V

    iput-object v0, p0, Lcom/c/a/b/ak;->c:Lcom/c/a/b/j;

    .line 96
    :cond_0
    return-object v0
.end method

.method final c()Lcom/c/a/b/v;
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/c/a/b/ac;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/b/v;->a(Ljava/lang/Object;)Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 65
    iget-object v0, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 69
    iget-object v0, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 56
    iget-object v0, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/c/a/b/ak;->b:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final i()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/c/a/b/ak;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/c/a/b/v;->a(Ljava/lang/Object;)Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x1

    return v0
.end method
