.class final Landroid/support/v7/widget/g;
.super Landroid/support/v7/widget/c$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView$t;

.field final synthetic b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

.field final synthetic c:Landroid/support/v7/widget/c;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/c;Landroid/support/v7/widget/RecyclerView$t;Landroid/support/v4/view/ViewPropertyAnimatorCompat;)V
    .locals 1

    .prologue
    .line 197
    iput-object p1, p0, Landroid/support/v7/widget/g;->c:Landroid/support/v7/widget/c;

    iput-object p2, p0, Landroid/support/v7/widget/g;->a:Landroid/support/v7/widget/RecyclerView$t;

    iput-object p3, p0, Landroid/support/v7/widget/g;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/c$c;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/widget/g;->b:Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    .line 206
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setAlpha(Landroid/view/View;F)V

    .line 207
    iget-object v0, p0, Landroid/support/v7/widget/g;->c:Landroid/support/v7/widget/c;

    iget-object v1, p0, Landroid/support/v7/widget/g;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/c;->d(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 208
    iget-object v0, p0, Landroid/support/v7/widget/g;->c:Landroid/support/v7/widget/c;

    invoke-static {v0}, Landroid/support/v7/widget/c;->d(Landroid/support/v7/widget/c;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/g;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 209
    iget-object v0, p0, Landroid/support/v7/widget/g;->c:Landroid/support/v7/widget/c;

    invoke-static {v0}, Landroid/support/v7/widget/c;->e(Landroid/support/v7/widget/c;)V

    .line 210
    return-void
.end method

.method public final onAnimationStart(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 200
    return-void
.end method
