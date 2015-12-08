.class final Lcom/c/b/bh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bh$1;,
        Lcom/c/b/bh$b;,
        Lcom/c/b/bh$a;,
        Lcom/c/b/bh$c;
    }
.end annotation


# direct methods
.method static a(Lcom/c/b/bd;Ljava/util/Map;)I
    .locals 7

    .prologue
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-interface {p0}, Lcom/c/b/bd;->e()Lcom/c/b/ak$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/i$s;->i()Z

    move-result v3

    .line 94
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 95
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    .line 96
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 97
    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->s()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v5

    sget-object v6, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-ne v5, v6, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v5

    if-nez v5, :cond_0

    .line 100
    invoke-virtual {v1}, Lcom/c/b/ak$f;->e()I

    move-result v1

    check-cast v0, Lcom/c/b/bd;

    invoke-static {v1, v0}, Lcom/c/b/h;->e(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    .line 103
    :cond_0
    invoke-static {v1, v0}, Lcom/c/b/ar;->c(Lcom/c/b/ar$a;Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v2

    move v2, v0

    .line 105
    goto :goto_0

    .line 107
    :cond_1
    invoke-interface {p0}, Lcom/c/b/bd;->f()Lcom/c/b/by;

    move-result-object v0

    .line 108
    if-eqz v3, :cond_2

    .line 109
    invoke-virtual {v0}, Lcom/c/b/by;->g()I

    move-result v0

    add-int/2addr v0, v2

    .line 113
    :goto_1
    return v0

    .line 111
    :cond_2
    invoke-virtual {v0}, Lcom/c/b/by;->b()I

    move-result v0

    add-int/2addr v0, v2

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;Lcom/c/b/ak$f;I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/c/b/ak$f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 174
    :goto_0
    const/4 v1, -0x1

    if-eq p2, v1, :cond_0

    .line 175
    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    :cond_0
    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 172
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method static a(Lcom/c/b/bg;)Ljava/util/List;
    .locals 2

    .prologue
    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    const-string v1, ""

    invoke-static {p0, v1, v0}, Lcom/c/b/bh;->a(Lcom/c/b/bg;Ljava/lang/String;Ljava/util/List;)V

    .line 225
    return-object v0
.end method

.method static a(Lcom/c/b/bd;Ljava/util/Map;Lcom/c/b/h;)V
    .locals 6

    .prologue
    .line 54
    invoke-interface {p0}, Lcom/c/b/bd;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v2

    .line 56
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 67
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    .line 68
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 69
    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->s()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v4

    sget-object v5, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-ne v4, v5, :cond_0

    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v4

    if-nez v4, :cond_0

    .line 72
    invoke-virtual {v1}, Lcom/c/b/ak$f;->e()I

    move-result v1

    check-cast v0, Lcom/c/b/bd;

    invoke-virtual {p2, v1, v0}, Lcom/c/b/h;->c(ILcom/c/b/be;)V

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {v1, v0, p2}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;Lcom/c/b/h;)V

    goto :goto_0

    .line 78
    :cond_1
    invoke-interface {p0}, Lcom/c/b/bd;->f()Lcom/c/b/by;

    move-result-object v0

    .line 79
    if-eqz v2, :cond_2

    .line 80
    invoke-virtual {v0, p2}, Lcom/c/b/by;->b(Lcom/c/b/h;)V

    .line 84
    :goto_1
    return-void

    .line 82
    :cond_2
    invoke-virtual {v0, p2}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    goto :goto_1
.end method

.method private static a(Lcom/c/b/bg;Ljava/lang/String;Ljava/util/List;)V
    .locals 6

    .prologue
    .line 187
    invoke-interface {p0}, Lcom/c/b/bg;->e()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 188
    invoke-virtual {v0}, Lcom/c/b/ak$f;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0, v0}, Lcom/c/b/bg;->a(Lcom/c/b/ak$f;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/c/b/ak$f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 194
    :cond_1
    invoke-interface {p0}, Lcom/c/b/bg;->d_()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 195
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/c/b/ak$f;

    .line 196
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 198
    invoke-virtual {v1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v2

    sget-object v3, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v2, v3, :cond_2

    .line 199
    invoke-virtual {v1}, Lcom/c/b/ak$f;->o()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 200
    const/4 v2, 0x0

    .line 201
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 202
    check-cast v0, Lcom/c/b/bg;

    add-int/lit8 v3, v2, 0x1

    invoke-static {p1, v1, v2}, Lcom/c/b/bh;->a(Ljava/lang/String;Lcom/c/b/ak$f;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, p2}, Lcom/c/b/bh;->a(Lcom/c/b/bg;Ljava/lang/String;Ljava/util/List;)V

    move v2, v3

    .line 205
    goto :goto_2

    .line 207
    :cond_3
    invoke-interface {p0, v1}, Lcom/c/b/bg;->a(Lcom/c/b/ak$f;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 208
    check-cast v0, Lcom/c/b/bg;

    const/4 v2, -0x1

    invoke-static {p1, v1, v2}, Lcom/c/b/bh;->a(Ljava/lang/String;Lcom/c/b/ak$f;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/c/b/bh;->a(Lcom/c/b/bg;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    .line 215
    :cond_4
    return-void
.end method

.method static a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;Lcom/c/b/ak$a;Lcom/c/b/bh$c;I)Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x1

    .line 694
    invoke-virtual {p3}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v0

    if-eqz v0, :cond_9

    sget v0, Lcom/c/b/cd;->a:I

    if-ne p5, v0, :cond_9

    move-object v0, v1

    move v3, v2

    move-object v2, v1

    .line 696
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/c/b/g;->a()I

    move-result v5

    if-eqz v5, :cond_4

    sget v6, Lcom/c/b/cd;->c:I

    if-ne v5, v6, :cond_1

    invoke-virtual {p0}, Lcom/c/b/g;->m()I

    move-result v3

    if-eqz v3, :cond_0

    instance-of v5, p2, Lcom/c/b/ap;

    if-eqz v5, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/c/b/ap;

    invoke-interface {p4, v0, p3, v3}, Lcom/c/b/bh$c;->a(Lcom/c/b/ap;Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget v6, Lcom/c/b/cd;->d:I

    if-ne v5, v6, :cond_3

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/c/b/aq;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    iget-object v5, v0, Lcom/c/b/ap$b;->b:Lcom/c/b/bd;

    invoke-interface {p4, p0, p2, v2, v5}, Lcom/c/b/bh$c;->b(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p4, v2, v5}, Lcom/c/b/bh$c;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    move-object v2, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v5}, Lcom/c/b/g;->b(I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_4
    sget v1, Lcom/c/b/cd;->b:I

    invoke-virtual {p0, v1}, Lcom/c/b/g;->a(I)V

    if-eqz v2, :cond_6

    if-eqz v3, :cond_6

    if-eqz v0, :cond_8

    iget-object v1, v0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    invoke-interface {p4, v1}, Lcom/c/b/bh$c;->a(Lcom/c/b/ak$f;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {}, Lcom/c/b/aq;->c()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_5
    iget-object v0, v0, Lcom/c/b/ap$b;->b:Lcom/c/b/bd;

    invoke-interface {p4, v2, p2, v1, v0}, Lcom/c/b/bh$c;->a(Lcom/c/b/f;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p4, v1, v0}, Lcom/c/b/bh$c;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    :cond_6
    :goto_1
    move v0, v4

    .line 827
    :goto_2
    return v0

    .line 696
    :cond_7
    new-instance v3, Lcom/c/b/aw;

    iget-object v0, v0, Lcom/c/b/ap$b;->b:Lcom/c/b/bd;

    invoke-direct {v3, v0, p2, v2}, Lcom/c/b/aw;-><init>(Lcom/c/b/be;Lcom/c/b/aq;Lcom/c/b/f;)V

    invoke-interface {p4, v1, v3}, Lcom/c/b/bh$c;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_1

    :cond_8
    if-eqz v2, :cond_6

    invoke-static {}, Lcom/c/b/by$b;->a()Lcom/c/b/by$b$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/c/b/by$b$a;->a(Lcom/c/b/f;)Lcom/c/b/by$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/by$b$a;->a()Lcom/c/b/by$b;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Lcom/c/b/by$a;->a(ILcom/c/b/by$b;)Lcom/c/b/by$a;

    goto :goto_1

    .line 701
    :cond_9
    invoke-static {p5}, Lcom/c/b/cd;->a(I)I

    move-result v5

    .line 702
    invoke-static {p5}, Lcom/c/b/cd;->b(I)I

    move-result v6

    .line 707
    invoke-virtual {p3, v6}, Lcom/c/b/ak$a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 713
    instance-of v0, p2, Lcom/c/b/ap;

    if-eqz v0, :cond_b

    move-object v0, p2

    .line 714
    check-cast v0, Lcom/c/b/ap;

    invoke-interface {p4, v0, p3, v6}, Lcom/c/b/bh$c;->a(Lcom/c/b/ap;Lcom/c/b/ak$a;I)Lcom/c/b/ap$b;

    move-result-object v3

    .line 717
    if-eqz v3, :cond_d

    .line 718
    iget-object v0, v3, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    .line 721
    iget-object v1, v3, Lcom/c/b/ap$b;->b:Lcom/c/b/bd;

    .line 722
    if-nez v1, :cond_a

    invoke-virtual {v0}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v3

    sget-object v7, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v3, v7, :cond_a

    .line 725
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Message-typed extension lacked default instance: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/c/b/ak$f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    move-object v3, v0

    .line 741
    :goto_3
    if-eqz v3, :cond_f

    .line 742
    invoke-virtual {v3}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Z)I

    move-result v0

    if-ne v5, v0, :cond_e

    move v0, v2

    .line 756
    :goto_4
    if-eqz v0, :cond_10

    .line 757
    invoke-virtual {p1, p5, p0}, Lcom/c/b/by$a;->a(ILcom/c/b/g;)Z

    move-result v0

    goto :goto_2

    :cond_b
    move-object v3, v1

    .line 731
    goto :goto_3

    .line 733
    :cond_c
    invoke-interface {p4}, Lcom/c/b/bh$c;->a()I

    move-result v0

    sget v3, Lcom/c/b/bh$c$a;->a:I

    if-ne v0, v3, :cond_d

    .line 734
    invoke-virtual {p3, v6}, Lcom/c/b/ak$a;->b(I)Lcom/c/b/ak$f;

    move-result-object v0

    move-object v3, v0

    goto :goto_3

    :cond_d
    move-object v3, v1

    .line 736
    goto :goto_3

    .line 747
    :cond_e
    invoke-virtual {v3}, Lcom/c/b/ak$f;->q()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v3}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/c/b/ar;->a(Lcom/c/b/cd$a;Z)I

    move-result v0

    if-ne v5, v0, :cond_f

    move v0, v2

    move v2, v4

    .line 751
    goto :goto_4

    :cond_f
    move v0, v4

    .line 753
    goto :goto_4

    .line 760
    :cond_10
    if-eqz v2, :cond_15

    .line 761
    invoke-virtual {p0}, Lcom/c/b/g;->s()I

    move-result v0

    .line 762
    invoke-virtual {p0, v0}, Lcom/c/b/g;->c(I)I

    move-result v0

    .line 763
    invoke-virtual {v3}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v1

    sget-object v2, Lcom/c/b/cd$a;->n:Lcom/c/b/cd$a;

    if-ne v1, v2, :cond_13

    .line 764
    :goto_5
    invoke-virtual {p0}, Lcom/c/b/g;->t()I

    move-result v1

    if-lez v1, :cond_14

    .line 765
    invoke-virtual {p0}, Lcom/c/b/g;->n()I

    move-result v1

    .line 766
    invoke-virtual {v3}, Lcom/c/b/ak$f;->d()Lcom/c/b/ak$g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/ak$g;->l()Z

    move-result v2

    if-eqz v2, :cond_11

    .line 767
    invoke-virtual {v3}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v1

    invoke-interface {p4, v3, v1}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_5

    .line 770
    :cond_11
    invoke-virtual {v3}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/c/b/ak$d;->a(I)Lcom/c/b/ak$e;

    move-result-object v1

    .line 771
    if-nez v1, :cond_12

    move v0, v4

    .line 774
    goto/16 :goto_2

    .line 776
    :cond_12
    invoke-interface {p4, v3, v1}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_5

    .line 780
    :cond_13
    :goto_6
    invoke-virtual {p0}, Lcom/c/b/g;->t()I

    move-result v1

    if-lez v1, :cond_14

    .line 781
    invoke-virtual {v3}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v1

    invoke-interface {p4, v3}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;)Lcom/c/b/cd$c;

    move-result-object v2

    invoke-static {p0, v1, v2}, Lcom/c/b/cd;->a(Lcom/c/b/g;Lcom/c/b/cd$a;Lcom/c/b/cd$c;)Ljava/lang/Object;

    move-result-object v1

    .line 783
    invoke-interface {p4, v3, v1}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_6

    .line 786
    :cond_14
    invoke-virtual {p0, v0}, Lcom/c/b/g;->d(I)V

    :goto_7
    move v0, v4

    .line 827
    goto/16 :goto_2

    .line 789
    :cond_15
    sget-object v0, Lcom/c/b/bh$1;->a:[I

    invoke-virtual {v3}, Lcom/c/b/ak$f;->h()Lcom/c/b/ak$f$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/c/b/ak$f$b;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    .line 815
    invoke-virtual {v3}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-interface {p4, v3}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;)Lcom/c/b/cd$c;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/c/b/cd;->a(Lcom/c/b/g;Lcom/c/b/cd$a;Lcom/c/b/cd$c;)Ljava/lang/Object;

    move-result-object v0

    .line 820
    :cond_16
    :goto_8
    invoke-virtual {v3}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 821
    invoke-interface {p4, v3, v0}, Lcom/c/b/bh$c;->b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_7

    .line 791
    :pswitch_0
    invoke-interface {p4, p0, p2, v3, v1}, Lcom/c/b/bh$c;->a(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    .line 796
    :pswitch_1
    invoke-interface {p4, p0, p2, v3, v1}, Lcom/c/b/bh$c;->b(Lcom/c/b/g;Lcom/c/b/aq;Lcom/c/b/ak$f;Lcom/c/b/bd;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    .line 801
    :pswitch_2
    invoke-virtual {p0}, Lcom/c/b/g;->n()I

    move-result v1

    .line 802
    invoke-virtual {v3}, Lcom/c/b/ak$f;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->l()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 803
    invoke-virtual {v3}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/c/b/ak$d;->b(I)Lcom/c/b/ak$e;

    move-result-object v0

    goto :goto_8

    .line 805
    :cond_17
    invoke-virtual {v3}, Lcom/c/b/ak$f;->x()Lcom/c/b/ak$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/c/b/ak$d;->a(I)Lcom/c/b/ak$e;

    move-result-object v0

    .line 808
    if-nez v0, :cond_16

    .line 809
    invoke-virtual {p1, v6, v1}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;

    move v0, v4

    .line 810
    goto/16 :goto_2

    .line 823
    :cond_18
    invoke-interface {p4, v3, v0}, Lcom/c/b/bh$c;->a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bh$c;

    goto :goto_7

    .line 789
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
