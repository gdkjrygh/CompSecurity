.class public Lcom/aetn/history/android/historyhere/utils/ShareUtils;
.super Ljava/lang/Object;
.source "ShareUtils.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ShareUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static shareDetail(Landroid/content/Context;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "poiDetail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0d006d

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 30
    .local v3, "subject":Ljava/lang/String;
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0d006b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 32
    .local v1, "formattedBody":Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v4

    iget-object v2, v4, Lcom/aetn/history/android/historyhere/model/Configuration;->shareURL:Ljava/lang/String;

    .line 33
    .local v2, "shareURL":Ljava/lang/String;
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 34
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 35
    .local v0, "body":Ljava/lang/String;
    invoke-static {p0, v3, v0, p1}, Lcom/aetn/history/android/historyhere/utils/ShareUtils;->shareWithCustomCallbacks(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 36
    return-void
.end method

.method private static shareWithCustomCallbacks(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 9
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "shareSubject"    # Ljava/lang/String;
    .param p2, "shareBody"    # Ljava/lang/String;
    .param p3, "detail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 41
    new-instance v8, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 42
    .local v8, "sendIntent":Landroid/content/Intent;
    const-string v0, "text/plain"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    .line 44
    .local v6, "activities":Ljava/util/List;
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 45
    .local v7, "builder":Landroid/app/AlertDialog$Builder;
    const-string v0, "Share with..."

    invoke-virtual {v7, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 46
    new-instance v1, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;

    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    const v2, 0x7f030049

    invoke-interface {v6}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;-><init>(Landroid/app/Activity;I[Ljava/lang/Object;)V

    .line 47
    .local v1, "adapter":Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;
    new-instance v0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;

    move-object v2, p3

    move-object v3, p1

    move-object v4, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;-><init>(Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;Lcom/aetn/history/android/historyhere/model/POIDetail;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {v7, v1, v0}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 105
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 106
    return-void
.end method
