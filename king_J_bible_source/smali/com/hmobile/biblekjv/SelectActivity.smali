.class public Lcom/hmobile/biblekjv/SelectActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "SelectActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;,
        Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;,
        Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;,
        Lcom/hmobile/biblekjv/SelectActivity$loadView;
    }
.end annotation


# instance fields
.field adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

.field book_id:I

.field chap_id:I

.field grid:Landroid/widget/GridView;

.field isBookView:Z

.field isChapterView:Z

.field isVerseView:Z

.field lstBook:Landroid/widget/ListView;

.field lstadapter:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

.field private tabView:Lcom/hmobile/tab/TabView;

.field title:Ljava/lang/String;

.field txtTitle:Landroid/widget/TextView;

.field verse_id:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 28
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity;->adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    .line 34
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isBookView:Z

    .line 35
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    .line 36
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    .line 37
    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    .line 38
    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    .line 39
    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    .line 28
    return-void
.end method


# virtual methods
.method public loadviewForBook()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 109
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setVisibility(I)V

    .line 110
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstBook:Landroid/widget/ListView;

    invoke-virtual {v1, v4}, Landroid/widget/ListView;->setVisibility(I)V

    .line 111
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getBookList()Ljava/util/ArrayList;

    move-result-object v0

    .line 112
    .local v0, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    new-instance v1, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;-><init>(Lcom/hmobile/biblekjv/SelectActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstadapter:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    .line 113
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstBook:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstadapter:Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 115
    iget v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-static {v1}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    .line 116
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->txtTitle:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isBookView:Z

    .line 118
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    .line 119
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    .line 121
    return-void
.end method

.method public loadviewForChapter(I)V
    .locals 5
    .param p1, "book_id"    # I

    .prologue
    const/4 v4, 0x0

    .line 124
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    invoke-virtual {v1, v4}, Landroid/widget/GridView;->setVisibility(I)V

    .line 125
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstBook:Landroid/widget/ListView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 126
    int-to-long v2, p1

    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getTotalChapterCountBybookid(J)I

    move-result v0

    .line 127
    .local v0, "size":I
    new-instance v1, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;-><init>(Lcom/hmobile/biblekjv/SelectActivity;I)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    .line 128
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    .line 131
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 130
    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 130
    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    .line 132
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->txtTitle:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isBookView:Z

    .line 134
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    .line 135
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    .line 137
    return-void
.end method

.method public loadviewForVerse(II)V
    .locals 5
    .param p1, "book_id"    # I
    .param p2, "chap_id"    # I

    .prologue
    const/4 v4, 0x0

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 140
    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 140
    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    .line 142
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->txtTitle:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    invoke-virtual {v1, v4}, Landroid/widget/GridView;->setVisibility(I)V

    .line 145
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstBook:Landroid/widget/ListView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 146
    invoke-static {p1, p2}, Lcom/hmobile/model/BookInfo;->getVerseCountByBookAndChapId(II)I

    move-result v0

    .line 147
    .local v0, "size":I
    new-instance v1, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;-><init>(Lcom/hmobile/biblekjv/SelectActivity;I)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    .line 148
    iget-object v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->adapter:Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 150
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isBookView:Z

    .line 151
    iput-boolean v4, p0, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    .line 152
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    .line 153
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 51
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    new-instance v1, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 53
    .local v1, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v2, "main"

    invoke-virtual {v1, v2}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 54
    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v3, 0x7f03002c

    invoke-virtual {v2, v3}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 55
    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->tabView:Lcom/hmobile/tab/TabView;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SelectActivity;->setContentView(Landroid/view/View;)V

    .line 57
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 58
    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 59
    const v3, 0x7f070092

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v2

    .line 58
    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 60
    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v3, "/SelectBookChapterVerseActivity"

    invoke-virtual {v2, v3}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SelectActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 63
    .local v0, "b":Landroid/os/Bundle;
    if-eqz v0, :cond_2

    .line 64
    const-string v2, "book_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 65
    const-string v2, "book_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    .line 67
    :cond_0
    const-string v2, "chap_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 68
    const-string v2, "chap_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    .line 70
    :cond_1
    const-string v2, "verse_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 71
    const-string v2, "verse_id"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    .line 74
    :cond_2
    const v2, 0x7f0e00cb

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/hmobile/common/SegmentedRadioGroup;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

    .line 75
    const v2, 0x7f0e00d2

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/GridView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->grid:Landroid/widget/GridView;

    .line 76
    const v2, 0x7f0e00d1

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ListView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->lstBook:Landroid/widget/ListView;

    .line 77
    const v2, 0x7f0e00ca

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->txtTitle:Landroid/widget/TextView;

    .line 80
    iget-object v2, p0, Lcom/hmobile/biblekjv/SelectActivity;->segmentText:Lcom/hmobile/common/SegmentedRadioGroup;

    new-instance v3, Lcom/hmobile/biblekjv/SelectActivity$1;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/SelectActivity$1;-><init>(Lcom/hmobile/biblekjv/SelectActivity;)V

    invoke-virtual {v2, v3}, Lcom/hmobile/common/SegmentedRadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 101
    sget-boolean v2, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v2, :cond_3

    .line 102
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SelectActivity;->addAdView()V

    .line 106
    :goto_0
    return-void

    .line 104
    :cond_3
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SelectActivity;->hideAdView()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 157
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 158
    new-instance v0, Lcom/hmobile/biblekjv/SelectActivity$loadView;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/SelectActivity$loadView;-><init>(Lcom/hmobile/biblekjv/SelectActivity;)V

    .line 159
    .local v0, "load":Lcom/hmobile/biblekjv/SelectActivity$loadView;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/SelectActivity$loadView;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 161
    return-void
.end method
