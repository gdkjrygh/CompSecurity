.class public Lcom/facebook/inject/az;
.super Lcom/facebook/inject/d;
.source "SingletonProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/inject/d",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/inject/az;->a:Ljavax/inject/a;

    .line 20
    return-void
.end method


# virtual methods
.method public declared-synchronized b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 24
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/inject/az;->c:Z

    if-nez v0, :cond_0

    .line 25
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v0

    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/av;->a(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 28
    :try_start_1
    const-class v0, Lcom/facebook/inject/n;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/inject/n;

    .line 29
    invoke-virtual {v0}, Lcom/facebook/inject/n;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :try_start_2
    iget-object v1, p0, Lcom/facebook/inject/az;->a:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/inject/az;->b:Ljava/lang/Object;

    .line 32
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/inject/az;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    :try_start_3
    invoke-virtual {v0}, Lcom/facebook/inject/n;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 37
    :try_start_4
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v0

    const-class v1, Ljavax/inject/Singleton;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/az;->b:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit p0

    return-object v0

    .line 34
    :catchall_0
    move-exception v1

    :try_start_5
    invoke-virtual {v0}, Lcom/facebook/inject/n;->b()V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 37
    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v1

    const-class v2, Ljavax/inject/Singleton;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/av;->b(Ljava/lang/Class;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 24
    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0
.end method
