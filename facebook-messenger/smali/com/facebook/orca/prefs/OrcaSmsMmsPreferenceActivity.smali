.class public Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;
.super Lcom/facebook/base/activity/p;
.source "OrcaSmsMmsPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/widget/titlebar/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/facebook/base/activity/p;-><init>()V

    return-void
.end method

.method private a(Landroid/preference/PreferenceGroup;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->b(Landroid/preference/PreferenceGroup;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->c(Landroid/preference/PreferenceGroup;)V

    .line 50
    return-void
.end method

.method private b(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 53
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 54
    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 55
    sget v1, Lcom/facebook/o;->preference_sms_show_conversations_title:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 56
    sget v1, Lcom/facebook/o;->preference_sms_show_conversations_summary:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 57
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 58
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 59
    return-void
.end method

.method private c(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 62
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 63
    sget-object v1, Lcom/facebook/orca/prefs/n;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 64
    sget v1, Lcom/facebook/o;->preference_use_as_main_app_title:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 65
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 66
    sget v1, Lcom/facebook/o;->preference_use_as_main_app_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 67
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 68
    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDependency(Ljava/lang/String;)V

    .line 69
    return-void
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 34
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 36
    sget v0, Lcom/facebook/k;->orca_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->setContentView(I)V

    .line 38
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 39
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    .line 40
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->preference_sms_mms_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 44
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;->a(Landroid/preference/PreferenceGroup;)V

    .line 45
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_ROOT_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
