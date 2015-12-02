.class public Lcom/facebook/orca/contacts/divebar/e;
.super Ljava/lang/Object;
.source "DivebarCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;
.implements Lcom/facebook/contacts/a/a;


# instance fields
.field private final a:Lcom/facebook/common/time/a;

.field private final b:Lcom/facebook/l/k;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/l/j;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private e:J

.field private f:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private g:J

.field private h:Z

.field private i:Z

.field private j:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private k:J

.field private l:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private m:J

.field private n:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private o:J


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;Lcom/facebook/l/k;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/l/k;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/l/j;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    .line 55
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/e;->b:Lcom/facebook/l/k;

    .line 56
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/e;->c:Ljavax/inject/a;

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/e;Z)Z
    .locals 0

    .prologue
    .line 21
    iput-boolean p1, p0, Lcom/facebook/orca/contacts/divebar/e;->h:Z

    return p1
.end method

.method private h()V
    .locals 7

    .prologue
    const-wide/32 v5, 0x36ee80

    const/4 v4, 0x0

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->d:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/e;->e:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-lez v0, :cond_0

    .line 146
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->d:Lcom/google/common/a/es;

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;

    if-eqz v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/j;

    invoke-virtual {v0}, Lcom/facebook/l/j;->shouldShowPresence()Z

    move-result v0

    if-nez v0, :cond_5

    .line 151
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;

    .line 156
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->j:Lcom/google/common/a/es;

    if-eqz v0, :cond_2

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/e;->k:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-lez v0, :cond_2

    .line 158
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->j:Lcom/google/common/a/es;

    .line 161
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->l:Lcom/google/common/a/es;

    if-eqz v0, :cond_3

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/e;->m:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-lez v0, :cond_3

    .line 163
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->l:Lcom/google/common/a/es;

    .line 166
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->n:Lcom/google/common/a/es;

    if-eqz v0, :cond_4

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/e;->o:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-lez v0, :cond_4

    .line 168
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->n:Lcom/google/common/a/es;

    .line 171
    :cond_4
    return-void

    .line 152
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/e;->g:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 153
    iput-object v4, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .prologue
    .line 130
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->d:Lcom/google/common/a/es;

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;

    .line 132
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->j:Lcom/google/common/a/es;

    .line 133
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->l:Lcom/google/common/a/es;

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->n:Lcom/google/common/a/es;

    .line 135
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->e:J

    .line 136
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->g:J

    .line 137
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->k:J

    .line 138
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->m:J

    .line 139
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->o:J

    .line 140
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/e;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    monitor-exit p0

    return-void

    .line 130
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->d:Lcom/google/common/a/es;

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit p0

    return-void

    .line 60
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 65
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/e;->h()V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->d:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 65
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 70
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/j;

    invoke-virtual {v0}, Lcom/facebook/l/j;->shouldShowPresence()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 87
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 73
    :cond_1
    :try_start_1
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->g:J

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/e;->h:Z

    .line 76
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/e;->i:Z

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->b:Lcom/facebook/l/k;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/f;-><init>(Lcom/facebook/orca/contacts/divebar/e;)V

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/l/v;)V

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/e;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 99
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/e;->h()V

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->l:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 99
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 94
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->l:Lcom/google/common/a/es;

    .line 95
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->m:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    monitor-exit p0

    return-void

    .line 94
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 175
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/e;->a()V

    .line 176
    return-void
.end method

.method public declared-synchronized d(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 109
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->j:Lcom/google/common/a/es;

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->k:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    monitor-exit p0

    return-void

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 104
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/e;->h()V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->f:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 104
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 124
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/e;->n:Lcom/google/common/a/es;

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->a:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/e;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    monitor-exit p0

    return-void

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 114
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/e;->h()V

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->j:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 114
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 119
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/e;->h()V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/e;->n:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 119
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
