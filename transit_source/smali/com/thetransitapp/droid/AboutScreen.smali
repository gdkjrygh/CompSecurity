.class public Lcom/thetransitapp/droid/AboutScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "AboutScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private manager:Lcom/thetransitapp/droid/controller/FeedManager;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private overlay:Landroid/widget/LinearLayout;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050082
    .end annotation
.end field

.field private reviewApp:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050084
    .end annotation
.end field

.field private routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private sendFeedback:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050083
    .end annotation
.end field

.field private shareApp:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050085
    .end annotation
.end field

.field private stayTouch:Landroid/widget/Button;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f050086
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 58
    return-void
.end method

.method private createDebugInfo(Ljava/lang/String;)Z
    .locals 18
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 131
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/AboutScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v15

    invoke-virtual {v15}, Landroid/support/v4/app/FragmentActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/AboutScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Landroid/support/v4/app/FragmentActivity;->getPackageName()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    invoke-virtual/range {v15 .. v17}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v11

    .line 132
    .local v11, "pInfo":Landroid/content/pm/PackageInfo;
    new-instance v15, Ljava/lang/StringBuilder;

    const-string v16, "Transit : "

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v11, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, " ("

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v11, Landroid/content/pm/PackageInfo;->versionCode:I

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, ")\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 134
    .local v2, "debug":Ljava/lang/String;
    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 135
    .local v9, "osVersion":Ljava/lang/String;
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 136
    .local v8, "model":Ljava/lang/String;
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Device : "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 137
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Android "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 138
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Identifier "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-static {}, Lorg/OpenUDID/OpenUDID_manager;->getOpenUDID()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 140
    invoke-virtual/range {p0 .. p0}, Lcom/thetransitapp/droid/AboutScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v15

    invoke-virtual {v15}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 141
    .local v7, "metrics":Landroid/util/DisplayMetrics;
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Screen size "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "x"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, " ("

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v7, Landroid/util/DisplayMetrics;->xdpi:F

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v15

    .line 142
    const-string v16, "x"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v7, Landroid/util/DisplayMetrics;->ydpi:F

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "dpi) ("

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    iget v0, v7, Landroid/util/DisplayMetrics;->densityDpi:I

    move/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, " android-dpi)\n\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    .line 141
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 144
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Current local time : "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    new-instance v16, Ljava/util/Date;

    invoke-direct/range {v16 .. v16}, Ljava/util/Date;-><init>()V

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 146
    invoke-super/range {p0 .. p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    .line 148
    .local v1, "currentLocation":Landroid/location/Location;
    if-eqz v1, :cond_0

    .line 149
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Pushed location : "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v16

    invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, ","

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    .line 150
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v16

    invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, "\n\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    .line 149
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 153
    :cond_0
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Local feeds\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 155
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/thetransitapp/droid/AboutScreen;->manager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v15}, Lcom/thetransitapp/droid/controller/FeedManager;->getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v15

    invoke-virtual {v15}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_3

    .line 159
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 161
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "Last /plan fetches\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 162
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/AboutScreen;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    move-object/from16 v16, v0

    const-string v17, "LAST_PLAN_FETCH_KEY"

    invoke-virtual/range {v16 .. v17}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->getCache(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 164
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "\n"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 166
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/thetransitapp/droid/AboutScreen;->routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    if-eqz v15, :cond_2

    .line 167
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/thetransitapp/droid/AboutScreen;->routeViewController:Lcom/thetransitapp/droid/controller/RouteViewController;

    invoke-virtual {v15}, Lcom/thetransitapp/droid/controller/RouteViewController;->getDisplayedRoute()Ljava/util/List;

    move-result-object v3

    .line 168
    .local v3, "displayedRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .local v12, "realTime":Ljava/lang/StringBuilder;
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .local v13, "schedule":Ljava/lang/StringBuilder;
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_1
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_4

    .line 190
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "\nVisible routes with real-time: "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 191
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v16, "\nVisible routes without real-time: "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 194
    .end local v3    # "displayedRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    .end local v12    # "realTime":Ljava/lang/StringBuilder;
    .end local v13    # "schedule":Ljava/lang/StringBuilder;
    :cond_2
    new-instance v6, Ljava/io/FileOutputStream;

    move-object/from16 v0, p1

    invoke-direct {v6, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 195
    .local v6, "fos":Ljava/io/FileOutputStream;
    new-instance v10, Ljava/io/OutputStreamWriter;

    const-string v15, "UTF-8"

    invoke-direct {v10, v6, v15}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 196
    .local v10, "out":Ljava/io/Writer;
    invoke-virtual {v10, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v10}, Ljava/io/Writer;->flush()V

    .line 198
    invoke-virtual {v10}, Ljava/io/Writer;->close()V

    .line 200
    const/4 v15, 0x1

    .line 206
    .end local v1    # "currentLocation":Landroid/location/Location;
    .end local v2    # "debug":Ljava/lang/String;
    .end local v6    # "fos":Ljava/io/FileOutputStream;
    .end local v7    # "metrics":Landroid/util/DisplayMetrics;
    .end local v8    # "model":Ljava/lang/String;
    .end local v9    # "osVersion":Ljava/lang/String;
    .end local v10    # "out":Ljava/io/Writer;
    .end local v11    # "pInfo":Landroid/content/pm/PackageInfo;
    :goto_2
    return v15

    .line 155
    .restart local v1    # "currentLocation":Landroid/location/Location;
    .restart local v2    # "debug":Ljava/lang/String;
    .restart local v7    # "metrics":Landroid/util/DisplayMetrics;
    .restart local v8    # "model":Ljava/lang/String;
    .restart local v9    # "osVersion":Ljava/lang/String;
    .restart local v11    # "pInfo":Landroid/content/pm/PackageInfo;
    :cond_3
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/thetransitapp/droid/model/Feed;

    .line 156
    .local v5, "feed":Lcom/thetransitapp/droid/model/Feed;
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    invoke-direct/range {v16 .. v17}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Feed;->getName()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, " ("

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, ") \n"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    .line 171
    .end local v5    # "feed":Lcom/thetransitapp/droid/model/Feed;
    .restart local v3    # "displayedRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    .restart local v12    # "realTime":Ljava/lang/StringBuilder;
    .restart local v13    # "schedule":Ljava/lang/StringBuilder;
    :cond_4
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;

    .line 172
    .local v14, "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v16

    if-eqz v16, :cond_1

    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->isActive()Z

    move-result v16

    if-eqz v16, :cond_1

    .line 173
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v16

    if-eqz v16, :cond_1

    .line 174
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getCurrentItinerary()Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/thetransitapp/droid/model/ScheduleItem;->getRealStopTime()Ljava/util/Date;

    move-result-object v16

    if-eqz v16, :cond_6

    .line 175
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v16

    if-lez v16, :cond_5

    .line 176
    const-string v16, ","

    move-object/from16 v0, v16

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    :cond_5
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 201
    .end local v1    # "currentLocation":Landroid/location/Location;
    .end local v2    # "debug":Ljava/lang/String;
    .end local v3    # "displayedRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    .end local v7    # "metrics":Landroid/util/DisplayMetrics;
    .end local v8    # "model":Ljava/lang/String;
    .end local v9    # "osVersion":Ljava/lang/String;
    .end local v11    # "pInfo":Landroid/content/pm/PackageInfo;
    .end local v12    # "realTime":Ljava/lang/StringBuilder;
    .end local v13    # "schedule":Ljava/lang/StringBuilder;
    .end local v14    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    :catch_0
    move-exception v4

    .line 202
    .local v4, "e":Ljava/lang/Exception;
    const-class v15, Lcom/thetransitapp/droid/AboutScreen;

    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-static {v15, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 203
    invoke-static {v4}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 206
    const/4 v15, 0x0

    goto/16 :goto_2

    .line 181
    .end local v4    # "e":Ljava/lang/Exception;
    .restart local v1    # "currentLocation":Landroid/location/Location;
    .restart local v2    # "debug":Ljava/lang/String;
    .restart local v3    # "displayedRoutes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;>;"
    .restart local v7    # "metrics":Landroid/util/DisplayMetrics;
    .restart local v8    # "model":Ljava/lang/String;
    .restart local v9    # "osVersion":Ljava/lang/String;
    .restart local v11    # "pInfo":Landroid/content/pm/PackageInfo;
    .restart local v12    # "realTime":Ljava/lang/StringBuilder;
    .restart local v13    # "schedule":Ljava/lang/StringBuilder;
    .restart local v14    # "viewModel":Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;
    :cond_6
    :try_start_1
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v16

    if-lez v16, :cond_7

    .line 182
    const-string v16, ", "

    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    :cond_7
    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/viewmodel/NearbyRouteViewModel;->getShortName()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1
.end method

.method private getStringWithPackage(I)Ljava/lang/String;
    .locals 3
    .param p1, "resId"    # I

    .prologue
    .line 126
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const v2, 0x7f0a0069

    invoke-virtual {p0, v2}, Lcom/thetransitapp/droid/AboutScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, p1, v0}, Lcom/thetransitapp/droid/AboutScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 12
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v10, 0x1

    const/4 v11, 0x0

    .line 79
    iget-object v7, p0, Lcom/thetransitapp/droid/AboutScreen;->reviewApp:Landroid/widget/Button;

    if-ne p1, v7, :cond_1

    .line 80
    new-instance v4, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v4, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 82
    .local v4, "intent":Landroid/content/Intent;
    const v7, 0x7f0a006a

    invoke-direct {p0, v7}, Lcom/thetransitapp/droid/AboutScreen;->getStringWithPackage(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 85
    :try_start_0
    invoke-virtual {p0, v4}, Lcom/thetransitapp/droid/AboutScreen;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    .end local v4    # "intent":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 86
    .restart local v4    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v1

    .line 88
    .local v1, "e":Landroid/content/ActivityNotFoundException;
    const v7, 0x7f0a006b

    invoke-direct {p0, v7}, Lcom/thetransitapp/droid/AboutScreen;->getStringWithPackage(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 91
    :try_start_1
    invoke-virtual {p0, v4}, Lcom/thetransitapp/droid/AboutScreen;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 92
    :catch_1
    move-exception v2

    .line 93
    .local v2, "ex":Landroid/content/ActivityNotFoundException;
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    const v8, 0x7f0a0062

    invoke-static {v7, v8, v11}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 96
    .end local v1    # "e":Landroid/content/ActivityNotFoundException;
    .end local v2    # "ex":Landroid/content/ActivityNotFoundException;
    .end local v4    # "intent":Landroid/content/Intent;
    :cond_1
    iget-object v7, p0, Lcom/thetransitapp/droid/AboutScreen;->sendFeedback:Landroid/widget/Button;

    if-ne p1, v7, :cond_3

    .line 97
    new-instance v3, Landroid/content/Intent;

    const-string v7, "android.intent.action.SEND"

    invoke-direct {v3, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 98
    .local v3, "feedbackIntent":Landroid/content/Intent;
    const-string v7, "message/rfc822"

    invoke-virtual {v3, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const-string v7, "android.intent.extra.EMAIL"

    new-array v8, v10, [Ljava/lang/String;

    const v9, 0x7f0a0068

    invoke-virtual {p0, v9}, Lcom/thetransitapp/droid/AboutScreen;->getString(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v11

    invoke-virtual {v3, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    const-string v7, "android.intent.extra.SUBJECT"

    .line 101
    const v8, 0x7f0a0065

    new-array v9, v10, [Ljava/lang/Object;

    const v10, 0x7f0a002b

    invoke-virtual {p0, v10}, Lcom/thetransitapp/droid/AboutScreen;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v11

    invoke-virtual {p0, v8, v9}, Lcom/thetransitapp/droid/AboutScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 100
    invoke-virtual {v3, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    invoke-virtual {p0}, Lcom/thetransitapp/droid/AboutScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    invoke-static {v7}, Lcom/thetransitapp/droid/DebugInfoProvider;->getDebugInfoPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 105
    .local v0, "debugPath":Ljava/lang/String;
    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/AboutScreen;->createDebugInfo(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 106
    const-string v7, "android.intent.extra.STREAM"

    .line 107
    const-string v8, "content://com.thetransitapp.droid/Debugging_info.txt"

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 106
    invoke-virtual {v3, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 110
    :cond_2
    const-string v7, "Send via"

    invoke-static {v3, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/thetransitapp/droid/AboutScreen;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 111
    .end local v0    # "debugPath":Ljava/lang/String;
    .end local v3    # "feedbackIntent":Landroid/content/Intent;
    :cond_3
    iget-object v7, p0, Lcom/thetransitapp/droid/AboutScreen;->shareApp:Landroid/widget/Button;

    if-ne p1, v7, :cond_0

    .line 112
    iget-object v7, p0, Lcom/thetransitapp/droid/AboutScreen;->manager:Lcom/thetransitapp/droid/controller/FeedManager;

    invoke-virtual {v7}, Lcom/thetransitapp/droid/controller/FeedManager;->getShareMessage()Ljava/lang/String;

    move-result-object v5

    .line 114
    .local v5, "shareBody":Ljava/lang/String;
    new-instance v6, Landroid/content/Intent;

    const-string v7, "android.intent.action.SEND"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    .local v6, "sharingIntent":Landroid/content/Intent;
    const-string v7, "text/plain"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    const-string v7, "android.intent.extra.SUBJECT"

    const v8, 0x7f0a002e

    invoke-virtual {p0, v8}, Lcom/thetransitapp/droid/AboutScreen;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 117
    const-string v7, "android.intent.extra.TEXT"

    invoke-virtual {v6, v7, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    const-string v7, "Share via"

    invoke-static {v6, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/thetransitapp/droid/AboutScreen;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 62
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 64
    iget-object v0, p0, Lcom/thetransitapp/droid/AboutScreen;->overlay:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/thetransitapp/droid/AboutScreen$1;

    invoke-direct {v1, p0}, Lcom/thetransitapp/droid/AboutScreen$1;-><init>(Lcom/thetransitapp/droid/AboutScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 71
    iget-object v0, p0, Lcom/thetransitapp/droid/AboutScreen;->sendFeedback:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object v0, p0, Lcom/thetransitapp/droid/AboutScreen;->reviewApp:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/thetransitapp/droid/AboutScreen;->shareApp:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget-object v0, p0, Lcom/thetransitapp/droid/AboutScreen;->stayTouch:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    return-void
.end method
