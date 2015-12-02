.class Lcom/qihoo/security/lite/LicenseActivity$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/lite/LicenseActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/lite/LicenseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/lite/LicenseActivity;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/qihoo/security/lite/LicenseActivity$4;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 144
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "license"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 145
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "user_ex"

    iget-object v2, p0, Lcom/qihoo/security/lite/LicenseActivity$4;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v2}, Lcom/qihoo/security/lite/LicenseActivity;->g(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 148
    iget-object v0, p0, Lcom/qihoo/security/lite/LicenseActivity$4;->a:Lcom/qihoo/security/lite/LicenseActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/LicenseActivity;->h(Lcom/qihoo/security/lite/LicenseActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    .line 149
    return-void
.end method
