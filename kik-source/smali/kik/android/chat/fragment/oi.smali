.class final Lkik/android/chat/fragment/oi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/oh;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/oh;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lkik/android/chat/fragment/oi;->a:Lkik/android/chat/fragment/oh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lkik/android/chat/fragment/oi;->a:Lkik/android/chat/fragment/oh;

    iget-object v0, v0, Lkik/android/chat/fragment/oh;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d()V

    .line 191
    return-void
.end method
