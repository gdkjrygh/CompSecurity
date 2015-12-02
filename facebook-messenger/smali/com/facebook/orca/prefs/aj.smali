.class Lcom/facebook/orca/prefs/aj;
.super Ljava/lang/Object;
.source "OrcaNotificationPreferenceActivity.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/facebook/orca/prefs/aj;->a:Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 4

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/orca/prefs/aj;->a:Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;->a(Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "pref_change"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "value"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 141
    const/4 v0, 0x1

    return v0
.end method
