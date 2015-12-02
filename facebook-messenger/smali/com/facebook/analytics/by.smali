.class Lcom/facebook/analytics/by;
.super Ljava/lang/Object;
.source "DefaultAnalyticsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/bt;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/bt;)V
    .locals 0

    .prologue
    .line 897
    iput-object p1, p0, Lcom/facebook/analytics/by;->a:Lcom/facebook/analytics/bt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/bu;)V
    .locals 0

    .prologue
    .line 897
    invoke-direct {p0, p1}, Lcom/facebook/analytics/by;-><init>(Lcom/facebook/analytics/bt;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 901
    iget-object v0, p0, Lcom/facebook/analytics/by;->a:Lcom/facebook/analytics/bt;

    iget-object v1, p0, Lcom/facebook/analytics/by;->a:Lcom/facebook/analytics/bt;

    invoke-static {v1}, Lcom/facebook/analytics/bt;->c(Lcom/facebook/analytics/bt;)Lcom/facebook/analytics/ak;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/analytics/ak;->a()Lcom/facebook/analytics/al;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/analytics/bt;->a(Lcom/facebook/analytics/bt;Lcom/facebook/analytics/al;)Lcom/facebook/analytics/al;

    .line 902
    return-void
.end method
