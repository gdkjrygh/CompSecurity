.class Lcom/qihoo/security/crashhandler/UploadActivity$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/crashhandler/UploadActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/crashhandler/UploadActivity$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/crashhandler/UploadActivity$1;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$1$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/crashhandler/UploadActivity$1;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->finish()V

    .line 122
    return-void
.end method
