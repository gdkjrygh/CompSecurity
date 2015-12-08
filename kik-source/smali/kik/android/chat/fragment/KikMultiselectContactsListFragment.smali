.class public abstract Lkik/android/chat/fragment/KikMultiselectContactsListFragment;
.super Lkik/android/chat/fragment/KikContactsListFragment;
.source "SourceFile"

# interfaces
.implements Lkik/android/util/cu;


# static fields
.field private static final N:I


# instance fields
.field protected L:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public M:Z

.field private O:I

.field private U:Landroid/widget/TextView;

.field private V:Landroid/view/View;

.field private W:Lkik/android/widget/KikContactImageThumbNailList;

.field private X:Landroid/view/View;

.field private Y:Landroid/view/View;

.field private Z:Landroid/widget/ImageView;

.field protected a:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private aa:Z

.field private ab:Z

.field private ac:Z

.field private ad:Z

.field private ae:I

.field private af:I

.field private ag:Z

.field private ah:Lcom/kik/g/f;

.field private ai:Landroid/widget/AdapterView$OnItemClickListener;

.field private aj:Landroid/view/View$OnClickListener;

.field private ak:Landroid/view/View$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 84
    const/16 v0, 0x96

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->N:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 79
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment;-><init>()V

    .line 87
    const/16 v0, 0x38

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->O:I

    .line 95
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aa:Z

    .line 96
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ab:Z

    .line 98
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ad:Z

    .line 104
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ag:Z

    .line 106
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ah:Lcom/kik/g/f;

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->M:Z

    .line 115
    new-instance v0, Lkik/android/chat/fragment/ml;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ml;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ai:Landroid/widget/AdapterView$OnItemClickListener;

    .line 138
    new-instance v0, Lkik/android/chat/fragment/mw;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/mw;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aj:Landroid/view/View$OnClickListener;

    .line 157
    new-instance v0, Lkik/android/chat/fragment/mx;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/mx;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ak:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 79
    const-string v0, "chatContactJID"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v0, v1, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    const v2, 0x7f0e016c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->af:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ae:I

    goto :goto_0

    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Z
    .locals 1

    .prologue
    .line 79
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ab:Z

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Z
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ab:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Y:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Lkik/android/widget/KikContactImageThumbNailList;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    return-object v0
.end method


# virtual methods
.method protected S()Z
    .locals 1

    .prologue
    .line 474
    const/4 v0, 0x1

    return v0
.end method

.method protected T()I
    .locals 1

    .prologue
    .line 854
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract Y()V
.end method

.method protected abstract Z()Ljava/lang/String;
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 870
    const v0, 0x7f090269

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(II)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 813
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 814
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b(Z)V

    .line 823
    :cond_0
    :goto_0
    return-void

    .line 819
    :cond_1
    sub-int v1, p2, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->O:I

    if-lt v1, v2, :cond_0

    .line 822
    sget v1, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->N:I

    if-le p1, v1, :cond_2

    :goto_1
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ag:Z

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ag:Z

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b(Z)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected a(Ljava/lang/String;Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 762
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    new-instance v1, Lkik/android/chat/fragment/ms;

    invoke-direct {v1, p0, p1, p2}, Lkik/android/chat/fragment/ms;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Ljava/lang/String;Lkik/a/d/k;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->post(Ljava/lang/Runnable;)Z

    .line 770
    return-void
.end method

.method protected final a(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 511
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    .line 512
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 513
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidateViews()V

    .line 514
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->m:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 515
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->m:Landroid/view/View;

    invoke-static {p1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 517
    :cond_0
    return-void

    .line 515
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 739
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    new-instance v1, Lkik/android/chat/fragment/mr;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/mr;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Lkik/a/d/k;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->post(Ljava/lang/Runnable;)Z

    .line 748
    return-void
.end method

.method protected a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V
    .locals 4

    .prologue
    .line 602
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 603
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 604
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 605
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/mp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/mp;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 649
    :goto_0
    return-void

    .line 614
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 615
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 616
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;)V

    .line 622
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    .line 623
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lcom/kik/view/adapters/k;

    .line 625
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v0

    sub-int v0, p4, v0

    invoke-virtual {v1, v0}, Lcom/kik/view/adapters/k;->a(I)Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;

    .line 626
    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    .line 627
    invoke-virtual {v0, p2, p3}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;->a(Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;)V

    .line 647
    :cond_1
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidateViews()V

    goto :goto_0

    .line 619
    :cond_2
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->d(Lkik/a/d/k;)V

    goto :goto_1

    .line 631
    :cond_3
    if-eqz v0, :cond_4

    .line 633
    invoke-virtual {v1, p4}, Lcom/kik/view/adapters/k;->a(I)Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/view/adapters/MultiselectContactsCursorAdapter;->a(Ljava/lang/String;Z)V

    goto :goto_2

    .line 637
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 638
    if-ne v0, p1, :cond_1

    .line 639
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    const v2, 0x7f0e016c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 640
    if-eqz v1, :cond_1

    .line 641
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->af:I

    :goto_3
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    :cond_5
    iget v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ae:I

    goto :goto_3
.end method

.method public final a(Landroid/database/Cursor;)Z
    .locals 2

    .prologue
    .line 577
    const-string v0, "suggest_intent_data_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 578
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, v0}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected abstract aa()Ljava/lang/String;
.end method

.method protected abstract b(Landroid/os/Bundle;)V
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 522
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikContactsListFragment;->b(Ljava/lang/String;)V

    .line 525
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/WrapperListAdapter;

    .line 526
    invoke-interface {v0}, Landroid/widget/WrapperListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/k;

    .line 528
    if-eqz v0, :cond_3

    .line 530
    invoke-virtual {v0}, Lcom/kik/view/adapters/k;->a()I

    move-result v0

    .line 533
    :goto_0
    iget-boolean v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aa:Z

    if-eqz v2, :cond_1

    .line 534
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aa:Z

    .line 535
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getCount()I

    move-result v2

    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    .line 536
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->g()Z

    move-result v2

    if-nez v2, :cond_1

    const/16 v2, 0xa

    if-lt v0, v2, :cond_1

    .line 542
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v2, Lkik/android/chat/fragment/mo;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/mo;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v2, v4, v5}, Landroid/widget/ListView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 554
    :cond_1
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ac:Z

    if-eqz v0, :cond_2

    .line 555
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ac:Z

    .line 556
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 557
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Landroid/view/View;I)V

    .line 558
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Landroid/view/View;)V

    .line 562
    :cond_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->z()V

    .line 563
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method protected b(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 753
    return-void
.end method

.method protected final b(Z)V
    .locals 4

    .prologue
    const v3, 0x7f0d0023

    .line 425
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 428
    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ad:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ag:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 430
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 431
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 432
    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 433
    iget v1, v2, Landroid/graphics/Point;->y:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 434
    :cond_0
    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 436
    :goto_1
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 437
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 438
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/mn;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/mn;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Z)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 453
    :cond_1
    return-void

    .line 428
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 434
    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    goto :goto_1
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 584
    const/4 v0, 0x1

    return v0
.end method

.method protected c(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 758
    return-void
.end method

.method protected final c(Z)V
    .locals 0

    .prologue
    .line 462
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ad:Z

    .line 463
    return-void
.end method

.method protected final d()Ljava/util/LinkedHashSet;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method protected d(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 798
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    new-instance v1, Lkik/android/chat/fragment/mv;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/mv;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Lkik/a/d/k;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->post(Ljava/lang/Runnable;)Z

    .line 807
    return-void
.end method

.method protected final d(Z)V
    .locals 1

    .prologue
    .line 467
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 470
    :cond_0
    return-void
.end method

.method protected final e()V
    .locals 3

    .prologue
    .line 655
    invoke-super {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->e()V

    .line 657
    new-instance v0, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    .line 658
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->b(I)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->F:Lkik/android/chat/fragment/KikContactsListFragment$a;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikContactsListFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 659
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 660
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikAddContactFragment$b;

    .line 662
    :cond_0
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/mq;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/mq;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 677
    return-void
.end method

.method protected e(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 734
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->f(Ljava/lang/String;)V

    .line 735
    return-void
.end method

.method protected abstract e(Lkik/a/d/k;)V
.end method

.method protected final f()V
    .locals 2

    .prologue
    .line 400
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 401
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->U:Landroid/widget/TextView;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 403
    :cond_0
    return-void
.end method

.method protected f(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 774
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    new-instance v1, Lkik/android/chat/fragment/mt;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/mt;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->post(Ljava/lang/Runnable;)Z

    .line 782
    return-void
.end method

.method protected g(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 786
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    new-instance v1, Lkik/android/chat/fragment/mu;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/mu;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->post(Ljava/lang/Runnable;)Z

    .line 794
    return-void
.end method

.method protected h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 834
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900e8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final k()Z
    .locals 1

    .prologue
    .line 505
    const/4 v0, 0x1

    return v0
.end method

.method protected l()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 410
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 411
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    .line 412
    iput-boolean v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->A:Z

    .line 413
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 414
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Ljava/lang/String;Z)V

    .line 416
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 705
    const/16 v0, 0x617

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 706
    const-string v0, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 708
    const-string v1, "chatContactJID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 710
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v0, v1, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 713
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .line 714
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;)V

    .line 716
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    const v2, 0x7f0e016c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 718
    if-eqz v0, :cond_0

    .line 719
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 720
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 721
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->C:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->af:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 728
    :cond_0
    :goto_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->l()V

    .line 729
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidateViews()V

    .line 730
    return-void

    .line 721
    :cond_1
    iget v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ae:I

    goto :goto_0

    .line 724
    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 486
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 487
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    .line 490
    const-string v1, "suggest_intent_data_id"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 491
    iget-object v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 492
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e(Lkik/a/d/k;)V

    .line 493
    return v2
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 179
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    .line 180
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 184
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->setDefaultKeyMode(I)V

    .line 185
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 190
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikContactsListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 191
    const v0, 0x7f030011

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 193
    const v0, 0x7f0e0078

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->U:Landroid/widget/TextView;

    .line 194
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->f()V

    .line 196
    const v0, 0x7f0e005e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    .line 197
    const v0, 0x7f0e0061

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Y:Landroid/view/View;

    .line 198
    const v0, 0x7f0e0134

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/KikContactImageThumbNailList;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    .line 199
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a:Lcom/kik/cache/ad;

    invoke-virtual {v0, v2}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lcom/kik/cache/ad;)V

    .line 200
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->L:Lcom/kik/android/a;

    invoke-virtual {v0, v2}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lcom/kik/android/a;)V

    .line 201
    const v0, 0x7f0e005a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    .line 202
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->S()Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 206
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ah:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    invoke-virtual {v2}, Lkik/android/widget/KikContactImageThumbNailList;->a()Lcom/kik/g/e;

    move-result-object v2

    new-instance v3, Lkik/android/chat/fragment/my;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/my;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 214
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ah:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->W:Lkik/android/widget/KikContactImageThumbNailList;

    invoke-virtual {v2}, Lkik/android/widget/KikContactImageThumbNailList;->b()Lcom/kik/g/e;

    move-result-object v2

    new-instance v3, Lkik/android/chat/fragment/mz;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/mz;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 223
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->X:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0d0023

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->O:I

    .line 225
    const v0, 0x7f020163

    iput v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ae:I

    .line 226
    const v0, 0x7f020161

    iput v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->af:I

    .line 228
    const v0, 0x7f0e003e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e:Landroid/widget/LinearLayout;

    .line 229
    const v0, 0x7f0e003f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->p:Landroid/widget/TextView;

    .line 231
    const v0, 0x7f0e003d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    .line 233
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    instance-of v0, v0, Lkik/android/widget/ResizeEventList;

    if-eqz v0, :cond_1

    .line 234
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    check-cast v0, Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0, p0}, Lkik/android/widget/ResizeEventList;->a(Lkik/android/util/cu;)V

    .line 237
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ai:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 239
    const v0, 0x7f030078

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->g:Landroid/view/View;

    .line 241
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->g:Landroid/view/View;

    const v2, 0x7f0e018c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 242
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    .line 243
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 245
    const v0, 0x7f03006f

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    .line 246
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ak:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 248
    const v0, 0x7f030075

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->i:Landroid/view/View;

    .line 250
    const v0, 0x7f030076

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->j:Landroid/view/View;

    .line 252
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->i:Landroid/view/View;

    const v2, 0x7f0e0188

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->q:Landroid/widget/TextView;

    .line 253
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->j:Landroid/view/View;

    const v2, 0x7f0e0189

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->r:Landroid/widget/TextView;

    .line 255
    const v0, 0x7f03007a

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->k:Landroid/view/View;

    .line 256
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->k:Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aj:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    const v0, 0x7f03007c

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->n:Landroid/widget/TextView;

    .line 259
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900e9

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t()V

    .line 263
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    .line 264
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 265
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 266
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->h:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 267
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 268
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->j:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 269
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->k:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 270
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->g:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 272
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->t:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v5}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 273
    new-instance v0, Lkik/android/sdkutils/concurrent/c;

    const-string v2, ""

    iget-object v3, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-direct {v0, v2, v3}, Lkik/android/sdkutils/concurrent/c;-><init>(Ljava/lang/String;Lkik/a/e/r;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    .line 276
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 279
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    const v2, 0x7f03002e

    iget-object v3, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    invoke-virtual {p1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 281
    const v0, 0x7f0e0074

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    .line 283
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setImeOptions(I)V

    .line 285
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/na;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/na;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 310
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    new-instance v2, Lkik/android/chat/fragment/nb;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nb;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 326
    const v0, 0x7f0e0073

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z:Landroid/widget/ImageView;

    .line 327
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->T()I

    move-result v0

    .line 328
    if-eqz v0, :cond_4

    .line 329
    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 330
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 336
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v2, Lkik/android/chat/fragment/nc;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nc;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 355
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 356
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 359
    :cond_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->aa()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 360
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c:Landroid/widget/ListView;

    new-instance v2, Lkik/android/chat/fragment/nd;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nd;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 386
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->V:Landroid/view/View;

    new-instance v2, Lkik/android/chat/fragment/mm;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/mm;-><init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 393
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b(Landroid/os/Bundle;)V

    .line 395
    return-object v1

    .line 333
    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->Z:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 568
    invoke-super {p0}, Lkik/android/chat/fragment/KikContactsListFragment;->onResume()V

    .line 569
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->ac:Z

    .line 570
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Landroid/view/View;I)V

    .line 571
    iget-object v0, p0, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->s:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Landroid/view/View;)V

    .line 572
    return-void
.end method

.method protected final u()Z
    .locals 1

    .prologue
    .line 499
    const/4 v0, 0x1

    return v0
.end method

.method protected final x()Z
    .locals 1

    .prologue
    .line 590
    const/4 v0, 0x1

    return v0
.end method
