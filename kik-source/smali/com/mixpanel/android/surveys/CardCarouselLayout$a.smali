.class final Lcom/mixpanel/android/surveys/CardCarouselLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ListAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/surveys/CardCarouselLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/view/LayoutInflater;)V
    .locals 0

    .prologue
    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput-object p1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    .line 341
    iput-object p2, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->b:Landroid/view/LayoutInflater;

    .line 342
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 421
    const/4 v0, 0x1

    return v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 337
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 356
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 361
    if-nez p1, :cond_0

    .line 362
    const/4 v0, 0x0

    .line 367
    :goto_0
    return v0

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 365
    const/4 v0, 0x1

    goto :goto_0

    .line 367
    :cond_1
    const/4 v0, 0x2

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 372
    const/4 v0, -0x1

    .line 373
    if-nez p2, :cond_0

    .line 374
    invoke-virtual {p0, p1}, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->getItemViewType(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 385
    :goto_0
    iget-object v1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->b:Landroid/view/LayoutInflater;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 388
    :cond_0
    sget v0, Lcom/mixpanel/android/a$c;->e:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 389
    iget-object v1, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 390
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    return-object p2

    .line 376
    :pswitch_0
    sget v0, Lcom/mixpanel/android/a$d;->d:I

    goto :goto_0

    .line 379
    :pswitch_1
    sget v0, Lcom/mixpanel/android/a$d;->e:I

    goto :goto_0

    .line 382
    :pswitch_2
    sget v0, Lcom/mixpanel/android/a$d;->f:I

    goto :goto_0

    .line 374
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 396
    const/4 v0, 0x3

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 401
    const/4 v0, 0x1

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lcom/mixpanel/android/surveys/CardCarouselLayout$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    .line 426
    const/4 v0, 0x1

    return v0
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0

    .prologue
    .line 412
    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0

    .prologue
    .line 417
    return-void
.end method
