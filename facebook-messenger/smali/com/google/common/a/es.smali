.class public abstract Lcom/google/common/a/es;
.super Lcom/google/common/a/em;
.source "ImmutableList.java"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/em",
        "<TE;>;",
        "Ljava/util/List",
        "<TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 323
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 229
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/common/a/ax;->a(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Iterator;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 80
    new-instance v0, Lcom/google/common/a/kq;

    invoke-direct {v0, p0}, Lcom/google/common/a/kq;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 89
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 98
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    aput-object p2, v0, v1

    invoke-static {v0}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 116
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    aput-object p2, v0, v1

    const/4 v1, 0x3

    aput-object p3, v0, v1

    const/4 v1, 0x4

    aput-object p4, v0, v1

    invoke-static {v0}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;[TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 190
    move-object/from16 v0, p12

    array-length v1, v0

    add-int/lit8 v1, v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    .line 191
    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 192
    const/4 v2, 0x1

    aput-object p1, v1, v2

    .line 193
    const/4 v2, 0x2

    aput-object p2, v1, v2

    .line 194
    const/4 v2, 0x3

    aput-object p3, v1, v2

    .line 195
    const/4 v2, 0x4

    aput-object p4, v1, v2

    .line 196
    const/4 v2, 0x5

    aput-object p5, v1, v2

    .line 197
    const/4 v2, 0x6

    aput-object p6, v1, v2

    .line 198
    const/4 v2, 0x7

    aput-object p7, v1, v2

    .line 199
    const/16 v2, 0x8

    aput-object p8, v1, v2

    .line 200
    const/16 v2, 0x9

    aput-object p9, v1, v2

    .line 201
    const/16 v2, 0xa

    aput-object p10, v1, v2

    .line 202
    const/16 v2, 0xb

    aput-object p11, v1, v2

    .line 203
    const/4 v2, 0x0

    const/16 v3, 0xc

    move-object/from16 v0, p12

    array-length v4, v0

    move-object/from16 v0, p12

    invoke-static {v0, v2, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    invoke-static {v1}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    return-object v1
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 255
    instance-of v0, p0, Lcom/google/common/a/em;

    if-eqz v0, :cond_1

    .line 257
    check-cast p0, Lcom/google/common/a/em;

    invoke-virtual {p0}, Lcom/google/common/a/em;->h()Lcom/google/common/a/es;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Lcom/google/common/a/es;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/common/a/es;->b(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 260
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-static {p0}, Lcom/google/common/a/es;->b(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/util/Iterator;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 269
    invoke-static {p0}, Lcom/google/common/a/hq;->a(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->b(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static a([Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 279
    array-length v0, p0

    packed-switch v0, :pswitch_data_0

    .line 285
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    :goto_0
    return-object v0

    .line 281
    :pswitch_0
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 283
    :pswitch_1
    new-instance v0, Lcom/google/common/a/kq;

    const/4 v1, 0x0

    aget-object v1, p0, v1

    invoke-direct {v0, v1}, Lcom/google/common/a/kq;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 279
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 317
    if-nez p0, :cond_0

    .line 318
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 320
    :cond_0
    return-object p0
.end method

.method private static b(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 291
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v1

    .line 292
    array-length v0, v1

    packed-switch v0, :pswitch_data_0

    .line 302
    invoke-static {v1}, Lcom/google/common/a/es;->b([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    :goto_0
    return-object v0

    .line 294
    :pswitch_0
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 297
    :pswitch_1
    new-instance v0, Lcom/google/common/a/kq;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/common/a/kq;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 292
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static varargs b([Ljava/lang/Object;)Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 308
    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 309
    aget-object v1, p0, v0

    invoke-static {v1, v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 308
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 311
    :cond_0
    new-instance v0, Lcom/google/common/a/ju;

    invoke-direct {v0, p0}, Lcom/google/common/a/ju;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public static d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 68
    sget-object v0, Lcom/google/common/a/dl;->a:Lcom/google/common/a/dl;

    return-object v0
.end method

.method public static e()Lcom/google/common/a/et;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/et",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 548
    new-instance v0, Lcom/google/common/a/et;

    invoke-direct {v0}, Lcom/google/common/a/et;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a(II)Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation
.end method

.method public abstract a(I)Lcom/google/common/a/mi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/a/mi",
            "<TE;>;"
        }
    .end annotation
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .line 383
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 363
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public c()Lcom/google/common/a/mi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 332
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/common/a/es;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 512
    invoke-static {p0, p1}, Lcom/google/common/a/hq;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public h()Lcom/google/common/a/es;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 402
    return-object p0
.end method

.method public h_()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 328
    invoke-virtual {p0}, Lcom/google/common/a/es;->c()Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 516
    invoke-static {p0}, Lcom/google/common/a/hq;->b(Ljava/util/List;)I

    move-result v0

    return v0
.end method

.method public abstract indexOf(Ljava/lang/Object;)I
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/google/common/a/es;->c()Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/google/common/a/es;->a(I)Lcom/google/common/a/mi;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 393
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .prologue
    .line 373
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
