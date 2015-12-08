.class public Lcom/scannerfire/model/MyAdapter;
.super Landroid/widget/BaseAdapter;
.source "MyAdapter.java"


# instance fields
.field a:Landroid/app/Activity;

.field appnames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field icone:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field image:Landroid/widget/ImageView;

.field inflater:Landroid/view/LayoutInflater;

.field packNames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field resource:I

.field text:Landroid/widget/TextView;

.field text2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "a"    # Landroid/app/Activity;
    .param p2, "resource"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p3, "icone":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/graphics/drawable/Drawable;>;"
    .local p4, "appnames":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .local p5, "packNames":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/scannerfire/model/MyAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 29
    iput-object p1, p0, Lcom/scannerfire/model/MyAdapter;->a:Landroid/app/Activity;

    .line 30
    iput p2, p0, Lcom/scannerfire/model/MyAdapter;->resource:I

    .line 31
    iput-object p3, p0, Lcom/scannerfire/model/MyAdapter;->icone:Ljava/util/ArrayList;

    .line 32
    iput-object p4, p0, Lcom/scannerfire/model/MyAdapter;->appnames:Ljava/util/ArrayList;

    .line 33
    iput-object p5, p0, Lcom/scannerfire/model/MyAdapter;->packNames:Ljava/util/ArrayList;

    .line 35
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 34
    iput-object v0, p0, Lcom/scannerfire/model/MyAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 36
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/scannerfire/model/MyAdapter;->icone:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 47
    iget-object v0, p0, Lcom/scannerfire/model/MyAdapter;->icone:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/scannerfire/model/MyAdapter;->getItem(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "arg0"    # I

    .prologue
    .line 73
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 55
    move-object v0, p2

    .line 56
    .local v0, "row":Landroid/view/View;
    if-nez v0, :cond_0

    .line 57
    iget-object v1, p0, Lcom/scannerfire/model/MyAdapter;->inflater:Landroid/view/LayoutInflater;

    iget v2, p0, Lcom/scannerfire/model/MyAdapter;->resource:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 58
    :cond_0
    const v1, 0x7f0d00a4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/scannerfire/model/MyAdapter;->image:Landroid/widget/ImageView;

    .line 59
    const v1, 0x7f0d00a5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/scannerfire/model/MyAdapter;->text:Landroid/widget/TextView;

    .line 60
    const v1, 0x7f0d00a6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/scannerfire/model/MyAdapter;->text2:Landroid/widget/TextView;

    .line 62
    iget-object v1, p0, Lcom/scannerfire/model/MyAdapter;->image:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/scannerfire/model/MyAdapter;->getItem(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 63
    iget-object v2, p0, Lcom/scannerfire/model/MyAdapter;->text:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/scannerfire/model/MyAdapter;->appnames:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object v2, p0, Lcom/scannerfire/model/MyAdapter;->text2:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/scannerfire/model/MyAdapter;->packNames:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    return-object v0
.end method
