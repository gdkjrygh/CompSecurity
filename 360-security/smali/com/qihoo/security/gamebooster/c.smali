.class public Lcom/qihoo/security/gamebooster/c;
.super Landroid/widget/BaseAdapter;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/c$d;,
        Lcom/qihoo/security/gamebooster/c$c;,
        Lcom/qihoo/security/gamebooster/c$b;,
        Lcom/qihoo/security/gamebooster/c$a;,
        Lcom/qihoo/security/gamebooster/c$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/app/Activity;

.field private d:Lcom/qihoo/security/gamebooster/g;

.field private e:Landroid/widget/PopupWindow;

.field private f:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/gamebooster/g;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    .line 57
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/c;->b:Landroid/view/LayoutInflater;

    .line 58
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    .line 59
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/c;->f:Landroid/os/Handler;

    .line 60
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/gamebooster/g;)V

    .line 61
    return-void
.end method

.method private a(ILandroid/view/View;)V
    .locals 2

    .prologue
    .line 130
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/c;->a(I)Lcom/qihoo/security/gamebooster/c$a;

    move-result-object v1

    .line 131
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/c$e;

    .line 132
    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/c$a;->a(Lcom/qihoo/security/gamebooster/c$e;)V

    .line 133
    return-void
.end method

.method private a(Landroid/view/View;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030058

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 510
    const v1, 0x7f0b0133

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 511
    const v2, 0x7f0b00f9

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 512
    invoke-virtual {v1, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTag(Ljava/lang/Object;)V

    .line 513
    invoke-virtual {v2, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTag(Ljava/lang/Object;)V

    .line 514
    invoke-virtual {v1, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 515
    invoke-virtual {v2, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 516
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 517
    new-instance v2, Landroid/widget/PopupWindow;

    const v3, 0x7f090051

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const v4, 0x7f090052

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-direct {v2, v0, v3, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v2, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    .line 519
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 520
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 521
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 522
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 523
    return-void
.end method

.method public static a(Landroid/view/View;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/high16 v5, 0x41000000    # 8.0f

    .line 182
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 183
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    .line 184
    div-int/lit8 v1, v1, 0x3

    .line 188
    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v0, v2}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    .line 189
    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v0, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v3

    .line 190
    invoke-virtual {p1, v2, v2, v2, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setPadding(IIII)V

    .line 191
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v0, v5}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v4

    sub-int v4, v1, v4

    invoke-static {v0, v5}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v5

    sub-int v5, v1, v5

    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 193
    invoke-virtual {p1, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 195
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x42200000    # 40.0f

    invoke-static {v0, v4}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    add-int/2addr v0, v1

    invoke-direct {v2, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 197
    invoke-virtual {v2, v3, v6, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 198
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 199
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/qihoo/security/locale/widget/LocaleTextView;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 2

    .prologue
    .line 216
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getState()Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg$State;->Add:Lcom/qihoo/security/gamebooster/LocalGamePkg$State;

    if-ne v0, v1, :cond_0

    .line 217
    const v0, 0x7f0c0083

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 221
    :goto_0
    return-void

    .line 220
    :cond_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Landroid/widget/LinearLayout;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p0, p1, p2}, Lcom/qihoo/security/gamebooster/c;->b(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Landroid/widget/LinearLayout;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 479
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "game_booster_show_toast"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 481
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 495
    :cond_0
    :goto_0
    return-void

    .line 484
    :cond_1
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/gamebooster/c$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/c$1;-><init>(Lcom/qihoo/security/gamebooster/c;)V

    const-string/jumbo v2, "game-booster"

    const-string/jumbo v3, ""

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 498
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->f:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/gamebooster/c$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/gamebooster/c$2;-><init>(Lcom/qihoo/security/gamebooster/c;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 506
    return-void
.end method

.method private static b(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Landroid/widget/LinearLayout;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 2

    .prologue
    .line 202
    sget-object v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-ne p2, v0, :cond_0

    .line 203
    const v0, 0x7f020086

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResourceInListView(I)V

    .line 204
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 209
    :goto_0
    return-void

    .line 206
    :cond_0
    invoke-virtual {p2}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f020044

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    .line 207
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/gamebooster/c$a;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/c$a;

    return-object v0
.end method

.method public a(Lcom/qihoo/security/gamebooster/LocalGamePkg;)V
    .locals 3

    .prologue
    .line 526
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 527
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 528
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/gamebooster/g;)V

    .line 529
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/c;->notifyDataSetChanged()V

    .line 530
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 531
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 533
    :cond_0
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/g;)V

    .line 534
    const/16 v0, 0x2b63

    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "1"

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 535
    return-void
.end method

.method public a(Lcom/qihoo/security/gamebooster/g;)V
    .locals 2

    .prologue
    .line 64
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    .line 65
    new-instance v0, Lcom/qihoo/security/gamebooster/e;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/gamebooster/e;-><init>(Ljava/util/List;)V

    .line 66
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/e;->a()Ljava/util/List;

    move-result-object v0

    .line 67
    if-nez v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    .line 75
    :goto_0
    return-void

    .line 70
    :cond_0
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/c;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 227
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    .line 229
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v2, v0, 0x3

    .line 230
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v3, v0, 0x3

    .line 232
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 233
    new-instance v4, Lcom/qihoo/security/gamebooster/c$d;

    invoke-direct {v4}, Lcom/qihoo/security/gamebooster/c$d;-><init>()V

    .line 234
    mul-int/lit8 v5, v1, 0x3

    .line 235
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v4, Lcom/qihoo/security/gamebooster/c$d;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 236
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v4, Lcom/qihoo/security/gamebooster/c$d;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 237
    add-int/lit8 v0, v5, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v4, Lcom/qihoo/security/gamebooster/c$d;->d:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 241
    :cond_0
    mul-int/lit8 v1, v2, 0x3

    .line 242
    packed-switch v3, :pswitch_data_0

    .line 261
    :cond_1
    :goto_1
    :pswitch_0
    return-void

    .line 246
    :pswitch_1
    new-instance v2, Lcom/qihoo/security/gamebooster/c$b;

    invoke-direct {v2}, Lcom/qihoo/security/gamebooster/c$b;-><init>()V

    .line 247
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/c$b;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 251
    :pswitch_2
    new-instance v2, Lcom/qihoo/security/gamebooster/c$c;

    invoke-direct {v2}, Lcom/qihoo/security/gamebooster/c$c;-><init>()V

    .line 252
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/c$c;->b:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 253
    add-int/lit8 v0, v1, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    iput-object v0, v2, Lcom/qihoo/security/gamebooster/c$c;->c:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 242
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/c;->a(I)Lcom/qihoo/security/gamebooster/c$a;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 147
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/c$a;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/c$a;->a()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f0b0132

    const v5, 0x7f0b00ac

    const v4, 0x7f0b0074

    const/4 v2, 0x0

    .line 79
    if-nez p2, :cond_0

    .line 81
    invoke-virtual {p0, p1}, Lcom/qihoo/security/gamebooster/c;->getItemViewType(I)I

    move-result v0

    .line 82
    packed-switch v0, :pswitch_data_0

    move-object v1, v2

    .line 97
    :goto_0
    new-instance v3, Lcom/qihoo/security/gamebooster/c$e;

    invoke-direct {v3, v2}, Lcom/qihoo/security/gamebooster/c$e;-><init>(Lcom/qihoo/security/gamebooster/c$1;)V

    .line 98
    const v0, 0x7f0b0109

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;Landroid/view/View;)Landroid/view/View;

    .line 99
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 100
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 101
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 103
    const v0, 0x7f0b010a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;Landroid/view/View;)Landroid/view/View;

    .line 104
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 105
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 106
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 108
    const v0, 0x7f0b010b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;Landroid/view/View;)Landroid/view/View;

    .line 109
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 110
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 111
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v3, v0}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 112
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 114
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->d(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/c;->a(Landroid/view/View;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)V

    .line 115
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->e(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/c;->a(Landroid/view/View;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)V

    .line 116
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->f(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/c;->a(Landroid/view/View;Lcom/qihoo/security/widget/ImageView/RemoteImageView;)V

    .line 117
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->d(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->e(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->f(Lcom/qihoo/security/gamebooster/c$e;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->g(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->h(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    invoke-static {v3}, Lcom/qihoo/security/gamebooster/c$e;->i(Lcom/qihoo/security/gamebooster/c$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/c;->a(ILandroid/view/View;)V

    .line 126
    return-object p2

    .line 86
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030063

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    move-object p2, v0

    .line 88
    goto/16 :goto_0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030064

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    move-object p2, v0

    .line 92
    goto/16 :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 160
    const/4 v0, 0x3

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 396
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 476
    :cond_0
    :goto_0
    return-void

    .line 401
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 402
    instance-of v2, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v2, :cond_6

    .line 403
    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 406
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 408
    :sswitch_0
    if-eqz v0, :cond_0

    .line 409
    sget-object v2, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-ne v0, v2, :cond_5

    .line 410
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 413
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/AdvDataManager;->c()Z

    move-result v0

    if-nez v0, :cond_3

    .line 414
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    const-class v3, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 415
    const-string/jumbo v2, "from_gameboost"

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 429
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 431
    :cond_2
    const/16 v0, 0x2b65

    const-string/jumbo v2, "1"

    invoke-static {v0, v2, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 417
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->d:Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 418
    if-eqz v0, :cond_0

    .line 421
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 422
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 423
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 425
    :cond_4
    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    const-class v4, Lcom/qihoo/security/gamebooster/AddGamesActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 426
    const-string/jumbo v3, "packages"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 427
    const-string/jumbo v2, "from_gameboost"

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_2

    .line 433
    :cond_5
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 434
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 435
    if-eqz v1, :cond_0

    .line 438
    const/high16 v2, 0x10200000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 439
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 440
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 441
    const/16 v1, 0x2b62

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "1"

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 443
    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/gamebooster/c;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 449
    :sswitch_1
    if-eqz v0, :cond_0

    .line 450
    const/16 v1, 0x2b70

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    .line 451
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/gamebooster/c;->a(Landroid/view/View;Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    goto/16 :goto_0

    .line 455
    :sswitch_2
    if-eqz v0, :cond_0

    .line 456
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/c;->a(Lcom/qihoo/security/gamebooster/LocalGamePkg;)V

    goto/16 :goto_0

    .line 460
    :sswitch_3
    if-eqz v0, :cond_0

    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 462
    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.DELETE"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 464
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/c;->c:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 467
    :goto_4
    const/16 v1, 0x2b64

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "1"

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 469
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 470
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/c;->e:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto/16 :goto_0

    .line 465
    :catch_0
    move-exception v1

    goto :goto_4

    :cond_6
    move-object v0, v1

    goto/16 :goto_1

    .line 406
    :sswitch_data_0
    .sparse-switch
        0x7f0b0074 -> :sswitch_0
        0x7f0b00f9 -> :sswitch_3
        0x7f0b0132 -> :sswitch_1
        0x7f0b0133 -> :sswitch_2
    .end sparse-switch
.end method
