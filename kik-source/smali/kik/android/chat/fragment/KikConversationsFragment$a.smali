.class public final Lkik/android/chat/fragment/KikConversationsFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikConversationsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1107
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1107
    const-string v0, "convos.push.card.url"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikConversationsFragment$a;)Z
    .locals 1

    .prologue
    .line 1107
    const-string v0, "convos.pick.contact"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1107
    const-string v0, "convos.video.download"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikConversationsFragment$a;)Z
    .locals 2

    .prologue
    .line 1107
    const-string v0, "HASHTAG_GROUP_ERROR"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/KikConversationsFragment$a;
    .locals 2

    .prologue
    .line 1125
    const-string v0, "convos.pick.contact"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Ljava/lang/String;Z)V

    .line 1126
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikConversationsFragment$a;
    .locals 1

    .prologue
    .line 1119
    const-string v0, "convos.push.card.url"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    return-object p0
.end method

.method public final a(Z)Lkik/android/chat/fragment/KikConversationsFragment$a;
    .locals 1

    .prologue
    .line 1149
    const-string v0, "HASHTAG_GROUP_ERROR"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Ljava/lang/String;Z)V

    .line 1150
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lkik/android/chat/fragment/KikConversationsFragment$a;
    .locals 1

    .prologue
    .line 1131
    const-string v0, "convos.video.download"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1132
    return-object p0
.end method
