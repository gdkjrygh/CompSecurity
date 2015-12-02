.class Lcom/facebook/orca/protocol/methods/r;
.super Ljava/lang/Object;
.source "FetchThreadsFqlHelper.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field final e:I

.field final f:J


# direct methods
.method public constructor <init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;IJ)V"
        }
    .end annotation

    .prologue
    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/r;->a:Lcom/google/common/a/es;

    .line 210
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/r;->b:Lcom/google/common/a/es;

    .line 211
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/r;->c:Lcom/google/common/a/es;

    .line 212
    iput-object p4, p0, Lcom/facebook/orca/protocol/methods/r;->d:Lcom/google/common/a/es;

    .line 213
    iput p5, p0, Lcom/facebook/orca/protocol/methods/r;->e:I

    .line 214
    iput-wide p6, p0, Lcom/facebook/orca/protocol/methods/r;->f:J

    .line 215
    return-void
.end method
