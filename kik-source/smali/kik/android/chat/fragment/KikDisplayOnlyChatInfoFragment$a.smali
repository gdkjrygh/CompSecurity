.class public final Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 194
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/m;
    .locals 1

    .prologue
    .line 206
    const-string v0, "kik.android.chat.fragment.KikDisplayOnlyChatInfoFragment.chatInfoDisplayOnlyGroup"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment$a;->l(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lkik/android/util/KikDisplayOnlyGroupParcelable;

    .line 207
    if-eqz v0, :cond_0

    .line 208
    invoke-virtual {v0}, Lkik/android/util/KikDisplayOnlyGroupParcelable;->a()Lkik/a/d/m;

    move-result-object v0

    .line 210
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
