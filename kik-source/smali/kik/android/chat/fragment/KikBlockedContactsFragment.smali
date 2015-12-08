.class public Lkik/android/chat/fragment/KikBlockedContactsFragment;
.super Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikBlockedContactsFragment$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;-><init>()V

    .line 146
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 49
    const v0, 0x7f090297

    return v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    const v0, 0x7f090379

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 131
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 132
    return-void
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 85
    return-void
.end method

.method protected final a_(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 43
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->a(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lkik/android/KikDataProvider;->d:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->a(Landroid/net/Uri;)V

    .line 62
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->p()V

    .line 63
    return-void
.end method

.method protected final b(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 108
    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x1

    return v0
.end method

.method protected final e()V
    .locals 2

    .prologue
    .line 77
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->S()V

    .line 78
    new-instance v0, Lkik/android/chat/fragment/KikAddToBlockFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddToBlockFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 79
    return-void
.end method

.method protected final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x0

    return v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 137
    const/4 v0, 0x0

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 143
    const/4 v0, 0x0

    return v0
.end method

.method protected final k()Z
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x1

    return v0
.end method

.method protected final l()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 90
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikBlockedContactsFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02020d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected final m()Z
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x0

    return v0
.end method
