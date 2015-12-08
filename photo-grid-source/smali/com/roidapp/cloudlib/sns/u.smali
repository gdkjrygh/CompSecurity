.class public Lcom/roidapp/cloudlib/sns/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/cloudlib/sns/u;


# instance fields
.field private b:Lcom/roidapp/cloudlib/sns/v;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lcom/roidapp/cloudlib/sns/v;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/v;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    .line 13
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/v;->b()V

    .line 14
    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/sns/u;
    .locals 2

    .prologue
    .line 17
    sget-object v0, Lcom/roidapp/cloudlib/sns/u;->a:Lcom/roidapp/cloudlib/sns/u;

    if-nez v0, :cond_1

    .line 18
    const-class v1, Lcom/roidapp/cloudlib/sns/u;

    monitor-enter v1

    .line 19
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/u;->a:Lcom/roidapp/cloudlib/sns/u;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Lcom/roidapp/cloudlib/sns/u;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/u;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/u;->a:Lcom/roidapp/cloudlib/sns/u;

    .line 22
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/u;->a:Lcom/roidapp/cloudlib/sns/u;

    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method final a(Lcom/roidapp/cloudlib/sns/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    if-eqz v0, :cond_0

    .line 29
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/v;->a(Lcom/roidapp/cloudlib/sns/o;)V

    .line 31
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/v;->a(Ljava/lang/Object;)V

    .line 37
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/v;->c()V

    .line 42
    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/u;->b:Lcom/roidapp/cloudlib/sns/v;

    .line 44
    :cond_0
    sput-object v1, Lcom/roidapp/cloudlib/sns/u;->a:Lcom/roidapp/cloudlib/sns/u;

    .line 45
    return-void
.end method
