.class public Lcom/thetransitapp/droid/widget/TransitModeAdapter;
.super Landroid/widget/BaseExpandableListAdapter;
.source "TransitModeAdapter.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I


# instance fields
.field private childs:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/widget/OptionItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private fragmentManager:Landroid/support/v4/app/FragmentManager;

.field private groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/widget/OptionItem;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;

.field private listView:Landroid/widget/ExpandableListView;


# direct methods
.method static synthetic $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[I
    .locals 3

    .prologue
    .line 32
    sget-object v0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/thetransitapp/droid/model/Route$RouteType;->values()[Lcom/thetransitapp/droid/model/Route$RouteType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->BUS:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_7

    :goto_1
    :try_start_1
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->CABLE_CAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_6

    :goto_2
    :try_start_2
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->FERRY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_5

    :goto_3
    :try_start_3
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->FUNICULAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_4

    :goto_4
    :try_start_4
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->GONDOLA:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_3

    :goto_5
    :try_start_5
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->SUBWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_2

    :goto_6
    :try_start_6
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAIN:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_1

    :goto_7
    :try_start_7
    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAMWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_0

    :goto_8
    sput-object v0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_8

    :catch_1
    move-exception v1

    goto :goto_7

    :catch_2
    move-exception v1

    goto :goto_6

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v1

    goto :goto_4

    :catch_5
    move-exception v1

    goto :goto_3

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/support/v4/app/FragmentManager;Landroid/widget/ExpandableListView;)V
    .locals 1
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "fragmentManager"    # Landroid/support/v4/app/FragmentManager;
    .param p3, "listView"    # Landroid/widget/ExpandableListView;

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    .line 42
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    .line 44
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 45
    iput-object p2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    .line 46
    iput-object p3, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->listView:Landroid/widget/ExpandableListView;

    .line 47
    return-void
.end method

.method static synthetic access$2(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/support/v4/app/FragmentManager;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->fragmentManager:Landroid/support/v4/app/FragmentManager;

    return-object v0
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    return-object v0
.end method

.method private closeAllOtherBundle(I)V
    .locals 3
    .param p1, "groupPosition"    # I

    .prologue
    .line 399
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 408
    return-void

    .line 400
    :cond_0
    if-eq v0, p1, :cond_1

    .line 401
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v1

    .line 403
    .local v1, "item":Lcom/thetransitapp/droid/widget/OptionItem;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 404
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->listView:Landroid/widget/ExpandableListView;

    invoke-virtual {v2, v0}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    .line 399
    .end local v1    # "item":Lcom/thetransitapp/droid/widget/OptionItem;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private implode(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 376
    .local p1, "names":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 386
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 378
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 379
    .local v1, "name":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 380
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private indexOf(Lcom/thetransitapp/droid/model/Route$RouteType;)I
    .locals 4
    .param p1, "routeType"    # Lcom/thetransitapp/droid/model/Route$RouteType;

    .prologue
    .line 365
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 372
    const/4 v1, -0x1

    :goto_0
    return v1

    .line 365
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/OptionItem;

    .line 366
    .local v0, "item":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 367
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    .line 368
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0
.end method

.method private showCurrentRegion(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;)V
    .locals 5
    .param p1, "item"    # Lcom/thetransitapp/droid/widget/OptionItem;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 151
    const v3, 0x7f05003b

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 152
    .local v1, "currentRegion":Landroid/widget/TextView;
    const v3, 0x7f05003c

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 153
    .local v0, "agencyTop":Landroid/widget/TextView;
    const v3, 0x7f05003e

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 155
    .local v2, "legal":Landroid/widget/Button;
    new-instance v3, Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;

    invoke-direct {v3, p0}, Lcom/thetransitapp/droid/widget/TransitModeAdapter$1;-><init>(Lcom/thetransitapp/droid/widget/TransitModeAdapter;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v3

    if-nez v3, :cond_0

    .line 170
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a007e

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a007f

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    :goto_0
    return-void

    .line 173
    :cond_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitBundle;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getCurrentRegion()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showAgencies(Landroid/view/View;Lcom/thetransitapp/droid/model/TransitBundle;)V

    goto :goto_0
.end method

.method private showGroup(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;IZ)V
    .locals 11
    .param p1, "item"    # Lcom/thetransitapp/droid/widget/OptionItem;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "groupPosition"    # I
    .param p4, "isExpanded"    # Z

    .prologue
    const v10, 0x7f050099

    const/16 v9, 0x8

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 190
    const v6, 0x7f050098

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 191
    .local v4, "name":Landroid/widget/TextView;
    const v6, 0x7f050097

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 192
    .local v0, "check":Landroid/widget/ImageView;
    const v6, 0x7f05009b

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/ui/ShadowImageView;

    .line 194
    .local v3, "indicator":Lcom/thetransitapp/droid/ui/ShadowImageView;
    if-nez p3, :cond_0

    .line 195
    invoke-virtual {p2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 200
    :goto_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    const/4 v2, 0x1

    .line 203
    .local v2, "full":Z
    const/4 v5, 0x1

    .line 205
    .local v5, "none":Z
    invoke-virtual {p0, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getChildrenCount(I)I

    move-result v6

    if-lez v6, :cond_4

    .line 206
    iget-object v6, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v6, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 211
    invoke-virtual {v3, v7}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    .line 212
    const v6, 0x3dcccccd    # 0.1f

    const/4 v7, 0x0

    const/high16 v8, -0x40000000    # -2.0f

    const/high16 v9, -0x1000000

    invoke-virtual {v3, v6, v7, v8, v9}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setShadowLayer(FFFI)V

    .line 213
    if-eqz p4, :cond_3

    const v6, 0x7f0200c5

    :goto_2
    invoke-virtual {v3, v6}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setImageResource(I)V

    .line 221
    :goto_3
    if-eqz v2, :cond_6

    .line 222
    const v6, 0x7f02008f

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 229
    :goto_4
    new-instance v6, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;

    invoke-direct {v6, p0, p1, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter$2;-><init>(Lcom/thetransitapp/droid/widget/TransitModeAdapter;Lcom/thetransitapp/droid/widget/OptionItem;I)V

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    return-void

    .line 197
    .end local v2    # "full":Z
    .end local v5    # "none":Z
    :cond_0
    invoke-virtual {p2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 206
    .restart local v2    # "full":Z
    .restart local v5    # "none":Z
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/widget/OptionItem;

    .line 207
    .local v1, "child":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v6

    and-int/2addr v2, v6

    .line 208
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    :goto_5
    and-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move v6, v8

    goto :goto_5

    .line 213
    .end local v1    # "child":Lcom/thetransitapp/droid/widget/OptionItem;
    :cond_3
    const v6, 0x7f02008b

    goto :goto_2

    .line 215
    :cond_4
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v2

    .line 216
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v6

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v6

    if-eqz v6, :cond_5

    move v5, v7

    .line 218
    :goto_6
    invoke-virtual {v3, v9}, Lcom/thetransitapp/droid/ui/ShadowImageView;->setVisibility(I)V

    goto :goto_3

    :cond_5
    move v5, v8

    .line 216
    goto :goto_6

    .line 223
    :cond_6
    if-eqz v5, :cond_7

    .line 224
    const v6, 0x7f02008e

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 226
    :cond_7
    const v6, 0x7f020090

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4
.end method

.method private showSupportedRegion(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;)V
    .locals 8
    .param p1, "item"    # Lcom/thetransitapp/droid/widget/OptionItem;
    .param p2, "view"    # Landroid/view/View;

    .prologue
    .line 179
    const v4, 0x7f050094

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 180
    .local v2, "name":Landroid/widget/TextView;
    const v4, 0x7f050095

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 182
    .local v1, "count":Landroid/widget/TextView;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitBundle;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    invoke-virtual {p1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    .line 185
    .local v3, "num":I
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f0a009e

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 186
    .local v0, "agencyCount":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    return-void
.end method


# virtual methods
.method public addMode(Lcom/thetransitapp/droid/model/TransitMode;)V
    .locals 3
    .param p1, "mode"    # Lcom/thetransitapp/droid/model/TransitMode;

    .prologue
    .line 50
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 51
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->indexOf(Lcom/thetransitapp/droid/model/Route$RouteType;)I

    move-result v0

    .line 53
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 54
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    new-instance v2, Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-direct {v2, p1}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitMode;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .end local v0    # "index":I
    :goto_0
    return-void

    .line 56
    .restart local v0    # "index":I
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 57
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    new-instance v2, Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-direct {v2, p1}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitMode;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 63
    .end local v0    # "index":I
    :cond_2
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    new-instance v2, Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-direct {v2, p1}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitMode;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public addSupportedRegion(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 4
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    const/4 v3, 0x0

    .line 72
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    new-instance v2, Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-direct {v2, p1, v3}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitBundle;Z)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .local v0, "items":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/widget/OptionItem;>;"
    new-instance v1, Lcom/thetransitapp/droid/widget/OptionItem;

    invoke-direct {v1, p1, v3}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitBundle;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    return-void
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 361
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 362
    return-void
.end method

.method public getChild(II)Lcom/thetransitapp/droid/widget/OptionItem;
    .locals 2
    .param p1, "groupPosition"    # I
    .param p2, "childPosition"    # I

    .prologue
    .line 98
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 100
    .local v0, "group":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/widget/OptionItem;>;"
    if-eqz v0, :cond_0

    .line 101
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/widget/OptionItem;

    .line 104
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public bridge synthetic getChild(II)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getChild(II)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2
    .param p1, "groupPosition"    # I
    .param p2, "childPosition"    # I

    .prologue
    .line 114
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .param p1, "groupPosition"    # I
    .param p2, "childPosition"    # I
    .param p3, "isLastChild"    # Z
    .param p4, "convertView"    # Landroid/view/View;
    .param p5, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const v9, 0x7f050098

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 248
    move-object v4, p4

    .line 249
    .local v4, "view":Landroid/view/View;
    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getChild(II)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v1

    .line 251
    .local v1, "child":Lcom/thetransitapp/droid/widget/OptionItem;
    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 252
    :cond_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v5

    if-eqz v5, :cond_2

    const v5, 0x7f05003c

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_2

    .line 253
    :cond_1
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 254
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    const v6, 0x7f030035

    invoke-virtual {v5, v6, p5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 260
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 261
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 262
    .local v3, "name":Landroid/widget/TextView;
    const v5, 0x7f050096

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 263
    .local v2, "icon":Landroid/widget/ImageView;
    const v5, 0x7f050097

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 265
    .local v0, "check":Landroid/widget/ImageView;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitMode;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_5

    .line 268
    invoke-static {}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->$SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[I

    move-result-object v6

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitMode;->getRouteTypes()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Route$RouteType;->ordinal()I

    move-result v5

    aget v5, v6, v5

    packed-switch v5, :pswitch_data_0

    .line 280
    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 287
    :goto_1
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v5

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 288
    const v5, 0x7f02008f

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 296
    .end local v0    # "check":Landroid/widget/ImageView;
    .end local v2    # "icon":Landroid/widget/ImageView;
    .end local v3    # "name":Landroid/widget/TextView;
    :cond_3
    :goto_2
    return-object v4

    .line 256
    :cond_4
    iget-object v5, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    const v6, 0x7f03001e

    invoke-virtual {v5, v6, p5, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    goto :goto_0

    .line 270
    .restart local v0    # "check":Landroid/widget/ImageView;
    .restart local v2    # "icon":Landroid/widget/ImageView;
    .restart local v3    # "name":Landroid/widget/TextView;
    :pswitch_0
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 271
    const v5, 0x7f0200bf

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 275
    :pswitch_1
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 276
    const v5, 0x7f0200bc

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 284
    :cond_5
    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 290
    :cond_6
    const v5, 0x7f02008e

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 292
    .end local v0    # "check":Landroid/widget/ImageView;
    .end local v2    # "icon":Landroid/widget/ImageView;
    .end local v3    # "name":Landroid/widget/TextView;
    :cond_7
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 293
    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v5

    invoke-virtual {p0, v4, v5}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showAgencies(Landroid/view/View;Lcom/thetransitapp/droid/model/TransitBundle;)V

    goto :goto_2

    .line 268
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getChildrenCount(I)I
    .locals 2
    .param p1, "groupPosition"    # I

    .prologue
    .line 86
    iget-object v1, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->childs:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 88
    .local v0, "children":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/widget/OptionItem;>;"
    if-nez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0
.end method

.method public getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;
    .locals 1
    .param p1, "groupPosition"    # I

    .prologue
    .line 93
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/OptionItem;

    return-object v0
.end method

.method public bridge synthetic getGroup(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2
    .param p1, "groupPosition"    # I

    .prologue
    .line 109
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "groupPosition"    # I
    .param p2, "isExpanded"    # Z
    .param p3, "convertView"    # Landroid/view/View;
    .param p4, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v4, 0x0

    .line 124
    move-object v1, p3

    .line 125
    .local v1, "view":Landroid/view/View;
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    .line 127
    .local v0, "item":Lcom/thetransitapp/droid/widget/OptionItem;
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    if-eqz v2, :cond_0

    const v2, 0x7f050096

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 128
    :cond_0
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v2

    if-eqz v2, :cond_1

    const v2, 0x7f050094

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 129
    :cond_1
    const v2, 0x7f05003b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_3

    .line 130
    :cond_2
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 131
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030036

    invoke-virtual {v2, v3, p4, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 139
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 140
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showGroup(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;IZ)V

    .line 147
    :goto_1
    return-object v1

    .line 132
    :cond_4
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 133
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030034

    invoke-virtual {v2, v3, p4, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 134
    goto :goto_0

    .line 135
    :cond_5
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030018

    invoke-virtual {v2, v3, p4, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    goto :goto_0

    .line 141
    :cond_6
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 142
    invoke-direct {p0, v0, v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showSupportedRegion(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;)V

    goto :goto_1

    .line 144
    :cond_7
    invoke-direct {p0, v0, v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->showCurrentRegion(Lcom/thetransitapp/droid/widget/OptionItem;Landroid/view/View;)V

    goto :goto_1
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x0

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1
    .param p1, "groupPosition"    # I
    .param p2, "childPosition"    # I

    .prologue
    .line 356
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onGroupExpanded(I)V
    .locals 1
    .param p1, "groupPosition"    # I

    .prologue
    .line 391
    invoke-super {p0, p1}, Landroid/widget/BaseExpandableListAdapter;->onGroupExpanded(I)V

    .line 393
    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 394
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->closeAllOtherBundle(I)V

    .line 396
    :cond_0
    return-void
.end method

.method public setCurrentRegion(Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 3
    .param p1, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    .line 68
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->groups:Ljava/util/List;

    new-instance v1, Lcom/thetransitapp/droid/widget/OptionItem;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/thetransitapp/droid/widget/OptionItem;-><init>(Lcom/thetransitapp/droid/model/TransitBundle;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method

.method public showAgencies(Landroid/view/View;Lcom/thetransitapp/droid/model/TransitBundle;)V
    .locals 12
    .param p1, "view"    # Landroid/view/View;
    .param p2, "bundle"    # Lcom/thetransitapp/droid/model/TransitBundle;

    .prologue
    const/16 v11, 0x8

    .line 300
    const v8, 0x7f05003c

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 301
    .local v2, "agencyTop":Landroid/widget/TextView;
    const v8, 0x7f05003d

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 302
    .local v1, "agencyOther":Landroid/widget/TextView;
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 304
    .local v0, "agencies":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 312
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .local v6, "important":Ljava/lang/StringBuilder;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .local v3, "details":Ljava/lang/StringBuilder;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_1
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-lt v5, v8, :cond_3

    .line 339
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_7

    .line 340
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_6

    .line 343
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 352
    :cond_0
    :goto_2
    return-void

    .line 304
    .end local v3    # "details":Ljava/lang/StringBuilder;
    .end local v5    # "i":I
    .end local v6    # "important":Ljava/lang/StringBuilder;
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/thetransitapp/droid/model/Feed;

    .line 305
    .local v4, "feed":Lcom/thetransitapp/droid/model/Feed;
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Feed;->getLevel()I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_2

    .line 306
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Feed;->getLevel()I

    move-result v8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v8, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 309
    :cond_2
    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Feed;->getLevel()I

    move-result v8

    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/Feed;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 316
    .end local v4    # "feed":Lcom/thetransitapp/droid/model/Feed;
    .restart local v3    # "details":Ljava/lang/StringBuilder;
    .restart local v5    # "i":I
    .restart local v6    # "important":Ljava/lang/StringBuilder;
    :cond_3
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 317
    .local v7, "names":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 319
    packed-switch v5, :pswitch_data_0

    .line 330
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_4

    .line 331
    const-string v8, ", "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    :cond_4
    invoke-direct {p0, v7}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->implode(Ljava/util/List;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 322
    :pswitch_0
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_5

    .line 323
    const-string v8, ", "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    :cond_5
    invoke-direct {p0, v7}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->implode(Ljava/util/List;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 346
    .end local v7    # "names":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_6
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 348
    :cond_7
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_0

    .line 349
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
