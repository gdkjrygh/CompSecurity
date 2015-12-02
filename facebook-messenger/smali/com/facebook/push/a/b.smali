.class public final Lcom/facebook/push/a/b;
.super Ljava/lang/Object;
.source "PushC2DMRegistrationInitialStatusClientEvent.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method public static a(Lcom/facebook/push/c2dm/q;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 4

    .prologue
    .line 46
    const-string v0, "push_reg_gcm_initial_status"

    invoke-static {p0}, Lcom/facebook/push/a/b;->a(Lcom/facebook/push/c2dm/q;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "registration_id"

    invoke-static {v0, v1, v2, v3, p1}, Lcom/facebook/analytics/cm;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/facebook/push/c2dm/q;)Ljava/lang/String;
    .locals 2
    .param p0    # Lcom/facebook/push/c2dm/q;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 25
    if-nez p0, :cond_0

    .line 26
    const-string v0, "not_applicable"

    .line 39
    :goto_0
    return-object v0

    .line 29
    :cond_0
    sget-object v0, Lcom/facebook/push/a/c;->a:[I

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/q;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 39
    const-string v0, "unknown"

    goto :goto_0

    .line 31
    :pswitch_0
    const-string v0, "current"

    goto :goto_0

    .line 33
    :pswitch_1
    const-string v0, "expired"

    goto :goto_0

    .line 35
    :pswitch_2
    const-string v0, "wrong_type"

    goto :goto_0

    .line 37
    :pswitch_3
    const-string v0, "none"

    goto :goto_0

    .line 29
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
