.class final Lkik/android/widget/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lkik/android/widget/bh;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .prologue
    .line 231
    if-eqz p2, :cond_0

    iget-object v0, p0, Lkik/android/widget/bh;->a:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lkik/android/widget/bh;->a:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->a()V

    .line 234
    :cond_0
    return-void
.end method
