.class Lcom/qihoo360/mobilesafe/support/a/c$6;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->a(I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/c$a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;Lcom/qihoo360/mobilesafe/support/a/c$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    .line 791
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 793
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/support/a/c;->c(Lcom/qihoo360/mobilesafe/support/a/c;)I

    move-result v1

    iput v1, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->b:I

    .line 794
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 795
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 796
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$6;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 794
    monitor-exit v1

    .line 798
    return-void

    .line 794
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
