.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;
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
    .line 258
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 262
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->o(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->a(Z)Z

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->k(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$5;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->n(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 265
    return-void
.end method
