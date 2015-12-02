.class public Lcom/facebook/analytics/c/a;
.super Lcom/facebook/d/d/a;
.source "AnalyticsDatabaseSupplier.java"


# instance fields
.field private final a:Lcom/facebook/analytics/c/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/analytics/c/d;)V
    .locals 7

    .prologue
    .line 28
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "analytics_db2"

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 36
    iput-object p4, p0, Lcom/facebook/analytics/c/a;->a:Lcom/facebook/analytics/c/d;

    .line 37
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 45
    const v0, 0xc800

    return v0
.end method
