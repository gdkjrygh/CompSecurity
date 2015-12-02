.class Lcom/qihoo/security/crashhandler/UploadActivity$2;
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
    .line 127
    iput-object p1, p0, Lcom/qihoo/security/crashhandler/UploadActivity$2;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$2;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/b;->a(Landroid/content/Context;)Lcom/qihoo/security/crashhandler/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/crashhandler/b;->c()V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/crashhandler/UploadActivity$2;->a:Lcom/qihoo/security/crashhandler/UploadActivity;

    invoke-static {v0}, Lcom/qihoo/security/crashhandler/UploadActivity;->b(Lcom/qihoo/security/crashhandler/UploadActivity;)V

    .line 132
    return-void
.end method
