.class Lcom/qihoo/security/ui/antivirus/list/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/a;->b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup$LayoutParams;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/qihoo/security/ui/antivirus/list/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->c:Lcom/qihoo/security/ui/antivirus/list/a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->a:Landroid/view/ViewGroup$LayoutParams;

    iput-object p3, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 2

    .prologue
    .line 103
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$3;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    return-void
.end method
