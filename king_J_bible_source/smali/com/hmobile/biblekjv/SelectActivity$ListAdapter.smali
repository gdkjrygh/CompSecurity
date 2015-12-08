.class public Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SelectActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SelectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ListAdapter"
.end annotation


# instance fields
.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/SelectActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SelectActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 271
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 269
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    .line 272
    iput-object p2, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    .line 273
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;)Lcom/hmobile/biblekjv/SelectActivity;
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 282
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 287
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 294
    move-object v3, p2

    .line 295
    .local v3, "rowView":Landroid/view/View;
    new-instance v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;

    invoke-direct {v0}, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;-><init>()V

    .line 296
    .local v0, "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    if-nez v3, :cond_0

    .line 297
    iget-object v4, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/SelectActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 298
    .local v2, "li":Landroid/view/LayoutInflater;
    const v4, 0x7f030007

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 299
    invoke-virtual {v3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 300
    const v4, 0x7f0e0064

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    .line 302
    const v4, 0x7f0e0063

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 301
    iput-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    .line 306
    .end local v2    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v4, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/BookInfo;

    .line 307
    .local v1, "info":Lcom/hmobile/model/BookInfo;
    iget-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    iget-object v5, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    iget-object v4, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v4, v4, Lcom/hmobile/biblekjv/SelectActivity;->book_id:I

    add-int/lit8 v5, p1, 0x1

    if-ne v4, v5, :cond_1

    iget-object v4, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-boolean v4, v4, Lcom/hmobile/biblekjv/SelectActivity;->isBookView:Z

    if-eqz v4, :cond_1

    .line 310
    iget-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    const-string v5, "#96D7EF"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 315
    :goto_1
    iget-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    const v5, 0x7f020060

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 316
    iget-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    new-instance v5, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;

    invoke-direct {v5, p0, p1}, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter$1;-><init>(Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;I)V

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    return-object v3

    .line 304
    .end local v1    # "info":Lcom/hmobile/model/BookInfo;
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    check-cast v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;

    .restart local v0    # "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    goto :goto_0

    .line 312
    .restart local v1    # "info":Lcom/hmobile/model/BookInfo;
    :cond_1
    iget-object v4, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/hmobile/biblekjv/SelectActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-virtual {v5}, Lcom/hmobile/biblekjv/SelectActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 313
    const v6, 0x7f080024

    .line 312
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto :goto_1
.end method
