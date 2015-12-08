.class final Lkik/android/chat/fragment/qf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/MissedConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/MissedConversationsFragment;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lkik/android/chat/fragment/qf;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lkik/android/chat/fragment/qf;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/MissedConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 85
    iget-object v1, p0, Lkik/android/chat/fragment/qf;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/MissedConversationsFragment;->a(Lkik/a/d/f;)V

    .line 86
    return-void
.end method
