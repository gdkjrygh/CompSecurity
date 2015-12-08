.class public final Lcom/roidapp/cloudlib/sns/notification/b;
.super Lcom/roidapp/cloudlib/sns/main/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;
.implements Lcom/roidapp/cloudlib/sns/notification/o;


# instance fields
.field public final a:Lcom/roidapp/cloudlib/sns/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

.field private c:Landroid/widget/ListView;

.field private d:Lcom/roidapp/cloudlib/sns/b/x;

.field private e:Lcom/roidapp/cloudlib/sns/b/p;

.field private f:Lcom/roidapp/cloudlib/sns/b/a/c;

.field private g:Lcom/roidapp/cloudlib/sns/notification/f;

.field private h:Landroid/widget/ProgressBar;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:I

.field private p:Landroid/view/View;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private v:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;-><init>()V

    .line 83
    new-instance v0, Lcom/roidapp/cloudlib/sns/notification/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/notification/c;-><init>(Lcom/roidapp/cloudlib/sns/notification/b;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->a:Lcom/roidapp/cloudlib/sns/w;

    .line 80
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->x()V

    .line 81
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)Lcom/roidapp/cloudlib/sns/b/a/c;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->f:Lcom/roidapp/cloudlib/sns/b/a/c;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/b;)Z
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/b/a/c;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->f:Lcom/roidapp/cloudlib/sns/b/a/c;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/b;Lcom/roidapp/cloudlib/sns/b/a/c;)V
    .locals 2

    .prologue
    .line 56
    .line 2437
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2440
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 2441
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 2442
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-nez v0, :cond_0

    .line 2443
    new-instance v0, Lcom/roidapp/cloudlib/sns/notification/f;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    invoke-direct {v0, p0, v1, p0}, Lcom/roidapp/cloudlib/sns/notification/f;-><init>(Landroid/support/v4/app/Fragment;Landroid/widget/ListView;Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    .line 2444
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2446
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/o;)V

    .line 2447
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Ljava/util/List;)V

    .line 2448
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->notifyDataSetChanged()V

    .line 56
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->i:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 349
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Notification"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    .line 350
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Notification"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 351
    const-string v0, "Notification"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v0, :cond_1

    .line 383
    :cond_0
    :goto_0
    return-void

    .line 354
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->l:Z

    if-eqz v0, :cond_2

    .line 355
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->l:Z

    .line 356
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 357
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 358
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0, v2, v3, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 360
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-nez v0, :cond_3

    .line 361
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0, v2, v3, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 363
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method

.method private f()V
    .locals 12

    .prologue
    const/4 v3, 0x0

    const/16 v11, 0x21

    const/4 v10, 0x0

    .line 452
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    if-nez v0, :cond_1

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 454
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "event"

    const-string v2, "quickpic2015_3"

    invoke-virtual {v0, v1, v2, v10}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 456
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->q:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    if-nez v0, :cond_3

    .line 457
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    .line 458
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->n:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->q:Landroid/widget/TextView;

    .line 459
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    .line 462
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "QPicCode"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 463
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "QPicFailed"

    invoke-interface {v1, v2, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 464
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_4

    .line 466
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/cloudlib/aq;->X:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 468
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->q:Landroid/widget/TextView;

    const-string v1, "Oops, something went wrong.\nYou are almost there, try one more time."

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 469
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    const-string v1, "Try again"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 471
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 473
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_0

    .line 474
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->notifyDataSetChanged()V

    goto/16 :goto_0

    .line 476
    :cond_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 477
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 478
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_6

    .line 479
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    sget v2, Lcom/roidapp/cloudlib/aq;->X:I

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 481
    :cond_6
    const-string v1, "Your QuickPic invitation code is "

    .line 482
    const-string v2, ", 1000GB cloud storage is ready, the offer is only good for 1 day. act now! "

    .line 483
    invoke-static {}, Lcom/roidapp/cloudlib/sns/h;->a()Lcom/roidapp/cloudlib/sns/h;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v5

    invoke-static {v5}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "QPicCodeTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-interface {v5, v6, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    invoke-virtual {v3, v4, v6, v7}, Lcom/roidapp/cloudlib/sns/h;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    .line 484
    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/CharSequence;

    aput-object v1, v4, v10

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const/4 v5, 0x2

    aput-object v2, v4, v5

    const/4 v5, 0x3

    aput-object v3, v4, v5

    invoke-static {v4}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 485
    new-instance v5, Landroid/text/SpannableStringBuilder;

    invoke-direct {v5, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 487
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    const-string v6, "#384248"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v4, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x0

    invoke-virtual {v5, v4, v10, v6, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 488
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    invoke-direct {v4, v6, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x0

    invoke-virtual {v5, v4, v10, v1, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 490
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    const-string v6, "#ff5555"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v4, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v1

    invoke-virtual {v5, v4, v1, v6, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 491
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    invoke-direct {v4, v6, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v1

    invoke-virtual {v5, v4, v1, v6, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 493
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    const-string v4, "#384248"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v6

    invoke-virtual {v5, v1, v6, v4, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 494
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v7, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-direct {v1, v4, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v6

    invoke-virtual {v5, v1, v6, v2, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 496
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    const-string v4, "#8f8f8f"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v1, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v5, v1, v2, v4, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 497
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v6, Lcom/roidapp/cloudlib/ap;->l:I

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-direct {v1, v4, v10}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v5, v1, v2, v3, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 499
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->q:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 500
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    const-string v2, "Sign up"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 502
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->notifyDataSetChanged()V

    goto/16 :goto_0

    .line 511
    :cond_7
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/notification/b;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/notification/b;)Z
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/notification/f;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/notification/b;)Z
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/notification/b;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->f()V

    return-void
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/notification/b;)Lcom/roidapp/cloudlib/sns/main/a;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 303
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 304
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 305
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    const-string v1, "Notification"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 306
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    return-object v0
.end method

.method public final a(IZ)V
    .locals 3

    .prologue
    .line 338
    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 339
    iput p1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->o:I

    .line 346
    :goto_0
    return-void

    .line 342
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->o:I

    .line 343
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/notification/s;-><init>()V

    move-object v0, v1

    .line 344
    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/s;

    const-string v2, "Post"

    invoke-virtual {v0, p1, v2}, Lcom/roidapp/cloudlib/sns/notification/s;->a(ILjava/lang/String;)V

    .line 345
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 527
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_1

    .line 528
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_0

    .line 529
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/notification/f;->a(I)V

    .line 531
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->notifyDataSetChanged()V

    .line 533
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 537
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 538
    const-string v1, "Notification_Page"

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 540
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 387
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->b()V

    .line 388
    const-string v0, "Notification"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 389
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 544
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 576
    :goto_0
    return-void

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    if-nez v0, :cond_1

    .line 549
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    .line 550
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 566
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/h/h;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 572
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 573
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method

.method public final i_()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 516
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->i_()V

    .line 517
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    if-nez v0, :cond_0

    .line 523
    :goto_0
    return-void

    .line 520
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/TittleClick/Notification"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 521
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/TittleClick/Notification"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 522
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 332
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onAttach(Landroid/app/Activity;)V

    .line 333
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->o:I

    if-eqz v0, :cond_0

    .line 334
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->o:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(IZ)V

    .line 335
    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 204
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 205
    sget v1, Lcom/roidapp/cloudlib/ar;->dn:I

    if-eq v0, v1, :cond_0

    const/16 v1, 0x1001

    if-ne v0, v1, :cond_2

    .line 206
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 207
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/notification/f;->b(I)Lcom/roidapp/cloudlib/sns/b/h;

    move-result-object v0

    .line 208
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    .line 214
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v2, v3, v1, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 216
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 276
    :cond_1
    :goto_0
    return-void

    .line 218
    :cond_2
    sget v1, Lcom/roidapp/cloudlib/ar;->aQ:I

    if-ne v0, v1, :cond_3

    .line 219
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 220
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/notification/f;->b(I)Lcom/roidapp/cloudlib/sns/b/h;

    move-result-object v0

    .line 221
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/notification/b;->a(IZ)V

    goto :goto_0

    .line 224
    :cond_3
    sget v1, Lcom/roidapp/cloudlib/ar;->j:I

    if-ne v0, v1, :cond_1

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 227
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->i()V

    .line 233
    new-instance v0, Lcom/roidapp/cloudlib/sns/g;

    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/e;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/e;-><init>(Lcom/roidapp/cloudlib/sns/notification/b;)V

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/g;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 272
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 280
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->onCreate(Landroid/os/Bundle;)V

    .line 281
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    .line 283
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 284
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/roidapp/cloudlib/sns/g/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v3

    const/4 v1, 0x2

    sget-object v2, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/notification/b;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    .line 288
    :cond_0
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/notification/b;->l:Z

    .line 289
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 292
    sget v0, Lcom/roidapp/cloudlib/as;->L:I

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1400
    sget v0, Lcom/roidapp/cloudlib/ar;->cO:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->i:Landroid/widget/RelativeLayout;

    .line 1401
    sget v0, Lcom/roidapp/cloudlib/ar;->bz:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->j:Landroid/widget/TextView;

    .line 1402
    sget v0, Lcom/roidapp/cloudlib/ar;->by:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->k:Landroid/widget/ImageView;

    .line 1403
    sget v0, Lcom/roidapp/cloudlib/ar;->cm:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    .line 1404
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1405
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {p0, v0, v4, v4}, Lcom/roidapp/cloudlib/sns/notification/b;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V

    .line 1407
    sget v0, Lcom/roidapp/cloudlib/ar;->bO:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->h:Landroid/widget/ProgressBar;

    .line 1408
    sget v0, Lcom/roidapp/cloudlib/ar;->bG:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    .line 1409
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v2}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/widget/AbsListView;Landroid/view/View;Ljava/lang/Object;)V

    .line 1410
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lcom/roidapp/cloudlib/as;->Q:I

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 1411
    sget v2, Lcom/roidapp/cloudlib/ar;->bR:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    .line 1412
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->f()V

    .line 1413
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 1415
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_2

    .line 1416
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 1417
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1419
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v6}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1420
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/x;)V

    .line 1421
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1426
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->getCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 1427
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1428
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    sget v3, Lcom/roidapp/cloudlib/at;->al:I

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1429
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 294
    :goto_1
    iput-boolean v6, p0, Lcom/roidapp/cloudlib/sns/notification/b;->m:Z

    .line 295
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->n:Z

    if-eqz v0, :cond_1

    .line 296
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->d()V

    .line 298
    :cond_1
    return-object v1

    .line 1424
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    goto :goto_0

    .line 1431
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1
.end method

.method public final onDestroy()V
    .locals 2

    .prologue
    .line 393
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroy()V

    .line 394
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    if-eqz v0, :cond_0

    .line 395
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->g:Lcom/roidapp/cloudlib/sns/notification/f;

    .line 2330
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/u;->a(Ljava/lang/Object;)V

    .line 397
    :cond_0
    return-void
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 311
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/main/b;->onDestroyView()V

    .line 312
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->r:Landroid/widget/TextView;

    .line 313
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->v:Landroid/widget/ImageView;

    .line 314
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->q:Landroid/widget/TextView;

    .line 315
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->p:Landroid/view/View;

    .line 316
    return-void
.end method

.method public final onRefresh()V
    .locals 5

    .prologue
    const/16 v4, 0x8

    .line 185
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    .line 187
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 188
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->e:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0, v2, v3, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 191
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 195
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0
.end method

.method public final setUserVisibleHint(Z)V
    .locals 1

    .prologue
    .line 320
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/notification/b;->n:Z

    .line 321
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->setUserVisibleHint(Z)V

    .line 322
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/b;->m:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 323
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->d()V

    .line 325
    :cond_0
    if-eqz p1, :cond_1

    .line 326
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/notification/b;->f()V

    .line 328
    :cond_1
    return-void
.end method
