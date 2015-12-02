.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->f(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$3;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1$3;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$1;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 182
    return-void
.end method
