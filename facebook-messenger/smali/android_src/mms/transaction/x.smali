.class public Landroid_src/mms/transaction/x;
.super Ljava/lang/Object;
.source "TransactionState.java"


# instance fields
.field private a:Landroid/net/Uri;

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Landroid_src/mms/transaction/x;->b:I

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Landroid_src/mms/transaction/x;->a:Landroid/net/Uri;

    .line 47
    return-void
.end method


# virtual methods
.method public declared-synchronized a()I
    .locals 1

    .prologue
    .line 56
    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroid_src/mms/transaction/x;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(I)V
    .locals 3

    .prologue
    .line 66
    monitor-enter p0

    if-gez p1, :cond_0

    const/4 v0, 0x2

    if-le p1, v0, :cond_0

    .line 67
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 69
    :cond_0
    :try_start_1
    iput p1, p0, Landroid_src/mms/transaction/x;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    monitor-exit p0

    return-void
.end method

.method declared-synchronized a(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 87
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Landroid_src/mms/transaction/x;->a:Landroid/net/Uri;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit p0

    return-void

    .line 87
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 78
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid_src/mms/transaction/x;->a:Landroid/net/Uri;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
