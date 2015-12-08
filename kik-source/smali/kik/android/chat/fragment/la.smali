.class final Lkik/android/chat/fragment/la;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V
    .locals 0

    .prologue
    .line 336
    iput-object p1, p0, Lkik/android/chat/fragment/la;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 4

    .prologue
    .line 340
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 341
    iget-object v0, p0, Lkik/android/chat/fragment/la;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->c:Landroid/widget/ListView;

    iget v1, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    .line 342
    instance-of v1, v0, Lkik/android/util/af;

    if-eqz v1, :cond_1

    .line 350
    :cond_0
    :goto_0
    return-void

    .line 345
    :cond_1
    instance-of v1, v0, Landroid/database/Cursor;

    if-eqz v1, :cond_0

    .line 346
    check-cast v0, Landroid/database/Cursor;

    .line 347
    const-string v1, "suggest_text_1"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 348
    const/16 v0, 0x4c7e

    const/16 v1, 0x4c7f

    const/4 v2, 0x0

    iget-object v3, p0, Lkik/android/chat/fragment/la;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-virtual {v3}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_0
.end method
