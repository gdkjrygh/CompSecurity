.class Lcom/qihoo/security/ui/settings/SettingsActivity$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V
    .locals 0

    .prologue
    .line 360
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$11;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .prologue
    .line 366
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$11;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->h(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z

    move-result v0

    if-ne v0, p2, :cond_1

    .line 379
    :cond_0
    :goto_0
    return-void

    .line 369
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$11;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/settings/SettingsActivity;->e(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z

    .line 370
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$11;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 371
    const/16 v0, 0x4a41

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 372
    if-eqz p2, :cond_2

    .line 373
    const/16 v0, 0x36c3

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 376
    :cond_2
    const-string/jumbo v0, "malware_find_issue_time"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$11;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "malware_find_issue_time"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    goto :goto_0
.end method
