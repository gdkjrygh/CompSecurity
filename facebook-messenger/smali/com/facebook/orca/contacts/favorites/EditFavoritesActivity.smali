.class public Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;
.super Lcom/facebook/base/activity/i;
.source "EditFavoritesActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# static fields
.field private static final q:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private D:Z

.field private E:Lcom/facebook/widget/listview/g;

.field p:Lcom/facebook/contacts/picker/v;

.field private r:Lcom/facebook/orca/contacts/favorites/aa;

.field private s:Lcom/facebook/contacts/a/d;

.field private t:Lcom/facebook/orca/contacts/divebar/ao;

.field private u:Lcom/facebook/orca/contacts/divebar/e;

.field private v:Lcom/facebook/analytics/av;

.field private w:Lcom/facebook/fbservice/ops/k;

.field private x:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private y:Lcom/facebook/fbservice/ops/aa;

.field private z:Lcom/facebook/orca/contacts/favorites/ac;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    const-class v0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    sput-object v0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->q:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->D:Z

    .line 217
    new-instance v0, Lcom/facebook/orca/contacts/favorites/n;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/favorites/n;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->E:Lcom/facebook/widget/listview/g;

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->x:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 335
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->v:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "update_favorites_success"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 339
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 340
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 341
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 343
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->s:Lcom/facebook/contacts/a/d;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/a/d;->a(Lcom/google/common/a/es;)V

    .line 344
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->D:Z

    .line 345
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->finish()V

    .line 346
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 4

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->v:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "update_favorites_failed"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "reason"

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 353
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->save_favorites_failed:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(Ljava/lang/String;)Lcom/facebook/ui/d/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/favorites/q;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/q;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(Landroid/content/DialogInterface$OnClickListener;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 363
    return-void
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 2

    .prologue
    .line 198
    if-nez p1, :cond_1

    .line 215
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 204
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    .line 205
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->C:Ljava/util/List;

    .line 206
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->o()V

    .line 209
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->g()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ag;->a(I)Landroid/support/v4/a/c;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/a/c;->k()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->b(Lcom/facebook/user/User;)V

    return-void
.end method

.method private a(Lcom/facebook/user/User;)V
    .locals 3

    .prologue
    .line 241
    new-instance v0, Lcom/facebook/orca/contacts/favorites/o;

    invoke-direct {v0, p0, p1}, Lcom/facebook/orca/contacts/favorites/o;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/user/User;)V

    .line 257
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 258
    sget v2, Lcom/facebook/o;->favorites_delete_contact_prompt:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_yes:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_no:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 262
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/orca/contacts/favorites/ac;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/user/User;)V

    return-void
.end method

.method private b(Lcom/facebook/user/User;)V
    .locals 2

    .prologue
    .line 266
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->n()V

    .line 268
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->o()V

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 272
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->A:Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    invoke-virtual {v1}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->getFirstVisiblePosition()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 273
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->A:Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->smoothScrollToPosition(I)V

    .line 275
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/orca/contacts/divebar/ao;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->t:Lcom/facebook/orca/contacts/divebar/ao;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->n()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->o()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/fbservice/ops/aa;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->y:Lcom/facebook/fbservice/ops/aa;

    return-object v0
.end method

.method static synthetic j()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->q:Ljava/lang/Class;

    return-object v0
.end method

.method private k()V
    .locals 4

    .prologue
    .line 171
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->g()Landroid/support/v4/app/ag;

    move-result-object v0

    .line 172
    const/4 v1, 0x1

    const/4 v2, 0x0

    new-instance v3, Lcom/facebook/orca/contacts/favorites/m;

    invoke-direct {v3, p0}, Lcom/facebook/orca/contacts/favorites/m;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 195
    return-void
.end method

.method private l()V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ac;->e()V

    .line 232
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->D:Z

    if-eqz v0, :cond_0

    .line 233
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->p()V

    .line 237
    :goto_0
    return-void

    .line 235
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->finish()V

    goto :goto_0
.end method

.method private m()Lcom/google/common/a/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 278
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 280
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserFbidIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private n()V
    .locals 1

    .prologue
    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->D:Z

    .line 287
    return-void
.end method

.method private o()V
    .locals 8

    .prologue
    .line 290
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 292
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v3

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 295
    sget-object v0, Lcom/facebook/orca/contacts/picker/ar;->f:Lcom/facebook/contacts/picker/ad;

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 299
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 300
    new-instance v4, Lcom/facebook/orca/contacts/favorites/u;

    invoke-direct {v4, v0}, Lcom/facebook/orca/contacts/favorites/u;-><init>(Lcom/facebook/user/User;)V

    .line 301
    new-instance v0, Lcom/facebook/orca/contacts/favorites/p;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/favorites/p;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    invoke-virtual {v4, v0}, Lcom/facebook/orca/contacts/favorites/u;->a(Lcom/facebook/orca/contacts/favorites/v;)V

    .line 308
    invoke-virtual {v2, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 311
    :cond_1
    const/4 v0, 0x0

    .line 312
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->C:Ljava/util/List;

    if-eqz v1, :cond_4

    .line 313
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 314
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 316
    if-nez v1, :cond_2

    .line 317
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->e:Lcom/facebook/contacts/picker/ad;

    invoke-virtual {v2, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 318
    const/4 v1, 0x1

    .line 321
    :cond_2
    iget-object v5, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->p:Lcom/facebook/contacts/picker/v;

    new-instance v6, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v7

    invoke-direct {v6, v0, v7}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    invoke-interface {v5, v6}, Lcom/facebook/contacts/picker/v;->a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    :cond_3
    move v0, v1

    move v1, v0

    goto :goto_1

    .line 327
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->r:Lcom/facebook/orca/contacts/favorites/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/aa;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->m()Lcom/google/common/a/es;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/contacts/picker/u;->a(Lcom/google/common/a/es;)V

    .line 329
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 330
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/favorites/ac;->a(Lcom/google/common/a/es;)V

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->r:Lcom/facebook/orca/contacts/favorites/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetChanged()V

    .line 332
    return-void
.end method

.method private p()V
    .locals 4

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->v:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "update_favorites"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "favorite_count"

    iget-object v3, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 370
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 371
    const-string v1, "favorites"

    new-instance v2, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;

    iget-object v3, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    invoke-direct {v2, v3}, Lcom/facebook/contacts/server/UpdateFavoriteContactsParams;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 373
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->w:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->x:Lcom/google/common/d/a/s;

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->x:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/r;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 392
    new-instance v0, Lcom/facebook/fbservice/ops/aa;

    sget v1, Lcom/facebook/o;->updating_favorites:I

    invoke-direct {v0, p0, v1}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->y:Lcom/facebook/fbservice/ops/aa;

    .line 393
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->y:Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/aa;->a()V

    .line 394
    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 86
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 87
    sget v0, Lcom/facebook/k;->orca_edit_favorites:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->setContentView(I)V

    .line 89
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 90
    const-class v0, Lcom/facebook/contacts/a/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->s:Lcom/facebook/contacts/a/d;

    .line 91
    const-class v0, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/ao;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->t:Lcom/facebook/orca/contacts/divebar/ao;

    .line 92
    const-class v0, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->u:Lcom/facebook/orca/contacts/divebar/e;

    .line 93
    const-class v0, Lcom/facebook/orca/contacts/favorites/aa;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/favorites/aa;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->r:Lcom/facebook/orca/contacts/favorites/aa;

    .line 94
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->w:Lcom/facebook/fbservice/ops/k;

    .line 95
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->v:Lcom/facebook/analytics/av;

    .line 98
    new-instance v0, Lcom/facebook/orca/contacts/favorites/ac;

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->r:Lcom/facebook/orca/contacts/favorites/aa;

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/contacts/favorites/ac;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    new-instance v1, Lcom/facebook/orca/contacts/favorites/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/i;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/favorites/ac;->setOnDoneClickedListener(Lcom/facebook/orca/contacts/favorites/af;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    sget v1, Lcom/facebook/o;->name_search_hint:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/favorites/ac;->setSearchHint(Ljava/lang/String;)V

    .line 109
    sget v0, Lcom/facebook/i;->picker_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 110
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 113
    new-instance v0, Lcom/facebook/orca/contacts/favorites/j;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/favorites/j;-><init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->p:Lcom/facebook/contacts/picker/v;

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->r:Lcom/facebook/orca/contacts/favorites/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/aa;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->p:Lcom/facebook/contacts/picker/v;

    invoke-interface {v0, v1}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/v;)V

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->z:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ac;->getDraggableList()Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->A:Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->A:Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->E:Lcom/facebook/widget/listview/g;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/FavoritesDragSortListView;->setDropListener(Lcom/facebook/widget/listview/g;)V

    .line 155
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->s:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 157
    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->s:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->B:Ljava/util/List;

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->u:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_1

    .line 163
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->C:Ljava/util/List;

    .line 166
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->o()V

    .line 167
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->k()V

    .line 168
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 398
    sget-object v0, Lcom/facebook/analytics/f/a;->EDIT_MESSAGING_FAVORITES_ACTIVITY:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
