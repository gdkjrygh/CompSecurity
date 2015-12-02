.class Lcom/facebook/analytics/a/c;
.super Ljava/lang/Object;
.source "AnalyticsEventSender.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/analytics/cd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/analytics/a/a;

.field private final b:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/a/a;Landroid/content/ServiceConnection;)V
    .locals 0

    .prologue
    .line 306
    iput-object p1, p0, Lcom/facebook/analytics/a/c;->a:Lcom/facebook/analytics/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput-object p2, p0, Lcom/facebook/analytics/a/c;->b:Landroid/content/ServiceConnection;

    .line 308
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/cd;)V
    .locals 2

    .prologue
    .line 312
    invoke-static {}, Lcom/facebook/analytics/a/a;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "AnalyticsConnectionCallback.onSuccess()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/facebook/analytics/a/c;->a:Lcom/facebook/analytics/a/a;

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/a/a;->a(Lcom/facebook/analytics/cd;)V

    .line 314
    iget-object v0, p0, Lcom/facebook/analytics/a/c;->a:Lcom/facebook/analytics/a/a;

    iget-object v1, p0, Lcom/facebook/analytics/a/c;->b:Landroid/content/ServiceConnection;

    invoke-static {v0, v1}, Lcom/facebook/analytics/a/a;->a(Lcom/facebook/analytics/a/a;Landroid/content/ServiceConnection;)V

    .line 315
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 303
    check-cast p1, Lcom/facebook/analytics/cd;

    invoke-virtual {p0, p1}, Lcom/facebook/analytics/a/c;->a(Lcom/facebook/analytics/cd;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 319
    invoke-static {}, Lcom/facebook/analytics/a/a;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "AnalyticsConnectionCallback.onFailure()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/facebook/analytics/a/c;->a:Lcom/facebook/analytics/a/a;

    iget-object v1, p0, Lcom/facebook/analytics/a/c;->b:Landroid/content/ServiceConnection;

    invoke-static {v0, v1}, Lcom/facebook/analytics/a/a;->a(Lcom/facebook/analytics/a/a;Landroid/content/ServiceConnection;)V

    .line 321
    return-void
.end method
