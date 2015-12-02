.class public final Lcom/fasterxml/jackson/databind/util/ArrayBuilders;
.super Ljava/lang/Object;
.source "ArrayBuilders.java"


# instance fields
.field _booleanBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

.field _byteBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

.field _doubleBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

.field _floatBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

.field _intBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

.field _longBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

.field _shortBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_booleanBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

    .line 19
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_byteBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

    .line 20
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_shortBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;

    .line 21
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_intBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

    .line 22
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_longBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

    .line 24
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_floatBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

    .line 25
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_doubleBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

    .line 27
    return-void
.end method

.method public static addToList(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;TT;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 195
    if-nez p0, :cond_0

    .line 196
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 198
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    return-object p0
.end method

.method public static arrayAsIterable([Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/lang/Iterable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 266
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ArrayIterator;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ArrayIterator;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public static arrayAsIterator([Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 261
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ArrayIterator;

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ArrayIterator;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public static arrayToList([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/ArrayList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    if-eqz p0, :cond_0

    .line 160
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 161
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 164
    :cond_0
    return-object v1
.end method

.method public static arrayToSet([Ljava/lang/Object;)Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/HashSet",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 147
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 148
    if-eqz p0, :cond_0

    .line 149
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 150
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 149
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 153
    :cond_0
    return-object v1
.end method

.method public static insertInList([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 209
    array-length v1, p0

    .line 211
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v2, v1, 0x1

    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 212
    if-lez v1, :cond_0

    .line 213
    const/4 v2, 0x1

    invoke-static {p0, v3, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 215
    :cond_0
    aput-object p1, v0, v3

    .line 216
    return-object v0
.end method

.method public static insertInListNoDup([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 230
    array-length v3, p0

    move v1, v2

    .line 233
    :goto_0
    if-ge v1, v3, :cond_2

    .line 234
    aget-object v0, p0, v1

    if-ne v0, p1, :cond_1

    .line 236
    if-nez v1, :cond_0

    move-object v0, p0

    .line 253
    :goto_1
    return-object v0

    .line 240
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 241
    invoke-static {p0, v2, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 242
    aput-object p1, p0, v2

    goto :goto_1

    .line 233
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 248
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    add-int/lit8 v1, v3, 0x1

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 249
    if-lez v3, :cond_3

    .line 250
    invoke-static {p0, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 252
    :cond_3
    aput-object p1, v0, v2

    goto :goto_1
.end method

.method public static setAndArray(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set",
            "<TT;>;[TT;)",
            "Ljava/util/HashSet",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 169
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 170
    if-eqz p0, :cond_0

    .line 171
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 173
    :cond_0
    if-eqz p1, :cond_1

    .line 174
    array-length v2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, p1, v0

    .line 175
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 174
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_1
    return-object v1
.end method


# virtual methods
.method public getBooleanBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_booleanBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_booleanBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_booleanBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$BooleanBuilder;

    return-object v0
.end method

.method public getByteBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_byteBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_byteBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_byteBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ByteBuilder;

    return-object v0
.end method

.method public getDoubleBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_doubleBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

    if-nez v0, :cond_0

    .line 76
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_doubleBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_doubleBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$DoubleBuilder;

    return-object v0
.end method

.method public getFloatBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_floatBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_floatBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_floatBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$FloatBuilder;

    return-object v0
.end method

.method public getIntBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_intBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_intBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_intBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$IntBuilder;

    return-object v0
.end method

.method public getLongBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_longBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_longBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_longBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$LongBuilder;

    return-object v0
.end method

.method public getShortBuilder()Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_shortBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_shortBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/util/ArrayBuilders;->_shortBuilder:Lcom/fasterxml/jackson/databind/util/ArrayBuilders$ShortBuilder;

    return-object v0
.end method
