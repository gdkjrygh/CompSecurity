.class public Lcom/facebook/push/mqtt/au;
.super Ljava/lang/Object;
.source "MqttPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 11
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "mqtt/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/mqtt/au;->a:Lcom/facebook/prefs/shared/ae;

    .line 12
    sget-object v0, Lcom/facebook/push/mqtt/au;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "retry_interval"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/mqtt/au;->b:Lcom/facebook/prefs/shared/ae;

    .line 13
    sget-object v0, Lcom/facebook/push/mqtt/au;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "keepalive_delay_adjustment"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/push/mqtt/au;->c:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
