.class Landroid/support/v4/view/s$f;
.super Landroid/support/v4/view/s$e;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 851
    invoke-direct {p0}, Landroid/support/v4/view/s$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;IIII)V
    .locals 0

    .prologue
    .line 866
    invoke-static {p1, p2, p3, p4, p5}, Landroid/support/v4/view/x;->a(Landroid/view/View;IIII)V

    .line 867
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 870
    invoke-static {p1, p2}, Landroid/support/v4/view/x;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 871
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 862
    invoke-static {p1}, Landroid/support/v4/view/x;->a(Landroid/view/View;)V

    .line 863
    return-void
.end method

.method public c(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 878
    invoke-static {p1}, Landroid/support/v4/view/x;->b(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 885
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 886
    const/4 p2, 0x2

    .line 888
    :cond_0
    invoke-static {p1, p2}, Landroid/support/v4/view/x;->a(Landroid/view/View;I)V

    .line 889
    return-void
.end method

.method public f(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 905
    invoke-static {p1}, Landroid/support/v4/view/x;->c(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method
