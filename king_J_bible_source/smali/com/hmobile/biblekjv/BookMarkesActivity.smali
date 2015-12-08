.class public Lcom/hmobile/biblekjv/BookMarkesActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "BookMarkesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;,
        Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;,
        Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;,
        Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;
    }
.end annotation


# instance fields
.field bookmarkAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

.field private btnBookmarks:Landroid/widget/Button;

.field private btnNotes:Landroid/widget/Button;

.field private isbookmark:Z

.field private lstBookmarks:Landroid/widget/ListView;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

.field private tabView:Lcom/hmobile/tab/TabView;

.field private txtNoBookmark:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 35
    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->bookmarkAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->isbookmark:Z

    .line 40
    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    .line 32
    return-void
.end method


# virtual methods
.method public LoadViewForBookMark()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 95
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 96
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 97
    invoke-static {}, Lcom/hmobile/model/BookMarkInfo;->getAllBookMark()Ljava/util/ArrayList;

    move-result-object v0

    .line 98
    .local v0, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookMarkInfo;>;"
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 99
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    .line 100
    new-instance v1, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->bookmarkAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    .line 101
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->bookmarkAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 107
    :goto_0
    return-void

    .line 103
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 104
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    const v2, 0x7f07005c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public LoadViewForNotes()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 110
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 112
    invoke-static {}, Lcom/hmobile/model/NotesInfo;->getAllNotes()Ljava/util/ArrayList;

    move-result-object v0

    .line 113
    .local v0, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 114
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->bookmarkAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;

    .line 115
    new-instance v1, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    .line 116
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 122
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 119
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    const v2, 0x7f0700bc

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method public getDate(JLjava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "milliSeconds"    # J
    .param p3, "format"    # Ljava/lang/String;

    .prologue
    .line 357
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 358
    .local v1, "formatter":Ljava/text/DateFormat;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 359
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 360
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 330
    invoke-super {p0, p1, p2, p3}, Lcom/hmobile/biblekjv/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 331
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 332
    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    .line 333
    invoke-static {}, Lcom/hmobile/model/NotesInfo;->getAllNotes()Ljava/util/ArrayList;

    move-result-object v0

    .line 334
    .local v0, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 335
    new-instance v1, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    invoke-direct {v1, p0, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity;Ljava/util/ArrayList;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    .line 336
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->notesAdapter:Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 340
    .end local v0    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v2, 0x7f020005

    const/4 v1, 0x0

    .line 344
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 345
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForBookMark()V

    .line 346
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 347
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 354
    :cond_0
    :goto_0
    return-void

    .line 348
    :cond_1
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 349
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForNotes()V

    .line 350
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 351
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x0

    const v4, 0x7f0700b8

    const/4 v3, 0x1

    .line 48
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    new-instance v0, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 50
    .local v0, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v1, "main"

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 51
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v2, 0x7f030006

    invoke-virtual {v1, v2}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 52
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->tabView:Lcom/hmobile/tab/TabView;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->setContentView(Landroid/view/View;)V

    .line 56
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 59
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 60
    const v2, 0x7f070092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v1

    .line 59
    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 62
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v2, "/HighLightsNotesActivity"

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 64
    const v1, 0x7f0e0061

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->lstBookmarks:Landroid/widget/ListView;

    .line 65
    const v1, 0x7f0e005e

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    .line 66
    const v1, 0x7f0e005f

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    .line 67
    const v1, 0x7f0e0062

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/BookMarkesActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->txtNoBookmark:Landroid/widget/TextView;

    .line 69
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    .line 70
    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 69
    invoke-virtual {p0, v1, v2}, Lcom/hmobile/biblekjv/BookMarkesActivity;->setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V

    .line 71
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    .line 72
    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-virtual {p0, v1, v2}, Lcom/hmobile/biblekjv/BookMarkesActivity;->setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnBookmarks:Landroid/widget/Button;

    invoke-virtual {v1, v5, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 76
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    invoke-virtual {v1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    iget-object v1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity;->btnNotes:Landroid/widget/Button;

    invoke-virtual {v1, v5, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 79
    sget-boolean v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v1, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->addAdView()V

    .line 84
    :goto_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForNotes()V

    .line 85
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->LoadViewForBookMark()V

    .line 86
    return-void

    .line 82
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/BookMarkesActivity;->hideAdView()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 90
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 92
    return-void
.end method
