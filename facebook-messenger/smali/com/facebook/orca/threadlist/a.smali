.class Lcom/facebook/orca/threadlist/a;
.super Landroid/widget/BaseAdapter;
.source "ContactGridAdapter.java"


# instance fields
.field private a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 19
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/threadlist/a;->b:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    .line 60
    return-void
.end method

.method public getCount()I
    .locals 2

    .prologue
    const/4 v0, 0x6

    .line 29
    iget-object v1, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 41
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/threadlist/a;->a:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 48
    if-nez p2, :cond_0

    .line 49
    new-instance p2, Lcom/facebook/orca/threadlist/b;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/a;->b:Landroid/content/Context;

    invoke-direct {p2, v1}, Lcom/facebook/orca/threadlist/b;-><init>(Landroid/content/Context;)V

    .line 54
    :goto_0
    invoke-virtual {p2, v0}, Lcom/facebook/orca/threadlist/b;->a(Lcom/facebook/user/User;)V

    .line 55
    return-object p2

    .line 51
    :cond_0
    check-cast p2, Lcom/facebook/orca/threadlist/b;

    goto :goto_0
.end method
