.class final Lkik/android/chat/fragment/rm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Landroid/widget/TextView;

.field final synthetic c:Lkik/android/chat/fragment/rl;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/rl;Landroid/view/View;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lkik/android/chat/fragment/rm;->c:Lkik/android/chat/fragment/rl;

    iput-object p2, p0, Lkik/android/chat/fragment/rm;->a:Landroid/view/View;

    iput-object p3, p0, Lkik/android/chat/fragment/rm;->b:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 109
    iget-object v0, p0, Lkik/android/chat/fragment/rm;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/animation/PropertyValuesHolder;

    const/4 v2, 0x0

    const-string v3, "alpha"

    const/4 v4, 0x2

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    invoke-static {v3, v4}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 111
    iget-object v0, p0, Lkik/android/chat/fragment/rm;->c:Lkik/android/chat/fragment/rl;

    invoke-static {v0}, Lkik/android/chat/fragment/rl;->a(Lkik/android/chat/fragment/rl;)Lkik/android/chat/fragment/rl$a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/rm;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lkik/android/chat/fragment/rl$a;->a(Ljava/lang/String;Landroid/view/View;)V

    .line 113
    return-void

    .line 109
    nop

    :array_0
    .array-data 4
        0x99
        0xff
    .end array-data
.end method
