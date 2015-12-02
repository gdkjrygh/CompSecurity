.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 239
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 240
    if-nez p3, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 251
    :goto_0
    return v0

    .line 243
    :cond_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Landroid/view/View;)Landroid/view/View;

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 246
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/high16 v2, -0x80000000

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 247
    const/16 v0, 0x2c2d

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->showDialog(I)V

    :cond_1
    move v0, v1

    .line 251
    goto :goto_0
.end method
