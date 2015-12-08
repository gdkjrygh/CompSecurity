.class public Lcom/thetransitapp/droid/widget/LegalAdapter;
.super Landroid/widget/ArrayAdapter;
.source "LegalAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lcom/thetransitapp/droid/model/Feed;",
        ">;"
    }
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 33
    const v0, 0x7f03001b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 34
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/LegalAdapter;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/LegalAdapter;->activity:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method public addAll(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 103
    .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+Lcom/thetransitapp/droid/model/Feed;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 106
    return-void

    .line 103
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Feed;

    .line 104
    .local v0, "feed":Lcom/thetransitapp/droid/model/Feed;
    invoke-super {p0, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 38
    move-object v8, p2

    .line 40
    .local v8, "view":Landroid/view/View;
    if-nez v8, :cond_0

    .line 41
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    move-result-object v9

    .line 42
    const-string v10, "layout_inflater"

    .line 41
    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/LayoutInflater;

    .line 43
    .local v3, "inflater":Landroid/view/LayoutInflater;
    const v9, 0x7f03001b

    const/4 v10, 0x0

    invoke-virtual {v3, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 46
    .end local v3    # "inflater":Landroid/view/LayoutInflater;
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/Feed;

    .line 48
    .local v2, "feed":Lcom/thetransitapp/droid/model/Feed;
    const v9, 0x7f050047

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 49
    .local v5, "title":Landroid/widget/TextView;
    const v9, 0x7f050048

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 50
    .local v4, "text":Landroid/widget/TextView;
    const v9, 0x7f050049

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 51
    .local v6, "update":Landroid/widget/TextView;
    const v9, 0x7f05004a

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 52
    .local v1, "date":Landroid/widget/TextView;
    const v9, 0x7f05004b

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 54
    .local v0, "button":Landroid/widget/Button;
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getLicence()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getUpdatedDate()Ljava/util/Date;

    move-result-object v9

    if-eqz v9, :cond_1

    .line 58
    const/4 v9, 0x0

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 59
    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 61
    iget-object v9, p0, Lcom/thetransitapp/droid/widget/LegalAdapter;->activity:Landroid/app/Activity;

    invoke-static {v9}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v9

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getUpdatedDate()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 62
    .local v7, "updateString":Ljava/lang/String;
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .end local v7    # "updateString":Ljava/lang/String;
    :goto_0
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getLicenceUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 69
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 70
    new-instance v9, Lcom/thetransitapp/droid/widget/LegalAdapter$1;

    invoke-direct {v9, p0, v2}, Lcom/thetransitapp/droid/widget/LegalAdapter$1;-><init>(Lcom/thetransitapp/droid/widget/LegalAdapter;Lcom/thetransitapp/droid/model/Feed;)V

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    :goto_1
    return-object v8

    .line 64
    :cond_1
    const/16 v9, 0x8

    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 65
    const/16 v9, 0x8

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getCode()Ljava/lang/String;

    move-result-object v9

    const-string v10, "play"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 82
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 83
    new-instance v9, Lcom/thetransitapp/droid/widget/LegalAdapter$2;

    invoke-direct {v9, p0}, Lcom/thetransitapp/droid/widget/LegalAdapter$2;-><init>(Lcom/thetransitapp/droid/widget/LegalAdapter;)V

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 95
    :cond_3
    const/16 v9, 0x8

    invoke-virtual {v0, v9}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_1
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 28
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/LegalAdapter;->activity:Landroid/app/Activity;

    return-void
.end method
