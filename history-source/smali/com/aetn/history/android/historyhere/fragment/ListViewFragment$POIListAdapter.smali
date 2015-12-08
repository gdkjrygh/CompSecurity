.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;
.super Landroid/widget/ArrayAdapter;
.source "ListViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "POIListAdapter"
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

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;Landroid/content/Context;ILjava/util/ArrayList;)V
    .locals 3
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
    .line 220
    .local p4, "poiArrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .line 221
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 222
    iput-object p4, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->poiArrayList:Ljava/util/ArrayList;

    .line 223
    iput p3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->textViewResourceId:I

    .line 224
    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "POIList.size():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v6, 0x0

    .line 232
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "layout_inflater"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/LayoutInflater;

    .line 233
    .local v2, "vi":Landroid/view/LayoutInflater;
    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->textViewResourceId:I

    invoke-virtual {v2, v3, p3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 234
    new-instance v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-direct {v0, v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V

    .line 235
    .local v0, "holder":Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;
    const v3, 0x7f0a0097

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->root:Landroid/view/ViewGroup;

    .line 236
    const v3, 0x7f0a0041

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    .line 237
    const v3, 0x7f0a007a

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->short_description:Landroid/widget/TextView;

    .line 238
    const v3, 0x7f0a0040

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/android/volley/toolbox/NetworkImageView;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    .line 239
    const v3, 0x7f0a0067

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconHolder:Landroid/widget/FrameLayout;

    .line 240
    iput p1, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->position:I

    .line 241
    const v3, 0x7f0a0098

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    .line 242
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0200e9

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 243
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 245
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->poiArrayList:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 246
    .local v1, "poi":Lcom/aetn/history/android/historyhere/model/POIDetail;
    if-eqz v1, :cond_2

    .line 247
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getId()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->id:Ljava/lang/String;

    .line 248
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    if-eqz v3, :cond_0

    .line 249
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->title:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    :cond_0
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->short_description:Landroid/widget/TextView;

    if-eqz v3, :cond_1

    .line 253
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 254
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->short_description:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getShortDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    :cond_1
    :goto_0
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    if-eqz v3, :cond_2

    .line 261
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "POIListAdapter:o.getImage():"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->id:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 263
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconHolder:Landroid/widget/FrameLayout;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 267
    :goto_1
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "IMAGE:make the request: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    .line 269
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getImage()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-static {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/HttpRequestManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/aetn/history/android/historyhere/model/HttpRequestManager;->getImageLoader()Lcom/android/volley/toolbox/ImageLoader;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/android/volley/toolbox/NetworkImageView;->setImageUrl(Ljava/lang/String;Lcom/android/volley/toolbox/ImageLoader;)V

    .line 279
    :cond_2
    :goto_2
    const/4 v3, 0x1

    invoke-virtual {p2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 281
    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    invoke-virtual {p2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    return-object p2

    .line 256
    :cond_3
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->short_description:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 265
    :cond_4
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconHolder:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_1

    .line 271
    :cond_5
    iget-object v3, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->icon:Lcom/android/volley/toolbox/NetworkImageView;

    const v4, 0x7f0200e8

    invoke-virtual {v3, v4}, Lcom/android/volley/toolbox/NetworkImageView;->setBackgroundResource(I)V

    goto :goto_2
.end method
