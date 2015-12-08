.class public final Lcom/google/inject/internal/util/$Iterators;
.super Ljava/lang/Object;
.source "Iterators.java"


# static fields
.field static final EMPTY_ITERATOR:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final EMPTY_LIST_ITERATOR:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$1;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$Iterators$1;-><init>()V

    sput-object v0, Lcom/google/inject/internal/util/$Iterators;->EMPTY_ITERATOR:Ljava/util/Iterator;

    .line 56
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$2;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$Iterators$2;-><init>()V

    sput-object v0, Lcom/google/inject/internal/util/$Iterators;->EMPTY_LIST_ITERATOR:Ljava/util/ListIterator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static asEnumeration(Ljava/util/Iterator;)Ljava/util/Enumeration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<TT;>;)",
            "Ljava/util/Enumeration",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 311
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TT;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$9;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$Iterators$9;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public static concat(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<+",
            "Ljava/util/Iterator",
            "<+TT;>;>;)",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 163
    .local p0, "inputs":Ljava/util/Iterator;, "Ljava/util/Iterator<+Ljava/util/Iterator<+TT;>;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$4;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$Iterators$4;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public static emptyIterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 53
    sget-object v0, Lcom/google/inject/internal/util/$Iterators;->EMPTY_ITERATOR:Ljava/util/Iterator;

    check-cast v0, Lcom/google/inject/internal/util/$UnmodifiableIterator;

    return-object v0
.end method

.method public static emptyListIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/ListIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 91
    sget-object v0, Lcom/google/inject/internal/util/$Iterators;->EMPTY_LIST_ITERATOR:Ljava/util/ListIterator;

    return-object v0
.end method

.method public static varargs forArray([Ljava/lang/Object;)Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 230
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$6;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$Iterators$6;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public static forArray([Ljava/lang/Object;II)Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 2
    .param p1, "offset"    # I
    .param p2, "length"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 263
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    if-ltz p2, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-static {v1}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(Z)V

    .line 264
    add-int v0, p1, p2

    .line 267
    .local v0, "end":I
    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkPositionIndexes(III)V

    .line 271
    new-instance v1, Lcom/google/inject/internal/util/$Iterators$7;

    invoke-direct {v1, p1, v0, p0}, Lcom/google/inject/internal/util/$Iterators$7;-><init>(II[Ljava/lang/Object;)V

    return-object v1

    .line 263
    .end local v0    # "end":I
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getOnlyElement(Ljava/util/Iterator;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 134
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TT;>;"
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 135
    .local v0, "first":Ljava/lang/Object;, "TT;"
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 136
    return-object v0

    .line 139
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .local v2, "sb":Ljava/lang/StringBuilder;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "expected one element but was: <"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v3, 0x4

    if-ge v1, v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 142
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 144
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 145
    const-string v3, ", ..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    :cond_2
    const-string v3, ">"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public static singletonIterator(Ljava/lang/Object;)Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 290
    .local p0, "value":Ljava/lang/Object;, "TT;"
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$8;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$Iterators$8;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static toString(Ljava/util/Iterator;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 115
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 116
    const-string v1, "[]"

    .line 123
    :goto_0
    return-object v1

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .local v0, "builder":Ljava/lang/StringBuilder;
    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 121
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 123
    :cond_1
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static transform(Ljava/util/Iterator;Lcom/google/inject/internal/util/$Function;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<TF;>;",
            "Lcom/google/inject/internal/util/$Function",
            "<-TF;+TT;>;)",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 201
    .local p0, "fromIterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TF;>;"
    .local p1, "function":Lcom/google/inject/internal/util/$Function;, "Lcom/google/inject/internal/util/$Function<-TF;+TT;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    invoke-static {p1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$5;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/util/$Iterators$5;-><init>(Ljava/util/Iterator;Lcom/google/inject/internal/util/$Function;)V

    return-object v0
.end method

.method public static unmodifiableIterator(Ljava/util/Iterator;)Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<TT;>;)",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 97
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<TT;>;"
    invoke-static {p0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    new-instance v0, Lcom/google/inject/internal/util/$Iterators$3;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$Iterators$3;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
