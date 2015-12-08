.class public final Lcom/google/zxing/client/android/history/HistoryActivity;
.super Landroid/app/ListActivity;
.source "HistoryActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

.field private historyManager:Lcom/google/zxing/client/android/history/HistoryManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-class v0, Lcom/google/zxing/client/android/history/HistoryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/history/HistoryActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Landroid/app/ListActivity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/google/zxing/client/android/history/HistoryActivity;)Lcom/google/zxing/client/android/history/HistoryManager;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    return-object v0
.end method

.method private reloadHistoryItems()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 65
    iget-object v2, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    invoke-virtual {v2}, Lcom/google/zxing/client/android/history/HistoryManager;->buildHistoryItems()Ljava/util/List;

    move-result-object v1

    .line 66
    .local v1, "items":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/history/HistoryItem;>;"
    iget-object v2, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v2}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->clear()V

    .line 67
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 70
    iget-object v2, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v2}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 71
    iget-object v2, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    new-instance v3, Lcom/google/zxing/client/android/history/HistoryItem;

    invoke-direct {v3, v4, v4, v4}, Lcom/google/zxing/client/android/history/HistoryItem;-><init>(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->add(Ljava/lang/Object;)V

    .line 73
    :cond_0
    return-void

    .line 67
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/android/history/HistoryItem;

    .line 68
    .local v0, "item":Lcom/google/zxing/client/android/history/HistoryItem;
    iget-object v3, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v3, v0}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->add(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 98
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 99
    .local v0, "position":I
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    invoke-virtual {v1, v0}, Lcom/google/zxing/client/android/history/HistoryManager;->deleteHistoryItem(I)V

    .line 100
    invoke-direct {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->reloadHistoryItems()V

    .line 101
    const/4 v1, 0x1

    return v1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "icicle"    # Landroid/os/Bundle;

    .prologue
    .line 50
    invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    new-instance v1, Lcom/google/zxing/client/android/history/HistoryManager;

    invoke-direct {v1, p0}, Lcom/google/zxing/client/android/history/HistoryManager;-><init>(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    .line 52
    new-instance v1, Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-direct {v1, p0}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;-><init>(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    .line 53
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/history/HistoryActivity;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 54
    invoke-virtual {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 55
    .local v0, "listview":Landroid/widget/ListView;
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/history/HistoryActivity;->registerForContextMenu(Landroid/view/View;)V

    .line 56
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3
    .param p1, "menu"    # Landroid/view/ContextMenu;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;

    .prologue
    .line 88
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .end local p3    # "menuInfo":Landroid/view/ContextMenu$ContextMenuInfo;
    iget v0, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    .line 89
    .local v0, "position":I
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v1}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 90
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v1, v0}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/zxing/client/android/history/HistoryItem;

    invoke-virtual {v1}, Lcom/google/zxing/client/android/history/HistoryItem;->getResult()Lcom/google/zxing/Result;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 92
    sget v2, Lcom/google/zxing/client/android/R$string;->history_clear_one_history_text:I

    .line 91
    invoke-interface {p1, v1, v0, v0, v2}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 94
    :cond_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 106
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    invoke-virtual {v1}, Lcom/google/zxing/client/android/history/HistoryManager;->hasHistoryItems()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 108
    .local v0, "menuInflater":Landroid/view/MenuInflater;
    sget v1, Lcom/google/zxing/client/android/R$menu;->history:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 110
    .end local v0    # "menuInflater":Landroid/view/MenuInflater;
    :cond_0
    invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v1

    return v1
.end method

.method protected onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 2
    .param p1, "l"    # Landroid/widget/ListView;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J

    .prologue
    .line 77
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->adapter:Lcom/google/zxing/client/android/history/HistoryItemAdapter;

    invoke-virtual {v1, p3}, Lcom/google/zxing/client/android/history/HistoryItemAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/zxing/client/android/history/HistoryItem;

    invoke-virtual {v1}, Lcom/google/zxing/client/android/history/HistoryItem;->getResult()Lcom/google/zxing/Result;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 78
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/zxing/client/android/CaptureActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 79
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "ITEM_NUMBER"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 80
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/google/zxing/client/android/history/HistoryActivity;->setResult(ILandroid/content/Intent;)V

    .line 81
    invoke-virtual {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->finish()V

    .line 83
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 10
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 115
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v6

    sget v7, Lcom/google/zxing/client/android/R$id;->menu_history_send:I

    if-ne v6, v7, :cond_2

    .line 116
    iget-object v6, p0, Lcom/google/zxing/client/android/history/HistoryActivity;->historyManager:Lcom/google/zxing/client/android/history/HistoryManager;

    invoke-virtual {v6}, Lcom/google/zxing/client/android/history/HistoryManager;->buildHistory()Ljava/lang/CharSequence;

    move-result-object v2

    .line 117
    .local v2, "history":Ljava/lang/CharSequence;
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/zxing/client/android/history/HistoryManager;->saveHistory(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 118
    .local v3, "historyFile":Landroid/net/Uri;
    if-nez v3, :cond_1

    .line 119
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 120
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    sget v6, Lcom/google/zxing/client/android/R$string;->msg_unmount_usb:I

    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 121
    sget v6, Lcom/google/zxing/client/android/R$string;->button_ok:I

    invoke-virtual {v1, v6, v9}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 122
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 158
    .end local v1    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v2    # "history":Ljava/lang/CharSequence;
    .end local v3    # "historyFile":Landroid/net/Uri;
    :cond_0
    :goto_0
    return v8

    .line 124
    .restart local v2    # "history":Ljava/lang/CharSequence;
    .restart local v3    # "historyFile":Landroid/net/Uri;
    :cond_1
    new-instance v4, Landroid/content/Intent;

    const-string v6, "android.intent.action.SEND"

    .line 125
    const-string v7, "mailto:"

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 124
    invoke-direct {v4, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 126
    .local v4, "intent":Landroid/content/Intent;
    const/high16 v6, 0x80000

    invoke-virtual {v4, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 127
    invoke-virtual {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 128
    sget v7, Lcom/google/zxing/client/android/R$string;->history_email_title:I

    .line 127
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 129
    .local v5, "subject":Ljava/lang/String;
    const-string v6, "android.intent.extra.SUBJECT"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    const-string v6, "android.intent.extra.TEXT"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    const-string v6, "android.intent.extra.STREAM"

    invoke-virtual {v4, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 132
    const-string v6, "text/csv"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    :try_start_0
    invoke-virtual {p0, v4}, Lcom/google/zxing/client/android/history/HistoryActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 135
    :catch_0
    move-exception v0

    .line 136
    .local v0, "anfe":Landroid/content/ActivityNotFoundException;
    sget-object v6, Lcom/google/zxing/client/android/history/HistoryActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 139
    .end local v0    # "anfe":Landroid/content/ActivityNotFoundException;
    .end local v2    # "history":Ljava/lang/CharSequence;
    .end local v3    # "historyFile":Landroid/net/Uri;
    .end local v4    # "intent":Landroid/content/Intent;
    .end local v5    # "subject":Ljava/lang/String;
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v6

    sget v7, Lcom/google/zxing/client/android/R$id;->menu_history_clear_text:I

    if-ne v6, v7, :cond_0

    .line 141
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 142
    .restart local v1    # "builder":Landroid/app/AlertDialog$Builder;
    sget v6, Lcom/google/zxing/client/android/R$string;->msg_sure:I

    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 143
    invoke-virtual {v1, v8}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 144
    sget v6, Lcom/google/zxing/client/android/R$string;->button_ok:I

    .line 145
    new-instance v7, Lcom/google/zxing/client/android/history/HistoryActivity$1;

    invoke-direct {v7, p0}, Lcom/google/zxing/client/android/history/HistoryActivity$1;-><init>(Lcom/google/zxing/client/android/history/HistoryActivity;)V

    .line 144
    invoke-virtual {v1, v6, v7}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 153
    sget v6, Lcom/google/zxing/client/android/R$string;->button_cancel:I

    invoke-virtual {v1, v6, v9}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 154
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 60
    invoke-super {p0}, Landroid/app/ListActivity;->onResume()V

    .line 61
    invoke-direct {p0}, Lcom/google/zxing/client/android/history/HistoryActivity;->reloadHistoryItems()V

    .line 62
    return-void
.end method
