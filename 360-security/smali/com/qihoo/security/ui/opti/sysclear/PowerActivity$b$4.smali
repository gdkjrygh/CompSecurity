.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

.field final synthetic d:Z

.field final synthetic e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
    .locals 0

    .prologue
    .line 1601
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->a:Landroid/view/View;

    iput p3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->b:I

    iput-object p4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iput-boolean p5, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->d:Z

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 5

    .prologue
    .line 1604
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1605
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->a:Landroid/view/View;

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->b:I

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->d:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V

    .line 1610
    :goto_0
    return-void

    .line 1608
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    goto :goto_0
.end method
