.class final Lcom/google/common/a/bg;
.super Lcom/google/common/a/cn;
.source "ComputingConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/cn",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/common/a/bj;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/bj",
            "<TK;TV;>;II)V"
        }
    .end annotation

    .prologue
    .line 75
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/cn;-><init>(Lcom/google/common/a/bj;II)V

    .line 76
    return-void
.end method


# virtual methods
.method a(Ljava/lang/Object;ILcom/google/common/a/cm;Lcom/google/common/a/bh;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/bh",
            "<TK;TV;>;)TV;"
        }
    .end annotation

    .prologue
    const-wide/16 v3, 0x0

    .line 176
    const/4 v1, 0x0

    .line 177
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 183
    :try_start_0
    monitor-enter p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 184
    :try_start_1
    invoke-virtual {p4, p1, p2}, Lcom/google/common/a/bh;->a(Ljava/lang/Object;I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    .line 185
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-wide v1

    .line 186
    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 187
    if-eqz v5, :cond_0

    .line 189
    const/4 v0, 0x1

    :try_start_4
    invoke-virtual {p0, p1, p2, v5, v0}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    .line 190
    if-eqz v0, :cond_0

    .line 192
    sget-object v0, Lcom/google/common/a/ic;->REPLACED:Lcom/google/common/a/ic;

    invoke-virtual {p0, p1, p2, v5, v0}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/common/a/ic;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 197
    :cond_0
    cmp-long v0, v1, v3

    if-nez v0, :cond_1

    .line 198
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 200
    :cond_1
    if-nez v5, :cond_2

    .line 201
    invoke-virtual {p0, p1, p2, p4}, Lcom/google/common/a/bg;->b(Ljava/lang/Object;ILcom/google/common/a/dd;)Z

    :cond_2
    return-object v5

    .line 186
    :catchall_0
    move-exception v0

    move-object v5, v1

    move-wide v1, v3

    :goto_0
    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 197
    :catchall_1
    move-exception v0

    :goto_1
    cmp-long v1, v1, v3

    if-nez v1, :cond_3

    .line 198
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 200
    :cond_3
    if-nez v5, :cond_4

    .line 201
    invoke-virtual {p0, p1, p2, p4}, Lcom/google/common/a/bg;->b(Ljava/lang/Object;ILcom/google/common/a/dd;)Z

    :cond_4
    throw v0

    .line 197
    :catchall_2
    move-exception v0

    move-object v5, v1

    move-wide v1, v3

    goto :goto_1

    .line 186
    :catchall_3
    move-exception v0

    move-wide v1, v3

    goto :goto_0

    :catchall_4
    move-exception v0

    goto :goto_0
.end method

.method a(Ljava/lang/Object;ILcom/google/common/base/Function;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/google/common/base/Function",
            "<-TK;+TV;>;)TV;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 83
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;I)Lcom/google/common/a/cm;

    move-result-object v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    invoke-virtual {p0, v1}, Lcom/google/common/a/bg;->f(Lcom/google/common/a/cm;)Ljava/lang/Object;

    move-result-object v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    invoke-virtual {p0, v1}, Lcom/google/common/a/bg;->a(Lcom/google/common/a/cm;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 169
    invoke-virtual {p0}, Lcom/google/common/a/bg;->n()V

    :goto_0
    return-object v0

    .line 94
    :cond_1
    if-eqz v1, :cond_2

    :try_start_1
    invoke-interface {v1}, Lcom/google/common/a/cm;->getValueReference()Lcom/google/common/a/dd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/dd;->b()Z

    move-result v0

    if-nez v0, :cond_9

    .line 96
    :cond_2
    const/4 v4, 0x0

    .line 97
    invoke-virtual {p0}, Lcom/google/common/a/bg;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    :try_start_2
    invoke-virtual {p0}, Lcom/google/common/a/bg;->o()V

    .line 101
    iget v0, p0, Lcom/google/common/a/bg;->b:I

    add-int/lit8 v6, v0, -0x1

    .line 102
    iget-object v7, p0, Lcom/google/common/a/bg;->e:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 103
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    and-int v8, p2, v0

    .line 104
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/cm;

    move-object v5, v0

    .line 106
    :goto_1
    if-eqz v5, :cond_c

    .line 107
    invoke-interface {v5}, Lcom/google/common/a/cm;->getKey()Ljava/lang/Object;

    move-result-object v9

    .line 108
    invoke-interface {v5}, Lcom/google/common/a/cm;->getHash()I

    move-result v1

    if-ne v1, p2, :cond_6

    if-eqz v9, :cond_6

    iget-object v1, p0, Lcom/google/common/a/bg;->a:Lcom/google/common/a/bj;

    iget-object v1, v1, Lcom/google/common/a/bj;->f:Lcom/google/common/base/Equivalence;

    invoke-virtual {v1, p1, v9}, Lcom/google/common/base/Equivalence;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 110
    invoke-interface {v5}, Lcom/google/common/a/cm;->getValueReference()Lcom/google/common/a/dd;

    move-result-object v1

    .line 111
    invoke-interface {v1}, Lcom/google/common/a/dd;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    move v6, v3

    .line 135
    :goto_2
    if-eqz v6, :cond_b

    .line 136
    new-instance v1, Lcom/google/common/a/bh;

    invoke-direct {v1, p3}, Lcom/google/common/a/bh;-><init>(Lcom/google/common/base/Function;)V

    .line 138
    if-nez v5, :cond_7

    .line 139
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILcom/google/common/a/cm;)Lcom/google/common/a/cm;

    move-result-object v0

    .line 140
    invoke-interface {v0, v1}, Lcom/google/common/a/cm;->setValueReference(Lcom/google/common/a/dd;)V

    .line 141
    invoke-virtual {v7, v8, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    :goto_3
    :try_start_3
    invoke-virtual {p0}, Lcom/google/common/a/bg;->unlock()V

    .line 148
    invoke-virtual {p0}, Lcom/google/common/a/bg;->p()V

    .line 151
    if-eqz v6, :cond_8

    .line 153
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILcom/google/common/a/cm;Lcom/google/common/a/bh;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v0

    .line 169
    invoke-virtual {p0}, Lcom/google/common/a/bg;->n()V

    goto :goto_0

    .line 114
    :cond_3
    :try_start_4
    invoke-interface {v5}, Lcom/google/common/a/cm;->getValueReference()Lcom/google/common/a/dd;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/common/a/dd;->get()Ljava/lang/Object;

    move-result-object v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    sget-object v10, Lcom/google/common/a/ic;->COLLECTED:Lcom/google/common/a/ic;

    invoke-virtual {p0, v9, p2, v1, v10}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/common/a/ic;)V

    .line 127
    :goto_4
    iget-object v1, p0, Lcom/google/common/a/bg;->k:Ljava/util/Queue;

    invoke-interface {v1, v5}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 128
    iget-object v1, p0, Lcom/google/common/a/bg;->l:Ljava/util/Queue;

    invoke-interface {v1, v5}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 129
    iput v6, p0, Lcom/google/common/a/bg;->b:I

    move v6, v2

    .line 131
    goto :goto_2

    .line 117
    :cond_4
    iget-object v10, p0, Lcom/google/common/a/bg;->a:Lcom/google/common/a/bj;

    invoke-virtual {v10}, Lcom/google/common/a/bj;->b()Z

    move-result v10

    if-eqz v10, :cond_5

    iget-object v10, p0, Lcom/google/common/a/bg;->a:Lcom/google/common/a/bj;

    invoke-virtual {v10, v5}, Lcom/google/common/a/bj;->c(Lcom/google/common/a/cm;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 120
    sget-object v10, Lcom/google/common/a/ic;->EXPIRED:Lcom/google/common/a/ic;

    invoke-virtual {p0, v9, p2, v1, v10}, Lcom/google/common/a/bg;->a(Ljava/lang/Object;ILjava/lang/Object;Lcom/google/common/a/ic;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    .line 147
    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {p0}, Lcom/google/common/a/bg;->unlock()V

    .line 148
    invoke-virtual {p0}, Lcom/google/common/a/bg;->p()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 169
    :catchall_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/common/a/bg;->n()V

    throw v0

    .line 122
    :cond_5
    :try_start_6
    invoke-virtual {p0, v5}, Lcom/google/common/a/bg;->b(Lcom/google/common/a/cm;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 147
    :try_start_7
    invoke-virtual {p0}, Lcom/google/common/a/bg;->unlock()V

    .line 148
    invoke-virtual {p0}, Lcom/google/common/a/bg;->p()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 169
    invoke-virtual {p0}, Lcom/google/common/a/bg;->n()V

    move-object v0, v1

    goto/16 :goto_0

    .line 106
    :cond_6
    :try_start_8
    invoke-interface {v5}, Lcom/google/common/a/cm;->getNext()Lcom/google/common/a/cm;

    move-result-object v5

    goto/16 :goto_1

    .line 143
    :cond_7
    invoke-interface {v5, v1}, Lcom/google/common/a/cm;->setValueReference(Lcom/google/common/a/dd;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object v0, v5

    goto :goto_3

    :cond_8
    move-object v1, v0

    .line 158
    :cond_9
    :try_start_9
    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    move v0, v2

    :goto_5
    const-string v4, "Recursive computation"

    invoke-static {v0, v4}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 160
    invoke-interface {v1}, Lcom/google/common/a/cm;->getValueReference()Lcom/google/common/a/dd;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/dd;->c()Ljava/lang/Object;

    move-result-object v0

    .line 161
    if-eqz v0, :cond_0

    .line 162
    invoke-virtual {p0, v1}, Lcom/google/common/a/bg;->a(Lcom/google/common/a/cm;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 169
    invoke-virtual {p0}, Lcom/google/common/a/bg;->n()V

    goto/16 :goto_0

    :cond_a
    move v0, v3

    .line 158
    goto :goto_5

    :cond_b
    move-object v1, v4

    move-object v0, v5

    goto/16 :goto_3

    :cond_c
    move v6, v2

    goto/16 :goto_2
.end method
