.class public Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;
.super Landroid/widget/BaseAdapter;
.source "SelectActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SelectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GridAdapter"
.end annotation


# instance fields
.field count:I

.field final synthetic this$0:Lcom/hmobile/biblekjv/SelectActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SelectActivity;I)V
    .locals 1
    .param p2, "size"    # I

    .prologue
    .line 185
    iput-object p1, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 183
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->count:I

    .line 186
    iput p2, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->count:I

    .line 187
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;)Lcom/hmobile/biblekjv/SelectActivity;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 191
    iget v0, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->count:I

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 196
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 201
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 208
    move-object v2, p2

    .line 209
    .local v2, "rowView":Landroid/view/View;
    new-instance v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;

    invoke-direct {v0}, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;-><init>()V

    .line 210
    .local v0, "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    if-nez v2, :cond_0

    .line 211
    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/SelectActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 212
    .local v1, "li":Landroid/view/LayoutInflater;
    const v3, 0x7f030021

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 213
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 214
    const v3, 0x7f0e00a4

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    .line 216
    const v3, 0x7f0e00a3

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 215
    iput-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    .line 220
    .end local v1    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v5, p1, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v3, v3, Lcom/hmobile/biblekjv/SelectActivity;->chap_id:I

    add-int/lit8 v4, p1, 0x1

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-boolean v3, v3, Lcom/hmobile/biblekjv/SelectActivity;->isChapterView:Z

    if-eqz v3, :cond_1

    .line 223
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    const-string v4, "#96D7EF"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 234
    :goto_1
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    const v4, 0x7f020060

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 235
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    new-instance v4, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;

    invoke-direct {v4, p0, p1}, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter$1;-><init>(Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;I)V

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    return-object v2

    .line 218
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    check-cast v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;

    .restart local v0    # "holder":Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;
    goto :goto_0

    .line 225
    :cond_1
    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget v3, v3, Lcom/hmobile/biblekjv/SelectActivity;->verse_id:I

    add-int/lit8 v4, p1, 0x1

    if-ne v3, v4, :cond_2

    iget-object v3, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    iget-boolean v3, v3, Lcom/hmobile/biblekjv/SelectActivity;->isVerseView:Z

    if-eqz v3, :cond_2

    .line 226
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    .line 227
    const-string v4, "#96D7EF"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 226
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto :goto_1

    .line 229
    :cond_2
    iget-object v3, v0, Lcom/hmobile/biblekjv/SelectActivity$ViewHolder;->txtName:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/hmobile/biblekjv/SelectActivity$GridAdapter;->this$0:Lcom/hmobile/biblekjv/SelectActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/SelectActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 230
    const v5, 0x7f080024

    .line 229
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto :goto_1
.end method
