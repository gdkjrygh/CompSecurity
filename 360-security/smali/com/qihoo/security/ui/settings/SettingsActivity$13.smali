.class Lcom/qihoo/security/ui/settings/SettingsActivity$13;
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
    .line 403
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$13;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 409
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$13;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->j(Lcom/qihoo/security/ui/settings/SettingsActivity;)Z

    move-result v0

    if-ne v0, p2, :cond_0

    .line 414
    :goto_0
    return-void

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$13;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/settings/SettingsActivity;->g(Lcom/qihoo/security/ui/settings/SettingsActivity;Z)Z

    .line 413
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$13;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "user_ex"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0
.end method
