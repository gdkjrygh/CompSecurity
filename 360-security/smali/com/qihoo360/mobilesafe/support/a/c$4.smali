.class Lcom/qihoo360/mobilesafe/support/a/c$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/c;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/c;

.field private final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/c;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->b:Ljava/lang/String;

    .line 626
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 629
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->c:Landroid/net/LocalServerSocket;

    if-eqz v0, :cond_2

    .line 630
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_0

    .line 631
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Force close listener socket."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 635
    :cond_0
    new-instance v0, Landroid/net/LocalSocket;

    invoke-direct {v0}, Landroid/net/LocalSocket;-><init>()V

    .line 637
    :try_start_0
    new-instance v1, Landroid/net/LocalSocketAddress;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    .line 638
    invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 648
    :cond_1
    :goto_0
    return-void

    .line 639
    :catch_0
    move-exception v0

    .line 640
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v1, v1, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v1, :cond_1

    .line 641
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 644
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$4;->a:Lcom/qihoo360/mobilesafe/support/a/c;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/c;->e:Z

    if-eqz v0, :cond_1

    .line 645
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Watchdog exit."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
