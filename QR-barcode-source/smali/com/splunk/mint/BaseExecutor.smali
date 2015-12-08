.class Lcom/splunk/mint/BaseExecutor;
.super Ljava/lang/Object;
.source "BaseExecutor.java"


# static fields
.field protected static volatile executor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    const/4 v0, 0x0

    sput-object v0, Lcom/splunk/mint/BaseExecutor;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
