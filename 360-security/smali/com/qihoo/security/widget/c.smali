.class public Lcom/qihoo/security/widget/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/support/v4/view/ViewPager$e;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/view/ViewPager$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/c;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/widget/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager$e;

    .line 46
    if-eqz v0, :cond_0

    .line 47
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$e;->a(I)V

    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.method public a(IFI)V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/qihoo/security/widget/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager$e;

    .line 37
    if-eqz v0, :cond_0

    .line 38
    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$e;->a(IFI)V

    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public a(Landroid/support/v4/view/ViewPager$e;)V
    .locals 1

    .prologue
    .line 20
    if-eqz p1, :cond_0

    .line 21
    iget-object v0, p0, Lcom/qihoo/security/widget/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/widget/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager$e;

    .line 28
    if-eqz v0, :cond_0

    .line 29
    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$e;->b(I)V

    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method
