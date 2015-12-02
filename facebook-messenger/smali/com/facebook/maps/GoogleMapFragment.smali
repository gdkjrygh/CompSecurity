.class public Lcom/facebook/maps/GoogleMapFragment;
.super Lcom/facebook/maps/MapFragment;
.source "GoogleMapFragment.java"


# instance fields
.field private Z:Landroid/location/Location;

.field private a:Landroid/app/LocalActivityManager;

.field private aa:Landroid/view/View$OnTouchListener;

.field private ab:Lcom/facebook/maps/n;

.field private ac:Lcom/facebook/maps/m;

.field private ad:Ljava/lang/String;

.field private ae:Z

.field private af:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/common/d/a/ab",
            "<",
            "Landroid/location/Location;",
            ">;>;"
        }
    .end annotation
.end field

.field private ag:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/maps/i;",
            ">;"
        }
    .end annotation
.end field

.field private ah:Z

.field private ai:Z

.field private b:Lcom/facebook/maps/d;

.field private c:Lcom/facebook/maps/a;

.field private d:Landroid/widget/FrameLayout;

.field private e:Lcom/facebook/maps/c;

.field private f:Lcom/facebook/maps/g;

.field private g:Lcom/facebook/maps/i;

.field private h:Z

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 38
    invoke-direct {p0}, Lcom/facebook/maps/MapFragment;-><init>()V

    .line 47
    iput-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    .line 52
    iput-boolean v3, p0, Lcom/facebook/maps/GoogleMapFragment;->h:Z

    .line 53
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    .line 54
    iput-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    .line 55
    iput-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->aa:Landroid/view/View$OnTouchListener;

    .line 58
    iput-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->ad:Ljava/lang/String;

    .line 59
    iput-boolean v2, p0, Lcom/facebook/maps/GoogleMapFragment;->ae:Z

    .line 60
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    .line 62
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ag:Ljava/util/LinkedList;

    .line 64
    iput-boolean v2, p0, Lcom/facebook/maps/GoogleMapFragment;->ah:Z

    .line 65
    iput-boolean v3, p0, Lcom/facebook/maps/GoogleMapFragment;->ai:Z

    .line 675
    return-void
.end method

.method static synthetic a(Lcom/facebook/maps/GoogleMapFragment;)Lcom/facebook/maps/a;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    return-object v0
.end method

.method private a(Lcom/facebook/maps/i;)Lcom/facebook/maps/k;
    .locals 2

    .prologue
    .line 506
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    invoke-virtual {v0, p1}, Lcom/facebook/maps/g;->a(Lcom/google/android/maps/OverlayItem;)V

    .line 508
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->invalidate()V

    .line 513
    :goto_0
    new-instance v0, Lcom/facebook/maps/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/maps/h;-><init>(Lcom/facebook/maps/GoogleMapFragment;Lcom/facebook/maps/i;Lcom/facebook/maps/e;)V

    return-object v0

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ag:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/maps/GoogleMapFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    return-object p1
.end method

.method private a()V
    .locals 4

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-eqz v0, :cond_1

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    invoke-static {}, Lcom/facebook/location/ab;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    const-class v0, Lcom/facebook/maps/d;

    .line 175
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->l()Landroid/support/v4/app/i;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object v0

    .line 176
    const-string v1, "API_KEY"

    iget-object v2, p0, Lcom/facebook/maps/GoogleMapFragment;->ad:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    const-string v2, "map"

    invoke-virtual {v1, v2, v0}, Landroid/app/LocalActivityManager;->startActivity(Ljava/lang/String;Landroid/content/Intent;)Landroid/view/Window;

    move-result-object v1

    .line 178
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    const-string v2, "map"

    invoke-virtual {v0, v2}, Landroid/app/LocalActivityManager;->getActivity(Ljava/lang/String;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/facebook/maps/d;

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    .line 179
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    invoke-virtual {v0}, Lcom/facebook/maps/d;->a()Lcom/facebook/maps/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    .line 187
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/facebook/h;->orca_marker_red:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 188
    new-instance v2, Lcom/facebook/maps/g;

    iget-boolean v3, p0, Lcom/facebook/maps/GoogleMapFragment;->ai:Z

    invoke-direct {v2, v0, v3}, Lcom/facebook/maps/g;-><init>(Landroid/graphics/drawable/Drawable;Z)V

    iput-object v2, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    .line 191
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ag:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/maps/i;

    .line 192
    invoke-direct {p0, v0}, Lcom/facebook/maps/GoogleMapFragment;->a(Lcom/facebook/maps/i;)Lcom/facebook/maps/k;

    goto :goto_1

    .line 194
    :cond_2
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    new-instance v2, Lcom/facebook/maps/e;

    invoke-direct {v2, p0}, Lcom/facebook/maps/e;-><init>(Lcom/facebook/maps/GoogleMapFragment;)V

    invoke-virtual {v0, v2}, Lcom/facebook/maps/g;->setOnFocusChangeListener(Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;)V

    .line 204
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ag:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ag:Ljava/util/LinkedList;

    .line 206
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 209
    iget-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->h:Z

    invoke-virtual {p0, v0}, Lcom/facebook/maps/GoogleMapFragment;->a(Z)V

    .line 210
    iget v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 211
    iget v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    int-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/maps/GoogleMapFragment;->a(D)V

    .line 213
    :cond_3
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    if-eqz v0, :cond_4

    .line 214
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/GoogleMapFragment;->a(Landroid/location/Location;)V

    .line 216
    :cond_4
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->aa:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_5

    .line 217
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->aa:Landroid/view/View$OnTouchListener;

    invoke-virtual {p0, v0}, Lcom/facebook/maps/GoogleMapFragment;->a(Landroid/view/View$OnTouchListener;)V

    .line 219
    :cond_5
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ab:Lcom/facebook/maps/n;

    if-eqz v0, :cond_6

    .line 220
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->ab:Lcom/facebook/maps/n;

    invoke-virtual {v0, v1}, Lcom/facebook/maps/a;->setOnMovementListener(Lcom/facebook/maps/n;)V

    .line 222
    :cond_6
    iget-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ae:Z

    if-eqz v0, :cond_7

    .line 223
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/maps/GoogleMapFragment;->b(Z)V

    .line 225
    :cond_7
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ab:Lcom/facebook/maps/n;

    if-eqz v0, :cond_8

    .line 226
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->ab:Lcom/facebook/maps/n;

    invoke-virtual {v0, v1}, Lcom/facebook/maps/a;->setOnMovementListener(Lcom/facebook/maps/n;)V

    .line 228
    :cond_8
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ac:Lcom/facebook/maps/m;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->ac:Lcom/facebook/maps/m;

    invoke-virtual {v0, v1}, Lcom/facebook/maps/g;->a(Lcom/facebook/maps/m;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/maps/GoogleMapFragment;Lcom/facebook/maps/i;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/maps/GoogleMapFragment;->b(Lcom/facebook/maps/i;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/maps/GoogleMapFragment;)Lcom/facebook/maps/c;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    return-object v0
.end method

.method private b(Lcom/facebook/maps/i;)V
    .locals 1

    .prologue
    .line 575
    if-nez p1, :cond_1

    .line 577
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    invoke-virtual {v0}, Lcom/facebook/maps/i;->b()V

    .line 580
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    .line 591
    :cond_0
    :goto_0
    return-void

    .line 584
    :cond_1
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    if-eqz v0, :cond_2

    .line 586
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    invoke-virtual {v0}, Lcom/facebook/maps/i;->b()V

    .line 588
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/maps/i;->a()V

    .line 589
    iput-object p1, p0, Lcom/facebook/maps/GoogleMapFragment;->g:Lcom/facebook/maps/i;

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/maps/GoogleMapFragment;)Ljava/util/List;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 116
    invoke-super {p0}, Lcom/facebook/maps/MapFragment;->A()V

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ah:Z

    .line 118
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    invoke-virtual {v0}, Lcom/facebook/maps/c;->enableMyLocation()Z

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->w()Z

    move-result v0

    if-nez v0, :cond_1

    .line 122
    invoke-direct {p0}, Lcom/facebook/maps/GoogleMapFragment;->a()V

    .line 123
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchResume()V

    .line 125
    :cond_1
    return-void
.end method

.method public B()V
    .locals 2

    .prologue
    .line 129
    invoke-super {p0}, Lcom/facebook/maps/MapFragment;->B()V

    .line 130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ah:Z

    .line 131
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    invoke-virtual {v0}, Lcom/facebook/maps/c;->disableMyLocation()V

    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->w()Z

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/i;->isFinishing()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchPause(Z)V

    .line 137
    :cond_1
    return-void
.end method

.method public C()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 147
    invoke-super {p0}, Lcom/facebook/maps/MapFragment;->C()V

    .line 148
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->f:Lcom/facebook/maps/g;

    invoke-virtual {v0, v2}, Lcom/facebook/maps/g;->setOnFocusChangeListener(Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;)V

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/i;->isFinishing()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchDestroy(Z)V

    .line 152
    iput-object v2, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    .line 153
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 94
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->d:Landroid/widget/FrameLayout;

    .line 95
    invoke-direct {p0}, Lcom/facebook/maps/GoogleMapFragment;->a()V

    .line 96
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->d:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public a(D)V
    .locals 2

    .prologue
    .line 333
    double-to-int v0, p1

    .line 334
    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-nez v1, :cond_0

    .line 335
    iput v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    .line 339
    :goto_0
    return-void

    .line 337
    :cond_0
    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v1}, Lcom/facebook/maps/a;->getController()Lcom/google/android/maps/MapController;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/maps/MapController;->setZoom(I)I

    goto :goto_0
.end method

.method public a(Landroid/location/Location;)V
    .locals 2

    .prologue
    .line 300
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-nez v0, :cond_0

    .line 301
    iput-object p1, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    .line 305
    :goto_0
    return-void

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/maps/j;->a(Landroid/location/Location;)Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->setCenter(Lcom/google/android/maps/GeoPoint;)V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 69
    invoke-super {p0, p1}, Lcom/facebook/maps/MapFragment;->a(Landroid/os/Bundle;)V

    .line 70
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "apiKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Must call #setMapApiKey with a valid key before instantiating the fragment"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ad:Ljava/lang/String;

    .line 73
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "overlayShadowDrawingEnabled"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ai:Z

    .line 74
    const/4 v0, 0x0

    .line 76
    if-eqz p1, :cond_0

    .line 77
    const-string v0, "activityManagerSavedInstanceState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 78
    const-string v0, "clickable"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->h:Z

    .line 79
    const-string v0, "showLocation"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ae:Z

    .line 82
    const-string v0, "latestMapZoom"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    .line 83
    const-string v0, "latestMapCenter"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/location/Location;

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    move-object v0, v1

    .line 86
    :cond_0
    new-instance v1, Landroid/app/LocalActivityManager;

    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->l()Landroid/support/v4/app/i;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/app/LocalActivityManager;-><init>(Landroid/app/Activity;Z)V

    iput-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    .line 87
    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v1, v0}, Landroid/app/LocalActivityManager;->dispatchCreate(Landroid/os/Bundle;)V

    .line 88
    return-void
.end method

.method public a(Landroid/view/View$OnTouchListener;)V
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-nez v0, :cond_0

    .line 444
    iput-object p1, p0, Lcom/facebook/maps/GoogleMapFragment;->aa:Landroid/view/View$OnTouchListener;

    .line 448
    :goto_0
    return-void

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0, p1}, Lcom/facebook/maps/a;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-nez v0, :cond_0

    .line 344
    iput-boolean p1, p0, Lcom/facebook/maps/GoogleMapFragment;->h:Z

    .line 348
    :goto_0
    return-void

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0, p1}, Lcom/facebook/maps/a;->setClickable(Z)V

    goto :goto_0
.end method

.method public b(Z)V
    .locals 3

    .prologue
    .line 352
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    if-nez v0, :cond_1

    .line 353
    iput-boolean p1, p0, Lcom/facebook/maps/GoogleMapFragment;->ae:Z

    .line 383
    :cond_0
    :goto_0
    return-void

    .line 355
    :cond_1
    if-eqz p1, :cond_3

    .line 356
    new-instance v0, Lcom/facebook/maps/c;

    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->b:Lcom/facebook/maps/d;

    iget-object v2, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-direct {v0, v1, v2}, Lcom/facebook/maps/c;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    .line 357
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->af:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 360
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    new-instance v1, Lcom/facebook/maps/f;

    invoke-direct {v1, p0}, Lcom/facebook/maps/f;-><init>(Lcom/facebook/maps/GoogleMapFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/maps/c;->runOnFirstFix(Ljava/lang/Runnable;)Z

    .line 371
    :cond_2
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->postInvalidate()V

    .line 373
    iget-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ah:Z

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    invoke-virtual {v0}, Lcom/facebook/maps/c;->enableMyLocation()Z

    goto :goto_0

    .line 376
    :cond_3
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    if-eqz v0, :cond_0

    .line 377
    iget-boolean v0, p0, Lcom/facebook/maps/GoogleMapFragment;->ah:Z

    if-eqz v0, :cond_4

    .line 378
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    invoke-virtual {v0}, Lcom/facebook/maps/c;->disableMyLocation()V

    .line 380
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->e:Lcom/facebook/maps/c;

    goto :goto_0
.end method

.method public c(Z)V
    .locals 2

    .prologue
    .line 157
    invoke-virtual {p0}, Lcom/facebook/maps/GoogleMapFragment;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    if-eqz p1, :cond_1

    .line 159
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/LocalActivityManager;->dispatchPause(Z)V

    .line 165
    :cond_0
    :goto_0
    return-void

    .line 161
    :cond_1
    invoke-direct {p0}, Lcom/facebook/maps/GoogleMapFragment;->a()V

    .line 162
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchResume()V

    goto :goto_0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 101
    invoke-super {p0, p1}, Lcom/facebook/maps/MapFragment;->e(Landroid/os/Bundle;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->saveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    .line 103
    const-string v1, "activityManagerSavedInstanceState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 104
    const-string v0, "clickable"

    iget-boolean v1, p0, Lcom/facebook/maps/GoogleMapFragment;->h:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 105
    const-string v0, "showLocation"

    iget-boolean v1, p0, Lcom/facebook/maps/GoogleMapFragment;->ae:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 109
    const-string v1, "latestMapZoom"

    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/maps/GoogleMapFragment;->i:I

    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 110
    const-string v1, "latestMapCenter"

    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->Z:Landroid/location/Location;

    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 112
    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->getZoomLevel()I

    move-result v0

    goto :goto_0

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->c:Lcom/facebook/maps/a;

    invoke-virtual {v0}, Lcom/facebook/maps/a;->getMapCenter()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/maps/j;->a(Lcom/google/android/maps/GeoPoint;)Landroid/location/Location;

    move-result-object v0

    goto :goto_1
.end method

.method public g()V
    .locals 1

    .prologue
    .line 141
    invoke-super {p0}, Lcom/facebook/maps/MapFragment;->g()V

    .line 142
    iget-object v0, p0, Lcom/facebook/maps/GoogleMapFragment;->a:Landroid/app/LocalActivityManager;

    invoke-virtual {v0}, Landroid/app/LocalActivityManager;->dispatchStop()V

    .line 143
    return-void
.end method
