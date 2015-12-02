.class Lcom/qihoo/security/ui/main/HomeActivity$8;
.super Lcom/qihoo/security/widget/c;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0}, Lcom/qihoo/security/widget/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 528
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/c;->a(I)V

    .line 529
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    iput p1, v0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    .line 530
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/main/HomeActivity;I)V

    .line 531
    return-void
.end method

.method public a(IFI)V
    .locals 3

    .prologue
    .line 535
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/widget/c;->a(IFI)V

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Lcom/qihoo/security/ui/main/HomeActivity;)Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->getCurrentColor()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/main/HomeActivity;I)V

    .line 537
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$8;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V

    .line 538
    return-void
.end method
