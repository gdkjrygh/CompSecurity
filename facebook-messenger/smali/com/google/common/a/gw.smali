.class public Lcom/google/common/a/gw;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Lcom/google/common/a/hp;
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/a/hp",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private transient a:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private transient b:Lcom/google/common/a/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private transient c:Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient g:Lcom/google/common/a/jf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation
.end field

.field private transient h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    invoke-static {}, Lcom/google/common/a/gv;->h()Lcom/google/common/a/gv;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    .line 168
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    .line 169
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    .line 170
    return-void
.end method

.method public static a()Lcom/google/common/a/gw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/gw",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 140
    new-instance v0, Lcom/google/common/a/gw;

    invoke-direct {v0}, Lcom/google/common/a/gw;-><init>()V

    return-object v0
.end method

.method static synthetic a(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    return-object v0
.end method

.method static synthetic a(Lcom/google/common/a/gw;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/hm;)Lcom/google/common/a/hm;
    .locals 1

    .prologue
    .line 102
    invoke-direct {p0, p1, p2, p3}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/hm;)Lcom/google/common/a/hm;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/hm;)Lcom/google/common/a/hm;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/google/common/a/hm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 191
    new-instance v1, Lcom/google/common/a/hm;

    invoke-direct {v1, p1, p2}, Lcom/google/common/a/hm;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    if-nez v0, :cond_0

    .line 193
    iput-object v1, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    iput-object v1, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    .line 194
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    :goto_0
    iget-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    invoke-interface {v0, p1}, Lcom/google/common/a/jf;->add(Ljava/lang/Object;)Z

    .line 227
    return-object v1

    .line 196
    :cond_0
    if-nez p3, :cond_2

    .line 197
    iget-object v0, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    .line 198
    iget-object v0, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    iput-object v0, v1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    .line 199
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hm;

    .line 200
    if-nez v0, :cond_1

    .line 201
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    :goto_1
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    iput-object v1, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    goto :goto_0

    .line 203
    :cond_1
    iput-object v1, v0, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    .line 204
    iput-object v0, v1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    goto :goto_1

    .line 209
    :cond_2
    iget-object v0, p3, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v0, v1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    .line 210
    iget-object v0, p3, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iput-object v0, v1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    .line 211
    iput-object p3, v1, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    .line 212
    iput-object p3, v1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    .line 213
    iget-object v0, p3, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    if-nez v0, :cond_3

    .line 214
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    :goto_2
    iget-object v0, p3, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    if-nez v0, :cond_4

    .line 219
    iput-object v1, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    .line 223
    :goto_3
    iput-object v1, p3, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    .line 224
    iput-object v1, p3, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    goto :goto_0

    .line 216
    :cond_3
    iget-object v0, p3, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    goto :goto_2

    .line 221
    :cond_4
    iget-object v0, p3, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    goto :goto_3
.end method

.method static synthetic a(Lcom/google/common/a/hm;)Ljava/util/Map$Entry;
    .locals 1

    .prologue
    .line 102
    invoke-static {p0}, Lcom/google/common/a/gw;->c(Lcom/google/common/a/hm;)Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/common/a/gw;Lcom/google/common/a/hm;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/google/common/a/gw;->b(Lcom/google/common/a/hm;)V

    return-void
.end method

.method static synthetic a(Lcom/google/common/a/gw;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/google/common/a/gw;->g(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/google/common/a/gw;)Lcom/google/common/a/hm;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    return-object v0
.end method

.method private b(Lcom/google/common/a/hm;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 236
    iget-object v0, p1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iget-object v1, p1, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    .line 241
    :goto_0
    iget-object v0, p1, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    if-eqz v0, :cond_1

    .line 242
    iget-object v0, p1, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iget-object v1, p1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    .line 246
    :goto_1
    iget-object v0, p1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    if-eqz v0, :cond_2

    .line 247
    iget-object v0, p1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iget-object v1, p1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    .line 253
    :goto_2
    iget-object v0, p1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    if-eqz v0, :cond_4

    .line 254
    iget-object v0, p1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    iget-object v1, p1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    iput-object v1, v0, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    .line 260
    :goto_3
    iget-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    iget-object v1, p1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/common/a/jf;->remove(Ljava/lang/Object;)Z

    .line 261
    return-void

    .line 239
    :cond_0
    iget-object v0, p1, Lcom/google/common/a/hm;->c:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    goto :goto_0

    .line 244
    :cond_1
    iget-object v0, p1, Lcom/google/common/a/hm;->d:Lcom/google/common/a/hm;

    iput-object v0, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    goto :goto_1

    .line 248
    :cond_2
    iget-object v0, p1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    if-eqz v0, :cond_3

    .line 249
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    iget-object v1, p1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/common/a/hm;->e:Lcom/google/common/a/hm;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 251
    :cond_3
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    iget-object v1, p1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 255
    :cond_4
    iget-object v0, p1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    if-eqz v0, :cond_5

    .line 256
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    iget-object v1, p1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/common/a/hm;->f:Lcom/google/common/a/hm;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 258
    :cond_5
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    iget-object v1, p1, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3
.end method

.method private static c(Lcom/google/common/a/hm;)Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/hm",
            "<TK;TV;>;)",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 898
    new-instance v0, Lcom/google/common/a/gz;

    invoke-direct {v0, p0}, Lcom/google/common/a/gz;-><init>(Lcom/google/common/a/hm;)V

    return-object v0
.end method

.method static synthetic c(Lcom/google/common/a/gw;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    return-object v0
.end method

.method static synthetic e(Lcom/google/common/a/gw;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic e(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 102
    invoke-static {p0}, Lcom/google/common/a/gw;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private g(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 265
    new-instance v0, Lcom/google/common/a/ho;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 266
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 269
    :cond_0
    return-void
.end method

.method private static h(Ljava/lang/Object;)V
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 273
    if-nez p0, :cond_0

    .line 274
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 276
    :cond_0
    return-void
.end method

.method private i(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 620
    new-instance v0, Lcom/google/common/a/ho;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/util/Iterator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 631
    invoke-direct {p0, p1}, Lcom/google/common/a/gw;->i(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 632
    invoke-direct {p0, p1}, Lcom/google/common/a/gw;->g(Ljava/lang/Object;)V

    .line 633
    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .prologue
    .line 547
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/hm;)Lcom/google/common/a/hm;

    .line 548
    const/4 v0, 0x1

    return v0
.end method

.method public b(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 658
    new-instance v0, Lcom/google/common/a/gx;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/gx;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;",
            "Ljava/util/Collection",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1037
    iget-object v0, p0, Lcom/google/common/a/gw;->i:Ljava/util/Map;

    .line 1038
    if-nez v0, :cond_0

    .line 1039
    new-instance v0, Lcom/google/common/a/hc;

    invoke-direct {v0, p0}, Lcom/google/common/a/hc;-><init>(Lcom/google/common/a/gw;)V

    iput-object v0, p0, Lcom/google/common/a/gw;->i:Ljava/util/Map;

    .line 1069
    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 528
    new-instance v0, Lcom/google/common/a/ho;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 529
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 530
    const/4 v0, 0x1

    .line 533
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic c(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0, p1}, Lcom/google/common/a/gw;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 935
    iget-object v0, p0, Lcom/google/common/a/gw;->h:Ljava/util/List;

    .line 936
    if-nez v0, :cond_0

    .line 937
    new-instance v0, Lcom/google/common/a/ha;

    invoke-direct {v0, p0}, Lcom/google/common/a/ha;-><init>(Lcom/google/common/a/gw;)V

    iput-object v0, p0, Lcom/google/common/a/gw;->h:Ljava/util/List;

    .line 993
    :cond_0
    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Iterable;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 567
    const/4 v0, 0x0

    .line 568
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 569
    invoke-virtual {p0, p1, v2}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    goto :goto_0

    .line 571
    :cond_0
    return v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 553
    new-instance v0, Lcom/google/common/a/ho;

    invoke-direct {v0, p0, p1}, Lcom/google/common/a/ho;-><init>(Lcom/google/common/a/gw;Ljava/lang/Object;)V

    .line 554
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 555
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 556
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 557
    const/4 v0, 0x1

    .line 560
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    invoke-interface {v0}, Lcom/google/common/a/jf;->size()I

    move-result v0

    return v0
.end method

.method public synthetic d(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0, p1}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 508
    iget-object v0, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1082
    if-ne p1, p0, :cond_0

    .line 1083
    const/4 v0, 0x1

    .line 1089
    :goto_0
    return v0

    .line 1085
    :cond_0
    instance-of v0, p1, Lcom/google/common/a/iw;

    if-eqz v0, :cond_1

    .line 1086
    check-cast p1, Lcom/google/common/a/iw;

    .line 1087
    invoke-virtual {p0}, Lcom/google/common/a/gw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/common/a/iw;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 1089
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 638
    iput-object v0, p0, Lcom/google/common/a/gw;->a:Lcom/google/common/a/hm;

    .line 639
    iput-object v0, p0, Lcom/google/common/a/gw;->b:Lcom/google/common/a/hm;

    .line 640
    iget-object v0, p0, Lcom/google/common/a/gw;->c:Lcom/google/common/a/jf;

    invoke-interface {v0}, Lcom/google/common/a/jf;->clear()V

    .line 641
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 642
    iget-object v0, p0, Lcom/google/common/a/gw;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 643
    return-void
.end method

.method public f(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 513
    iget-object v0, p0, Lcom/google/common/a/gw;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 678
    iget-object v0, p0, Lcom/google/common/a/gw;->f:Ljava/util/Set;

    .line 679
    if-nez v0, :cond_0

    .line 680
    new-instance v0, Lcom/google/common/a/gy;

    invoke-direct {v0, p0}, Lcom/google/common/a/gy;-><init>(Lcom/google/common/a/gw;)V

    iput-object v0, p0, Lcom/google/common/a/gw;->f:Ljava/util/Set;

    .line 696
    :cond_0
    return-object v0
.end method

.method public h()Lcom/google/common/a/jf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jf",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 703
    iget-object v0, p0, Lcom/google/common/a/gw;->g:Lcom/google/common/a/jf;

    .line 704
    if-nez v0, :cond_0

    .line 705
    new-instance v0, Lcom/google/common/a/hh;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/common/a/hh;-><init>(Lcom/google/common/a/gw;Lcom/google/common/a/gx;)V

    iput-object v0, p0, Lcom/google/common/a/gw;->g:Lcom/google/common/a/jf;

    .line 707
    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 1099
    invoke-virtual {p0}, Lcom/google/common/a/gw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public synthetic i()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Lcom/google/common/a/gw;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1109
    invoke-virtual {p0}, Lcom/google/common/a/gw;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
