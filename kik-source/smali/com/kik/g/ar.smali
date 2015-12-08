.class public final Lcom/kik/g/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Lcom/kik/g/k;

.field private final c:Ljava/lang/Object;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/g/ar;->b:Lcom/kik/g/k;

    .line 9
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/g/ar;->c:Ljava/lang/Object;

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/g/ar;->a:Z

    .line 28
    return-void
.end method


# virtual methods
.method protected final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/kik/g/ar;->b:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/kik/g/ar;->a:Z

    return v0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 42
    iget-object v1, p0, Lcom/kik/g/ar;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/kik/g/ar;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/g/ar;->b:Lcom/kik/g/k;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/g/ar;->a:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
