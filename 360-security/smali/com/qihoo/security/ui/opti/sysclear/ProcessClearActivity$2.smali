.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->q()V
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
    .line 268
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 273
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 274
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Landroid/view/View;)Landroid/view/View;

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, p4}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 277
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 278
    const/16 v0, 0x2b0c

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->showDialog(I)V

    .line 283
    :cond_0
    return v1
.end method
