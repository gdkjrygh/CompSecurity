.class public Lkik/android/widget/GifSearchFragment;
.super Lkik/android/widget/GifWidgetFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/GifSearchFragment$1;,
        Lkik/android/widget/GifSearchFragment$b;,
        Lkik/android/widget/GifSearchFragment$a;
    }
.end annotation


# instance fields
.field protected _emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0114
    .end annotation
.end field

.field protected _gifAttributionBar:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01c9
    .end annotation
.end field

.field protected _gifsCantLoad:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e012a
    .end annotation
.end field

.field protected _gifsHintBar:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e011a
    .end annotation
.end field

.field protected _gifsHintBarClose:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e011b
    .end annotation
.end field

.field protected _noSearchResults:Landroid/widget/RelativeLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e012b
    .end annotation
.end field

.field protected _noSearchResultsText:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e012d
    .end annotation
.end field

.field protected _resultGridView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0115
    .end annotation
.end field

.field protected _searchBar:Landroid/widget/RelativeLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0117
    .end annotation
.end field

.field protected _searchCancel:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0119
    .end annotation
.end field

.field protected _searchEditText:Lkik/android/widget/RobotoEditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0118
    .end annotation
.end field

.field protected _searchResultsLoading:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0116
    .end annotation
.end field

.field private d:Landroid/content/SharedPreferences;

.field private e:Z

.field private f:Lcom/kik/g/p;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Lkik/android/widget/GifWidgetFragment;-><init>()V

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/GifSearchFragment;->e:Z

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    .line 535
    return-void
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;I)I
    .locals 0

    .prologue
    .line 57
    iput p1, p0, Lkik/android/widget/GifSearchFragment;->j:I

    return p1
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lkik/android/widget/GifSearchFragment;->b(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    invoke-static {p0}, Lkik/android/widget/GifSearchFragment;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .prologue
    .line 321
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 323
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 325
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 326
    new-instance v4, Lkik/android/gifs/a/a;

    const-string v5, "key"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "value"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lkik/android/gifs/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 329
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 332
    :cond_0
    return-object v1
.end method

.method private a(Ljava/util/List;Lkik/android/widget/as;)V
    .locals 3

    .prologue
    .line 373
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lkik/android/widget/as;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 374
    invoke-virtual {p2}, Lkik/android/widget/as;->e()Ljava/util/List;

    move-result-object v1

    .line 375
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/a;

    .line 376
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 378
    :cond_0
    invoke-virtual {p2}, Lkik/android/widget/as;->d()V

    .line 380
    :cond_1
    sget v0, Lkik/android/widget/GifWidget$a;->c:I

    invoke-virtual {p0, v0}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 381
    return-void
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 57
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lkik/android/widget/GifSearchFragment;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    const-string v3, "GIF End Search"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    :goto_2
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Result Count"

    int-to-long v2, p2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;Ljava/util/List;Lkik/android/widget/as;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Lkik/android/widget/GifSearchFragment;->a(Ljava/util/List;Lkik/android/widget/as;)V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/GifSearchFragment;Z)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    return-void
.end method

.method private a(Lkik/android/widget/as;)V
    .locals 4

    .prologue
    .line 257
    sget v0, Lkik/android/widget/GifWidget$a;->e:I

    invoke-virtual {p0, v0}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 260
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    const-string v1, "TIMER_CACHE"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 261
    invoke-direct {p0}, Lkik/android/widget/GifSearchFragment;->j()Ljava/util/List;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_1

    .line 263
    invoke-direct {p0, v0, p1}, Lkik/android/widget/GifSearchFragment;->a(Ljava/util/List;Lkik/android/widget/as;)V

    .line 296
    :goto_1
    return-void

    .line 260
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 269
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->h()Lkik/android/gifs/a/b;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/gifs/a/b;->a(Ljava/util/Locale;)Lcom/kik/g/p;

    move-result-object v0

    .line 270
    new-instance v1, Lkik/android/widget/bj;

    invoke-direct {v1, p0, p1}, Lkik/android/widget/bj;-><init>(Lkik/android/widget/GifSearchFragment;Lkik/android/widget/as;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/widget/GifSearchFragment;I)I
    .locals 0

    .prologue
    .line 57
    iput p1, p0, Lkik/android/widget/GifSearchFragment;->i:I

    return p1
.end method

.method private b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 469
    invoke-direct {p0}, Lkik/android/widget/GifSearchFragment;->k()V

    .line 470
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 472
    sget v0, Lkik/android/widget/GifWidget$a;->e:I

    invoke-virtual {p0, v0}, Lkik/android/widget/GifSearchFragment;->a(I)V

    .line 473
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->a()Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    check-cast v0, Lkik/android/widget/au;

    invoke-virtual {p0, p1, v0}, Lkik/android/widget/GifSearchFragment;->a(Ljava/lang/String;Lkik/android/widget/au;)Lcom/kik/g/p;

    move-result-object v0

    const-wide/16 v2, 0x1388

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->f:Lcom/kik/g/p;

    .line 474
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->f:Lcom/kik/g/p;

    new-instance v2, Lkik/android/widget/bk;

    invoke-direct {v2, p0, p1, v1}, Lkik/android/widget/bk;-><init>(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;Lcom/kik/g/p;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 501
    return-object v1
.end method

.method private static b(Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 300
    if-nez p0, :cond_0

    .line 301
    const-string v0, ""

    .line 316
    :goto_0
    return-object v0

    .line 304
    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 305
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/a;

    .line 307
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 308
    const-string v4, "key"

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    const-string v4, "value"

    invoke-virtual {v0}, Lkik/android/gifs/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 310
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 315
    :catch_0
    move-exception v0

    goto :goto_1

    .line 316
    :cond_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    return-void
.end method

.method static synthetic b(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    const-string v3, "GIF Begin Search"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/widget/GifSearchFragment;Ljava/lang/String;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    const-string v3, "GIF Emoji Search"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Result Count"

    int-to-long v2, p2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/widget/GifSearchFragment;Z)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lkik/android/widget/GifSearchFragment;->c(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    .line 506
    if-nez p1, :cond_1

    .line 507
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifsHintBar:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 509
    :cond_1
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    const-string v1, "GIF_HINT_BAR_KEY"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 510
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_gifsHintBar:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    return-void
.end method

.method private c(Z)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x7d

    .line 642
    iget v0, p0, Lkik/android/widget/GifSearchFragment;->j:I

    sget v1, Lkik/android/widget/GifSearchFragment$a;->a:I

    if-ne v0, v1, :cond_0

    if-nez p1, :cond_1

    :cond_0
    iget v0, p0, Lkik/android/widget/GifSearchFragment;->j:I

    sget v1, Lkik/android/widget/GifSearchFragment$a;->b:I

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_2

    .line 668
    :cond_1
    :goto_0
    return-void

    .line 646
    :cond_2
    new-instance v0, Lkik/android/widget/bb;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/bb;-><init>(Lkik/android/widget/GifSearchFragment;Z)V

    .line 660
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 661
    if-eqz p1, :cond_3

    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    .line 662
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 663
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0

    .line 666
    :cond_3
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/widget/GifSearchFragment;Z)Z
    .locals 0

    .prologue
    .line 57
    iput-boolean p1, p0, Lkik/android/widget/GifSearchFragment;->e:Z

    return p1
.end method

.method static synthetic d(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    return-void
.end method

.method private d(Z)V
    .locals 4

    .prologue
    const-wide/16 v2, 0xc8

    .line 676
    iget v0, p0, Lkik/android/widget/GifSearchFragment;->i:I

    sget v1, Lkik/android/widget/GifSearchFragment$a;->a:I

    if-ne v0, v1, :cond_0

    if-nez p1, :cond_1

    :cond_0
    iget v0, p0, Lkik/android/widget/GifSearchFragment;->i:I

    sget v1, Lkik/android/widget/GifSearchFragment$a;->b:I

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_2

    .line 701
    :cond_1
    :goto_0
    return-void

    .line 680
    :cond_2
    new-instance v0, Lkik/android/widget/bc;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/bc;-><init>(Lkik/android/widget/GifSearchFragment;Z)V

    .line 694
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 695
    if-eqz p1, :cond_3

    .line 696
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0

    .line 699
    :cond_3
    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/GifSearchFragment;->_searchBar:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Lkik/android/widget/GifSearchFragment;->k()V

    return-void
.end method

.method static synthetic f(Lkik/android/widget/GifSearchFragment;)Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lkik/android/widget/GifSearchFragment;->e:Z

    return v0
.end method

.method static synthetic g(Lkik/android/widget/GifSearchFragment;)V
    .locals 0

    .prologue
    .line 57
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    return-void
.end method

.method static synthetic h(Lkik/android/widget/GifSearchFragment;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic i(Lkik/android/widget/GifSearchFragment;)Ljava/util/List;
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Lkik/android/widget/GifSearchFragment;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private j()Ljava/util/List;
    .locals 3

    .prologue
    .line 342
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    const-string v1, "EMOJI_CACHE"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 343
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 344
    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 346
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic j(Lkik/android/widget/GifSearchFragment;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 579
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->f:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->f:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 582
    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->h()Lkik/android/gifs/a/b;

    move-result-object v0

    const-string v1, "GIF_RESULT_KEY"

    invoke-virtual {v0, v1}, Lkik/android/gifs/a/b;->a(Ljava/lang/String;)V

    .line 583
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 3

    .prologue
    .line 607
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 608
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->i()I

    move-result v1

    sget v2, Lkik/android/widget/GifWidget$a;->g:I

    if-ne v1, v2, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 609
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-virtual {v0}, Lkik/android/widget/AutoResizeRecyclerGridView;->a()Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    check-cast v0, Lkik/android/widget/as;

    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/as;)V

    .line 614
    :cond_0
    :goto_0
    return-void

    .line 611
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->i()I

    move-result v1

    sget v2, Lkik/android/widget/GifWidget$a;->g:I

    if-ne v1, v2, :cond_0

    .line 612
    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->b(Ljava/lang/String;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method protected final a(I)V
    .locals 7

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x3

    const/4 v6, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 413
    invoke-super {p0, p1}, Lkik/android/widget/GifWidgetFragment;->a(I)V

    .line 414
    sget-object v0, Lkik/android/widget/GifSearchFragment$1;->a:[I

    add-int/lit8 v3, p1, -0x1

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    .line 454
    :cond_0
    :goto_0
    return-void

    .line 416
    :pswitch_0
    new-array v0, v5, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    aput-object v3, v0, v1

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    aput-object v3, v0, v6

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    aput-object v3, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 417
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 418
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 419
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 420
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 421
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->c(Z)V

    .line 423
    :cond_1
    iput-boolean v2, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    goto :goto_0

    .line 426
    :pswitch_1
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v0, v1

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    aput-object v3, v0, v6

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    aput-object v3, v0, v4

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    aput-object v3, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 427
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 428
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 429
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0

    .line 432
    :pswitch_2
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v0, v1

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    aput-object v3, v0, v6

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    aput-object v3, v0, v4

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    aput-object v3, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 433
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 434
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 435
    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 436
    iput-boolean v2, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    goto/16 :goto_0

    .line 439
    :pswitch_3
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    aput-object v3, v0, v1

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    aput-object v3, v0, v6

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    aput-object v3, v0, v4

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    aput-object v3, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 440
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-static {v0}, Lkik/android/widget/GifSearchFragment;->a(Landroid/support/v7/widget/RecyclerView;)V

    .line 441
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 442
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 443
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 444
    iput-boolean v2, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    goto/16 :goto_0

    .line 447
    :pswitch_4
    const/4 v0, 0x5

    new-array v0, v0, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    aput-object v3, v0, v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_searchResultsLoading:Landroid/widget/ProgressBar;

    aput-object v3, v0, v1

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_noSearchResults:Landroid/widget/RelativeLayout;

    aput-object v3, v0, v6

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    aput-object v3, v0, v4

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifAttributionBar:Landroid/widget/ImageView;

    aput-object v3, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 448
    invoke-direct {p0, v1}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 449
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 450
    new-array v0, v1, [Landroid/view/View;

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_gifsCantLoad:Landroid/widget/LinearLayout;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 451
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lkik/android/widget/GifSearchFragment;->h:Z

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    const-string v4, "GIF Search Failed"

    invoke-virtual {v0, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Is Maximized"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v4, v5, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v4, "Is Landscape"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v5, v5, Landroid/content/res/Configuration;->orientation:I

    if-ne v5, v6, :cond_3

    :goto_2
    invoke-virtual {v0, v4, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Network Is Connected"

    iget-object v2, p0, Lkik/android/widget/GifSearchFragment;->a:Lkik/a/e/f;

    invoke-interface {v2}, Lkik/a/e/f;->k()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    .line 414
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method protected final a(Lkik/android/gifs/a/f;ILjava/lang/String;)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 526
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 527
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    invoke-virtual {v0}, Lkik/android/widget/RobotoEditText;->clearFocus()V

    .line 528
    invoke-virtual {p1}, Lkik/android/gifs/a/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->b:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->e()Lcom/kik/android/a;

    move-result-object v0

    const-string v5, "GIF Previewed"

    invoke-virtual {v0, v5}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Is Maximized"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v5, v6, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v5, "Is Landscape"

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_2

    :goto_1
    invoke-virtual {v0, v5, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Index"

    int-to-long v6, p2

    invoke-virtual {v0, v1, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {v0, v1, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 529
    :cond_0
    invoke-super {p0, p1, p2, v3}, Lkik/android/widget/GifWidgetFragment;->a(Lkik/android/gifs/a/f;ILjava/lang/String;)V

    .line 530
    return-void

    :cond_1
    move v0, v2

    .line 528
    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 619
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoEditText;->setText(Ljava/lang/CharSequence;)V

    .line 620
    return-void
.end method

.method protected final c()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 625
    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 626
    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->c(Z)V

    .line 627
    return-void
.end method

.method public cancelSearchText()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e0119
        }
    .end annotation

    .prologue
    .line 459
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoEditText;->setText(Ljava/lang/CharSequence;)V

    .line 460
    return-void
.end method

.method protected final d()V
    .locals 1

    .prologue
    .line 632
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->c(Z)V

    .line 633
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .prologue
    const/4 v0, 0x2

    .line 709
    invoke-super {p0, p1}, Lkik/android/widget/GifWidgetFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 711
    iget v1, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    move v1, v0

    .line 713
    :goto_0
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->b()Landroid/support/v7/widget/RecyclerView$i;

    move-result-object v0

    .line 714
    instance-of v2, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    if-eqz v2, :cond_0

    .line 715
    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(I)V

    .line 717
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->d(Z)V

    .line 718
    return-void

    :cond_1
    move v1, v0

    .line 711
    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 96
    invoke-super {p0, p1, p2, p3}, Lkik/android/widget/GifWidgetFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 97
    const v0, 0x7f03004c

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    .line 98
    invoke-static {p0, v7}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 99
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    const-string v1, "kik.gifs"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    .line 100
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0d0017

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 108
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d000c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 109
    new-instance v3, Landroid/widget/Space;

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 110
    new-instance v4, Landroid/widget/Space;

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/Space;-><init>(Landroid/content/Context;)V

    .line 111
    invoke-virtual {v3, v0}, Landroid/widget/Space;->setMinimumHeight(I)V

    .line 112
    invoke-virtual {v4, v2}, Landroid/widget/Space;->setMinimumHeight(I)V

    .line 115
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x2

    move v6, v0

    .line 116
    :goto_0
    new-instance v0, Lkik/android/widget/au;

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->c:Lcom/kik/l/ab;

    iget-object v4, p0, Lkik/android/widget/GifSearchFragment;->b:Lcom/kik/android/a;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lkik/android/widget/au;-><init>(Ljava/util/List;Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;Lkik/android/widget/by;)V

    .line 117
    new-instance v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-direct {v2, v6}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>(I)V

    .line 118
    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$i;)V

    .line 119
    iget-object v3, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$a;)V

    .line 120
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Lkik/android/widget/ba;

    invoke-direct {v3, p0}, Lkik/android/widget/ba;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$g;)V

    .line 133
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_resultGridView:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Lkik/android/widget/bd;

    invoke-direct {v3, p0, v1, v2}, Lkik/android/widget/bd;-><init>(Lkik/android/widget/GifSearchFragment;Ljava/util/List;Landroid/support/v7/widget/StaggeredGridLayoutManager;)V

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/RecyclerView$k;)V

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    new-instance v2, Lkik/android/widget/as;

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->g()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lkik/android/widget/GifSearchFragment$b;

    invoke-direct {v4, p0}, Lkik/android/widget/GifSearchFragment$b;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-direct {v2, v0, v3, v4}, Lkik/android/widget/as;-><init>(Ljava/util/List;Landroid/content/Context;Lkik/android/widget/GifSearchFragment$b;)V

    .line 164
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-virtual {v0, v2}, Lkik/android/widget/AutoResizeRecyclerGridView;->a(Landroid/support/v7/widget/RecyclerView$a;)V

    .line 165
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    new-instance v3, Lkik/android/widget/be;

    invoke-direct {v3, p0}, Lkik/android/widget/be;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v0, v3}, Lkik/android/widget/AutoResizeRecyclerGridView;->a(Landroid/support/v7/widget/RecyclerView$k;)V

    .line 186
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/as;)V

    .line 189
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    new-instance v2, Lkik/android/widget/bf;

    invoke-direct {v2, p0}, Lkik/android/widget/bf;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v0, v2}, Lkik/android/widget/RobotoEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 216
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    new-instance v2, Lkik/android/widget/bg;

    invoke-direct {v2, p0, v1}, Lkik/android/widget/bg;-><init>(Lkik/android/widget/GifSearchFragment;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lkik/android/widget/RobotoEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 227
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    new-instance v1, Lkik/android/widget/bh;

    invoke-direct {v1, p0}, Lkik/android/widget/bh;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 236
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_searchEditText:Lkik/android/widget/RobotoEditText;

    new-instance v1, Lkik/android/widget/bi;

    invoke-direct {v1, p0}, Lkik/android/widget/bi;-><init>(Lkik/android/widget/GifSearchFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoEditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    return-object v7

    .line 115
    :cond_0
    const/4 v0, 0x3

    move v6, v0

    goto/16 :goto_0
.end method

.method public onHiddenChanged(Z)V
    .locals 2

    .prologue
    .line 391
    invoke-super {p0, p1}, Lkik/android/widget/GifWidgetFragment;->onHiddenChanged(Z)V

    .line 392
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->i()I

    move-result v0

    sget v1, Lkik/android/widget/GifWidget$a;->g:I

    if-ne v0, v1, :cond_0

    .line 393
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->_emojiGridView:Lkik/android/widget/AutoResizeRecyclerGridView;

    invoke-virtual {v0}, Lkik/android/widget/AutoResizeRecyclerGridView;->a()Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    check-cast v0, Lkik/android/widget/as;

    invoke-direct {p0, v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/as;)V

    .line 395
    :cond_0
    return-void
.end method

.method public onHintCloseClicked()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e011b
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 600
    invoke-direct {p0, v2}, Lkik/android/widget/GifSearchFragment;->b(Z)V

    .line 601
    iget-object v0, p0, Lkik/android/widget/GifSearchFragment;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "GIF_HINT_BAR_KEY"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 602
    return-void
.end method

.method public onNoResultsClicked()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e012b
        }
    .end annotation

    .prologue
    .line 588
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    .line 589
    return-void
.end method

.method public onResultsErrorClicked()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e012a
        }
    .end annotation

    .prologue
    .line 594
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->W()V

    .line 595
    return-void
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 403
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 404
    invoke-virtual {p0}, Lkik/android/widget/GifSearchFragment;->f()Lkik/android/chat/fragment/KikChatFragment$d;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->b()V

    .line 405
    const/4 v0, 0x1

    .line 407
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lkik/android/widget/GifWidgetFragment;->v()Z

    move-result v0

    goto :goto_0
.end method
