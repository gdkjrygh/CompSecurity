.class Lcom/qihoo360/mobilesafe/support/a/c$8;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->a(ZI)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Z

.field private final synthetic c:Lcom/qihoo360/mobilesafe/support/a/c$a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;ZLcom/qihoo360/mobilesafe/support/a/c$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->b:Z

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    .line 1012
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1014
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->b:Z

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Lcom/qihoo360/mobilesafe/support/a/c;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1015
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    .line 1016
    :cond_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 1017
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 1018
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$8;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 1016
    monitor-exit v1

    .line 1020
    return-void

    .line 1016
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
