.class Lcom/qihoo/security/ui/settings/SettingsActivity$7;
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
    .line 232
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$7;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$7;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->b(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z

    move-result v0

    if-ne v0, p2, :cond_1

    .line 258
    :cond_0
    :goto_0
    return-void

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$7;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/settings/SettingsActivity;->a(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z

    .line 242
    if-eqz p2, :cond_2

    .line 243
    const/16 v0, 0x4a39

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 245
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$7;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->c(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/floatview/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 247
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$7;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->c(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/floatview/a/b;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/qihoo/security/floatview/a/b;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 248
    :catch_0
    move-exception v0

    goto :goto_0
.end method
