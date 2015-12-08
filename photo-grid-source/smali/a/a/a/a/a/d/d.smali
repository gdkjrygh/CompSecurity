.class public abstract La/a/a/a/a/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:La/a/a/a/a/d/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/a/d/c",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected final c:La/a/a/a/a/b/q;

.field protected final d:La/a/a/a/a/d/h;

.field protected volatile e:J

.field protected final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "La/a/a/a/a/d/i;",
            ">;"
        }
    .end annotation
.end field

.field private final g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;La/a/a/a/a/d/c;La/a/a/a/a/b/q;La/a/a/a/a/d/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "La/a/a/a/a/d/c",
            "<TT;>;",
            "La/a/a/a/a/b/q;",
            "La/a/a/a/a/d/h;",
            ")V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La/a/a/a/a/d/d;->f:Ljava/util/List;

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/d/d;->a:Landroid/content/Context;

    .line 76
    iput-object p2, p0, La/a/a/a/a/d/d;->b:La/a/a/a/a/d/c;

    .line 77
    iput-object p4, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    .line 78
    iput-object p3, p0, La/a/a/a/a/d/d;->c:La/a/a/a/a/b/q;

    .line 80
    iget-object v0, p0, La/a/a/a/a/d/d;->c:La/a/a/a/a/b/q;

    invoke-interface {v0}, La/a/a/a/a/b/q;->a()J

    move-result-wide v0

    iput-wide v0, p0, La/a/a/a/a/d/d;->e:J

    .line 82
    const/16 v0, 0x64

    iput v0, p0, La/a/a/a/a/d/d;->g:I

    .line 83
    return-void
.end method

.method private static a(Ljava/lang/String;)J
    .locals 5

    .prologue
    const-wide/16 v0, 0x0

    .line 233
    const-string v2, "_"

    invoke-virtual {p0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 235
    array-length v3, v2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    .line 242
    :goto_0
    return-wide v0

    .line 240
    :cond_0
    const/4 v3, 0x2

    :try_start_0
    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    goto :goto_0

    .line 242
    :catch_0
    move-exception v2

    goto :goto_0
.end method


# virtual methods
.method protected abstract a()Ljava/lang/String;
.end method

.method public final a(La/a/a/a/a/d/i;)V
    .locals 1

    .prologue
    .line 97
    if-eqz p1, :cond_0

    .line 98
    iget-object v0, p0, La/a/a/a/a/d/d;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 86
    iget-object v0, p0, La/a/a/a/a/d/d;->b:La/a/a/a/a/d/c;

    invoke-interface {v0, p1}, La/a/a/a/a/d/c;->a(Ljava/lang/Object;)[B

    move-result-object v0

    .line 87
    array-length v1, v0

    .line 1137
    iget-object v2, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-virtual {p0}, La/a/a/a/a/d/d;->c()I

    move-result v3

    invoke-interface {v2, v1, v3}, La/a/a/a/a/d/h;->a(II)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1138
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v6}, La/a/a/a/a/d/h;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    invoke-virtual {p0}, La/a/a/a/a/d/d;->c()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1144
    iget-object v2, p0, La/a/a/a/a/d/d;->a:Landroid/content/Context;

    invoke-static {v2, v1}, La/a/a/a/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1145
    invoke-virtual {p0}, La/a/a/a/a/d/d;->d()Z

    .line 89
    :cond_0
    iget-object v1, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v1, v0}, La/a/a/a/a/d/h;->a([B)V

    .line 90
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 183
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v0, p1}, La/a/a/a/a/d/h;->a(Ljava/util/List;)V

    .line 184
    return-void
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 156
    iget v0, p0, La/a/a/a/a/d/d;->g:I

    return v0
.end method

.method protected c()I
    .locals 1

    .prologue
    .line 160
    const/16 v0, 0x1f40

    return v0
.end method

.method public final d()Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 107
    .line 112
    iget-object v2, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v2}, La/a/a/a/a/d/h;->b()Z

    move-result v2

    if-nez v2, :cond_0

    .line 113
    invoke-virtual {p0}, La/a/a/a/a/d/d;->a()Ljava/lang/String;

    move-result-object v2

    .line 114
    iget-object v3, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v3, v2}, La/a/a/a/a/d/h;->a(Ljava/lang/String;)V

    .line 116
    iget-object v3, p0, La/a/a/a/a/d/d;->a:Landroid/content/Context;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "generated new file %s"

    new-array v6, v0, [Ljava/lang/Object;

    aput-object v2, v6, v1

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, La/a/a/a/a/b/l;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 122
    iget-object v1, p0, La/a/a/a/a/d/d;->c:La/a/a/a/a/b/q;

    invoke-interface {v1}, La/a/a/a/a/b/q;->a()J

    move-result-wide v2

    iput-wide v2, p0, La/a/a/a/a/d/d;->e:J

    move v1, v0

    .line 1168
    :cond_0
    iget-object v0, p0, La/a/a/a/a/d/d;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/d/i;

    .line 1170
    :try_start_0
    invoke-interface {v0}, La/a/a/a/a/d/i;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1172
    :catch_0
    move-exception v0

    iget-object v0, p0, La/a/a/a/a/d/d;->a:Landroid/content/Context;

    const-string v3, "One of the roll over listeners threw an exception"

    invoke-static {v0, v3}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 127
    :cond_1
    return v1
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    .line 179
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v0}, La/a/a/a/a/d/h;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    iget-object v1, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v1}, La/a/a/a/a/d/h;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, La/a/a/a/a/d/h;->a(Ljava/util/List;)V

    .line 189
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v0}, La/a/a/a/a/d/h;->e()V

    .line 190
    return-void
.end method

.method public final g()V
    .locals 9

    .prologue
    .line 193
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v0}, La/a/a/a/a/d/h;->d()Ljava/util/List;

    move-result-object v0

    .line 194
    invoke-virtual {p0}, La/a/a/a/a/d/d;->b()I

    move-result v1

    .line 196
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-gt v2, v1, :cond_0

    .line 230
    :goto_0
    return-void

    .line 200
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    .line 202
    iget-object v3, p0, La/a/a/a/a/d/d;->a:Landroid/content/Context;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v7

    const/4 v1, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v3}, La/a/a/a/a/b/l;->e(Landroid/content/Context;)V

    .line 207
    new-instance v1, Ljava/util/TreeSet;

    new-instance v3, La/a/a/a/a/d/e;

    invoke-direct {v3, p0}, La/a/a/a/a/d/e;-><init>(La/a/a/a/a/d/d;)V

    invoke-direct {v1, v3}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 215
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 216
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La/a/a/a/a/d/d;->a(Ljava/lang/String;)J

    move-result-wide v4

    .line 217
    new-instance v6, La/a/a/a/a/d/f;

    invoke-direct {v6, v0, v4, v5}, La/a/a/a/a/d/f;-><init>(Ljava/io/File;J)V

    invoke-virtual {v1, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 220
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 221
    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/d/f;

    .line 222
    iget-object v0, v0, La/a/a/a/a/d/f;->a:Ljava/io/File;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    .line 229
    :cond_3
    iget-object v0, p0, La/a/a/a/a/d/d;->d:La/a/a/a/a/d/h;

    invoke-interface {v0, v3}, La/a/a/a/a/d/h;->a(Ljava/util/List;)V

    goto :goto_0
.end method
