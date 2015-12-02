.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup$LayoutParams;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1661
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->a:Landroid/view/ViewGroup$LayoutParams;

    iput-object p3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 2

    .prologue
    .line 1664
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1665
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1666
    return-void
.end method
