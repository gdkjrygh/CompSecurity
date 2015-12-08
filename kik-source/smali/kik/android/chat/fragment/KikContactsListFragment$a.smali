.class public Lkik/android/chat/fragment/KikContactsListFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikContactsListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 920
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikContactsListFragment$a;)J
    .locals 2

    .prologue
    .line 920
    const-string v0, "KikContactsListFragment.EXTRA_DEPENDENT_PROMISE"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikContactsListFragment$a;->j(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a(J)Lkik/android/chat/fragment/KikContactsListFragment$a;
    .locals 1

    .prologue
    .line 926
    const-string v0, "KikContactsListFragment.EXTRA_DEPENDENT_PROMISE"

    invoke-virtual {p0, v0, p1, p2}, Lkik/android/chat/fragment/KikContactsListFragment$a;->a(Ljava/lang/String;J)V

    .line 927
    return-object p0
.end method
