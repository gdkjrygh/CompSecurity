.class final Lkik/android/chat/fragment/ml;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lkik/android/chat/fragment/ml;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    .line 120
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkik/android/util/af;

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Lkik/android/chat/fragment/ml;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/af;

    iget-object v0, v0, Lkik/android/util/af;->a:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 135
    :cond_0
    :goto_0
    return-void

    .line 124
    :cond_1
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    .line 125
    if-eqz v0, :cond_0

    .line 126
    const-string v1, "suggest_intent_data_id"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    iget-object v2, p0, Lkik/android/chat/fragment/ml;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 130
    if-eqz v2, :cond_0

    .line 131
    iget-object v3, p0, Lkik/android/chat/fragment/ml;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/view/adapters/ContactsCursorAdapter$a;

    invoke-virtual {v3, v2, v1, v0, p3}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V

    goto :goto_0
.end method
