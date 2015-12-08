.class final Lkik/android/net/communicator/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/net/communicator/CommunicatorService;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/CommunicatorService;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lkik/android/net/communicator/c;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 132
    check-cast p2, Ljava/lang/Long;

    iget-object v0, p0, Lkik/android/net/communicator/c;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;J)J

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x4e20

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lkik/android/net/communicator/c;->a:Lkik/android/net/communicator/CommunicatorService;

    const-wide/16 v2, 0x1

    const-string v4, "disconnection"

    invoke-static {v1, v2, v3, v0, v4}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JZLjava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
