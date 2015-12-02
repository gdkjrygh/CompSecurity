.class Lcom/qihoo/security/crashhandler/UploadActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/crashhandler/UploadActivity;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/crashhandler/UploadActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$3;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 155
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$3;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->c(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/i;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 157
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$3;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    const-class v2, Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 158
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 159
    iget-object v1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$3;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->startActivity(Landroid/content/Intent;)V

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$3;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->b(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    .line 162
    return-void
.end method
