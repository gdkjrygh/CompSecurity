.class final Lkik/android/widget/WebTrayWidget$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/WebTrayWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/WebTrayWidget$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/WebTrayWidget;

.field private final b:Ljava/util/List;

.field private c:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method constructor <init>(Lkik/android/widget/WebTrayWidget;Ljava/util/List;)V
    .locals 1

    .prologue
    .line 255
    iput-object p1, p0, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 215
    new-instance v0, Lkik/android/widget/ep;

    invoke-direct {v0, p0}, Lkik/android/widget/ep;-><init>(Lkik/android/widget/WebTrayWidget$a;)V

    iput-object v0, p0, Lkik/android/widget/WebTrayWidget$a;->c:Landroid/widget/AdapterView$OnItemClickListener;

    .line 256
    iput-object p2, p0, Lkik/android/widget/WebTrayWidget$a;->b:Ljava/util/List;

    .line 257
    return-void
.end method


# virtual methods
.method public final a()Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lkik/android/widget/WebTrayWidget$a;->c:Landroid/widget/AdapterView$OnItemClickListener;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lkik/android/widget/WebTrayWidget$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lkik/android/widget/WebTrayWidget$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 286
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 274
    const/4 v0, 0x0

    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 292
    invoke-virtual {p0, p1}, Lkik/android/widget/WebTrayWidget$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 294
    check-cast v0, Lkik/android/b/ac$a;

    .line 295
    if-nez p2, :cond_0

    .line 296
    iget-object v1, p0, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    invoke-static {v1}, Lkik/android/widget/WebTrayWidget;->b(Lkik/android/widget/WebTrayWidget;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f030022

    invoke-virtual {v1, v2, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 297
    new-instance v2, Lkik/android/widget/WebTrayWidget$a$a;

    invoke-direct {v2, p0, v3}, Lkik/android/widget/WebTrayWidget$a$a;-><init>(Lkik/android/widget/WebTrayWidget$a;B)V

    .line 298
    const v1, 0x7f0e00c0

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lkik/android/widget/SquareNetworkedImageView;

    iput-object v1, v2, Lkik/android/widget/WebTrayWidget$a$a;->a:Lkik/android/widget/SquareNetworkedImageView;

    .line 299
    const v1, 0x7f0e00c1

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v2, Lkik/android/widget/WebTrayWidget$a$a;->b:Landroid/widget/TextView;

    .line 300
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v1, p2

    .line 306
    :goto_0
    if-nez v0, :cond_1

    .line 307
    new-instance v0, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 315
    :goto_1
    return-object v0

    .line 303
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/android/widget/WebTrayWidget$a$a;

    move-object v2, v1

    move-object v1, p2

    goto :goto_0

    .line 309
    :cond_1
    invoke-virtual {v0}, Lkik/android/b/ac$a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v2, Lkik/android/widget/WebTrayWidget$a$a;->a:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v4}, Lkik/android/widget/SquareNetworkedImageView;->getMeasuredWidth()I

    move-result v4

    iget-object v5, v2, Lkik/android/widget/WebTrayWidget$a$a;->a:Lkik/android/widget/SquareNetworkedImageView;

    invoke-virtual {v5}, Lkik/android/widget/SquareNetworkedImageView;->getMeasuredHeight()I

    move-result v5

    invoke-static {v3, v4, v5}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v3

    .line 310
    iget-object v4, v2, Lkik/android/widget/WebTrayWidget$a$a;->a:Lkik/android/widget/SquareNetworkedImageView;

    iget-object v5, p0, Lkik/android/widget/WebTrayWidget$a;->a:Lkik/android/widget/WebTrayWidget;

    iget-object v5, v5, Lkik/android/widget/WebTrayWidget;->a:Lcom/kik/cache/ad;

    invoke-virtual {v4, v3, v5}, Lkik/android/widget/SquareNetworkedImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;)V

    .line 311
    iget-object v2, v2, Lkik/android/widget/WebTrayWidget$a$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/b/ac$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 312
    invoke-virtual {v0}, Lkik/android/b/ac$a;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 313
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AUTOMATION_WEB_TRAY_CARD_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkik/android/b/ac$a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v3, " "

    const-string v4, "_"

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    move-object v0, v1

    .line 315
    goto :goto_1
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 268
    const/4 v0, 0x1

    return v0
.end method
