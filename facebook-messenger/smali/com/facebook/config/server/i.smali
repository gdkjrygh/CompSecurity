.class public Lcom/facebook/config/server/i;
.super Lcom/facebook/config/server/h;
.source "PresenceAwarePlatformHttpConfig.java"


# instance fields
.field private final a:Lcom/facebook/common/v/a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/http/c/i;Lcom/facebook/common/v/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/config/server/h;-><init>(Lcom/facebook/http/c/i;)V

    .line 24
    iput-object p2, p0, Lcom/facebook/config/server/i;->a:Lcom/facebook/common/v/a;

    .line 25
    iput-object p3, p0, Lcom/facebook/config/server/i;->b:Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/config/server/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " FBBK/1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/config/server/i;->c:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/config/server/i;->a:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/facebook/config/server/i;->c:Ljava/lang/String;

    .line 34
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/config/server/i;->b:Ljava/lang/String;

    goto :goto_0
.end method
