.class Lcom/qihoo/security/ui/settings/CleanupSettingActivity$1;
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
    .line 214
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$1;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/CleanupSettingActivity$1;->a:Lcom/qihoo/security/ui/settings/CleanupSettingActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/CleanupSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_notification_swtich"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 218
    return-void
.end method
