.class final Lkik/android/chat/fragment/of;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPromotedChatsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lkik/android/chat/fragment/of;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lkik/android/chat/fragment/of;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    iget v0, v0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->k:I

    sget v1, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->a:I

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/of;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->h:Z

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/of;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    new-instance v1, Lkik/android/chat/fragment/og;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/og;-><init>(Lkik/android/chat/fragment/of;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method
