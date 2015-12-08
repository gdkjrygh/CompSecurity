.class public final Lcom/google/android/gms/tagmanager/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcom/google/android/gms/tagmanager/aq;


# direct methods
.method private declared-synchronized c()Lcom/google/android/gms/tagmanager/aq;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->b:Lcom/google/android/gms/tagmanager/aq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method final a(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->c()Lcom/google/android/gms/tagmanager/aq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/aq;->a(Ljava/lang/String;)V

    return-void
.end method

.method final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->b:Lcom/google/android/gms/tagmanager/aq;

    return-void
.end method
