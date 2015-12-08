.class public Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SearchResultActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SearchResultActivity;
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
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/SearchResultActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 211
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    .line 212
    iput-object p2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    .line 213
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;)Lcom/hmobile/biblekjv/SearchResultActivity;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 222
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 227
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 234
    move-object v4, p2

    .line 235
    .local v4, "rowView":Landroid/view/View;
    new-instance v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;

    invoke-direct {v1}, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;-><init>()V

    .line 236
    .local v1, "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;
    if-nez v4, :cond_0

    .line 237
    iget-object v5, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v5}, Lcom/hmobile/biblekjv/SearchResultActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 238
    .local v3, "li":Landroid/view/LayoutInflater;
    const v5, 0x7f03002a

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 239
    invoke-virtual {v4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 241
    const v5, 0x7f0e006c

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 240
    iput-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtBookName:Landroid/widget/TextView;

    .line 243
    const v5, 0x7f0e00ac

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 242
    iput-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    .line 245
    const v5, 0x7f0e00c3

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 244
    iput-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    .line 250
    .end local v3    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v5, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/VerseInfo;

    .line 252
    .local v2, "info":Lcom/hmobile/model/VerseInfo;
    iget v5, v2, Lcom/hmobile/model/VerseInfo;->BookId:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 251
    invoke-static {v6, v7}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v0

    .line 253
    .local v0, "book":Ljava/lang/String;
    iget-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtBookName:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v2, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 254
    iget v7, v2, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 253
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 256
    iget-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    iget-object v6, v2, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    iget-object v5, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v6, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    .line 258
    iget-object v7, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    const v8, 0x7f0700b7

    invoke-virtual {v7, v8}, Lcom/hmobile/biblekjv/SearchResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 257
    invoke-virtual {v5, v6, v7}, Lcom/hmobile/biblekjv/SearchResultActivity;->setFontStyleRoboto(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 259
    iget-object v5, p0, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v6, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    const v7, -0xff0100

    invoke-virtual {v5, v6, v7}, Lcom/hmobile/biblekjv/SearchResultActivity;->ColorText(Landroid/widget/TextView;I)Landroid/text/SpannableString;

    .line 260
    iget-object v5, v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    new-instance v6, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;

    invoke-direct {v6, p0, v2}, Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter$1;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity$ListAdapter;Lcom/hmobile/model/VerseInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    return-object v4

    .line 247
    .end local v0    # "book":Ljava/lang/String;
    .end local v2    # "info":Lcom/hmobile/model/VerseInfo;
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;
    check-cast v1, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;

    .restart local v1    # "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolder;
    goto :goto_0
.end method
