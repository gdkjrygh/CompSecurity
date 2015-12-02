.class Lcom/qihoo/security/ui/main/HomeActivity$10;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/b/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
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
    .line 589
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->g(Lcom/qihoo/security/ui/main/HomeActivity;)V

    .line 610
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Lcom/qihoo/security/ui/main/HomeActivity;I)V

    .line 612
    return-void
.end method

.method public setColor(I)V
    .locals 3

    .prologue
    .line 593
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V

    .line 594
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Lcom/qihoo/security/ui/main/HomeActivity;I)V

    .line 595
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(Lcom/qihoo/security/ui/main/HomeActivity;)Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 596
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V

    .line 598
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->e(Lcom/qihoo/security/ui/main/HomeActivity;)[I

    move-result-object v0

    .line 599
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/HomeActivity;->f(Lcom/qihoo/security/ui/main/HomeActivity;)Lcom/qihoo/security/widget/QihooViewPager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/widget/QihooViewPager;->getCurrentItem()I

    move-result v1

    .line 600
    if-eqz v0, :cond_1

    array-length v2, v0

    if-lez v2, :cond_1

    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 601
    aput p1, v0, v1

    .line 602
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity$10;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/main/HomeActivity;[I)V

    .line 604
    :cond_1
    return-void
.end method
