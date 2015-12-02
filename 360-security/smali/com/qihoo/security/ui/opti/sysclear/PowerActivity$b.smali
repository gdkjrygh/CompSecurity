.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;
.super Landroid/widget/BaseExpandableListAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;,
        Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1232
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 1225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    .line 1226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    .line 1233
    invoke-direct {p0, p2, p3, p4}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1234
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1224
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
    .locals 0

    .prologue
    .line 1224
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 1238
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d:I

    .line 1239
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e:I

    .line 1240
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->f:I

    .line 1241
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1242
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1243
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1245
    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1246
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1249
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1250
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1253
    :cond_2
    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1255
    invoke-static {p3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1256
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1258
    :cond_3
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I
    .locals 2

    .prologue
    .line 1224
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->f:I

    return v0
.end method

.method private b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
    .locals 8

    .prologue
    const/4 v3, 0x1

    .line 1616
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 1617
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1619
    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v0, v1, v2

    aput v3, v1, v3

    invoke-static {v1}, Lcom/nineoldandroids/a/o;->b([I)Lcom/nineoldandroids/a/o;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    move-result-object v7

    .line 1621
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;

    move-object v1, p0

    move-object v2, p1

    move v3, p4

    move-object v4, p3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ZLcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;I)V

    invoke-virtual {v7, v0}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1661
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;

    invoke-direct {v0, p0, v6, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$6;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/ViewGroup$LayoutParams;Landroid/view/View;)V

    invoke-virtual {v7, v0}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 1669
    invoke-virtual {v7}, Lcom/nineoldandroids/a/o;->a()V

    .line 1670
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I
    .locals 2

    .prologue
    .line 1224
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I
    .locals 2

    .prologue
    .line 1224
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1224
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V
    .locals 0

    .prologue
    .line 1224
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->l()V

    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    .line 1676
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1677
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1679
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)V

    .line 1684
    :cond_0
    :goto_0
    return-void

    .line 1681
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)V

    goto :goto_0
.end method

.method private m()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1705
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1706
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1707
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1708
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1710
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1711
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1715
    :cond_1
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;
    .locals 1

    .prologue
    .line 1287
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    goto :goto_0
.end method

.method public a(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1292
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    if-nez v1, :cond_1

    .line 1298
    :cond_0
    :goto_0
    return-object v0

    .line 1295
    :cond_1
    if-nez p1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    .line 1296
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1264
    invoke-direct {p0, v0, v0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1265
    return-void
.end method

.method public a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V
    .locals 1

    .prologue
    .line 1584
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V

    .line 1586
    return-void
.end method

.method public a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
    .locals 7

    .prologue
    .line 1595
    if-nez p1, :cond_0

    .line 1612
    :goto_0
    return-void

    .line 1599
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1600
    invoke-static {p1}, Lcom/nineoldandroids/b/b;->a(Landroid/view/View;)Lcom/nineoldandroids/b/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->a(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/b/b;->c(F)Lcom/nineoldandroids/b/b;

    move-result-object v0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/b/b;->a(J)Lcom/nineoldandroids/b/b;

    move-result-object v6

    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V

    invoke-virtual {v6, v0}, Lcom/nineoldandroids/b/b;->a(Lcom/nineoldandroids/a/a$a;)Lcom/nineoldandroids/b/b;

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V
    .locals 3

    .prologue
    .line 1937
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    .line 1938
    if-eqz p1, :cond_0

    if-eq v0, p1, :cond_0

    .line 1939
    iget v1, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    iget v2, p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    sub-int/2addr v1, v2

    .line 1940
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a(I)V

    .line 1941
    if-nez v1, :cond_0

    .line 1942
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->notifyDataSetChanged()V

    .line 1946
    :cond_0
    return-void
.end method

.method public b(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;
    .locals 2

    .prologue
    .line 1901
    const/4 v0, 0x0

    .line 1902
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1916
    :goto_0
    return-object v0

    .line 1905
    :cond_0
    if-nez p1, :cond_2

    .line 1906
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1907
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    goto :goto_0

    .line 1909
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    goto :goto_0

    .line 1913
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 1536
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-gt v0, v1, :cond_1

    .line 1537
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;II)V

    .line 1580
    :cond_0
    :goto_0
    return-void

    .line 1539
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1540
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V

    .line 1577
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ExpandableListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0
.end method

.method public b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V
    .locals 1

    .prologue
    .line 1590
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V

    .line 1591
    return-void
.end method

.method public b(I)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1926
    .line 1927
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1928
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v3

    .line 1929
    iget-object v0, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string/jumbo v4, "rom_sys_info"

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    move v2, v1

    .line 1933
    :cond_0
    return v2

    :cond_1
    move v0, v2

    .line 1929
    goto :goto_0
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 1692
    const/4 v0, 0x1

    .line 1693
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1694
    const/4 v0, 0x0

    .line 1696
    :cond_0
    return v0
.end method

.method public d()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1722
    .line 1723
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v0

    .line 1724
    if-eqz v0, :cond_3

    .line 1725
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 1726
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1728
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v4, :cond_0

    .line 1729
    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-nez v0, :cond_0

    move v0, v1

    .line 1742
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 1734
    goto :goto_0

    :cond_2
    move v0, v2

    .line 1737
    goto :goto_0

    .line 1739
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->t(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->t(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v2

    .line 1740
    goto :goto_0

    :cond_4
    move v0, v1

    .line 1742
    goto :goto_0
.end method

.method public e()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1749
    .line 1750
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v0

    .line 1751
    if-eqz v0, :cond_3

    .line 1752
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 1753
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1755
    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v0, :cond_0

    move v0, v1

    .line 1765
    :goto_0
    return v0

    :cond_1
    move v0, v2

    .line 1759
    goto :goto_0

    :cond_2
    move v0, v2

    .line 1762
    goto :goto_0

    :cond_3
    move v0, v1

    .line 1765
    goto :goto_0
.end method

.method public f()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1775
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1776
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v0

    .line 1777
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1778
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1779
    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v3, :cond_0

    .line 1780
    new-instance v3, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v3}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 1781
    iget-object v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    iput-object v4, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 1782
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    iput v0, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 1783
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1787
    :cond_1
    return-object v1
.end method

.method public g()I
    .locals 3

    .prologue
    .line 1808
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v1

    .line 1809
    const/4 v0, 0x0

    .line 1810
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1811
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1812
    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v0, :cond_2

    .line 1813
    add-int/lit8 v0, v1, 0x1

    :goto_1
    move v1, v0

    .line 1815
    goto :goto_0

    :cond_0
    move v0, v1

    .line 1817
    :cond_1
    return v0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public synthetic getChild(II)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1224
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .prologue
    .line 1309
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1445
    if-nez p4, :cond_0

    .line 1446
    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V

    .line 1447
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030086

    invoke-virtual {v0, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 1448
    const v0, 0x7f0b0075

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1449
    const v0, 0x7f0b01bd

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1450
    const v0, 0x7f0b01b2

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1451
    const v0, 0x7f0b01af

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->e:Landroid/widget/CheckBox;

    .line 1452
    const v0, 0x7f0b0074

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->a:Landroid/widget/ImageView;

    .line 1454
    invoke-virtual {p4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1459
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1461
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->b:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1462
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_1

    .line 1463
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001e

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1468
    :goto_1
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1469
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->p(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/b/g;

    move-result-object v2

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v6}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1470
    if-eqz v2, :cond_2

    .line 1471
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1476
    :goto_2
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_3

    .line 1477
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->e:Landroid/widget/CheckBox;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1482
    :goto_3
    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->e:Landroid/widget/CheckBox;

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1515
    return-object p4

    .line 1456
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;

    move-object v1, v0

    goto :goto_0

    .line 1465
    :cond_1
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001f

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1473
    :cond_2
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->q(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f020043

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 1479
    :cond_3
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$a;->e:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_3
.end method

.method public getChildrenCount(I)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1277
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    if-lez p1, :cond_1

    .line 1282
    :cond_0
    :goto_0
    return v0

    .line 1279
    :cond_1
    if-nez p1, :cond_0

    .line 1280
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic getGroup(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1224
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(I)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .prologue
    .line 1269
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1270
    const/4 v0, 0x0

    .line 1272
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getGroupId(I)J
    .locals 2

    .prologue
    .line 1304
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const v6, 0x7f020055

    const v5, 0x7f020054

    .line 1326
    if-nez p3, :cond_0

    .line 1327
    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V

    .line 1328
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030082

    invoke-virtual {v0, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 1329
    const v0, 0x7f0b0075

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1330
    const v0, 0x7f0b01ae

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->c:Landroid/widget/ProgressBar;

    .line 1331
    const v0, 0x7f0b01b0

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1332
    const v0, 0x7f0b01b1

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 1333
    const v0, 0x7f0b01af

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    .line 1334
    const v0, 0x7f0b0074

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->a:Landroid/widget/ImageView;

    .line 1335
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1340
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1341
    iget v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    int-to-float v2, v2

    .line 1342
    float-to-int v2, v2

    .line 1344
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->b:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1345
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->c:Landroid/widget/ProgressBar;

    const/16 v4, 0x64

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 1346
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->c:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1347
    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    .line 1348
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v4, "%"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1353
    :goto_1
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_2

    .line 1354
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001e

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1359
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->p(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/b/g;

    move-result-object v2

    iget-object v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v7}, Lcom/qihoo360/mobilesafe/b/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1360
    if-eqz v2, :cond_3

    .line 1361
    iget-object v3, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->a:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1372
    :goto_3
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_5

    .line 1373
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v2, :cond_4

    .line 1374
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    invoke-virtual {v2, v6}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1375
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1390
    :goto_4
    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1437
    return-object p3

    .line 1337
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;

    move-object v1, v0

    goto/16 :goto_0

    .line 1350
    :cond_1
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v3, "<1%"

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1357
    :cond_2
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c001f

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 1363
    :cond_3
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->q(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f020043

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 1377
    :cond_4
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    invoke-virtual {v2, v5}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1378
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_4

    .line 1381
    :cond_5
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v2, :cond_6

    .line 1382
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    invoke-virtual {v2, v6}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1383
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_4

    .line 1385
    :cond_6
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    invoke-virtual {v2, v5}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 1386
    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$b;->f:Landroid/widget/CheckBox;

    iget-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_4
.end method

.method public h()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 1827
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1828
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v4

    .line 1829
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1830
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1832
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    :goto_0
    const-string/jumbo v5, "rom_sys_info"

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 1833
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1835
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1836
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_1

    .line 1837
    new-instance v2, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 1838
    iget-object v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    iput-object v4, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 1839
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    iput v0, v2, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 1840
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move v1, v2

    .line 1832
    goto :goto_0

    .line 1844
    :cond_3
    return-object v3
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 1314
    const/4 v0, 0x0

    return v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 1949
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d:I

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .prologue
    .line 1319
    const/4 v0, 0x1

    return v0
.end method

.method public j()I
    .locals 1

    .prologue
    .line 1953
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e:I

    return v0
.end method

.method public k()[I
    .locals 6

    .prologue
    .line 1981
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 1983
    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d:I

    .line 1984
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e:I

    .line 1986
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->m()Ljava/util/List;

    move-result-object v2

    .line 1987
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 1993
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v1

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1994
    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v5, :cond_0

    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v5, :cond_0

    .line 1996
    add-int/lit8 v2, v2, 0x1

    .line 1999
    :cond_0
    iget-boolean v5, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v5, :cond_3

    .line 2000
    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    const/4 v5, 0x3

    if-lt v0, v5, :cond_3

    .line 2001
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    :goto_1
    move v1, v0

    .line 2004
    goto :goto_0

    :cond_1
    move v0, v1

    move v1, v2

    .line 2006
    :cond_2
    const/4 v2, 0x0

    aput v1, v3, v2

    .line 2007
    const/4 v1, 0x1

    aput v0, v3, v1

    .line 2008
    return-object v3

    :cond_3
    move v0, v1

    goto :goto_1
.end method
