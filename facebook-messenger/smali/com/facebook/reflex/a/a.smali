.class public abstract Lcom/facebook/reflex/a/a;
.super Ljava/lang/Object;
.source "BasePeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method protected constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/facebook/reflex/a/a;->a:Lcom/facebook/prefs/shared/d;

    .line 14
    return-void
.end method


# virtual methods
.method abstract a()Lcom/facebook/prefs/shared/ae;
.end method

.method public a(J)Z
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 17
    iget-object v0, p0, Lcom/facebook/reflex/a/a;->a:Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0}, Lcom/facebook/reflex/a/a;->a()Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 18
    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    sub-long v0, p1, v0

    invoke-virtual {p0}, Lcom/facebook/reflex/a/a;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract b()J
.end method

.method protected b(J)V
    .locals 2

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/reflex/a/a;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/reflex/a/a;->a()Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 23
    return-void
.end method
