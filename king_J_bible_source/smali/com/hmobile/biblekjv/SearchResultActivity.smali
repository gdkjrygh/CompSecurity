.class public Lcom/hmobile/biblekjv/SearchResultActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "SearchResultActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;,
        Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;,
        Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;,
        Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;,
        Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;,
        Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;
    }
.end annotation


# instance fields
.field adapter:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

.field chapnumber:Ljava/lang/String;

.field fromToday:Z

.field isFromAuto:Z

.field lstSearchResult:Landroid/widget/ListView;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation
.end field

.field selected_book:Ljava/lang/String;

.field spinAdapter:Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;

.field spnBook:Landroid/widget/Spinner;

.field txtNoResult:Landroid/widget/TextView;

.field txtSearchResult:Landroid/widget/TextView;

.field word:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 29
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    .line 32
    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    .line 34
    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->adapter:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    .line 37
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->fromToday:Z

    .line 44
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->isFromAuto:Z

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->selected_book:Ljava/lang/String;

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->chapnumber:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public ColorText(Landroid/widget/TextView;I)Landroid/text/SpannableString;
    .locals 5
    .param p1, "text"    # Landroid/widget/TextView;
    .param p2, "color"    # I

    .prologue
    .line 289
    const/4 v1, 0x0

    .line 290
    .local v1, "start":I
    :try_start_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 291
    iget-object v3, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 293
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 294
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 293
    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 295
    .local v0, "content":Landroid/text/SpannableString;
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    invoke-direct {v2, p2}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 296
    iget-object v3, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    const/16 v4, 0x12

    .line 295
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 297
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    .end local v0    # "content":Landroid/text/SpannableString;
    :goto_0
    return-object v0

    .line 299
    :catch_0
    move-exception v2

    .line 302
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public SearchVerse(ZLjava/lang/String;)V
    .locals 2
    .param p1, "isSearchByBook"    # Z
    .param p2, "book"    # Ljava/lang/String;

    .prologue
    .line 155
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SearchResultActivity;->showProgress()V

    .line 156
    new-instance v0, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;

    invoke-direct {v0, p0, p1, p2}, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;ZLjava/lang/String;)V

    .line 157
    .local v0, "search":Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/SearchResultActivity$SearchAsync;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 158
    return-void
.end method

.method public binddata()V
    .locals 2

    .prologue
    .line 161
    new-instance v0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->adapter:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    .line 162
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->lstSearchResult:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->adapter:Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 163
    return-void
.end method

.method public loadBook()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 139
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .local v2, "m_bookname":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v4, "All"

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getBookList()Ljava/util/ArrayList;

    move-result-object v1

    .line 142
    .local v1, "m_booklist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 150
    return-object v2

    .line 142
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookInfo;

    .line 144
    .local v0, "bookInfo":Lcom/hmobile/model/BookInfo;
    iget-object v5, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    iget-object v6, v0, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v5, v6}, Lcom/hmobile/model/VerseInfo;->getVerseByBookbySearchWord(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 145
    .local v3, "m_verses":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_0

    .line 146
    new-instance v5, Ljava/lang/StringBuilder;

    iget-object v6, v0, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "  ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 147
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 284
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SearchResultActivity;->finish()V

    .line 285
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 50
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const v2, 0x7f03002b

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity;->setContentView(I)V

    .line 55
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 56
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 57
    const v3, 0x7f070092

    invoke-virtual {p0, v3}, Lcom/hmobile/biblekjv/SearchResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v2

    .line 56
    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 58
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v3, "/SearchResultActivity"

    invoke-virtual {v2, v3}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SearchResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 61
    .local v0, "b":Landroid/os/Bundle;
    if-eqz v0, :cond_2

    .line 62
    const-string v2, "search_word"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 63
    const-string v2, "search_word"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    .line 65
    :cond_0
    const-string v2, "FromToday"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 66
    const-string v2, "FromToday"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->fromToday:Z

    .line 68
    :cond_1
    const-string v2, "isFromAuto"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 69
    const-string v2, "isFromAuto"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->isFromAuto:Z

    .line 70
    const-string v2, "BookName"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->selected_book:Ljava/lang/String;

    .line 71
    const-string v2, "ChapCount"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->chapnumber:Ljava/lang/String;

    .line 74
    :cond_2
    const v2, 0x7f0e00c7

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ListView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->lstSearchResult:Landroid/widget/ListView;

    .line 75
    const v2, 0x7f0e00c8

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->txtNoResult:Landroid/widget/TextView;

    .line 76
    const v2, 0x7f0e00c5

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->txtSearchResult:Landroid/widget/TextView;

    .line 77
    const v2, 0x7f0e00c6

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->spnBook:Landroid/widget/Spinner;

    .line 78
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->txtSearchResult:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->word:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/SearchResultActivity;->showProgress()V

    .line 81
    new-instance v1, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;

    iget-boolean v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->isFromAuto:Z

    invoke-direct {v1, p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;Z)V

    .line 82
    .local v1, "load":Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/SearchResultActivity$LoadBookAsync;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 85
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity;->spnBook:Landroid/widget/Spinner;

    new-instance v3, Lcom/hmobile/biblekjv/SearchResultActivity$1;

    invoke-direct {v3, p0}, Lcom/hmobile/biblekjv/SearchResultActivity$1;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 105
    return-void
.end method
