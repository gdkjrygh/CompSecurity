.class public Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;
.super Landroid/widget/BaseAdapter;
.source "BookMarkesActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/BookMarkesActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BookamrkListAdapter"
.end annotation


# instance fields
.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookMarkInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/BookMarkesActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookMarkInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 127
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookMarkInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->m_list:Ljava/util/ArrayList;

    .line 128
    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->m_list:Ljava/util/ArrayList;

    .line 129
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 138
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 143
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 149
    move-object v5, p2

    .line 150
    .local v5, "rowView":Landroid/view/View;
    new-instance v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;

    invoke-direct {v3}, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;-><init>()V

    .line 151
    .local v3, "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;
    if-nez v5, :cond_0

    .line 152
    iget-object v6, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    invoke-virtual {v6}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v4

    .line 153
    .local v4, "li":Landroid/view/LayoutInflater;
    const v6, 0x7f030008

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 154
    invoke-virtual {v5, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 156
    const v6, 0x7f0e006b

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 155
    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtLable:Landroid/widget/TextView;

    .line 158
    const v6, 0x7f0e006a

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    .line 157
    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->btnDelete:Landroid/widget/Button;

    .line 159
    const v6, 0x7f0e0064

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtTitle:Landroid/widget/TextView;

    .line 160
    const v6, 0x7f0e0069

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtDate:Landroid/widget/TextView;

    .line 161
    const v6, 0x7f0e0068

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtDay:Landroid/widget/TextView;

    .line 162
    const v6, 0x7f0e006c

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtBookName:Landroid/widget/TextView;

    .line 164
    const v6, 0x7f0e0065

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 163
    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->rl:Landroid/widget/RelativeLayout;

    .line 166
    const v6, 0x7f0e0066

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 165
    iput-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->rlColor:Landroid/widget/RelativeLayout;

    .line 171
    .end local v4    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v6, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;

    .line 172
    .local v0, "bookmark":Lcom/hmobile/model/BookMarkInfo;
    iget-boolean v6, v0, Lcom/hmobile/model/BookMarkInfo;->isBackColor:Z

    if-eqz v6, :cond_1

    .line 173
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->rlColor:Landroid/widget/RelativeLayout;

    iget v7, v0, Lcom/hmobile/model/BookMarkInfo;->backColor:I

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 178
    :goto_1
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtLable:Landroid/widget/TextView;

    iget-object v7, v0, Lcom/hmobile/model/BookMarkInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtTitle:Landroid/widget/TextView;

    iget-object v7, v0, Lcom/hmobile/model/BookMarkInfo;->Name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    iget-object v6, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    iget-wide v8, v0, Lcom/hmobile/model/BookMarkInfo;->date:J

    const-string v7, "MMM/dd"

    invoke-virtual {v6, v8, v9, v7}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getDate(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 181
    .local v2, "date":[Ljava/lang/String;
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtDay:Landroid/widget/TextView;

    const/4 v7, 0x0

    aget-object v7, v2, v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtDate:Landroid/widget/TextView;

    const/4 v7, 0x1

    aget-object v7, v2, v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget v6, v0, Lcom/hmobile/model/BookMarkInfo;->book_id:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 183
    invoke-static {v6, v7}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v1

    .line 185
    .local v1, "bookname":Ljava/lang/String;
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->txtBookName:Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v8, v0, Lcom/hmobile/model/BookMarkInfo;->chap_number:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 186
    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v8, v0, Lcom/hmobile/model/BookMarkInfo;->verse_id:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 185
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->rl:Landroid/widget/RelativeLayout;

    new-instance v7, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;

    invoke-direct {v7, p0, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$1;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;Lcom/hmobile/model/BookMarkInfo;)V

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->btnDelete:Landroid/widget/Button;

    new-instance v7, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;

    invoke-direct {v7, p0, v0}, Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter$2;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity$BookamrkListAdapter;Lcom/hmobile/model/BookMarkInfo;)V

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    return-object v5

    .line 168
    .end local v0    # "bookmark":Lcom/hmobile/model/BookMarkInfo;
    .end local v1    # "bookname":Ljava/lang/String;
    .end local v2    # "date":[Ljava/lang/String;
    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    .end local v3    # "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;
    check-cast v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;

    .restart local v3    # "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;
    goto/16 :goto_0

    .line 175
    .restart local v0    # "bookmark":Lcom/hmobile/model/BookMarkInfo;
    :cond_1
    iget-object v6, v3, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForBookMark;->rlColor:Landroid/widget/RelativeLayout;

    const-string v7, "#FFFFFF"

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    goto/16 :goto_1
.end method
