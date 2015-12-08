.class public Lcom/thetransitapp/droid/OptionScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "OptionScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# instance fields
.field private adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

.field private feedManager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private overlay:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05008f
    .end annotation
.end field

.field private transitModes:Landroid/widget/ExpandableListView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050090
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 44
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/OptionScreen;)V
    .locals 0

    .prologue
    .line 179
    invoke-direct {p0}, Lcom/thetransitapp/droid/OptionScreen;->onSelectionChanged()V

    return-void
.end method

.method private onSelectionChanged()V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/FeedManager;->onSelectionChanged()V

    .line 181
    return-void
.end method


# virtual methods
.method public feedUpdated()V
    .locals 7

    .prologue
    .line 100
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    .line 101
    .local v1, "closest":Lcom/thetransitapp/droid/model/TransitBundle;
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->clear()V

    .line 103
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v2

    .line 105
    .local v2, "loc":Landroid/location/Location;
    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/TransitBundle;->deserve(Landroid/location/Location;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 106
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 107
    new-instance v4, Lcom/thetransitapp/droid/model/SimplePlacemark;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/maps/GoogleMap;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v4, v5}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/SimplePlacemark;->toLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/thetransitapp/droid/model/TransitBundle;->deserve(Landroid/location/Location;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 108
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4, v2}, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundleToLocation(Landroid/location/Location;)Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v1

    .line 110
    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/TransitBundle;->deserve(Landroid/location/Location;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 111
    const/4 v1, 0x0

    .line 119
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 120
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    .line 125
    :cond_1
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v4, v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->setCurrentRegion(Lcom/thetransitapp/droid/model/TransitBundle;)V

    .line 127
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->getBundles()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/thetransitapp/droid/OptionScreen$3;

    invoke-direct {v5, p0}, Lcom/thetransitapp/droid/OptionScreen$3;-><init>(Lcom/thetransitapp/droid/OptionScreen;)V

    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 134
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->getBundles()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_5

    .line 138
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v4

    if-nez v4, :cond_2

    .line 139
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    const/4 v5, 0x0

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 142
    :cond_2
    iget-object v4, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->notifyDataSetInvalidated()V

    .line 143
    return-void

    .line 115
    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    .line 120
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/model/TransitMode;

    .line 121
    .local v3, "mode":Lcom/thetransitapp/droid/model/TransitMode;
    iget-object v5, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v5, v3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->addMode(Lcom/thetransitapp/droid/model/TransitMode;)V

    goto :goto_1

    .line 134
    .end local v3    # "mode":Lcom/thetransitapp/droid/model/TransitMode;
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 135
    .local v0, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    iget-object v5, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v5, v0}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->addSupportedRegion(Lcom/thetransitapp/droid/model/TransitBundle;)V

    goto :goto_2
.end method

.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 5
    .param p1, "parent"    # Landroid/widget/ExpandableListView;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "groupPosition"    # I
    .param p4, "childPosition"    # I
    .param p5, "id"    # J

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 163
    iget-object v3, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v3, p3, p4}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getChild(II)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    .line 165
    .local v0, "mode":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 166
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_0
    invoke-virtual {v3, v1}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    .line 168
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v1, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 169
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v1, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    .line 172
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->notifyDataSetChanged()V

    .line 176
    :goto_1
    return v2

    :cond_1
    move v1, v2

    .line 166
    goto :goto_0

    :cond_2
    move v2, v1

    .line 176
    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 48
    const v0, 0x7f03002f

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 5
    .param p1, "parent"    # Landroid/widget/ExpandableListView;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "groupPosition"    # I
    .param p4, "id"    # J

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 147
    iget-object v3, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v3, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getChildrenCount(I)I

    move-result v3

    if-nez v3, :cond_1

    .line 148
    iget-object v3, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v3, p3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->getGroup(I)Lcom/thetransitapp/droid/widget/OptionItem;

    move-result-object v0

    .line 150
    .local v0, "item":Lcom/thetransitapp/droid/widget/OptionItem;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 151
    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v3

    invoke-virtual {v0}, Lcom/thetransitapp/droid/widget/OptionItem;->getMode()Lcom/thetransitapp/droid/model/TransitMode;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitMode;->isSelected()Z

    move-result v4

    if-eqz v4, :cond_0

    :goto_0
    invoke-virtual {v3, v1}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    .line 153
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->notifyDataSetChanged()V

    .line 158
    .end local v0    # "item":Lcom/thetransitapp/droid/widget/OptionItem;
    :goto_1
    return v2

    .restart local v0    # "item":Lcom/thetransitapp/droid/widget/OptionItem;
    :cond_0
    move v1, v2

    .line 151
    goto :goto_0

    .end local v0    # "item":Lcom/thetransitapp/droid/widget/OptionItem;
    :cond_1
    move v2, v1

    .line 158
    goto :goto_1
.end method

.method public onStart()V
    .locals 3

    .prologue
    .line 80
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onStart()V

    .line 82
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/controller/FeedManager;->isReady()Z

    move-result v1

    if-nez v1, :cond_2

    .line 83
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 85
    .local v0, "lastLocation":Landroid/location/Location;
    if-eqz v0, :cond_1

    .line 86
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 87
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v1, p0}, Lcom/thetransitapp/droid/controller/FeedManager;->addFeedManagerCallback(Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;)V

    .line 88
    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->feedManager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/thetransitapp/droid/controller/FeedManager;->refresh(Landroid/location/Location;Landroid/content/Context;)V

    .line 96
    .end local v0    # "lastLocation":Landroid/location/Location;
    :cond_0
    :goto_0
    return-void

    .line 91
    .restart local v0    # "lastLocation":Landroid/location/Location;
    :cond_1
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->showLocationServiceError()V

    goto :goto_0

    .line 94
    .end local v0    # "lastLocation":Landroid/location/Location;
    :cond_2
    invoke-virtual {p0}, Lcom/thetransitapp/droid/OptionScreen;->feedUpdated()V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 53
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 55
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->overlay:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/thetransitapp/droid/OptionScreen$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/OptionScreen$1;-><init>(Lcom/thetransitapp/droid/OptionScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 62
    new-instance v0, Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-super {p0, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 63
    iget-object v3, p0, Lcom/thetransitapp/droid/OptionScreen;->transitModes:Landroid/widget/ExpandableListView;

    invoke-direct {v0, v1, v2, v3}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;-><init>(Landroid/view/LayoutInflater;Landroid/support/v4/app/FragmentManager;Landroid/widget/ExpandableListView;)V

    .line 62
    iput-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    .line 64
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    new-instance v1, Lcom/thetransitapp/droid/OptionScreen$2;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/OptionScreen$2;-><init>(Lcom/thetransitapp/droid/OptionScreen;)V

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/TransitModeAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 73
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->transitModes:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/thetransitapp/droid/OptionScreen;->adapter:Lcom/thetransitapp/droid/widget/TransitModeAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 74
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->transitModes:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p0}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 75
    iget-object v0, p0, Lcom/thetransitapp/droid/OptionScreen;->transitModes:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p0}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 76
    return-void
.end method
