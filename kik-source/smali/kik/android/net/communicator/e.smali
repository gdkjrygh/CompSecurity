.class final Lkik/android/net/communicator/e;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/net/communicator/CommunicatorService;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/CommunicatorService;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lkik/android/net/communicator/e;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 153
    iget-object v0, p0, Lkik/android/net/communicator/e;->a:Lkik/android/net/communicator/CommunicatorService;

    invoke-static {v0, v4}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;Z)Z

    iget-object v0, p0, Lkik/android/net/communicator/e;->a:Lkik/android/net/communicator/CommunicatorService;

    const-wide/16 v2, 0x1

    const-string v1, "requested retry reset"

    invoke-static {v0, v2, v3, v4, v1}, Lkik/android/net/communicator/CommunicatorService;->a(Lkik/android/net/communicator/CommunicatorService;JZLjava/lang/String;)V

    return-void
.end method
