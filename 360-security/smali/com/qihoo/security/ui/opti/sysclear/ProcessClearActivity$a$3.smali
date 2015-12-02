.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V
    .locals 0

    .prologue
    .line 1703
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1706
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b()Z

    move-result v0

    .line 1708
    if-eqz v0, :cond_0

    .line 1709
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;)V

    .line 1718
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ExpandableListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1724
    :goto_0
    return-void

    .line 1722
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    goto :goto_0
.end method
