.class final Lkik/android/widget/di;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/dh;


# direct methods
.method constructor <init>(Lkik/android/widget/dh;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 176
    iget-object v0, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    iget-object v0, v0, Lkik/android/widget/dh;->c:Landroid/widget/ArrayAdapter;

    instance-of v0, v0, Lcom/kik/view/adapters/au;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    iget-object v0, v0, Lkik/android/widget/dh;->c:Landroid/widget/ArrayAdapter;

    check-cast v0, Lcom/kik/view/adapters/au;

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/au;->a(Z)V

    .line 179
    :cond_0
    iget-object v0, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    iget-object v0, v0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->setVerticalScrollBarEnabled(Z)V

    .line 180
    iget-object v0, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    iget-object v0, v0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0, v2}, Lkik/android/widget/ResizeEventList;->setOverScrollMode(I)V

    .line 181
    iget-object v0, p0, Lkik/android/widget/di;->a:Lkik/android/widget/dh;

    iget-object v0, v0, Lkik/android/widget/dh;->c:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 182
    return-void
.end method
