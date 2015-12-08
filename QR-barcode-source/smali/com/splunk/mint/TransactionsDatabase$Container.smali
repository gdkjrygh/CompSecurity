.class public Lcom/splunk/mint/TransactionsDatabase$Container;
.super Ljava/lang/Object;
.source "TransactionsDatabase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/splunk/mint/TransactionsDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Container"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/splunk/mint/TransactionsDatabase;

.field public timestamp:Ljava/lang/Long;

.field public transid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/TransactionsDatabase;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 0
    .param p2, "timestamp"    # Ljava/lang/Long;
    .param p3, "transid"    # Ljava/lang/String;

    .prologue
    .line 71
    iput-object p1, p0, Lcom/splunk/mint/TransactionsDatabase$Container;->this$0:Lcom/splunk/mint/TransactionsDatabase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p2, p0, Lcom/splunk/mint/TransactionsDatabase$Container;->timestamp:Ljava/lang/Long;

    .line 73
    iput-object p3, p0, Lcom/splunk/mint/TransactionsDatabase$Container;->transid:Ljava/lang/String;

    .line 74
    return-void
.end method
