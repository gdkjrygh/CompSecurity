.class public Lcom/qihoo/security/opti/trashclear/ui/c;
.super Lcom/qihoo/security/dialog/c;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/c$a;
    }
.end annotation


# instance fields
.field b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field e:Landroid/widget/LinearLayout;

.field f:Landroid/view/View;

.field g:Landroid/widget/CheckBox;

.field h:Z

.field final i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

.field j:Ljava/lang/CharSequence;

.field k:Ljava/lang/CharSequence;

.field l:Ljava/lang/CharSequence;

.field m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field n:Z

.field o:Landroid/content/Context;

.field private final p:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/c$a;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;",
            "Lcom/qihoo/security/opti/trashclear/ui/c$a;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/c;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->n:Z

    .line 53
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->p:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 54
    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->i:Lcom/qihoo/security/opti/trashclear/ui/c$a;

    .line 55
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->o:Landroid/content/Context;

    .line 56
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->h()V

    .line 57
    iput-boolean p4, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->n:Z

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/c;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->p:Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/c;I)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/c;->b(I)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 336
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0238

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 337
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 338
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    if-nez v0, :cond_1

    .line 339
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080077

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->b(I)V

    .line 343
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/c$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    return-void

    .line 337
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 341
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080025

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->b(I)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 372
    if-eqz p2, :cond_0

    .line 373
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "<u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "</u>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/c$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$4;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 389
    :goto_0
    return-void

    .line 386
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    .line 181
    return-void
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 157
    new-array v0, v5, [Ljava/lang/CharSequence;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0214

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c014f

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setButtonText([Ljava/lang/CharSequence;)V

    .line 159
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/c$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    aput-object v1, v0, v3

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/c$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    aput-object v1, v0, v4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 177
    return-void
.end method

.method private f()Landroid/widget/LinearLayout$LayoutParams;
    .locals 3

    .prologue
    .line 285
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 287
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/l;->b(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 288
    return-object v0
.end method

.method private g()Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 4

    .prologue
    .line 292
    new-instance v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;)V

    .line 293
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080023

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 294
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f09005f

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextSize(IF)V

    .line 296
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/l;->b(Landroid/content/Context;F)I

    move-result v1

    .line 297
    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLineSpacing(FF)V

    .line 298
    return-object v0
.end method

.method private h()V
    .locals 1

    .prologue
    .line 393
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->j()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->f:Landroid/view/View;

    .line 396
    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 399
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/c$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$5;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 408
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/c$6;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$6;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/c$7;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/c$7;-><init>(Lcom/qihoo/security/opti/trashclear/ui/c;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 444
    return-void
.end method

.method private j()Landroid/view/View;
    .locals 3

    .prologue
    .line 448
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f03003b

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 450
    const v0, 0x7f0b00cd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 451
    const v0, 0x7f0b00ce

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 452
    const v0, 0x7f0b00cf

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    .line 453
    const v0, 0x7f0b00d1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->g:Landroid/widget/CheckBox;

    .line 454
    const v0, 0x7f0b00d0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 455
    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->j:Ljava/lang/CharSequence;

    .line 214
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/c;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 215
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 225
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->k:Ljava/lang/CharSequence;

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 227
    if-nez p2, :cond_2

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 235
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->l:Ljava/lang/CharSequence;

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_1

    .line 237
    if-nez p1, :cond_3

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 244
    :cond_1
    :goto_1
    return-void

    .line 230
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 240
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.method public a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;ZZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/CharSequence;",
            "ZZZ)V"
        }
    .end annotation

    .prologue
    .line 139
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/CharSequence;)V

    .line 140
    invoke-virtual {p0, p2, p3}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 141
    invoke-virtual {p0, p4, p8}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/util/List;Z)V

    .line 143
    if-eqz p7, :cond_0

    .line 144
    invoke-virtual {p0, p6}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Z)V

    .line 148
    :goto_0
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 149
    invoke-interface {p5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;Z)V

    .line 153
    :goto_1
    return-void

    .line 146
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->e()V

    goto :goto_0

    .line 151
    :cond_1
    invoke-interface {p5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;Z)V

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 331
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setButtonText([Ljava/lang/CharSequence;)V

    .line 332
    return-void
.end method

.method public a(Ljava/util/List;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 254
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->m:Ljava/util/List;

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    if-nez v0, :cond_1

    .line 282
    :cond_0
    :goto_0
    return-void

    .line 259
    :cond_1
    if-nez p2, :cond_2

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 263
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 268
    :cond_3
    if-eqz p1, :cond_0

    .line 271
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0047

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 273
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 274
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->g()Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v3

    .line 276
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 278
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->f()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    .line 280
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 2

    .prologue
    .line 310
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->h:Z

    .line 311
    if-eqz p1, :cond_0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0040

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 315
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->d()V

    .line 316
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;)V

    .line 317
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/c;->i()V

    .line 318
    return-void

    .line 311
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c0041

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public d()V
    .locals 4

    .prologue
    .line 321
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c0214

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c014f

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->setButtonText([Ljava/lang/CharSequence;)V

    .line 325
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 461
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 62
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/c;->onCreate(Landroid/os/Bundle;)V

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/c;->f:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Landroid/view/View;)Landroid/view/View;

    .line 78
    return-void
.end method
