.class public abstract Lcom/c/b/a;
.super Lcom/c/b/b;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bd;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/a$a;
    }
.end annotation


# instance fields
.field protected a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/c/b/b;-><init>()V

    .line 89
    const/4 v0, -0x1

    iput v0, p0, Lcom/c/b/a;->a:I

    .line 281
    return-void
.end method

.method private static a(Ljava/lang/Object;)Lcom/c/b/f;
    .locals 1

    .prologue
    .line 131
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    .line 132
    check-cast p0, [B

    invoke-static {p0}, Lcom/c/b/f;->a([B)Lcom/c/b/f;

    move-result-object p0

    .line 134
    :goto_0
    return-object p0

    :cond_0
    check-cast p0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private static a(Ljava/util/List;)Ljava/util/Map;
    .locals 6

    .prologue
    .line 155
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    .line 169
    :goto_0
    return-object v0

    .line 158
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 159
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 160
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 161
    invoke-interface {v0}, Lcom/c/b/bd;->e()Lcom/c/b/ak$a;

    move-result-object v3

    .line 162
    const-string v4, "key"

    invoke-virtual {v3, v4}, Lcom/c/b/ak$a;->a(Ljava/lang/String;)Lcom/c/b/ak$f;

    move-result-object v4

    .line 163
    const-string v5, "value"

    invoke-virtual {v3, v5}, Lcom/c/b/ak$a;->a(Ljava/lang/String;)Lcom/c/b/ak$f;

    move-result-object v3

    .line 164
    invoke-interface {v0, v4}, Lcom/c/b/bd;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v3}, Lcom/c/b/bd;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 167
    invoke-interface {v0, v4}, Lcom/c/b/bd;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v3}, Lcom/c/b/bd;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 169
    goto :goto_0
.end method

.method private static a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 143
    instance-of v0, p0, [B

    if-eqz v0, :cond_0

    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    .line 144
    check-cast p0, [B

    check-cast p1, [B

    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    .line 146
    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lcom/c/b/a;->a(Ljava/lang/Object;)Lcom/c/b/f;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/a;->a(Ljava/lang/Object;)Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/c/b/h;)V
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/c/b/a;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/c/b/bh;->a(Lcom/c/b/bd;Ljava/util/Map;Lcom/c/b/h;)V

    .line 87
    return-void
.end method

.method public a()Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 55
    invoke-interface {p0}, Lcom/c/b/bg;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    invoke-virtual {v0}, Lcom/c/b/ak$f;->m()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0, v0}, Lcom/c/b/bg;->a(Lcom/c/b/ak$f;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Lcom/c/b/bg;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v4

    sget-object v5, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v4, v5, :cond_2

    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_0

    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()I
    .locals 2

    .prologue
    .line 92
    iget v0, p0, Lcom/c/b/a;->a:I

    .line 93
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 98
    :goto_0
    return v0

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/c/b/a;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/c/b/bh;->a(Lcom/c/b/bd;Ljava/util/Map;)I

    move-result v0

    iput v0, p0, Lcom/c/b/a;->a:I

    .line 98
    iget v0, p0, Lcom/c/b/a;->a:I

    goto :goto_0
.end method

.method final c()Lcom/c/b/bx;
    .locals 1

    .prologue
    .line 271
    invoke-static {p0}, Lcom/c/b/a$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 103
    if-ne p1, p0, :cond_1

    move v3, v4

    .line 113
    :cond_0
    :goto_0
    return v3

    .line 106
    :cond_1
    instance-of v0, p1, Lcom/c/b/bd;

    if-eqz v0, :cond_0

    .line 109
    check-cast p1, Lcom/c/b/bd;

    .line 110
    invoke-virtual {p0}, Lcom/c/b/a;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-interface {p1}, Lcom/c/b/bd;->e()Lcom/c/b/ak$a;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/c/b/a;->d_()Ljava/util/Map;

    move-result-object v5

    invoke-interface {p1}, Lcom/c/b/bd;->d_()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v1

    if-eq v0, v1, :cond_2

    move v0, v3

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/c/b/a;->f()Lcom/c/b/by;

    move-result-object v0

    invoke-interface {p1}, Lcom/c/b/bd;->f()Lcom/c/b/by;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/by;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v3, v4

    goto :goto_0

    :cond_2
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    move v0, v3

    goto :goto_1

    :cond_4
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v8

    sget-object v9, Lcom/c/b/ak$f$b;->l:Lcom/c/b/ak$f$b;

    if-ne v8, v9, :cond_8

    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    move-object v0, v1

    check-cast v0, Ljava/util/List;

    move-object v1, v2

    check-cast v1, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-eq v2, v8, :cond_5

    move v0, v3

    goto :goto_1

    :cond_5
    move v2, v3

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    if-ge v2, v8, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/c/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    move v0, v3

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    invoke-static {v1, v2}, Lcom/c/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Lcom/c/b/ak$f;->l()Z

    move-result v0

    if-eqz v0, :cond_9

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lcom/c/b/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lcom/c/b/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/bc;->a(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v3

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v3

    goto/16 :goto_1

    :cond_a
    move v0, v4

    goto/16 :goto_1
.end method

.method public hashCode()I
    .locals 6

    .prologue
    .line 119
    iget v0, p0, Lcom/c/b/a;->b:I

    .line 120
    if-nez v0, :cond_4

    .line 121
    invoke-virtual {p0}, Lcom/c/b/a;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 123
    invoke-virtual {p0}, Lcom/c/b/a;->d_()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 v2, v2, 0x25

    invoke-virtual {v1}, Lcom/c/b/ak$f;->e()I

    move-result v4

    add-int/2addr v2, v4

    invoke-virtual {v1}, Lcom/c/b/ak$f;->l()Z

    move-result v4

    if-eqz v4, :cond_0

    mul-int/lit8 v1, v2, 0x35

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/c/b/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bc;->a(Ljava/util/Map;)I

    move-result v0

    add-int/2addr v0, v1

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v4

    sget-object v5, Lcom/c/b/ak$f$b;->n:Lcom/c/b/ak$f$b;

    if-eq v4, v5, :cond_1

    mul-int/lit8 v1, v2, 0x35

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    move v2, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_2

    check-cast v0, Ljava/util/List;

    mul-int/lit8 v1, v2, 0x35

    invoke-static {v0}, Lcom/c/b/au;->a(Ljava/util/List;)I

    move-result v0

    add-int/2addr v0, v1

    move v2, v0

    goto :goto_0

    :cond_2
    mul-int/lit8 v1, v2, 0x35

    check-cast v0, Lcom/c/b/au$a;

    invoke-static {v0}, Lcom/c/b/au;->a(Lcom/c/b/au$a;)I

    move-result v0

    add-int/2addr v0, v1

    move v2, v0

    goto :goto_0

    .line 124
    :cond_3
    mul-int/lit8 v0, v2, 0x1d

    invoke-virtual {p0}, Lcom/c/b/a;->f()Lcom/c/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/by;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 125
    iput v0, p0, Lcom/c/b/a;->b:I

    .line 127
    :cond_4
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    invoke-static {p0}, Lcom/c/b/bu;->a(Lcom/c/b/bg;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
