.class Lcom/facebook/orca/sms/e;
.super Ljava/lang/Object;
.source "FetchMmsSmsThreadResult.java"


# instance fields
.field private final a:Lcom/facebook/orca/threads/ThreadSummary;

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/facebook/orca/sms/e;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 16
    iput-object p2, p0, Lcom/facebook/orca/sms/e;->b:Lcom/google/common/a/es;

    .line 17
    return-void
.end method


# virtual methods
.method a()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/orca/sms/e;->a:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/sms/e;->b:Lcom/google/common/a/es;

    return-object v0
.end method
