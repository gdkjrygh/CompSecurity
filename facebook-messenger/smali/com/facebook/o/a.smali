.class public Lcom/facebook/o/a;
.super Ljava/lang/Object;
.source "StrictModeAggregator.java"


# static fields
.field private static a:Z

.field private static b:Z


# instance fields
.field private c:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/o/a;->a:Z

    .line 18
    const/4 v0, 0x0

    sput-boolean v0, Lcom/facebook/o/a;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/o/a;->c:Lcom/facebook/common/e/h;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 33
    sget-boolean v2, Lcom/facebook/o/a;->a:Z

    if-nez v2, :cond_0

    .line 34
    const-class v1, Lcom/facebook/o/a;

    const-string v2, "Strict mode disabled. Not starting."

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 58
    :goto_0
    return v0

    .line 37
    :cond_0
    sget-boolean v2, Lcom/facebook/o/a;->b:Z

    if-eqz v2, :cond_1

    .line 38
    const-class v0, Lcom/facebook/o/a;

    const-string v2, "Strict mode already running but was asked to run again."

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 39
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x2

    new-array v2, v2, [Lcom/b/a/a/g;

    sget-object v3, Lcom/b/a/a/c;->DetectAll:Lcom/b/a/a/c;

    aput-object v3, v2, v0

    sget-object v3, Lcom/b/a/a/c;->PenaltyDropBox:Lcom/b/a/a/c;

    aput-object v3, v2, v1

    invoke-static {v2}, Lcom/b/a/e;->setStrictMode([Lcom/b/a/a/g;)V

    .line 46
    new-instance v2, Lcom/facebook/o/b;

    iget-object v3, p0, Lcom/facebook/o/a;->c:Lcom/facebook/common/e/h;

    invoke-direct {v2, v3}, Lcom/facebook/o/b;-><init>(Lcom/facebook/common/e/h;)V

    .line 50
    const/4 v3, 0x1

    :try_start_0
    invoke-static {v3, v2}, Lcom/b/a/e;->enableUniqueViolations(ZLcom/b/a/c;)V

    .line 52
    const/4 v2, 0x1

    sput-boolean v2, Lcom/facebook/o/a;->b:Z
    :try_end_0
    .catch Lcom/b/a/d; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 58
    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    const-class v1, Lcom/facebook/o/a;

    const-string v2, "Failed to start StrictModeAggregator"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method
