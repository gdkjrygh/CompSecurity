.class public Lcom/localytics/android/ReferralReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ReferralReceiver.java"


# instance fields
.field protected appKey:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 36
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 37
    .local v1, "extras":Landroid/os/Bundle;
    if-eqz v1, :cond_0

    .line 38
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.android.vending.INSTALL_REFERRER"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 68
    .end local v1    # "extras":Landroid/os/Bundle;
    :cond_1
    :goto_0
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    .local v0, "e":Ljava/lang/Exception;
    goto :goto_0

    .line 51
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v1    # "extras":Landroid/os/Bundle;
    :cond_2
    iget-object v3, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_4

    .line 52
    :cond_3
    invoke-static {p1}, Lcom/localytics/android/DatapointHelper;->getLocalyticsAppKeyOrNull(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    .line 56
    :cond_4
    iget-object v3, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 61
    const-string v3, "referrer"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 62
    .local v2, "referrer":Ljava/lang/String;
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    .line 67
    new-instance v3, Lcom/localytics/android/LocalyticsSession;

    iget-object v4, p0, Lcom/localytics/android/ReferralReceiver;->appKey:Ljava/lang/String;

    invoke-direct {v3, p1, v4, v2}, Lcom/localytics/android/LocalyticsSession;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
