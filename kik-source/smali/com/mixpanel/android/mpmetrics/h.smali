.class final Lcom/mixpanel/android/mpmetrics/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/h$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Set;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Lcom/mixpanel/android/mpmetrics/h$a;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/h$a;)V
    .locals 2

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/h;->a:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/h;->b:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/h;->g:Lcom/mixpanel/android/mpmetrics/h$a;

    .line 21
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->c:Ljava/util/Set;

    .line 24
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->d:Ljava/util/Set;

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    return-void
.end method

.method private declared-synchronized d()Z
    .locals 1

    .prologue
    .line 128
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Z)Lcom/mixpanel/android/mpmetrics/Survey;
    .locals 3

    .prologue
    .line 72
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    const/4 v0, 0x0

    .line 79
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 75
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Survey;

    .line 76
    if-eqz p1, :cond_0

    .line 77
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized a(Ljava/util/List;Ljava/util/List;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    .line 46
    monitor-enter p0

    const/4 v2, 0x0

    .line 48
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/Survey;

    .line 49
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/Survey;->a()I

    move-result v4

    .line 50
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/h;->c:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 51
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->c:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    :goto_1
    move v2, v0

    .line 55
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 58
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->b()I

    move-result v4

    .line 59
    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/h;->d:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 60
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->d:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v1

    :goto_3
    move v2, v0

    .line 64
    goto :goto_2

    .line 66
    :cond_1
    if-eqz v2, :cond_2

    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/h;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->g:Lcom/mixpanel/android/mpmetrics/h$a;

    if-eqz v0, :cond_2

    .line 67
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->g:Lcom/mixpanel/android/mpmetrics/h$a;

    invoke-interface {v0}, Lcom/mixpanel/android/mpmetrics/h$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_2
    monitor-exit p0

    return-void

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_1
.end method

.method public final declared-synchronized b(Z)Lcom/mixpanel/android/mpmetrics/InAppNotification;
    .locals 3

    .prologue
    .line 100
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 101
    const/4 v0, 0x0

    .line 107
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 103
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 104
    if-eqz p1, :cond_0

    .line 105
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/h;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/h;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
