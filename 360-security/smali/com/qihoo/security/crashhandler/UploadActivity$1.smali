.class Lcom/qihoo/security/crashhandler/UploadActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/crashhandler/UploadActivity;->b()V
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
    .line 111
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/k;

    move-result-object v0

    const v1, 0x7f0c015b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->a(I)V

    .line 116
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/k;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/CharSequence;

    iget-object v2, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    iget-object v2, v2, Lcom/qihoo/security/crashhandler/UploadActivity;->a:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0153

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->setButtonText([Ljava/lang/CharSequence;)V

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/k;

    move-result-object v0

    new-array v1, v5, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/crashhandler/UploadActivity$1$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/crashhandler/UploadActivity$1$1;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity$1;)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 125
    new-instance v0, Lcom/qihoo/security/crashhandler/UploadActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/crashhandler/UploadActivity$a;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;Lcom/qihoo/security/crashhandler/UploadActivity$1;)V

    new-array v1, v4, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/crashhandler/UploadActivity$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 126
    return-void
.end method
