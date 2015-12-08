.class public final Lkik/android/chat/fragment/SendToFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/SendToFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 336
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/SendToFragment$a;)Z
    .locals 1

    .prologue
    .line 336
    const-string v0, "SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/SendToFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/SendToFragment$a;)J
    .locals 2

    .prologue
    .line 336
    const-string v0, "SendToFragment.EXTRA_DEPENDENT_PROMISE"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/SendToFragment$a;->j(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final a(J)Lkik/android/chat/fragment/SendToFragment$a;
    .locals 1

    .prologue
    .line 350
    const-string v0, "SendToFragment.EXTRA_DEPENDENT_PROMISE"

    invoke-virtual {p0, v0, p1, p2}, Lkik/android/chat/fragment/SendToFragment$a;->a(Ljava/lang/String;J)V

    .line 351
    return-object p0
.end method

.method public final a(Z)Lkik/android/chat/fragment/SendToFragment$a;
    .locals 1

    .prologue
    .line 361
    const-string v0, "SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/SendToFragment$a;->a(Ljava/lang/String;Z)V

    .line 362
    return-object p0
.end method
