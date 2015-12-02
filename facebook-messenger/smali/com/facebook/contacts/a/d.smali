.class public Lcom/facebook/contacts/a/d;
.super Ljava/lang/Object;
.source "FavoriteContactsCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;
.implements Lcom/facebook/contacts/a/a;


# instance fields
.field private a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private final c:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/contacts/a/d;->c:Lcom/facebook/common/time/a;

    .line 25
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/a/d;->b:J

    .line 26
    return-void
.end method

.method private declared-synchronized e()V
    .locals 4

    .prologue
    .line 49
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/a/d;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/contacts/a/d;->b:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/a/d;->a:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :cond_0
    monitor-exit p0

    return-void

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/contacts/a/d;->a:Lcom/google/common/a/es;

    .line 31
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/contacts/a/d;->b:J

    .line 32
    return-void
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
    .line 35
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/contacts/a/d;->a:Lcom/google/common/a/es;

    .line 36
    iget-object v0, p0, Lcom/facebook/contacts/a/d;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/contacts/a/d;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    monitor-exit p0

    return-void

    .line 35
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
    .line 40
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/contacts/a/d;->e()V

    .line 41
    iget-object v0, p0, Lcom/facebook/contacts/a/d;->a:Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 40
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()J
    .locals 2

    .prologue
    .line 45
    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/facebook/contacts/a/d;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/facebook/contacts/a/d;->a()V

    .line 57
    return-void
.end method
