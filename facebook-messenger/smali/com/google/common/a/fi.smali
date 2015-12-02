.class public abstract Lcom/google/common/a/fi;
.super Lcom/google/common/a/em;
.source "ImmutableSet.java"

# interfaces
.implements Ljava/util/Set;


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
        "Ljava/util/Set",
        "<TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 365
    invoke-direct {p0}, Lcom/google/common/a/em;-><init>()V

    return-void
.end method

.method static a(I)I
    .locals 3

    .prologue
    const/high16 v1, 0x40000000    # 2.0f

    .line 223
    const/high16 v0, 0x20000000

    if-ge p0, v0, :cond_0

    .line 224
    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x2

    .line 229
    :goto_0
    return v0

    .line 228
    :cond_0
    if-ge p0, v1, :cond_1

    const/4 v0, 0x1

    :goto_1
    const-string v2, "collection too large"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    move v0, v1

    .line 229
    goto :goto_0

    .line 228
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+TE;>;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 287
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/common/a/ax;->a(Ljava/lang/Iterable;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Iterator;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 110
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    aput-object p2, v0, v1

    invoke-static {v0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 121
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    aput-object p2, v0, v1

    const/4 v1, 0x3

    aput-object p3, v0, v1

    invoke-static {v0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 132
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

    invoke-static {v0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;[TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 145
    .line 146
    array-length v0, p6

    add-int/lit8 v0, v0, 0x6

    new-array v1, v0, [Ljava/lang/Object;

    .line 147
    const/4 v0, 0x0

    aput-object p0, v1, v0

    .line 148
    const/4 v0, 0x1

    aput-object p1, v1, v0

    .line 149
    const/4 v0, 0x2

    aput-object p2, v1, v0

    .line 150
    const/4 v0, 0x3

    aput-object p3, v1, v0

    .line 151
    const/4 v0, 0x4

    aput-object p4, v1, v0

    .line 152
    const/4 v0, 0x5

    aput-object p5, v1, v0

    .line 153
    const/4 v0, 0x6

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 154
    add-int/lit8 v2, v0, -0x6

    aget-object v2, p6, v2

    aput-object v2, v1, v0

    .line 153
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 156
    :cond_0
    invoke-static {v1}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 337
    instance-of v0, p0, Lcom/google/common/a/fi;

    if-eqz v0, :cond_0

    instance-of v0, p0, Lcom/google/common/a/fy;

    if-nez v0, :cond_0

    move-object v0, p0

    .line 340
    check-cast v0, Lcom/google/common/a/fi;

    .line 341
    invoke-virtual {v0}, Lcom/google/common/a/fi;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 345
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/google/common/a/fi;->b(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/util/Iterator;)Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator",
            "<+TE;>;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 302
    invoke-static {p0}, Lcom/google/common/a/hq;->a(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method private static varargs a([Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 161
    array-length v0, p0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(I)I

    move-result v5

    .line 162
    new-array v6, v5, [Ljava/lang/Object;

    .line 163
    add-int/lit8 v7, v5, -0x1

    .line 164
    const/4 v1, 0x0

    move v2, v3

    move v0, v3

    .line 166
    :goto_0
    array-length v4, p0

    if-ge v2, v4, :cond_4

    .line 167
    aget-object v8, p0, v2

    .line 168
    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v9

    .line 169
    invoke-static {v9}, Lcom/google/common/a/eh;->a(I)I

    move-result v4

    .line 170
    :goto_1
    and-int v10, v4, v7

    .line 171
    aget-object v11, v6, v10

    .line 172
    if-nez v11, :cond_2

    .line 173
    if-eqz v1, :cond_0

    .line 174
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    :cond_0
    aput-object v8, v6, v10

    .line 178
    add-int/2addr v0, v9

    .line 166
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 180
    :cond_2
    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 181
    if-nez v1, :cond_1

    .line 183
    new-instance v1, Ljava/util/ArrayList;

    array-length v4, p0

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v3

    .line 184
    :goto_2
    if-ge v4, v2, :cond_1

    .line 185
    aget-object v8, p0, v4

    .line 186
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 169
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 193
    :cond_4
    if-nez v1, :cond_5

    .line 196
    :goto_3
    array-length v1, p0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    .line 199
    aget-object v2, p0, v3

    .line 200
    new-instance v1, Lcom/google/common/a/ku;

    invoke-direct {v1, v2, v0}, Lcom/google/common/a/ku;-><init>(Ljava/lang/Object;I)V

    move-object v0, v1

    .line 206
    :goto_4
    return-object v0

    .line 193
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    .line 201
    :cond_6
    array-length v1, p0

    invoke-static {v1}, Lcom/google/common/a/fi;->a(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    if-le v5, v1, :cond_7

    .line 204
    invoke-static {p0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_4

    .line 206
    :cond_7
    new-instance v1, Lcom/google/common/a/kg;

    invoke-direct {v1, p0, v0, v6, v7}, Lcom/google/common/a/kg;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V

    move-object v0, v1

    goto :goto_4
.end method

.method public static b(Ljava/lang/Object;)Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 88
    new-instance v0, Lcom/google/common/a/ku;

    invoke-direct {v0, p0}, Lcom/google/common/a/ku;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static b(Ljava/util/Collection;)Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<+TE;>;)",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 350
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    .line 351
    array-length v1, v0

    packed-switch v1, :pswitch_data_0

    .line 361
    invoke-static {v0}, Lcom/google/common/a/fi;->a([Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    :goto_0
    return-object v0

    .line 353
    :pswitch_0
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 356
    :pswitch_1
    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 357
    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    goto :goto_0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static d()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fi",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 78
    sget-object v0, Lcom/google/common/a/dq;->a:Lcom/google/common/a/dq;

    return-object v0
.end method

.method public static e()Lcom/google/common/a/fk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/fk",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 548
    new-instance v0, Lcom/google/common/a/fk;

    invoke-direct {v0}, Lcom/google/common/a/fk;-><init>()V

    return-object v0
.end method


# virtual methods
.method c()Z
    .locals 1

    .prologue
    .line 369
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 373
    if-ne p1, p0, :cond_0

    .line 374
    const/4 v0, 0x1

    .line 382
    :goto_0
    return v0

    .line 376
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/fi;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/common/a/fi;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/common/a/fi;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 380
    const/4 v0, 0x0

    goto :goto_0

    .line 382
    :cond_1
    invoke-static {p0, p1}, Lcom/google/common/a/kl;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public abstract h_()Lcom/google/common/a/mh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 386
    invoke-static {p0}, Lcom/google/common/a/kl;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/google/common/a/fi;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method
