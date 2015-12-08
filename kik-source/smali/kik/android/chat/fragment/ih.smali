.class final Lkik/android/chat/fragment/ih;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 489
    iput-object p1, p0, Lkik/android/chat/fragment/ih;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/16 v2, 0x12c

    .line 493
    iget-object v0, p0, Lkik/android/chat/fragment/ih;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    new-instance v1, Lkik/android/chat/fragment/ii;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ii;-><init>(Lkik/android/chat/fragment/ih;)V

    invoke-static {v0, v2, v4, v5, v1}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    .line 501
    iget-object v0, p0, Lkik/android/chat/fragment/ih;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_tellAFriendImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-static {v0, v2, v4, v5, v1}, Lkik/android/util/av;->a(Landroid/view/View;IJLandroid/animation/Animator$AnimatorListener;)V

    .line 502
    return-void
.end method
