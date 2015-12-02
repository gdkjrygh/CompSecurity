.class public Lcom/facebook/push/a/e;
.super Ljava/lang/Object;
.source "PushServerRegistrationClientEvent.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/analytics/cb;
    .locals 2
    .param p2    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/analytics/cb;"
        }
    .end annotation

    .prologue
    .line 35
    const-string v0, "push_reg_server"

    const-string v1, "registration_id"

    invoke-static {v0, p0, p2, v1, p1}, Lcom/facebook/analytics/cm;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method
