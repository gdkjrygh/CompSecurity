.class final Lkik/android/chat/fragment/oh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPromotedChatsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lkik/android/chat/fragment/oh;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 182
    iget-object v0, p0, Lkik/android/chat/fragment/oh;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    iget v0, v0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->k:I

    sget v1, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->b:I

    if-eq v0, v1, :cond_0

    .line 184
    iget-object v0, p0, Lkik/android/chat/fragment/oh;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    sget v1, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->c:I

    iput v1, v0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->k:I

    .line 185
    iget-object v0, p0, Lkik/android/chat/fragment/oh;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    new-instance v1, Lkik/android/chat/fragment/oi;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/oi;-><init>(Lkik/android/chat/fragment/oh;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b(Ljava/lang/Runnable;)V

    .line 194
    :cond_0
    return-void
.end method
