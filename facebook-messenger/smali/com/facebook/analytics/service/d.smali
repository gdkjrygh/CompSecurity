.class Lcom/facebook/analytics/service/d;
.super Ljava/lang/Object;
.source "AnalyticsEventUploader.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/service/c;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/service/c;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/facebook/analytics/service/d;->a:Lcom/facebook/analytics/service/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/service/c;Lcom/facebook/analytics/service/b;)V
    .locals 0

    .prologue
    .line 472
    invoke-direct {p0, p1}, Lcom/facebook/analytics/service/d;-><init>(Lcom/facebook/analytics/service/c;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 474
    iget-object v0, p0, Lcom/facebook/analytics/service/d;->a:Lcom/facebook/analytics/service/c;

    iget-object v0, v0, Lcom/facebook/analytics/service/c;->a:Lcom/facebook/analytics/service/a;

    invoke-static {v0}, Lcom/facebook/analytics/service/a;->g(Lcom/facebook/analytics/service/a;)V

    .line 475
    return-void
.end method
