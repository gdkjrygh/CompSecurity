.class final Lkik/android/net/communicator/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/net/communicator/CommunicatorService;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/CommunicatorService;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lkik/android/net/communicator/d;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 149
    iget-object v0, p0, Lkik/android/net/communicator/d;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lkik/android/net/communicator/CommunicatorService;->b(Lkik/android/net/communicator/CommunicatorService;J)J

    .line 150
    return-void
.end method
