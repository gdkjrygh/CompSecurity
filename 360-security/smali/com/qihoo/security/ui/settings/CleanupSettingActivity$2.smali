.class Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 224
    if-eqz p2, :cond_0

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->a(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->b(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 231
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 232
    return-void

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->a(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->b(Lcom/qihoo/security/ui/settings/CleanupSettingActivity;)Lcom/qihoo/security/widget/CheckBoxPreference;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CheckBoxPreference;->setEnabled(Z)V

    goto :goto_0
.end method
