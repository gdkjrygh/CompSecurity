.class public final Lcom/kik/view/adapters/v;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/v$a;,
        Lcom/kik/view/adapters/v$b;
    }
.end annotation


# static fields
.field private static final a:I


# instance fields
.field private final b:Ljava/lang/Object;

.field private c:Ljava/util/List;

.field private d:Ljava/util/List;

.field private e:Landroid/widget/Filter;

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const/16 v0, 0x28

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lcom/kik/view/adapters/v;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 39
    const v0, 0x7f030058

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/v;->b:Ljava/lang/Object;

    .line 35
    const/16 v0, 0x10

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lcom/kik/view/adapters/v;->f:I

    .line 41
    iput-object p2, p0, Lcom/kik/view/adapters/v;->c:Ljava/util/List;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/view/adapters/v;->d:Ljava/util/List;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/kik/view/adapters/v;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/kik/view/adapters/v;->b:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/view/adapters/v;)Ljava/util/List;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/kik/view/adapters/v;->d:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 83
    sget v0, Lcom/kik/view/adapters/v;->a:I

    iget-object v1, p0, Lcom/kik/view/adapters/v;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/kik/view/adapters/v;->f:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/kik/view/adapters/v;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/kik/view/adapters/v;->e:Landroid/widget/Filter;

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Lcom/kik/view/adapters/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/view/adapters/v$a;-><init>(Lcom/kik/view/adapters/v;B)V

    iput-object v0, p0, Lcom/kik/view/adapters/v;->e:Landroid/widget/Filter;

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/v;->e:Landroid/widget/Filter;

    return-object v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 51
    if-nez p2, :cond_0

    .line 52
    new-instance v0, Lcom/kik/view/adapters/v$b;

    invoke-direct {v0, v4}, Lcom/kik/view/adapters/v$b;-><init>(B)V

    .line 53
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/kik/view/adapters/v;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 54
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v5, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/v;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 58
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    sget v3, Lcom/kik/view/adapters/v;->a:I

    invoke-direct {v2, v5, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 60
    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 61
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    const/16 v2, 0x9

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v1, v2, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 63
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 64
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 65
    const/4 v2, 0x1

    const/high16 v3, 0x41900000    # 18.0f

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 66
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 68
    iput-object v1, v0, Lcom/kik/view/adapters/v$b;->a:Landroid/widget/TextView;

    .line 69
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 76
    :goto_0
    iget-object v1, v0, Lcom/kik/view/adapters/v$b;->a:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/v;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    return-object p2

    .line 72
    :cond_0
    check-cast p2, Landroid/widget/LinearLayout;

    .line 73
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/v$b;

    goto :goto_0
.end method
