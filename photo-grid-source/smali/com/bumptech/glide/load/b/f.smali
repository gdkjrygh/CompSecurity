.class public final Lcom/bumptech/glide/load/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/o;
.implements Lcom/bumptech/glide/load/b/o;
.implements Lcom/bumptech/glide/load/b/s;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/bumptech/glide/load/c;",
            "Lcom/bumptech/glide/load/b/l;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/b/q;

.field private final c:Lcom/bumptech/glide/load/b/b/n;

.field private final d:Lcom/bumptech/glide/load/b/g;

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/bumptech/glide/load/c;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final f:Lcom/bumptech/glide/load/b/y;

.field private final g:Lcom/bumptech/glide/load/b/h;

.field private h:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/b/n;Lcom/bumptech/glide/load/b/b/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    .prologue
    .line 63
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/bumptech/glide/load/b/f;-><init>(Lcom/bumptech/glide/load/b/b/n;Lcom/bumptech/glide/load/b/b/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;B)V

    .line 64
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/b/b/n;Lcom/bumptech/glide/load/b/b/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;B)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/b/n;",
            "Lcom/bumptech/glide/load/b/b/b;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/ExecutorService;",
            "B)V"
        }
    .end annotation

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/bumptech/glide/load/b/f;->c:Lcom/bumptech/glide/load/b/b/n;

    .line 72
    new-instance v0, Lcom/bumptech/glide/load/b/h;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/load/b/h;-><init>(Lcom/bumptech/glide/load/b/b/b;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->g:Lcom/bumptech/glide/load/b/h;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 77
    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    .line 80
    new-instance v0, Lcom/bumptech/glide/load/b/q;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/q;-><init>()V

    .line 82
    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->b:Lcom/bumptech/glide/load/b/q;

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 87
    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    .line 90
    new-instance v0, Lcom/bumptech/glide/load/b/g;

    invoke-direct {v0, p3, p4, p0}, Lcom/bumptech/glide/load/b/g;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lcom/bumptech/glide/load/b/o;)V

    .line 92
    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->d:Lcom/bumptech/glide/load/b/g;

    .line 95
    new-instance v0, Lcom/bumptech/glide/load/b/y;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/y;-><init>()V

    .line 97
    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->f:Lcom/bumptech/glide/load/b/y;

    .line 99
    invoke-interface {p1, p0}, Lcom/bumptech/glide/load/b/b/n;->a(Lcom/bumptech/glide/load/b/b/o;)V

    .line 100
    return-void
.end method

.method private a()Ljava/lang/ref/ReferenceQueue;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 302
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->h:Ljava/lang/ref/ReferenceQueue;

    if-nez v0, :cond_0

    .line 303
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/f;->h:Ljava/lang/ref/ReferenceQueue;

    .line 304
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    .line 305
    new-instance v1, Lcom/bumptech/glide/load/b/j;

    iget-object v2, p0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    iget-object v3, p0, Lcom/bumptech/glide/load/b/f;->h:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1, v2, v3}, Lcom/bumptech/glide/load/b/j;-><init>(Ljava/util/Map;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->h:Ljava/lang/ref/ReferenceQueue;

    return-object v0
.end method

.method public static a(Lcom/bumptech/glide/load/b/x;)V
    .locals 2

    .prologue
    .line 247
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 248
    instance-of v0, p0, Lcom/bumptech/glide/load/b/r;

    if-eqz v0, :cond_0

    .line 249
    check-cast p0, Lcom/bumptech/glide/load/b/r;

    invoke-virtual {p0}, Lcom/bumptech/glide/load/b/r;->f()V

    return-void

    .line 251
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot release anything but an EngineResource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static a(Ljava/lang/String;JLcom/bumptech/glide/load/c;)V
    .locals 5

    .prologue
    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/bumptech/glide/i/d;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms, key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/c;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;IZLcom/bumptech/glide/load/b/e;Lcom/bumptech/glide/g/f;)Lcom/bumptech/glide/load/b/i;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/c;",
            "II",
            "Lcom/bumptech/glide/load/a/c",
            "<TT;>;",
            "Lcom/bumptech/glide/f/b",
            "<TT;TZ;>;",
            "Lcom/bumptech/glide/load/g",
            "<TZ;>;",
            "Lcom/bumptech/glide/load/resource/e/c",
            "<TZ;TR;>;IZ",
            "Lcom/bumptech/glide/load/b/e;",
            "Lcom/bumptech/glide/g/f;",
            ")",
            "Lcom/bumptech/glide/load/b/i;"
        }
    .end annotation

    .prologue
    .line 145
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 146
    invoke-static {}, Lcom/bumptech/glide/i/d;->a()J

    move-result-wide v14

    .line 148
    invoke-interface/range {p4 .. p4}, Lcom/bumptech/glide/load/a/c;->b()Ljava/lang/String;

    move-result-object v3

    .line 149
    invoke-interface/range {p5 .. p5}, Lcom/bumptech/glide/f/b;->a()Lcom/bumptech/glide/load/e;

    move-result-object v7

    invoke-interface/range {p5 .. p5}, Lcom/bumptech/glide/f/b;->b()Lcom/bumptech/glide/load/e;

    move-result-object v8

    invoke-interface/range {p5 .. p5}, Lcom/bumptech/glide/f/b;->d()Lcom/bumptech/glide/load/f;

    move-result-object v10

    invoke-interface/range {p5 .. p5}, Lcom/bumptech/glide/f/b;->c()Lcom/bumptech/glide/load/b;

    move-result-object v12

    .line 1016
    new-instance v2, Lcom/bumptech/glide/load/b/p;

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v9, p6

    move-object/from16 v11, p7

    invoke-direct/range {v2 .. v12}, Lcom/bumptech/glide/load/b/p;-><init>(Ljava/lang/String;Lcom/bumptech/glide/load/c;IILcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/e;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/f;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b;)V

    .line 1218
    if-nez p9, :cond_2

    .line 1219
    const/4 v3, 0x0

    .line 154
    :cond_0
    :goto_0
    if-eqz v3, :cond_5

    .line 155
    move-object/from16 v0, p11

    invoke-interface {v0, v3}, Lcom/bumptech/glide/g/f;->a(Lcom/bumptech/glide/load/b/x;)V

    .line 156
    const-string v3, "Engine"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 157
    const-string v3, "Loaded resource from cache"

    invoke-static {v3, v14, v15, v2}, Lcom/bumptech/glide/load/b/f;->a(Ljava/lang/String;JLcom/bumptech/glide/load/c;)V

    .line 159
    :cond_1
    const/4 v2, 0x0

    .line 191
    :goto_1
    return-object v2

    .line 1232
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/load/b/f;->c:Lcom/bumptech/glide/load/b/b/n;

    invoke-interface {v3, v2}, Lcom/bumptech/glide/load/b/b/n;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/load/b/x;

    move-result-object v3

    .line 1235
    if-nez v3, :cond_3

    .line 1236
    const/4 v3, 0x0

    .line 1223
    :goto_2
    if-eqz v3, :cond_0

    .line 1224
    invoke-virtual {v3}, Lcom/bumptech/glide/load/b/r;->e()V

    .line 1225
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    new-instance v5, Lcom/bumptech/glide/load/b/k;

    invoke-direct/range {p0 .. p0}, Lcom/bumptech/glide/load/b/f;->a()Ljava/lang/ref/ReferenceQueue;

    move-result-object v6

    invoke-direct {v5, v2, v3, v6}, Lcom/bumptech/glide/load/b/k;-><init>(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;Ljava/lang/ref/ReferenceQueue;)V

    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1237
    :cond_3
    instance-of v4, v3, Lcom/bumptech/glide/load/b/r;

    if-eqz v4, :cond_4

    .line 1239
    check-cast v3, Lcom/bumptech/glide/load/b/r;

    goto :goto_2

    .line 1241
    :cond_4
    new-instance v4, Lcom/bumptech/glide/load/b/r;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Lcom/bumptech/glide/load/b/r;-><init>(Lcom/bumptech/glide/load/b/x;Z)V

    move-object v3, v4

    goto :goto_2

    .line 2199
    :cond_5
    if-nez p9, :cond_7

    .line 2200
    const/4 v3, 0x0

    .line 163
    :goto_3
    if-eqz v3, :cond_9

    .line 164
    move-object/from16 v0, p11

    invoke-interface {v0, v3}, Lcom/bumptech/glide/g/f;->a(Lcom/bumptech/glide/load/b/x;)V

    .line 165
    const-string v3, "Engine"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 166
    const-string v3, "Loaded resource from active resources"

    invoke-static {v3, v14, v15, v2}, Lcom/bumptech/glide/load/b/f;->a(Ljava/lang/String;JLcom/bumptech/glide/load/c;)V

    .line 168
    :cond_6
    const/4 v2, 0x0

    goto :goto_1

    .line 2203
    :cond_7
    const/4 v4, 0x0

    .line 2204
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 2205
    if-eqz v3, :cond_d

    .line 2206
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/load/b/r;

    .line 2207
    if-eqz v3, :cond_8

    .line 2208
    invoke-virtual {v3}, Lcom/bumptech/glide/load/b/r;->e()V

    goto :goto_3

    .line 2210
    :cond_8
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 171
    :cond_9
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/load/b/l;

    .line 172
    if-eqz v3, :cond_b

    .line 173
    move-object/from16 v0, p11

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/load/b/l;->a(Lcom/bumptech/glide/g/f;)V

    .line 174
    const-string v4, "Engine"

    const/4 v5, 0x2

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 175
    const-string v4, "Added to existing load"

    invoke-static {v4, v14, v15, v2}, Lcom/bumptech/glide/load/b/f;->a(Ljava/lang/String;JLcom/bumptech/glide/load/c;)V

    .line 177
    :cond_a
    new-instance v2, Lcom/bumptech/glide/load/b/i;

    move-object/from16 v0, p11

    invoke-direct {v2, v0, v3}, Lcom/bumptech/glide/load/b/i;-><init>(Lcom/bumptech/glide/g/f;Lcom/bumptech/glide/load/b/l;)V

    goto/16 :goto_1

    .line 180
    :cond_b
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/load/b/f;->d:Lcom/bumptech/glide/load/b/g;

    move/from16 v0, p9

    invoke-virtual {v3, v2, v0}, Lcom/bumptech/glide/load/b/g;->a(Lcom/bumptech/glide/load/c;Z)Lcom/bumptech/glide/load/b/l;

    move-result-object v16

    .line 181
    new-instance v3, Lcom/bumptech/glide/load/b/a;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/bumptech/glide/load/b/f;->g:Lcom/bumptech/glide/load/b/h;

    move-object v4, v2

    move/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v12, p10

    move/from16 v13, p8

    invoke-direct/range {v3 .. v13}, Lcom/bumptech/glide/load/b/a;-><init>(Lcom/bumptech/glide/load/b/p;IILcom/bumptech/glide/load/a/c;Lcom/bumptech/glide/f/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/resource/e/c;Lcom/bumptech/glide/load/b/b;Lcom/bumptech/glide/load/b/e;I)V

    .line 183
    new-instance v4, Lcom/bumptech/glide/load/b/t;

    move-object/from16 v0, v16

    move/from16 v1, p8

    invoke-direct {v4, v0, v3, v1}, Lcom/bumptech/glide/load/b/t;-><init>(Lcom/bumptech/glide/load/b/u;Lcom/bumptech/glide/load/b/a;I)V

    .line 184
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    move-object/from16 v0, v16

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    move-object/from16 v0, v16

    move-object/from16 v1, p11

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/b/l;->a(Lcom/bumptech/glide/g/f;)V

    .line 186
    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lcom/bumptech/glide/load/b/l;->a(Lcom/bumptech/glide/load/b/t;)V

    .line 188
    const-string v3, "Engine"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 189
    const-string v3, "Started new load"

    invoke-static {v3, v14, v15, v2}, Lcom/bumptech/glide/load/b/f;->a(Ljava/lang/String;JLcom/bumptech/glide/load/c;)V

    .line 191
    :cond_c
    new-instance v2, Lcom/bumptech/glide/load/b/i;

    move-object/from16 v0, p11

    move-object/from16 v1, v16

    invoke-direct {v2, v0, v1}, Lcom/bumptech/glide/load/b/i;-><init>(Lcom/bumptech/glide/g/f;Lcom/bumptech/glide/load/b/l;)V

    goto/16 :goto_1

    :cond_d
    move-object v3, v4

    goto/16 :goto_3
.end method

.method public final a(Lcom/bumptech/glide/load/b/l;Lcom/bumptech/glide/load/c;)V
    .locals 1

    .prologue
    .line 273
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 274
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/l;

    .line 275
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    :cond_0
    return-void
.end method

.method public final a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c;",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 258
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 260
    if-eqz p2, :cond_0

    .line 261
    invoke-virtual {p2, p1, p0}, Lcom/bumptech/glide/load/b/r;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/s;)V

    .line 263
    invoke-virtual {p2}, Lcom/bumptech/glide/load/b/r;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    new-instance v1, Lcom/bumptech/glide/load/b/k;

    invoke-direct {p0}, Lcom/bumptech/glide/load/b/f;->a()Ljava/lang/ref/ReferenceQueue;

    move-result-object v2

    invoke-direct {v1, p1, p2, v2}, Lcom/bumptech/glide/load/b/k;-><init>(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;Ljava/lang/ref/ReferenceQueue;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    return-void
.end method

.method public final b(Lcom/bumptech/glide/load/b/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 282
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 283
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->f:Lcom/bumptech/glide/load/b/y;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/b/y;->a(Lcom/bumptech/glide/load/b/x;)V

    .line 284
    return-void
.end method

.method public final b(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;)V
    .locals 1

    .prologue
    .line 288
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 289
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    invoke-virtual {p2}, Lcom/bumptech/glide/load/b/r;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->c:Lcom/bumptech/glide/load/b/b/n;

    invoke-interface {v0, p1, p2}, Lcom/bumptech/glide/load/b/b/n;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/x;)Lcom/bumptech/glide/load/b/x;

    .line 295
    :goto_0
    return-void

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/f;->f:Lcom/bumptech/glide/load/b/y;

    invoke-virtual {v0, p2}, Lcom/bumptech/glide/load/b/y;->a(Lcom/bumptech/glide/load/b/x;)V

    goto :goto_0
.end method
