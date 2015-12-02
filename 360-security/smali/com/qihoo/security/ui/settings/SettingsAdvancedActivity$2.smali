.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 202
    if-eqz p2, :cond_0

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->l(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    .line 209
    :goto_0
    return-void

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "key_virus_scan_strict_mode"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->j(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$2;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->k(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    goto :goto_0
.end method
