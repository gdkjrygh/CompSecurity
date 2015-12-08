.class Lcom/localytics/android/SessionHandler$12;
.super Ljava/lang/Object;
.source "SessionHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/SessionHandler;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/SessionHandler;

.field final synthetic val$action:I

.field final synthetic val$attributeJSON:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/localytics/android/SessionHandler;Lorg/json/JSONObject;I)V
    .locals 0

    .prologue
    .line 796
    iput-object p1, p0, Lcom/localytics/android/SessionHandler$12;->this$0:Lcom/localytics/android/SessionHandler;

    iput-object p2, p0, Lcom/localytics/android/SessionHandler$12;->val$attributeJSON:Lorg/json/JSONObject;

    iput p3, p0, Lcom/localytics/android/SessionHandler$12;->val$action:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 799
    iget-object v2, p0, Lcom/localytics/android/SessionHandler$12;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v2, v2, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-virtual {v2}, Lcom/localytics/android/LocalyticsProvider;->getUserIdAndType()Ljava/util/Map;

    move-result-object v2

    const-string v3, "id"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 802
    .local v0, "customerID":Ljava/lang/String;
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 803
    .local v1, "values":Landroid/content/ContentValues;
    const-string v2, "attribute"

    iget-object v3, p0, Lcom/localytics/android/SessionHandler$12;->val$attributeJSON:Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    const-string v2, "action"

    iget v3, p0, Lcom/localytics/android/SessionHandler$12;->val$action:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 805
    const-string v2, "customer_id"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    iget-object v2, p0, Lcom/localytics/android/SessionHandler$12;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v2, v2, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    const-string v3, "profile"

    invoke-virtual {v2, v3, v1}, Lcom/localytics/android/LocalyticsProvider;->insert(Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 807
    return-void
.end method
