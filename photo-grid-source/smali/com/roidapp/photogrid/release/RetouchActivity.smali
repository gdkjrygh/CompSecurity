.class public Lcom/roidapp/photogrid/release/RetouchActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/retouch/t;


# instance fields
.field protected a:I

.field protected b:I

.field private final c:I

.field private d:Lcom/roidapp/imagelib/retouch/m;

.field private e:Lcom/roidapp/imagelib/retouch/a;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/RelativeLayout;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:I

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 49
    const/16 v0, 0x402

    iput v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->c:I

    .line 63
    iput v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->a:I

    iput v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->b:I

    .line 66
    iput v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->n:I

    iput v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->o:I

    .line 67
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->p:Z

    .line 73
    new-instance v0, Lcom/roidapp/photogrid/release/qu;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/qu;-><init>(Lcom/roidapp/photogrid/release/RetouchActivity;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->s:Landroid/os/Handler;

    .line 76
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/RetouchActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private a(ILjava/lang/String;)V
    .locals 5

    .prologue
    const v4, 0x7f0d005e

    const/16 v3, 0x8

    const/4 v1, 0x0

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    :goto_0
    return-void

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    const v2, 0x7f0d01ac

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 195
    const v2, 0x7f0701a0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 197
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 198
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "blemish"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_1

    .line 199
    new-instance v0, Lcom/roidapp/imagelib/retouch/a;

    invoke-direct {v0}, Lcom/roidapp/imagelib/retouch/a;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    .line 200
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 201
    const-string v2, "image_path"

    invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iput-object p2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->l:Ljava/lang/String;

    .line 203
    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/retouch/a;->setArguments(Landroid/os/Bundle;)V

    .line 204
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const/high16 v2, 0x10a0000

    invoke-virtual {v0, v2, v1, v1, v1}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    const-string v3, "blemish"

    invoke-virtual {v0, v4, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 211
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 234
    :goto_2
    iput p1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    goto :goto_0

    .line 209
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "blemish"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/retouch/a;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    goto :goto_1

    .line 214
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "skin"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_3

    .line 216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    if-eqz v0, :cond_4

    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/m;->a()Z

    move-result v0

    .line 218
    :goto_3
    new-instance v1, Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {v1}, Lcom/roidapp/imagelib/retouch/m;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    .line 219
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 220
    const-string v2, "auto_retouch"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 221
    const-string v0, "image_path"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string v0, "smoother_bar"

    iget v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->n:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 223
    const-string v0, "whiten_bar"

    iget v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->o:I

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/m;->setArguments(Landroid/os/Bundle;)V

    .line 225
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    const-string v2, "skin"

    invoke-virtual {v0, v4, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 231
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 229
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "skin"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/retouch/m;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    goto :goto_4

    :cond_4
    move v0, v1

    goto :goto_3
.end method

.method private a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 524
    const/16 v0, 0xff

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 525
    if-nez p1, :cond_0

    const/16 v0, 0x32

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 526
    :cond_0
    invoke-virtual {p3, v1, p2, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 527
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c00bf

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    :goto_0
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 528
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 529
    return-void

    .line 527
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c00c0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/RetouchActivity;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->d()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 437
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 448
    :goto_0
    return-void

    .line 438
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    if-ne v0, v2, :cond_1

    .line 439
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->l:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 4391
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 4392
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 443
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 444
    const-string v1, "isRetouch"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 445
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->startActivity(Landroid/content/Intent;)V

    .line 446
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->finish()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 298
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->p:Z

    .line 299
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 360
    iput p1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->n:I

    .line 361
    return-void
.end method

.method public final a(Landroid/net/Uri;)V
    .locals 8

    .prologue
    const/16 v7, 0x8

    const/4 v2, 0x2

    .line 239
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 240
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ILjava/lang/String;)V

    .line 241
    iput v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    .line 242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 243
    :cond_1
    if-eqz p1, :cond_0

    .line 244
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 245
    if-eqz v0, :cond_5

    array-length v1, v0

    if-lez v1, :cond_5

    .line 246
    iget v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->m:I

    aget-object v6, v0, v1

    .line 247
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 2178
    iget-object v0, v6, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2179
    iput-object v5, v6, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 252
    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-nez v0, :cond_4

    .line 253
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    .line 254
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v2

    .line 255
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->b()I

    move-result v4

    .line 261
    :goto_2
    invoke-static {v2}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 262
    new-instance v7, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/photogrid/release/qs;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/qs;-><init>(Lcom/roidapp/photogrid/release/RetouchActivity;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/b/b;ILjava/lang/String;Lcom/roidapp/photogrid/release/ig;)V

    invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 2183
    :cond_3
    iput-object v5, v6, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    goto :goto_1

    .line 257
    :cond_4
    iget-object v3, v6, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 258
    iget-object v2, v6, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 259
    iget v4, v6, Lcom/roidapp/photogrid/release/ig;->l:I

    goto :goto_2

    .line 290
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 291
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->d()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 342
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ILjava/lang/String;)V

    .line 343
    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 309
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 312
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    const v0, 0x7f07020f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 337
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->d()V

    .line 338
    return-void

    .line 314
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 315
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 316
    if-eqz v0, :cond_0

    .line 317
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 318
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 319
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 321
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 322
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 324
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 325
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 326
    const v0, 0x7f07028d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 328
    :cond_5
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 332
    :cond_6
    if-eqz p1, :cond_0

    .line 333
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 303
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 304
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->p:Z

    .line 305
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 365
    iput p1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->o:I

    .line 366
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 375
    const-string v0, "RetouchPage"

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const v4, 0x7f020411

    const v3, 0x7f0203dd

    const/4 v2, 0x1

    const/4 v7, 0x0

    .line 405
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->p:Z

    if-eqz v0, :cond_1

    .line 2463
    :cond_0
    :goto_0
    return-void

    .line 408
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 414
    :pswitch_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->d()V

    goto :goto_0

    .line 410
    :pswitch_1
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->p:Z

    .line 2451
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->r:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->r:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 2452
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->r:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2455
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2456
    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2457
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 2458
    iget v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->m:I

    aget-object v0, v0, v1

    iget-object v1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 2459
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2460
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    if-ne v0, v2, :cond_3

    .line 2461
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    if-eqz v0, :cond_0

    .line 2462
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/l;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2463
    const-string v0, "SingleRetouch"

    const-string v2, "SingleBlemish_Apply"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v0, v2, v7, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_0

    .line 2467
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    if-eqz v0, :cond_0

    .line 2469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2471
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    const-string v2, "/Retouch/applyRetouchBtn"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2475
    :cond_4
    const-string v0, ""

    .line 2476
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    .line 2477
    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->a()Z

    move-result v3

    .line 2478
    if-eqz v3, :cond_5

    .line 2479
    const-string v4, "SingleRetouch"

    const-string v5, "SingleAutoRetouch_Apply"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v4, v5, v7, v6}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2481
    :cond_5
    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->c()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 2482
    const-string v0, "/Smoother"

    .line 2483
    if-nez v3, :cond_6

    .line 2484
    const-string v4, "SingleRetouch"

    const-string v5, "SingleSmoother_Apply"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v4, v5, v7, v6}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2486
    :cond_6
    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->d()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 2487
    const-string v4, "/Whiten"

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2488
    if-nez v3, :cond_7

    .line 2489
    const-string v3, "SingleRetouch"

    const-string v4, "SingleWhiten_Apply"

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v3, v4, v7, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2491
    :cond_7
    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->e()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2492
    const-string v1, "/Blemishes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2494
    :cond_8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2495
    iget-object v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    const-string v2, "/Retouch/apply/HasRetouch"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2514
    :pswitch_2
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    if-ne v0, v2, :cond_0

    .line 2515
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    if-eqz v0, :cond_0

    .line 2516
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->b()V

    .line 2517
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->c()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    .line 2518
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->d()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    goto/16 :goto_0

    .line 3504
    :pswitch_3
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    if-ne v0, v2, :cond_0

    .line 3505
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    if-eqz v0, :cond_0

    .line 3506
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->a()V

    .line 3507
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->c()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    .line 3508
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->d()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    goto/16 :goto_0

    .line 408
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d02a1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 108
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 110
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "skin"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "blemish"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 116
    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 120
    :cond_1
    const-string v0, "360"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 121
    const-string v0, "RetouchActivity"

    const-string v1, "The process has been killed, return to home."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    :goto_0
    return-void

    .line 124
    :cond_2
    const-string v0, "RetouchAct/onCreate"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 126
    const-string v0, "ImageEdit/Retouch"

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 128
    const v0, 0x7f03010b

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->v:Z

    if-nez v0, :cond_6

    .line 136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "modeStr"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    .line 137
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entry_ga_tag"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 138
    packed-switch v0, :pswitch_data_0

    .line 146
    :goto_2
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_3

    array-length v1, v0

    if-nez v1, :cond_4

    .line 148
    :cond_3
    const-string v0, "RetouchActivity"

    const-string v1, "selectImages is null, go to main page."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 150
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->startActivity(Landroid/content/Intent;)V

    .line 151
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->finish()V

    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 131
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->v:Z

    .line 132
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 140
    :pswitch_1
    const-string v0, "/Save/finish/save/retouch"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->r:Ljava/lang/String;

    goto :goto_2

    .line 143
    :pswitch_2
    const-string v0, "/share/finish/save/retouch"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->r:Ljava/lang/String;

    goto :goto_2

    .line 154
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "edit_image_index"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->m:I

    .line 155
    iget v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->m:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_5

    .line 156
    const-string v0, "360"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 159
    :cond_5
    iget v1, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->m:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->l:Ljava/lang/String;

    .line 1178
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 1179
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1180
    const-string v2, "image_path"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    const-string v2, "modeStr"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->q:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1182
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "skin"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-nez v2, :cond_7

    .line 1183
    new-instance v2, Lcom/roidapp/imagelib/retouch/m;

    invoke-direct {v2}, Lcom/roidapp/imagelib/retouch/m;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    .line 1184
    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/retouch/m;->setArguments(Landroid/os/Bundle;)V

    .line 1185
    const v1, 0x7f0d005e

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    const-string v3, "skin"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 1186
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 164
    :cond_6
    :goto_3
    const v0, 0x7f0d02a4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->i:Landroid/widget/TextView;

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    const v0, 0x7f0d02a1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->h:Landroid/widget/TextView;

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 168
    const v0, 0x7f0d02a3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    const v0, 0x7f0d02a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->j:Landroid/widget/RelativeLayout;

    goto/16 :goto_0

    .line 1188
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "skin"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/retouch/m;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->d:Lcom/roidapp/imagelib/retouch/m;

    goto :goto_3

    .line 138
    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 398
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 399
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->d()V

    .line 401
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 386
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 388
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 380
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 382
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 96
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 97
    const-string v0, "RetouchPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 98
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 102
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 103
    const-string v0, "RetouchPage"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 104
    return-void
.end method

.method public final q_()V
    .locals 3

    .prologue
    .line 352
    iget v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->c()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020411

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    .line 354
    iget-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->e:Lcom/roidapp/imagelib/retouch/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/retouch/a;->d()Z

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/RetouchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203dd

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(ZLandroid/graphics/drawable/Drawable;Landroid/widget/TextView;)V

    .line 356
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 370
    const-string v0, "retouch"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/RetouchActivity;->t:Ljava/lang/String;

    .line 371
    return-void
.end method
