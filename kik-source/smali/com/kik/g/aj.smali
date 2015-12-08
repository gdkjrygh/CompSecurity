.class final Lcom/kik/g/aj;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 798
    iput-object p1, p0, Lcom/kik/g/aj;->a:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 802
    iget-object v1, p0, Lcom/kik/g/aj;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 803
    :try_start_0
    iget-object v0, p0, Lcom/kik/g/aj;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 804
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
