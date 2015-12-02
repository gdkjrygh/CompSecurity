.class Lcom/qihoo/security/ui/antivirus/list/a$2;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/a;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic d:Lcom/qihoo/security/ui/antivirus/list/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;ILcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->d:Lcom/qihoo/security/ui/antivirus/list/a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->a:Landroid/view/View;

    iput p3, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->b:I

    iput-object p4, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->d(Landroid/view/View;F)V

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 90
    iget v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->b:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 91
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->d:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/ui/antivirus/list/a;)Lcom/qihoo/security/ui/antivirus/list/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->d:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/ui/antivirus/list/a;)Lcom/qihoo/security/ui/antivirus/list/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$2;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/a$a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 96
    :cond_0
    return-void
.end method
