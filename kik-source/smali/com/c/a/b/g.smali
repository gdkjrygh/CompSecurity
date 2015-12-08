.class final Lcom/c/a/b/g;
.super Lcom/c/a/b/v;
.source "SourceFile"


# static fields
.field static final a:Lcom/c/a/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/c/a/b/g;

    invoke-direct {v0}, Lcom/c/a/b/g;-><init>()V

    sput-object v0, Lcom/c/a/b/g;->a:Lcom/c/a/b/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/c/a/b/v;-><init>()V

    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 0

    .prologue
    .line 64
    return p2
.end method

.method public final a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 55
    invoke-static {}, Lcom/c/a/b/w;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 69
    invoke-static {}, Lcom/c/a/b/m;->f()Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 47
    const/4 v0, 0x0

    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 51
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 73
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 74
    check-cast p1, Ljava/util/Set;

    .line 75
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    .line 77
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 31
    invoke-static {}, Lcom/c/a/b/w;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    const-string v0, "[]"

    return-object v0
.end method
