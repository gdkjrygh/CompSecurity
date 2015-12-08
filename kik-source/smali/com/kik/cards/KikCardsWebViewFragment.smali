.class public abstract Lcom/kik/cards/KikCardsWebViewFragment;
.super Lcom/kik/cards/web/CardsWebViewFragment;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/config/a;
.implements Lcom/kik/cards/web/kik/b;
.implements Lcom/kik/cards/web/userdata/a;


# instance fields
.field private x:Z

.field private y:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 50
    invoke-direct {p0}, Lcom/kik/cards/web/CardsWebViewFragment;-><init>()V

    .line 44
    iput-boolean v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->x:Z

    .line 46
    iput-boolean v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->y:Z

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/KikCardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->P()V

    return-void
.end method

.method static synthetic a(Lcom/kik/cards/KikCardsWebViewFragment;Z)Z
    .locals 0

    .prologue
    .line 42
    iput-boolean p1, p0, Lcom/kik/cards/KikCardsWebViewFragment;->x:Z

    return p1
.end method


# virtual methods
.method public final a(Lkik/a/e/r;)Lcom/kik/cards/web/kik/h;
    .locals 1

    .prologue
    .line 74
    new-instance v0, Lkik/android/b/k;

    invoke-direct {v0, p0, p1}, Lkik/android/b/k;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/a/e/r;)V

    return-object v0
.end method

.method public final a()Lcom/kik/cards/web/userdata/e;
    .locals 4

    .prologue
    .line 80
    new-instance v0, Lkik/android/b/m;

    iget-object v1, p0, Lcom/kik/cards/KikCardsWebViewFragment;->t:Lkik/android/b/s;

    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->i()Lcom/kik/cards/web/av;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/KikCardsWebViewFragment;->m:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lkik/android/b/m;-><init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/android/b/s;Lcom/kik/cards/web/av;Lkik/a/d/aa;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 166
    const v0, 0x7f090193

    invoke-virtual {p0, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 167
    const v1, 0x7f090299

    invoke-virtual {p0, v1}, Lcom/kik/cards/KikCardsWebViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 168
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 169
    new-instance v3, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v3}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 170
    const v4, 0x7f0902a0

    invoke-virtual {p0, v4}, Lcom/kik/cards/KikCardsWebViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    .line 171
    const v4, 0x7f090057

    invoke-virtual {p0, v4}, Lcom/kik/cards/KikCardsWebViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v3, v7}, Lkik/android/chat/fragment/KikDialogFragment;->setCancelable(Z)V

    .line 173
    invoke-virtual {v3}, Lkik/android/chat/fragment/KikDialogFragment;->d()Lcom/kik/g/p;

    move-result-object v4

    new-instance v5, Lcom/kik/cards/d;

    invoke-direct {v5, p0, v2}, Lcom/kik/cards/d;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v4, v5}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 180
    new-instance v4, Lcom/kik/cards/e;

    invoke-direct {v4, p0, v2}, Lcom/kik/cards/e;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v3, v0, v4}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 188
    new-instance v0, Lcom/kik/cards/f;

    invoke-direct {v0, p0, v2}, Lcom/kik/cards/f;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v3, v1, v0}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 196
    new-instance v0, Lcom/kik/cards/g;

    invoke-direct {v0, p0, v2}, Lcom/kik/cards/g;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;Lcom/kik/g/p;)V

    invoke-virtual {v3, v0}, Lkik/android/chat/fragment/KikDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 203
    invoke-virtual {p0, v3}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 204
    return-object v2
.end method

.method public final a(Lcom/kik/cards/web/usermedia/b;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 92
    const v0, 0x7f090193

    invoke-virtual {p0, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-virtual {p1}, Lcom/kik/cards/web/usermedia/b;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    new-instance v5, Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p1}, Lcom/kik/cards/web/usermedia/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 98
    invoke-virtual {v5}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    .line 99
    invoke-virtual {v5, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 101
    invoke-virtual {p0, v5}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 106
    :goto_0
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 107
    new-instance v0, Lcom/kik/cards/a;

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/kik/cards/a;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;Landroid/app/Activity;Lcom/kik/cards/web/usermedia/b;Ljava/lang/String;Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-virtual {p1, v0}, Lcom/kik/cards/web/usermedia/b;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 157
    return-void

    .line 104
    :cond_0
    const/4 v5, 0x0

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 67
    invoke-super {p0, p1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Z)V

    .line 68
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->y:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->c(Z)V

    .line 69
    return-void

    .line 68
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Lkik/android/d/c;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->t()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    .line 225
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->getView()Landroid/view/View;

    move-result-object v0

    .line 226
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 227
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 228
    new-instance v2, Lcom/kik/cards/h;

    invoke-direct {v2, p0, p1, v1}, Lcom/kik/cards/h;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;ZLandroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 240
    new-instance v1, Lcom/kik/cards/i;

    invoke-direct {v1, p0}, Lcom/kik/cards/i;-><init>(Lcom/kik/cards/KikCardsWebViewFragment;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 250
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->w:Lkik/android/widget/cw;

    if-nez v0, :cond_0

    .line 275
    const/4 v0, 0x0

    .line 278
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->w:Lkik/android/widget/cw;

    invoke-virtual {v0, p1}, Lkik/android/widget/cw;->a(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public final c()Lcom/kik/m/a;
    .locals 2

    .prologue
    .line 210
    new-instance v0, Lkik/android/util/bg;

    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->t()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 268
    iget-boolean v0, p0, Lcom/kik/cards/KikCardsWebViewFragment;->x:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 6

    .prologue
    .line 294
    invoke-static {}, Lkik/android/chat/activity/k;->d()Ljava/util/List;

    move-result-object v1

    .line 295
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    .line 296
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 298
    new-instance v3, Lkik/android/chat/activity/k$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v5, v0}, Lkik/android/chat/activity/k$a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const/4 v0, 0x2

    if-lt v2, v0, :cond_0

    add-int/lit8 v0, v2, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/activity/k$a;

    invoke-virtual {v0, v3}, Lkik/android/chat/activity/k$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    :cond_0
    const/4 v0, 0x0

    .line 304
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final f()Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 310
    invoke-static {}, Lkik/android/chat/activity/k;->d()Ljava/util/List;

    move-result-object v2

    .line 311
    invoke-virtual {p0}, Lcom/kik/cards/KikCardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    .line 312
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 314
    new-instance v4, Lkik/android/chat/activity/k$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v5, v6, v0}, Lkik/android/chat/activity/k$a;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const/4 v0, 0x2

    if-ge v3, v0, :cond_0

    move v0, v1

    .line 322
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, v3, -0x2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/activity/k$a;

    invoke-virtual {v0, v4}, Lkik/android/chat/activity/k$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/kik/cards/web/video/b;->a()Lcom/kik/cards/web/video/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->m()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method
