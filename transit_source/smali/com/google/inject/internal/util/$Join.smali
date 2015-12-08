.class public final Lcom/google/inject/internal/util/$Join;
.super Ljava/lang/Object;
.source "Join.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$Join$1;,
        Lcom/google/inject/internal/util/$Join$JoinException;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static appendOneEntry(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Map$Entry;)V
    .locals 1
    .param p0, "appendable"    # Ljava/lang/Appendable;
    .param p1, "keyValueSeparator"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Appendable;",
            "Ljava/lang/String;",
            "Ljava/util/Map$Entry",
            "<**>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 287
    .local p2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Join;->appendOneToken(Ljava/lang/Appendable;Ljava/lang/Object;)V

    .line 288
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 289
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Join;->appendOneToken(Ljava/lang/Appendable;Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method private static appendOneToken(Ljava/lang/Appendable;Ljava/lang/Object;)V
    .locals 1
    .param p0, "appendable"    # Ljava/lang/Appendable;
    .param p1, "token"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 294
    invoke-static {p1}, Lcom/google/inject/internal/util/$Join;->toCharSequence(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 295
    return-void
.end method

.method public static join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/Appendable;
    .locals 1
    .param p1, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ">(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable",
            "<*>;)TT;"
        }
    .end annotation

    .prologue
    .line 162
    .local p0, "appendable":Ljava/lang/Appendable;, "TT;"
    .local p2, "tokens":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Iterator;)Ljava/lang/Appendable;

    move-result-object v0

    return-object v0
.end method

.method public static varargs join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Appendable;
    .locals 1
    .param p1, "delimiter"    # Ljava/lang/String;
    .param p2, "firstToken"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .param p3, "otherTokens"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ">(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 205
    .local p0, "appendable":Ljava/lang/Appendable;, "TT;"
    invoke-static {p3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    invoke-static {p2, p3}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/Appendable;

    move-result-object v0

    return-object v0
.end method

.method public static join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Appendable;
    .locals 4
    .param p1, "keyValueSeparator"    # Ljava/lang/String;
    .param p2, "entryDelimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ">(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<**>;)TT;"
        }
    .end annotation

    .prologue
    .line 266
    .local p0, "appendable":Ljava/lang/Appendable;, "TT;"
    .local p3, "map":Ljava/util/Map;, "Ljava/util/Map<**>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    invoke-static {p2}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 270
    .local v1, "entries":Ljava/util/Iterator;, "Ljava/util/Iterator<+Ljava/util/Map$Entry<**>;>;"
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 272
    :try_start_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {p0, p1, v2}, Lcom/google/inject/internal/util/$Join;->appendOneEntry(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Map$Entry;)V

    .line 273
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 274
    invoke-interface {p0, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 275
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {p0, p1, v2}, Lcom/google/inject/internal/util/$Join;->appendOneEntry(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Map$Entry;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 277
    :catch_0
    move-exception v0

    .line 278
    .local v0, "e":Ljava/io/IOException;
    new-instance v2, Lcom/google/inject/internal/util/$Join$JoinException;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/inject/internal/util/$Join$JoinException;-><init>(Ljava/io/IOException;Lcom/google/inject/internal/util/$Join$1;)V

    throw v2

    .line 281
    .end local v0    # "e":Ljava/io/IOException;
    :cond_0
    return-object p0
.end method

.method public static join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Iterator;)Ljava/lang/Appendable;
    .locals 3
    .param p1, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ">(TT;",
            "Ljava/lang/String;",
            "Ljava/util/Iterator",
            "<*>;)TT;"
        }
    .end annotation

    .prologue
    .line 230
    .local p0, "appendable":Ljava/lang/Appendable;, "TT;"
    .local p2, "tokens":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 234
    :try_start_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/inject/internal/util/$Join;->appendOneToken(Ljava/lang/Appendable;Ljava/lang/Object;)V

    .line 235
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 237
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/google/inject/internal/util/$Join;->appendOneToken(Ljava/lang/Appendable;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 239
    :catch_0
    move-exception v0

    .line 240
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Lcom/google/inject/internal/util/$Join$JoinException;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/inject/internal/util/$Join$JoinException;-><init>(Ljava/io/IOException;Lcom/google/inject/internal/util/$Join$1;)V

    throw v1

    .line 243
    .end local v0    # "e":Ljava/io/IOException;
    :cond_0
    return-object p0
.end method

.method public static join(Ljava/lang/Appendable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Appendable;
    .locals 1
    .param p1, "delimiter"    # Ljava/lang/String;
    .param p2, "tokens"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Appendable;",
            ">(TT;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 183
    .local p0, "appendable":Ljava/lang/Appendable;, "TT;"
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/Appendable;

    move-result-object v0

    return-object v0
.end method

.method public static join(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 1
    .param p0, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 56
    .local p1, "tokens":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/String;Ljava/util/Iterator;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs join(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0, "delimiter"    # Ljava/lang/String;
    .param p1, "firstToken"    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .param p2, "otherTokens"    # [Ljava/lang/Object;

    .prologue
    .line 95
    invoke-static {p2}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    invoke-static {p1, p2}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static join(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p0, "keyValueSeparator"    # Ljava/lang/String;
    .param p1, "entryDelimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<**>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 140
    .local p2, "map":Ljava/util/Map;, "Ljava/util/Map<**>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p0, p1, p2}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Appendable;

    move-result-object v0

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static join(Ljava/lang/String;Ljava/util/Iterator;)Ljava/lang/String;
    .locals 2
    .param p0, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Iterator",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 115
    .local p1, "tokens":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .local v0, "sb":Ljava/lang/StringBuilder;
    invoke-static {v0, p0, p1}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/Appendable;Ljava/lang/String;Ljava/util/Iterator;)Ljava/lang/Appendable;

    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static join(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0, "delimiter"    # Ljava/lang/String;
    .param p1, "tokens"    # [Ljava/lang/Object;

    .prologue
    .line 75
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/internal/util/$Join;->join(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static toCharSequence(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "token"    # Ljava/lang/Object;

    .prologue
    .line 298
    instance-of v0, p0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/CharSequence;

    .end local p0    # "token":Ljava/lang/Object;
    :goto_0
    return-object p0

    .restart local p0    # "token":Ljava/lang/Object;
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method
