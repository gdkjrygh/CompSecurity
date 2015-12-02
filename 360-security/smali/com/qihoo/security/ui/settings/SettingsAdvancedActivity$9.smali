.class Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->s()V
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
    .line 354
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$9;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity$9;->a:Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;->d(Lcom/qihoo/security/ui/settings/SettingsAdvancedActivity;)Lcom/qihoo/security/dialog/b;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 359
    return-void
.end method
