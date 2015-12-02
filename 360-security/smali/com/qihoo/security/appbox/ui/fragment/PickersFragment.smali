.class public Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;
.super Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;
.source "360Security"


# instance fields
.field private final A:Lcom/qihoo/security/appbox/b/c;

.field private final B:Lcom/qihoo/security/appbox/b/c;

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;-><init>()V

    .line 53
    new-instance v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;-><init>(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->A:Lcom/qihoo/security/appbox/b/c;

    .line 92
    new-instance v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$2;-><init>(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->B:Lcom/qihoo/security/appbox/b/c;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->y:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->y:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->z:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->z:Ljava/util/ArrayList;

    return-object p1
.end method


# virtual methods
.method protected b()V
    .locals 3

    .prologue
    .line 49
    invoke-super {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->b()V

    .line 50
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->r:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->B:Lcom/qihoo/security/appbox/b/c;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;)V

    .line 51
    return-void
.end method

.method protected e()V
    .locals 4

    .prologue
    .line 42
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v1

    const-string/jumbo v2, "3"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    const-string/jumbo v2, "3"

    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->A:Lcom/qihoo/security/appbox/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/util/ArrayList;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    .line 45
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 31
    const-string/jumbo v0, "0"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Ljava/lang/String;)V

    .line 32
    const-wide/16 v0, 0x64

    iput-wide v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->x:J

    .line 33
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 187
    invoke-super {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->onDestroy()V

    .line 188
    const-string/jumbo v0, "appbox"

    invoke-static {v0}, Lcom/qihoo/security/appbox/c/b/a;->a(Ljava/lang/Object;)V

    .line 189
    return-void
.end method
