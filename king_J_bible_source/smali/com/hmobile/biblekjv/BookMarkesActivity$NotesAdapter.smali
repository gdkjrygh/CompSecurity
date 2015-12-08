.class public Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;
.super Landroid/widget/BaseAdapter;
.source "BookMarkesActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/BookMarkesActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NotesAdapter"
.end annotation


# instance fields
.field private m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/NotesInfo;",
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
            "Lcom/hmobile/model/NotesInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 227
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->m_list:Ljava/util/ArrayList;

    .line 228
    iput-object p2, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->m_list:Ljava/util/ArrayList;

    .line 229
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;)Lcom/hmobile/biblekjv/BookMarkesActivity;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 238
    iget-object v0, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 243
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 249
    move-object v4, p2

    .line 250
    .local v4, "rowView":Landroid/view/View;
    new-instance v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;

    invoke-direct {v1}, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;-><init>()V

    .line 251
    .local v1, "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;
    if-nez v4, :cond_0

    .line 252
    iget-object v5, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    invoke-virtual {v5}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    .line 253
    .local v2, "li":Landroid/view/LayoutInflater;
    const v5, 0x7f030026

    const/4 v6, 0x0

    invoke-virtual {v2, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 255
    invoke-virtual {v4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 257
    const v5, 0x7f0e006a

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 256
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->btnDelete:Landroid/widget/Button;

    .line 259
    const v5, 0x7f0e00b4

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    .line 258
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->btnEdit:Landroid/widget/Button;

    .line 261
    const v5, 0x7f0e00b3

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 260
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtNotesTitle:Landroid/widget/TextView;

    .line 263
    const v5, 0x7f0e00b5

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 262
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtNotesDesc:Landroid/widget/TextView;

    .line 265
    const v5, 0x7f0e006c

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 264
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtBookName:Landroid/widget/TextView;

    .line 266
    const v5, 0x7f0e0069

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtDate:Landroid/widget/TextView;

    .line 268
    const v5, 0x7f0e00b2

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 267
    iput-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->rlNotesItem:Landroid/widget/RelativeLayout;

    .line 273
    .end local v2    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v5, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/model/NotesInfo;

    .line 275
    .local v3, "noteInfo":Lcom/hmobile/model/NotesInfo;
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtNotesTitle:Landroid/widget/TextView;

    iget-object v6, v3, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtNotesDesc:Landroid/widget/TextView;

    iget-object v6, v3, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    iget v5, v3, Lcom/hmobile/model/NotesInfo;->book_id:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 277
    invoke-static {v6, v7}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v0

    .line 279
    .local v0, "bookname":Ljava/lang/String;
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtBookName:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v3, Lcom/hmobile/model/NotesInfo;->chap_number:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 280
    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v3, Lcom/hmobile/model/NotesInfo;->verse_id:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 279
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->txtDate:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;->this$0:Lcom/hmobile/biblekjv/BookMarkesActivity;

    iget-wide v8, v3, Lcom/hmobile/model/NotesInfo;->date:J

    const-string v7, "dd MMM, yy"

    invoke-virtual {v6, v8, v9, v7}, Lcom/hmobile/biblekjv/BookMarkesActivity;->getDate(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->rlNotesItem:Landroid/widget/RelativeLayout;

    new-instance v6, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;

    invoke-direct {v6, p0, v3}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$1;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;Lcom/hmobile/model/NotesInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 297
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->btnDelete:Landroid/widget/Button;

    new-instance v6, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;

    invoke-direct {v6, p0, v3}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$2;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;Lcom/hmobile/model/NotesInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    iget-object v5, v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;->btnEdit:Landroid/widget/Button;

    new-instance v6, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;

    invoke-direct {v6, p0, v3}, Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter$3;-><init>(Lcom/hmobile/biblekjv/BookMarkesActivity$NotesAdapter;Lcom/hmobile/model/NotesInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 317
    return-object v4

    .line 270
    .end local v0    # "bookname":Ljava/lang/String;
    .end local v3    # "noteInfo":Lcom/hmobile/model/NotesInfo;
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;
    check-cast v1, Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;

    .restart local v1    # "holder":Lcom/hmobile/biblekjv/BookMarkesActivity$ViewHolderForFavorite;
    goto/16 :goto_0
.end method
