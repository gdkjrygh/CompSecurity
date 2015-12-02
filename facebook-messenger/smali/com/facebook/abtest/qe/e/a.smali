.class public Lcom/facebook/abtest/qe/e/a;
.super Ljava/lang/Object;
.source "QuickExperimentLogger.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<",
            "Lcom/facebook/abtest/qe/e/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/analytics/av;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/abtest/qe/e/a;

    sput-object v0, Lcom/facebook/abtest/qe/e/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/facebook/abtest/qe/e/a;->b:Lcom/facebook/analytics/av;

    .line 48
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/a/b;)V
    .locals 5

    .prologue
    .line 80
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    :goto_0
    return-void

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/e/a;->b:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/abtest/qe/a/a;

    invoke-direct {v1, p1, p4, p2, p3}, Lcom/facebook/abtest/qe/a/a;-><init>(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/a/b;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 88
    sget-object v0, Lcom/facebook/abtest/qe/e/a;->a:Ljava/lang/Class;

    const-string v1, "Event(%s) Experiment(%s) Group(%s)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/e/b;)V
    .locals 3

    .prologue
    .line 67
    # getter for: Lcom/facebook/abtest/qe/e/b;->eventContext:Ljava/lang/String;
    invoke-static {p2}, Lcom/facebook/abtest/qe/e/b;->access$000(Lcom/facebook/abtest/qe/e/b;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/abtest/qe/a/b;->UNDEPLOYMENT:Lcom/facebook/abtest/qe/a/b;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/a/b;)V

    .line 73
    return-void
.end method

.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lcom/facebook/abtest/qe/a/b;->EXPOSURE:Lcom/facebook/abtest/qe/a/b;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/abtest/qe/e/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/abtest/qe/a/b;)V

    .line 56
    return-void
.end method
