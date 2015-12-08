.class final Lkik/android/chat/fragment/qb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikWelcomeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikWelcomeFragment;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lkik/android/chat/fragment/qb;->a:Lkik/android/chat/fragment/KikWelcomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 72
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lkik/android/chat/fragment/qb;->a:Lkik/android/chat/fragment/KikWelcomeFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikWelcomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 73
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 74
    const-string v1, "SimpleFragmentWrapperActivity.fragmentlaunchclass"

    const-class v2, Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    iget-object v1, p0, Lkik/android/chat/fragment/qb;->a:Lkik/android/chat/fragment/KikWelcomeFragment;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikWelcomeFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 76
    return-void
.end method
