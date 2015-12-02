.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;
.super Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$l;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field d:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 241
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$l;-><init>(Landroid/content/Context;)V

    .line 242
    return-void
.end method

.method private b()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 381
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200eb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private c()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 385
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200ea

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 389
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200ee

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 245
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a:Landroid/view/View;

    .line 246
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a:Landroid/view/View;

    const v1, 0x7f0b00ca

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a:Landroid/view/View;

    const v1, 0x7f0b00cb

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a:Landroid/view/View;

    const v1, 0x7f0b00cc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    .line 249
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;)V
    .locals 10

    .prologue
    const v3, 0x7f0c0058

    const/16 v9, 0x21

    const/4 v8, 0x0

    const/4 v1, 0x1

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    const/16 v2, 0x64

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 262
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b()F

    move-result v0

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 263
    if-gt v0, v1, :cond_0

    move v0, v1

    .line 282
    :cond_0
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b()F

    move-result v2

    const v4, 0x3f4ccccd    # 0.8f

    cmpg-float v2, v2, v4

    if-gez v2, :cond_1

    .line 283
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f080056

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 284
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 295
    :goto_0
    sget-object v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    iget-object v5, p1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-virtual {v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 333
    :goto_1
    :pswitch_0
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    invoke-virtual {v4, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 337
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 339
    const-string/jumbo v0, ""

    .line 341
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c()J

    move-result-wide v4

    invoke-static {v0, v4, v5, v1}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v0

    .line 343
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 345
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v4, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v3, v4, v8, v0, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 347
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v2, 0x7f0c01ef

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string/jumbo v5, ""

    aput-object v5, v4, v8

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v5

    iget-wide v6, p1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    invoke-static {v5, v6, v7, v1}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {v0, v2, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 349
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 350
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f080055

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-direct {v2, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v2, v8, v0, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 352
    invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    .line 361
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 362
    return-void

    .line 285
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b()F

    move-result v2

    const v4, 0x3f666666    # 0.9f

    cmpg-float v2, v2, v4

    if-gez v2, :cond_2

    .line 286
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f080057

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 287
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 289
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f080058

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 290
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->d:Landroid/widget/ProgressBar;

    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 308
    :pswitch_1
    const v3, 0x7f0c0059

    .line 317
    goto/16 :goto_1

    .line 319
    :pswitch_2
    const v3, 0x7f0c005a

    .line 328
    goto/16 :goto_1

    .line 295
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
