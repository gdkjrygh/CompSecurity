.class final Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/ChatBubbleSelectionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private final b:Landroid/view/LayoutInflater;

.field private c:Lkik/android/chat/b/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 108
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 109
    iput-object p2, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a:Ljava/util/List;

    .line 110
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->b:Landroid/view/LayoutInflater;

    .line 111
    return-void
.end method

.method private a(I)Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 122
    if-ltz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/b/b;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;Lkik/android/chat/b/b;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->c:Lkik/android/chat/b/b;

    invoke-virtual {p0}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 101
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a(I)Lkik/android/chat/b/b;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 128
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/high16 v6, -0x1000000

    .line 140
    if-nez p2, :cond_1

    .line 142
    iget-object v0, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030064

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 143
    new-instance v1, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;-><init>(B)V

    .line 144
    const v0, 0x7f0e0150

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->a:Landroid/widget/TextView;

    .line 145
    const v0, 0x7f0e013b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    move-object v0, v1

    .line 150
    :goto_0
    invoke-direct {p0, p1}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->a(I)Lkik/android/chat/b/b;

    move-result-object v1

    .line 151
    if-eqz v1, :cond_0

    .line 152
    iget-object v2, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Lkik/android/chat/b/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v2, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Lkik/android/chat/b/b;->c()I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    invoke-virtual {v1}, Lkik/android/chat/b/b;->b()I

    move-result v2

    if-ne v2, v6, :cond_2

    .line 156
    iget-object v2, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    const v3, 0x7f020071

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    :goto_1
    iget-object v2, p0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a;->c:Lkik/android/chat/b/b;

    if-ne v2, v1, :cond_0

    .line 162
    invoke-virtual {v1}, Lkik/android/chat/b/b;->b()I

    move-result v1

    if-ne v1, v6, :cond_3

    .line 163
    iget-object v1, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    const v2, 0x7f020074

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 170
    :cond_0
    :goto_2
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 171
    return-object p2

    .line 148
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;

    goto :goto_0

    .line 159
    :cond_2
    iget-object v2, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    const v3, 0x7f020072

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 166
    :cond_3
    iget-object v1, v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$a$a;->b:Landroid/widget/ImageView;

    const v2, 0x7f020076

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2
.end method
