.class public Lcom/thetransitapp/droid/LocationScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "LocationScreen.java"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;
.implements Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;


# instance fields
.field private autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

.field private latitude:D

.field private locationSet:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05008d
    .end annotation
.end field

.field private longitude:D

.field private oldMarker:Lcom/google/android/gms/maps/model/Marker;

.field private searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

.field private searchView:Lcom/actionbarsherlock/widget/SearchView;

.field private useMyLocation:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 58
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->setHasOptionsMenu(Z)V

    .line 59
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/LocationScreen;)Lcom/actionbarsherlock/widget/SearchView;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    return-object v0
.end method

.method private dropMarker(DD)V
    .locals 8
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    const-wide/16 v6, 0x0

    .line 243
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 245
    .local v1, "pos":Lcom/google/android/gms/maps/model/LatLng;
    iget-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v2, :cond_0

    .line 246
    iget-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 254
    :goto_0
    iget-object v3, p0, Lcom/thetransitapp/droid/LocationScreen;->locationSet:Landroid/widget/Button;

    iget-wide v4, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    cmpl-double v2, v4, v6

    if-eqz v2, :cond_1

    iget-wide v4, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    cmpl-double v2, v4, v6

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/Button;->setEnabled(Z)V

    .line 255
    return-void

    .line 248
    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 249
    .local v0, "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 251
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    iput-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    goto :goto_0

    .line 254
    .end local v0    # "options":Lcom/google/android/gms/maps/model/MarkerOptions;
    :cond_1
    const/4 v2, 0x0

    goto :goto_1
.end method


# virtual methods
.method public onAddressReceived(Lcom/bricolsoftconsulting/geocoderplus/Address;)V
    .locals 5
    .param p1, "address"    # Lcom/bricolsoftconsulting/geocoderplus/Address;

    .prologue
    .line 214
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 215
    if-eqz p1, :cond_2

    .line 216
    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getLatitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    .line 217
    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getLongitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    .line 218
    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getFormattedAddress()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0a0042

    invoke-super {p0, v2}, Lcom/thetransitapp/droid/BaseMapScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/thetransitapp/droid/LocationScreen;->useMyLocation:Z

    .line 220
    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->hideKeyboard()V

    .line 222
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 223
    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getViewPort()Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 224
    invoke-virtual {p1}, Lcom/bricolsoftconsulting/geocoderplus/Address;->getViewPort()Lcom/bricolsoftconsulting/geocoderplus/Area;

    move-result-object v1

    invoke-super {p0, v1}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Lcom/bricolsoftconsulting/geocoderplus/Area;)V

    .line 229
    :goto_0
    iget-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    iget-wide v3, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/thetransitapp/droid/LocationScreen;->dropMarker(DD)V

    .line 240
    :cond_0
    :goto_1
    return-void

    .line 226
    :cond_1
    iget-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    iget-wide v3, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    invoke-super {p0, v1, v2, v3, v4}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(DD)V

    goto :goto_0

    .line 231
    :cond_2
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 232
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 233
    .local v0, "alertDialog":Landroid/app/AlertDialog;
    const v1, 0x7f0a005a

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/LocationScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 234
    const v1, 0x7f0a0059

    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/LocationScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 235
    const/4 v1, -0x1

    const v2, 0x7f0a002f

    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/LocationScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    .line 236
    const/4 v3, 0x0

    .line 235
    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 237
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_1
.end method

.method public onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 2
    .param p1, "position"    # Lcom/google/android/gms/maps/model/CameraPosition;

    .prologue
    .line 177
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onCameraChange(Lcom/google/android/gms/maps/model/CameraPosition;)V

    .line 179
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    iget-object v1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->target:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setLocation(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 182
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const-wide/16 v5, 0x0

    .line 71
    iget-wide v3, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    cmpl-double v3, v3, v5

    if-eqz v3, :cond_0

    iget-wide v3, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    cmpl-double v3, v3, v5

    if-eqz v3, :cond_0

    .line 72
    new-instance v1, Lcom/thetransitapp/droid/model/SimplePlacemark;

    iget-wide v3, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    iget-wide v5, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/thetransitapp/droid/model/SimplePlacemark;-><init>(DD)V

    .line 73
    .local v1, "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    iget-object v3, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    invoke-virtual {v3}, Lcom/actionbarsherlock/widget/SearchView;->getQuery()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/thetransitapp/droid/model/SimplePlacemark;->setName(Ljava/lang/String;)V

    .line 75
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 76
    .local v0, "data":Landroid/content/Intent;
    const-string v3, "place"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 78
    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 79
    iget-boolean v3, p0, Lcom/thetransitapp/droid/LocationScreen;->useMyLocation:Z

    if-eqz v3, :cond_1

    const/4 v2, 0x2

    .line 80
    .local v2, "result":I
    :goto_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    check-cast v3, Lcom/thetransitapp/droid/TransitActivity;

    sget-object v4, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ordinal()I

    move-result v4

    invoke-virtual {v3, v4, v2, v0}, Lcom/thetransitapp/droid/TransitActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 84
    .end local v0    # "data":Landroid/content/Intent;
    .end local v1    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    .end local v2    # "result":I
    :cond_0
    return-void

    .line 79
    .restart local v0    # "data":Landroid/content/Intent;
    .restart local v1    # "place":Lcom/thetransitapp/droid/model/SimplePlacemark;
    :cond_1
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
    .locals 5
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
    .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;

    .prologue
    const/4 v4, 0x0

    .line 88
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V

    .line 90
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    if-nez v1, :cond_1

    .line 91
    new-instance v1, Lcom/actionbarsherlock/widget/SearchView;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/actionbarsherlock/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/actionbarsherlock/widget/SearchView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    .line 92
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    const v2, 0x7f0a0044

    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/LocationScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 94
    const/16 v1, 0xa

    const v2, 0x7f0a0045

    invoke-interface {p1, v4, v1, v4, v2}, Lcom/actionbarsherlock/view/Menu;->add(IIII)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setActionView(Landroid/view/View;)Lcom/actionbarsherlock/view/MenuItem;

    move-result-object v1

    iput-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    .line 95
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    const/16 v2, 0x9

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setShowAsAction(I)V

    .line 97
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    const v2, 0x7f020033

    invoke-interface {v1, v2}, Lcom/actionbarsherlock/view/MenuItem;->setIcon(I)Lcom/actionbarsherlock/view/MenuItem;

    .line 98
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v1}, Lcom/actionbarsherlock/view/MenuItem;->expandActionView()Z

    .line 100
    new-instance v1, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lcom/actionbarsherlock/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x1090003

    invoke-direct {v1, v2, v3}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;-><init>(Landroid/content/Context;I)V

    .line 100
    iput-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    .line 102
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    iget-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/widget/SearchView;->setSuggestionsAdapter(Landroid/support/v4/widget/CursorAdapter;)V

    .line 103
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    invoke-virtual {v1, p0}, Lcom/actionbarsherlock/widget/SearchView;->setOnSuggestionListener(Lcom/actionbarsherlock/widget/SearchView$OnSuggestionListener;)V

    .line 105
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    .line 106
    const v2, 0x7f050032

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 105
    check-cast v0, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;

    .line 108
    .local v0, "text":Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;
    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0, v4}, Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;->setThreshold(I)V

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/LocationScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/TransitActivity;

    iget-object v2, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/TransitActivity;->setSearchLocationMenuItem(Lcom/actionbarsherlock/view/MenuItem;)V

    .line 115
    .end local v0    # "text":Lcom/thetransitapp/droid/ui/DelayedAutoCompleteView;
    :cond_1
    return-void
.end method

.method public onDestroyOptionsMenu()V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onDestroyOptionsMenu()V

    .line 121
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->expandActionView()Z

    .line 122
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v0}, Lcom/actionbarsherlock/view/MenuItem;->collapseActionView()Z

    .line 123
    return-void
.end method

.method public onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 6
    .param p1, "point"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    const/4 v5, 0x0

    .line 186
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 187
    .local v0, "format":Ljava/text/NumberFormat;
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 189
    iget-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    new-instance v2, Ljava/lang/StringBuilder;

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v0, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v0, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 191
    new-instance v1, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    new-instance v3, Lcom/thetransitapp/droid/LocationScreen$1;

    invoke-direct {v3, p0}, Lcom/thetransitapp/droid/LocationScreen$1;-><init>(Lcom/thetransitapp/droid/LocationScreen;)V

    invoke-direct {v1, v2, v3}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/maps/model/LatLng;

    .line 202
    aput-object p1, v2, v5

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/service/ReverseGeocoderTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 204
    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iput-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    .line 205
    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iput-wide v1, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    .line 206
    iput-boolean v5, p0, Lcom/thetransitapp/droid/LocationScreen;->useMyLocation:Z

    .line 208
    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/thetransitapp/droid/LocationScreen;->dropMarker(DD)V

    .line 209
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->hideKeyboard()V

    .line 210
    return-void
.end method

.method public onMyLocationChange(Landroid/location/Location;)V
    .locals 6
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 160
    invoke-super {p0, p1}, Lcom/thetransitapp/droid/BaseMapScreen;->onMyLocationChange(Landroid/location/Location;)V

    .line 162
    if-eqz p1, :cond_0

    .line 163
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->setCurrent(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 165
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/thetransitapp/droid/LocationScreen;->latitude:D

    .line 167
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/thetransitapp/droid/LocationScreen;->longitude:D

    .line 169
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/thetransitapp/droid/LocationScreen;->useMyLocation:Z

    .line 173
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 146
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onPause()V

    .line 148
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V

    .line 151
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    .line 153
    iput-object v1, p0, Lcom/thetransitapp/droid/LocationScreen;->oldMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 156
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 5

    .prologue
    .line 127
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onResume()V

    .line 129
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 130
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 132
    .local v0, "me":Landroid/location/Location;
    if-eqz v0, :cond_0

    .line 133
    invoke-super {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;->centerMap(Landroid/location/Location;)V

    .line 135
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->isCurrentLocation()Z

    move-result v1

    if-nez v1, :cond_0

    .line 136
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/thetransitapp/droid/LocationScreen;->dropMarker(DD)V

    .line 140
    :cond_0
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/maps/GoogleMap;->setOnMapLongClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V

    .line 142
    .end local v0    # "me":Landroid/location/Location;
    :cond_1
    return-void
.end method

.method public onSuggestionClick(I)Z
    .locals 8
    .param p1, "position"    # I

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 264
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 265
    iget-object v3, p0, Lcom/thetransitapp/droid/LocationScreen;->autoCompleteAdapter:Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    .line 266
    .local v0, "cursor":Landroid/database/Cursor;
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 268
    const-string v3, "suggest_text_1"

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 269
    .local v2, "textIndex":I
    const-string v3, "suggest_text_2"

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 271
    .local v1, "referenceIndex":I
    new-instance v3, Lcom/thetransitapp/droid/service/GeocoderTask;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, p0}, Lcom/thetransitapp/droid/service/GeocoderTask;-><init>(Landroid/content/Context;Lcom/thetransitapp/droid/service/GeocoderTask$GeocoderTaskCallback;)V

    new-array v4, v7, [Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/service/GeocoderTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 273
    iget-object v3, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    invoke-interface {v3}, Lcom/actionbarsherlock/view/MenuItem;->collapseActionView()Z

    .line 274
    iget-object v3, p0, Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v6}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 277
    .end local v0    # "cursor":Landroid/database/Cursor;
    .end local v1    # "referenceIndex":I
    .end local v2    # "textIndex":I
    :cond_0
    return v7
.end method

.method public onSuggestionSelect(I)Z
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 259
    const/4 v0, 0x1

    return v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 63
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 65
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->locationSet:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen;->locationSet:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 67
    return-void
.end method

.method public setSearchMenuItem(Lcom/actionbarsherlock/view/MenuItem;)V
    .locals 0
    .param p1, "searchMenuItem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 42
    iput-object p1, p0, Lcom/thetransitapp/droid/LocationScreen;->searchMenuItem:Lcom/actionbarsherlock/view/MenuItem;

    return-void
.end method
