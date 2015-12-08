.class final Lkik/android/widget/bd;
.super Lkik/android/widget/at;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Landroid/support/v7/widget/StaggeredGridLayoutManager;

.field final synthetic c:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;Ljava/util/List;Landroid/support/v7/widget/StaggeredGridLayoutManager;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    iput-object p2, p0, Lkik/android/widget/bd;->a:Ljava/util/List;

    iput-object p3, p0, Lkik/android/widget/bd;->b:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Lkik/android/widget/at;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 137
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Z)V

    .line 138
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->b(Lkik/android/widget/GifSearchFragment;Z)V

    .line 141
    :cond_0
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v1}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/bd;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V

    .line 142
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;)V

    .line 143
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 148
    iget-object v0, p0, Lkik/android/widget/bd;->b:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c()[I

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/bd;->b:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->c()[I

    move-result-object v0

    aget v0, v0, v1

    if-lez v0, :cond_0

    .line 151
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Z)V

    .line 153
    :cond_0
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-virtual {v0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0, v1}, Lkik/android/widget/GifSearchFragment;->b(Lkik/android/widget/GifSearchFragment;Z)V

    .line 156
    :cond_1
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    iget-object v1, v1, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v1}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/bd;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v1, v2}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V

    .line 157
    iget-object v0, p0, Lkik/android/widget/bd;->c:Lkik/android/widget/GifSearchFragment;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->b(Lkik/android/widget/GifSearchFragment;)V

    .line 158
    return-void
.end method
