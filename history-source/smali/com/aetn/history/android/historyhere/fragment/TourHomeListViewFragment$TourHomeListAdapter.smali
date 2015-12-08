.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;
.super Landroid/widget/ArrayAdapter;
.source "TourHomeListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TourHomeListAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;"
    }
.end annotation


# instance fields
.field private final lightGreyMask:Landroid/graphics/drawable/Drawable;

.field private final mediumGreyMask:Landroid/graphics/drawable/Drawable;

.field private poiArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private textViewResourceId:I

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

.field private final whiteMask:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 2
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "textViewResourceId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 172
    .local p4, "poiArrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .line 173
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 168
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02013d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->whiteMask:Landroid/graphics/drawable/Drawable;

    .line 169
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02013b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->lightGreyMask:Landroid/graphics/drawable/Drawable;

    .line 170
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02013c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->mediumGreyMask:Landroid/graphics/drawable/Drawable;

    .line 174
    iput-object p4, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->poiArrayList:Ljava/util/ArrayList;

    .line 175
    iput p3, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->textViewResourceId:I

    .line 177
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 29
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 183
    invoke-virtual/range {p0 .. p1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->getItemViewType(I)I

    move-result v28

    .line 184
    .local v28, "viewType":I
    const-string v2, "TourHomeListViewFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "viewType:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v0, v28

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v11

    .line 186
    .local v11, "currentUserLocation":Landroid/location/Location;
    invoke-virtual/range {p0 .. p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "layout_inflater"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Landroid/view/LayoutInflater;

    .line 187
    .local v27, "vi":Landroid/view/LayoutInflater;
    move-object/from16 v0, p0

    iget v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->textViewResourceId:I

    const/4 v3, 0x0

    move-object/from16 v0, v27

    move-object/from16 v1, p3

    invoke-virtual {v0, v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 188
    new-instance v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-direct {v15, v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V

    .line 189
    .local v15, "holder":Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;
    const v2, 0x7f0a0041

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    .line 190
    const v2, 0x7f0a00d5

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->city:Landroid/widget/TextView;

    .line 191
    const v2, 0x7f0a006a

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    .line 192
    const v2, 0x7f0a0040

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    .line 193
    const v2, 0x7f0a0098

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    .line 194
    const v2, 0x7f0a0068

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->defaultIcon:Landroid/widget/ImageView;

    .line 195
    const v2, 0x7f0a00e9

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconHolder:Landroid/view/ViewGroup;

    .line 196
    const v2, 0x7f0a0059

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->bg:Landroid/view/ViewGroup;

    .line 197
    const v2, 0x7f0a00c3

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    .line 198
    move-object/from16 v0, p2

    invoke-virtual {v0, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 200
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->poiArrayList:Ljava/util/ArrayList;

    move/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 202
    .local v22, "o":Lcom/aetn/history/android/historyhere/model/POIDetail;
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 203
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v2

    iget-object v0, v2, Lcom/aetn/history/android/historyhere/model/Configuration;->tourSponsorData:Ljava/util/ArrayList;

    move-object/from16 v24, v0

    .line 204
    .local v24, "sponsorData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;>;"
    const/16 v26, 0x0

    .line 205
    .local v26, "sponsoredTour":Z
    const-string v25, ""

    .line 206
    .local v25, "sponsorLogo":Ljava/lang/String;
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;

    .line 207
    .local v12, "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    const-string v3, "TourHomeListViewFragment"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getView(): data.id:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, v12, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const-string v3, "TourHomeListViewFragment"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getView(): o.getId():"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    iget-object v3, v12, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->id:Ljava/lang/String;

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 211
    iget-object v0, v12, Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;->listImageURL:Ljava/lang/String;

    move-object/from16 v25, v0

    .line 212
    const/16 v26, 0x1

    .line 216
    .end local v12    # "data":Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->isSmallScreen(Landroid/content/Context;)Z

    move-result v18

    .line 217
    .local v18, "isSmallScreen":Z
    const/4 v2, 0x1

    move/from16 v0, v26

    if-ne v0, v2, :cond_8

    .line 218
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->mContext:Landroid/content/Context;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v3

    move-object/from16 v0, v25

    invoke-virtual {v2, v0, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 219
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->sponsorImage:Lcom/android/volley/toolbox/NetworkImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 220
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->bg:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090039

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 221
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f02013d

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 222
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v2}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    check-cast v19, Landroid/widget/FrameLayout$LayoutParams;

    .line 223
    .local v19, "lp":Landroid/widget/FrameLayout$LayoutParams;
    const/16 v16, 0x78

    .line 224
    .local v16, "iSize":I
    if-eqz v18, :cond_2

    .line 225
    const/16 v16, 0x64

    .line 227
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move/from16 v0, v16

    invoke-static {v2, v0}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v17

    .line 228
    .local v17, "iconSize":I
    move/from16 v0, v17

    move-object/from16 v1, v19

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 229
    move/from16 v0, v17

    move-object/from16 v1, v19

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 230
    const/4 v2, 0x0

    move-object/from16 v0, v19

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 231
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lcom/android/volley/toolbox/NetworkImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 233
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->defaultIcon:Landroid/widget/ImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 254
    :goto_0
    if-eqz v22, :cond_7

    .line 255
    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->id:Ljava/lang/String;

    .line 256
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    if-eqz v2, :cond_3

    .line 257
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    :cond_3
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    if-eqz v2, :cond_4

    .line 260
    if-eqz v11, :cond_b

    .line 262
    const-string v21, ""

    .line 263
    .local v21, "mileageFromUserLocation":Ljava/lang/String;
    invoke-virtual {v11}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v11}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v6

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v8

    const-string v10, "M"

    invoke-static/range {v2 .. v10}, Lcom/aetn/history/android/historyhere/utils/Utils;->getDistanceBetweenLocations(DDDDLjava/lang/String;)D

    move-result-wide v13

    .line 264
    .local v13, "distanceFromUserLocation":D
    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v2, v13

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double v13, v2, v4

    .line 265
    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    cmpl-double v2, v13, v2

    if-lez v2, :cond_a

    .line 266
    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-double v13, v2

    .line 267
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v3, v13

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " miles"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    .line 271
    :goto_1
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    move-object/from16 v0, v21

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 277
    .end local v13    # "distanceFromUserLocation":D
    .end local v21    # "mileageFromUserLocation":Ljava/lang/String;
    :goto_2
    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 278
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 281
    :cond_4
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->city:Landroid/widget/TextView;

    if-eqz v2, :cond_5

    .line 282
    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getCityStateString()Ljava/lang/String;

    move-result-object v23

    .line 283
    .local v23, "s":Ljava/lang/String;
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_c

    .line 284
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->city:Landroid/widget/TextView;

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getCityStateString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->city:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    .end local v23    # "s":Ljava/lang/String;
    :cond_5
    :goto_3
    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 292
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/android/volley/toolbox/NetworkImageView;->setVisibility(I)V

    .line 293
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-static {v4}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 298
    :cond_6
    const-string v2, "TourHomeListViewFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "the image for this is :*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    :cond_7
    const/4 v2, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 302
    invoke-virtual/range {v22 .. v22}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    .line 303
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconHolder:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 304
    const v2, 0x1080065

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 306
    if-eqz v26, :cond_d

    .line 307
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1, v15}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;)V

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 350
    :goto_4
    return-object p2

    .line 236
    .end local v16    # "iSize":I
    .end local v17    # "iconSize":I
    .end local v19    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    :cond_8
    const-string v2, "TourHomeListViewFragment"

    const-string v3, "getView(): the item is not so set the color to white"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->bg:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090037

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 238
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f02013b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 239
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v2}, Lcom/android/volley/toolbox/NetworkImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    check-cast v19, Landroid/widget/FrameLayout$LayoutParams;

    .line 240
    .restart local v19    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    const/16 v16, 0x5a

    .line 241
    .restart local v16    # "iSize":I
    const/16 v20, 0xf

    .line 242
    .local v20, "mSize":I
    if-eqz v18, :cond_9

    .line 243
    const/16 v20, 0x5

    .line 245
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move/from16 v0, v16

    invoke-static {v2, v0}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v17

    .line 246
    .restart local v17    # "iconSize":I
    move/from16 v0, v17

    move-object/from16 v1, v19

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 247
    move/from16 v0, v17

    move-object/from16 v1, v19

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 248
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move/from16 v0, v20

    invoke-static {v2, v0}, Lcom/aetn/history/android/historyhere/utils/UIUtils;->getDeviceIndependentPixels(Landroid/content/Context;I)I

    move-result v2

    move-object/from16 v0, v19

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 249
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lcom/android/volley/toolbox/NetworkImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 250
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->defaultIcon:Landroid/widget/ImageView;

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 269
    .end local v20    # "mSize":I
    .restart local v13    # "distanceFromUserLocation":D
    .restart local v21    # "mileageFromUserLocation":Ljava/lang/String;
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " miles"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    goto/16 :goto_1

    .line 274
    .end local v13    # "distanceFromUserLocation":D
    .end local v21    # "mileageFromUserLocation":Ljava/lang/String;
    :cond_b
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->mileage:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    .line 287
    .restart local v23    # "s":Ljava/lang/String;
    :cond_c
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->city:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_3

    .line 325
    .end local v23    # "s":Ljava/lang/String;
    :cond_d
    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1, v15}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;)V

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_4

    .line 345
    :cond_e
    iget-object v2, v15, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconHolder:Landroid/view/ViewGroup;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_4
.end method
