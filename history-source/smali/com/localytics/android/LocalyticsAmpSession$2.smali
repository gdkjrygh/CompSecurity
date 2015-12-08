.class Lcom/localytics/android/LocalyticsAmpSession$2;
.super Ljava/lang/Object;
.source "LocalyticsAmpSession.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/LocalyticsAmpSession;->ampTrigger(Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/LocalyticsAmpSession;

.field final synthetic val$attributes:Ljava/util/Map;

.field final synthetic val$eventString:Ljava/lang/String;

.field final synthetic val$handler:Lcom/localytics/android/AmpSessionHandler;

.field final synthetic val$remappedAttributes:Ljava/util/TreeMap;


# direct methods
.method constructor <init>(Lcom/localytics/android/LocalyticsAmpSession;Lcom/localytics/android/AmpSessionHandler;Ljava/lang/String;Ljava/util/Map;Ljava/util/TreeMap;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->this$0:Lcom/localytics/android/LocalyticsAmpSession;

    iput-object p2, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$handler:Lcom/localytics/android/AmpSessionHandler;

    iput-object p3, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$eventString:Ljava/lang/String;

    iput-object p4, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$attributes:Ljava/util/Map;

    iput-object p5, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$remappedAttributes:Ljava/util/TreeMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 149
    iget-object v1, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$handler:Lcom/localytics/android/AmpSessionHandler;

    iget-object v2, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$handler:Lcom/localytics/android/AmpSessionHandler;

    const/16 v3, 0xd

    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v5, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$eventString:Ljava/lang/String;

    aput-object v5, v4, v0

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$attributes:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 150
    return-void

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$2;->val$remappedAttributes:Ljava/util/TreeMap;

    goto :goto_0
.end method
