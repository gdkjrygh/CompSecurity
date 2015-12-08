.class public final Lcom/roidapp/imagelib/filter/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/roidapp/imagelib/filter/aa;


# instance fields
.field private b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field private c:Lcom/roidapp/imagelib/b/b;

.field private d:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/roidapp/imagelib/filter/aa;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/aa;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/filter/aa;->a:Lcom/roidapp/imagelib/filter/aa;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/imagelib/filter/aa;->e:I

    .line 15
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->c:Lcom/roidapp/imagelib/b/b;

    .line 16
    return-void
.end method

.method public static a()Lcom/roidapp/imagelib/filter/aa;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/roidapp/imagelib/filter/aa;->a:Lcom/roidapp/imagelib/filter/aa;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 36
    monitor-enter p0

    .line 37
    :try_start_0
    iput p1, p0, Lcom/roidapp/imagelib/filter/aa;->e:I

    .line 38
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/roidapp/imagelib/b/b;)V
    .locals 1

    .prologue
    .line 74
    monitor-enter p0

    .line 75
    :try_start_0
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aa;->c:Lcom/roidapp/imagelib/b/b;

    .line 76
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 62
    monitor-enter p0

    .line 63
    :try_start_0
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aa;->b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 64
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 30
    monitor-enter p0

    .line 31
    :try_start_0
    iget v0, p0, Lcom/roidapp/imagelib/filter/aa;->e:I

    monitor-exit p0

    return v0

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 44
    monitor-enter p0

    .line 45
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->d:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    monitor-exit p0

    return-object v0

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 56
    monitor-enter p0

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    monitor-exit p0

    return-object v0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()Lcom/roidapp/imagelib/b/b;
    .locals 1

    .prologue
    .line 68
    monitor-enter p0

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->c:Lcom/roidapp/imagelib/b/b;

    monitor-exit p0

    return-object v0

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final declared-synchronized f()V
    .locals 1

    .prologue
    .line 80
    monitor-enter p0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 81
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->d:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 83
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aa;->c:Lcom/roidapp/imagelib/b/b;

    .line 84
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 88
    monitor-enter p0

    .line 89
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aa;->c:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit p0

    .line 95
    :goto_0
    return v0

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aa;->b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aa;->b:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aa;->d:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aa;->d:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    if-eqz v1, :cond_3

    .line 93
    :cond_2
    monitor-exit p0

    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 95
    :cond_3
    const/4 v0, 0x0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
