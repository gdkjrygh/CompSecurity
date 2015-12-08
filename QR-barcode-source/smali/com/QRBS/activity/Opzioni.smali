.class public Lcom/QRBS/activity/Opzioni;
.super Lcom/actionbarsherlock/app/SherlockPreferenceActivity;
.source "Opzioni.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field private prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    invoke-virtual {p0}, Lcom/QRBS/activity/Opzioni;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 28
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v1, 0x7f0200d4

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 29
    const v1, 0x7f0800b1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 30
    const v1, 0x7f0800d7

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 31
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 32
    const/high16 v1, 0x7f050000

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/Opzioni;->addPreferencesFromResource(I)V

    .line 34
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/QRBS/activity/Opzioni;->prefs:Landroid/content/SharedPreferences;

    .line 35
    iget-object v1, p0, Lcom/QRBS/activity/Opzioni;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 36
    invoke-virtual {p0}, Lcom/QRBS/activity/Opzioni;->getListView()Landroid/widget/ListView;

    move-result-object v1

    const v2, 0x7f0200e7

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setSelector(I)V

    .line 40
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 44
    invoke-virtual {p0}, Lcom/QRBS/activity/Opzioni;->finish()V

    .line 45
    const/4 v0, 0x1

    return v0
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 5
    .param p1, "sharedPreferences"    # Landroid/content/SharedPreferences;
    .param p2, "key"    # Ljava/lang/String;

    .prologue
    .line 53
    const-string v2, "preference_custom_url"

    invoke-virtual {p2, v2}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 54
    iget-object v2, p0, Lcom/QRBS/activity/Opzioni;->prefs:Landroid/content/SharedPreferences;

    const-string v3, ""

    invoke-interface {v2, p2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    .local v0, "custom":Ljava/lang/String;
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "%s"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 66
    .end local v0    # "custom":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 58
    .restart local v0    # "custom":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Lcom/QRBS/activity/Opzioni;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f08015b

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/Opzioni;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 59
    iget-object v2, p0, Lcom/QRBS/activity/Opzioni;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 60
    .local v1, "prefEditor":Landroid/content/SharedPreferences$Editor;
    const-string v2, ""

    invoke-interface {v1, p2, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 61
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 62
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "VALUE IS -> "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/QRBS/activity/Opzioni;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/scannerfire/utils/Utils;->getCustomUrlPref(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
