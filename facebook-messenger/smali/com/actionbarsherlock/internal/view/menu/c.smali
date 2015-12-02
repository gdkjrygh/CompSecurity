.class public final Lcom/actionbarsherlock/internal/view/menu/c;
.super Ljava/lang/Object;
.source "MenuItemImpl.java"

# interfaces
.implements Lcom/actionbarsherlock/a/b;


# static fields
.field private static r:Ljava/lang/String;

.field private static s:Ljava/lang/String;

.field private static t:Ljava/lang/String;

.field private static u:Ljava/lang/String;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private e:Ljava/lang/CharSequence;

.field private f:Ljava/lang/CharSequence;

.field private g:Landroid/content/Intent;

.field private h:C

.field private i:C

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:I

.field private l:Lcom/actionbarsherlock/internal/view/menu/a;

.field private m:Lcom/actionbarsherlock/internal/view/menu/l;

.field private n:Ljava/lang/Runnable;

.field private o:Lcom/actionbarsherlock/a/c;

.field private p:I

.field private q:Landroid/view/ContextMenu$ContextMenuInfo;


# direct methods
.method constructor <init>(Lcom/actionbarsherlock/internal/view/menu/a;IIIILjava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->k:I

    .line 64
    const/16 v0, 0x10

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 113
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    .line 114
    iput p3, p0, Lcom/actionbarsherlock/internal/view/menu/c;->a:I

    .line 115
    iput p2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->b:I

    .line 116
    iput p4, p0, Lcom/actionbarsherlock/internal/view/menu/c;->c:I

    .line 117
    iput p5, p0, Lcom/actionbarsherlock/internal/view/menu/c;->d:I

    .line 118
    iput-object p6, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    .line 119
    return-void
.end method


# virtual methods
.method public a(C)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 209
    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->i:C

    if-ne v0, p1, :cond_0

    .line 215
    :goto_0
    return-object p0

    .line 211
    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    iput-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->i:C

    .line 213
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    goto :goto_0
.end method

.method public a(CC)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 233
    iput-char p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->h:C

    .line 234
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    iput-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->i:C

    .line 236
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 238
    return-object p0
.end method

.method public a(I)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Intent;)Lcom/actionbarsherlock/a/b;
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->g:Landroid/content/Intent;

    .line 192
    return-object p0
.end method

.method public a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 371
    iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->k:I

    .line 372
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->j:Landroid/graphics/drawable/Drawable;

    .line 373
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 375
    return-object p0
.end method

.method public a(Lcom/actionbarsherlock/a/c;)Lcom/actionbarsherlock/a/b;
    .locals 0

    .prologue
    .line 463
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->o:Lcom/actionbarsherlock/a/c;

    .line 464
    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 326
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    .line 328
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 330
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->m:Lcom/actionbarsherlock/internal/view/menu/l;

    if-eqz v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->m:Lcom/actionbarsherlock/internal/view/menu/l;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/l;->d(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    .line 334
    :cond_0
    return-object p0
.end method

.method public a(Z)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 158
    if-eqz p1, :cond_0

    .line 159
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 164
    :goto_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 166
    return-object p0

    .line 161
    :cond_0
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    goto :goto_0
.end method

.method a(Lcom/actionbarsherlock/internal/view/menu/k;)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 320
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/actionbarsherlock/internal/view/menu/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/c;->p()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/c;->o()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0
.end method

.method a(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->q:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 474
    return-void
.end method

.method a(Lcom/actionbarsherlock/internal/view/menu/l;)V
    .locals 1

    .prologue
    .line 302
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->m:Lcom/actionbarsherlock/internal/view/menu/l;

    .line 304
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/c;->o()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/actionbarsherlock/internal/view/menu/l;->d(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    .line 305
    return-void
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 127
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->o:Lcom/actionbarsherlock/a/c;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->o:Lcom/actionbarsherlock/a/c;

    invoke-interface {v1, p0}, Lcom/actionbarsherlock/a/c;->a(Lcom/actionbarsherlock/a/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 150
    :cond_0
    :goto_0
    return v0

    .line 132
    :cond_1
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/a;->n()Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 136
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->n:Ljava/lang/Runnable;

    if-eqz v1, :cond_2

    .line 137
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->n:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 141
    :cond_2
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->g:Landroid/content/Intent;

    if-eqz v1, :cond_3

    .line 143
    :try_start_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/a;->g()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->g:Landroid/content/Intent;

    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    .line 146
    const-string v1, "MenuItemImpl"

    const-string v2, "Can\'t find activity to handle intent; ignoring"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 150
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(C)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 223
    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->h:C

    if-ne v0, p1, :cond_0

    .line 229
    :goto_0
    return-object p0

    .line 225
    :cond_0
    iput-char p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->h:C

    .line 227
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    goto :goto_0
.end method

.method public b(I)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 379
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->j:Landroid/graphics/drawable/Drawable;

    .line 380
    iput p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->k:I

    .line 383
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 385
    return-object p0
.end method

.method public b(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    .line 346
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->f:Ljava/lang/CharSequence;

    .line 349
    if-nez p1, :cond_0

    .line 350
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    .line 353
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 355
    return-object p0
.end method

.method public b(Z)Lcom/actionbarsherlock/a/b;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 393
    iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 394
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v3, v0, -0x2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    or-int/2addr v0, v3

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 395
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    if-eq v2, v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 399
    :cond_0
    return-object p0

    :cond_1
    move v0, v1

    .line 394
    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 154
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 170
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->b:I

    return v0
.end method

.method public c(Z)V
    .locals 2

    .prologue
    .line 403
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v1, v0, -0x5

    if-eqz p1, :cond_0

    const/4 v0, 0x4

    :goto_0
    or-int/2addr v0, v1

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 404
    return-void

    .line 403
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 175
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->a:I

    return v0
.end method

.method public d(Z)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 415
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 418
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/a/b;)V

    .line 423
    :goto_0
    return-object p0

    .line 420
    :cond_0
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/c;->e(Z)V

    goto :goto_0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 179
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->c:I

    return v0
.end method

.method e(Z)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 427
    iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 428
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v3, v0, -0x3

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v3

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 429
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    if-eq v2, v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 432
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 428
    goto :goto_0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 183
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->d:I

    return v0
.end method

.method f(Z)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 448
    iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 449
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v3, v0, -0x9

    if-eqz p1, :cond_1

    move v0, v1

    :goto_0
    or-int/2addr v0, v3

    iput v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    .line 450
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    if-eq v2, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    .line 449
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public g()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->g:Landroid/content/Intent;

    return-object v0
.end method

.method public g(Z)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 457
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/c;->f(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/c;)V

    .line 459
    :cond_0
    return-object p0
.end method

.method public h()C
    .locals 1

    .prologue
    .line 205
    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->i:C

    return v0
.end method

.method public i()C
    .locals 1

    .prologue
    .line 219
    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->h:C

    return v0
.end method

.method j()C
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->i:C

    :goto_0
    return v0

    :cond_0
    iget-char v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->h:C

    goto :goto_0
.end method

.method k()Ljava/lang/String;
    .locals 3

    .prologue
    .line 255
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/c;->j()C

    move-result v0

    .line 256
    if-nez v0, :cond_0

    .line 257
    const-string v0, ""

    .line 280
    :goto_0
    return-object v0

    .line 260
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/actionbarsherlock/internal/view/menu/c;->r:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    sparse-switch v0, :sswitch_data_0

    .line 276
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 280
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 264
    :sswitch_0
    sget-object v0, Lcom/actionbarsherlock/internal/view/menu/c;->s:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 268
    :sswitch_1
    sget-object v0, Lcom/actionbarsherlock/internal/view/menu/c;->t:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 272
    :sswitch_2
    sget-object v0, Lcom/actionbarsherlock/internal/view/menu/c;->u:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 261
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xa -> :sswitch_0
        0x20 -> :sswitch_2
    .end sparse-switch
.end method

.method l()Z
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/c;->j()C

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->m:Lcom/actionbarsherlock/internal/view/menu/l;

    return-object v0
.end method

.method public n()Z
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->m:Lcom/actionbarsherlock/internal/view/menu/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public o()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 309
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public p()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->f:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->f:Ljava/lang/CharSequence;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    goto :goto_0
.end method

.method public q()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 359
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->j:Landroid/graphics/drawable/Drawable;

    .line 367
    :goto_0
    return-object v0

    .line 363
    :cond_0
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->k:I

    if-eqz v0, :cond_1

    .line 364
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->f()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->k:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 367
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public r()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 389
    iget v1, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s()Z
    .locals 1

    .prologue
    .line 407
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public t()Z
    .locals 2

    .prologue
    .line 411
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    .prologue
    .line 435
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->p:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public v()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->q:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public w()Z
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/c;->l:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->o()Z

    move-result v0

    return v0
.end method
