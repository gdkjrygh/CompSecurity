.class final Lcom/bumptech/glide/load/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/load/b/c;


# instance fields
.field private final b:Lcom/bumptech/glide/load/b/p;

.field private final c:I

.field private final d:I

.field private final e:Lcom/bumptech/glide/load/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/a/c",
            "<TA;>;"
        }
    .end annotation
.end field

.field private final f:Lcom/bumptech/glide/f/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/f/b",
            "<TA;TT;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/bumptech/glide/load/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/g",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/bumptech/glide/load/resource/e/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/resource/e/c",
            "<TT;TZ;>;"
        }
    .end annotation
.end field

.field private final i:Lcom/bumptech/glide/load/b/b;

.field private final j:Lcom/bumptech/glide/load/b/e;

.field private final k:I

.field private final l:Lcom/bumptech/glide/load/b/c;

.field private volatile m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/bumptech/glide/load/b/c;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/c;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/b/a;->a:Lcom/bumptech/glide/load/b/c;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/b/p;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b/b;Lcom/bumptech/glide/load/b/e;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/p;",
            "II",
            "Lcom/bumptech/glide/load/a/c",
            "<TA;>;",
            "Lcom/bumptech/glide/f/b",
            "<TA;TT;>;",
            "Lcom/bumptech/glide/load/g",
            "<TT;>;",
            "Lcom/bumptech/glide/load/resource/e/c",
            "<TT;TZ;>;",
            "Lcom/bumptech/glide/load/b/b;",
            "Lcom/bumptech/glide/load/b/e;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 51
    sget-object v11, Lcom/bumptech/glide/load/b/a;->a:Lcom/bumptech/glide/load/b/c;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lcom/bumptech/glide/load/b/a;-><init>(Lcom/bumptech/glide/load/b/p;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b/b;Lcom/bumptech/glide/load/b/e;ILcom/bumptech/glide/load/b/c;)V

    .line 53
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/b/p;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b/b;Lcom/bumptech/glide/load/b/e;ILcom/bumptech/glide/load/b/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/p;",
            "II",
            "Lcom/bumptech/glide/load/a/c",
            "<TA;>;",
            "Lcom/bumptech/glide/f/b",
            "<TA;TT;>;",
            "Lcom/bumptech/glide/load/g",
            "<TT;>;",
            "Lcom/bumptech/glide/load/resource/e/c",
            "<TT;TZ;>;",
            "Lcom/bumptech/glide/load/b/b;",
            "Lcom/bumptech/glide/load/b/e;",
            "I",
            "Lcom/bumptech/glide/load/b/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    .line 61
    iput p2, p0, Lcom/bumptech/glide/load/b/a;->c:I

    .line 62
    iput p3, p0, Lcom/bumptech/glide/load/b/a;->d:I

    .line 63
    iput-object p4, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    .line 64
    iput-object p5, p0, Lcom/bumptech/glide/load/b/a;->f:Lcom/bumptech/glide/f/b;

    .line 65
    iput-object p6, p0, Lcom/bumptech/glide/load/b/a;->g:Lcom/bumptech/glide/load/g;

    .line 66
    iput-object p7, p0, Lcom/bumptech/glide/load/b/a;->h:Lcom/bumptech/glide/load/resource/e/c;

    .line 67
    iput-object p8, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    .line 68
    iput-object p9, p0, Lcom/bumptech/glide/load/b/a;->j:Lcom/bumptech/glide/load/b/e;

    .line 69
    iput p10, p0, Lcom/bumptech/glide/load/b/a;->k:I

    .line 70
    iput-object p11, p0, Lcom/bumptech/glide/load/b/a;->l:Lcom/bumptech/glide/load/b/c;

    .line 71
    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/load/b/a;)Lcom/bumptech/glide/load/b/c;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->l:Lcom/bumptech/glide/load/b/c;

    return-object v0
.end method

.method private a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<TT;>;)",
            "Lcom/bumptech/glide/load/b/x",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    .line 138
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v2

    .line 1232
    if-nez p1, :cond_4

    .line 1233
    const/4 v0, 0x0

    .line 140
    :cond_0
    :goto_0
    const-string v1, "DecodeJob"

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 141
    const-string v1, "Transformed resource from source"

    invoke-direct {p0, v1, v2, v3}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 2155
    :cond_1
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->j:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/b/e;->b()Z

    move-result v1

    if-nez v1, :cond_5

    .line 146
    :cond_2
    :goto_1
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v2

    .line 147
    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/a;->b(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 148
    const-string v1, "DecodeJob"

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 149
    const-string v1, "Transcoded transformed from source"

    invoke-direct {p0, v1, v2, v3}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 151
    :cond_3
    return-object v0

    .line 1236
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->g:Lcom/bumptech/glide/load/g;

    iget v1, p0, Lcom/bumptech/glide/load/b/a;->c:I

    iget v4, p0, Lcom/bumptech/glide/load/b/a;->d:I

    invoke-interface {v0, p1, v1, v4}, Lcom/bumptech/glide/load/g;->a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 1237
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1238
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->d()V

    goto :goto_0

    .line 2158
    :cond_5
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v2

    .line 2159
    new-instance v1, Lcom/bumptech/glide/load/b/d;

    iget-object v4, p0, Lcom/bumptech/glide/load/b/a;->f:Lcom/bumptech/glide/f/b;

    invoke-interface {v4}, Lcom/bumptech/glide/f/b;->d()Lcom/bumptech/glide/load/f;

    move-result-object v4

    invoke-direct {v1, p0, v4, v0}, Lcom/bumptech/glide/load/b/d;-><init>(Lcom/bumptech/glide/load/b/a;Lcom/bumptech/glide/load/b;Ljava/lang/Object;)V

    .line 2160
    iget-object v4, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    invoke-interface {v4}, Lcom/bumptech/glide/load/b/b;->a()Lcom/bumptech/glide/load/b/b/a;

    move-result-object v4

    iget-object v5, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-interface {v4, v5, v1}, Lcom/bumptech/glide/load/b/b/a;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/b/c;)V

    .line 2161
    const-string v1, "DecodeJob"

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2162
    const-string v1, "Wrote transformed from source to cache"

    invoke-direct {p0, v1, v2, v3}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    goto :goto_1
.end method

.method private a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c;",
            ")",
            "Lcom/bumptech/glide/load/b/x",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/b;->a()Lcom/bumptech/glide/load/b/b/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/b/b/a;->a(Lcom/bumptech/glide/load/c;)Ljava/io/File;

    move-result-object v0

    .line 216
    if-nez v0, :cond_1

    .line 217
    const/4 v0, 0x0

    .line 228
    :cond_0
    :goto_0
    return-object v0

    .line 222
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->f:Lcom/bumptech/glide/f/b;

    invoke-interface {v1}, Lcom/bumptech/glide/f/b;->a()Lcom/bumptech/glide/load/e;

    move-result-object v1

    iget v2, p0, Lcom/bumptech/glide/load/b/a;->c:I

    iget v3, p0, Lcom/bumptech/glide/load/b/a;->d:I

    invoke-interface {v1, v0, v2, v3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 224
    if-nez v0, :cond_0

    .line 225
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    invoke-interface {v1}, Lcom/bumptech/glide/load/b/b;->a()Lcom/bumptech/glide/load/b/b/a;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/bumptech/glide/load/b/b/a;->b(Lcom/bumptech/glide/load/c;)V

    goto :goto_0

    .line 224
    :catchall_0
    move-exception v0

    .line 225
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    invoke-interface {v1}, Lcom/bumptech/glide/load/b/b;->a()Lcom/bumptech/glide/load/b/b/a;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/bumptech/glide/load/b/b/a;->b(Lcom/bumptech/glide/load/c;)V

    throw v0
.end method

.method private a(Ljava/lang/String;J)V
    .locals 4

    .prologue
    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2, p3}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 252
    return-void
.end method

.method private b(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<TT;>;)",
            "Lcom/bumptech/glide/load/b/x",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    .line 244
    if-nez p1, :cond_0

    .line 245
    const/4 v0, 0x0

    .line 247
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->h:Lcom/bumptech/glide/load/resource/e/c;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/load/resource/e/c;->a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    goto :goto_0
.end method

.method private e()Lcom/bumptech/glide/load/b/x;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 169
    :try_start_0
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v0

    .line 170
    iget-object v2, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    iget v3, p0, Lcom/bumptech/glide/load/b/a;->k:I

    invoke-interface {v2, v3}, Lcom/bumptech/glide/load/a/c;->a(I)Ljava/lang/Object;

    move-result-object v2

    .line 171
    const-string v3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 172
    const-string v3, "Fetched data"

    invoke-direct {p0, v3, v0, v1}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 174
    :cond_0
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/a;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->a()V

    const/4 v0, 0x0

    .line 181
    :goto_0
    return-object v0

    .line 2186
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->j:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/e;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2199
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v0

    .line 2200
    new-instance v3, Lcom/bumptech/glide/load/b/d;

    iget-object v4, p0, Lcom/bumptech/glide/load/b/a;->f:Lcom/bumptech/glide/f/b;

    invoke-interface {v4}, Lcom/bumptech/glide/f/b;->c()Lcom/bumptech/glide/load/b;

    move-result-object v4

    invoke-direct {v3, p0, v4, v2}, Lcom/bumptech/glide/load/b/d;-><init>(Lcom/bumptech/glide/load/b/a;Lcom/bumptech/glide/load/b;Ljava/lang/Object;)V

    .line 2201
    iget-object v2, p0, Lcom/bumptech/glide/load/b/a;->i:Lcom/bumptech/glide/load/b/b;

    invoke-interface {v2}, Lcom/bumptech/glide/load/b/b;->a()Lcom/bumptech/glide/load/b/b/a;

    move-result-object v2

    iget-object v4, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-virtual {v4}, Lcom/bumptech/glide/load/b/p;->a()Lcom/bumptech/glide/load/c;

    move-result-object v4

    invoke-interface {v2, v4, v3}, Lcom/bumptech/glide/load/b/b/a;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/b/c;)V

    .line 2202
    const-string v2, "DecodeJob"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2203
    const-string v2, "Wrote source to cache"

    invoke-direct {p0, v2, v0, v1}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 2206
    :cond_2
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v2

    .line 2207
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/p;->a()Lcom/bumptech/glide/load/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 2208
    const-string v1, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 2209
    const-string v1, "Decoded source from cache"

    invoke-direct {p0, v1, v2, v3}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v1}, Lcom/bumptech/glide/load/a/c;->a()V

    goto :goto_0

    .line 2189
    :cond_4
    :try_start_2
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v4

    .line 2190
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->f:Lcom/bumptech/glide/f/b;

    invoke-interface {v0}, Lcom/bumptech/glide/f/b;->b()Lcom/bumptech/glide/load/e;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/load/b/a;->c:I

    iget v3, p0, Lcom/bumptech/glide/load/b/a;->d:I

    invoke-interface {v0, v2, v1, v3}, Lcom/bumptech/glide/load/e;->a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 2191
    const-string v1, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2192
    const-string v1, "Decoded from source"

    invoke-direct {p0, v1, v4, v5}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 179
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v1}, Lcom/bumptech/glide/load/a/c;->a()V

    throw v0
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/load/b/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    .line 80
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->j:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/e;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    const/4 v0, 0x0

    .line 94
    :cond_0
    :goto_0
    return-object v0

    .line 84
    :cond_1
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v0

    .line 85
    iget-object v2, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-direct {p0, v2}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;

    move-result-object v2

    .line 86
    const-string v3, "DecodeJob"

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 87
    const-string v3, "Decoded transformed from cache"

    invoke-direct {p0, v3, v0, v1}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 89
    :cond_2
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v4

    .line 90
    invoke-direct {p0, v2}, Lcom/bumptech/glide/load/b/a;->b(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 91
    const-string v1, "DecodeJob"

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 92
    const-string v1, "Transcoded transformed from cache"

    invoke-direct {p0, v1, v4, v5}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    goto :goto_0
.end method

.method public final b()Lcom/bumptech/glide/load/b/x;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->j:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/e;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const/4 v0, 0x0

    .line 113
    :goto_0
    return-object v0

    .line 108
    :cond_0
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v0

    .line 109
    iget-object v2, p0, Lcom/bumptech/glide/load/b/a;->b:Lcom/bumptech/glide/load/b/p;

    invoke-virtual {v2}, Lcom/bumptech/glide/load/b/p;->a()Lcom/bumptech/glide/load/c;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;

    move-result-object v2

    .line 110
    const-string v3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 111
    const-string v3, "Decoded source from cache"

    invoke-direct {p0, v3, v0, v1}, Lcom/bumptech/glide/load/b/a;->a(Ljava/lang/String;J)V

    .line 113
    :cond_1
    invoke-direct {p0, v2}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    goto :goto_0
.end method

.method public final c()Lcom/bumptech/glide/load/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    .line 128
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/a;->e()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 129
    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/b/a;->m:Z

    .line 134
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a;->e:Lcom/bumptech/glide/load/a/c;

    invoke-interface {v0}, Lcom/bumptech/glide/load/a/c;->c()V

    .line 135
    return-void
.end method
