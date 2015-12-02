.class public Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;
.super Lcom/facebook/base/activity/p;
.source "OrcaTesterPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/widget/titlebar/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/base/activity/p;-><init>()V

    return-void
.end method

.method private a(Landroid/preference/PreferenceGroup;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->b(Landroid/preference/PreferenceGroup;)V

    .line 51
    return-void
.end method

.method private b(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 54
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 55
    sget-object v1, Lcom/facebook/prefs/shared/aj;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 56
    sget v1, Lcom/facebook/o;->debug_log_level:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 57
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 58
    sget v1, Lcom/facebook/c;->logger_levels:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 59
    sget v1, Lcom/facebook/c;->logger_levels_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 60
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 61
    return-void
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 38
    sget v0, Lcom/facebook/k;->orca_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->setContentView(I)V

    .line 40
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 41
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    .line 42
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    const-string v1, "Tester"

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v0

    .line 45
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 46
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;->a(Landroid/preference/PreferenceGroup;)V

    .line 47
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_TESTER_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
