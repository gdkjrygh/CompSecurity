.class abstract Lcom/b/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/b/l;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Landroid/content/Context;

.field private d:Lcom/b/a/b/e;

.field private e:La/a/a/a/a/b/x;

.field private f:La/a/a/a/a/g/f;

.field private g:Lcom/b/a/b/f;

.field private h:La/a/a/a/a/f/c;

.field private i:La/a/a/a/a/b/q;

.field private j:La/a/a/a/a/e/m;

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/b/a/b/a;-><init>(Z)V

    .line 61
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/b/a/b/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/b/a/b/a;->k:J

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/b/a/b/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/b/a/b/e;La/a/a/a/a/b/x;La/a/a/a/a/g/f;Lcom/b/a/b/f;La/a/a/a/a/f/c;La/a/a/a/a/b/q;La/a/a/a/a/e/m;)V
    .locals 2

    .prologue
    .line 81
    iput-object p1, p0, Lcom/b/a/b/a;->c:Landroid/content/Context;

    .line 82
    iput-object p2, p0, Lcom/b/a/b/a;->d:Lcom/b/a/b/e;

    .line 83
    iput-object p3, p0, Lcom/b/a/b/a;->e:La/a/a/a/a/b/x;

    .line 84
    iput-object p4, p0, Lcom/b/a/b/a;->f:La/a/a/a/a/g/f;

    .line 85
    iput-object p5, p0, Lcom/b/a/b/a;->g:Lcom/b/a/b/f;

    .line 86
    iput-object p6, p0, Lcom/b/a/b/a;->h:La/a/a/a/a/f/c;

    .line 87
    iput-object p7, p0, Lcom/b/a/b/a;->i:La/a/a/a/a/b/q;

    .line 88
    iput-object p8, p0, Lcom/b/a/b/a;->j:La/a/a/a/a/e/m;

    .line 1110
    iget-object v0, p0, Lcom/b/a/b/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1111
    iget-object v0, p0, Lcom/b/a/b/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/b/a/b/a;->b()V

    .line 93
    :cond_0
    return-void
.end method

.method protected final a()Z
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/b/a/b/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    iget-object v0, p0, Lcom/b/a/b/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected final b()V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 118
    iget-object v1, p0, Lcom/b/a/b/a;->h:La/a/a/a/a/f/c;

    monitor-enter v1

    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/b/a/b/a;->h:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "last_update_check"

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/b/a/b/a;->h:La/a/a/a/a/f/c;

    iget-object v2, p0, Lcom/b/a/b/a;->h:La/a/a/a/a/f/c;

    invoke-interface {v2}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "last_update_check"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v0, v2}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    .line 122
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object v0, p0, Lcom/b/a/b/a;->i:La/a/a/a/a/b/q;

    invoke-interface {v0}, La/a/a/a/a/b/q;->a()J

    move-result-wide v6

    .line 125
    iget-object v0, p0, Lcom/b/a/b/a;->f:La/a/a/a/a/g/f;

    iget v0, v0, La/a/a/a/a/g/f;->b:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 128
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 129
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Check for updates last check time: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1180
    iget-wide v4, p0, Lcom/b/a/b/a;->k:J

    .line 129
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2180
    iget-wide v2, p0, Lcom/b/a/b/a;->k:J

    .line 132
    add-long/2addr v0, v2

    .line 134
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Check for updates current time: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", next check time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 137
    cmp-long v0, v6, v0

    if-ltz v0, :cond_1

    .line 3149
    :try_start_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 3151
    new-instance v0, La/a/a/a/a/b/j;

    invoke-direct {v0}, La/a/a/a/a/b/j;-><init>()V

    iget-object v0, p0, Lcom/b/a/b/a;->c:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 3152
    iget-object v0, p0, Lcom/b/a/b/a;->e:La/a/a/a/a/b/x;

    iget-object v1, p0, Lcom/b/a/b/a;->g:Lcom/b/a/b/f;

    iget-object v1, v1, Lcom/b/a/b/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, La/a/a/a/a/b/x;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 3155
    new-instance v0, Lcom/b/a/b/g;

    iget-object v1, p0, Lcom/b/a/b/a;->d:Lcom/b/a/b/e;

    iget-object v2, p0, Lcom/b/a/b/a;->d:Lcom/b/a/b/e;

    .line 3214
    invoke-virtual {v2}, Lcom/b/a/b/e;->v()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.crashlytics.ApiEndpoint"

    invoke-static {v2, v3}, La/a/a/a/a/b/l;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3155
    iget-object v3, p0, Lcom/b/a/b/a;->f:La/a/a/a/a/g/f;

    iget-object v3, v3, La/a/a/a/a/g/f;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/b/a/b/a;->j:La/a/a/a/a/e/m;

    new-instance v5, Lcom/b/a/b/i;

    invoke-direct {v5}, Lcom/b/a/b/i;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/b/a/b/g;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;Lcom/b/a/b/i;)V

    .line 3166
    iget-object v1, p0, Lcom/b/a/b/a;->g:Lcom/b/a/b/f;

    invoke-virtual {v0, v8, v9, v1}, Lcom/b/a/b/g;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/b/f;)Lcom/b/a/b/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 4173
    iput-wide v6, p0, Lcom/b/a/b/a;->k:J

    .line 146
    :goto_0
    return-void

    .line 122
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 141
    :catchall_1
    move-exception v0

    .line 5173
    iput-wide v6, p0, Lcom/b/a/b/a;->k:J

    .line 141
    throw v0

    .line 144
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0
.end method
