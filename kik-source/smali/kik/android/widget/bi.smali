.class final Lkik/android/widget/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lkik/android/widget/bi;->a:Lkik/android/widget/GifSearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 240
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/bi;->a:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Lkik/android/widget/bi;->a:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->a()V

    .line 242
    iget-object v0, p0, Lkik/android/widget/bi;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bi;->a:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v1}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->b(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;)V

    .line 244
    :cond_0
    return-void
.end method
