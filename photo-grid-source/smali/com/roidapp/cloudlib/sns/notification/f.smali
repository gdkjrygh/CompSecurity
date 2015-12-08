.class public final Lcom/roidapp/cloudlib/sns/notification/f;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v4/app/Fragment;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ListView;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/h;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/view/View$OnClickListener;

.field private f:I

.field private g:Landroid/text/TextPaint;

.field private h:Ljava/util/regex/Pattern;

.field private i:I

.field private j:I

.field private k:I

.field private l:Lcom/roidapp/cloudlib/sns/notification/o;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Landroid/widget/ListView;Landroid/view/View$OnClickListener;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/Fragment;",
            "Landroid/widget/ListView;",
            "Landroid/view/View$OnClickListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 79
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 70
    const-string v0, "[#|@]\\w+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->h:Ljava/util/regex/Pattern;

    .line 80
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/f;->a:Landroid/support/v4/app/Fragment;

    .line 81
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    .line 82
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/notification/f;->c:Landroid/widget/ListView;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    .line 84
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->e:Landroid/view/View$OnClickListener;

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 87
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x428c0000    # 70.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    sub-int/2addr v1, v2

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->f:I

    .line 88
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->g:Landroid/text/TextPaint;

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->g:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->g:Landroid/text/TextPaint;

    const-string v1, "#384248"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 91
    const-string v0, "#00ca72"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->i:I

    .line 92
    const-string v0, "#00844a"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->j:I

    .line 93
    const-string v0, "#384248"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->k:I

    .line 96
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x21

    .line 383
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 384
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 385
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    .line 386
    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 387
    new-instance v2, Lcom/roidapp/cloudlib/sns/notification/j;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->i:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/notification/f;->j:I

    invoke-direct {v2, p0, v1, v3, v4}, Lcom/roidapp/cloudlib/sns/notification/j;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;II)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    add-int/2addr v1, p3

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p1, v2, v1, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 395
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v1, v2, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p1, v1, v2, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 397
    :cond_0
    new-instance v2, Lcom/roidapp/cloudlib/sns/notification/k;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->i:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/notification/f;->j:I

    invoke-direct {v2, p0, v3, v4, v1}, Lcom/roidapp/cloudlib/sns/notification/k;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;IILjava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    add-int/2addr v1, p3

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p1, v2, v1, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 406
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v1, v2, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    add-int/2addr v3, p3

    invoke-virtual {p1, v1, v2, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 410
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;)V
    .locals 7

    .prologue
    .line 59
    .line 2413
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 2414
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 2415
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/notification/l;

    invoke-direct {v6, p0, p1, v0}, Lcom/roidapp/cloudlib/sns/notification/l;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 59
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;ILcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct/range {p0 .. p6}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;ILcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;ILcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V
    .locals 12

    .prologue
    .line 341
    invoke-static {}, Lcom/roidapp/cloudlib/sns/h;->a()Lcom/roidapp/cloudlib/sns/h;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    move-object/from16 v0, p4

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/h;->f:J

    invoke-virtual {v2, v3, v4, v5}, Lcom/roidapp/cloudlib/sns/h;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v2

    .line 342
    const-string v9, ". "

    .line 343
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 344
    new-instance v11, Landroid/text/SpannableStringBuilder;

    invoke-direct {v11, v10}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 345
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 347
    new-instance v2, Lcom/roidapp/cloudlib/sns/notification/i;

    iget v4, p0, Lcom/roidapp/cloudlib/sns/notification/f;->i:I

    iget v5, p0, Lcom/roidapp/cloudlib/sns/notification/f;->j:I

    move/from16 v0, p5

    int-to-long v6, v0

    move-object v3, p0

    move/from16 v8, p5

    invoke-direct/range {v2 .. v8}, Lcom/roidapp/cloudlib/sns/notification/i;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;IIJI)V

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 360
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const-string v3, "#384248"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 361
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 363
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {p0, v11, p3, v2}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;I)V

    .line 366
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 368
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const-string v3, "#384248"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 369
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 371
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const-string v3, "#8f8f8f"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 372
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ap;->l:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {v11, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 376
    new-instance v2, Landroid/text/StaticLayout;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/notification/f;->g:Landroid/text/TextPaint;

    iget v5, p0, Lcom/roidapp/cloudlib/sns/notification/f;->f:I

    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    move-object v3, v11

    invoke-direct/range {v2 .. v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 378
    move-object/from16 v0, p6

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a(Landroid/text/Layout;)V

    .line 379
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/f;)Ljava/util/List;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;)V
    .locals 7

    .prologue
    .line 59
    .line 2448
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 2449
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 2450
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p1, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/notification/m;

    invoke-direct {v6, p0, p1, v0}, Lcom/roidapp/cloudlib/sns/notification/m;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 59
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/view/View$OnClickListener;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->e:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/notification/f;)Lcom/roidapp/cloudlib/sns/notification/o;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->l:Lcom/roidapp/cloudlib/sns/notification/o;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 104
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 105
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    .line 107
    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    if-eqz v2, :cond_0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    if-ne v0, p1, :cond_0

    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 112
    :cond_1
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/notification/o;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/f;->l:Lcom/roidapp/cloudlib/sns/notification/o;

    .line 100
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/h;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 115
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    .line 116
    return-void
.end method

.method public final b(I)Lcom/roidapp/cloudlib/sns/b/h;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    goto :goto_0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/notification/f;->b(I)Lcom/roidapp/cloudlib/sns/b/h;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 130
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v6, 0x0

    const/16 v4, 0x8

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 226
    :goto_0
    return-object v2

    .line 138
    :cond_0
    if-nez p2, :cond_3

    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->M:I

    invoke-virtual {v0, v1, p3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 141
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/n;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/notification/n;-><init>()V

    .line 142
    sget v0, Lcom/roidapp/cloudlib/ar;->dn:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->a:Lcom/roidapp/baselib/view/RoundImageView;

    .line 143
    sget v0, Lcom/roidapp/cloudlib/ar;->n:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->b:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 144
    sget v0, Lcom/roidapp/cloudlib/ar;->aP:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    .line 145
    sget v0, Lcom/roidapp/cloudlib/ar;->aQ:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    .line 146
    sget v0, Lcom/roidapp/cloudlib/ar;->aR:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    .line 147
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 148
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->a:Lcom/roidapp/baselib/view/RoundImageView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/view/RoundImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    new-instance v3, Lcom/roidapp/cloudlib/sns/notification/g;

    invoke-direct {v3, p0, v1}, Lcom/roidapp/cloudlib/sns/notification/g;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/notification/n;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v3, :cond_2

    .line 170
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 176
    :goto_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v8, v1

    .line 182
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/roidapp/cloudlib/sns/b/h;

    .line 184
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v0

    .line 186
    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v3, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v1, v3, :cond_6

    .line 187
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 190
    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v1

    .line 191
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v1, v3, :cond_4

    .line 192
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 193
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    sget v4, Lcom/roidapp/cloudlib/at;->N:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    const-string v3, "#ffffff"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 195
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/cloudlib/aq;->k:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 214
    :goto_3
    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v1, :cond_d

    if-eqz v0, :cond_d

    .line 215
    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 216
    iget-object v1, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 217
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;)Ljava/lang/String;

    move-result-object v0

    .line 220
    :goto_4
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->a:Lcom/roidapp/baselib/view/RoundImageView;

    .line 2230
    if-nez v0, :cond_7

    .line 2231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/f;->a:Landroid/support/v4/app/Fragment;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v2, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/b;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v2, Lcom/roidapp/cloudlib/sns/e/a;

    invoke-direct {v2, v1}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 221
    :goto_5
    iget-object v7, v8, Lcom/roidapp/cloudlib/sns/notification/n;->b:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 2257
    if-eqz v5, :cond_1

    .line 2260
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    .line 2262
    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 2264
    const-string v4, ""

    .line 2265
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->b:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v1, :cond_8

    .line 2266
    const-string v3, " started following you"

    :goto_6
    move-object v1, p0

    move v6, p1

    .line 2303
    invoke-direct/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;ILcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V

    .line 223
    :cond_1
    :goto_7
    iget-object v0, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 224
    iget-object v0, v8, Lcom/roidapp/cloudlib/sns/notification/n;->a:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/RoundImageView;->setTag(Ljava/lang/Object;)V

    .line 225
    iget-object v0, v8, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    move-object v2, p2

    .line 226
    goto/16 :goto_0

    .line 173
    :cond_2
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    iget-object v0, v1, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 179
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/notification/n;

    move-object v8, v0

    goto/16 :goto_2

    .line 196
    :cond_4
    sget-object v3, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v1, v3, :cond_5

    .line 197
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 198
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    sget v4, Lcom/roidapp/cloudlib/at;->P:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/ao;->a:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 200
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_3

    .line 202
    :cond_5
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v6}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 203
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_3

    .line 207
    :cond_6
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->e:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 208
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 210
    iget-object v1, v8, Lcom/roidapp/cloudlib/sns/notification/n;->d:Landroid/widget/ImageView;

    .line 1249
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->a:Landroid/support/v4/app/Fragment;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    iget-object v4, v5, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_3

    .line 2238
    :cond_7
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/f;->a:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v5, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/f;->a:Landroid/support/v4/app/Fragment;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/a;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v2, Lcom/roidapp/cloudlib/sns/e/a;

    invoke-direct {v2, v1}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_5

    .line 2267
    :cond_8
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->a:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v1, :cond_9

    .line 2268
    const-string v3, " liked your photo"

    goto/16 :goto_6

    .line 2269
    :cond_9
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->c:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v1, :cond_a

    .line 2270
    const-string v3, " left a comment on your photo:"

    .line 2271
    iget-object v4, v5, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    goto/16 :goto_6

    .line 2272
    :cond_a
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->a:Lcom/roidapp/cloudlib/sns/b/i;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/i;->e:Lcom/roidapp/cloudlib/sns/b/i;

    if-ne v0, v1, :cond_b

    .line 2273
    const-string v3, " mentioned you in a comment:"

    .line 2274
    iget-object v4, v5, Lcom/roidapp/cloudlib/sns/b/h;->b:Ljava/lang/String;

    goto/16 :goto_6

    .line 2276
    :cond_b
    const-string v3, " mentioned you in a post:"

    .line 2277
    const-string v4, ""

    .line 2278
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget-boolean v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->l:Z

    if-eqz v0, :cond_c

    .line 2284
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v9, v0, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    new-instance v0, Lcom/roidapp/cloudlib/sns/notification/h;

    move-object v1, p0

    move v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/cloudlib/sns/notification/h;-><init>(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;I)V

    invoke-static {v7, v9, v0}, Lcom/roidapp/cloudlib/sns/b/k;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/m;)V

    goto/16 :goto_7

    .line 2298
    :cond_c
    iget-object v0, v5, Lcom/roidapp/cloudlib/sns/b/h;->d:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    goto/16 :goto_6

    :cond_d
    move-object v0, v2

    goto/16 :goto_4
.end method
