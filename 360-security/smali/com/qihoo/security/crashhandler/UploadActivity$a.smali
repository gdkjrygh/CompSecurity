.class Lcom/qihoo/security/crashhandler/UploadActivity$a;
.super Landroid/os/AsyncTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/crashhandler/UploadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/crashhandler/UploadActivity;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/crashhandler/UploadActivity;Lcom/qihoo/security/crashhandler/UploadActivity$1;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lcom/qihoo/security/crashhandler/UploadActivity$a;-><init>(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/b;->a(Landroid/content/Context;)Lcom/qihoo/security/crashhandler/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/crashhandler/b;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Lcom/qihoo/security/crashhandler/UploadActivity;)Lcom/qihoo/security/dialog/k;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 95
    iget-object v1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->a(Lcom/qihoo/security/crashhandler/UploadActivity;Z)V

    .line 96
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 80
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 80
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/crashhandler/UploadActivity$a;->a(Ljava/lang/Integer;)V

    return-void
.end method
