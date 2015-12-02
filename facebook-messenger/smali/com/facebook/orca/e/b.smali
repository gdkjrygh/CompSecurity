.class public Lcom/facebook/orca/e/b;
.super Ljava/lang/Object;
.source "MessengerBugReportExtraDataMapProvider.java"

# interfaces
.implements Lcom/facebook/bugreporter/c;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/contacts/data/k;

.field private final c:Lcom/facebook/push/mqtt/v;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/contacts/data/k;Lcom/facebook/push/mqtt/v;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/e/b;->a:Lcom/facebook/prefs/shared/d;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/e/b;->b:Lcom/facebook/contacts/data/k;

    .line 34
    iput-object p3, p0, Lcom/facebook/orca/e/b;->c:Lcom/facebook/push/mqtt/v;

    .line 35
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/e/b;->a:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3}, Lcom/facebook/prefs/shared/d;->b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/common/w/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/common/w/q;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "MqttConnectionManager.lastConnectionTimeStampMs"

    iget-object v2, p0, Lcom/facebook/orca/e/b;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v2}, Lcom/facebook/push/mqtt/v;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "MqttConnectionManager.lastDisconnectionTimeStampMs"

    iget-object v2, p0, Lcom/facebook/orca/e/b;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v2}, Lcom/facebook/push/mqtt/v;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/common/a/ev;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 55
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    invoke-virtual {v1}, Lcom/facebook/contacts/data/j;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/e/b;->b:Lcom/facebook/contacts/data/k;

    sget-object v3, Lcom/facebook/contacts/data/i;->a:Lcom/facebook/contacts/data/j;

    const-string v4, "-1"

    invoke-virtual {v2, v3, v4}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    invoke-virtual {v1}, Lcom/facebook/contacts/data/j;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/e/b;->b:Lcom/facebook/contacts/data/k;

    sget-object v3, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    const-string v4, "-1"

    invoke-virtual {v2, v3, v4}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method
