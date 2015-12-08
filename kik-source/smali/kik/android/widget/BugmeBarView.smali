.class public Lkik/android/widget/BugmeBarView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lkik/android/e/d;


# instance fields
.field _bugMeSingleTextLayout:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ab
    .end annotation
.end field

.field _bugmeButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00aa
    .end annotation
.end field

.field _bugmePic:Lcom/kik/cache/ContactImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e00ac
    .end annotation
.end field

.field a:Landroid/view/View;

.field b:Lkik/android/chat/fragment/ProgressDialogFragment;

.field private final c:Landroid/view/View$OnClickListener;

.field private d:Landroid/content/Context;

.field private e:Lkik/a/e/w;

.field private f:Lkik/a/e/n;

.field private g:Lkik/a/e/v;

.field private h:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Lcom/kik/h/c;

.field private p:Lkik/a/f/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/BugmeBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 115
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    new-instance v0, Lkik/android/widget/e;

    invoke-direct {v0, p0}, Lkik/android/widget/e;-><init>(Lkik/android/widget/BugmeBarView;)V

    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->c:Landroid/view/View$OnClickListener;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/BugmeBarView;->m:Z

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/BugmeBarView;->n:Z

    .line 116
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    .line 117
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03001d

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/BugmeBarView;->a:Landroid/view/View;

    .line 118
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->a:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 119
    return-void
.end method

.method private a(I)V
    .locals 5

    .prologue
    const v4, 0x7f0e00ad

    const/16 v1, 0x8

    const/4 v3, 0x0

    .line 175
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugMeSingleTextLayout:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    packed-switch p1, :pswitch_data_0

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 178
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, v3}, Lcom/kik/cache/ContactImageView;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020034

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 182
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugMeSingleTextLayout:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 184
    invoke-virtual {p0, v4}, Lkik/android/widget/BugmeBarView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v2, 0x7f09022b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v2, 0x7f090085

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 188
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 192
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugMeSingleTextLayout:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmeButton:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 194
    invoke-virtual {p0, v4}, Lkik/android/widget/BugmeBarView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v2, 0x7f0901d6

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    new-instance v0, Lkik/android/widget/i;

    invoke-direct {v0, p0}, Lkik/android/widget/i;-><init>(Lkik/android/widget/BugmeBarView;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {p0, v0, v2, v3}, Lkik/android/widget/BugmeBarView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 176
    nop

    :pswitch_data_0
    .packed-switch 0x38
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a(Lkik/android/widget/BugmeBarView;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->g()V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/BugmeBarView;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lkik/android/widget/BugmeBarView;->i:Z

    return p1
.end method

.method static synthetic b(Lkik/android/widget/BugmeBarView;)Lcom/kik/h/c;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->o:Lcom/kik/h/c;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .prologue
    .line 244
    if-nez p1, :cond_2

    .line 245
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->j:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->k:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->m:Z

    if-nez v0, :cond_1

    .line 246
    new-instance v0, Lcom/kik/android/a/b;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f0d0000

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-direct {v0, p0, v1, v2}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;II)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/b;->setDuration(J)V

    new-instance v1, Lkik/android/widget/l;

    invoke-direct {v1, p0}, Lkik/android/widget/l;-><init>(Lkik/android/widget/BugmeBarView;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/BugmeBarView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 247
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 255
    :cond_1
    :goto_0
    return-void

    .line 251
    :cond_2
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->m:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->l:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->k:Z

    if-nez v0, :cond_1

    .line 252
    :cond_3
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->h()V

    goto :goto_0
.end method

.method static synthetic b(Lkik/android/widget/BugmeBarView;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lkik/android/widget/BugmeBarView;->k:Z

    return p1
.end method

.method static synthetic c(Lkik/android/widget/BugmeBarView;)Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->h:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/BugmeBarView;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lkik/android/widget/BugmeBarView;->l:Z

    return p1
.end method

.method static synthetic d(Lkik/android/widget/BugmeBarView;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lkik/android/widget/BugmeBarView;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lkik/android/widget/BugmeBarView;->m:Z

    return p1
.end method

.method static synthetic e(Lkik/android/widget/BugmeBarView;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->h()V

    return-void
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 149
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->j()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 223
    new-instance v0, Lkik/android/util/p$a;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->p:Lkik/a/f/k;

    iget-object v2, p0, Lkik/android/widget/BugmeBarView;->f:Lkik/a/e/n;

    iget-object v3, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    iget-object v4, p0, Lkik/android/widget/BugmeBarView;->g:Lkik/a/e/v;

    invoke-direct {v0, v1, v2, v3, v4}, Lkik/android/util/p$a;-><init>(Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V

    .line 224
    new-array v1, v5, [Lkik/android/e/d;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 226
    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 227
    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 230
    :cond_0
    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v2, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v3, 0x7f090207

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v5}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 231
    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v2, Lkik/android/widget/j;

    invoke-direct {v2, p0, v0}, Lkik/android/widget/j;-><init>(Lkik/android/widget/BugmeBarView;Lkik/android/util/p$a;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 239
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->o:Lcom/kik/h/c;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0, v1}, Lcom/kik/h/c;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 240
    return-void
.end method

.method private h()V
    .locals 4

    .prologue
    .line 274
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->k:Z

    if-eqz v0, :cond_0

    .line 301
    :goto_0
    return-void

    .line 277
    :cond_0
    new-instance v0, Lcom/kik/android/a/b;

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f0d0000

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;II)V

    .line 278
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/b;->setDuration(J)V

    .line 279
    new-instance v1, Lkik/android/widget/k;

    invoke-direct {v1, p0}, Lkik/android/widget/k;-><init>(Lkik/android/widget/BugmeBarView;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 300
    invoke-virtual {p0, v0}, Lkik/android/widget/BugmeBarView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 154
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x38

    invoke-direct {p0, v0}, Lkik/android/widget/BugmeBarView;->a(I)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/widget/BugmeBarView;->b(I)V

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 154
    :cond_1
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->i:Z

    if-nez v0, :cond_0

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lkik/android/widget/BugmeBarView;->b(I)V

    goto :goto_0
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 259
    sparse-switch p2, :sswitch_data_0

    .line 268
    :goto_0
    invoke-direct {p0, p1}, Lkik/android/widget/BugmeBarView;->b(I)V

    .line 269
    return-void

    .line 261
    :sswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/BugmeBarView;->j:Z

    goto :goto_0

    .line 265
    :sswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/BugmeBarView;->j:Z

    goto :goto_0

    .line 259
    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(IILandroid/content/Intent;Lkik/a/e/n;)V
    .locals 6

    .prologue
    const/4 v1, -0x1

    .line 356
    const/16 v0, 0x285e

    if-eq p1, v0, :cond_0

    const/16 v0, 0x285f

    if-ne p1, v0, :cond_2

    :cond_0
    if-ne p2, v1, :cond_2

    .line 358
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->h:Lkik/android/chat/fragment/KikScopedDialogFragment;

    iget-object v2, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    move v3, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lkik/android/util/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 361
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/widget/BugmeBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v2, 0x7f0902ba

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    const v2, 0x7f0900ae

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090193

    new-instance v2, Lkik/android/widget/m;

    invoke-direct {v2, p0}, Lkik/android/widget/m;-><init>(Lkik/android/widget/BugmeBarView;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 373
    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->o:Lcom/kik/h/c;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/h/c;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 385
    :cond_1
    :goto_0
    return-void

    .line 376
    :cond_2
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_1

    if-ne p2, v1, :cond_1

    .line 379
    :try_start_0
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->g()V

    throw v0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 3

    .prologue
    .line 396
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 400
    :cond_0
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x5a

    invoke-static {p1, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/w;->a([B)V

    .line 402
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->_bugmePic:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, p1}, Lcom/kik/cache/ContactImageView;->d(Landroid/graphics/Bitmap;)V

    .line 403
    const/16 v0, 0x39

    invoke-direct {p0, v0}, Lkik/android/widget/BugmeBarView;->a(I)V

    .line 404
    return-void
.end method

.method public final a(Lcom/kik/h/c;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->o:Lcom/kik/h/c;

    .line 219
    return-void
.end method

.method public final a(Lkik/a/e/n;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->f:Lkik/a/e/n;

    .line 135
    return-void
.end method

.method public final a(Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->g:Lkik/a/e/v;

    .line 124
    return-void
.end method

.method public final a(Lkik/a/e/w;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->e:Lkik/a/e/w;

    .line 130
    return-void
.end method

.method public final a(Lkik/a/f/k;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->p:Lkik/a/f/k;

    .line 140
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lkik/android/widget/BugmeBarView;->h:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 352
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 144
    iput-boolean p1, p0, Lkik/android/widget/BugmeBarView;->n:Z

    .line 145
    return-void
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 308
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f0d0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 341
    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->l:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 346
    invoke-direct {p0}, Lkik/android/widget/BugmeBarView;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/BugmeBarView;->i:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k_()V
    .locals 3

    .prologue
    .line 409
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lkik/android/widget/BugmeBarView;->b:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 412
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/widget/BugmeBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f0901d0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090300

    new-instance v2, Lkik/android/widget/o;

    invoke-direct {v2, p0}, Lkik/android/widget/o;-><init>(Lkik/android/widget/BugmeBarView;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    new-instance v2, Lkik/android/widget/n;

    invoke-direct {v2, p0}, Lkik/android/widget/n;-><init>(Lkik/android/widget/BugmeBarView;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 427
    iget-object v1, p0, Lkik/android/widget/BugmeBarView;->o:Lcom/kik/h/c;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/h/c;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 428
    return-void
.end method
