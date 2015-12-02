.class Lcom/qihoo360/mobilesafe/support/a/c$7;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->a([BI)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:[B

.field private final synthetic c:Lcom/qihoo360/mobilesafe/support/a/c$a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;[BLcom/qihoo360/mobilesafe/support/a/c$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->b:[B

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    .line 901
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 903
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->b:[B

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a/c;->a(Lcom/qihoo360/mobilesafe/support/a/c;[B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 907
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    .line 909
    :cond_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 910
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 911
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$7;->c:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 909
    monitor-exit v1

    .line 913
    return-void

    .line 909
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
