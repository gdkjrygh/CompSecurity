.class final Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;
.super Ljava/lang/Object;
.source "ShareUtils.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/utils/ShareUtils;->shareWithCustomCallbacks(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$adapter:Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

.field final synthetic val$shareBody:Ljava/lang/String;

.field final synthetic val$shareSubject:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;Lcom/aetn/history/android/historyhere/model/POIDetail;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$adapter:Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$shareSubject:Ljava/lang/String;

    iput-object p4, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$shareBody:Ljava/lang/String;

    iput-object p5, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 9
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 50
    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v0

    .line 51
    .local v0, "config":Lcom/aetn/history/android/historyhere/model/Configuration;
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$adapter:Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;

    invoke-virtual {v6, p2}, Lcom/aetn/history/android/historyhere/model/ShareIntentListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 52
    .local v3, "info":Landroid/content/pm/ResolveInfo;
    const-string v6, "ShareUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "nfo.activityInfo.packageName:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    new-instance v4, Landroid/content/Intent;

    const-string v6, "android.intent.action.SEND"

    invoke-direct {v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 54
    .local v4, "intent":Landroid/content/Intent;
    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v7, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v7, "twitter"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 56
    const-string v6, "ShareUtils"

    const-string v7, "its twitter"

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    iget-object v6, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v5, v6, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->twitter:Ljava/lang/String;

    .line 59
    .local v5, "twitterFormat":Ljava/lang/String;
    const-string v6, "[title]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 60
    const-string v6, "android.intent.extra.TEXT"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    .end local v5    # "twitterFormat":Ljava/lang/String;
    :goto_0
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$context:Landroid/content/Context;

    invoke-virtual {v6, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 103
    return-void

    .line 61
    :cond_0
    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v7, "com.google.android.gm"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v7, "com.google.android.apps.inbox"

    .line 62
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v7, "android.email"

    .line 63
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 67
    :cond_1
    iget-object v6, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v6, v6, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->email:Lcom/aetn/history/android/historyhere/model/Configuration$Email;

    iget-object v2, v6, Lcom/aetn/history/android/historyhere/model/Configuration$Email;->subject:Ljava/lang/String;

    .line 68
    .local v2, "emailShareSubject":Ljava/lang/String;
    iget-object v6, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v6, v6, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->email:Lcom/aetn/history/android/historyhere/model/Configuration$Email;

    iget-object v1, v6, Lcom/aetn/history/android/historyhere/model/Configuration$Email;->body:Ljava/lang/String;

    .line 69
    .local v1, "emailShareBody":Ljava/lang/String;
    const-string v6, "[title]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 70
    const-string v6, "[title]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 72
    const-string v6, "[imageHTML]"

    const-string v7, ""

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 73
    const-string v6, "[address]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 74
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 75
    const-string v6, "[body]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 79
    :goto_1
    const-string v6, "text/html"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 80
    const-string v6, "android.intent.extra.SUBJECT"

    invoke-virtual {v4, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 81
    const-string v6, "android.intent.extra.TEXT"

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 77
    :cond_2
    const-string v6, "[body]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 82
    .end local v1    # "emailShareBody":Ljava/lang/String;
    .end local v2    # "emailShareSubject":Ljava/lang/String;
    :cond_3
    iget-object v6, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const-string v7, "com.google.android.apps.plus"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 83
    iget-object v6, v0, Lcom/aetn/history/android/historyhere/model/Configuration;->shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

    iget-object v1, v6, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->googleplus:Ljava/lang/String;

    .line 84
    .restart local v1    # "emailShareBody":Ljava/lang/String;
    const-string v6, "[title]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 86
    const-string v6, "[imageHTML]"

    const-string v7, ""

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 87
    const-string v6, "[address]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 88
    iget-object v6, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v6}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 89
    const-string v6, "[body]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 93
    :goto_2
    const-string v6, "text/plain"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    const-string v6, "android.intent.extra.TEXT"

    invoke-virtual {v4, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 91
    :cond_4
    const-string v6, "[body]"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$detail:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 96
    .end local v1    # "emailShareBody":Ljava/lang/String;
    :cond_5
    const-string v6, "text/plain"

    invoke-virtual {v4, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    const-string v6, "android.intent.extra.SUBJECT"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$shareSubject:Ljava/lang/String;

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    const-string v6, "android.intent.extra.TEXT"

    iget-object v7, p0, Lcom/aetn/history/android/historyhere/utils/ShareUtils$1;->val$shareBody:Ljava/lang/String;

    invoke-virtual {v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0
.end method
