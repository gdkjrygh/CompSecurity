.class public final Lkik/a/i/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/i/h;


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/util/Map;

.field private c:Ljava/lang/Object;

.field private d:Lcom/kik/g/p;

.field private final e:Lkik/a/j/n;


# direct methods
.method public constructor <init>(Lkik/a/j/n;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/i/a;->c:Ljava/lang/Object;

    .line 45
    iput-object p1, p0, Lkik/a/i/a;->e:Lkik/a/j/n;

    .line 46
    return-void
.end method

.method static synthetic a(Lkik/a/i/a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/i/a;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lkik/a/i/a;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lkik/a/i/a;->a:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lkik/a/i/a;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lkik/a/i/a;->b:Ljava/util/Map;

    return-object p1
.end method

.method private b()Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 79
    iget-object v1, p0, Lkik/a/i/a;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 80
    :try_start_0
    iget-object v0, p0, Lkik/a/i/a;->d:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/i/a;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    :cond_0
    iget-object v0, p0, Lkik/a/i/a;->e:Lkik/a/j/n;

    const-string v2, "browser_history_item_list"

    const-class v3, Lcom/kik/n/a/b/e;

    invoke-interface {v0, v2, v3}, Lkik/a/j/n;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/a/i/b;

    invoke-direct {v2, p0}, Lkik/a/i/b;-><init>(Lkik/a/i/a;)V

    invoke-static {v0, v2}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/i/a;->d:Lcom/kik/g/p;

    .line 138
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-object v0, p0, Lkik/a/i/a;->d:Lcom/kik/g/p;

    return-object v0

    .line 138
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic b(Lkik/a/i/a;)Lkik/a/j/n;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/i/a;->e:Lkik/a/j/n;

    return-object v0
.end method

.method static synthetic c(Lkik/a/i/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/i/a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lkik/a/i/a;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/i/a;->d:Lcom/kik/g/p;

    return-object v0
.end method

.method static synthetic e(Lkik/a/i/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/i/a;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 300
    invoke-direct {p0}, Lkik/a/i/a;->b()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/i/g;

    invoke-direct {v1, p0}, Lkik/a/i/g;-><init>(Lkik/a/i/a;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 307
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 217
    new-instance v0, Lkik/a/i/h$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lkik/a/i/h$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 219
    invoke-virtual {p0, v0}, Lkik/a/i/a;->a(Lkik/a/i/h$a;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 146
    invoke-direct {p0}, Lkik/a/i/a;->b()Lcom/kik/g/p;

    move-result-object v0

    iget-object v1, p0, Lkik/a/i/a;->e:Lkik/a/j/n;

    const-string v2, "browser_history_item_list"

    const-class v3, Lcom/kik/n/a/b/e;

    invoke-interface {v1, v2, v3}, Lkik/a/j/n;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/g/s;->c(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/i/e;

    invoke-direct {v1, p0, p1}, Lkik/a/i/e;-><init>(Lkik/a/i/a;Ljava/util/List;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/i/h$a;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 224
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkik/a/i/h$a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 225
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid history item"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 227
    :goto_0
    return-object v0

    :cond_1
    invoke-direct {p0}, Lkik/a/i/a;->b()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/i/f;

    invoke-direct {v1, p0, p1}, Lkik/a/i/f;-><init>(Lkik/a/i/a;Lkik/a/i/h$a;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method
