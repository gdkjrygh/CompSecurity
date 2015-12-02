.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V
    .locals 0

    .prologue
    .line 654
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$5;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 658
    const/16 v0, 0x2b0e

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 660
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$5;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->dismissDialog(I)V

    .line 661
    return-void
.end method
