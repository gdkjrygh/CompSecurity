.class final Lkik/android/chat/fragment/kn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 335
    iput-object p1, p0, Lkik/android/chat/fragment/kn;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    .line 340
    iget-object v0, p0, Lkik/android/chat/fragment/kn;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    .line 341
    iget-object v1, p0, Lkik/android/chat/fragment/kn;->a:Lkik/android/chat/fragment/KikConversationsFragment;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/a/d/f;Z)V

    .line 342
    return-void
.end method
