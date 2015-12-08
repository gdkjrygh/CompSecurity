.class final Lkik/android/net/communicator/a$d;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/net/communicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/net/communicator/a;

.field private b:Lkik/android/net/communicator/a$c;


# direct methods
.method public constructor <init>(Lkik/android/net/communicator/a;Lkik/android/net/communicator/a$c;)V
    .locals 0

    .prologue
    .line 665
    iput-object p1, p0, Lkik/android/net/communicator/a$d;->a:Lkik/android/net/communicator/a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 666
    iput-object p2, p0, Lkik/android/net/communicator/a$d;->b:Lkik/android/net/communicator/a$c;

    .line 667
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 674
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/a$d;->b:Lkik/android/net/communicator/a$c;

    invoke-virtual {v0}, Lkik/android/net/communicator/a$c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 682
    :goto_0
    return-void

    .line 678
    :cond_0
    iget-object v0, p0, Lkik/android/net/communicator/a$d;->a:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->r(Lkik/android/net/communicator/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    new-instance v1, Lkik/android/net/communicator/a$e;

    iget-object v2, p0, Lkik/android/net/communicator/a$d;->a:Lkik/android/net/communicator/a;

    const/4 v3, 0x4

    iget-object v4, p0, Lkik/android/net/communicator/a$d;->b:Lkik/android/net/communicator/a$c;

    invoke-direct {v1, v2, v3, v4}, Lkik/android/net/communicator/a$e;-><init>(Lkik/android/net/communicator/a;ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 681
    :catch_0
    move-exception v0

    goto :goto_0
.end method
