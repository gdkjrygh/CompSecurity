.class public final Lcom/kik/android/c/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/android/c/d;


# instance fields
.field private final a:Lcom/kik/android/c/d;

.field private final b:Lkik/a/j/n;

.field private final c:Lkik/a/e/v;

.field private final d:Lkik/android/d/c;

.field private final e:Lcom/kik/g/as;

.field private final f:Lcom/kik/g/as;


# direct methods
.method public constructor <init>(Lcom/kik/android/c/d;Lkik/a/j/n;Lkik/a/e/v;Lkik/android/d/c;Landroid/content/Context;Lkik/android/util/ar;)V
    .locals 10

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lcom/kik/android/c/m;

    invoke-direct {v0, p0}, Lcom/kik/android/c/m;-><init>(Lcom/kik/android/c/l;)V

    iput-object v0, p0, Lcom/kik/android/c/l;->e:Lcom/kik/g/as;

    .line 48
    new-instance v0, Lcom/kik/android/c/n;

    invoke-direct {v0, p0}, Lcom/kik/android/c/n;-><init>(Lcom/kik/android/c/l;)V

    iput-object v0, p0, Lcom/kik/android/c/l;->f:Lcom/kik/g/as;

    .line 58
    iput-object p1, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    .line 59
    iput-object p2, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    .line 60
    iput-object p3, p0, Lcom/kik/android/c/l;->c:Lkik/a/e/v;

    .line 61
    iput-object p4, p0, Lcom/kik/android/c/l;->d:Lkik/android/d/c;

    .line 62
    iget-object v7, p0, Lcom/kik/android/c/l;->d:Lkik/android/d/c;

    new-instance v0, Lkik/android/d/k;

    const-string v2, "smiley-config-xdata-debounce"

    const-wide/32 v4, 0x2932e00

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v1, 0x4

    new-array v4, v1, [Ljava/lang/Long;

    const/4 v1, 0x0

    const-wide/32 v8, 0x2932e00

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x1

    const-wide/32 v8, 0x36ee80

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x2

    const-wide/32 v8, 0x493e0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x3

    const-wide/32 v8, 0xea60

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    new-instance v5, Lcom/kik/android/c/o;

    invoke-direct {v5, p0}, Lcom/kik/android/c/o;-><init>(Lcom/kik/android/c/l;)V

    move-object v1, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lkik/android/d/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/Long;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v7, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 76
    return-void
.end method

.method static synthetic a(Lcom/kik/android/c/l;)Lcom/kik/android/c/d;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    return-object v0
.end method

.method private static a(Lcom/kik/n/a/j/a;)Ljava/lang/String;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 188
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/kik/n/a/j/a;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 198
    :cond_0
    :goto_0
    return-object v0

    .line 193
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/n/a/j/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lcom/kik/m/e;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/kik/android/c/l;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/kik/android/c/l;->c:Lkik/a/e/v;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/android/c/e;)J
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->a(Lcom/kik/android/c/e;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/android/c/e;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->a(Ljava/lang/String;)Lcom/kik/android/c/e;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/util/List;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/android/c/a;)V
    .locals 4

    .prologue
    .line 218
    if-nez p1, :cond_1

    .line 230
    :cond_0
    :goto_0
    return-void

    .line 221
    :cond_1
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->a(Lcom/kik/android/c/a;)V

    .line 222
    invoke-virtual {p1}, Lcom/kik/android/c/a;->a()Lcom/kik/n/a/j/a;

    move-result-object v0

    .line 223
    invoke-static {v0}, Lcom/kik/android/c/l;->a(Lcom/kik/n/a/j/a;)Ljava/lang/String;

    move-result-object v1

    .line 224
    if-eqz v1, :cond_0

    .line 227
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 228
    const-string v3, "smiley_alternate"

    invoke-static {v3, v1, v0}, Lkik/a/d/ab;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lkik/a/d/ab;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v1, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    iget-object v0, p0, Lcom/kik/android/c/l;->d:Lkik/android/d/c;

    const-string v3, "smiley-config-xdata-debounce"

    invoke-interface {v0, v3}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-interface {v1, v2, v0}, Lkik/a/j/n;->a(Ljava/util/List;Ljava/lang/Long;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 5

    .prologue
    .line 93
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->a(Ljava/util/List;)V

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 96
    invoke-virtual {v0}, Lcom/kik/android/c/e;->b()Lcom/kik/n/a/j/c;

    move-result-object v3

    .line 97
    if-nez v3, :cond_1

    const/4 v0, 0x0

    .line 98
    :goto_1
    if-eqz v0, :cond_0

    .line 99
    const-string v4, "smiley_list"

    invoke-static {v4, v0, v3}, Lkik/a/d/ab;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lkik/a/d/ab;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v3}, Lcom/kik/n/a/j/c;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 103
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 104
    iget-object v0, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    invoke-interface {v0, v1}, Lkik/a/j/n;->a(Ljava/util/List;)Lcom/kik/g/p;

    .line 106
    :cond_3
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->b()V

    .line 206
    return-void
.end method

.method public final b(Lcom/kik/android/c/a;)V
    .locals 4

    .prologue
    .line 126
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->b(Lcom/kik/android/c/a;)V

    .line 127
    iget-object v0, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    const-string v1, "smiley_alternate"

    invoke-virtual {p1}, Lcom/kik/android/c/a;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    .line 128
    return-void
.end method

.method public final b(Lcom/kik/android/c/e;)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->b(Lcom/kik/android/c/e;)V

    .line 140
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 111
    if-nez p1, :cond_0

    .line 122
    :goto_0
    return-void

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->b(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0, p1}, Lcom/kik/android/c/l;->c(Ljava/lang/String;)Lcom/kik/android/c/a;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_1

    .line 118
    invoke-virtual {p0, v0}, Lcom/kik/android/c/l;->b(Lcom/kik/android/c/a;)V

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    const-string v1, "smiley_list"

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/android/c/a;
    .locals 1

    .prologue
    .line 303
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0, p1}, Lcom/kik/android/c/d;->c(Ljava/lang/String;)Lcom/kik/android/c/a;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->c()V

    .line 213
    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->f()V

    .line 152
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->g()Z

    move-result v0

    return v0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->h()V

    .line 164
    return-void
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 169
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->i()Z

    move-result v0

    return v0
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/kik/android/c/l;->a:Lcom/kik/android/c/d;

    invoke-interface {v0}, Lcom/kik/android/c/d;->j()V

    .line 176
    return-void
.end method

.method public final k()Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 241
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 244
    iget-object v1, p0, Lcom/kik/android/c/l;->c:Lkik/a/e/v;

    const-string v2, "com.kik.android.smileys.xSmileyManagerStorage.restored"

    invoke-interface {v1, v2}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 245
    iget-object v1, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    const-string v2, "smiley_list"

    const-class v3, Lcom/kik/n/a/j/c;

    invoke-interface {v1, v2, v3}, Lkik/a/j/n;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v1

    .line 246
    iget-object v2, p0, Lcom/kik/android/c/l;->e:Lcom/kik/g/as;

    invoke-static {v2}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v1

    .line 248
    iget-object v2, p0, Lcom/kik/android/c/l;->b:Lkik/a/j/n;

    const-string v3, "smiley_alternate"

    const-class v4, Lcom/kik/n/a/j/a;

    invoke-interface {v2, v3, v4}, Lkik/a/j/n;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v2

    .line 249
    iget-object v3, p0, Lcom/kik/android/c/l;->f:Lcom/kik/g/as;

    invoke-static {v3}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v2

    .line 250
    new-instance v3, Lcom/kik/android/c/p;

    invoke-direct {v3, p0}, Lcom/kik/android/c/p;-><init>(Lcom/kik/android/c/l;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 261
    invoke-static {v2, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v2

    new-instance v3, Lcom/kik/android/c/q;

    invoke-direct {v3, p0, v0}, Lcom/kik/android/c/q;-><init>(Lcom/kik/android/c/l;Lcom/kik/g/p;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/aq;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 278
    new-instance v2, Lcom/kik/android/c/r;

    invoke-direct {v2, p0, v0}, Lcom/kik/android/c/r;-><init>(Lcom/kik/android/c/l;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 297
    :goto_0
    return-object v0

    .line 294
    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
