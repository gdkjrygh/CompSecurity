.class public final Lkik/android/chat/fragment/KikStartGroupFragment$a;
.super Lkik/android/chat/fragment/KikPickUsersFragment$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikStartGroupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 703
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;
    .locals 1

    .prologue
    .line 703
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->c(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikStartGroupFragment$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikStartGroupFragment$a;
    .locals 1

    .prologue
    .line 733
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 734
    return-object p0
.end method

.method public final c(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikStartGroupFragment$a;
    .locals 1

    .prologue
    .line 722
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.PreselectedUsers"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 723
    return-object p0
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 728
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.PreselectedUsers"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lkik/android/chat/fragment/KikStartGroupFragment$a;
    .locals 2

    .prologue
    .line 711
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->a(Ljava/lang/String;Z)V

    .line 712
    return-object p0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 717
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 739
    const-string v0, "kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
