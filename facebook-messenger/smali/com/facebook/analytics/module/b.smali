.class public Lcom/facebook/analytics/module/b;
.super Ljava/lang/Object;
.source "AnalyticsInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;
.implements Lcom/facebook/device_id/a;


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/device_id/l;

.field private final c:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Lcom/facebook/common/e/h;Lcom/facebook/device_id/l;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-class v0, Lcom/facebook/analytics/module/b;

    iput-object v0, p0, Lcom/facebook/analytics/module/b;->a:Ljava/lang/Class;

    .line 27
    iput-object p2, p0, Lcom/facebook/analytics/module/b;->b:Lcom/facebook/device_id/l;

    .line 28
    iput-object p1, p0, Lcom/facebook/analytics/module/b;->c:Lcom/facebook/common/e/h;

    .line 29
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 45
    if-eqz p1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/facebook/analytics/module/b;->c:Lcom/facebook/common/e/h;

    const-string v1, "marauder_device_id"

    invoke-interface {v0, v1, p1}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/facebook/analytics/module/b;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ErrorReporter DEVICE_ID_KEY set to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 49
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/analytics/module/b;->b:Lcom/facebook/device_id/l;

    invoke-virtual {v0}, Lcom/facebook/device_id/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/analytics/module/b;->a(Ljava/lang/String;)V

    .line 34
    return-void
.end method

.method public a(Lcom/facebook/device_id/i;Lcom/facebook/device_id/i;)V
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p2}, Lcom/facebook/device_id/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/analytics/module/b;->a(Ljava/lang/String;)V

    .line 40
    return-void
.end method
