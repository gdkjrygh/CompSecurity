.class final Lkik/android/chat/fragment/AbTestsFragment$c;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/AbTestsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/AbTestsFragment;

.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 277
    iput-object p1, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 278
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->b:Landroid/view/LayoutInflater;

    .line 279
    return-void
.end method

.method private a(I)Lkik/a/a/b;
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->e(Lkik/android/chat/fragment/AbTestsFragment;)Ljava/util/ArrayList;

    move-result-object v0

    .line 293
    if-ltz p1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/b;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->e(Lkik/android/chat/fragment/AbTestsFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 272
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/AbTestsFragment$c;->a(I)Lkik/a/a/b;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 299
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 307
    if-nez p2, :cond_0

    .line 308
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030088

    invoke-virtual {v0, v1, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 309
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$d;

    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {v1, v0, v5}, Lkik/android/chat/fragment/AbTestsFragment$d;-><init>(Lkik/android/chat/fragment/AbTestsFragment;B)V

    .line 310
    const v0, 0x1020016

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lkik/android/chat/fragment/AbTestsFragment$d;->a:Landroid/widget/TextView;

    .line 311
    const v0, 0x1020010

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lkik/android/chat/fragment/AbTestsFragment$d;->b:Landroid/widget/TextView;

    move-object v0, v1

    .line 317
    :goto_0
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/AbTestsFragment$c;->a(I)Lkik/a/a/b;

    move-result-object v1

    .line 318
    iget-object v2, v0, Lkik/android/chat/fragment/AbTestsFragment$d;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Lkik/a/a/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    iget-object v2, v0, Lkik/android/chat/fragment/AbTestsFragment$d;->b:Landroid/widget/TextView;

    const-string v3, "%s variants"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1}, Lkik/a/a/b;->b()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 322
    return-object p2

    .line 314
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/AbTestsFragment$d;

    goto :goto_0
.end method
