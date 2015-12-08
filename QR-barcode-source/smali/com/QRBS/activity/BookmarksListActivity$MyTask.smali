.class Lcom/QRBS/activity/BookmarksListActivity$MyTask;
.super Landroid/os/AsyncTask;
.source "BookmarksListActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/BookmarksListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/BookmarksListActivity;


# direct methods
.method private constructor <init>(Lcom/QRBS/activity/BookmarksListActivity;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/QRBS/activity/BookmarksListActivity;Lcom/QRBS/activity/BookmarksListActivity$MyTask;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/QRBS/activity/BookmarksListActivity$MyTask;-><init>(Lcom/QRBS/activity/BookmarksListActivity;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    const/4 v10, 0x0

    .line 69
    const/4 v0, 0x6

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v2, v10

    const/4 v0, 0x1

    const-string v1, "title"

    aput-object v1, v2, v0

    const/4 v0, 0x2

    const-string v1, "url"

    aput-object v1, v2, v0

    const/4 v0, 0x3

    const-string v1, "visits"

    aput-object v1, v2, v0

    const/4 v0, 0x4

    const-string v1, "date"

    aput-object v1, v2, v0

    const/4 v0, 0x5

    const-string v1, "favicon"

    aput-object v1, v2, v0

    .line 71
    .local v2, "projection":[Ljava/lang/String;
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/BookmarksListActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/Browser;->BOOKMARKS_URI:Landroid/net/Uri;

    const-string v3, "bookmark"

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 73
    .local v7, "cursor":Landroid/database/Cursor;
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->title:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/QRBS/activity/BookmarksListActivity;->access$0(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "title"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->url:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/QRBS/activity/BookmarksListActivity;->access$1(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "url"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    const-string v0, "favicon"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v8

    .line 82
    .local v8, "data":[B
    if-eqz v8, :cond_3

    .line 83
    array-length v0, v8

    invoke-static {v8, v10, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 84
    .local v6, "bitmap":Landroid/graphics/Bitmap;
    if-eqz v6, :cond_1

    .line 85
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->favicon:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/QRBS/activity/BookmarksListActivity;->access$2(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v3, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    invoke-virtual {v3}, Lcom/QRBS/activity/BookmarksListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3, v6}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .end local v6    # "bitmap":Landroid/graphics/Bitmap;
    :cond_1
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    .end local v8    # "data":[B
    :cond_2
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->prog:Landroid/app/ProgressDialog;
    invoke-static {v0}, Lcom/QRBS/activity/BookmarksListActivity;->access$3(Lcom/QRBS/activity/BookmarksListActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 96
    const-string v0, "OK"

    return-object v0

    .line 88
    .restart local v8    # "data":[B
    :cond_3
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    invoke-virtual {v0}, Lcom/QRBS/activity/BookmarksListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02008c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 89
    .local v9, "defaultDrawable":Landroid/graphics/drawable/Drawable;
    iget-object v0, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->favicon:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/QRBS/activity/BookmarksListActivity;->access$2(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 6
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 102
    new-instance v0, Lcom/scannerfire/model/MyAdapter;

    iget-object v1, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    const v2, 0x7f030032

    iget-object v3, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->favicon:Ljava/util/ArrayList;
    invoke-static {v3}, Lcom/QRBS/activity/BookmarksListActivity;->access$2(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->title:Ljava/util/ArrayList;
    invoke-static {v4}, Lcom/QRBS/activity/BookmarksListActivity;->access$0(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v4

    iget-object v5, p0, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->url:Ljava/util/ArrayList;
    invoke-static {v5}, Lcom/QRBS/activity/BookmarksListActivity;->access$1(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/scannerfire/model/MyAdapter;-><init>(Landroid/app/Activity;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 103
    .local v0, "adapter":Lcom/scannerfire/model/MyAdapter;
    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->lv:Landroid/widget/ListView;
    invoke-static {}, Lcom/QRBS/activity/BookmarksListActivity;->access$4()Landroid/widget/ListView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 105
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 109
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/BookmarksListActivity$MyTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 113
    return-void
.end method
