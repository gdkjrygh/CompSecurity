.class public final Lcom/nineoldandroids/a/k;
.super Lcom/nineoldandroids/a/o;
.source "360Security"


# static fields
.field private static final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/nineoldandroids/util/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private i:Ljava/lang/Object;

.field private j:Ljava/lang/String;

.field private k:Lcom/nineoldandroids/util/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    .line 43
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "alpha"

    sget-object v2, Lcom/nineoldandroids/a/l;->a:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "pivotX"

    sget-object v2, Lcom/nineoldandroids/a/l;->b:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "pivotY"

    sget-object v2, Lcom/nineoldandroids/a/l;->c:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "translationX"

    sget-object v2, Lcom/nineoldandroids/a/l;->d:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "translationY"

    sget-object v2, Lcom/nineoldandroids/a/l;->e:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "rotation"

    sget-object v2, Lcom/nineoldandroids/a/l;->f:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "rotationX"

    sget-object v2, Lcom/nineoldandroids/a/l;->g:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "rotationY"

    sget-object v2, Lcom/nineoldandroids/a/l;->h:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "scaleX"

    sget-object v2, Lcom/nineoldandroids/a/l;->i:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "scaleY"

    sget-object v2, Lcom/nineoldandroids/a/l;->j:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "scrollX"

    sget-object v2, Lcom/nineoldandroids/a/l;->k:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "scrollY"

    sget-object v2, Lcom/nineoldandroids/a/l;->l:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "x"

    sget-object v2, Lcom/nineoldandroids/a/l;->m:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    const-string/jumbo v1, "y"

    sget-object v2, Lcom/nineoldandroids/a/l;->n:Lcom/nineoldandroids/util/c;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 149
    invoke-direct {p0}, Lcom/nineoldandroids/a/o;-><init>()V

    .line 150
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/nineoldandroids/util/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/nineoldandroids/util/c",
            "<TT;*>;)V"
        }
    .end annotation

    .prologue
    .line 172
    invoke-direct {p0}, Lcom/nineoldandroids/a/o;-><init>()V

    .line 173
    iput-object p1, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    .line 174
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/util/c;)V

    .line 175
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 161
    invoke-direct {p0}, Lcom/nineoldandroids/a/o;-><init>()V

    .line 162
    iput-object p1, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    .line 163
    invoke-virtual {p0, p2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/String;)V

    .line 164
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/nineoldandroids/util/c",
            "<TT;",
            "Ljava/lang/Float;",
            ">;[F)",
            "Lcom/nineoldandroids/a/k;"
        }
    .end annotation

    .prologue
    .line 249
    new-instance v0, Lcom/nineoldandroids/a/k;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/k;-><init>(Ljava/lang/Object;Lcom/nineoldandroids/util/c;)V

    .line 250
    invoke-virtual {v0, p2}, Lcom/nineoldandroids/a/k;->a([F)V

    .line 251
    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[I)Lcom/nineoldandroids/a/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/nineoldandroids/util/c",
            "<TT;",
            "Ljava/lang/Integer;",
            ">;[I)",
            "Lcom/nineoldandroids/a/k;"
        }
    .end annotation

    .prologue
    .line 210
    new-instance v0, Lcom/nineoldandroids/a/k;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/k;-><init>(Ljava/lang/Object;Lcom/nineoldandroids/util/c;)V

    .line 211
    invoke-virtual {v0, p2}, Lcom/nineoldandroids/a/k;->a([I)V

    .line 212
    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 230
    new-instance v0, Lcom/nineoldandroids/a/k;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/k;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    invoke-virtual {v0, p2}, Lcom/nineoldandroids/a/k;->a([F)V

    .line 232
    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 192
    new-instance v0, Lcom/nineoldandroids/a/k;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/k;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-virtual {v0, p2}, Lcom/nineoldandroids/a/k;->a([I)V

    .line 194
    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 321
    new-instance v0, Lcom/nineoldandroids/a/k;

    invoke-direct {v0}, Lcom/nineoldandroids/a/k;-><init>()V

    .line 322
    iput-object p0, v0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    .line 323
    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/k;->b([Lcom/nineoldandroids/a/m;)V

    .line 324
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 384
    invoke-super {p0}, Lcom/nineoldandroids/a/o;->a()V

    .line 385
    return-void
.end method

.method a(F)V
    .locals 4

    .prologue
    .line 490
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/o;->a(F)V

    .line 491
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    array-length v1, v0

    .line 492
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_0

    .line 495
    return-void

    .line 493
    :cond_0
    iget-object v2, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/m;->b(Ljava/lang/Object;)V

    .line 492
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/nineoldandroids/util/c;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 117
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    aget-object v0, v0, v3

    .line 119
    invoke-virtual {v0}, Lcom/nineoldandroids/a/m;->c()Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/m;->a(Lcom/nineoldandroids/util/c;)V

    .line 121
    iget-object v2, p0, Lcom/nineoldandroids/a/k;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v1, p0, Lcom/nineoldandroids/a/k;->g:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_1

    .line 125
    invoke-virtual {p1}, Lcom/nineoldandroids/util/c;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    .line 127
    :cond_1
    iput-object p1, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    .line 129
    iput-boolean v3, p0, Lcom/nineoldandroids/a/k;->e:Z

    .line 130
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 95
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    aget-object v0, v0, v3

    .line 97
    invoke-virtual {v0}, Lcom/nineoldandroids/a/m;->c()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;)V

    .line 99
    iget-object v2, p0, Lcom/nineoldandroids/a/k;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v1, p0, Lcom/nineoldandroids/a/k;->g:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_0
    iput-object p1, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    .line 104
    iput-boolean v3, p0, Lcom/nineoldandroids/a/k;->e:Z

    .line 105
    return-void
.end method

.method public varargs a([F)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 344
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    array-length v0, v0

    if-nez v0, :cond_2

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_1

    .line 348
    new-array v0, v1, [Lcom/nineoldandroids/a/m;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    invoke-static {v1, p1}, Lcom/nineoldandroids/a/m;->a(Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/m;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/k;->b([Lcom/nineoldandroids/a/m;)V

    .line 355
    :goto_0
    return-void

    .line 350
    :cond_1
    new-array v0, v1, [Lcom/nineoldandroids/a/m;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/k;->b([Lcom/nineoldandroids/a/m;)V

    goto :goto_0

    .line 353
    :cond_2
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/o;->a([F)V

    goto :goto_0
.end method

.method public varargs a([I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 329
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    array-length v0, v0

    if-nez v0, :cond_2

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_1

    .line 333
    new-array v0, v1, [Lcom/nineoldandroids/a/m;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    invoke-static {v1, p1}, Lcom/nineoldandroids/a/m;->a(Lcom/nineoldandroids/util/c;[I)Lcom/nineoldandroids/a/m;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/k;->b([Lcom/nineoldandroids/a/m;)V

    .line 340
    :goto_0
    return-void

    .line 335
    :cond_1
    new-array v0, v1, [Lcom/nineoldandroids/a/m;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[I)Lcom/nineoldandroids/a/m;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/k;->b([Lcom/nineoldandroids/a/m;)V

    goto :goto_0

    .line 338
    :cond_2
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/o;->a([I)V

    goto :goto_0
.end method

.method public c(J)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 426
    invoke-super {p0, p1, p2}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 427
    return-object p0
.end method

.method public synthetic d(J)Lcom/nineoldandroids/a/o;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    return-object v0
.end method

.method i()V
    .locals 4

    .prologue
    .line 401
    iget-boolean v0, p0, Lcom/nineoldandroids/a/k;->e:Z

    if-nez v0, :cond_1

    .line 404
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->k:Lcom/nineoldandroids/util/c;

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/nineoldandroids/b/a/a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 405
    sget-object v0, Lcom/nineoldandroids/a/k;->h:Ljava/util/Map;

    iget-object v1, p0, Lcom/nineoldandroids/a/k;->j:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/util/c;

    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/util/c;)V

    .line 407
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    array-length v1, v0

    .line 408
    const/4 v0, 0x0

    :goto_0
    if-lt v0, v1, :cond_2

    .line 411
    invoke-super {p0}, Lcom/nineoldandroids/a/o;->i()V

    .line 413
    :cond_1
    return-void

    .line 409
    :cond_2
    iget-object v2, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Object;)V

    .line 408
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public k()Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 499
    invoke-super {p0}, Lcom/nineoldandroids/a/o;->l()Lcom/nineoldandroids/a/o;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/k;

    .line 500
    return-object v0
.end method

.method public synthetic l()Lcom/nineoldandroids/a/o;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/a/k;->k()Lcom/nineoldandroids/a/k;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ObjectAnimator@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", target "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 506
    iget-object v1, p0, Lcom/nineoldandroids/a/k;->i:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 505
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 507
    iget-object v0, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    if-eqz v0, :cond_0

    .line 508
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    array-length v2, v2

    if-lt v0, v2, :cond_1

    .line 512
    :cond_0
    return-object v1

    .line 509
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "\n    "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/nineoldandroids/a/k;->f:[Lcom/nineoldandroids/a/m;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/nineoldandroids/a/m;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 508
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
