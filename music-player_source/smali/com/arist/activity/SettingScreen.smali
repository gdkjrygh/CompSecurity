.class public Lcom/arist/activity/SettingScreen;
.super Landroid/preference/PreferenceActivity;


# instance fields
.field private a:Landroid/preference/CheckBoxPreference;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method

.method private a(I)V
    .locals 2

    new-instance v0, Lcom/arist/c/f;

    invoke-direct {v0, p0}, Lcom/arist/c/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/arist/c/f;->f()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/service/DeskLrcService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "desk_lrc_action_activity_changed"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "desk_lrc_action_activity_changed_key"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/SettingScreen;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method


# virtual methods
.method public handleBackClicked(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/arist/activity/SettingScreen;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Lcom/arist/activity/MyApplication;->d:Lcom/arist/activity/MyApplication;

    iget-object v0, v0, Lcom/arist/activity/MyApplication;->b:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/arist/activity/SettingScreen;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    const-string v1, "music_preference"

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceManager;->setSharedPreferencesName(Ljava/lang/String;)V

    const v0, 0x7f030007

    invoke-virtual {p0, v0}, Lcom/arist/activity/SettingScreen;->setContentView(I)V

    const/high16 v0, 0x7f050000

    invoke-virtual {p0, v0}, Lcom/arist/activity/SettingScreen;->addPreferencesFromResource(I)V

    const-string v0, "show_desktop_lyrics"

    invoke-virtual {p0, v0}, Lcom/arist/activity/SettingScreen;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    iput-object v0, p0, Lcom/arist/activity/SettingScreen;->a:Landroid/preference/CheckBoxPreference;

    return-void
.end method

.method protected onRestart()V
    .locals 2

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onRestart()V

    iget-object v0, p0, Lcom/arist/activity/SettingScreen;->a:Landroid/preference/CheckBoxPreference;

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1}, Lcom/arist/c/f;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStart()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onStart"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/arist/activity/SettingScreen;->a(I)V

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onStop"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/arist/activity/SettingScreen;->a(I)V

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    return-void
.end method
