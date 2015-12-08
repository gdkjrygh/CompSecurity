.class final Lkik/android/chat/fragment/ks;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    .prologue
    .line 82
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkik/android/util/af;

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/af;

    iget-object v0, v0, Lkik/android/util/af;->a:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    .line 87
    if-eqz v0, :cond_2

    instance-of v1, v0, Landroid/database/Cursor;

    if-eqz v1, :cond_2

    .line 88
    check-cast v0, Landroid/database/Cursor;

    .line 89
    const-string v1, "suggest_text_1"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 90
    const-string v2, "suggest_intent_data_id"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 92
    iget-object v2, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-virtual {v2, v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a_(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 94
    :cond_2
    if-eqz v0, :cond_4

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 95
    check-cast v0, Ljava/lang/String;

    .line 96
    const-string v1, "FIND PEOPLE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 97
    iget-object v0, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->N:Lcom/kik/android/a;

    const-string v1, "Find People Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 98
    iget-object v0, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    new-instance v1, Lkik/android/chat/fragment/KikFindPeopleFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikFindPeopleFragment$a;-><init>()V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    goto :goto_0

    .line 100
    :cond_3
    const-string v1, "START GROUP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    new-instance v1, Lkik/android/chat/fragment/KikStartGroupFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;-><init>()V

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikStartGroupFragment$a;->e()Lkik/android/chat/fragment/KikStartGroupFragment$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 102
    iget-object v0, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->N:Lcom/kik/android/a;

    const-string v1, "Start Group Screen Visited"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Source"

    const-string v2, "Talk To"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 107
    :cond_4
    if-eqz v0, :cond_0

    instance-of v1, v0, Lkik/a/d/k;

    if-eqz v1, :cond_0

    .line 108
    iget-object v1, p0, Lkik/android/chat/fragment/ks;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c(Lkik/a/d/k;)V

    goto/16 :goto_0
.end method
