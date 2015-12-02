.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


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
    .line 254
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 258
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 259
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Landroid/view/View;)Landroid/view/View;

    .line 261
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, p4}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 262
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 263
    const/16 v0, 0x2c2d

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->showDialog(I)V

    .line 267
    :cond_0
    return v1
.end method
