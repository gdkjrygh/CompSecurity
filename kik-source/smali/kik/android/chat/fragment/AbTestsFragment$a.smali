.class final Lkik/android/chat/fragment/AbTestsFragment$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/AbTestsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/AbTestsFragment;

.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 332
    iput-object p1, p0, Lkik/android/chat/fragment/AbTestsFragment$a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 333
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$a;->b:Landroid/view/LayoutInflater;

    .line 334
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 339
    const/4 v0, 0x1

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 345
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 351
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 359
    if-nez p2, :cond_0

    .line 360
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$a;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030088

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 361
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$d;

    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment$a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {v1, v0, v4}, Lkik/android/chat/fragment/AbTestsFragment$d;-><init>(Lkik/android/chat/fragment/AbTestsFragment;B)V

    .line 362
    const v0, 0x1020016

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lkik/android/chat/fragment/AbTestsFragment$d;->a:Landroid/widget/TextView;

    .line 363
    const v0, 0x1020010

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lkik/android/chat/fragment/AbTestsFragment$d;->b:Landroid/widget/TextView;

    move-object v0, v1

    .line 369
    :goto_0
    iget-object v1, v0, Lkik/android/chat/fragment/AbTestsFragment$d;->a:Landroid/widget/TextView;

    const-string v2, "Force refetch"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    iget-object v1, v0, Lkik/android/chat/fragment/AbTestsFragment$d;->b:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/chat/fragment/AbTestsFragment$a;->a:Lkik/android/chat/fragment/AbTestsFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v2}, Lkik/a/a/c;->a()J

    move-result-wide v2

    invoke-static {v2, v3, v4}, Lkik/android/util/cq;->a(JZ)Lkik/android/util/cq$a;

    move-result-object v2

    iget-object v2, v2, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 373
    return-object p2

    .line 366
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/AbTestsFragment$d;

    goto :goto_0
.end method
