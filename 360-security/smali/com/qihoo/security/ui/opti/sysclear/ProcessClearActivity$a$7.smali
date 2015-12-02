.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup$LayoutParams;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1860
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->a:Landroid/view/ViewGroup$LayoutParams;

    iput-object p3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 2

    .prologue
    .line 1863
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1}, Lcom/nineoldandroids/a/o;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1864
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->b:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$7;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1865
    return-void
.end method
