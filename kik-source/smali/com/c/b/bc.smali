.class public final Lcom/c/b/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bc$b;,
        Lcom/c/b/bc$d;,
        Lcom/c/b/bc$a;,
        Lcom/c/b/bc$c;
    }
.end annotation


# static fields
.field private static final d:Lcom/c/b/bc;


# instance fields
.field private b:Lcom/c/b/bc$c;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 57
    new-instance v0, Lcom/c/b/bc;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/c/b/bc;-><init>(Ljava/util/Map;)V

    .line 60
    sput-object v0, Lcom/c/b/bc;->d:Lcom/c/b/bc;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/c/b/bc;->c:Z

    .line 61
    return-void
.end method

.method private constructor <init>(Ljava/util/Map;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Lcom/c/b/bc$c;

    invoke-direct {v0, p0, p1}, Lcom/c/b/bc$c;-><init>(Lcom/c/b/bi;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/c/b/bc;->b:Lcom/c/b/bc$c;

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bc;->c:Z

    .line 54
    return-void
.end method

.method private static a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 136
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    .line 137
    check-cast p0, [B

    invoke-static {p0}, Lcom/c/b/ba;->b([B)I

    move-result v0

    .line 142
    :goto_0
    return v0

    .line 139
    :cond_0
    instance-of v0, p0, Lcom/c/b/au$a;

    if-eqz v0, :cond_1

    .line 140
    check-cast p0, Lcom/c/b/au$a;

    invoke-static {p0}, Lcom/c/b/au;->a(Lcom/c/b/au$a;)I

    move-result v0

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method static a(Ljava/util/Map;)I
    .locals 4

    .prologue
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 153
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/c/b/bc;->a(Ljava/lang/Object;)I

    move-result v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bc;->a(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v3

    add-int/2addr v0, v1

    move v1, v0

    .line 155
    goto :goto_0

    .line 156
    :cond_0
    return v1
.end method

.method static a(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 105
    if-ne p0, p1, :cond_0

    move v0, v3

    .line 119
    :goto_0
    return v0

    .line 108
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    move v0, v4

    .line 109
    goto :goto_0

    .line 111
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 112
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    move v0, v4

    .line 113
    goto :goto_0

    .line 115
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v0, v1, [B

    if-eqz v0, :cond_4

    instance-of v0, v2, [B

    if-eqz v0, :cond_4

    move-object v0, v1

    check-cast v0, [B

    move-object v1, v2

    check-cast v1, [B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    :goto_1
    if-nez v0, :cond_2

    move v0, v4

    .line 116
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_5
    move v0, v3

    .line 119
    goto :goto_0
.end method


# virtual methods
.method public final d()V
    .locals 1

    .prologue
    .line 208
    iget-boolean v0, p0, Lcom/c/b/bc;->c:Z

    if-nez v0, :cond_0

    .line 209
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 211
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 128
    instance-of v0, p1, Lcom/c/b/bc;

    if-nez v0, :cond_0

    .line 129
    const/4 v0, 0x0

    .line 132
    :goto_0
    return v0

    .line 131
    :cond_0
    check-cast p1, Lcom/c/b/bc;

    .line 132
    iget-object v0, p0, Lcom/c/b/bc;->b:Lcom/c/b/bc$c;

    iget-object v1, p1, Lcom/c/b/bc;->b:Lcom/c/b/bc$c;

    invoke-static {v0, v1}, Lcom/c/b/bc;->a(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/c/b/bc;->b:Lcom/c/b/bc$c;

    invoke-static {v0}, Lcom/c/b/bc;->a(Ljava/util/Map;)I

    move-result v0

    return v0
.end method
