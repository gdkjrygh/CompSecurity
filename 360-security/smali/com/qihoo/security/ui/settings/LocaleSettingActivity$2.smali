.class Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/LocaleSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {p2}, Lcom/qihoo/security/service/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/service/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;

    .line 110
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;

    .line 115
    return-void
.end method
