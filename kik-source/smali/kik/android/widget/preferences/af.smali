.class final Lkik/android/widget/preferences/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/KikProfilePicPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/KikProfilePicPreference;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lkik/android/widget/preferences/af;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 134
    iget-object v0, p0, Lkik/android/widget/preferences/af;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v0, v0, Lkik/android/widget/preferences/KikProfilePicPreference;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 136
    iget-object v1, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 137
    iget-object v1, p0, Lkik/android/widget/preferences/af;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v1, v1, Lkik/android/widget/preferences/KikProfilePicPreference;->c:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    .line 138
    new-instance v2, Lkik/android/chat/fragment/ViewPictureFragment$a;

    invoke-direct {v2}, Lkik/android/chat/fragment/ViewPictureFragment$a;-><init>()V

    .line 140
    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    iget-object v0, v0, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a()Lkik/android/chat/fragment/ViewPictureFragment$a;

    .line 142
    iget-object v0, p0, Lkik/android/widget/preferences/af;->a:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v2, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 144
    :cond_0
    return-void
.end method
