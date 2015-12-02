.class Lcom/qihoo/security/ui/settings/SettingsActivity$8;
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
    .line 270
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 276
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->d(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z

    move-result v0

    if-ne v0, p2, :cond_1

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 279
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/settings/SettingsActivity;->b(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z

    .line 280
    if-nez p2, :cond_2

    .line 281
    const/16 v0, 0x4a3a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 283
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "notification"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->e(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/service/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 286
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$8;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->e(Lcom/qihoo/security/ui/settings/SettingsActivity;)Lcom/qihoo/security/service/a;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/qihoo/security/service/a;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 287
    :catch_0
    move-exception v0

    goto :goto_0
.end method
