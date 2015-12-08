.class public Lcom/aetn/history/android/historyhere/view/AssetVideoButton;
.super Landroid/widget/RelativeLayout;
.source "AssetVideoButton.java"


# instance fields
.field private TAG:Ljava/lang/String;

.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private assetButton:Landroid/widget/Button;

.field private assetId:Ljava/lang/String;

.field private body:Ljava/lang/String;

.field private dialog:Landroid/app/ProgressDialog;

.field private layout:Landroid/widget/RelativeLayout;

.field private mContext:Landroid/content/Context;

.field private poiId:Ljava/lang/String;

.field private poiTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private titleTextView:Landroid/widget/TextView;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "assetId"    # Ljava/lang/String;
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "type"    # Ljava/lang/String;
    .param p5, "body"    # Ljava/lang/String;
    .param p6, "poiId"    # Ljava/lang/String;
    .param p7, "poiTitle"    # Ljava/lang/String;

    .prologue
    .line 36
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    .line 37
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    const-string v3, "AssetVideoButton()"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->assetId:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->title:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->type:Ljava/lang/String;

    .line 41
    iput-object p5, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->body:Ljava/lang/String;

    .line 42
    iput-object p6, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->poiId:Ljava/lang/String;

    .line 43
    iput-object p7, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->poiTitle:Ljava/lang/String;

    .line 44
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->mContext:Landroid/content/Context;

    .line 45
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 46
    new-instance v2, Landroid/widget/RelativeLayout;

    invoke-direct {v2, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->layout:Landroid/widget/RelativeLayout;

    .line 47
    const-string v2, "layout_inflater"

    .line 48
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 49
    .local v0, "inflater":Landroid/view/LayoutInflater;
    const v2, 0x7f03001b

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->layout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 50
    .local v1, "v":Landroid/view/View;
    const v2, 0x7f0a0056

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->titleTextView:Landroid/widget/TextView;

    .line 51
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->titleTextView:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->title:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    const v2, 0x7f0a0057

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->assetButton:Landroid/widget/Button;

    .line 54
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->assetButton:Landroid/widget/Button;

    new-instance v3, Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;-><init>(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->layout:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v2}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->addView(Landroid/view/View;)V

    .line 61
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    .prologue
    .line 20
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->openContent()V

    return-void
.end method

.method private isVideo()Z
    .locals 2

    .prologue
    .line 69
    const-string v0, "video_mp4_pd_uri"

    .line 71
    .local v0, "videoType":Ljava/lang/String;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->type:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    const/4 v1, 0x1

    .line 74
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private openContent()V
    .locals 5

    .prologue
    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 109
    .local v0, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v2, "assetId"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->assetId:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string v2, "assetTitle"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->title:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const-string v2, "assetType"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->type:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    const-string v2, "poiId"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->poiId:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    const-string v2, "poiTitle"

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->poiTitle:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "openContent: *"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->body:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: *"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->type:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->isVideo()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 120
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isVideo: *"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->body:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 123
    .local v1, "videoIntent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->body:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "video/*"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 127
    .end local v1    # "videoIntent":Landroid/content/Intent;
    :cond_0
    return-void
.end method


# virtual methods
.method public hideMessageBox()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    const-string v1, "hideMessageBox"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 92
    return-void
.end method

.method public showMessageBox(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "message"    # Ljava/lang/String;

    .prologue
    .line 83
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;

    const-string v1, "showMessageBox"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->mContext:Landroid/content/Context;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-static {v0, v1, p2, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->dialog:Landroid/app/ProgressDialog;

    .line 85
    return-void
.end method
