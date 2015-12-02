.class public abstract Lcom/qihoo/security/app/BaseActivity;
.super Landroid/support/v7/app/ActionBarActivity;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/ui/fragment/BaseFragment$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/app/BaseActivity$a;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private B:Landroid/view/View;

.field private final C:Landroid/content/BroadcastReceiver;

.field public o:Lcom/qihoo/security/locale/d;

.field public p:Landroid/content/Context;

.field protected q:Lcom/qihoo/security/v7/MaterialMenuView;

.field protected r:Landroid/support/v7/app/ActionBar;

.field protected s:Landroid/support/v4/app/f;

.field protected t:Z

.field protected u:Z

.field protected v:Z

.field protected w:Lcom/qihoo/security/app/BaseActivity$a;

.field protected x:Landroid/support/v4/content/g;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivity;-><init>()V

    .line 64
    iput-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->y:Z

    .line 67
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->o:Lcom/qihoo/security/locale/d;

    .line 68
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    .line 69
    iput-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->z:Z

    .line 78
    iput-boolean v2, p0, Lcom/qihoo/security/app/BaseActivity;->t:Z

    .line 83
    iput-boolean v2, p0, Lcom/qihoo/security/app/BaseActivity;->u:Z

    .line 85
    iput-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->v:Z

    .line 512
    new-instance v0, Lcom/qihoo/security/app/BaseActivity$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/app/BaseActivity$3;-><init>(Lcom/qihoo/security/app/BaseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->C:Landroid/content/BroadcastReceiver;

    .line 541
    return-void
.end method

.method private a(II)V
    .locals 4

    .prologue
    .line 308
    iget-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->t:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;)I

    move-result v1

    .line 310
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 312
    new-instance v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V

    .line 313
    const/16 v1, 0x30

    iput v1, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->a:I

    .line 315
    new-instance v1, Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    .line 316
    invoke-virtual {p0, p2}, Lcom/qihoo/security/app/BaseActivity;->c(I)V

    .line 317
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 319
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 321
    new-instance v1, Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 322
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 323
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 327
    :cond_0
    return-void
.end method

.method private o()V
    .locals 5

    .prologue
    .line 263
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 265
    :try_start_0
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 266
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 268
    const/4 v1, 0x0

    .line 270
    :try_start_1
    const-class v0, Landroid/view/WindowManager$LayoutParams;

    .line 271
    const-string/jumbo v4, "FLAG_TRANSLUCENT_STATUS"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 272
    if-eqz v4, :cond_3

    .line 273
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Object;

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 281
    :goto_0
    if-eqz v0, :cond_0

    .line 282
    :try_start_2
    iget v1, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/2addr v0, v1

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 284
    :cond_0
    invoke-virtual {v2, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    .line 288
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->t:Z

    if-eqz v0, :cond_2

    .line 289
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080020

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 290
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080056

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 291
    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/app/BaseActivity;->a(II)V

    .line 296
    :goto_2
    return-void

    .line 276
    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 293
    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08001f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 294
    invoke-direct {p0, v0, v0}, Lcom/qihoo/security/app/BaseActivity;->a(II)V

    goto :goto_2

    .line 285
    :catch_1
    move-exception v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected a(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .prologue
    .line 180
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->a(Landroid/graphics/drawable/Drawable;)V

    .line 183
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->b()Ljava/lang/CharSequence;

    move-result-object v0

    .line 184
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->a(Ljava/lang/CharSequence;)V

    .line 185
    if-nez v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->a(Ljava/lang/CharSequence;)V

    .line 190
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->d(Z)V

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->d(Z)V

    .line 194
    :cond_0
    return-void

    .line 188
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v1, v0}, Landroid/support/v7/app/ActionBar;->a(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method protected a(Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 559
    return-void
.end method

.method protected a(Landroid/view/Menu;II)V
    .locals 3

    .prologue
    .line 413
    if-eqz p1, :cond_0

    .line 414
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 415
    const/high16 v0, 0x7f030000

    invoke-static {v1, v0}, Landroid/support/v4/view/j;->b(Landroid/view/MenuItem;I)Landroid/view/MenuItem;

    .line 416
    invoke-static {v1}, Landroid/support/v4/view/j;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 417
    invoke-virtual {v0, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 418
    new-instance v2, Lcom/qihoo/security/app/BaseActivity$2;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/app/BaseActivity$2;-><init>(Lcom/qihoo/security/app/BaseActivity;Landroid/view/MenuItem;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 425
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 522
    return-void
.end method

.method protected a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuView;->setState(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 205
    :cond_0
    return-void
.end method

.method protected b(I)V
    .locals 1

    .prologue
    .line 255
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-virtual {p0, v0}, Lcom/qihoo/security/app/BaseActivity;->b(Ljava/lang/String;)V

    .line 257
    return-void
.end method

.method protected b(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 393
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 396
    :cond_0
    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 241
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 247
    :cond_0
    :goto_0
    return-void

    .line 244
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method protected b(Z)V
    .locals 2

    .prologue
    .line 225
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->a()Landroid/view/View;

    move-result-object v0

    .line 226
    const v1, 0x7f0b0215

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 227
    if-eqz p1, :cond_1

    const/4 v1, 0x0

    .line 228
    :goto_0
    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 231
    :cond_0
    return-void

    .line 227
    :cond_1
    const/16 v1, 0x8

    goto :goto_0
.end method

.method protected c(I)V
    .locals 2

    .prologue
    .line 400
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 401
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->B:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 403
    :cond_0
    return-void
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected j()V
    .locals 4

    .prologue
    .line 133
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->f()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->d(Z)V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->e(Z)V

    .line 138
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->a(Z)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->b(Z)V

    .line 140
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    const v1, 0x7f03009f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    .line 141
    if-nez v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    const v1, 0x7f03009f

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->a(I)V

    .line 155
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->a()Landroid/view/View;

    move-result-object v1

    .line 156
    const v0, 0x7f0b0213

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v7/MaterialMenuView;

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    .line 157
    const v0, 0x7f0b0214

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 159
    sget-object v2, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {p0, v2}, Lcom/qihoo/security/app/BaseActivity;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 160
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 161
    const v2, 0x7f0b0216

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 162
    new-instance v1, Lcom/qihoo/security/app/BaseActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/app/BaseActivity$1;-><init>(Lcom/qihoo/security/app/BaseActivity;)V

    .line 168
    iget-object v2, p0, Lcom/qihoo/security/app/BaseActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    :cond_0
    :goto_1
    return-void

    .line 150
    :cond_1
    new-instance v1, Landroid/support/v7/app/ActionBar$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(II)V

    .line 152
    iget-object v2, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    invoke-virtual {v2, v0, v1}, Landroid/support/v7/app/ActionBar;->a(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 170
    :catch_0
    move-exception v0

    .line 171
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    goto :goto_1
.end method

.method protected k()V
    .locals 5

    .prologue
    const/16 v3, 0x13

    const/4 v0, 0x0

    .line 334
    iget-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->t:Z

    if-eqz v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xa

    if-gt v1, v2, :cond_1

    .line 389
    :cond_0
    :goto_0
    return-void

    .line 338
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v1, :cond_4

    .line 340
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 341
    const v2, 0x7f09001c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 343
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v3, :cond_7

    .line 344
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;)I

    move-result v0

    move v1, v0

    .line 346
    :goto_1
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/qihoo/security/app/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 347
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 348
    if-eqz v3, :cond_0

    .line 349
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 351
    iget-boolean v4, p0, Lcom/qihoo/security/app/BaseActivity;->v:Z

    if-eqz v4, :cond_3

    .line 353
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 358
    :goto_2
    iget-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->u:Z

    if-nez v1, :cond_2

    .line 360
    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 363
    :cond_2
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 386
    :catch_0
    move-exception v0

    goto :goto_0

    .line 355
    :cond_3
    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_2

    .line 367
    :cond_4
    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 369
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v3, :cond_6

    .line 370
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;)I

    move-result v0

    move v1, v0

    .line 372
    :goto_3
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/qihoo/security/app/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 373
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 374
    if-eqz v2, :cond_0

    .line 375
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 377
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 378
    iget-boolean v1, p0, Lcom/qihoo/security/app/BaseActivity;->u:Z

    if-nez v1, :cond_5

    .line 380
    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 382
    :cond_5
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_6
    move v1, v0

    goto :goto_3

    :cond_7
    move v1, v0

    goto :goto_1
.end method

.method protected l()V
    .locals 2

    .prologue
    .line 439
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 440
    const-class v1, Lcom/qihoo/security/support/ScreenAnalytics;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/support/ScreenAnalytics;

    .line 444
    return-void
.end method

.method protected m()V
    .locals 4

    .prologue
    .line 508
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->y:Z

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->x:Landroid/support/v4/content/g;

    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->C:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string/jumbo v3, "com.qihoo.security.ACTION_FINISH"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 510
    return-void
.end method

.method protected n()V
    .locals 0

    .prologue
    .line 528
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 529
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 503
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 504
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->z:Z

    .line 98
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarActivity;->onCreate(Landroid/os/Bundle;)V

    .line 99
    invoke-static {}, Lcom/qihoo/security/profile/j;->a()Lcom/qihoo/security/profile/j;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x3

    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/profile/j;->a(IILjava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->a(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 101
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 102
    iget-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->u:Z

    if-eqz v0, :cond_0

    .line 103
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;->o()V

    .line 106
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->s:Landroid/support/v4/app/f;

    .line 108
    new-instance v0, Lcom/qihoo/security/app/BaseActivity$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/app/BaseActivity$a;-><init>(Lcom/qihoo/security/app/BaseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->x:Landroid/support/v4/content/g;

    .line 110
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 477
    invoke-super {p0}, Landroid/support/v7/app/ActionBarActivity;->onDestroy()V

    .line 479
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 481
    iget-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->y:Z

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->x:Landroid/support/v4/content/g;

    iget-object v1, p0, Lcom/qihoo/security/app/BaseActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;)V

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/app/BaseActivity$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 486
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 465
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 472
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    .line 467
    :pswitch_0
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 465
    :pswitch_data_0
    .packed-switch 0x102002c
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 4

    .prologue
    .line 454
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->z:Z

    .line 455
    invoke-super {p0}, Landroid/support/v7/app/ActionBarActivity;->onPause()V

    .line 456
    invoke-static {}, Lcom/qihoo/security/profile/j;->a()Lcom/qihoo/security/profile/j;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x4

    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/profile/j;->a(IILjava/lang/String;)V

    .line 457
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 429
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->k()V

    .line 430
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->z:Z

    .line 431
    invoke-virtual {p0}, Lcom/qihoo/security/app/BaseActivity;->l()V

    .line 432
    invoke-super {p0}, Landroid/support/v7/app/ActionBarActivity;->onResume()V

    .line 433
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 448
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/app/BaseActivity;->z:Z

    .line 449
    invoke-super {p0}, Landroid/support/v7/app/ActionBarActivity;->onStart()V

    .line 450
    return-void
.end method

.method public setTitleColor(I)V
    .locals 1

    .prologue
    .line 537
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 538
    iget-object v0, p0, Lcom/qihoo/security/app/BaseActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuView;->setColor(I)V

    .line 539
    return-void
.end method
