.class Lcom/localytics/android/SessionHandler$14;
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

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/localytics/android/SessionHandler;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 855
    iput-object p1, p0, Lcom/localytics/android/SessionHandler$14;->this$0:Lcom/localytics/android/SessionHandler;

    iput-object p2, p0, Lcom/localytics/android/SessionHandler$14;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 859
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->val$intent:Landroid/content/Intent;

    const-string v2, "registration_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 861
    .local v0, "registrationId":Ljava/lang/String;
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->this$0:Lcom/localytics/android/SessionHandler;

    # invokes: Lcom/localytics/android/SessionHandler;->isPushDisabled()Z
    invoke-static {v1}, Lcom/localytics/android/SessionHandler;->access$000(Lcom/localytics/android/SessionHandler;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 863
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_0

    .line 865
    const-string v1, "Localytics"

    const-string v2, "GCM registered but push disabled: removing id"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 868
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->this$0:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v1, v3}, Lcom/localytics/android/SessionHandler;->setPushRegistrationId(Ljava/lang/String;)V

    .line 898
    :cond_1
    :goto_0
    return-void

    .line 871
    :cond_2
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->val$intent:Landroid/content/Intent;

    const-string v2, "error"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 873
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_1

    .line 875
    const-string v1, "Localytics"

    const-string v2, "GCM registration failed"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 879
    :cond_3
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->val$intent:Landroid/content/Intent;

    const-string v2, "unregistered"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 881
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_4

    .line 883
    const-string v1, "Localytics"

    const-string v2, "GCM unregistered: removing id"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 886
    :cond_4
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->this$0:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v1, v3}, Lcom/localytics/android/SessionHandler;->setPushRegistrationId(Ljava/lang/String;)V

    goto :goto_0

    .line 889
    :cond_5
    if-eqz v0, :cond_1

    .line 891
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_6

    .line 893
    const-string v1, "Localytics"

    const-string v2, "GCM registered, new id: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 896
    :cond_6
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$14;->this$0:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v1, v0}, Lcom/localytics/android/SessionHandler;->setPushRegistrationId(Ljava/lang/String;)V

    goto :goto_0
.end method
