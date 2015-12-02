.class Lcom/facebook/orca/g/i;
.super Ljava/lang/Object;
.source "DbFetchThreadHandler.java"


# instance fields
.field final a:Lcom/facebook/orca/threads/ThreadSummary;

.field final b:J


# direct methods
.method constructor <init>(Lcom/facebook/orca/threads/ThreadSummary;J)V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    iput-object p1, p0, Lcom/facebook/orca/g/i;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 252
    iput-wide p2, p0, Lcom/facebook/orca/g/i;->b:J

    .line 253
    return-void
.end method
