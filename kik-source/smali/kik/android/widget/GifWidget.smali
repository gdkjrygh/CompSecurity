.class public Lkik/android/widget/GifWidget;
.super Lkik/android/chat/fragment/KikFragmentBase;
.source "SourceFile"

# interfaces
.implements Lcom/kik/h/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/GifWidget$1;,
        Lkik/android/widget/GifWidget$b;,
        Lkik/android/widget/GifWidget$a;
    }
.end annotation


# instance fields
.field protected _buttonBar:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e011f
    .end annotation
.end field

.field protected _featuredButton:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0122
    .end annotation
.end field

.field protected _featuredButtonImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0123
    .end annotation
.end field

.field protected _gifFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e011e
    .end annotation
.end field

.field protected _gifUseButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0129
    .end annotation
.end field

.field protected _gifsCantLoad:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e012a
    .end annotation
.end field

.field protected _previewImage:Lkik/android/gifs/view/AspectRatioGifView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0127
    .end annotation
.end field

.field protected _previewView:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0126
    .end annotation
.end field

.field protected _rechooseButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0128
    .end annotation
.end field

.field protected _searchButton:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0124
    .end annotation
.end field

.field protected _searchButtonImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0125
    .end annotation
.end field

.field protected _selectionView:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e011d
    .end annotation
.end field

.field protected _trendingButton:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0120
    .end annotation
.end field

.field protected _trendingButtonImage:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0121
    .end annotation
.end field

.field protected a:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContentImageLoader"
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Lkik/a/e/g;

.field private f:Lkik/android/chat/fragment/KikChatFragment$d;

.field private g:Lkik/android/gifs/a/b;

.field private h:Landroid/content/SharedPreferences;

.field private i:Ljava/util/EnumMap;

.field private j:Lkik/android/widget/bn;

.field private k:Lkik/android/widget/GifWidget$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Lkik/android/chat/fragment/KikFragmentBase;-><init>()V

    .line 304
    new-instance v0, Lkik/android/widget/bo;

    invoke-direct {v0, p0}, Lkik/android/widget/bo;-><init>(Lkik/android/widget/GifWidget;)V

    iput-object v0, p0, Lkik/android/widget/GifWidget;->k:Lkik/android/widget/GifWidget$b;

    return-void
.end method

.method static synthetic a(Lkik/android/widget/GifWidget;)Lkik/a/e/g;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/android/widget/GifWidget;->e:Lkik/a/e/g;

    return-object v0
.end method

.method private a()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 446
    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->b:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lkik/android/widget/GifWidget;->b:Lcom/kik/android/a;

    const-string v3, "GIF Tray Opened"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

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

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 452
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 447
    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/widget/GifWidget;Ljava/lang/String;ILjava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 54
    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->b:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->b:Lcom/kik/android/a;

    const-string v3, "GIF Sent"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Is Maximized"

    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment$d;->c()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget v4, v4, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    :goto_1
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Search Query"

    invoke-virtual {v0, v1, p1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Index"

    int-to-long v2, p2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {v0, v1, p3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :cond_0
    iget-object v0, p0, Lkik/android/widget/GifWidget;->g:Lkik/android/gifs/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/widget/GifWidget;->g:Lkik/android/gifs/a/b;

    invoke-virtual {v0, p3, p1, p2}, Lkik/android/gifs/a/b;->a(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/widget/GifWidget;Z)V
    .locals 2

    .prologue
    .line 54
    if-eqz p1, :cond_0

    new-instance v0, Lkik/android/widget/bs;

    invoke-direct {v0, p0}, Lkik/android/widget/bs;-><init>(Lkik/android/widget/GifWidget;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/GifWidget;->b(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/widget/GifWidget;->_gifsCantLoad:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Lkik/android/widget/bn;)V
    .locals 1

    .prologue
    .line 438
    iput-object p1, p0, Lkik/android/widget/GifWidget;->j:Lkik/android/widget/bn;

    .line 439
    if-eqz p1, :cond_0

    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$d;->a(Lkik/android/widget/bn;)V

    .line 442
    :cond_0
    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 234
    iget-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 235
    return-void
.end method

.method public final a(Lkik/a/e/g;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lkik/android/widget/GifWidget;->e:Lkik/a/e/g;

    .line 266
    invoke-direct {p0}, Lkik/android/widget/GifWidget;->a()V

    .line 267
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment$d;)V
    .locals 2

    .prologue
    .line 425
    iput-object p1, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    .line 426
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    if-nez v0, :cond_0

    .line 434
    :goto_0
    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    sget-object v1, Lkik/android/widget/bn;->c:Lkik/android/widget/bn;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GifWidgetFragment;

    .line 430
    if-eqz v0, :cond_1

    .line 431
    iget-object v1, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0, v1}, Lkik/android/widget/GifWidgetFragment;->a(Lkik/android/chat/fragment/KikChatFragment$d;)V

    .line 433
    :cond_1
    iget-object v0, p0, Lkik/android/widget/GifWidget;->j:Lkik/android/widget/bn;

    invoke-direct {p0, v0}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/bn;)V

    goto :goto_0
.end method

.method public final a(Lkik/android/chat/fragment/KikChatFragment$e;)V
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    if-nez v0, :cond_1

    .line 260
    :cond_0
    :goto_0
    return-void

    .line 244
    :cond_1
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->d:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-virtual {p1, v0}, Lkik/android/chat/fragment/KikChatFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 245
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GifWidgetFragment;

    .line 246
    invoke-virtual {v0}, Lkik/android/widget/GifWidgetFragment;->d()V

    goto :goto_1

    .line 248
    :cond_2
    invoke-virtual {p0}, Lkik/android/widget/GifWidget;->W()V

    goto :goto_0

    .line 250
    :cond_3
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->e:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-virtual {p1, v0}, Lkik/android/chat/fragment/KikChatFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 251
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GifWidgetFragment;

    .line 252
    invoke-virtual {v0}, Lkik/android/widget/GifWidgetFragment;->c()V

    goto :goto_2

    .line 255
    :cond_4
    sget-object v0, Lkik/android/chat/fragment/KikChatFragment$e;->a:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-virtual {p1, v0}, Lkik/android/chat/fragment/KikChatFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GifWidgetFragment;

    .line 257
    invoke-virtual {v0}, Lkik/android/widget/GifWidgetFragment;->b()V

    goto :goto_3
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 114
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 115
    invoke-virtual {p0}, Lkik/android/widget/GifWidget;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    .line 116
    invoke-virtual {p0}, Lkik/android/widget/GifWidget;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/GifWidget;)V

    .line 117
    iget-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/gifs/a/c;->a(Landroid/content/Context;)Lkik/android/gifs/a/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifWidget;->g:Lkik/android/gifs/a/b;

    .line 118
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 132
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikFragmentBase;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 133
    const v0, 0x7f03004e

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 134
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 135
    iget-object v0, p0, Lkik/android/widget/GifWidget;->d:Landroid/content/Context;

    const-string v2, "kik.gifs"

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/GifWidget;->h:Landroid/content/SharedPreferences;

    .line 136
    new-instance v0, Ljava/util/EnumMap;

    const-class v2, Lkik/android/widget/bn;

    invoke-direct {v0, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    .line 137
    sget-object v2, Lkik/android/widget/bn;->c:Lkik/android/widget/bn;

    invoke-direct {p0, v2}, Lkik/android/widget/GifWidget;->a(Lkik/android/widget/bn;)V

    invoke-virtual {p0}, Lkik/android/widget/GifWidget;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v0, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GifWidgetFragment;

    if-nez v0, :cond_0

    sget-object v0, Lkik/android/widget/GifWidget$1;->a:[I

    invoke-virtual {v2}, Lkik/android/widget/bn;->ordinal()I

    new-instance v0, Lkik/android/widget/GifSearchFragment;

    invoke-direct {v0}, Lkik/android/widget/GifSearchFragment;-><init>()V

    iget-object v4, p0, Lkik/android/widget/GifWidget;->k:Lkik/android/widget/GifWidget$b;

    invoke-virtual {v0, v4}, Lkik/android/widget/GifWidgetFragment;->a(Lkik/android/widget/GifWidget$b;)V

    iget-object v4, p0, Lkik/android/widget/GifWidget;->f:Lkik/android/chat/fragment/KikChatFragment$d;

    invoke-virtual {v0, v4}, Lkik/android/widget/GifWidgetFragment;->a(Lkik/android/chat/fragment/KikChatFragment$d;)V

    iget-object v4, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v4, v2, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7f0e011e

    invoke-virtual {v3, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 138
    :goto_0
    invoke-direct {p0}, Lkik/android/widget/GifWidget;->a()V

    .line 139
    return-object v1

    .line 137
    :cond_0
    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 122
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroy()V

    .line 123
    iget-object v0, p0, Lkik/android/widget/GifWidget;->g:Lkik/android/gifs/a/b;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lkik/android/widget/GifWidget;->g:Lkik/android/gifs/a/b;

    invoke-virtual {v0}, Lkik/android/gifs/a/b;->b()V

    .line 126
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 473
    invoke-super {p0}, Lkik/android/chat/fragment/KikFragmentBase;->onDestroyView()V

    .line 474
    iget-object v0, p0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    invoke-virtual {v0}, Lkik/android/gifs/view/AspectRatioGifView;->b()V

    .line 475
    iget-object v0, p0, Lkik/android/widget/GifWidget;->_previewImage:Lkik/android/gifs/view/AspectRatioGifView;

    invoke-virtual {v0}, Lkik/android/gifs/view/AspectRatioGifView;->f()V

    .line 476
    iget-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->clear()V

    .line 477
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/GifWidget;->i:Ljava/util/EnumMap;

    .line 478
    return-void
.end method
