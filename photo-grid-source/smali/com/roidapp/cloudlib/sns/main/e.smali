.class public final Lcom/roidapp/cloudlib/sns/main/e;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/main/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/main/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 15
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->b:Ljava/util/Set;

    .line 19
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    .line 20
    return-void
.end method


# virtual methods
.method public final a(I)Lcom/roidapp/cloudlib/sns/main/b;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 25
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    .line 27
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(ILcom/roidapp/cloudlib/sns/main/b;)V
    .locals 2

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 33
    invoke-virtual {v0, p2}, Landroid/support/v4/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 34
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/e;->b:Ljava/util/Set;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_0
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/main/e;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->hashCode()I

    move-result v0

    or-int/2addr v0, p1

    int-to-long v0, v0

    .line 51
    :goto_0
    return-wide v0

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;->getItemId(I)J

    move-result-wide v0

    goto :goto_0
.end method

.method public final getItemPosition(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/e;->b:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    const/4 v0, -0x2

    .line 59
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method
