.class final Lkik/android/chat/fragment/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ChatBubbleSelectionFragment;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lkik/android/chat/fragment/ab;->a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/chat/fragment/ab;->a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment;->_bubbleList:Landroid/widget/ListView;

    invoke-virtual {v0, p3}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/b/b;

    .line 71
    iget-object v1, p0, Lkik/android/chat/fragment/ab;->a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ChatBubbleSelectionFragment;->a:Lkik/android/chat/b/d;

    invoke-virtual {v1, v0}, Lkik/android/chat/b/d;->a(Lkik/android/chat/b/b;)V

    .line 72
    iget-object v1, p0, Lkik/android/chat/fragment/ab;->a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment;->a(Lkik/android/chat/fragment/ChatBubbleSelectionFragment;Lkik/android/chat/b/b;)V

    .line 73
    if-eqz v0, :cond_0

    .line 74
    iget-object v1, p0, Lkik/android/chat/fragment/ab;->a:Lkik/android/chat/fragment/ChatBubbleSelectionFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ChatBubbleSelectionFragment;->b:Lcom/kik/android/a;

    const-string v2, "Chat Bubble Colour Tapped"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Name"

    invoke-virtual {v0}, Lkik/android/chat/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 78
    :cond_0
    return-void
.end method
