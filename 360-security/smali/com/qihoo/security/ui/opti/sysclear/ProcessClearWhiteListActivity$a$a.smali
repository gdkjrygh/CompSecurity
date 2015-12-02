.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

.field private b:I


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;)V
    .locals 0

    .prologue
    .line 668
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;)V
    .locals 0

    .prologue
    .line 668
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 672
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->b:I

    .line 673
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 677
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->b:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->b:I

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->getCount()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 720
    :cond_0
    :goto_0
    return-void

    .line 681
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 683
    :goto_1
    iget-object v1, v0, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    const-string/jumbo v4, "com.qihoo.security.lite"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 687
    iget-boolean v1, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-nez v1, :cond_3

    move v1, v2

    :goto_2
    iput-boolean v1, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    .line 689
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 700
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 701
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 702
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/opti/a/c;

    move-result-object v1

    iget-object v0, v0, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lcom/qihoo/security/opti/a/c;->a(Ljava/lang/String;Z)V

    .line 703
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 704
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    .line 705
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    .line 706
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)I

    move-result v0

    if-nez v0, :cond_4

    .line 707
    const/16 v0, 0x2b12

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 714
    :goto_3
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c002a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 681
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    goto/16 :goto_1

    :cond_3
    move v1, v3

    .line 687
    goto :goto_2

    .line 709
    :cond_4
    const/16 v0, 0x2c33

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    goto :goto_3

    .line 718
    :cond_5
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    check-cast p1, Landroid/widget/ImageView;

    invoke-static {v1, v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Lcom/qihoo/security/opti/a/c$a;Landroid/widget/ImageView;)V

    goto/16 :goto_0
.end method
