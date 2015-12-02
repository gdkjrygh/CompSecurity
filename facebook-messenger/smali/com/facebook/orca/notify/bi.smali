.class public Lcom/facebook/orca/notify/bi;
.super Lcom/facebook/orca/notify/ai;
.source "ReadThreadNotification.java"


# instance fields
.field private final b:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/common/a/ev;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/orca/notify/aj;->READ_THREAD:Lcom/facebook/orca/notify/aj;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ai;-><init>(Lcom/facebook/orca/notify/aj;)V

    .line 16
    iput-object p1, p0, Lcom/facebook/orca/notify/bi;->b:Lcom/google/common/a/ev;

    .line 17
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/notify/bi;->b:Lcom/google/common/a/ev;

    return-object v0
.end method
