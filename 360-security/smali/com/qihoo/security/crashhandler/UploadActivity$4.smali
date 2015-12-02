.class Lcom/qihoo/security/crashhandler/UploadActivity$4;
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
    .line 163
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$4;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$4;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->c(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/i;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$4;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->b(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    .line 169
    return-void
.end method
