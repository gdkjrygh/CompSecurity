.class public Lcom/facebook/push/mqtt/a;
.super Ljava/lang/Object;
.source "AlwaysPersistentGkMqttPersistenceRequirement.java"

# interfaces
.implements Lcom/facebook/push/mqtt/as;


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "android_persistent_mqtt_service"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/push/mqtt/a;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/push/mqtt/a;->b:Lcom/facebook/prefs/shared/d;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ar;
    .locals 3

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/push/mqtt/a;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/mqtt/a;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 32
    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/push/mqtt/ar;->ALWAYS:Lcom/facebook/push/mqtt/ar;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/push/mqtt/ar;->APP_USE:Lcom/facebook/push/mqtt/ar;

    goto :goto_0
.end method
