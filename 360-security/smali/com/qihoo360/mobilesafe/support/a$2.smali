.class Lcom/qihoo360/mobilesafe/support/a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/support/a/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:[Ljava/lang/Object;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/i;


# direct methods
.method constructor <init>([Ljava/lang/Object;Lcom/qihoo360/mobilesafe/support/a/i;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a$2;->a:[Ljava/lang/Object;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a$2;->b:Lcom/qihoo360/mobilesafe/support/a/i;

    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 428
    invoke-static {p2}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    .line 429
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/f;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/f;-><init>()V

    .line 430
    invoke-virtual {v1, v0}, Lcom/qihoo360/mobilesafe/support/a/f;->a(Lcom/qihoo360/mobilesafe/support/a/b;)V

    .line 431
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a$2;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 433
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a$2;->b:Lcom/qihoo360/mobilesafe/support/a/i;

    monitor-enter v1

    .line 434
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a$2;->b:Lcom/qihoo360/mobilesafe/support/a/i;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/i;->a()V

    .line 433
    monitor-exit v1

    .line 436
    return-void

    .line 433
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 440
    return-void
.end method
