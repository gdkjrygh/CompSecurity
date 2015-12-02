.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p()V
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
    .line 249
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "key_virus_scan_strict_mode"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->j(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)V

    .line 255
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->k(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->n(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 257
    return-void
.end method
