.class public Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;
.super Lcom/facebook/base/activity/o;
.source "ThreadViewMapActivityImpl.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/orca/threadview/cq;


# instance fields
.field private a:Lcom/facebook/orca/f/k;

.field private b:Lcom/facebook/config/a/a;

.field private c:Lcom/facebook/orca/threads/n;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/orca/threads/r;

.field private f:Lcom/facebook/orca/emoji/z;

.field private g:Lcom/facebook/analytics/av;

.field private h:Landroid/widget/FrameLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Lcom/facebook/user/tiles/UserTileView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Lcom/google/android/maps/MapView;

.field private o:Lcom/facebook/orca/threadview/ThreadViewFragment;

.field private p:Lcom/facebook/orca/threadview/ct;

.field private q:Lcom/facebook/orca/threadview/cu;

.field private r:Lcom/google/android/maps/MyLocationOverlay;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/base/activity/o;-><init>()V

    .line 375
    return-void
.end method

.method private a(Ljava/util/List;)Lcom/facebook/orca/threadview/cs;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/maps/GeoPoint;",
            ">;)",
            "Lcom/facebook/orca/threadview/cs;"
        }
    .end annotation

    .prologue
    const v5, 0x7fffffff

    const/high16 v4, -0x80000000

    .line 257
    .line 262
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v5

    move v2, v4

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/GeoPoint;

    .line 263
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v6

    if-ge v6, v3, :cond_1

    .line 264
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v3

    .line 266
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v6

    if-le v6, v2, :cond_2

    .line 267
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v2

    .line 269
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v6

    if-ge v6, v5, :cond_3

    .line 270
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v5

    .line 272
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v6

    if-le v6, v4, :cond_0

    .line 273
    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v4

    goto :goto_0

    .line 277
    :cond_4
    add-int v0, v3, v2

    div-int/lit8 v6, v0, 0x2

    .line 278
    add-int v0, v5, v4

    div-int/lit8 v7, v0, 0x2

    .line 280
    new-instance v0, Lcom/facebook/orca/threadview/cs;

    new-instance v1, Lcom/google/android/maps/GeoPoint;

    invoke-direct {v1, v6, v7}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/cs;-><init>(Lcom/google/android/maps/GeoPoint;IIII)V

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Lcom/google/android/maps/OverlayItem;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(Lcom/google/android/maps/OverlayItem;)V

    return-void
.end method

.method private a(Lcom/google/android/maps/OverlayItem;)V
    .locals 7

    .prologue
    const/16 v3, 0x8

    const/4 v6, 0x0

    .line 418
    if-nez p1, :cond_0

    .line 419
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 446
    :goto_0
    return-void

    :cond_0
    move-object v0, p1

    .line 422
    check-cast v0, Lcom/facebook/orca/threadview/cv;

    .line 423
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cv;->a()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 424
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 425
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->j:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {v1}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 426
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/google/android/maps/OverlayItem;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cv;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 429
    if-eqz v1, :cond_1

    .line 430
    new-instance v2, Landroid/text/SpannableStringBuilder;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->e:Lcom/facebook/orca/threads/r;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/threads/r;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 431
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->f:Lcom/facebook/orca/emoji/z;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->l:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTextSize()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v2, v4}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;I)V

    .line 432
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->l:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 433
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->l:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 434
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->m:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->c:Lcom/facebook/orca/threads/n;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/facebook/orca/threads/n;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 435
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->m:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 437
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->g:Lcom/facebook/analytics/av;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v4, "click"

    invoke-direct {v3, v4}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v4, "map_marker"

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "thread_id"

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cv;->a()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto/16 :goto_0

    .line 443
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 444
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-wide v11, 0x412e848000000000L    # 1000000.0

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 190
    :cond_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 191
    invoke-virtual {p2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 192
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v3

    .line 193
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 196
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 197
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 202
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    .line 203
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v8

    .line 204
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v9

    .line 205
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 206
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/user/UserKey;

    .line 207
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/messages/model/threads/Message;

    .line 208
    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    .line 209
    new-instance v2, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->b()D

    move-result-wide v3

    mul-double/2addr v3, v11

    double-to-int v1, v3

    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->c()D

    move-result-wide v3

    mul-double/2addr v3, v11

    double-to-int v3, v3

    invoke-direct {v2, v1, v3}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    .line 211
    invoke-virtual {v0}, Lcom/facebook/location/Coordinates;->f()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    .line 212
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a:Lcom/facebook/orca/f/k;

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 216
    new-instance v0, Lcom/facebook/orca/threadview/cv;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->e:Lcom/facebook/orca/threads/r;

    invoke-virtual {v1, v7}, Lcom/facebook/orca/threads/r;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v5

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/cv;-><init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Lcom/google/android/maps/GeoPoint;FLjava/lang/String;Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/facebook/messages/model/threads/Message;)V

    .line 218
    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 221
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->p:Lcom/facebook/orca/threadview/ct;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ct;->a()V

    .line 222
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->p:Lcom/facebook/orca/threadview/ct;

    invoke-virtual {v0, v9}, Lcom/facebook/orca/threadview/ct;->a(Ljava/util/List;)V

    .line 223
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->q:Lcom/facebook/orca/threadview/cu;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cu;->a()V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->q:Lcom/facebook/orca/threadview/cu;

    invoke-virtual {v0, v9}, Lcom/facebook/orca/threadview/cu;->a(Ljava/util/List;)V

    .line 227
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 228
    invoke-direct {p0, v8}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(Ljava/util/List;)Lcom/facebook/orca/threadview/cs;

    move-result-object v0

    .line 229
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v1}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v1

    .line 230
    iget-object v2, v0, Lcom/facebook/orca/threadview/cs;->a:Lcom/google/android/maps/GeoPoint;

    .line 231
    invoke-virtual {v1, v2}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    .line 233
    iget v2, v0, Lcom/facebook/orca/threadview/cs;->b:I

    iget v3, v0, Lcom/facebook/orca/threadview/cs;->c:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/16 v3, 0x2710

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 234
    iget v3, v0, Lcom/facebook/orca/threadview/cs;->d:I

    iget v0, v0, Lcom/facebook/orca/threadview/cs;->e:I

    sub-int v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 235
    invoke-virtual {v1, v2, v0}, Lcom/google/android/maps/MapController;->zoomToSpan(II)V

    .line 239
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    .line 240
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 241
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->r:Lcom/google/android/maps/MyLocationOverlay;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->q:Lcom/facebook/orca/threadview/cu;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->p:Lcom/facebook/orca/threadview/ct;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    new-instance v1, Lcom/facebook/orca/threadview/dq;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/threadview/dq;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->invalidate()V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapView;->setBuiltInZoomControls(Z)V

    .line 248
    return-void
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 95
    invoke-super {p0, p1}, Lcom/facebook/base/activity/o;->b(Landroid/os/Bundle;)V

    .line 97
    sget v0, Lcom/facebook/k;->orca_thread_view_map_tab:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->setContentView(I)V

    .line 98
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->getParent()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "threadViewFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->o:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 101
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->b()Lcom/facebook/inject/t;

    move-result-object v1

    .line 102
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a:Lcom/facebook/orca/f/k;

    .line 103
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->b:Lcom/facebook/config/a/a;

    .line 104
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->c:Lcom/facebook/orca/threads/n;

    .line 105
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->d:Lcom/facebook/prefs/shared/d;

    .line 106
    const-class v0, Lcom/facebook/orca/threads/r;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/r;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->e:Lcom/facebook/orca/threads/r;

    .line 107
    const-class v0, Lcom/facebook/orca/emoji/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/z;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->f:Lcom/facebook/orca/emoji/z;

    .line 108
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->g:Lcom/facebook/analytics/av;

    .line 110
    sget v0, Lcom/facebook/i;->thread_view_map_frame:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->h:Landroid/widget/FrameLayout;

    .line 111
    sget v0, Lcom/facebook/i;->thread_view_user_overlay:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->i:Landroid/widget/RelativeLayout;

    .line 112
    sget v0, Lcom/facebook/i;->thread_view_map_user_img:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->j:Lcom/facebook/user/tiles/UserTileView;

    .line 113
    sget v0, Lcom/facebook/i;->thread_view_map_user_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->k:Landroid/widget/TextView;

    .line 114
    sget v0, Lcom/facebook/i;->thread_view_map_user_snippet:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->l:Landroid/widget/TextView;

    .line 115
    sget v0, Lcom/facebook/i;->thread_view_map_user_time:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->m:Landroid/widget/TextView;

    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 118
    new-instance v1, Lcom/facebook/orca/threadview/ct;

    sget v2, Lcom/facebook/h;->orca_map_member_marker:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/threadview/ct;-><init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->p:Lcom/facebook/orca/threadview/ct;

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->p:Lcom/facebook/orca/threadview/ct;

    new-instance v1, Lcom/facebook/orca/threadview/cr;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/cr;-><init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ct;->setOnFocusChangeListener(Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;)V

    .line 127
    new-instance v0, Lcom/facebook/orca/threadview/cu;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/cu;-><init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->q:Lcom/facebook/orca/threadview/cu;

    .line 131
    new-instance v0, Lcom/google/android/maps/MapView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->b:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/maps/MapView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    .line 132
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 134
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/maps/MapView;->setClickable(Z)V

    .line 135
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v1, v0}, Lcom/google/android/maps/MapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 136
    new-instance v0, Lcom/facebook/maps/c;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-direct {v0, p0, v1}, Lcom/facebook/maps/c;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->r:Lcom/google/android/maps/MyLocationOverlay;

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 141
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 142
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 143
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 90
    sget-object v0, Lcom/facebook/analytics/f/a;->THREAD_VIEW_MAP_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected isRouteDisplayed()Z
    .locals 1

    .prologue
    .line 285
    const/4 v0, 0x0

    return v0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->o:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Q()Z

    .line 175
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 147
    invoke-super {p0}, Lcom/facebook/base/activity/o;->onDestroy()V

    .line 148
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->o:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 149
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 161
    invoke-super {p0}, Lcom/facebook/base/activity/o;->onPause()V

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->r:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->disableMyLocation()V

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getZoomButtonsController()Landroid/widget/ZoomButtonsController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->n:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getZoomButtonsController()Landroid/widget/ZoomButtonsController;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ZoomButtonsController;->setVisible(Z)V

    .line 169
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 153
    invoke-super {p0}, Lcom/facebook/base/activity/o;->onResume()V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->x:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->r:Lcom/google/android/maps/MyLocationOverlay;

    invoke-virtual {v0}, Lcom/google/android/maps/MyLocationOverlay;->enableMyLocation()Z

    .line 157
    :cond_0
    return-void
.end method
