.class final Lkik/android/chat/fragment/sf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 0

    .prologue
    .line 550
    iput-object p1, p0, Lkik/android/chat/fragment/sf;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 554
    new-instance v0, Lkik/android/b/g;

    invoke-direct {v0}, Lkik/android/b/g;-><init>()V

    .line 555
    iget-object v1, p0, Lkik/android/chat/fragment/sf;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ViewPictureFragment;->i(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/android/util/cv$c;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/cv$c;->a()Lcom/kik/f/a/a/a;

    move-result-object v1

    .line 556
    iget-object v2, p0, Lkik/android/chat/fragment/sf;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/ViewPictureFragment;->openButton:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/kik/ui/fragment/FragmentBase$a$a;->a:I

    invoke-virtual {v0, v2, v1, v3}, Lkik/android/b/g;->a(Landroid/content/Context;Lcom/kik/f/a/a/a;I)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/sg;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sg;-><init>(Lkik/android/chat/fragment/sf;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 569
    return-void
.end method
