.class public Lcom/facebook/orca/broadcast/BroadcastActivity;
.super Lcom/facebook/base/activity/i;
.source "BroadcastActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/activity/c;


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Lcom/facebook/orca/broadcast/i;

.field private B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private q:Landroid/support/v4/app/q;

.field private r:Landroid/view/inputmethod/InputMethodManager;

.field private s:Lcom/facebook/orca/f/n;

.field private t:Lcom/facebook/orca/f/k;

.field private u:Lcom/facebook/common/e/h;

.field private v:Lcom/facebook/orca/photos/b/k;

.field private w:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lcom/facebook/analytics/av;

.field private y:Lcom/facebook/orca/common/a/b;

.field private z:Lcom/facebook/widget/titlebar/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 90
    const-class v0, Lcom/facebook/orca/broadcast/BroadcastActivity;

    sput-object v0, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 85
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/server/SendBroadcastResult;)Ljava/util/List;
    .locals 1

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/server/SendBroadcastResult;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/server/SendBroadcastResult;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/server/SendBroadcastResult;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 642
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 643
    invoke-virtual {p1}, Lcom/facebook/orca/server/SendBroadcastResult;->a()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 644
    invoke-virtual {p1}, Lcom/facebook/orca/server/SendBroadcastResult;->a()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;

    .line 646
    iget v1, v1, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->a:I

    if-eqz v1, :cond_0

    .line 649
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 651
    :cond_1
    return-object v2
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->z()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/broadcast/i;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/i;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/BroadcastActivity;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/broadcast/i;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 224
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    if-eq v1, p1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v1}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 247
    :cond_0
    :goto_0
    return-void

    .line 231
    :cond_1
    sget-object v1, Lcom/facebook/orca/broadcast/h;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/broadcast/i;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 239
    sget-object v1, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    const-string v2, "Unknown DynamicFragmentType: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/orca/broadcast/i;->name()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_1
    if-eqz v0, :cond_0

    .line 245
    iput-object p1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    goto :goto_0

    .line 233
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->l()Z

    move-result v0

    goto :goto_1

    .line 236
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->m()Z

    move-result v0

    goto :goto_1

    .line 231
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 617
    new-instance v0, Lcom/facebook/analytics/cb;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "participant_count"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 623
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->x:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 624
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 655
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 656
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 657
    new-instance v3, Lcom/facebook/user/UserKey;

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-direct {v3, v4, v0}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    .line 658
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->t:Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 659
    if-eqz v0, :cond_0

    .line 662
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 664
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    sget-object v2, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    iget-object v2, v2, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    .line 666
    if-nez v0, :cond_2

    .line 671
    :goto_1
    return-void

    .line 669
    :cond_2
    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Ljava/util/List;)V

    .line 670
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->u()V

    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/broadcast/i;Lcom/facebook/orca/broadcast/j;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 327
    iget-object v2, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    iget-object v3, p1, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 329
    if-nez v2, :cond_1

    .line 330
    sget-object v2, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    const-string v3, "Can\'t find fragment to show. Tag %s."

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    aput-object v4, v1, v0

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    :cond_0
    :goto_0
    return v0

    .line 334
    :cond_1
    iget-object v3, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v3}, Landroid/support/v4/app/q;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 338
    iget-object v3, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v3}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v3

    .line 339
    sget-object v4, Lcom/facebook/orca/broadcast/j;->FROM_RIGHT:Lcom/facebook/orca/broadcast/j;

    if-ne p2, v4, :cond_4

    .line 340
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->y()V

    .line 341
    sget v4, Lcom/facebook/b;->in_from_right:I

    sget v5, Lcom/facebook/b;->out_to_left:I

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/ad;->a(II)Landroid/support/v4/app/ad;

    .line 347
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    if-eqz v4, :cond_3

    .line 348
    iget-object v4, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    iget-object v5, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    iget-object v5, v5, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 349
    if-eqz v4, :cond_5

    .line 350
    invoke-virtual {v3, v4}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 355
    :cond_3
    :goto_2
    invoke-virtual {v3, v2}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 356
    invoke-virtual {v3}, Landroid/support/v4/app/ad;->a()I

    .line 357
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    move v0, v1

    .line 358
    goto :goto_0

    .line 342
    :cond_4
    sget-object v4, Lcom/facebook/orca/broadcast/j;->FROM_LEFT:Lcom/facebook/orca/broadcast/j;

    if-ne p2, v4, :cond_2

    .line 343
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->y()V

    goto :goto_1

    .line 352
    :cond_5
    sget-object v4, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    const-string v5, "Can\'t find old fragment to hide. Tag: %s."

    new-array v6, v1, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    invoke-virtual {v7}, Lcom/facebook/orca/broadcast/i;->name()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-static {v4, v5, v6}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/facebook/orca/broadcast/BroadcastActivity;)Lcom/facebook/common/e/h;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->u:Lcom/facebook/common/e/h;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/broadcast/BroadcastActivity;)Lcom/facebook/orca/broadcast/i;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->w()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->u()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->y()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 71
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onBackPressed()V

    return-void
.end method

.method static synthetic j()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    return-object v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    .line 219
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    .line 220
    invoke-direct {p0, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/i;)V

    .line 221
    return-void
.end method

.method private l()Z
    .locals 2

    .prologue
    .line 250
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->u()V

    .line 251
    sget-object v0, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    sget-object v1, Lcom/facebook/orca/broadcast/j;->FROM_LEFT:Lcom/facebook/orca/broadcast/j;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/i;Lcom/facebook/orca/broadcast/j;)Z

    move-result v0

    .line 255
    if-eqz v0, :cond_0

    .line 256
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->s()V

    .line 258
    :cond_0
    return v0
.end method

.method private m()Z
    .locals 2

    .prologue
    .line 262
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->n()Z

    move-result v0

    if-nez v0, :cond_1

    .line 263
    const/4 v0, 0x0

    .line 274
    :cond_0
    :goto_0
    return v0

    .line 265
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->o()V

    .line 267
    sget-object v0, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    sget-object v1, Lcom/facebook/orca/broadcast/j;->FROM_RIGHT:Lcom/facebook/orca/broadcast/j;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/i;Lcom/facebook/orca/broadcast/j;)Z

    move-result v0

    .line 271
    if-eqz v0, :cond_0

    .line 272
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->t()V

    goto :goto_0
.end method

.method private n()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 278
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->p()Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    move-result-object v1

    .line 279
    if-eqz v1, :cond_0

    .line 296
    :goto_0
    return v0

    .line 282
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v1}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 283
    const/4 v0, 0x0

    goto :goto_0

    .line 286
    :cond_1
    new-instance v1, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;-><init>()V

    .line 287
    iget-object v2, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 288
    sget v3, Lcom/facebook/i;->broadcast_content_container:I

    sget-object v4, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    iget-object v4, v4, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v2, v3, v1, v4}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 293
    invoke-virtual {v2, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 294
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 295
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v1}, Landroid/support/v4/app/q;->b()Z

    goto :goto_0
.end method

.method private o()V
    .locals 2

    .prologue
    .line 300
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->p()Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    move-result-object v0

    .line 301
    if-nez v0, :cond_0

    .line 302
    sget-object v0, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    const-string v1, "setupContactMultipickerFragment: fragment not found"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 316
    :goto_0
    return-void

    .line 305
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d()V

    .line 307
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a()Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    move-result-object v0

    .line 309
    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->e(I)V

    .line 310
    sget v1, Lcom/facebook/o;->broadcast_max_recipients_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->f(I)V

    .line 311
    sget v1, Lcom/facebook/o;->broadcast_max_recipients_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->g(I)V

    .line 313
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->P()V

    .line 314
    sget-object v1, Lcom/facebook/orca/contacts/picker/y;->CREATE_THREAD:Lcom/facebook/orca/contacts/picker/y;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/y;)V

    .line 315
    sget v1, Lcom/facebook/o;->name_search_hint:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private p()Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;
    .locals 2

    .prologue
    .line 319
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    sget-object v1, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    iget-object v1, v1, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    return-object v0
.end method

.method private q()V
    .locals 6

    .prologue
    .line 362
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v1

    .line 363
    invoke-static {}, Lcom/facebook/orca/broadcast/i;->values()[Lcom/facebook/orca/broadcast/i;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    .line 364
    iget-object v5, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    if-ne v4, v5, :cond_1

    .line 363
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 367
    :cond_1
    iget-object v5, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    iget-object v4, v4, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v5, v4}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 368
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/v4/app/Fragment;->w()Z

    move-result v5

    if-nez v5, :cond_0

    .line 369
    invoke-virtual {v1, v4}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    goto :goto_1

    .line 372
    :cond_2
    invoke-virtual {v1}, Landroid/support/v4/app/ad;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 373
    invoke-virtual {v1}, Landroid/support/v4/app/ad;->a()I

    .line 374
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 376
    :cond_3
    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    .line 445
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 446
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    .line 447
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    new-instance v1, Lcom/facebook/orca/broadcast/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/broadcast/d;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setOnToolbarButtonListener(Lcom/facebook/widget/titlebar/b;)V

    .line 468
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setHasProgressBar(Z)V

    .line 469
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setCustomTitleView(Landroid/view/View;)V

    .line 470
    return-void
.end method

.method private s()V
    .locals 3

    .prologue
    .line 473
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->broadcast_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 474
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->send_broadcast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v1, "broadcast_send"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->b(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v0

    .line 480
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    .line 481
    return-void
.end method

.method private t()V
    .locals 3

    .prologue
    .line 484
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->choose_friends_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 485
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->done_add_friends_to_broadcast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v1, "edit_done_contact_button"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->b(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v0

    .line 491
    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->z:Lcom/facebook/widget/titlebar/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    .line 492
    return-void
.end method

.method private u()V
    .locals 2

    .prologue
    .line 495
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->v()Lcom/google/common/a/es;

    move-result-object v0

    .line 496
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 497
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->x()Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a()V

    .line 501
    :goto_0
    return-void

    .line 499
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->x()Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a(Lcom/google/common/a/es;)V

    goto :goto_0
.end method

.method private v()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserWithIdentifier;",
            ">;"
        }
    .end annotation

    .prologue
    .line 504
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    sget-object v1, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    iget-object v1, v1, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    .line 506
    if-nez v0, :cond_0

    .line 507
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 514
    :goto_0
    return-object v0

    .line 509
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a()Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    move-result-object v0

    .line 511
    if-nez v0, :cond_1

    .line 512
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 514
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method private w()V
    .locals 14

    .prologue
    const-wide/16 v6, -0x1

    const/4 v3, 0x0

    .line 565
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->x()Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    move-result-object v5

    .line 567
    invoke-virtual {v5}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->v()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 614
    :cond_0
    :goto_0
    return-void

    .line 573
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->w:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 574
    invoke-virtual {v5}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 575
    iget-object v2, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->v:Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/b/k;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;

    move-result-object v0

    .line 577
    iget-object v0, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v2, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    if-eq v0, v2, :cond_2

    .line 579
    sget v0, Lcom/facebook/o;->attachment_upload_not_complete:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 587
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->s:Lcom/facebook/orca/f/n;

    const/16 v1, 0x384

    sget-object v2, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v5}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Lcom/facebook/location/Coordinates;->a(Landroid/location/Location;)Lcom/facebook/location/Coordinates;

    move-result-object v10

    invoke-virtual {v5}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d()Ljava/util/List;

    move-result-object v11

    const-string v5, "broadcast_id"

    iget-object v8, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->y:Lcom/facebook/orca/common/a/b;

    invoke-virtual {v8}, Lcom/facebook/orca/common/a/b;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v13

    move-object v5, v3

    move-wide v8, v6

    move-object v12, v3

    invoke-virtual/range {v0 .. v13}, Lcom/facebook/orca/f/n;->a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 601
    new-instance v1, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->v()Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/user/RecipientInfo;->a(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v1, v3, v0, v2}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;-><init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Ljava/util/List;)V

    .line 606
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 607
    const-string v3, "broadcastMessageParams"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 608
    const-string v3, "broadcast_created"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    const-string v4, "broadcast_id"

    invoke-virtual {v0, v4}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 613
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v1, Lcom/facebook/orca/server/aq;->f:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto/16 :goto_0
.end method

.method private x()Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;
    .locals 2

    .prologue
    .line 628
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    sget-object v1, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    iget-object v1, v1, Lcom/facebook/orca/broadcast/i;->fragmentTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    return-object v0
.end method

.method private y()V
    .locals 3

    .prologue
    .line 633
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->r:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 634
    return-void
.end method

.method private z()V
    .locals 0

    .prologue
    .line 637
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->y()V

    .line 638
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->finish()V

    .line 639
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 380
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/support/v4/app/Fragment;)V

    .line 382
    instance-of v0, p1, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    if-eqz v0, :cond_1

    .line 383
    check-cast p1, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    .line 384
    new-instance v0, Lcom/facebook/orca/broadcast/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/broadcast/b;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    invoke-virtual {p1, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 392
    new-instance v0, Lcom/facebook/orca/broadcast/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/broadcast/c;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    invoke-virtual {p1, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a(Lcom/facebook/orca/broadcast/q;)V

    .line 408
    :cond_0
    :goto_0
    return-void

    .line 401
    :cond_1
    instance-of v0, p1, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    if-eqz v0, :cond_0

    .line 402
    check-cast p1, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    .line 403
    const/high16 v0, 0x42700000    # 60.0f

    invoke-static {p0, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e(I)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/activity/d;)V
    .locals 3

    .prologue
    .line 537
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->x()Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/facebook/orca/activity/d;->a(Z)V

    .line 562
    :goto_0
    return-void

    .line 542
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 543
    sget v1, Lcom/facebook/o;->compose_discard_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 544
    sget v1, Lcom/facebook/o;->compose_discard_dialog_message:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 545
    sget v1, Lcom/facebook/o;->compose_discard_dialog_no_button:I

    new-instance v2, Lcom/facebook/orca/broadcast/f;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/broadcast/f;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 553
    sget v1, Lcom/facebook/o;->compose_discard_dialog_discard_button:I

    new-instance v2, Lcom/facebook/orca/broadcast/g;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/broadcast/g;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 561
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 117
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 118
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 119
    const-class v0, Landroid/support/v4/app/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/q;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->q:Landroid/support/v4/app/q;

    .line 120
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->r:Landroid/view/inputmethod/InputMethodManager;

    .line 121
    const-class v0, Lcom/facebook/orca/f/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/n;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->s:Lcom/facebook/orca/f/n;

    .line 122
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->t:Lcom/facebook/orca/f/k;

    .line 123
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->u:Lcom/facebook/common/e/h;

    .line 124
    const-class v0, Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/k;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->v:Lcom/facebook/orca/photos/b/k;

    .line 125
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsNewPhotoUploadEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->w:Ljavax/inject/a;

    .line 126
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->x:Lcom/facebook/analytics/av;

    .line 127
    const-class v0, Lcom/facebook/orca/common/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/a/b;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->y:Lcom/facebook/orca/common/a/b;

    .line 129
    sget v0, Lcom/facebook/k;->broadcast_activity:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->setContentView(I)V

    .line 131
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->r()V

    .line 133
    const/4 v0, 0x0

    .line 134
    if-eqz p1, :cond_0

    .line 135
    const-string v0, "dynamic_fragment_type"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 138
    :cond_0
    if-eqz v0, :cond_1

    .line 139
    invoke-static {v0}, Lcom/facebook/orca/broadcast/i;->valueOf(Ljava/lang/String;)Lcom/facebook/orca/broadcast/i;

    move-result-object v0

    .line 143
    :goto_0
    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    .line 146
    const-string v0, "createThreadUiOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    sget v2, Lcom/facebook/o;->create_thread_progress:I

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->B:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/broadcast/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/broadcast/a;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 210
    return-void

    .line 141
    :cond_1
    sget-object v0, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    goto :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 214
    sget-object v0, Lcom/facebook/analytics/f/a;->CREATE_BROADCAST_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 519
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    sget-object v1, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    if-ne v0, v1, :cond_0

    .line 520
    sget-object v0, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    invoke-direct {p0, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/i;)V

    .line 533
    :goto_0
    return-void

    .line 524
    :cond_0
    new-instance v0, Lcom/facebook/orca/broadcast/e;

    invoke-direct {v0, p0}, Lcom/facebook/orca/broadcast/e;-><init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/activity/d;)V

    goto :goto_0
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 426
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onPause()V

    .line 427
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 420
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 422
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 431
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 433
    iget-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    if-nez v0, :cond_0

    .line 434
    sget-object v0, Lcom/facebook/orca/broadcast/BroadcastActivity;->p:Ljava/lang/Class;

    const-string v1, "state should not be null, defaulting to %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    invoke-virtual {v4}, Lcom/facebook/orca/broadcast/i;->name()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    sget-object v0, Lcom/facebook/orca/broadcast/i;->COMPOSE_BROADCAST:Lcom/facebook/orca/broadcast/i;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    .line 441
    :cond_0
    const-string v0, "dynamic_fragment_type"

    iget-object v1, p0, Lcom/facebook/orca/broadcast/BroadcastActivity;->A:Lcom/facebook/orca/broadcast/i;

    invoke-virtual {v1}, Lcom/facebook/orca/broadcast/i;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 412
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onStart()V

    .line 414
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->q()V

    .line 415
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/BroadcastActivity;->k()V

    .line 416
    return-void
.end method
