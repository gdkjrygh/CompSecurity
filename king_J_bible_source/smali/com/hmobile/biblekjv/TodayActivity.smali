.class public Lcom/hmobile/biblekjv/TodayActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "TodayActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/TodayActivity$LoadToday;,
        Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;
    }
.end annotation


# instance fields
.field final SEARCH_ACTVITY:I

.field Todaybook:Lcom/hmobile/model/BookInfo;

.field book_count:I

.field bookname:Ljava/lang/String;

.field private btnLastReadChapter:Landroid/widget/Button;

.field private btnReadBookOfDay:Landroid/widget/Button;

.field private btnShareTodayVerse:Landroid/widget/Button;

.field chap_count:I

.field editor:Landroid/content/SharedPreferences$Editor;

.field private edtSearch:Landroid/widget/AutoCompleteTextView;

.field private imgCancelSearch:Landroid/widget/ImageView;

.field private imgRefresh:Landroid/widget/ImageView;

.field private imgSearch:Landroid/widget/ImageView;

.field private imgSearchText:Landroid/widget/ImageView;

.field private llSearch:Landroid/widget/RelativeLayout;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field m_strings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field m_tempstrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field settings:Landroid/content/SharedPreferences;

.field private tabView:Lcom/hmobile/tab/TabView;

.field todayverse:Lcom/hmobile/model/TodayVerseInfo;

.field private txtBookInfo:Landroid/widget/TextView;

.field private txtLastRead:Landroid/widget/TextView;

.field private txtTitleBook:Landroid/widget/TextView;

.field private txtTitleVerse:Landroid/widget/TextView;

.field private txtToday:Landroid/widget/TextView;

.field private txtTodayBook:Landroid/widget/TextView;

.field private txtTodayVerse:Landroid/widget/TextView;

.field verse_id:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 51
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 59
    const/4 v0, 0x2

    iput v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->SEARCH_ACTVITY:I

    .line 68
    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->book_count:I

    .line 69
    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->chap_count:I

    .line 70
    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->verse_id:I

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_tempstrings:Ljava/util/ArrayList;

    .line 51
    return-void
.end method

.method private LoadDatabaseTodayInfo(Lcom/hmobile/model/TodayInfo;)V
    .locals 3
    .param p1, "info"    # Lcom/hmobile/model/TodayInfo;

    .prologue
    .line 437
    .line 438
    iget-object v0, p1, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-static {v0, v1}, Lcom/hmobile/model/TodayVerseInfo;->getVerseInfoByVerse(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Lcom/hmobile/model/TodayVerseInfo;

    move-result-object v0

    .line 437
    iput-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    .line 439
    iget-object v0, p1, Lcom/hmobile/model/TodayInfo;->BookName:Ljava/lang/String;

    invoke-static {v0}, Lcom/hmobile/model/BookInfo;->getBookByBookName(Ljava/lang/String;)Lcom/hmobile/model/BookInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    .line 441
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget-object v1, v1, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 444
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 443
    invoke-static {v0}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->bookname:Ljava/lang/String;

    .line 445
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtBookInfo:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->bookname:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 446
    iget-object v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v2, v2, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v2, v2, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 445
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    if-eqz v0, :cond_1

    .line 449
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    iget-object v1, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    :cond_1
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->hideProgress()V

    .line 451
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtBookInfo:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/AutoCompleteTextView;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    return-object v0
.end method

.method static synthetic access$4(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$5(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    return-object v0
.end method

.method private getTodayInfo()Lcom/hmobile/model/TodayInfo;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 422
    new-instance v0, Lcom/hmobile/model/TodayInfo;

    invoke-direct {v0}, Lcom/hmobile/model/TodayInfo;-><init>()V

    .line 423
    .local v0, "info":Lcom/hmobile/model/TodayInfo;
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "TodayVerse"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    .line 424
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "BookName"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/model/TodayInfo;->BookName:Ljava/lang/String;

    .line 425
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "TodayDate"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    .line 426
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "BookCount"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/hmobile/model/TodayInfo;->BookCount:I

    .line 427
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "ChapterCount"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/hmobile/model/TodayInfo;->ChapterCount:I

    .line 428
    iget-object v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v2, "VerseCount"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/hmobile/model/TodayInfo;->VerseCount:I

    .line 429
    iget-object v1, v0, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 430
    iget-object v1, v0, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 431
    :cond_0
    const/4 v0, 0x0

    .line 433
    .end local v0    # "info":Lcom/hmobile/model/TodayInfo;
    :cond_1
    return-object v0
.end method


# virtual methods
.method public LoadAutoText()V
    .locals 10

    .prologue
    .line 498
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getBookList()Ljava/util/ArrayList;

    move-result-object v4

    .line 499
    .local v4, "m_books":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 513
    new-instance v0, Landroid/widget/ArrayAdapter;

    .line 515
    const v6, 0x109000a

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    .line 513
    invoke-direct {v0, p0, v6, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 516
    .local v0, "adapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ALL_Book====>"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 517
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 518
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v6, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 519
    return-void

    .line 499
    .end local v0    # "adapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/BookInfo;

    .line 500
    .local v1, "bookInfo":Lcom/hmobile/model/BookInfo;
    invoke-virtual {v1}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/hmobile/model/BookInfo;->getTotalChapterCountBybookid(J)I

    move-result v2

    .line 501
    .local v2, "count":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v2, :cond_0

    .line 502
    iget-object v7, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 503
    iget-object v7, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    const-string v8, "\n"

    const-string v9, ""

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 504
    .local v5, "str":Ljava/lang/String;
    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_tempstrings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "###"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .end local v5    # "str":Ljava/lang/String;
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 507
    :cond_2
    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->m_tempstrings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "###"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public loadTodayVerse()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 390
    const v8, 0x7f0700e6

    invoke-virtual {p0, v8}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/hmobile/biblekjv/TodayActivity;->showProgress(Ljava/lang/String;)V

    .line 391
    invoke-direct {p0}, Lcom/hmobile/biblekjv/TodayActivity;->getTodayInfo()Lcom/hmobile/model/TodayInfo;

    move-result-object v5

    .line 392
    .local v5, "info":Lcom/hmobile/model/TodayInfo;
    if-eqz v5, :cond_1

    .line 394
    :try_start_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 395
    .local v0, "d":Ljava/util/Date;
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v8, "MM/dd/yyyy"

    invoke-direct {v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 397
    .local v7, "sdf":Ljava/text/SimpleDateFormat;
    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 398
    .local v4, "dt":Ljava/lang/String;
    invoke-virtual {v7, v4}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 400
    .local v1, "date1":Ljava/util/Date;
    iget-object v8, v5, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    invoke-static {v8}, Ljava/util/Date;->parse(Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 404
    .local v3, "date2str":Ljava/lang/String;
    invoke-virtual {v7, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 405
    .local v2, "date2":Ljava/util/Date;
    invoke-virtual {v1, v2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v8

    if-nez v8, :cond_0

    .line 406
    invoke-direct {p0, v5}, Lcom/hmobile/biblekjv/TodayActivity;->LoadDatabaseTodayInfo(Lcom/hmobile/model/TodayInfo;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    .end local v0    # "d":Ljava/util/Date;
    .end local v1    # "date1":Ljava/util/Date;
    .end local v2    # "date2":Ljava/util/Date;
    .end local v3    # "date2str":Ljava/lang/String;
    .end local v4    # "dt":Ljava/lang/String;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :goto_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->LoadAutoText()V

    .line 419
    :goto_1
    return-void

    .line 408
    .restart local v0    # "d":Ljava/util/Date;
    .restart local v1    # "date1":Ljava/util/Date;
    .restart local v2    # "date2":Ljava/util/Date;
    .restart local v3    # "date2str":Ljava/lang/String;
    .restart local v4    # "dt":Ljava/lang/String;
    .restart local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_0
    :try_start_1
    new-instance v6, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;

    invoke-direct {v6, p0}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    .line 409
    .local v6, "load":Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Void;

    invoke-virtual {v6, v8}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 411
    .end local v0    # "d":Ljava/util/Date;
    .end local v1    # "date1":Ljava/util/Date;
    .end local v2    # "date2":Ljava/util/Date;
    .end local v3    # "date2str":Ljava/lang/String;
    .end local v4    # "dt":Ljava/lang/String;
    .end local v6    # "load":Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :catch_0
    move-exception v8

    goto :goto_0

    .line 416
    :cond_1
    new-instance v6, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;

    invoke-direct {v6, p0}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    .line 417
    .restart local v6    # "load":Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
    new-array v8, v9, [Ljava/lang/Void;

    invoke-virtual {v6, v8}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v3, 0x1

    .line 523
    invoke-super {p0, p1, p2, p3}, Lcom/hmobile/biblekjv/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 524
    packed-switch p1, :pswitch_data_0

    .line 544
    :cond_0
    :goto_0
    return-void

    .line 526
    :pswitch_0
    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 527
    const-string v1, "book_id"

    invoke-virtual {p3, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->book_count:I

    .line 528
    const-string v1, "chap_id"

    invoke-virtual {p3, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->chap_count:I

    .line 529
    const-string v1, "verse_id"

    invoke-virtual {p3, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/hmobile/biblekjv/TodayActivity;->verse_id:I

    .line 530
    new-instance v0, Landroid/content/Intent;

    .line 531
    const-class v1, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 530
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 532
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "book_id"

    iget v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->book_count:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 533
    const-string v1, "chap_id"

    iget v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->chap_count:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 534
    const-string v1, "verse_id"

    iget v2, p0, Lcom/hmobile/biblekjv/TodayActivity;->verse_id:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 535
    const-string v1, "search_flag"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 536
    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 537
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->finish()V

    goto :goto_0

    .line 524
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const-wide/16 v12, 0xa

    const/16 v10, 0x8

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 321
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->btnShareTodayVerse:Landroid/widget/Button;

    if-ne p1, v6, :cond_1

    .line 322
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    if-eqz v6, :cond_0

    .line 323
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/ShareActivity;

    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 324
    .local v3, "i":Landroid/content/Intent;
    new-instance v6, Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->bookname:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v7, v7, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 325
    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v7, v7, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 324
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 326
    .local v0, "book":Ljava/lang/String;
    const-string v6, "SHARETEXT"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget-object v7, v7, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    const-string v6, "book"

    invoke-virtual {v3, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 387
    .end local v0    # "book":Ljava/lang/String;
    .end local v3    # "i":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 332
    :cond_1
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->btnReadBookOfDay:Landroid/widget/Button;

    if-ne p1, v6, :cond_2

    .line 333
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getTracker()Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v6

    const-string v7, "Click"

    const-string v8, "Button"

    .line 334
    const-string v9, "Read book of day"

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    .line 333
    invoke-virtual {v6, v7, v8, v9, v10}, Lcom/google/analytics/tracking/android/Tracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 335
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 336
    .restart local v3    # "i":Landroid/content/Intent;
    const-string v6, "Book_id"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    invoke-virtual {v7}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v8

    invoke-virtual {v3, v6, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 337
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 338
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->finish()V

    goto :goto_0

    .line 339
    .end local v3    # "i":Landroid/content/Intent;
    :cond_2
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->btnLastReadChapter:Landroid/widget/Button;

    if-ne p1, v6, :cond_3

    .line 340
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v7, "last_read_book"

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 341
    .local v1, "book_id":I
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v7, "last_read_chapter"

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 342
    .local v2, "chap_id":I
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getTracker()Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v6

    const-string v7, "Click"

    const-string v8, "Button"

    .line 343
    const-string v9, "Last Read Book"

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    .line 342
    invoke-virtual {v6, v7, v8, v9, v10}, Lcom/google/analytics/tracking/android/Tracker;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 344
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 345
    .restart local v3    # "i":Landroid/content/Intent;
    const-string v6, "book_id"

    invoke-virtual {v3, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 346
    const-string v6, "chap_id"

    invoke-virtual {v3, v6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 347
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 348
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->finish()V

    goto :goto_0

    .line 349
    .end local v1    # "book_id":I
    .end local v2    # "chap_id":I
    .end local v3    # "i":Landroid/content/Intent;
    :cond_3
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgRefresh:Landroid/widget/ImageView;

    if-ne p1, v6, :cond_5

    .line 350
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->isFinishing()Z

    move-result v6

    if-nez v6, :cond_4

    .line 351
    const v6, 0x7f0700e6

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/TodayActivity;->showProgress(Ljava/lang/String;)V

    .line 353
    :cond_4
    new-instance v4, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;

    invoke-direct {v4, p0}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    .line 354
    .local v4, "load":Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
    new-array v6, v8, [Ljava/lang/Void;

    invoke-virtual {v4, v6}, Lcom/hmobile/biblekjv/TodayActivity$LoadToday;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0

    .line 355
    .end local v4    # "load":Lcom/hmobile/biblekjv/TodayActivity$LoadToday;
    :cond_5
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    if-ne p1, v6, :cond_6

    .line 356
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 357
    .restart local v3    # "i":Landroid/content/Intent;
    const-string v6, "verse_id"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v7, v7, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 358
    const-string v6, "chap_id"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v7, v7, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 359
    const-string v6, "book_id"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->todayverse:Lcom/hmobile/model/TodayVerseInfo;

    iget v7, v7, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    invoke-virtual {v3, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 360
    const-string v6, "isFromToday"

    invoke-virtual {v3, v6, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 361
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 362
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->finish()V

    goto/16 :goto_0

    .line 363
    .end local v3    # "i":Landroid/content/Intent;
    :cond_6
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    if-ne p1, v6, :cond_7

    .line 364
    new-instance v3, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 365
    .restart local v3    # "i":Landroid/content/Intent;
    const-string v6, "Book_id"

    iget-object v7, p0, Lcom/hmobile/biblekjv/TodayActivity;->Todaybook:Lcom/hmobile/model/BookInfo;

    invoke-virtual {v7}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v8

    invoke-virtual {v3, v6, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 366
    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->startActivity(Landroid/content/Intent;)V

    .line 367
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->finish()V

    goto/16 :goto_0

    .line 368
    .end local v3    # "i":Landroid/content/Intent;
    :cond_7
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    if-ne p1, v6, :cond_8

    .line 369
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 370
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v6, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 371
    :cond_8
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgCancelSearch:Landroid/widget/ImageView;

    if-ne p1, v6, :cond_9

    .line 372
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 373
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 374
    :cond_9
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearchText:Landroid/widget/ImageView;

    if-ne p1, v6, :cond_0

    .line 375
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 376
    const/4 v7, 0x3

    .line 375
    invoke-virtual {v6, v7}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 377
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v6}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-interface {v6}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v5

    .line 378
    .local v5, "word":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v9, :cond_0

    .line 379
    new-instance v3, Landroid/content/Intent;

    .line 380
    const-class v6, Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 379
    invoke-direct {v3, p0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 381
    .restart local v3    # "i":Landroid/content/Intent;
    const-string v6, "search_word"

    invoke-virtual {v3, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 382
    const/4 v6, 0x2

    invoke-virtual {p0, v3, v6}, Lcom/hmobile/biblekjv/TodayActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 383
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 384
    iget-object v6, p0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 24
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 78
    invoke-super/range {p0 .. p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    new-instance v21, Lcom/hmobile/biblekjv/TabProvider;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 80
    .local v21, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v3, "main"

    move-object/from16 v0, v21

    invoke-virtual {v0, v3}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 81
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v4, 0x7f030033

    invoke-virtual {v3, v4}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 82
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->tabView:Lcom/hmobile/tab/TabView;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->setContentView(Landroid/view/View;)V

    .line 84
    invoke-static/range {p0 .. p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 87
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 88
    const v4, 0x7f070092

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v3

    .line 87
    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 89
    invoke-static {}, Lcom/google/analytics/tracking/android/EasyTracker;->getTracker()Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v3

    const-string v4, "/TodayActivity"

    invoke-virtual {v3, v4}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lcom/google/analytics/tracking/android/GAServiceManager;->getInstance()Lcom/google/analytics/tracking/android/GAServiceManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/analytics/tracking/android/GAServiceManager;->dispatch()V

    .line 92
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->addQuickActionMenu()V

    .line 93
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->menuDialogDisplay()V

    .line 95
    invoke-static {}, Lcom/hmobile/common/NotificationCenter;->Instance()Lcom/hmobile/common/NotificationCenter;

    move-result-object v3

    .line 96
    const-string v4, "purchase"

    const-string v5, "showAdView"

    const/4 v6, 0x0

    .line 95
    move-object/from16 v0, p0

    invoke-virtual {v3, v0, v4, v5, v6}, Lcom/hmobile/common/NotificationCenter;->addObserver(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    .line 99
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    .line 101
    invoke-static {}, Lcom/hmobile/model/FavoriteInfo;->copyFavs()V

    .line 102
    invoke-static {}, Lcom/hmobile/model/BookMarkInfo;->copyBookmarks()V

    .line 104
    const v3, 0x7f0e00b6

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtToday:Landroid/widget/TextView;

    .line 105
    const v3, 0x7f0e0127

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    .line 106
    const v3, 0x7f0e012c

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtLastRead:Landroid/widget/TextView;

    .line 107
    const v3, 0x7f0e0128

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnShareTodayVerse:Landroid/widget/Button;

    .line 108
    const v3, 0x7f0e012b

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnReadBookOfDay:Landroid/widget/Button;

    .line 109
    const v3, 0x7f0e012d

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnLastReadChapter:Landroid/widget/Button;

    .line 110
    const v3, 0x7f0e012a

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    .line 111
    const v3, 0x7f0e00ad

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtBookInfo:Landroid/widget/TextView;

    .line 112
    const v3, 0x7f0e0129

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleBook:Landroid/widget/TextView;

    .line 113
    const v3, 0x7f0e0126

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleVerse:Landroid/widget/TextView;

    .line 114
    const v3, 0x7f0e002d

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    .line 115
    const v3, 0x7f0e0044

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearchText:Landroid/widget/ImageView;

    .line 116
    const v3, 0x7f0e0041

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgCancelSearch:Landroid/widget/ImageView;

    .line 117
    const v3, 0x7f0e0045

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/AutoCompleteTextView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    .line 118
    const v3, 0x7f0e0040

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;

    .line 120
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    .line 121
    const v4, 0x7f0700b7

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v19

    .line 122
    .local v19, "robotoLight":Landroid/graphics/Typeface;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    .line 123
    const v4, 0x7f0700b8

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 122
    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v20

    .line 124
    .local v20, "robotoregular":Landroid/graphics/Typeface;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    .line 125
    const v4, 0x7f0700b5

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 124
    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v18

    .line 126
    .local v18, "robotoBold":Landroid/graphics/Typeface;
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    move-object/from16 v0, v19

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    move-object/from16 v0, v19

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 129
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtToday:Landroid/widget/TextView;

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 130
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtBookInfo:Landroid/widget/TextView;

    move-object/from16 v0, v20

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleBook:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 133
    const v5, 0x7f070053

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleVerse:Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 135
    const v5, 0x7f070052

    .line 134
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtLastRead:Landroid/widget/TextView;

    const v4, 0x7f070054

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtLastRead:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->underlineText(Landroid/widget/TextView;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleBook:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->underlineText(Landroid/widget/TextView;)V

    .line 139
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTitleVerse:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->underlineText(Landroid/widget/TextView;)V

    .line 141
    const v3, 0x7f0e0125

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgRefresh:Landroid/widget/ImageView;

    .line 142
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgRefresh:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnShareTodayVerse:Landroid/widget/Button;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnReadBookOfDay:Landroid/widget/Button;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->btnLastReadChapter:Landroid/widget/Button;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayVerse:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->txtTodayBook:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgCancelSearch:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->imgSearchText:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 152
    const v4, 0x7f0700c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 153
    .local v17, "onoff":Ljava/lang/String;
    const-string v3, "on"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 154
    new-instance v10, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    .line 155
    .local v10, "async":Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Void;

    invoke-virtual {v10, v3}, Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 160
    .end local v10    # "async":Lcom/hmobile/biblekjv/TodayActivity$saveTodayVerseFromIds;
    :goto_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "isfontset"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    .line 161
    .local v12, "flag":Z
    if-nez v12, :cond_0

    .line 162
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "font_style"

    const-string v5, "robotoregular.ttf"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 163
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v4, "isfontset"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 164
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 166
    :cond_0
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    .line 167
    new-instance v4, Lcom/hmobile/biblekjv/TodayActivity$1;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/hmobile/biblekjv/TodayActivity$1;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/AutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 190
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    new-instance v4, Lcom/hmobile/biblekjv/TodayActivity$2;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/hmobile/biblekjv/TodayActivity$2;-><init>(Lcom/hmobile/biblekjv/TodayActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 223
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 224
    const/4 v4, 0x0

    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/common/MyDailyQuoteReceiver;

    move-object/from16 v0, p0

    invoke-direct {v5, v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 225
    const/high16 v6, 0x20000000

    .line 223
    invoke-static {v3, v4, v5, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    if-eqz v3, :cond_4

    const/4 v9, 0x1

    .line 226
    .local v9, "alarmUp":Z
    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "is_notification"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v14

    .line 227
    .local v14, "is_noti":Z
    if-eqz v14, :cond_2

    .line 228
    if-nez v9, :cond_2

    .line 233
    const-string v3, "In Today Application ::: "

    invoke-static {v3}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 235
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "notification_hour"

    const/16 v5, 0x8

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v13

    .line 236
    .local v13, "h":I
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/TodayActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "notification_min"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v15

    .line 238
    .local v15, "m":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v23

    .line 239
    .local v23, "updateTime":Ljava/util/Calendar;
    const/16 v3, 0xb

    move-object/from16 v0, v23

    invoke-virtual {v0, v3, v13}, Ljava/util/Calendar;->set(II)V

    .line 240
    const/16 v3, 0xc

    move-object/from16 v0, v23

    invoke-virtual {v0, v3, v15}, Ljava/util/Calendar;->set(II)V

    .line 242
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    .line 243
    .local v11, "curTime":Ljava/util/Calendar;
    move-object/from16 v0, v23

    invoke-virtual {v0, v11}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 244
    const/4 v3, 0x5

    const/4 v4, 0x1

    move-object/from16 v0, v23

    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 246
    :cond_1
    invoke-virtual/range {v23 .. v23}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 247
    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 246
    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    .line 249
    .local v22, "timeDiff":Ljava/lang/Long;
    new-instance v16, Landroid/content/Intent;

    .line 250
    const-class v3, Lcom/hmobile/common/MyDailyQuoteReceiver;

    .line 249
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 252
    .local v16, "myIntent":Landroid/content/Intent;
    const/4 v3, 0x0

    .line 253
    const/high16 v4, 0x10000000

    .line 251
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-static {v0, v3, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    .line 254
    .local v8, "pendingIntent":Landroid/app/PendingIntent;
    const-string v3, "alarm"

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/AlarmManager;

    .line 255
    .local v2, "am":Landroid/app/AlarmManager;
    invoke-virtual {v2, v8}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 256
    const/4 v3, 0x0

    .line 257
    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long/2addr v4, v6

    .line 258
    const-wide/32 v6, 0x5265c00

    .line 256
    invoke-virtual/range {v2 .. v8}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    .line 263
    .end local v2    # "am":Landroid/app/AlarmManager;
    .end local v8    # "pendingIntent":Landroid/app/PendingIntent;
    .end local v11    # "curTime":Ljava/util/Calendar;
    .end local v13    # "h":I
    .end local v15    # "m":I
    .end local v16    # "myIntent":Landroid/content/Intent;
    .end local v22    # "timeDiff":Ljava/lang/Long;
    .end local v23    # "updateTime":Ljava/util/Calendar;
    :cond_2
    return-void

    .line 157
    .end local v9    # "alarmUp":Z
    .end local v12    # "flag":Z
    .end local v14    # "is_noti":Z
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/TodayActivity;->loadTodayVerse()V

    goto/16 :goto_0

    .line 223
    .restart local v12    # "flag":Z
    :cond_4
    const/4 v9, 0x0

    goto/16 :goto_1
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 267
    sget-object v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->mService:Lcom/android/vending/billing/IInAppBillingService;

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->showAdView()V

    .line 272
    :goto_0
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 273
    return-void

    .line 270
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->hideAdView()V

    goto :goto_0
.end method

.method public showAdView()V
    .locals 1

    .prologue
    .line 312
    sget-boolean v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v0, :cond_0

    .line 313
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->addAdView()V

    .line 317
    :goto_0
    return-void

    .line 315
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->hideAdView()V

    goto :goto_0
.end method

.method public underlineText(Landroid/widget/TextView;)V
    .locals 6
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 548
    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 549
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 548
    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 550
    .local v0, "content":Landroid/text/SpannableString;
    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 551
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TodayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    .line 553
    const v3, 0x7f0700b6

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/TodayActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 552
    invoke-static {v2, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 554
    .local v1, "robotoMedium":Landroid/graphics/Typeface;
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 558
    .end local v0    # "content":Landroid/text/SpannableString;
    .end local v1    # "robotoMedium":Landroid/graphics/Typeface;
    :goto_0
    return-void

    .line 555
    :catch_0
    move-exception v2

    goto :goto_0
.end method
