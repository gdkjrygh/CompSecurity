.class public Lcom/facebook/orca/prefs/p;
.super Lcom/facebook/widget/c/c;
.source "MobileOnlineAvailabilityPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/c;-><init>(Landroid/content/Context;)V

    .line 21
    sget-object v0, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/p;->setKey(Ljava/lang/String;)V

    .line 22
    sget v0, Lcom/facebook/o;->preference_mobile_chat_availability_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/p;->setTitle(I)V

    .line 23
    sget v0, Lcom/facebook/o;->preference_mobile_chat_availability_off_summary:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/p;->setSummaryOff(I)V

    .line 24
    sget v0, Lcom/facebook/o;->preference_mobile_chat_availability_on_summary:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/p;->setSummaryOn(I)V

    .line 25
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/p;->setDefaultValue(Ljava/lang/Object;)V

    .line 26
    return-void
.end method
