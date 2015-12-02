.class public Lcom/facebook/push/mqtt/abtest/d;
.super Ljava/lang/Object;
.source "MqttPushServiceExperimentNameHolder.java"

# interfaces
.implements Lcom/facebook/abtest/qe/f/b;


# static fields
.field private static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 16
    new-instance v0, Lcom/facebook/abtest/qe/f/a;

    const-string v1, "android_mqtt_push_service_parameters"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/abtest/d;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/push/mqtt/abtest/d;->a:Ljava/util/Set;

    return-object v0
.end method
