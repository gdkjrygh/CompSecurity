.class public Lcom/thetransitapp/droid/widget/RoutingDetails;
.super Lcom/thetransitapp/droid/BaseFragment;
.source "RoutingDetails.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SimpleDateFormat"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/BaseFragment;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# static fields
.field private static final UPDATE_DELAY:J = 0x4e20L


# instance fields
.field private adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private arriveAt:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050070
    .end annotation
.end field

.field private back:Landroid/widget/ImageButton;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05006d
    .end annotation
.end field

.field private currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

.field private handler:Landroid/os/Handler;

.field private itineraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;"
        }
    .end annotation
.end field

.field private leaveTime:Landroid/widget/TextView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05006f
    .end annotation
.end field

.field private next:Landroid/widget/ImageButton;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050071
    .end annotation
.end field

.field private onDetailClickListener:Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

.field private pagination:Landroid/widget/ImageView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05006e
    .end annotation
.end field

.field private routingStepsList:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050072
    .end annotation
.end field

.field private steps:Landroid/widget/ListView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050073
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/thetransitapp/droid/BaseFragment;-><init>()V

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->handler:Landroid/os/Handler;

    .line 34
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/RoutingDetails;)V
    .locals 0

    .prologue
    .line 212
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->updateCurrent()V

    return-void
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/widget/RoutingDetails;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method private update()V
    .locals 4

    .prologue
    .line 200
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->isVisible()Z

    move-result v2

    if-nez v2, :cond_0

    .line 210
    :goto_0
    return-void

    .line 204
    :cond_0
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 205
    .local v0, "index":I
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080019

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 207
    .local v1, "size":I
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->pagination:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3, v1, v0}, Lcom/thetransitapp/droid/util/BitmapUtility;->getPagination(III)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 209
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->updateCurrent()V

    goto :goto_0
.end method

.method private updateCurrent()V
    .locals 14

    .prologue
    const-wide/32 v12, 0xea60

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 213
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->isVisible()Z

    move-result v6

    if-nez v6, :cond_1

    .line 243
    :cond_0
    :goto_0
    return-void

    .line 217
    :cond_1
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    if-eqz v6, :cond_0

    .line 220
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v1, v6, v8

    .line 221
    .local v1, "diff":J
    div-long v6, v1, v12

    long-to-int v5, v6

    .line 223
    .local v5, "minDiff":I
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    .line 225
    .local v3, "format":Ljava/text/DateFormat;
    if-gez v5, :cond_2

    .line 226
    const v6, 0x7f0a006c

    new-array v7, v11, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {p0, v6, v7}, Lcom/thetransitapp/droid/widget/RoutingDetails;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 235
    .local v4, "leaveString":Ljava/lang/String;
    :goto_1
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    sub-long v1, v6, v8

    .line 236
    div-long v6, v1, v12

    long-to-int v5, v6

    .line 238
    const v6, 0x7f0a0070

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getEndTime()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v11

    invoke-virtual {p0, v6, v7}, Lcom/thetransitapp/droid/widget/RoutingDetails;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 240
    .local v0, "arriveString":Ljava/lang/String;
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->leaveTime:Landroid/widget/TextView;

    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 241
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->arriveAt:Landroid/widget/TextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 227
    .end local v0    # "arriveString":Ljava/lang/String;
    .end local v4    # "leaveString":Ljava/lang/String;
    :cond_2
    if-nez v5, :cond_3

    .line 228
    const v6, 0x7f0a006d

    invoke-virtual {p0, v6}, Lcom/thetransitapp/droid/widget/RoutingDetails;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 229
    .restart local v4    # "leaveString":Ljava/lang/String;
    goto :goto_1

    .end local v4    # "leaveString":Ljava/lang/String;
    :cond_3
    const/16 v6, 0x1e

    if-ge v5, v6, :cond_4

    .line 230
    const v6, 0x7f0a006e

    new-array v7, v11, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {p0, v6, v7}, Lcom/thetransitapp/droid/widget/RoutingDetails;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 231
    .restart local v4    # "leaveString":Ljava/lang/String;
    goto :goto_1

    .line 232
    .end local v4    # "leaveString":Ljava/lang/String;
    :cond_4
    const v6, 0x7f0a006f

    new-array v7, v11, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getStartTime()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v10

    invoke-virtual {p0, v6, v7}, Lcom/thetransitapp/droid/widget/RoutingDetails;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .restart local v4    # "leaveString":Ljava/lang/String;
    goto :goto_1
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 156
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 158
    .local v0, "index":I
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->back:Landroid/widget/ImageButton;

    if-ne p1, v1, :cond_1

    .line 159
    add-int/lit8 v0, v0, -0x1

    .line 164
    :goto_0
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 165
    const/4 v0, 0x0

    .line 170
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/widget/RoutingDetails;->setDisplayedItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 172
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->onDetailClickListener:Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-interface {v1, v2}, Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;->onDetailClick(Lcom/thetransitapp/droid/model/RoutingItinerary;)V

    .line 173
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->update()V

    .line 174
    return-void

    .line 161
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 166
    :cond_2
    if-gez v0, :cond_0

    .line 167
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v0, v1, -0x1

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 71
    const v0, 0x7f030024

    invoke-super {p0, p1, p2, v0}, Lcom/thetransitapp/droid/BaseFragment;->createViewIfNeeded(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 193
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->onDetailClickListener:Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

    if-eqz v0, :cond_0

    .line 194
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->onDetailClickListener:Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v0, p3}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    invoke-interface {v1, v0}, Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;->onLegClick(Lcom/thetransitapp/droid/model/RoutingLeg;)V

    .line 195
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->routingStepsList:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 197
    :cond_0
    return-void
.end method

.method public onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 2
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 178
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->routingStepsList:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 188
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 180
    :sswitch_0
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->routingStepsList:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 184
    :sswitch_1
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->routingStepsList:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 178
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method public onStart()V
    .locals 2

    .prologue
    .line 120
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->onStart()V

    .line 122
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseFragment;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 123
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 76
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 77
    invoke-direct {p0}, Lcom/thetransitapp/droid/widget/RoutingDetails;->update()V

    .line 79
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->steps:Landroid/widget/ListView;

    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 80
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->steps:Landroid/widget/ListView;

    invoke-virtual {v2, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 82
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    if-eqz v2, :cond_1

    .line 83
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->clear()V

    .line 85
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 92
    :cond_1
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->handler:Landroid/os/Handler;

    new-instance v3, Lcom/thetransitapp/droid/widget/RoutingDetails$1;

    invoke-direct {v3, p0}, Lcom/thetransitapp/droid/widget/RoutingDetails$1;-><init>(Lcom/thetransitapp/droid/widget/RoutingDetails;)V

    .line 103
    const-wide/16 v4, 0x4e20

    .line 92
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 105
    const/4 v1, 0x4

    .line 107
    .local v1, "visibility":I
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    .line 108
    const/4 v1, 0x0

    .line 111
    :cond_2
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->back:Landroid/widget/ImageButton;

    invoke-virtual {v2, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 112
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->back:Landroid/widget/ImageButton;

    invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->next:Landroid/widget/ImageButton;

    invoke-virtual {v2, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 115
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->next:Landroid/widget/ImageButton;

    invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    return-void

    .line 85
    .end local v1    # "visibility":I
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 86
    .local v0, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v3

    sget-object v4, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    if-eq v3, v4, :cond_0

    .line 87
    iget-object v3, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v3, v0}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->add(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setDisplayedItinerary(Lcom/thetransitapp/droid/model/RoutingItinerary;)V
    .locals 4
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/RoutingItinerary;

    .prologue
    .line 126
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    .line 128
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    if-eqz v1, :cond_1

    .line 129
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->clear()V

    .line 131
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->currentItinerary:Lcom/thetransitapp/droid/model/RoutingItinerary;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/RoutingItinerary;->getLegs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 137
    :cond_1
    return-void

    .line 131
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg;

    .line 132
    .local v0, "leg":Lcom/thetransitapp/droid/model/RoutingLeg;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/RoutingLeg;->getLegType()Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    move-result-object v2

    sget-object v3, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    if-eq v2, v3, :cond_0

    .line 133
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->adapter:Lcom/thetransitapp/droid/widget/RoutingStepAdapter;

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/widget/RoutingStepAdapter;->add(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public setOnDetailClickListener(Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;)V
    .locals 0
    .param p1, "onDetailClickListener"    # Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

    .prologue
    .line 44
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->onDetailClickListener:Lcom/thetransitapp/droid/widget/RoutingDetails$OnDetailClickListener;

    return-void
.end method

.method public setPossibleItineraries(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/RoutingItinerary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 140
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/RoutingItinerary;>;"
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->itineraries:Ljava/util/List;

    .line 142
    const/4 v0, 0x4

    .line 144
    .local v0, "visibility":I
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    .line 145
    const/4 v0, 0x0

    .line 148
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->back:Landroid/widget/ImageButton;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->next:Landroid/widget/ImageButton;

    if-eqz v1, :cond_1

    .line 149
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->back:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 150
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/RoutingDetails;->next:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 152
    :cond_1
    return-void
.end method
