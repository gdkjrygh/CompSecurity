.class public final Lkik/android/chat/fragment/KikComposeFragment$a;
.super Lkik/android/chat/fragment/KikContactsListFragment$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikComposeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 307
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikComposeFragment$a;)Z
    .locals 1

    .prologue
    .line 307
    const-string v0, "isShare"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikComposeFragment$a;)Z
    .locals 1

    .prologue
    .line 307
    const-string v0, "isShare"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikComposeFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/KikComposeFragment$a;
    .locals 2

    .prologue
    .line 314
    const-string v0, "isShare"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikComposeFragment$a;->a(Ljava/lang/String;Z)V

    .line 315
    return-object p0
.end method
