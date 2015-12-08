.class final Lkik/android/chat/fragment/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ConversationsBaseFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lkik/android/chat/fragment/aq;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lkik/android/chat/fragment/aq;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-virtual {v0, p1, p2, p3, p4}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Landroid/widget/AbsListView;III)V

    .line 282
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lkik/android/chat/fragment/aq;->a:Lkik/android/chat/fragment/ConversationsBaseFragment;

    invoke-static {v0, p2}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/android/chat/fragment/ConversationsBaseFragment;I)I

    .line 276
    return-void
.end method
