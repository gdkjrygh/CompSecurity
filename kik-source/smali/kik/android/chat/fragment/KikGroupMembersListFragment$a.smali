.class public final Lkik/android/chat/fragment/KikGroupMembersListFragment$a;
.super Lkik/android/util/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikGroupMembersListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 561
    invoke-direct {p0}, Lkik/android/util/an;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 573
    const-string v0, "KikGroupMembersListFragment.groupJid"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikGroupMembersListFragment$a;
    .locals 1

    .prologue
    .line 567
    const-string v0, "KikGroupMembersListFragment.groupJid"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    return-object p0
.end method
