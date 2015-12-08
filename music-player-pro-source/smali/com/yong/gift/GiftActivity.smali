.class public Lcom/yong/gift/GiftActivity;
.super Landroid/app/Activity;
.source "GiftActivity.java"


# static fields
.field public static final BASE_URL:Ljava/lang/String; = "http://moobosoft.com/giftmodule/"

.field public static final DOWNLOAD_ICON_PATH:Ljava/lang/String;

.field private static final startAnim:I = 0x0

.field private static final stopAnim:I = 0x1


# instance fields
.field private giftListView:Landroid/widget/ListView;

.field private giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;

.field private handler:Landroid/os/Handler;

.field private iv_gift_loading:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/gift/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/yong/gift/GiftActivity;->DOWNLOAD_ICON_PATH:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 57
    new-instance v0, Lcom/yong/gift/GiftActivity$1;

    invoke-direct {v0, p0}, Lcom/yong/gift/GiftActivity$1;-><init>(Lcom/yong/gift/GiftActivity;)V

    iput-object v0, p0, Lcom/yong/gift/GiftActivity;->handler:Landroid/os/Handler;

    .line 24
    return-void
.end method

.method static synthetic access$0(Lcom/yong/gift/GiftActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$1(Lcom/yong/gift/GiftActivity;)Lcom/yong/gift/GiftListViewAdapter;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/yong/gift/GiftActivity;->giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;

    return-object v0
.end method

.method private findView()V
    .locals 3

    .prologue
    .line 77
    const v0, 0x7f0d001e

    invoke-virtual {p0, v0}, Lcom/yong/gift/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/yong/gift/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;

    .line 78
    const v0, 0x7f0d001c

    invoke-virtual {p0, v0}, Lcom/yong/gift/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/yong/gift/GiftActivity;->giftListView:Landroid/widget/ListView;

    .line 79
    new-instance v0, Lcom/yong/gift/GiftListViewAdapter;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/yong/gift/GiftActivity;->giftListView:Landroid/widget/ListView;

    invoke-direct {v0, p0, v1, v2}, Lcom/yong/gift/GiftListViewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/yong/gift/GiftActivity;->giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;

    .line 80
    iget-object v0, p0, Lcom/yong/gift/GiftActivity;->giftListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/yong/gift/GiftActivity;->giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 81
    iget-object v0, p0, Lcom/yong/gift/GiftActivity;->giftListView:Landroid/widget/ListView;

    new-instance v1, Lcom/yong/gift/GiftActivity$2;

    invoke-direct {v1, p0}, Lcom/yong/gift/GiftActivity$2;-><init>(Lcom/yong/gift/GiftActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 94
    const v0, 0x7f0d001a

    invoke-virtual {p0, v0}, Lcom/yong/gift/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/yong/gift/GiftActivity$3;

    invoke-direct {v1, p0}, Lcom/yong/gift/GiftActivity$3;-><init>(Lcom/yong/gift/GiftActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 39
    invoke-virtual {p0, v3}, Lcom/yong/gift/GiftActivity;->requestWindowFeature(I)Z

    .line 40
    const v2, 0x7f030003

    invoke-virtual {p0, v2}, Lcom/yong/gift/GiftActivity;->setContentView(I)V

    .line 42
    invoke-direct {p0}, Lcom/yong/gift/GiftActivity;->findView()V

    .line 45
    iget-object v2, p0, Lcom/yong/gift/GiftActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 46
    .local v0, "msg":Landroid/os/Message;
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 47
    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 48
    iget-object v2, p0, Lcom/yong/gift/GiftActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 51
    new-instance v1, Lcom/yong/gift/NetMusicXmlParseTask;

    invoke-direct {v1, p0}, Lcom/yong/gift/NetMusicXmlParseTask;-><init>(Lcom/yong/gift/GiftActivity;)V

    .line 52
    .local v1, "task":Lcom/yong/gift/NetMusicXmlParseTask;
    new-array v2, v3, [Ljava/lang/String;

    const-string v3, "http://moobosoft.com/giftmodule/giftList.xml"

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/yong/gift/NetMusicXmlParseTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 54
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    return-void
.end method

.method public updateView(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 104
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    iget-object v1, p0, Lcom/yong/gift/GiftActivity;->giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;

    invoke-virtual {v1, p1}, Lcom/yong/gift/GiftListViewAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 105
    iget-object v1, p0, Lcom/yong/gift/GiftActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 106
    .local v0, "msg":Landroid/os/Message;
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 107
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 108
    iget-object v1, p0, Lcom/yong/gift/GiftActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 109
    return-void
.end method
