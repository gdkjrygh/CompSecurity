.class Lcom/qihoo/security/opti/trashclear/ui/h$5$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/a/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h$5;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/h$5;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h$5;)V
    .locals 0

    .prologue
    .line 1554
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1557
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->l(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1558
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->l(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1563
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->m(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 1564
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 1565
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;->a:Lcom/qihoo/security/opti/trashclear/ui/h$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->k(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Z)V

    .line 1566
    return-void
.end method
